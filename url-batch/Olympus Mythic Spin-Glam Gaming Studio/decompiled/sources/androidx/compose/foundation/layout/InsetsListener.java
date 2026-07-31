package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WindowInsets.android.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\rJ\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010-\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00063"}, d2 = {"Landroidx/compose/foundation/layout/InsetsListener;", "Landroidx/core/view/WindowInsetsAnimationCompat$Callback;", "Ljava/lang/Runnable;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "composeInsets", "<init>", "(Landroidx/compose/foundation/layout/WindowInsetsHolder;)V", "Landroidx/core/view/WindowInsetsAnimationCompat;", "animation", "", "onPrepare", "(Landroidx/core/view/WindowInsetsAnimationCompat;)V", "Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;", "bounds", "onStart", "(Landroidx/core/view/WindowInsetsAnimationCompat;Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;)Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;", "Landroidx/core/view/WindowInsetsCompat;", "insets", "", "runningAnimations", "onProgress", "(Landroidx/core/view/WindowInsetsCompat;Ljava/util/List;)Landroidx/core/view/WindowInsetsCompat;", "onEnd", "Landroid/view/View;", "view", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "run", "()V", "onViewAttachedToWindow", "(Landroid/view/View;)V", "v", "onViewDetachedFromWindow", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "getComposeInsets", "()Landroidx/compose/foundation/layout/WindowInsetsHolder;", "", "prepared", "Z", "getPrepared", "()Z", "setPrepared", "(Z)V", "savedInsets", "Landroidx/core/view/WindowInsetsCompat;", "getSavedInsets", "()Landroidx/core/view/WindowInsetsCompat;", "setSavedInsets", "(Landroidx/core/view/WindowInsetsCompat;)V", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
final class InsetsListener extends WindowInsetsAnimationCompat.Callback implements Runnable, OnApplyWindowInsetsListener, View.OnAttachStateChangeListener {
    private final WindowInsetsHolder composeInsets;
    private boolean prepared;
    private WindowInsetsCompat savedInsets;

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsetsListener(WindowInsetsHolder composeInsets) {
        super(!composeInsets.getConsumes() ? 1 : 0);
        Intrinsics.checkNotNullParameter(composeInsets, "composeInsets");
        this.composeInsets = composeInsets;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onPrepare(WindowInsetsAnimationCompat animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.prepared = true;
        super.onPrepare(animation);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat animation, WindowInsetsAnimationCompat.BoundsCompat bounds) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.prepared = false;
        WindowInsetsAnimationCompat.BoundsCompat onStart = super.onStart(animation, bounds);
        Intrinsics.checkNotNullExpressionValue(onStart, "super.onStart(animation, bounds)");
        return onStart;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public WindowInsetsCompat onProgress(WindowInsetsCompat insets, List runningAnimations) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
        WindowInsetsHolder.update$default(this.composeInsets, insets, 0, 2, null);
        if (!this.composeInsets.getConsumes()) {
            return insets;
        }
        WindowInsetsCompat CONSUMED = WindowInsetsCompat.CONSUMED;
        Intrinsics.checkNotNullExpressionValue(CONSUMED, "CONSUMED");
        return CONSUMED;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onEnd(WindowInsetsAnimationCompat animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.prepared = false;
        WindowInsetsCompat windowInsetsCompat = this.savedInsets;
        if (animation.getDurationMillis() != 0 && windowInsetsCompat != null) {
            this.composeInsets.update(windowInsetsCompat, animation.getTypeMask());
        }
        this.savedInsets = null;
        super.onEnd(animation);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (this.prepared) {
            this.savedInsets = insets;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
            return insets;
        }
        WindowInsetsHolder.update$default(this.composeInsets, insets, 0, 2, null);
        if (!this.composeInsets.getConsumes()) {
            return insets;
        }
        WindowInsetsCompat CONSUMED = WindowInsetsCompat.CONSUMED;
        Intrinsics.checkNotNullExpressionValue(CONSUMED, "CONSUMED");
        return CONSUMED;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prepared) {
            this.prepared = false;
            WindowInsetsCompat windowInsetsCompat = this.savedInsets;
            if (windowInsetsCompat != null) {
                WindowInsetsHolder.update$default(this.composeInsets, windowInsetsCompat, 0, 2, null);
                this.savedInsets = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.requestApplyInsets();
    }
}
