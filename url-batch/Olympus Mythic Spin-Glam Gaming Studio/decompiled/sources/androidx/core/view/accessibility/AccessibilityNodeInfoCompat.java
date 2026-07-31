package androidx.core.view.accessibility;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.ironsource.X3;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.lang.ref.WeakReference;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public class AccessibilityNodeInfoCompat {
    private static int sClickableSpanId;
    private final AccessibilityNodeInfo mInfo;
    public int mParentVirtualDescendantId = -1;
    private int mVirtualDescendantId = -1;

    public static final class TouchDelegateInfoCompat {
    }

    public void recycle() {
    }

    public static class AccessibilityActionCompat {
        public static final AccessibilityActionCompat ACTION_CONTEXT_CLICK;
        public static final AccessibilityActionCompat ACTION_DRAG_CANCEL;
        public static final AccessibilityActionCompat ACTION_DRAG_DROP;
        public static final AccessibilityActionCompat ACTION_DRAG_START;
        public static final AccessibilityActionCompat ACTION_HIDE_TOOLTIP;
        public static final AccessibilityActionCompat ACTION_IME_ENTER;
        public static final AccessibilityActionCompat ACTION_MOVE_WINDOW;
        public static final AccessibilityActionCompat ACTION_PAGE_DOWN;
        public static final AccessibilityActionCompat ACTION_PAGE_LEFT;
        public static final AccessibilityActionCompat ACTION_PAGE_RIGHT;
        public static final AccessibilityActionCompat ACTION_PAGE_UP;
        public static final AccessibilityActionCompat ACTION_PRESS_AND_HOLD;
        public static final AccessibilityActionCompat ACTION_SCROLL_DOWN;
        public static final AccessibilityActionCompat ACTION_SCROLL_IN_DIRECTION;
        public static final AccessibilityActionCompat ACTION_SCROLL_LEFT;
        public static final AccessibilityActionCompat ACTION_SCROLL_RIGHT;
        public static final AccessibilityActionCompat ACTION_SCROLL_TO_POSITION;
        public static final AccessibilityActionCompat ACTION_SCROLL_UP;
        public static final AccessibilityActionCompat ACTION_SET_PROGRESS;
        public static final AccessibilityActionCompat ACTION_SHOW_ON_SCREEN;
        public static final AccessibilityActionCompat ACTION_SHOW_TEXT_SUGGESTIONS;
        public static final AccessibilityActionCompat ACTION_SHOW_TOOLTIP;
        final Object mAction;
        protected final AccessibilityViewCommand mCommand;
        private final int mId;
        private final Class mViewCommandArgumentClass;
        public static final AccessibilityActionCompat ACTION_FOCUS = new AccessibilityActionCompat(1, null);
        public static final AccessibilityActionCompat ACTION_CLEAR_FOCUS = new AccessibilityActionCompat(2, null);
        public static final AccessibilityActionCompat ACTION_SELECT = new AccessibilityActionCompat(4, null);
        public static final AccessibilityActionCompat ACTION_CLEAR_SELECTION = new AccessibilityActionCompat(8, null);
        public static final AccessibilityActionCompat ACTION_CLICK = new AccessibilityActionCompat(16, null);
        public static final AccessibilityActionCompat ACTION_LONG_CLICK = new AccessibilityActionCompat(32, null);
        public static final AccessibilityActionCompat ACTION_ACCESSIBILITY_FOCUS = new AccessibilityActionCompat(64, null);
        public static final AccessibilityActionCompat ACTION_CLEAR_ACCESSIBILITY_FOCUS = new AccessibilityActionCompat(128, null);
        public static final AccessibilityActionCompat ACTION_NEXT_AT_MOVEMENT_GRANULARITY = new AccessibilityActionCompat(256, (CharSequence) null, AccessibilityViewCommand.MoveAtGranularityArguments.class);
        public static final AccessibilityActionCompat ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = new AccessibilityActionCompat(512, (CharSequence) null, AccessibilityViewCommand.MoveAtGranularityArguments.class);
        public static final AccessibilityActionCompat ACTION_NEXT_HTML_ELEMENT = new AccessibilityActionCompat(1024, (CharSequence) null, AccessibilityViewCommand.MoveHtmlArguments.class);
        public static final AccessibilityActionCompat ACTION_PREVIOUS_HTML_ELEMENT = new AccessibilityActionCompat(2048, (CharSequence) null, AccessibilityViewCommand.MoveHtmlArguments.class);
        public static final AccessibilityActionCompat ACTION_SCROLL_FORWARD = new AccessibilityActionCompat(4096, null);
        public static final AccessibilityActionCompat ACTION_SCROLL_BACKWARD = new AccessibilityActionCompat(8192, null);
        public static final AccessibilityActionCompat ACTION_COPY = new AccessibilityActionCompat(16384, null);
        public static final AccessibilityActionCompat ACTION_PASTE = new AccessibilityActionCompat(32768, null);
        public static final AccessibilityActionCompat ACTION_CUT = new AccessibilityActionCompat(65536, null);
        public static final AccessibilityActionCompat ACTION_SET_SELECTION = new AccessibilityActionCompat(131072, (CharSequence) null, AccessibilityViewCommand.SetSelectionArguments.class);
        public static final AccessibilityActionCompat ACTION_EXPAND = new AccessibilityActionCompat(262144, null);
        public static final AccessibilityActionCompat ACTION_COLLAPSE = new AccessibilityActionCompat(524288, null);
        public static final AccessibilityActionCompat ACTION_DISMISS = new AccessibilityActionCompat(1048576, null);
        public static final AccessibilityActionCompat ACTION_SET_TEXT = new AccessibilityActionCompat(2097152, (CharSequence) null, AccessibilityViewCommand.SetTextArguments.class);

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction25;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction26;
            int i = Build.VERSION.SDK_INT;
            ACTION_SHOW_ON_SCREEN = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            ACTION_SCROLL_TO_POSITION = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AccessibilityViewCommand.ScrollToPositionArguments.class);
            ACTION_SCROLL_UP = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            ACTION_SCROLL_LEFT = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            ACTION_SCROLL_DOWN = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            ACTION_SCROLL_RIGHT = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            if (i >= 29) {
                accessibilityAction26 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
                accessibilityAction = accessibilityAction26;
            } else {
                accessibilityAction = null;
            }
            ACTION_PAGE_UP = new AccessibilityActionCompat(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
            if (i >= 29) {
                accessibilityAction25 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction2 = accessibilityAction25;
            } else {
                accessibilityAction2 = null;
            }
            ACTION_PAGE_DOWN = new AccessibilityActionCompat(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
            if (i >= 29) {
                accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction3 = accessibilityAction24;
            } else {
                accessibilityAction3 = null;
            }
            ACTION_PAGE_LEFT = new AccessibilityActionCompat(accessibilityAction3, R.id.accessibilityActionPageLeft, null, null, null);
            if (i >= 29) {
                accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction4 = accessibilityAction23;
            } else {
                accessibilityAction4 = null;
            }
            ACTION_PAGE_RIGHT = new AccessibilityActionCompat(accessibilityAction4, R.id.accessibilityActionPageRight, null, null, null);
            ACTION_CONTEXT_CLICK = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            ACTION_SET_PROGRESS = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, AccessibilityViewCommand.SetProgressArguments.class);
            if (i >= 26) {
                accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
                accessibilityAction5 = accessibilityAction22;
            } else {
                accessibilityAction5 = null;
            }
            ACTION_MOVE_WINDOW = new AccessibilityActionCompat(accessibilityAction5, R.id.accessibilityActionMoveWindow, null, null, AccessibilityViewCommand.MoveWindowArguments.class);
            if (i >= 28) {
                accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction6 = accessibilityAction21;
            } else {
                accessibilityAction6 = null;
            }
            ACTION_SHOW_TOOLTIP = new AccessibilityActionCompat(accessibilityAction6, R.id.accessibilityActionShowTooltip, null, null, null);
            if (i >= 28) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction7 = accessibilityAction20;
            } else {
                accessibilityAction7 = null;
            }
            ACTION_HIDE_TOOLTIP = new AccessibilityActionCompat(accessibilityAction7, R.id.accessibilityActionHideTooltip, null, null, null);
            if (i >= 30) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction8 = accessibilityAction19;
            } else {
                accessibilityAction8 = null;
            }
            ACTION_PRESS_AND_HOLD = new AccessibilityActionCompat(accessibilityAction8, R.id.accessibilityActionPressAndHold, null, null, null);
            if (i >= 30) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction9 = accessibilityAction18;
            } else {
                accessibilityAction9 = null;
            }
            ACTION_IME_ENTER = new AccessibilityActionCompat(accessibilityAction9, R.id.accessibilityActionImeEnter, null, null, null);
            if (i >= 32) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
                accessibilityAction10 = accessibilityAction17;
            } else {
                accessibilityAction10 = null;
            }
            ACTION_DRAG_START = new AccessibilityActionCompat(accessibilityAction10, R.id.accessibilityActionDragStart, null, null, null);
            if (i >= 32) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
                accessibilityAction11 = accessibilityAction16;
            } else {
                accessibilityAction11 = null;
            }
            ACTION_DRAG_DROP = new AccessibilityActionCompat(accessibilityAction11, R.id.accessibilityActionDragDrop, null, null, null);
            if (i >= 32) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
                accessibilityAction12 = accessibilityAction15;
            } else {
                accessibilityAction12 = null;
            }
            ACTION_DRAG_CANCEL = new AccessibilityActionCompat(accessibilityAction12, R.id.accessibilityActionDragCancel, null, null, null);
            if (i >= 33) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
                accessibilityAction13 = accessibilityAction14;
            } else {
                accessibilityAction13 = null;
            }
            ACTION_SHOW_TEXT_SUGGESTIONS = new AccessibilityActionCompat(accessibilityAction13, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            ACTION_SCROLL_IN_DIRECTION = new AccessibilityActionCompat(i >= 34 ? Api34Impl.getActionScrollInDirection() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public AccessibilityActionCompat(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        public AccessibilityActionCompat(int i, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
            this(null, i, charSequence, accessibilityViewCommand, null);
        }

        AccessibilityActionCompat(Object obj) {
            this(obj, 0, null, null, null);
        }

        private AccessibilityActionCompat(int i, CharSequence charSequence, Class cls) {
            this(null, i, charSequence, null, cls);
        }

        AccessibilityActionCompat(Object obj, int i, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand, Class cls) {
            this.mId = i;
            this.mCommand = accessibilityViewCommand;
            if (obj == null) {
                this.mAction = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            } else {
                this.mAction = obj;
            }
            this.mViewCommandArgumentClass = cls;
        }

        public int getId() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.mAction).getId();
        }

        public CharSequence getLabel() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.mAction).getLabel();
        }

        public boolean perform(View view, Bundle bundle) {
            AccessibilityViewCommand.CommandArguments commandArguments;
            if (this.mCommand == null) {
                return false;
            }
            Class cls = this.mViewCommandArgumentClass;
            AccessibilityViewCommand.CommandArguments commandArguments2 = null;
            if (cls != null) {
                try {
                    commandArguments = (AccessibilityViewCommand.CommandArguments) cls.getDeclaredConstructor(null).newInstance(null);
                } catch (Exception e) {
                    e = e;
                }
                try {
                    commandArguments.setBundle(bundle);
                    commandArguments2 = commandArguments;
                } catch (Exception e2) {
                    e = e2;
                    commandArguments2 = commandArguments;
                    Class cls2 = this.mViewCommandArgumentClass;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? POBCommonConstants.NULL_VALUE : cls2.getName()), e);
                    return this.mCommand.perform(view, commandArguments2);
                }
            }
            return this.mCommand.perform(view, commandArguments2);
        }

        public AccessibilityActionCompat createReplacementAction(CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
            return new AccessibilityActionCompat(null, this.mId, charSequence, accessibilityViewCommand, this.mViewCommandArgumentClass);
        }

        public int hashCode() {
            Object obj = this.mAction;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof AccessibilityActionCompat)) {
                return false;
            }
            AccessibilityActionCompat accessibilityActionCompat = (AccessibilityActionCompat) obj;
            Object obj2 = this.mAction;
            return obj2 == null ? accessibilityActionCompat.mAction == null : obj2.equals(accessibilityActionCompat.mAction);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String actionSymbolicName = AccessibilityNodeInfoCompat.getActionSymbolicName(this.mId);
            if (actionSymbolicName.equals("ACTION_UNKNOWN") && getLabel() != null) {
                actionSymbolicName = getLabel().toString();
            }
            sb.append(actionSymbolicName);
            return sb.toString();
        }
    }

    public static class CollectionInfoCompat {
        final Object mInfo;

        public static CollectionInfoCompat obtain(int i, int i2, boolean z, int i3) {
            return new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }

        CollectionInfoCompat(Object obj) {
            this.mInfo = obj;
        }
    }

    public static class CollectionItemInfoCompat {
        final Object mInfo;

        public static final class Builder {
        }

        public static CollectionItemInfoCompat obtain(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }

        CollectionItemInfoCompat(Object obj) {
            this.mInfo = obj;
        }
    }

    public static class RangeInfoCompat {
        final Object mInfo;

        public static RangeInfoCompat obtain(int i, float f, float f2, float f3) {
            return new RangeInfoCompat(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
        }

        RangeInfoCompat(Object obj) {
            this.mInfo = obj;
        }
    }

    static AccessibilityNodeInfoCompat wrapNonNullInstance(Object obj) {
        if (obj != null) {
            return new AccessibilityNodeInfoCompat(obj);
        }
        return null;
    }

    public AccessibilityNodeInfoCompat(Object obj) {
        this.mInfo = (AccessibilityNodeInfo) obj;
    }

    private AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.mInfo = accessibilityNodeInfo;
    }

    public static AccessibilityNodeInfoCompat wrap(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
    }

    public AccessibilityNodeInfo unwrap() {
        return this.mInfo;
    }

    public static AccessibilityNodeInfoCompat obtain(View view) {
        return wrap(AccessibilityNodeInfo.obtain(view));
    }

    public static AccessibilityNodeInfoCompat obtain() {
        return wrap(AccessibilityNodeInfo.obtain());
    }

    public static AccessibilityNodeInfoCompat obtain(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        return wrap(AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat.mInfo));
    }

    public void setSource(View view) {
        this.mVirtualDescendantId = -1;
        this.mInfo.setSource(view);
    }

    public void setSource(View view, int i) {
        this.mVirtualDescendantId = i;
        this.mInfo.setSource(view, i);
    }

    public int getChildCount() {
        return this.mInfo.getChildCount();
    }

    public void addChild(View view) {
        this.mInfo.addChild(view);
    }

    public void addChild(View view, int i) {
        this.mInfo.addChild(view, i);
    }

    public int getActions() {
        return this.mInfo.getActions();
    }

    public void addAction(int i) {
        this.mInfo.addAction(i);
    }

    private List extrasIntList(String str) {
        ArrayList<Integer> integerArrayList = this.mInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.mInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public void addAction(AccessibilityActionCompat accessibilityActionCompat) {
        this.mInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.mAction);
    }

    public boolean removeAction(AccessibilityActionCompat accessibilityActionCompat) {
        return this.mInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.mAction);
    }

    public boolean performAction(int i, Bundle bundle) {
        return this.mInfo.performAction(i, bundle);
    }

    public void setMovementGranularities(int i) {
        this.mInfo.setMovementGranularities(i);
    }

    public int getMovementGranularities() {
        return this.mInfo.getMovementGranularities();
    }

    public void setParent(View view) {
        this.mParentVirtualDescendantId = -1;
        this.mInfo.setParent(view);
    }

    public void setParent(View view, int i) {
        this.mParentVirtualDescendantId = i;
        this.mInfo.setParent(view, i);
    }

    public void getBoundsInParent(Rect rect) {
        this.mInfo.getBoundsInParent(rect);
    }

    public void setBoundsInParent(Rect rect) {
        this.mInfo.setBoundsInParent(rect);
    }

    public void getBoundsInScreen(Rect rect) {
        this.mInfo.getBoundsInScreen(rect);
    }

    public void setBoundsInScreen(Rect rect) {
        this.mInfo.setBoundsInScreen(rect);
    }

    public void getBoundsInWindow(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.getBoundsInWindow(this.mInfo, rect);
            return;
        }
        Rect rect2 = (Rect) this.mInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public boolean isCheckable() {
        return this.mInfo.isCheckable();
    }

    public void setCheckable(boolean z) {
        this.mInfo.setCheckable(z);
    }

    public boolean isChecked() {
        return this.mInfo.isChecked();
    }

    public void setChecked(boolean z) {
        this.mInfo.setChecked(z);
    }

    public boolean isFocusable() {
        return this.mInfo.isFocusable();
    }

    public void setFocusable(boolean z) {
        this.mInfo.setFocusable(z);
    }

    public boolean isFocused() {
        return this.mInfo.isFocused();
    }

    public void setFocused(boolean z) {
        this.mInfo.setFocused(z);
    }

    public boolean isVisibleToUser() {
        return this.mInfo.isVisibleToUser();
    }

    public void setVisibleToUser(boolean z) {
        this.mInfo.setVisibleToUser(z);
    }

    public boolean isAccessibilityFocused() {
        return this.mInfo.isAccessibilityFocused();
    }

    public void setAccessibilityFocused(boolean z) {
        this.mInfo.setAccessibilityFocused(z);
    }

    public boolean isSelected() {
        return this.mInfo.isSelected();
    }

    public void setSelected(boolean z) {
        this.mInfo.setSelected(z);
    }

    public boolean isClickable() {
        return this.mInfo.isClickable();
    }

    public void setClickable(boolean z) {
        this.mInfo.setClickable(z);
    }

    public boolean isLongClickable() {
        return this.mInfo.isLongClickable();
    }

    public void setLongClickable(boolean z) {
        this.mInfo.setLongClickable(z);
    }

    public boolean isEnabled() {
        return this.mInfo.isEnabled();
    }

    public void setEnabled(boolean z) {
        this.mInfo.setEnabled(z);
    }

    public boolean isPassword() {
        return this.mInfo.isPassword();
    }

    public void setPassword(boolean z) {
        this.mInfo.setPassword(z);
    }

    public boolean isScrollable() {
        return this.mInfo.isScrollable();
    }

    public void setScrollable(boolean z) {
        this.mInfo.setScrollable(z);
    }

    public boolean isGranularScrollingSupported() {
        return getBooleanProperty(67108864);
    }

    public boolean isTextSelectable() {
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.isTextSelectable(this.mInfo);
        }
        return getBooleanProperty(8388608);
    }

    public boolean isImportantForAccessibility() {
        return this.mInfo.isImportantForAccessibility();
    }

    public void setImportantForAccessibility(boolean z) {
        this.mInfo.setImportantForAccessibility(z);
    }

    public boolean isAccessibilityDataSensitive() {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.isAccessibilityDataSensitive(this.mInfo);
        }
        return getBooleanProperty(64);
    }

    public CharSequence getPackageName() {
        return this.mInfo.getPackageName();
    }

    public void setPackageName(CharSequence charSequence) {
        this.mInfo.setPackageName(charSequence);
    }

    public CharSequence getClassName() {
        return this.mInfo.getClassName();
    }

    public void setClassName(CharSequence charSequence) {
        this.mInfo.setClassName(charSequence);
    }

    public CharSequence getText() {
        if (hasSpans()) {
            List extrasIntList = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List extrasIntList2 = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List extrasIntList3 = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List extrasIntList4 = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.mInfo.getText(), 0, this.mInfo.getText().length()));
            for (int i = 0; i < extrasIntList.size(); i++) {
                spannableString.setSpan(new AccessibilityClickableSpanCompat(((Integer) extrasIntList4.get(i)).intValue(), this, getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) extrasIntList.get(i)).intValue(), ((Integer) extrasIntList2.get(i)).intValue(), ((Integer) extrasIntList3.get(i)).intValue());
            }
            return spannableString;
        }
        return this.mInfo.getText();
    }

    public void setText(CharSequence charSequence) {
        this.mInfo.setText(charSequence);
    }

    public void addSpansToExtras(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            clearExtrasSpans();
            removeCollectedSpans(view);
            ClickableSpan[] clickableSpans = getClickableSpans(charSequence);
            if (clickableSpans == null || clickableSpans.length <= 0) {
                return;
            }
            getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", androidx.core.R.id.accessibility_action_clickable_span);
            SparseArray orCreateSpansFromViewTags = getOrCreateSpansFromViewTags(view);
            for (int i = 0; i < clickableSpans.length; i++) {
                int idForClickableSpan = idForClickableSpan(clickableSpans[i], orCreateSpansFromViewTags);
                orCreateSpansFromViewTags.put(idForClickableSpan, new WeakReference(clickableSpans[i]));
                addSpanLocationToExtras(clickableSpans[i], (Spanned) charSequence, idForClickableSpan);
            }
        }
    }

    private SparseArray getOrCreateSpansFromViewTags(View view) {
        SparseArray spansFromViewTags = getSpansFromViewTags(view);
        if (spansFromViewTags != null) {
            return spansFromViewTags;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(androidx.core.R.id.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    private SparseArray getSpansFromViewTags(View view) {
        return (SparseArray) view.getTag(androidx.core.R.id.tag_accessibility_clickable_spans);
    }

    public static ClickableSpan[] getClickableSpans(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private int idForClickableSpan(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i)).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = sClickableSpanId;
        sClickableSpanId = i2 + 1;
        return i2;
    }

    private boolean hasSpans() {
        return !extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private void clearExtrasSpans() {
        this.mInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.mInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.mInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.mInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private void addSpanLocationToExtras(ClickableSpan clickableSpan, Spanned spanned, int i) {
        extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    private void removeCollectedSpans(View view) {
        SparseArray spansFromViewTags = getSpansFromViewTags(view);
        if (spansFromViewTags != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < spansFromViewTags.size(); i++) {
                if (((WeakReference) spansFromViewTags.valueAt(i)).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                spansFromViewTags.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    public CharSequence getContentDescription() {
        return this.mInfo.getContentDescription();
    }

    public CharSequence getStateDescription() {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getStateDescription(this.mInfo);
        }
        return this.mInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void setContentDescription(CharSequence charSequence) {
        this.mInfo.setContentDescription(charSequence);
    }

    public void setStateDescription(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setStateDescription(this.mInfo, charSequence);
        } else {
            this.mInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public String getUniqueId() {
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.getUniqueId(this.mInfo);
        }
        return this.mInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public CharSequence getContainerTitle() {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getContainerTitle(this.mInfo);
        }
        return this.mInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void setViewIdResourceName(String str) {
        this.mInfo.setViewIdResourceName(str);
    }

    public String getViewIdResourceName() {
        return this.mInfo.getViewIdResourceName();
    }

    public void setLiveRegion(int i) {
        this.mInfo.setLiveRegion(i);
    }

    public void setCollectionInfo(Object obj) {
        this.mInfo.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((CollectionInfoCompat) obj).mInfo);
    }

    public void setCollectionItemInfo(Object obj) {
        this.mInfo.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((CollectionItemInfoCompat) obj).mInfo);
    }

    public void setRangeInfo(RangeInfoCompat rangeInfoCompat) {
        this.mInfo.setRangeInfo((AccessibilityNodeInfo.RangeInfo) rangeInfoCompat.mInfo);
    }

    public List getActionList() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.mInfo.getActionList();
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new AccessibilityActionCompat(actionList.get(i)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public void setContentInvalid(boolean z) {
        this.mInfo.setContentInvalid(z);
    }

    public boolean isContextClickable() {
        return this.mInfo.isContextClickable();
    }

    public void setHintText(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mInfo.setHintText(charSequence);
        } else {
            this.mInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void setError(CharSequence charSequence) {
        this.mInfo.setError(charSequence);
    }

    public CharSequence getError() {
        return this.mInfo.getError();
    }

    public void setLabelFor(View view) {
        this.mInfo.setLabelFor(view);
    }

    public void setCanOpenPopup(boolean z) {
        this.mInfo.setCanOpenPopup(z);
    }

    public Bundle getExtras() {
        return this.mInfo.getExtras();
    }

    public void setMaxTextLength(int i) {
        this.mInfo.setMaxTextLength(i);
    }

    public int getMaxTextLength() {
        return this.mInfo.getMaxTextLength();
    }

    public void setTextSelection(int i, int i2) {
        this.mInfo.setTextSelection(i, i2);
    }

    public void setTraversalAfter(View view) {
        this.mInfo.setTraversalAfter(view);
    }

    public void setEditable(boolean z) {
        this.mInfo.setEditable(z);
    }

    public CharSequence getTooltipText() {
        CharSequence tooltipText;
        if (Build.VERSION.SDK_INT >= 28) {
            tooltipText = this.mInfo.getTooltipText();
            return tooltipText;
        }
        return this.mInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void setPaneTitle(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.mInfo.setPaneTitle(charSequence);
        } else {
            this.mInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void setScreenReaderFocusable(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.mInfo.setScreenReaderFocusable(z);
        } else {
            setBooleanProperty(1, z);
        }
    }

    public boolean isShowingHintText() {
        boolean isShowingHintText;
        if (Build.VERSION.SDK_INT >= 26) {
            isShowingHintText = this.mInfo.isShowingHintText();
            return isShowingHintText;
        }
        return getBooleanProperty(4);
    }

    public void setShowingHintText(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mInfo.setShowingHintText(z);
        } else {
            setBooleanProperty(4, z);
        }
    }

    public void setHeading(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.mInfo.setHeading(z);
        } else {
            setBooleanProperty(2, z);
        }
    }

    public void setRoleDescription(CharSequence charSequence) {
        this.mInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityNodeInfoCompat)) {
            return false;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfoCompat.mInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfoCompat.mInfo)) {
            return false;
        }
        return this.mVirtualDescendantId == accessibilityNodeInfoCompat.mVirtualDescendantId && this.mParentVirtualDescendantId == accessibilityNodeInfoCompat.mParentVirtualDescendantId;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        getBoundsInWindow(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(getPackageName());
        sb.append("; className: ");
        sb.append(getClassName());
        sb.append("; text: ");
        sb.append(getText());
        sb.append("; error: ");
        sb.append(getError());
        sb.append("; maxTextLength: ");
        sb.append(getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(getStateDescription());
        sb.append("; contentDescription: ");
        sb.append(getContentDescription());
        sb.append("; tooltipText: ");
        sb.append(getTooltipText());
        sb.append("; viewIdResName: ");
        sb.append(getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(getUniqueId());
        sb.append("; checkable: ");
        sb.append(isCheckable());
        sb.append("; checked: ");
        sb.append(isChecked());
        sb.append("; focusable: ");
        sb.append(isFocusable());
        sb.append("; focused: ");
        sb.append(isFocused());
        sb.append("; selected: ");
        sb.append(isSelected());
        sb.append("; clickable: ");
        sb.append(isClickable());
        sb.append("; longClickable: ");
        sb.append(isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(isContextClickable());
        sb.append("; enabled: ");
        sb.append(isEnabled());
        sb.append("; password: ");
        sb.append(isPassword());
        sb.append("; scrollable: " + isScrollable());
        sb.append("; containerTitle: ");
        sb.append(getContainerTitle());
        sb.append("; granularScrollingSupported: ");
        sb.append(isGranularScrollingSupported());
        sb.append("; importantForAccessibility: ");
        sb.append(isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(isTextSelectable());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(isAccessibilityDataSensitive());
        sb.append("; [");
        List actionList = getActionList();
        for (int i = 0; i < actionList.size(); i++) {
            AccessibilityActionCompat accessibilityActionCompat = (AccessibilityActionCompat) actionList.get(i);
            String actionSymbolicName = getActionSymbolicName(accessibilityActionCompat.getId());
            if (actionSymbolicName.equals("ACTION_UNKNOWN") && accessibilityActionCompat.getLabel() != null) {
                actionSymbolicName = accessibilityActionCompat.getLabel().toString();
            }
            sb.append(actionSymbolicName);
            if (i != actionList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(X3.j.e);
        return sb.toString();
    }

    private void setBooleanProperty(int i, boolean z) {
        Bundle extras = getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    private boolean getBooleanProperty(int i) {
        Bundle extras = getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    static String getActionSymbolicName(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    @RequiresApi
    private static class Api21Impl {
        @DoNotInline
        public static CollectionItemInfoCompat createCollectionItemInfo(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    @RequiresApi
    private static class Api30Impl {
        @DoNotInline
        public static void setStateDescription(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }

        @DoNotInline
        public static CharSequence getStateDescription(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        @DoNotInline
        public static Object createRangeInfo(int i, float f, float f2, float f3) {
            return new AccessibilityNodeInfo.RangeInfo(i, f, f2, f3);
        }
    }

    @RequiresApi
    private static class Api33Impl {
        @DoNotInline
        public static AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        @DoNotInline
        public static boolean isTextSelectable(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        @DoNotInline
        public static void setTextSelectable(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setTextSelectable(z);
        }

        @DoNotInline
        public static CollectionItemInfoCompat buildCollectionItemInfoCompat(boolean z, int i, int i2, int i3, int i4, boolean z2, String str, String str2) {
            return new CollectionItemInfoCompat(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(z2).setRowTitle(str).setColumnTitle(str2).build());
        }

        @DoNotInline
        public static AccessibilityNodeInfoCompat getChild(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
            return AccessibilityNodeInfoCompat.wrapNonNullInstance(accessibilityNodeInfo.getChild(i, i2));
        }

        @DoNotInline
        public static AccessibilityNodeInfoCompat getParent(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
            return AccessibilityNodeInfoCompat.wrapNonNullInstance(accessibilityNodeInfo.getParent(i));
        }

        @DoNotInline
        public static String getUniqueId(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        @DoNotInline
        public static void setUniqueId(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }

        @DoNotInline
        public static String getCollectionItemRowTitle(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        @DoNotInline
        public static String getCollectionItemColumnTitle(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }
    }

    @RequiresApi
    private static class Api34Impl {
        @DoNotInline
        public static boolean isAccessibilityDataSensitive(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        @DoNotInline
        public static void setAccessibilityDataSensitive(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z);
        }

        @DoNotInline
        public static CharSequence getContainerTitle(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        @DoNotInline
        public static void setContainerTitle(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        @DoNotInline
        public static void getBoundsInWindow(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        @DoNotInline
        public static void setBoundsInWindow(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        @DoNotInline
        public static boolean hasRequestInitialAccessibilityFocus(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        @DoNotInline
        public static void setRequestInitialAccessibilityFocus(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z);
        }

        @DoNotInline
        public static long getMinDurationBetweenContentChangeMillis(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        @DoNotInline
        public static void setMinDurationBetweenContentChangeMillis(AccessibilityNodeInfo accessibilityNodeInfo, long j) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j));
        }

        @DoNotInline
        public static void setQueryFromAppProcessEnabled(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z);
        }

        @DoNotInline
        public static AccessibilityNodeInfo.AccessibilityAction getActionScrollInDirection() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }
    }
}
