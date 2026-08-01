package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class co extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public co(ko koVar) {
        this.a = 1;
        this.c = koVar;
        this.b = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.b = true;
                break;
            case 2:
                this.b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (!this.b) {
                    ((View) obj).setVisibility(4);
                    break;
                }
                break;
            case 1:
                ko koVar = (ko) obj;
                if (!this.b) {
                    if (((Float) koVar.z.getAnimatedValue()).floatValue() != 0.0f) {
                        koVar.A = 2;
                        koVar.s.invalidate();
                        break;
                    } else {
                        koVar.A = 0;
                        koVar.j(0);
                        break;
                    }
                } else {
                    this.b = false;
                    break;
                }
            default:
                so soVar = (so) obj;
                soVar.r = 0;
                soVar.m = null;
                if (!this.b) {
                    soVar.s.a(4, false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (this.b) {
                    ((View) obj).setVisibility(0);
                    break;
                }
                break;
            case 1:
            default:
                super.onAnimationStart(animator);
                break;
            case 2:
                so soVar = (so) obj;
                soVar.s.a(0, false);
                soVar.r = 1;
                soVar.m = animator;
                this.b = false;
                break;
        }
    }

    public co(so soVar) {
        this.a = 2;
        this.c = soVar;
    }

    public co(View view, boolean z) {
        this.a = 0;
        this.b = z;
        this.c = view;
    }
}
