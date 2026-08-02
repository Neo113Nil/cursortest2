package io.flutter.view;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.startapp.simple.bloomfilter.codec.BaseNCodec;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.impl.Wo;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.flutter.Build;
import io.flutter.Log;
import io.flutter.embedding.engine.systemchannels.AccessibilityChannel;
import io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate;
import io.flutter.util.ViewUtils;
import io.flutter.view.AccessibilityBridge;
import io.flutter.view.AccessibilityStringBuilder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class AccessibilityBridge extends AccessibilityNodeProvider {
    private static final int ACTION_SHOW_ON_SCREEN = 16908342;
    private static final int BOLD_TEXT_WEIGHT_ADJUSTMENT = 300;
    private static final float DEFAULT_TRANSITION_ANIMATION_SCALE = 1.0f;
    private static final float DISABLED_TRANSITION_ANIMATION_SCALE = 0.0f;
    private static final int MIN_ENGINE_GENERATED_NODE_ID = 65536;
    private static final int ROOT_NODE_ID = 0;
    private static final float SCROLL_EXTENT_FOR_INFINITY = 100000.0f;
    private static final float SCROLL_POSITION_CAP_FOR_INFINITY = 70000.0f;
    private static final String TAG = "AccessibilityBridge";
    private final AccessibilityChannel accessibilityChannel;
    private int accessibilityFeatureFlags;
    private SemanticsNode accessibilityFocusedSemanticsNode;
    private final AccessibilityManager accessibilityManager;
    final AccessibilityChannel.AccessibilityMessageHandler accessibilityMessageHandler;
    private final AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener;
    private final AccessibilityViewEmbedder accessibilityViewEmbedder;
    private boolean accessibleNavigation;
    private final ContentObserver animationScaleObserver;
    private final ContentResolver contentResolver;
    private final Map<Integer, CustomAccessibilityAction> customAccessibilityActions;
    private String defaultLocale;
    private Integer embeddedAccessibilityFocusedNodeId;
    private Integer embeddedInputFocusedNodeId;
    private final List<Integer> flutterNavigationStack;
    final Map<Integer, SemanticsNode> flutterSemanticsTree;
    private SemanticsNode hoveredObject;
    private SemanticsNode inputFocusedSemanticsNode;
    private boolean isReleased;
    private SemanticsNode lastInputFocusedSemanticsNode;
    private Integer lastLeftFrameInset;
    private OnAccessibilityChangeListener onAccessibilityChangeListener;
    private final PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate;
    private int previousRouteId;
    private final View rootAccessibilityView;
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener;
    private static final int SCROLLABLE_ACTIONS = ((Action.SCROLL_RIGHT.value | Action.SCROLL_LEFT.value) | Action.SCROLL_UP.value) | Action.SCROLL_DOWN.value;
    private static final int FOCUSABLE_FLAGS = ((((((((((Flag.HAS_CHECKED_STATE.value | Flag.IS_CHECKED.value) | Flag.IS_SELECTED.value) | Flag.IS_TEXT_FIELD.value) | Flag.IS_FOCUSED.value) | Flag.HAS_ENABLED_STATE.value) | Flag.IS_ENABLED.value) | Flag.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.value) | Flag.HAS_TOGGLED_STATE.value) | Flag.IS_TOGGLED.value) | Flag.IS_FOCUSABLE.value) | Flag.IS_SLIDER.value;
    private static int FIRST_RESOURCE_ID = 267386881;
    private static int EMPTY_STRING_INDEX = -1;
    static int systemAction = (Action.DID_GAIN_ACCESSIBILITY_FOCUS.value & Action.DID_LOSE_ACCESSIBILITY_FOCUS.value) & Action.SHOW_ON_SCREEN.value;

    /* renamed from: io.flutter.view.AccessibilityBridge$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$view$AccessibilityStringBuilder$StringAttributeType;

        static {
            int[] iArr = new int[AccessibilityStringBuilder.StringAttributeType.values().length];
            $SwitchMap$io$flutter$view$AccessibilityStringBuilder$StringAttributeType = iArr;
            try {
                iArr[AccessibilityStringBuilder.StringAttributeType.SPELLOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$view$AccessibilityStringBuilder$StringAttributeType[AccessibilityStringBuilder.StringAttributeType.LOCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum AccessibilityFeature {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64),
        NO_ANNOUNCE(128),
        NO_AUTO_PLAY_ANIMATED_IMAGES(256),
        NO_AUTO_PLAY_VIDEOS(512),
        DETERMINISTIC_CURSOR(1024);

        final int value;

        AccessibilityFeature(int i4) {
            this.value = i4;
        }
    }

    public enum Action {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(AccessibilityBridge.MIN_ENGINE_GENERATED_NODE_ID),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152),
        FOCUS(4194304),
        SCROLL_TO_OFFSET(8388608),
        EXPAND(16777216),
        COLLAPSE(33554432);

        public final int value;

        Action(int i4) {
            this.value = i4;
        }
    }

    public static class CustomAccessibilityAction {
        private String hint;
        private String label;
        private int resourceId = -1;
        private int id = -1;
        private int overrideId = -1;
    }

    public enum Flag {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(AccessibilityBridge.MIN_ENGINE_GENERATED_NODE_ID),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216),
        IS_CHECK_STATE_MIXED(33554432),
        HAS_EXPANDED_STATE(67108864),
        IS_EXPANDED(134217728),
        HAS_SELECTED_STATE(268435456),
        HAS_REQUIRED_STATE(536870912),
        IS_REQUIRED(1073741824),
        IS_ACCESSIBILITY_FOCUS_BLOCKED(Integer.MIN_VALUE);

        final int value;

        Flag(int i4) {
            this.value = i4;
        }
    }

    public interface OnAccessibilityChangeListener {
        void onAccessibilityChanged(boolean z, boolean z4);
    }

    public enum Role {
        NONE(0),
        TAB(1),
        TAB_BAR(2),
        TAB_PANEL(3),
        DIALOG(4),
        ALERT_DIALOG(5),
        TABLE(6),
        CELL(7),
        ROW(8),
        COLUMN_HEADER(9),
        DRAG_HANDLE(10),
        SPIN_BUTTON(11),
        COMBO_BOX(12),
        MENU_BAR(13),
        MENU(14),
        MENU_ITEM(15),
        MENU_ITEM_CHECKBOX(16),
        MENU_ITEM_RADIO(17),
        LIST(18),
        LIST_ITEM(19),
        FORM(20),
        TOOLTIP(21),
        LOADING_SPINNER(22),
        PROGRESS_BAR(23),
        HOTKEY(24),
        RADIO_GROUP(25),
        STATUS(26),
        ALERT(27),
        COMPLEMENTARY(28),
        CONTENT_INFO(29),
        MAIN(30),
        NAVIGATION(31),
        REGION(32);

        final int value;

        Role(int i4) {
            this.value = i4;
        }
    }

    public static class SemanticsNode {
        final AccessibilityBridge accessibilityBridge;
        private int actions;
        private float bottom;
        private int currentValueLength;
        private List<CustomAccessibilityAction> customAccessibilityActions;
        private String decreasedValue;
        private List<AccessibilityStringBuilder.StringAttribute> decreasedValueAttributes;
        private long flags;
        private Rect globalRect;
        private float[] globalTransform;
        private int headingLevel;
        private String hint;
        private List<AccessibilityStringBuilder.StringAttribute> hintAttributes;
        private float[] hitTestTransform;
        private String identifier;
        private String increasedValue;
        private List<AccessibilityStringBuilder.StringAttribute> increasedValueAttributes;
        private float[] inverseTransform;
        private String label;
        private List<AccessibilityStringBuilder.StringAttribute> labelAttributes;
        private float left;
        private String linkUrl;
        private String locale;
        private String maxValue;
        private int maxValueLength;
        private String minValue;
        private CustomAccessibilityAction onLongPressOverride;
        private CustomAccessibilityAction onTapOverride;
        private SemanticsNode parent;
        private int platformViewId;
        private int previousActions;
        private long previousFlags;
        private String previousLabel;
        private float previousScrollExtentMax;
        private float previousScrollExtentMin;
        private float previousScrollPosition;
        private int previousTextSelectionBase;
        private int previousTextSelectionExtent;
        private String previousValue;
        private float right;
        private int role;
        private int scrollChildren;
        private float scrollExtentMax;
        private float scrollExtentMin;
        private int scrollIndex;
        private float scrollPosition;
        private TextDirection textDirection;
        private int textSelectionBase;
        private int textSelectionExtent;
        private String tooltip;
        private float top;
        private float[] transform;
        private int traversalParent;
        private String value;
        private List<AccessibilityStringBuilder.StringAttribute> valueAttributes;
        private int id = -1;
        private int previousNodeId = -1;
        private boolean hadPreviousConfig = false;
        private List<SemanticsNode> childrenInTraversalOrder = new ArrayList();
        private List<SemanticsNode> childrenInHitTestOrder = new ArrayList();
        private boolean inverseTransformDirty = true;
        private boolean globalGeometryDirty = true;

        public SemanticsNode(AccessibilityBridge accessibilityBridge) {
            this.accessibilityBridge = accessibilityBridge;
        }

        public static /* synthetic */ int access$2212(SemanticsNode semanticsNode, int i4) {
            int i5 = semanticsNode.textSelectionExtent + i4;
            semanticsNode.textSelectionExtent = i5;
            return i5;
        }

        public static /* synthetic */ int access$2220(SemanticsNode semanticsNode, int i4) {
            int i5 = semanticsNode.textSelectionExtent - i4;
            semanticsNode.textSelectionExtent = i5;
            return i5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void collectRoutes(List<SemanticsNode> list) {
            if (hasFlag(Flag.SCOPES_ROUTE)) {
                list.add(this);
            }
            Iterator<SemanticsNode> it = this.childrenInTraversalOrder.iterator();
            while (it.hasNext()) {
                it.next().collectRoutes(list);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean didChangeCheckedState() {
            if (!this.hadPreviousConfig) {
                return false;
            }
            Flag flag = Flag.IS_CHECKED;
            if (hasFlag(flag) != hadFlag(flag)) {
                return true;
            }
            Flag flag2 = Flag.IS_CHECK_STATE_MIXED;
            if (hasFlag(flag2) != hadFlag(flag2)) {
                return true;
            }
            Flag flag3 = Flag.IS_TOGGLED;
            return hasFlag(flag3) != hadFlag(flag3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean didChangeLabel() {
            String str = this.label;
            if (str == null && this.previousLabel == null) {
                return false;
            }
            return str == null || !str.equals(this.previousLabel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean didScroll() {
            return (Float.isNaN(this.scrollPosition) || Float.isNaN(this.previousScrollPosition) || this.previousScrollPosition == this.scrollPosition) ? false : true;
        }

        private void ensureInverseTransform() {
            if (this.inverseTransformDirty) {
                this.inverseTransformDirty = false;
                if (this.inverseTransform == null) {
                    this.inverseTransform = new float[16];
                }
                if (Matrix.invertM(this.inverseTransform, 0, this.hitTestTransform, 0)) {
                    return;
                }
                Arrays.fill(this.inverseTransform, AccessibilityBridge.DISABLED_TRANSITION_ANIMATION_SCALE);
            }
        }

        private SemanticsNode getAncestor(Predicate<SemanticsNode> predicate) {
            for (SemanticsNode semanticsNode = this.parent; semanticsNode != null; semanticsNode = semanticsNode.parent) {
                if (predicate.test(semanticsNode)) {
                    return semanticsNode;
                }
            }
            return null;
        }

        private String getEffectiveLocale() {
            String str = this.locale;
            return (str == null || str.isEmpty()) ? this.accessibilityBridge.defaultLocale : this.locale;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Rect getGlobalRect() {
            return this.globalRect;
        }

        private CharSequence getHint() {
            return new AccessibilityStringBuilder().addString(this.hint).addAttributes(this.hintAttributes).addLocale(getEffectiveLocale()).build();
        }

        private CharSequence getLabel() {
            return new AccessibilityStringBuilder().addString(this.label).addAttributes(this.labelAttributes).addUrl(this.linkUrl).addLocale(getEffectiveLocale()).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getRouteName() {
            String str;
            if (hasFlag(Flag.NAMES_ROUTE) && (str = this.label) != null && !str.isEmpty()) {
                return this.label;
            }
            Iterator<SemanticsNode> it = this.childrenInTraversalOrder.iterator();
            while (it.hasNext()) {
                String routeName = it.next().getRouteName();
                if (routeName != null && !routeName.isEmpty()) {
                    return routeName;
                }
            }
            return null;
        }

        private List<AccessibilityStringBuilder.StringAttribute> getStringAttributesFromBuffer(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i4 = byteBuffer.getInt();
            if (i4 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = byteBuffer.getInt();
                int i7 = byteBuffer.getInt();
                AccessibilityStringBuilder.StringAttributeType stringAttributeType = AccessibilityStringBuilder.StringAttributeType.values()[byteBuffer.getInt()];
                int i8 = AnonymousClass5.$SwitchMap$io$flutter$view$AccessibilityStringBuilder$StringAttributeType[stringAttributeType.ordinal()];
                if (i8 == 1) {
                    byteBuffer.getInt();
                    AccessibilityStringBuilder.SpellOutStringAttribute spellOutStringAttribute = new AccessibilityStringBuilder.SpellOutStringAttribute();
                    spellOutStringAttribute.start = i6;
                    spellOutStringAttribute.end = i7;
                    spellOutStringAttribute.type = stringAttributeType;
                    arrayList.add(spellOutStringAttribute);
                } else if (i8 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    AccessibilityStringBuilder.LocaleStringAttribute localeStringAttribute = new AccessibilityStringBuilder.LocaleStringAttribute();
                    localeStringAttribute.start = i6;
                    localeStringAttribute.end = i7;
                    localeStringAttribute.type = stringAttributeType;
                    localeStringAttribute.locale = StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                    arrayList.add(localeStringAttribute);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence getTextFieldHint() {
            CharSequence[] charSequenceArr = {getLabel(), getHint()};
            CharSequence charSequence = null;
            for (int i4 = 0; i4 < 2; i4++) {
                CharSequence charSequence2 = charSequenceArr[i4];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence getValue() {
            return new AccessibilityStringBuilder().addString(this.value).addAttributes(this.valueAttributes).addLocale(getEffectiveLocale()).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence getValueLabelHint() {
            CharSequence[] charSequenceArr = {getValue(), getLabel(), getHint()};
            CharSequence charSequence = null;
            for (int i4 = 0; i4 < 3; i4++) {
                CharSequence charSequence2 = charSequenceArr[i4];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hadAction(Action action) {
            return (action.value & this.previousActions) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hadFlag(Flag flag) {
            return (this.previousFlags & ((long) flag.value)) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasAction(Action action) {
            return (action.value & this.actions) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasFlag(Flag flag) {
            return (this.flags & ((long) flag.value)) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SemanticsNode hitTest(float[] fArr, boolean z) {
            float f4 = fArr[3];
            boolean z4 = false;
            float f5 = fArr[0] / f4;
            float f6 = fArr[1] / f4;
            if (f5 < this.left || f5 >= this.right || f6 < this.top || f6 >= this.bottom) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (SemanticsNode semanticsNode : this.childrenInHitTestOrder) {
                if (!semanticsNode.hasFlag(Flag.IS_HIDDEN)) {
                    semanticsNode.ensureInverseTransform();
                    float[] fArr3 = fArr;
                    Matrix.multiplyMV(fArr2, 0, semanticsNode.inverseTransform, 0, fArr3, 0);
                    SemanticsNode hitTest = semanticsNode.hitTest(fArr2, z);
                    if (hitTest != null) {
                        return hitTest;
                    }
                    fArr = fArr3;
                }
            }
            if (z && this.platformViewId != -1) {
                z4 = true;
            }
            if (isFocusable() || z4) {
                return this;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isFocusable() {
            String str;
            String str2;
            String str3;
            if (hasFlag(Flag.SCOPES_ROUTE)) {
                return false;
            }
            if (hasFlag(Flag.IS_FOCUSABLE)) {
                return true;
            }
            if (hasFlag(Flag.IS_ACCESSIBILITY_FOCUS_BLOCKED)) {
                return false;
            }
            return ((this.actions & (~AccessibilityBridge.SCROLLABLE_ACTIONS)) == 0 && (this.flags & ((long) AccessibilityBridge.FOCUSABLE_FLAGS)) == 0 && ((str = this.label) == null || str.isEmpty()) && (((str2 = this.value) == null || str2.isEmpty()) && ((str3 = this.hint) == null || str3.isEmpty()))) ? false : true;
        }

        private void log(String str, boolean z) {
        }

        private float max(float f4, float f5, float f6, float f7) {
            return Math.max(f4, Math.max(f5, Math.max(f6, f7)));
        }

        private float min(float f4, float f5, float f6, float f7) {
            return Math.min(f4, Math.min(f5, Math.min(f6, f7)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean nullableHasAncestor(SemanticsNode semanticsNode, Predicate<SemanticsNode> predicate) {
            return (semanticsNode == null || semanticsNode.getAncestor(predicate) == null) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean shouldBeTreatedAsButton() {
            if (hasFlag(Flag.IS_BUTTON)) {
                return true;
            }
            String str = this.linkUrl;
            if (str == null || str.isEmpty()) {
                return hasFlag(Flag.IS_LINK);
            }
            return false;
        }

        private void transformPoint(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f4 = fArr[3];
            fArr[0] = fArr[0] / f4;
            fArr[1] = fArr[1] / f4;
            fArr[2] = fArr[2] / f4;
            fArr[3] = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateRecursively(float[] fArr, Set<SemanticsNode> set, boolean z) {
            set.add(this);
            if (this.globalGeometryDirty) {
                z = true;
            }
            if (z) {
                if (this.globalTransform == null) {
                    this.globalTransform = new float[16];
                }
                if (this.transform == null) {
                    this.transform = new float[16];
                }
                Matrix.multiplyMM(this.globalTransform, 0, fArr, 0, this.transform, 0);
                float[] fArr2 = {this.left, this.top, AccessibilityBridge.DISABLED_TRANSITION_ANIMATION_SCALE, AccessibilityBridge.DEFAULT_TRANSITION_ANIMATION_SCALE};
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                transformPoint(fArr3, this.globalTransform, fArr2);
                fArr2[0] = this.right;
                fArr2[1] = this.top;
                transformPoint(fArr4, this.globalTransform, fArr2);
                fArr2[0] = this.right;
                fArr2[1] = this.bottom;
                transformPoint(fArr5, this.globalTransform, fArr2);
                fArr2[0] = this.left;
                fArr2[1] = this.bottom;
                transformPoint(fArr6, this.globalTransform, fArr2);
                if (this.globalRect == null) {
                    this.globalRect = new Rect();
                }
                this.globalRect.set(Math.round(min(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(min(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(max(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(max(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.globalGeometryDirty = false;
            }
            int i4 = -1;
            for (SemanticsNode semanticsNode : this.childrenInTraversalOrder) {
                semanticsNode.previousNodeId = i4;
                i4 = semanticsNode.id;
                semanticsNode.updateRecursively(this.globalTransform, set, z);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateWith(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            this.hadPreviousConfig = true;
            this.previousValue = this.value;
            this.previousLabel = this.label;
            this.previousFlags = this.flags;
            this.previousActions = this.actions;
            this.previousTextSelectionBase = this.textSelectionBase;
            this.previousTextSelectionExtent = this.textSelectionExtent;
            this.previousScrollPosition = this.scrollPosition;
            this.previousScrollExtentMax = this.scrollExtentMax;
            this.previousScrollExtentMin = this.scrollExtentMin;
            this.flags = byteBuffer.getLong();
            this.actions = byteBuffer.getInt();
            this.maxValueLength = byteBuffer.getInt();
            this.currentValueLength = byteBuffer.getInt();
            this.textSelectionBase = byteBuffer.getInt();
            this.textSelectionExtent = byteBuffer.getInt();
            this.platformViewId = byteBuffer.getInt();
            this.scrollChildren = byteBuffer.getInt();
            this.scrollIndex = byteBuffer.getInt();
            this.traversalParent = byteBuffer.getInt();
            this.scrollPosition = byteBuffer.getFloat();
            this.scrollExtentMax = byteBuffer.getFloat();
            this.scrollExtentMin = byteBuffer.getFloat();
            this.role = byteBuffer.getInt();
            this.identifier = AccessibilityBridge.getStringFromBuffer(byteBuffer, strArr);
            this.label = AccessibilityBridge.getStringFromBuffer(byteBuffer, strArr);
            this.labelAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            this.value = AccessibilityBridge.getStringFromBuffer(byteBuffer, strArr);
            this.valueAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            this.increasedValue = AccessibilityBridge.getStringFromBuffer(byteBuffer, strArr);
            this.increasedValueAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            this.decreasedValue = AccessibilityBridge.getStringFromBuffer(byteBuffer, strArr);
            this.decreasedValueAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            this.hint = AccessibilityBridge.getStringFromBuffer(byteBuffer, strArr);
            this.hintAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            this.tooltip = AccessibilityBridge.getStringFromBuffer(byteBuffer, strArr);
            this.linkUrl = AccessibilityBridge.getStringFromBuffer(byteBuffer, strArr);
            this.locale = AccessibilityBridge.getStringFromBuffer(byteBuffer, strArr);
            this.minValue = AccessibilityBridge.getStringFromBuffer(byteBuffer, strArr);
            this.maxValue = AccessibilityBridge.getStringFromBuffer(byteBuffer, strArr);
            this.headingLevel = byteBuffer.getInt();
            this.textDirection = TextDirection.fromInt(byteBuffer.getInt());
            this.left = byteBuffer.getFloat();
            this.top = byteBuffer.getFloat();
            this.right = byteBuffer.getFloat();
            this.bottom = byteBuffer.getFloat();
            this.transform = AccessibilityBridge.getMatrix4FromBuffer(byteBuffer, this.transform);
            this.hitTestTransform = AccessibilityBridge.getMatrix4FromBuffer(byteBuffer, this.hitTestTransform);
            this.inverseTransformDirty = true;
            this.globalGeometryDirty = true;
            int i4 = byteBuffer.getInt();
            this.childrenInTraversalOrder.clear();
            for (int i5 = 0; i5 < i4; i5++) {
                SemanticsNode orCreateSemanticsNode = this.accessibilityBridge.getOrCreateSemanticsNode(byteBuffer.getInt());
                orCreateSemanticsNode.parent = this;
                this.childrenInTraversalOrder.add(orCreateSemanticsNode);
            }
            int i6 = byteBuffer.getInt();
            this.childrenInHitTestOrder.clear();
            for (int i7 = 0; i7 < i6; i7++) {
                SemanticsNode orCreateSemanticsNode2 = this.accessibilityBridge.getOrCreateSemanticsNode(byteBuffer.getInt());
                orCreateSemanticsNode2.parent = this;
                this.childrenInHitTestOrder.add(orCreateSemanticsNode2);
            }
            int i8 = byteBuffer.getInt();
            if (i8 == 0) {
                this.customAccessibilityActions = null;
                return;
            }
            List<CustomAccessibilityAction> list = this.customAccessibilityActions;
            if (list == null) {
                this.customAccessibilityActions = new ArrayList(i8);
            } else {
                list.clear();
            }
            for (int i9 = 0; i9 < i8; i9++) {
                CustomAccessibilityAction orCreateAccessibilityAction = this.accessibilityBridge.getOrCreateAccessibilityAction(byteBuffer.getInt());
                if (orCreateAccessibilityAction.overrideId == Action.TAP.value) {
                    this.onTapOverride = orCreateAccessibilityAction;
                } else if (orCreateAccessibilityAction.overrideId == Action.LONG_PRESS.value) {
                    this.onLongPressOverride = orCreateAccessibilityAction;
                } else {
                    this.customAccessibilityActions.add(orCreateAccessibilityAction);
                }
                this.customAccessibilityActions.add(orCreateAccessibilityAction);
            }
        }
    }

    public enum TextDirection {
        UNKNOWN,
        LTR,
        RTL;

        public static TextDirection fromInt(int i4) {
            return i4 != 1 ? i4 != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    public AccessibilityBridge(View view, AccessibilityChannel accessibilityChannel, AccessibilityManager accessibilityManager, ContentResolver contentResolver, PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate) {
        this(view, accessibilityChannel, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, MIN_ENGINE_GENERATED_NODE_ID), platformViewsAccessibilityDelegate);
    }

    public static /* synthetic */ int access$1072(AccessibilityBridge accessibilityBridge, int i4) {
        int i5 = i4 & accessibilityBridge.accessibilityFeatureFlags;
        accessibilityBridge.accessibilityFeatureFlags = i5;
        return i5;
    }

    public static /* synthetic */ int access$1076(AccessibilityBridge accessibilityBridge, int i4) {
        int i5 = i4 | accessibilityBridge.accessibilityFeatureFlags;
        accessibilityBridge.accessibilityFeatureFlags = i5;
        return i5;
    }

    private AccessibilityEvent createTextChangedEvent(int i4, String str, String str2) {
        AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(i4, 16);
        obtainAccessibilityEvent.setBeforeText(str);
        obtainAccessibilityEvent.getText().add(str2);
        int i5 = 0;
        while (i5 < str.length() && i5 < str2.length() && str.charAt(i5) == str2.charAt(i5)) {
            i5++;
        }
        if (i5 >= str.length() && i5 >= str2.length()) {
            return null;
        }
        obtainAccessibilityEvent.setFromIndex(i5);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i5 && length2 >= i5 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        obtainAccessibilityEvent.setRemovedCount((length - i5) + 1);
        obtainAccessibilityEvent.setAddedCount((length2 - i5) + 1);
        return obtainAccessibilityEvent;
    }

    private boolean doesLayoutInDisplayCutoutModeRequireLeftInset() {
        int i4;
        Activity activity = ViewUtils.getActivity(this.rootAccessibilityView.getContext());
        if (activity == null || activity.getWindow() == null) {
            return false;
        }
        i4 = activity.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return i4 == 2 || i4 == 0;
    }

    private Rect getBoundsInScreen(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.rootAccessibilityView.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float[] getMatrix4FromBuffer(ByteBuffer byteBuffer, float[] fArr) {
        if (fArr == null) {
            fArr = new float[16];
        }
        for (int i4 = 0; i4 < 16; i4++) {
            fArr[i4] = byteBuffer.getFloat();
        }
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CustomAccessibilityAction getOrCreateAccessibilityAction(int i4) {
        CustomAccessibilityAction customAccessibilityAction = this.customAccessibilityActions.get(Integer.valueOf(i4));
        if (customAccessibilityAction != null) {
            return customAccessibilityAction;
        }
        CustomAccessibilityAction customAccessibilityAction2 = new CustomAccessibilityAction();
        customAccessibilityAction2.id = i4;
        customAccessibilityAction2.resourceId = FIRST_RESOURCE_ID + i4;
        this.customAccessibilityActions.put(Integer.valueOf(i4), customAccessibilityAction2);
        return customAccessibilityAction2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SemanticsNode getOrCreateSemanticsNode(int i4) {
        SemanticsNode semanticsNode = this.flutterSemanticsTree.get(Integer.valueOf(i4));
        if (semanticsNode != null) {
            return semanticsNode;
        }
        SemanticsNode semanticsNode2 = new SemanticsNode(this);
        semanticsNode2.id = i4;
        this.flutterSemanticsTree.put(Integer.valueOf(i4), semanticsNode2);
        return semanticsNode2;
    }

    private SemanticsNode getRootSemanticsNode() {
        return this.flutterSemanticsTree.get(0);
    }

    private static List<AccessibilityStringBuilder.StringAttribute> getStringAttributesFromBuffer(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i4 = byteBuffer.getInt();
        if (i4 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = byteBuffer.getInt();
            int i7 = byteBuffer.getInt();
            AccessibilityStringBuilder.StringAttributeType stringAttributeType = AccessibilityStringBuilder.StringAttributeType.values()[byteBuffer.getInt()];
            int i8 = AnonymousClass5.$SwitchMap$io$flutter$view$AccessibilityStringBuilder$StringAttributeType[stringAttributeType.ordinal()];
            if (i8 == 1) {
                byteBuffer.getInt();
                AccessibilityStringBuilder.SpellOutStringAttribute spellOutStringAttribute = new AccessibilityStringBuilder.SpellOutStringAttribute();
                spellOutStringAttribute.start = i6;
                spellOutStringAttribute.end = i7;
                spellOutStringAttribute.type = stringAttributeType;
                arrayList.add(spellOutStringAttribute);
            } else if (i8 == 2) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                AccessibilityStringBuilder.LocaleStringAttribute localeStringAttribute = new AccessibilityStringBuilder.LocaleStringAttribute();
                localeStringAttribute.start = i6;
                localeStringAttribute.end = i7;
                localeStringAttribute.type = stringAttributeType;
                localeStringAttribute.locale = Charset.forName(CharEncoding.UTF_8).decode(byteBuffer2).toString();
                arrayList.add(localeStringAttribute);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getStringFromBuffer(ByteBuffer byteBuffer, String[] strArr) {
        int i4 = byteBuffer.getInt();
        if (i4 == EMPTY_STRING_INDEX) {
            return null;
        }
        return strArr[i4];
    }

    private void handleTouchExploration(float f4, float f5, boolean z) {
        SemanticsNode hitTest;
        if (this.flutterSemanticsTree.isEmpty() || (hitTest = getRootSemanticsNode().hitTest(new float[]{f4, f5, DISABLED_TRANSITION_ANIMATION_SCALE, DEFAULT_TRANSITION_ANIMATION_SCALE}, z)) == this.hoveredObject) {
            return;
        }
        if (hitTest != null) {
            sendAccessibilityEvent(hitTest.id, 128);
        }
        SemanticsNode semanticsNode = this.hoveredObject;
        if (semanticsNode != null) {
            sendAccessibilityEvent(semanticsNode.id, 256);
        }
        this.hoveredObject = hitTest;
    }

    private boolean isImportant(SemanticsNode semanticsNode) {
        if (semanticsNode.hasFlag(Flag.SCOPES_ROUTE)) {
            return false;
        }
        return (semanticsNode.getValueLabelHint() == null && (semanticsNode.actions & (~systemAction)) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$shouldSetCollectionInfo$0(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
        return semanticsNode2 == semanticsNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$shouldSetCollectionInfo$1(SemanticsNode semanticsNode) {
        return semanticsNode.hasFlag(Flag.HAS_IMPLICIT_SCROLLING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccessibilityEvent obtainAccessibilityEvent(int i4, int i5) {
        AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(i5);
        obtainAccessibilityEvent.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtainAccessibilityEvent.setSource(this.rootAccessibilityView, i4);
        return obtainAccessibilityEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTouchExplorationExit() {
        SemanticsNode semanticsNode = this.hoveredObject;
        if (semanticsNode != null) {
            sendAccessibilityEvent(semanticsNode.id, 256);
            this.hoveredObject = null;
        }
    }

    private void onWindowNameChange(SemanticsNode semanticsNode) {
        String routeName = semanticsNode.getRouteName();
        if (routeName == null) {
            routeName = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            setAccessibilityPaneTitle(routeName);
            return;
        }
        AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(semanticsNode.id, 32);
        obtainAccessibilityEvent.getText().add(routeName);
        sendAccessibilityEvent(obtainAccessibilityEvent);
    }

    private boolean performCursorMoveAction(SemanticsNode semanticsNode, int i4, Bundle bundle, boolean z) {
        int i5 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z4 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i6 = semanticsNode.textSelectionBase;
        int i7 = semanticsNode.textSelectionExtent;
        predictCursorMovement(semanticsNode, i5, z, z4);
        if (i6 != semanticsNode.textSelectionBase || i7 != semanticsNode.textSelectionExtent) {
            String str = semanticsNode.value != null ? semanticsNode.value : "";
            AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(semanticsNode.id, 8192);
            obtainAccessibilityEvent.getText().add(str);
            obtainAccessibilityEvent.setFromIndex(semanticsNode.textSelectionBase);
            obtainAccessibilityEvent.setToIndex(semanticsNode.textSelectionExtent);
            obtainAccessibilityEvent.setItemCount(str.length());
            sendAccessibilityEvent(obtainAccessibilityEvent);
        }
        if (i5 == 1) {
            if (z) {
                Action action = Action.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (semanticsNode.hasAction(action)) {
                    this.accessibilityChannel.dispatchSemanticsAction(i4, action, Boolean.valueOf(z4));
                    return true;
                }
            }
            if (z) {
                return false;
            }
            Action action2 = Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!semanticsNode.hasAction(action2)) {
                return false;
            }
            this.accessibilityChannel.dispatchSemanticsAction(i4, action2, Boolean.valueOf(z4));
            return true;
        }
        if (i5 != 2) {
            return i5 == 4 || i5 == 8 || i5 == 16;
        }
        if (z) {
            Action action3 = Action.MOVE_CURSOR_FORWARD_BY_WORD;
            if (semanticsNode.hasAction(action3)) {
                this.accessibilityChannel.dispatchSemanticsAction(i4, action3, Boolean.valueOf(z4));
                return true;
            }
        }
        if (z) {
            return false;
        }
        Action action4 = Action.MOVE_CURSOR_BACKWARD_BY_WORD;
        if (!semanticsNode.hasAction(action4)) {
            return false;
        }
        this.accessibilityChannel.dispatchSemanticsAction(i4, action4, Boolean.valueOf(z4));
        return true;
    }

    private boolean performSetText(SemanticsNode semanticsNode, int i4, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.accessibilityChannel.dispatchSemanticsAction(i4, Action.SET_TEXT, string);
        semanticsNode.value = string;
        semanticsNode.valueAttributes = null;
        return true;
    }

    private void predictCursorMovement(SemanticsNode semanticsNode, int i4, boolean z, boolean z4) {
        if (semanticsNode.textSelectionExtent < 0 || semanticsNode.textSelectionBase < 0) {
            return;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 4) {
                    if (i4 == 8 || i4 == 16) {
                        if (z) {
                            semanticsNode.textSelectionExtent = semanticsNode.value.length();
                        } else {
                            semanticsNode.textSelectionExtent = 0;
                        }
                    }
                } else if (z && semanticsNode.textSelectionExtent < semanticsNode.value.length()) {
                    Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(semanticsNode.value.substring(semanticsNode.textSelectionExtent));
                    if (matcher.find()) {
                        SemanticsNode.access$2212(semanticsNode, matcher.start(1));
                    } else {
                        semanticsNode.textSelectionExtent = semanticsNode.value.length();
                    }
                } else if (!z && semanticsNode.textSelectionExtent > 0) {
                    Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(semanticsNode.value.substring(0, semanticsNode.textSelectionExtent));
                    if (matcher2.find()) {
                        semanticsNode.textSelectionExtent = matcher2.start(1);
                    } else {
                        semanticsNode.textSelectionExtent = 0;
                    }
                }
            } else if (z && semanticsNode.textSelectionExtent < semanticsNode.value.length()) {
                Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(semanticsNode.value.substring(semanticsNode.textSelectionExtent));
                matcher3.find();
                if (matcher3.find()) {
                    SemanticsNode.access$2212(semanticsNode, matcher3.start(1));
                } else {
                    semanticsNode.textSelectionExtent = semanticsNode.value.length();
                }
            } else if (!z && semanticsNode.textSelectionExtent > 0) {
                Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(semanticsNode.value.substring(0, semanticsNode.textSelectionExtent));
                if (matcher4.find()) {
                    semanticsNode.textSelectionExtent = matcher4.start(1);
                }
            }
        } else if (z && semanticsNode.textSelectionExtent < semanticsNode.value.length()) {
            SemanticsNode.access$2212(semanticsNode, 1);
        } else if (!z && semanticsNode.textSelectionExtent > 0) {
            SemanticsNode.access$2220(semanticsNode, 1);
        }
        if (z4) {
            return;
        }
        semanticsNode.textSelectionBase = semanticsNode.textSelectionExtent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendLatestAccessibilityFlagsToFlutter() {
        this.accessibilityChannel.setAccessibilityFeatures(this.accessibilityFeatureFlags);
    }

    private void sendWindowContentChangeEvent(int i4, int i5) {
        AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(i4, 2048);
        obtainAccessibilityEvent.setContentChangeTypes(i5);
        sendAccessibilityEvent(obtainAccessibilityEvent);
    }

    private void setAccessibilityPaneTitle(String str) {
        this.rootAccessibilityView.setAccessibilityPaneTitle(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessibleNavigation(boolean z) {
        if (this.accessibleNavigation == z) {
            return;
        }
        this.accessibleNavigation = z;
        if (z) {
            this.accessibilityFeatureFlags |= AccessibilityFeature.ACCESSIBLE_NAVIGATION.value;
        } else {
            this.accessibilityFeatureFlags &= ~AccessibilityFeature.ACCESSIBLE_NAVIGATION.value;
        }
        sendLatestAccessibilityFlagsToFlutter();
    }

    private void setBoldTextFlag() {
        int i4;
        View view = this.rootAccessibilityView;
        if (view == null || view.getResources() == null) {
            return;
        }
        i4 = this.rootAccessibilityView.getResources().getConfiguration().fontWeightAdjustment;
        if (i4 == Integer.MAX_VALUE || i4 < BOLD_TEXT_WEIGHT_ADJUSTMENT) {
            this.accessibilityFeatureFlags &= ~AccessibilityFeature.BOLD_TEXT.value;
        } else {
            this.accessibilityFeatureFlags |= AccessibilityFeature.BOLD_TEXT.value;
        }
        sendLatestAccessibilityFlagsToFlutter();
    }

    private boolean shouldSetCollectionInfo(final SemanticsNode semanticsNode) {
        if (semanticsNode.scrollChildren > 1) {
            return SemanticsNode.nullableHasAncestor(this.accessibilityFocusedSemanticsNode, new Predicate() { // from class: io.flutter.view.b
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean lambda$shouldSetCollectionInfo$0;
                    lambda$shouldSetCollectionInfo$0 = AccessibilityBridge.lambda$shouldSetCollectionInfo$0(AccessibilityBridge.SemanticsNode.this, (AccessibilityBridge.SemanticsNode) obj);
                    return lambda$shouldSetCollectionInfo$0;
                }
            }) || !SemanticsNode.nullableHasAncestor(this.accessibilityFocusedSemanticsNode, new c());
        }
        return false;
    }

    private boolean shouldSetCollectionItemInfo(SemanticsNode semanticsNode) {
        return semanticsNode.parent != null && shouldSetCollectionInfo(semanticsNode.parent) && semanticsNode.parent.hasFlag(Flag.HAS_IMPLICIT_SCROLLING);
    }

    private void willRemoveSemanticsNode(SemanticsNode semanticsNode) {
        View platformViewById;
        Integer num;
        semanticsNode.parent = null;
        if (semanticsNode.platformViewId != -1 && (num = this.embeddedAccessibilityFocusedNodeId) != null && this.accessibilityViewEmbedder.platformViewOfNode(num.intValue()) == this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode.platformViewId)) {
            sendAccessibilityEvent(this.embeddedAccessibilityFocusedNodeId.intValue(), MIN_ENGINE_GENERATED_NODE_ID);
            this.embeddedAccessibilityFocusedNodeId = null;
        }
        if (semanticsNode.platformViewId != -1 && (platformViewById = this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode.platformViewId)) != null) {
            platformViewById.setImportantForAccessibility(4);
        }
        SemanticsNode semanticsNode2 = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode2 == semanticsNode) {
            sendAccessibilityEvent(semanticsNode2.id, MIN_ENGINE_GENERATED_NODE_ID);
            this.accessibilityFocusedSemanticsNode = null;
        }
        if (this.inputFocusedSemanticsNode == semanticsNode) {
            this.inputFocusedSemanticsNode = null;
        }
        if (this.hoveredObject == semanticsNode) {
            this.hoveredObject = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i4) {
        float parseFloat;
        float parseFloat2;
        int i5;
        setAccessibleNavigation(true);
        if (i4 >= MIN_ENGINE_GENERATED_NODE_ID) {
            return this.accessibilityViewEmbedder.createAccessibilityNodeInfo(i4);
        }
        if (i4 == -1) {
            AccessibilityNodeInfo obtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(this.rootAccessibilityView);
            this.rootAccessibilityView.onInitializeAccessibilityNodeInfo(obtainAccessibilityNodeInfo);
            if (this.flutterSemanticsTree.containsKey(0)) {
                obtainAccessibilityNodeInfo.addChild(this.rootAccessibilityView, 0);
            }
            obtainAccessibilityNodeInfo.setImportantForAccessibility(false);
            return obtainAccessibilityNodeInfo;
        }
        SemanticsNode semanticsNode = this.flutterSemanticsTree.get(Integer.valueOf(i4));
        if (semanticsNode == null) {
            return null;
        }
        if (semanticsNode.platformViewId != -1 && this.platformViewsAccessibilityDelegate.usesVirtualDisplay(semanticsNode.platformViewId)) {
            View platformViewById = this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode.platformViewId);
            if (platformViewById == null) {
                return null;
            }
            return this.accessibilityViewEmbedder.getRootNode(platformViewById, semanticsNode.id, semanticsNode.getGlobalRect());
        }
        AccessibilityNodeInfo obtainAccessibilityNodeInfo2 = obtainAccessibilityNodeInfo(this.rootAccessibilityView, i4);
        obtainAccessibilityNodeInfo2.setImportantForAccessibility(isImportant(semanticsNode));
        obtainAccessibilityNodeInfo2.setViewIdResourceName("");
        if (semanticsNode.identifier != null) {
            obtainAccessibilityNodeInfo2.setViewIdResourceName(semanticsNode.identifier);
        }
        obtainAccessibilityNodeInfo2.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtainAccessibilityNodeInfo2.setClassName("android.view.View");
        obtainAccessibilityNodeInfo2.setSource(this.rootAccessibilityView, i4);
        obtainAccessibilityNodeInfo2.setFocusable(semanticsNode.isFocusable());
        SemanticsNode semanticsNode2 = this.inputFocusedSemanticsNode;
        if (semanticsNode2 != null) {
            obtainAccessibilityNodeInfo2.setFocused(semanticsNode2.id == i4);
        }
        SemanticsNode semanticsNode3 = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode3 != null) {
            obtainAccessibilityNodeInfo2.setAccessibilityFocused(semanticsNode3.id == i4);
        }
        if (semanticsNode.hasFlag(Flag.IS_TEXT_FIELD)) {
            obtainAccessibilityNodeInfo2.setPassword(semanticsNode.hasFlag(Flag.IS_OBSCURED));
            if (!semanticsNode.hasFlag(Flag.IS_READ_ONLY)) {
                obtainAccessibilityNodeInfo2.setClassName("android.widget.EditText");
            }
            obtainAccessibilityNodeInfo2.setEditable(!semanticsNode.hasFlag(r7));
            if (semanticsNode.textSelectionBase != -1 && semanticsNode.textSelectionExtent != -1) {
                obtainAccessibilityNodeInfo2.setTextSelection(semanticsNode.textSelectionBase, semanticsNode.textSelectionExtent);
            }
            SemanticsNode semanticsNode4 = this.accessibilityFocusedSemanticsNode;
            if (semanticsNode4 != null && semanticsNode4.id == i4) {
                obtainAccessibilityNodeInfo2.setLiveRegion(1);
            }
            if (semanticsNode.hasAction(Action.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                obtainAccessibilityNodeInfo2.addAction(256);
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (semanticsNode.hasAction(Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                obtainAccessibilityNodeInfo2.addAction(512);
                i5 = 1;
            }
            if (semanticsNode.hasAction(Action.MOVE_CURSOR_FORWARD_BY_WORD)) {
                obtainAccessibilityNodeInfo2.addAction(256);
                i5 |= 2;
            }
            if (semanticsNode.hasAction(Action.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                obtainAccessibilityNodeInfo2.addAction(512);
                i5 |= 2;
            }
            obtainAccessibilityNodeInfo2.setMovementGranularities(i5);
            if (semanticsNode.maxValueLength >= 0) {
                int length = semanticsNode.value == null ? 0 : semanticsNode.value.length();
                int unused = semanticsNode.currentValueLength;
                int unused2 = semanticsNode.maxValueLength;
                obtainAccessibilityNodeInfo2.setMaxTextLength((length - semanticsNode.currentValueLength) + semanticsNode.maxValueLength);
            }
        }
        if (semanticsNode.hasAction(Action.SET_SELECTION)) {
            obtainAccessibilityNodeInfo2.addAction(131072);
        }
        if (semanticsNode.hasAction(Action.COPY)) {
            obtainAccessibilityNodeInfo2.addAction(16384);
        }
        if (semanticsNode.hasAction(Action.CUT)) {
            obtainAccessibilityNodeInfo2.addAction(MIN_ENGINE_GENERATED_NODE_ID);
        }
        if (semanticsNode.hasAction(Action.PASTE)) {
            obtainAccessibilityNodeInfo2.addAction(32768);
        }
        if (semanticsNode.hasAction(Action.SET_TEXT)) {
            obtainAccessibilityNodeInfo2.addAction(2097152);
        }
        if (semanticsNode.shouldBeTreatedAsButton()) {
            obtainAccessibilityNodeInfo2.setClassName("android.widget.Button");
        }
        if (semanticsNode.hasFlag(Flag.IS_IMAGE)) {
            obtainAccessibilityNodeInfo2.setClassName("android.widget.ImageView");
        }
        if (Role.values()[semanticsNode.role].ordinal() == 23) {
            obtainAccessibilityNodeInfo2.setClassName("android.widget.ProgressBar");
            if (semanticsNode.value != null) {
                try {
                    if (semanticsNode.minValue != null) {
                        try {
                            parseFloat = Float.parseFloat(semanticsNode.minValue);
                        } catch (NumberFormatException unused3) {
                        }
                        if (semanticsNode.maxValue != null) {
                            try {
                                parseFloat2 = Float.parseFloat(semanticsNode.maxValue);
                            } catch (NumberFormatException unused4) {
                            }
                            obtainAccessibilityNodeInfo2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(semanticsNode.value)));
                        }
                        parseFloat2 = Float.POSITIVE_INFINITY;
                        obtainAccessibilityNodeInfo2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(semanticsNode.value)));
                    }
                    obtainAccessibilityNodeInfo2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(semanticsNode.value)));
                } catch (NumberFormatException unused5) {
                    if (Build.VERSION.SDK_INT >= 36) {
                        obtainAccessibilityNodeInfo2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(3, DISABLED_TRANSITION_ANIMATION_SCALE, DISABLED_TRANSITION_ANIMATION_SCALE, DISABLED_TRANSITION_ANIMATION_SCALE));
                    } else {
                        obtainAccessibilityNodeInfo2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, DISABLED_TRANSITION_ANIMATION_SCALE, DISABLED_TRANSITION_ANIMATION_SCALE, DISABLED_TRANSITION_ANIMATION_SCALE));
                    }
                }
                parseFloat = Float.NEGATIVE_INFINITY;
                if (semanticsNode.maxValue != null) {
                }
                parseFloat2 = Float.POSITIVE_INFINITY;
            }
        }
        if (semanticsNode.hasAction(Action.DISMISS)) {
            obtainAccessibilityNodeInfo2.setDismissable(true);
            obtainAccessibilityNodeInfo2.addAction(1048576);
        }
        if (semanticsNode.parent != null) {
            obtainAccessibilityNodeInfo2.setParent(this.rootAccessibilityView, semanticsNode.parent.id);
        } else {
            obtainAccessibilityNodeInfo2.setParent(this.rootAccessibilityView);
        }
        if (semanticsNode.previousNodeId != -1) {
            obtainAccessibilityNodeInfo2.setTraversalAfter(this.rootAccessibilityView, semanticsNode.previousNodeId);
        }
        Rect globalRect = semanticsNode.getGlobalRect();
        if (semanticsNode.parent != null) {
            Rect globalRect2 = semanticsNode.parent.getGlobalRect();
            Rect rect = new Rect(globalRect);
            rect.offset(-globalRect2.left, -globalRect2.top);
            obtainAccessibilityNodeInfo2.setBoundsInParent(rect);
        } else {
            obtainAccessibilityNodeInfo2.setBoundsInParent(globalRect);
        }
        obtainAccessibilityNodeInfo2.setBoundsInScreen(getBoundsInScreen(globalRect));
        obtainAccessibilityNodeInfo2.setVisibleToUser(true);
        obtainAccessibilityNodeInfo2.setEnabled(!semanticsNode.hasFlag(Flag.HAS_ENABLED_STATE) || semanticsNode.hasFlag(Flag.IS_ENABLED));
        if (semanticsNode.hasAction(Action.TAP)) {
            if (semanticsNode.onTapOverride != null) {
                obtainAccessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, semanticsNode.onTapOverride.hint));
                obtainAccessibilityNodeInfo2.setClickable(true);
            } else {
                obtainAccessibilityNodeInfo2.addAction(16);
                obtainAccessibilityNodeInfo2.setClickable(true);
            }
        } else if (semanticsNode.hasFlag(Flag.IS_SLIDER)) {
            obtainAccessibilityNodeInfo2.addAction(16);
            obtainAccessibilityNodeInfo2.setClickable(true);
        }
        if (semanticsNode.hasAction(Action.LONG_PRESS)) {
            if (semanticsNode.onLongPressOverride != null) {
                obtainAccessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, semanticsNode.onLongPressOverride.hint));
                obtainAccessibilityNodeInfo2.setLongClickable(true);
            } else {
                obtainAccessibilityNodeInfo2.addAction(32);
                obtainAccessibilityNodeInfo2.setLongClickable(true);
            }
        }
        Action action = Action.SCROLL_LEFT;
        if (semanticsNode.hasAction(action) || semanticsNode.hasAction(Action.SCROLL_UP) || semanticsNode.hasAction(Action.SCROLL_RIGHT) || semanticsNode.hasAction(Action.SCROLL_DOWN)) {
            obtainAccessibilityNodeInfo2.setScrollable(true);
            if (semanticsNode.hasFlag(Flag.HAS_IMPLICIT_SCROLLING)) {
                if (semanticsNode.hasAction(action) || semanticsNode.hasAction(Action.SCROLL_RIGHT)) {
                    obtainAccessibilityNodeInfo2.setClassName("android.widget.HorizontalScrollView");
                } else {
                    obtainAccessibilityNodeInfo2.setClassName("android.widget.ScrollView");
                }
            }
        }
        if (shouldSetCollectionInfo(semanticsNode)) {
            if (semanticsNode.hasAction(action) || semanticsNode.hasAction(Action.SCROLL_RIGHT)) {
                if (Build.VERSION.SDK_INT < 33) {
                    obtainAccessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, semanticsNode.scrollChildren, false));
                } else {
                    obtainAccessibilityNodeInfo2.setCollectionInfo(Wo.m(semanticsNode.scrollChildren));
                }
            } else if (Build.VERSION.SDK_INT < 33) {
                obtainAccessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(semanticsNode.scrollChildren, 1, false));
            } else {
                obtainAccessibilityNodeInfo2.setCollectionInfo(Wo.g(semanticsNode.scrollChildren));
            }
        }
        if (shouldSetCollectionItemInfo(semanticsNode)) {
            SemanticsNode semanticsNode5 = semanticsNode.parent;
            List list = semanticsNode5.childrenInTraversalOrder;
            Object[] objArr = (semanticsNode5.hasAction(action) || semanticsNode5.hasAction(Action.SCROLL_RIGHT)) ? false : true;
            int indexOf = list.indexOf(semanticsNode);
            if (objArr == true) {
                if (Build.VERSION.SDK_INT < 33) {
                    obtainAccessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(indexOf, 1, 0, 1, semanticsNode.hasFlag(Flag.IS_HEADER)));
                } else {
                    obtainAccessibilityNodeInfo2.setCollectionItemInfo(Wo.n(indexOf, semanticsNode.hasFlag(Flag.IS_HEADER)));
                }
            } else if (Build.VERSION.SDK_INT < 33) {
                obtainAccessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, indexOf, 1, semanticsNode.hasFlag(Flag.IS_HEADER)));
            } else {
                obtainAccessibilityNodeInfo2.setCollectionItemInfo(Wo.h(indexOf, semanticsNode.hasFlag(Flag.IS_HEADER)));
            }
        }
        if (semanticsNode.hasAction(action) || semanticsNode.hasAction(Action.SCROLL_UP)) {
            obtainAccessibilityNodeInfo2.addAction(4096);
        }
        if (semanticsNode.hasAction(Action.SCROLL_RIGHT) || semanticsNode.hasAction(Action.SCROLL_DOWN)) {
            obtainAccessibilityNodeInfo2.addAction(8192);
        }
        Action action2 = Action.INCREASE;
        if (semanticsNode.hasAction(action2) || semanticsNode.hasAction(Action.DECREASE)) {
            obtainAccessibilityNodeInfo2.setClassName("android.widget.SeekBar");
            if (semanticsNode.hasAction(action2)) {
                obtainAccessibilityNodeInfo2.addAction(4096);
            }
            if (semanticsNode.hasAction(Action.DECREASE)) {
                obtainAccessibilityNodeInfo2.addAction(8192);
            }
        }
        if (semanticsNode.hasFlag(Flag.IS_LIVE_REGION)) {
            obtainAccessibilityNodeInfo2.setLiveRegion(1);
        }
        if (semanticsNode.hasFlag(Flag.IS_TEXT_FIELD)) {
            obtainAccessibilityNodeInfo2.setText(semanticsNode.getValue());
            if (Build.VERSION.SDK_INT >= 28) {
                obtainAccessibilityNodeInfo2.setHintText(semanticsNode.getTextFieldHint());
            }
        } else if (!semanticsNode.hasFlag(Flag.SCOPES_ROUTE)) {
            CharSequence valueLabelHint = semanticsNode.getValueLabelHint();
            if (Build.VERSION.SDK_INT < 28 && semanticsNode.tooltip != null) {
                valueLabelHint = ((Object) (valueLabelHint != null ? valueLabelHint : "")) + IOUtils.LINE_SEPARATOR_UNIX + semanticsNode.tooltip;
            }
            if (valueLabelHint != null) {
                obtainAccessibilityNodeInfo2.setContentDescription(valueLabelHint);
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 28 && semanticsNode.tooltip != null) {
            obtainAccessibilityNodeInfo2.setTooltipText(semanticsNode.tooltip);
            if (semanticsNode.getValueLabelHint() == null) {
                obtainAccessibilityNodeInfo2.setContentDescription(semanticsNode.tooltip);
            }
        }
        boolean hasFlag = semanticsNode.hasFlag(Flag.HAS_CHECKED_STATE);
        boolean hasFlag2 = semanticsNode.hasFlag(Flag.HAS_TOGGLED_STATE);
        obtainAccessibilityNodeInfo2.setCheckable(hasFlag || hasFlag2);
        if (hasFlag) {
            if (semanticsNode.hasFlag(Flag.IS_IN_MUTUALLY_EXCLUSIVE_GROUP)) {
                obtainAccessibilityNodeInfo2.setClassName("android.widget.RadioButton");
            } else {
                obtainAccessibilityNodeInfo2.setClassName("android.widget.CheckBox");
            }
            if (i6 >= 36) {
                obtainAccessibilityNodeInfo2.setChecked(semanticsNode.hasFlag(Flag.IS_CHECK_STATE_MIXED) ? 2 : semanticsNode.hasFlag(Flag.IS_CHECKED) ? 1 : 0);
            } else {
                obtainAccessibilityNodeInfo2.setChecked(semanticsNode.hasFlag(Flag.IS_CHECKED));
            }
        } else if (hasFlag2) {
            obtainAccessibilityNodeInfo2.setClassName("android.widget.Switch");
            if (i6 >= 36) {
                obtainAccessibilityNodeInfo2.setChecked(semanticsNode.hasFlag(Flag.IS_TOGGLED) ? 1 : 0);
            } else {
                obtainAccessibilityNodeInfo2.setChecked(semanticsNode.hasFlag(Flag.IS_TOGGLED));
            }
        }
        obtainAccessibilityNodeInfo2.setSelected(semanticsNode.hasFlag(Flag.IS_SELECTED));
        if (i6 >= 36 && semanticsNode.hasFlag(Flag.HAS_EXPANDED_STATE)) {
            obtainAccessibilityNodeInfo2.setExpandedState(semanticsNode.hasFlag(Flag.IS_EXPANDED) ? 3 : 1);
            if (semanticsNode.hasAction(Action.EXPAND)) {
                obtainAccessibilityNodeInfo2.addAction(262144);
            }
            if (semanticsNode.hasAction(Action.COLLAPSE)) {
                obtainAccessibilityNodeInfo2.addAction(524288);
            }
        }
        if (i6 >= 28) {
            obtainAccessibilityNodeInfo2.setHeading(semanticsNode.headingLevel > 0);
        }
        SemanticsNode semanticsNode6 = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode6 == null || semanticsNode6.id != i4) {
            obtainAccessibilityNodeInfo2.addAction(64);
        } else {
            obtainAccessibilityNodeInfo2.addAction(128);
        }
        if (semanticsNode.customAccessibilityActions != null) {
            for (CustomAccessibilityAction customAccessibilityAction : semanticsNode.customAccessibilityActions) {
                obtainAccessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(customAccessibilityAction.resourceId, customAccessibilityAction.label));
            }
        }
        for (SemanticsNode semanticsNode7 : semanticsNode.childrenInTraversalOrder) {
            if (!semanticsNode7.hasFlag(Flag.IS_HIDDEN)) {
                if (semanticsNode7.platformViewId != -1) {
                    View platformViewById2 = this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode7.platformViewId);
                    if (!this.platformViewsAccessibilityDelegate.usesVirtualDisplay(semanticsNode7.platformViewId) && platformViewById2 != null) {
                        platformViewById2.setImportantForAccessibility(0);
                        obtainAccessibilityNodeInfo2.addChild(platformViewById2);
                    }
                }
                obtainAccessibilityNodeInfo2.addChild(this.rootAccessibilityView, semanticsNode7.id);
            }
        }
        return obtainAccessibilityNodeInfo2;
    }

    public boolean externalViewRequestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (!this.accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = this.accessibilityViewEmbedder.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.embeddedInputFocusedNodeId = recordFlutterId;
            this.inputFocusedSemanticsNode = null;
            return true;
        }
        if (eventType == 128) {
            this.hoveredObject = null;
            return true;
        }
        if (eventType == 32768) {
            this.embeddedAccessibilityFocusedNodeId = recordFlutterId;
            this.accessibilityFocusedSemanticsNode = null;
            return true;
        }
        if (eventType != MIN_ENGINE_GENERATED_NODE_ID) {
            return true;
        }
        this.embeddedInputFocusedNodeId = null;
        this.embeddedAccessibilityFocusedNodeId = null;
        return true;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i4) {
        if (i4 == 1) {
            SemanticsNode semanticsNode = this.inputFocusedSemanticsNode;
            if (semanticsNode != null) {
                return createAccessibilityNodeInfo(semanticsNode.id);
            }
            Integer num = this.embeddedInputFocusedNodeId;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i4 != 2) {
            return null;
        }
        SemanticsNode semanticsNode2 = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode2 != null) {
            return createAccessibilityNodeInfo(semanticsNode2.id);
        }
        Integer num2 = this.embeddedAccessibilityFocusedNodeId;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public boolean getAccessibleNavigation() {
        return this.accessibleNavigation;
    }

    public int getHoveredObjectId() {
        return this.hoveredObject.id;
    }

    public boolean isAccessibilityEnabled() {
        return this.accessibilityManager.isEnabled();
    }

    public boolean isTouchExplorationEnabled() {
        return this.accessibilityManager.isTouchExplorationEnabled();
    }

    public AccessibilityNodeInfo obtainAccessibilityNodeInfo(View view) {
        return AccessibilityNodeInfo.obtain(view);
    }

    public boolean onAccessibilityHoverEvent(MotionEvent motionEvent) {
        return onAccessibilityHoverEvent(motionEvent, false);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i4, int i5, Bundle bundle) {
        if (i4 >= MIN_ENGINE_GENERATED_NODE_ID) {
            boolean performAction = this.accessibilityViewEmbedder.performAction(i4, i5, bundle);
            if (performAction && i5 == 128) {
                this.embeddedAccessibilityFocusedNodeId = null;
            }
            return performAction;
        }
        SemanticsNode semanticsNode = this.flutterSemanticsTree.get(Integer.valueOf(i4));
        if (semanticsNode == null) {
            return false;
        }
        switch (i5) {
            case 16:
                this.accessibilityChannel.dispatchSemanticsAction(i4, Action.TAP);
                return true;
            case Build.API_LEVELS.API_32 /* 32 */:
                this.accessibilityChannel.dispatchSemanticsAction(i4, Action.LONG_PRESS);
                return true;
            case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                if (this.accessibilityFocusedSemanticsNode == null) {
                    this.rootAccessibilityView.invalidate();
                }
                this.accessibilityFocusedSemanticsNode = semanticsNode;
                this.accessibilityChannel.dispatchSemanticsAction(i4, Action.DID_GAIN_ACCESSIBILITY_FOCUS);
                HashMap hashMap = new HashMap();
                hashMap.put("type", "didGainFocus");
                hashMap.put("nodeId", Integer.valueOf(semanticsNode.id));
                this.accessibilityChannel.channel.send(hashMap);
                sendAccessibilityEvent(i4, 32768);
                if (semanticsNode.hasAction(Action.INCREASE) || semanticsNode.hasAction(Action.DECREASE)) {
                    sendAccessibilityEvent(i4, 4);
                }
                return true;
            case 128:
                SemanticsNode semanticsNode2 = this.accessibilityFocusedSemanticsNode;
                if (semanticsNode2 != null && semanticsNode2.id == i4) {
                    this.accessibilityFocusedSemanticsNode = null;
                }
                Integer num = this.embeddedAccessibilityFocusedNodeId;
                if (num != null && num.intValue() == i4) {
                    this.embeddedAccessibilityFocusedNodeId = null;
                }
                this.accessibilityChannel.dispatchSemanticsAction(i4, Action.DID_LOSE_ACCESSIBILITY_FOCUS);
                sendAccessibilityEvent(i4, MIN_ENGINE_GENERATED_NODE_ID);
                return true;
            case 256:
                return performCursorMoveAction(semanticsNode, i4, bundle, true);
            case 512:
                return performCursorMoveAction(semanticsNode, i4, bundle, false);
            case 4096:
                Action action = Action.SCROLL_UP;
                if (semanticsNode.hasAction(action)) {
                    this.accessibilityChannel.dispatchSemanticsAction(i4, action);
                } else {
                    Action action2 = Action.SCROLL_LEFT;
                    if (semanticsNode.hasAction(action2)) {
                        this.accessibilityChannel.dispatchSemanticsAction(i4, action2);
                    } else {
                        Action action3 = Action.INCREASE;
                        if (!semanticsNode.hasAction(action3)) {
                            return false;
                        }
                        semanticsNode.value = semanticsNode.increasedValue;
                        semanticsNode.valueAttributes = semanticsNode.increasedValueAttributes;
                        sendAccessibilityEvent(i4, 4);
                        this.accessibilityChannel.dispatchSemanticsAction(i4, action3);
                    }
                }
                return true;
            case 8192:
                Action action4 = Action.SCROLL_DOWN;
                if (semanticsNode.hasAction(action4)) {
                    this.accessibilityChannel.dispatchSemanticsAction(i4, action4);
                } else {
                    Action action5 = Action.SCROLL_RIGHT;
                    if (semanticsNode.hasAction(action5)) {
                        this.accessibilityChannel.dispatchSemanticsAction(i4, action5);
                    } else {
                        Action action6 = Action.DECREASE;
                        if (!semanticsNode.hasAction(action6)) {
                            return false;
                        }
                        semanticsNode.value = semanticsNode.decreasedValue;
                        semanticsNode.valueAttributes = semanticsNode.decreasedValueAttributes;
                        sendAccessibilityEvent(i4, 4);
                        this.accessibilityChannel.dispatchSemanticsAction(i4, action6);
                    }
                }
                return true;
            case 16384:
                this.accessibilityChannel.dispatchSemanticsAction(i4, Action.COPY);
                return true;
            case 32768:
                this.accessibilityChannel.dispatchSemanticsAction(i4, Action.PASTE);
                return true;
            case MIN_ENGINE_GENERATED_NODE_ID /* 65536 */:
                this.accessibilityChannel.dispatchSemanticsAction(i4, Action.CUT);
                return true;
            case 131072:
                HashMap hashMap2 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    hashMap2.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap2.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap2.put("base", Integer.valueOf(semanticsNode.textSelectionExtent));
                    hashMap2.put("extent", Integer.valueOf(semanticsNode.textSelectionExtent));
                }
                this.accessibilityChannel.dispatchSemanticsAction(i4, Action.SET_SELECTION, hashMap2);
                SemanticsNode semanticsNode3 = this.flutterSemanticsTree.get(Integer.valueOf(i4));
                semanticsNode3.textSelectionBase = ((Integer) hashMap2.get("base")).intValue();
                semanticsNode3.textSelectionExtent = ((Integer) hashMap2.get("extent")).intValue();
                return true;
            case 262144:
                this.accessibilityChannel.dispatchSemanticsAction(i4, Action.EXPAND);
                return true;
            case 524288:
                this.accessibilityChannel.dispatchSemanticsAction(i4, Action.COLLAPSE);
                return true;
            case 1048576:
                this.accessibilityChannel.dispatchSemanticsAction(i4, Action.DISMISS);
                return true;
            case 2097152:
                return performSetText(semanticsNode, i4, bundle);
            case 16908342:
                this.accessibilityChannel.dispatchSemanticsAction(i4, Action.SHOW_ON_SCREEN);
                return true;
            default:
                CustomAccessibilityAction customAccessibilityAction = this.customAccessibilityActions.get(Integer.valueOf(i5 - FIRST_RESOURCE_ID));
                if (customAccessibilityAction == null) {
                    return false;
                }
                this.accessibilityChannel.dispatchSemanticsAction(i4, Action.CUSTOM_ACTION, Integer.valueOf(customAccessibilityAction.id));
                return true;
        }
    }

    public void release() {
        this.isReleased = true;
        this.platformViewsAccessibilityDelegate.detachAccessibilityBridge();
        setOnAccessibilityChangeListener(null);
        this.accessibilityManager.removeAccessibilityStateChangeListener(this.accessibilityStateChangeListener);
        this.accessibilityManager.removeTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        this.contentResolver.unregisterContentObserver(this.animationScaleObserver);
        this.accessibilityChannel.setAccessibilityMessageHandler(null);
    }

    public void reset() {
        this.flutterSemanticsTree.clear();
        SemanticsNode semanticsNode = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode != null) {
            sendAccessibilityEvent(semanticsNode.id, MIN_ENGINE_GENERATED_NODE_ID);
        }
        this.accessibilityFocusedSemanticsNode = null;
        this.hoveredObject = null;
        sendWindowContentChangeEvent(0, 1);
    }

    public void sendAccessibilityEvent(int i4, int i5) {
        if (this.accessibilityManager.isEnabled()) {
            sendAccessibilityEvent(obtainAccessibilityEvent(i4, i5));
        }
    }

    public void setLocale(String str) {
        this.defaultLocale = str;
    }

    public void setOnAccessibilityChangeListener(OnAccessibilityChangeListener onAccessibilityChangeListener) {
        this.onAccessibilityChangeListener = onAccessibilityChangeListener;
    }

    public void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            CustomAccessibilityAction orCreateAccessibilityAction = getOrCreateAccessibilityAction(byteBuffer.getInt());
            orCreateAccessibilityAction.overrideId = byteBuffer.getInt();
            orCreateAccessibilityAction.label = getStringFromBuffer(byteBuffer, strArr);
            orCreateAccessibilityAction.hint = getStringFromBuffer(byteBuffer, strArr);
        }
    }

    public void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        SemanticsNode semanticsNode;
        SemanticsNode semanticsNode2;
        float f4;
        float f5;
        View platformViewById;
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            SemanticsNode orCreateSemanticsNode = getOrCreateSemanticsNode(byteBuffer.getInt());
            orCreateSemanticsNode.updateWith(byteBuffer, strArr, byteBufferArr);
            if (!orCreateSemanticsNode.hasFlag(Flag.IS_HIDDEN)) {
                if (orCreateSemanticsNode.hasFlag(Flag.IS_FOCUSED)) {
                    this.inputFocusedSemanticsNode = orCreateSemanticsNode;
                }
                if (orCreateSemanticsNode.hadPreviousConfig) {
                    arrayList.add(orCreateSemanticsNode);
                }
                if (orCreateSemanticsNode.platformViewId != -1 && !this.platformViewsAccessibilityDelegate.usesVirtualDisplay(orCreateSemanticsNode.platformViewId) && (platformViewById = this.platformViewsAccessibilityDelegate.getPlatformViewById(orCreateSemanticsNode.platformViewId)) != null) {
                    platformViewById.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        SemanticsNode rootSemanticsNode = getRootSemanticsNode();
        ArrayList arrayList2 = new ArrayList();
        if (rootSemanticsNode != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            rootSemanticsNode.updateRecursively(fArr, hashSet, false);
            rootSemanticsNode.collectRoutes(arrayList2);
        }
        int size = arrayList2.size();
        SemanticsNode semanticsNode3 = null;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            SemanticsNode semanticsNode4 = (SemanticsNode) obj;
            if (!this.flutterNavigationStack.contains(Integer.valueOf(semanticsNode4.id))) {
                semanticsNode3 = semanticsNode4;
            }
        }
        if (semanticsNode3 == null && !arrayList2.isEmpty()) {
            semanticsNode3 = (SemanticsNode) arrayList2.get(arrayList2.size() - 1);
        }
        if (semanticsNode3 != null && (semanticsNode3.id != this.previousRouteId || arrayList2.size() != this.flutterNavigationStack.size())) {
            this.previousRouteId = semanticsNode3.id;
            onWindowNameChange(semanticsNode3);
        }
        this.flutterNavigationStack.clear();
        int size2 = arrayList2.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList2.get(i5);
            i5++;
            this.flutterNavigationStack.add(Integer.valueOf(((SemanticsNode) obj2).id));
        }
        Iterator<Map.Entry<Integer, SemanticsNode>> it = this.flutterSemanticsTree.entrySet().iterator();
        while (it.hasNext()) {
            SemanticsNode value = it.next().getValue();
            if (!hashSet.contains(value)) {
                willRemoveSemanticsNode(value);
                it.remove();
            }
        }
        sendWindowContentChangeEvent(0, 1);
        int size3 = arrayList.size();
        int i6 = 0;
        while (i6 < size3) {
            Object obj3 = arrayList.get(i6);
            i6++;
            SemanticsNode semanticsNode5 = (SemanticsNode) obj3;
            if (semanticsNode5.didScroll()) {
                AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(semanticsNode5.id, 4096);
                float f6 = semanticsNode5.scrollPosition;
                float f7 = semanticsNode5.scrollExtentMax;
                if (Float.isInfinite(semanticsNode5.scrollExtentMax)) {
                    if (f6 > SCROLL_POSITION_CAP_FOR_INFINITY) {
                        f6 = 70000.0f;
                    }
                    f7 = 100000.0f;
                }
                if (Float.isInfinite(semanticsNode5.scrollExtentMin)) {
                    f4 = f7 + SCROLL_EXTENT_FOR_INFINITY;
                    if (f6 < -70000.0f) {
                        f6 = -70000.0f;
                    }
                    f5 = f6 + SCROLL_EXTENT_FOR_INFINITY;
                } else {
                    f4 = f7 - semanticsNode5.scrollExtentMin;
                    f5 = f6 - semanticsNode5.scrollExtentMin;
                }
                if (semanticsNode5.hadAction(Action.SCROLL_UP) || semanticsNode5.hadAction(Action.SCROLL_DOWN)) {
                    obtainAccessibilityEvent.setScrollY((int) f5);
                    obtainAccessibilityEvent.setMaxScrollY((int) f4);
                } else if (semanticsNode5.hadAction(Action.SCROLL_LEFT) || semanticsNode5.hadAction(Action.SCROLL_RIGHT)) {
                    obtainAccessibilityEvent.setScrollX((int) f5);
                    obtainAccessibilityEvent.setMaxScrollX((int) f4);
                }
                if (semanticsNode5.scrollChildren > 0) {
                    obtainAccessibilityEvent.setItemCount(semanticsNode5.scrollChildren);
                    obtainAccessibilityEvent.setFromIndex(semanticsNode5.scrollIndex);
                    Iterator it2 = semanticsNode5.childrenInHitTestOrder.iterator();
                    int i7 = 0;
                    while (it2.hasNext()) {
                        if (!((SemanticsNode) it2.next()).hasFlag(Flag.IS_HIDDEN)) {
                            i7++;
                        }
                    }
                    obtainAccessibilityEvent.setToIndex((semanticsNode5.scrollIndex + i7) - 1);
                }
                sendAccessibilityEvent(obtainAccessibilityEvent);
            }
            if (semanticsNode5.hasFlag(Flag.IS_LIVE_REGION) && semanticsNode5.didChangeLabel()) {
                sendWindowContentChangeEvent(semanticsNode5.id, 1);
            }
            if (Build.VERSION.SDK_INT >= 36 && semanticsNode5.didChangeCheckedState()) {
                sendWindowContentChangeEvent(semanticsNode5.id, 8192);
            }
            SemanticsNode semanticsNode6 = this.accessibilityFocusedSemanticsNode;
            if (semanticsNode6 != null && semanticsNode6.id == semanticsNode5.id) {
                Flag flag = Flag.IS_SELECTED;
                if (!semanticsNode5.hadFlag(flag) && semanticsNode5.hasFlag(flag)) {
                    AccessibilityEvent obtainAccessibilityEvent2 = obtainAccessibilityEvent(semanticsNode5.id, 4);
                    obtainAccessibilityEvent2.getText().add(semanticsNode5.label);
                    sendAccessibilityEvent(obtainAccessibilityEvent2);
                }
            }
            SemanticsNode semanticsNode7 = this.inputFocusedSemanticsNode;
            if (semanticsNode7 != null && semanticsNode7.id == semanticsNode5.id && ((semanticsNode2 = this.lastInputFocusedSemanticsNode) == null || semanticsNode2.id != this.inputFocusedSemanticsNode.id)) {
                this.lastInputFocusedSemanticsNode = this.inputFocusedSemanticsNode;
                sendAccessibilityEvent(obtainAccessibilityEvent(semanticsNode5.id, 8));
            } else if (this.inputFocusedSemanticsNode == null) {
                this.lastInputFocusedSemanticsNode = null;
            }
            SemanticsNode semanticsNode8 = this.inputFocusedSemanticsNode;
            if (semanticsNode8 != null && semanticsNode8.id == semanticsNode5.id) {
                Flag flag2 = Flag.IS_TEXT_FIELD;
                if (semanticsNode5.hadFlag(flag2) && semanticsNode5.hasFlag(flag2) && ((semanticsNode = this.accessibilityFocusedSemanticsNode) == null || semanticsNode.id == this.inputFocusedSemanticsNode.id)) {
                    String str = semanticsNode5.previousValue != null ? semanticsNode5.previousValue : "";
                    String str2 = semanticsNode5.value != null ? semanticsNode5.value : "";
                    AccessibilityEvent createTextChangedEvent = createTextChangedEvent(semanticsNode5.id, str, str2);
                    if (createTextChangedEvent != null) {
                        sendAccessibilityEvent(createTextChangedEvent);
                    }
                    if (semanticsNode5.previousTextSelectionBase != semanticsNode5.textSelectionBase || semanticsNode5.previousTextSelectionExtent != semanticsNode5.textSelectionExtent) {
                        AccessibilityEvent obtainAccessibilityEvent3 = obtainAccessibilityEvent(semanticsNode5.id, 8192);
                        obtainAccessibilityEvent3.getText().add(str2);
                        obtainAccessibilityEvent3.setFromIndex(semanticsNode5.textSelectionBase);
                        obtainAccessibilityEvent3.setToIndex(semanticsNode5.textSelectionExtent);
                        obtainAccessibilityEvent3.setItemCount(str2.length());
                        sendAccessibilityEvent(obtainAccessibilityEvent3);
                    }
                }
            }
        }
    }

    public AccessibilityBridge(View view, AccessibilityChannel accessibilityChannel, final AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate) {
        this.flutterSemanticsTree = new HashMap();
        this.customAccessibilityActions = new HashMap();
        this.accessibilityFeatureFlags = 0;
        this.flutterNavigationStack = new ArrayList();
        this.previousRouteId = 0;
        this.lastLeftFrameInset = 0;
        this.accessibleNavigation = false;
        this.isReleased = false;
        AccessibilityChannel.AccessibilityMessageHandler accessibilityMessageHandler = new AccessibilityChannel.AccessibilityMessageHandler() { // from class: io.flutter.view.AccessibilityBridge.1
            @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
            public void announce(String str) {
                if (Build.VERSION.SDK_INT >= 36) {
                    Log.w(AccessibilityBridge.TAG, "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                }
                AccessibilityBridge.this.rootAccessibilityView.announceForAccessibility(str);
            }

            @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
            public void onFocus(int i4) {
                AccessibilityBridge.this.sendAccessibilityEvent(i4, 8);
            }

            @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
            public void onLongPress(int i4) {
                AccessibilityBridge.this.sendAccessibilityEvent(i4, 2);
            }

            @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
            public void onTap(int i4) {
                AccessibilityBridge.this.sendAccessibilityEvent(i4, 1);
            }

            @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
            public void onTooltip(String str) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                AccessibilityEvent obtainAccessibilityEvent = AccessibilityBridge.this.obtainAccessibilityEvent(0, 32);
                obtainAccessibilityEvent.getText().add(str);
                AccessibilityBridge.this.sendAccessibilityEvent(obtainAccessibilityEvent);
            }

            @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler, io.flutter.embedding.engine.FlutterJNI.AccessibilityDelegate
            public void resetSemantics() {
                AccessibilityBridge.this.reset();
            }

            @Override // io.flutter.embedding.engine.FlutterJNI.AccessibilityDelegate
            public void setLocale(String str) {
                AccessibilityBridge.this.setLocale(str);
            }

            @Override // io.flutter.embedding.engine.FlutterJNI.AccessibilityDelegate
            public void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                AccessibilityBridge.this.updateCustomAccessibilityActions(byteBuffer, strArr);
            }

            @Override // io.flutter.embedding.engine.FlutterJNI.AccessibilityDelegate
            public void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                for (ByteBuffer byteBuffer2 : byteBufferArr) {
                    byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
                }
                AccessibilityBridge.this.updateSemantics(byteBuffer, strArr, byteBufferArr);
            }
        };
        this.accessibilityMessageHandler = accessibilityMessageHandler;
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: io.flutter.view.AccessibilityBridge.2
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public void onAccessibilityStateChanged(boolean z) {
                if (AccessibilityBridge.this.isReleased) {
                    return;
                }
                if (z) {
                    AccessibilityBridge.this.accessibilityChannel.onAndroidAccessibilityEnabled();
                } else {
                    AccessibilityBridge.this.setAccessibleNavigation(false);
                    AccessibilityBridge.this.accessibilityChannel.onAndroidAccessibilityDisabled();
                }
                if (AccessibilityBridge.this.onAccessibilityChangeListener != null) {
                    AccessibilityBridge.this.onAccessibilityChangeListener.onAccessibilityChanged(z, AccessibilityBridge.this.accessibilityManager.isTouchExplorationEnabled());
                }
            }
        };
        this.accessibilityStateChangeListener = accessibilityStateChangeListener;
        ContentObserver contentObserver = new ContentObserver(new Handler()) { // from class: io.flutter.view.AccessibilityBridge.3
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                onChange(z, null);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z, Uri uri) {
                if (AccessibilityBridge.this.isReleased) {
                    return;
                }
                if (Settings.Global.getFloat(AccessibilityBridge.this.contentResolver, "transition_animation_scale", AccessibilityBridge.DEFAULT_TRANSITION_ANIMATION_SCALE) == AccessibilityBridge.DISABLED_TRANSITION_ANIMATION_SCALE) {
                    AccessibilityBridge.access$1076(AccessibilityBridge.this, AccessibilityFeature.DISABLE_ANIMATIONS.value);
                } else {
                    AccessibilityBridge.access$1072(AccessibilityBridge.this, ~AccessibilityFeature.DISABLE_ANIMATIONS.value);
                }
                AccessibilityBridge.this.sendLatestAccessibilityFlagsToFlutter();
            }
        };
        this.animationScaleObserver = contentObserver;
        this.rootAccessibilityView = view;
        this.accessibilityChannel = accessibilityChannel;
        this.accessibilityManager = accessibilityManager;
        this.contentResolver = contentResolver;
        this.accessibilityViewEmbedder = accessibilityViewEmbedder;
        this.platformViewsAccessibilityDelegate = platformViewsAccessibilityDelegate;
        accessibilityChannel.setAccessibilityMessageHandler(accessibilityMessageHandler);
        accessibilityStateChangeListener.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: io.flutter.view.AccessibilityBridge.4
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public void onTouchExplorationStateChanged(boolean z) {
                if (AccessibilityBridge.this.isReleased) {
                    return;
                }
                if (!z) {
                    AccessibilityBridge.this.setAccessibleNavigation(false);
                    AccessibilityBridge.this.onTouchExplorationExit();
                }
                if (AccessibilityBridge.this.onAccessibilityChangeListener != null) {
                    AccessibilityBridge.this.onAccessibilityChangeListener.onAccessibilityChanged(accessibilityManager.isEnabled(), z);
                }
            }
        };
        this.touchExplorationStateChangeListener = touchExplorationStateChangeListener;
        touchExplorationStateChangeListener.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        this.accessibilityFeatureFlags |= AccessibilityFeature.NO_ANNOUNCE.value;
        contentObserver.onChange(false);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, contentObserver);
        if (Build.VERSION.SDK_INT >= 31) {
            setBoldTextFlag();
        }
        platformViewsAccessibilityDelegate.attachAccessibilityBridge(this);
    }

    public AccessibilityNodeInfo obtainAccessibilityNodeInfo(View view, int i4) {
        return AccessibilityNodeInfo.obtain(view, i4);
    }

    public boolean onAccessibilityHoverEvent(MotionEvent motionEvent, boolean z) {
        if (!this.accessibilityManager.isTouchExplorationEnabled() || this.flutterSemanticsTree.isEmpty()) {
            return false;
        }
        SemanticsNode hitTest = getRootSemanticsNode().hitTest(new float[]{motionEvent.getX(), motionEvent.getY(), DISABLED_TRANSITION_ANIMATION_SCALE, DEFAULT_TRANSITION_ANIMATION_SCALE}, z);
        if (hitTest != null && hitTest.platformViewId != -1) {
            if (z) {
                return false;
            }
            return this.accessibilityViewEmbedder.onAccessibilityHoverEvent(hitTest.id, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            handleTouchExploration(motionEvent.getX(), motionEvent.getY(), z);
        } else {
            if (motionEvent.getAction() != 10) {
                Log.d(PluginErrorDetails.Platform.FLUTTER, "unexpected accessibility hover event: " + motionEvent);
                return false;
            }
            onTouchExplorationExit();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (this.accessibilityManager.isEnabled()) {
            this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(this.rootAccessibilityView, accessibilityEvent);
        }
    }

    public AccessibilityEvent obtainAccessibilityEvent(int i4) {
        return AccessibilityEvent.obtain(i4);
    }
}
