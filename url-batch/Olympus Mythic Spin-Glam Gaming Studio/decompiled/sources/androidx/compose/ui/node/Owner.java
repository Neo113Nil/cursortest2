package androidx.compose.ui.node;

import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: Owner.kt */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000 \u0081\u00012\u00020\u0001:\u0004\u0081\u0001\u0082\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0004H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u0004H&¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001f\u0010\fJ1\u0010&\u001a\u00020%2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00060 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060#H&¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H&¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b*\u0010\fJ\u001d\u0010,\u001a\u00020\u00062\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060#H&¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0006H&¢\u0006\u0004\b.\u0010)J\u0017\u00100\u001a\u00020\u00062\u0006\u0010+\u001a\u00020/H&¢\u0006\u0004\b0\u00101R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u001a\u0010N\u001a\u00020J8gX§\u0004¢\u0006\f\u0012\u0004\bM\u0010)\u001a\u0004\bK\u0010LR\u001c\u0010S\u001a\u0004\u0018\u00010O8gX§\u0004¢\u0006\f\u0012\u0004\bR\u0010)\u001a\u0004\bP\u0010QR\u0014\u0010W\u001a\u00020T8&X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8&X¦\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8&X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8&X¦\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u001a\u0010l\u001a\u00020h8&X§\u0004¢\u0006\f\u0012\u0004\bk\u0010)\u001a\u0004\bi\u0010jR\u0014\u0010p\u001a\u00020m8&X¦\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0014\u0010t\u001a\u00020q8&X¦\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR$\u0010x\u001a\u00020\u00042\u0006\u0010u\u001a\u00020\u00048&@gX¦\u000e¢\u0006\f\u001a\u0004\bv\u0010\u0017\"\u0004\bw\u0010\u001aR\u0014\u0010|\u001a\u00020y8&X¦\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0015\u0010\u0080\u0001\u001a\u00020}8&X¦\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007fø\u0001\u0002\u0082\u0002\u0011\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0083\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/Owner;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "forceRequest", "", "onRequestMeasure", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "onRequestRelayout", "node", "onAttach", "(Landroidx/compose/ui/node/LayoutNode;)V", "onDetach", "Landroidx/compose/ui/geometry/Offset;", "localPosition", "calculatePositionInWindow-MK-Hz9U", "(J)J", "calculatePositionInWindow", "positionInWindow", "calculateLocalPosition-MK-Hz9U", "calculateLocalPosition", "requestFocus", "()Z", "sendPointerUpdate", "measureAndLayout", "(Z)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "forceMeasureTheSubtree", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "Landroidx/compose/ui/node/OwnedLayer;", "createLayer", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/OwnedLayer;", "onSemanticsChange", "()V", "onLayoutChange", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerOnEndApplyChangesListener", "(Lkotlin/jvm/functions/Function0;)V", "onEndApplyChanges", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "registerOnLayoutCompletedListener", "(Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;)V", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getSharedDrawScope", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "sharedDrawScope", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/input/InputModeManager;", "getInputModeManager", "()Landroidx/compose/ui/input/InputModeManager;", "inputModeManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/ClipboardManager;", "clipboardManager", "Landroidx/compose/ui/platform/AccessibilityManager;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/AccessibilityManager;", "accessibilityManager", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree$annotations", "autofillTree", "Landroidx/compose/ui/autofill/Autofill;", "getAutofill", "()Landroidx/compose/ui/autofill/Autofill;", "getAutofill$annotations", "autofill", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "pointerIconService", "Landroidx/compose/ui/focus/FocusManager;", "getFocusManager", "()Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/platform/WindowInfo;", "getWindowInfo", "()Landroidx/compose/ui/platform/WindowInfo;", "windowInfo", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader$annotations", "fontLoader", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<set-?>", "getShowLayoutBounds", "setShowLayoutBounds", "showLayoutBounds", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "Companion", "OnLayoutCompletedListener", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface Owner {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: Owner.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "", "onLayoutComplete", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface OnLayoutCompletedListener {
        void onLayoutComplete();
    }

    /* renamed from: calculateLocalPosition-MK-Hz9U, reason: not valid java name */
    long mo2073calculateLocalPositionMKHz9U(long positionInWindow);

    /* renamed from: calculatePositionInWindow-MK-Hz9U, reason: not valid java name */
    long mo2074calculatePositionInWindowMKHz9U(long localPosition);

    OwnedLayer createLayer(Function1 drawBlock, Function0 invalidateParentLayer);

    void forceMeasureTheSubtree(LayoutNode layoutNode);

    AccessibilityManager getAccessibilityManager();

    Autofill getAutofill();

    AutofillTree getAutofillTree();

    ClipboardManager getClipboardManager();

    Density getDensity();

    FocusManager getFocusManager();

    FontFamily.Resolver getFontFamilyResolver();

    Font.ResourceLoader getFontLoader();

    HapticFeedback getHapticFeedBack();

    InputModeManager getInputModeManager();

    LayoutDirection getLayoutDirection();

    PointerIconService getPointerIconService();

    LayoutNodeDrawScope getSharedDrawScope();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    TextInputService getTextInputService();

    TextToolbar getTextToolbar();

    ViewConfiguration getViewConfiguration();

    WindowInfo getWindowInfo();

    void measureAndLayout(boolean sendPointerUpdate);

    /* renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    void mo2075measureAndLayout0kLqBqw(LayoutNode layoutNode, long constraints);

    void onAttach(LayoutNode node);

    void onDetach(LayoutNode node);

    void onEndApplyChanges();

    void onLayoutChange(LayoutNode layoutNode);

    void onRequestMeasure(LayoutNode layoutNode, boolean forceRequest);

    void onRequestRelayout(LayoutNode layoutNode, boolean forceRequest);

    void onSemanticsChange();

    void registerOnEndApplyChangesListener(Function0 listener);

    void registerOnLayoutCompletedListener(OnLayoutCompletedListener listener);

    boolean requestFocus();

    void setShowLayoutBounds(boolean z);

    static /* synthetic */ void measureAndLayout$default(Owner owner, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        owner.measureAndLayout(z);
    }

    /* compiled from: Owner.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/node/Owner$Companion;", "", "<init>", "()V", "", "enableExtraAssertions", "Z", "getEnableExtraAssertions", "()Z", "setEnableExtraAssertions", "(Z)V", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static boolean enableExtraAssertions;

        private Companion() {
        }

        public final boolean getEnableExtraAssertions() {
            return enableExtraAssertions;
        }
    }
}
