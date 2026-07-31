package androidx.compose.ui.window;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Outline;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.os.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidDialog.android.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001e\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010!J\u000f\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010!R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001d\u00100\u001a\u00020/8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b0\u00101\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Landroidx/compose/ui/window/DialogWrapper;", "Landroid/app/Dialog;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/window/DialogProperties;", "properties", "Landroid/view/View;", "composeView", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "Ljava/util/UUID;", "dialogId", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/DialogProperties;Landroid/view/View;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Ljava/util/UUID;)V", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "setSecurePolicy", "(Landroidx/compose/ui/window/SecureFlagPolicy;)V", "Landroidx/compose/runtime/CompositionContext;", "parentComposition", "Landroidx/compose/runtime/Composable;", "children", "setContent", "(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "updateParameters", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/DialogProperties;Landroidx/compose/ui/unit/LayoutDirection;)V", "disposeComposition", "()V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "cancel", "onBackPressed", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/ui/window/DialogProperties;", "Landroid/view/View;", "Landroidx/compose/ui/window/DialogLayout;", "dialogLayout", "Landroidx/compose/ui/window/DialogLayout;", "Landroidx/compose/ui/unit/Dp;", "maxSupportedElevation", "F", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class DialogWrapper extends Dialog implements ViewRootForInspector {
    private final View composeView;
    private final DialogLayout dialogLayout;
    private final float maxSupportedElevation;
    private Function0 onDismissRequest;
    private DialogProperties properties;

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogWrapper(Function0 onDismissRequest, DialogProperties properties, View composeView, LayoutDirection layoutDirection, Density density, UUID dialogId) {
        super(new ContextThemeWrapper(composeView.getContext(), R.style.DialogWindowTheme));
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        this.onDismissRequest = onDismissRequest;
        this.properties = properties;
        this.composeView = composeView;
        float m2507constructorimpl = Dp.m2507constructorimpl(30);
        this.maxSupportedElevation = m2507constructorimpl;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        DialogLayout dialogLayout = new DialogLayout(context, window);
        dialogLayout.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + dialogId);
        dialogLayout.setClipChildren(false);
        dialogLayout.setElevation(density.mo271toPx0680j_4(m2507constructorimpl));
        dialogLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.ui.window.DialogWrapper$1$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline result) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(result, "result");
                result.setRect(0, 0, view.getWidth(), view.getHeight());
                result.setAlpha(0.0f);
            }
        });
        this.dialogLayout = dialogLayout;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            _init_$disableClipping(viewGroup);
        }
        setContentView(dialogLayout);
        ViewTreeLifecycleOwner.set(dialogLayout, ViewTreeLifecycleOwner.get(composeView));
        ViewTreeViewModelStoreOwner.set(dialogLayout, ViewTreeViewModelStoreOwner.get(composeView));
        ViewTreeSavedStateRegistryOwner.set(dialogLayout, ViewTreeSavedStateRegistryOwner.get(composeView));
        updateParameters(this.onDismissRequest, this.properties, layoutDirection);
    }

    private static final void _init_$disableClipping(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof DialogLayout) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                _init_$disableClipping(viewGroup2);
            }
        }
    }

    private final void setLayoutDirection(LayoutDirection layoutDirection) {
        DialogLayout dialogLayout = this.dialogLayout;
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        dialogLayout.setLayoutDirection(i2);
    }

    public final void setContent(CompositionContext parentComposition, Function2 children) {
        Intrinsics.checkNotNullParameter(parentComposition, "parentComposition");
        Intrinsics.checkNotNullParameter(children, "children");
        this.dialogLayout.setContent(parentComposition, children);
    }

    private final void setSecurePolicy(SecureFlagPolicy securePolicy) {
        boolean shouldApplySecureFlag = SecureFlagPolicy_androidKt.shouldApplySecureFlag(securePolicy, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        window.setFlags(shouldApplySecureFlag ? 8192 : -8193, 8192);
    }

    public final void updateParameters(Function0 onDismissRequest, DialogProperties properties, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.onDismissRequest = onDismissRequest;
        this.properties = properties;
        setSecurePolicy(properties.getSecurePolicy());
        setLayoutDirection(layoutDirection);
        this.dialogLayout.setUsePlatformDefaultWidth(properties.getUsePlatformDefaultWidth());
    }

    public final void disposeComposition() {
        this.dialogLayout.disposeComposition();
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean onTouchEvent = super.onTouchEvent(event);
        if (onTouchEvent && this.properties.getDismissOnClickOutside()) {
            this.onDismissRequest.mo4828invoke();
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        if (this.properties.getDismissOnBackPress()) {
            this.onDismissRequest.mo4828invoke();
        }
    }
}
