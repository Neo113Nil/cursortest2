package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ffw extends AnimatorListenerAdapter {
    final /* synthetic */ BottomSheetBehavior a;

    public ffw(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        bottomSheetBehavior.S(5);
        WeakReference weakReference = bottomSheetBehavior.B;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((View) bottomSheetBehavior.B.get()).requestLayout();
    }
}
