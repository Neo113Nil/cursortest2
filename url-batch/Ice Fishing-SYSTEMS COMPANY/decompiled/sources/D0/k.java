package D0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f624b;

    public /* synthetic */ k(int i, Object obj) {
        this.f623a = i;
        this.f624b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f623a) {
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f624b;
                actionBarOverlayLayout.f4661P = null;
                actionBarOverlayLayout.f4649C = false;
                break;
            case 5:
                s2.m mVar = (s2.m) this.f624b;
                mVar.setEnabled(true);
                mVar.f40486n.setEnabled(true);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f623a) {
            case 0:
                ((o) this.f624b).r();
                animator.removeListener(this);
                break;
            case 1:
                E0.f fVar = (E0.f) this.f624b;
                ArrayList arrayList = new ArrayList(fVar.f748x);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((q3.a) arrayList.get(i)).f40128b.f40141H;
                    if (colorStateList != null) {
                        H.a.h(fVar, colorStateList);
                    }
                }
                break;
            case 2:
                F3.m mVar = (F3.m) this.f624b;
                mVar.q();
                mVar.f1054r.start();
                break;
            case 3:
                ((HideBottomViewOnScrollBehavior) this.f624b).f35985h = null;
                break;
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f624b;
                actionBarOverlayLayout.f4661P = null;
                actionBarOverlayLayout.f4649C = false;
                break;
            default:
                s2.m mVar2 = (s2.m) this.f624b;
                mVar2.setEnabled(true);
                mVar2.f40486n.setEnabled(true);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f623a) {
            case 1:
                E0.f fVar = (E0.f) this.f624b;
                ArrayList arrayList = new ArrayList(fVar.f748x);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    q3.c cVar = ((q3.a) arrayList.get(i)).f40128b;
                    ColorStateList colorStateList = cVar.f40141H;
                    if (colorStateList != null) {
                        H.a.g(fVar, colorStateList.getColorForState(cVar.f40144L, colorStateList.getDefaultColor()));
                    }
                }
                break;
            case 5:
                s2.m mVar = (s2.m) this.f624b;
                mVar.setEnabled(false);
                mVar.f40486n.setEnabled(false);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public k(s2.m mVar) {
        this.f623a = 5;
        Objects.requireNonNull(mVar);
        this.f624b = mVar;
    }
}
