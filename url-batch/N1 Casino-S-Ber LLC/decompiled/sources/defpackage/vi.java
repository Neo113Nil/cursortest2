package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class vi extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public vi(cj cjVar) {
        this.a = 1;
        this.c = cjVar;
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
                cj cjVar = (cj) obj;
                if (!this.b) {
                    if (((Float) cjVar.z.getAnimatedValue()).floatValue() != 0.0f) {
                        cjVar.A = 2;
                        cjVar.s.invalidate();
                        break;
                    } else {
                        cjVar.A = 0;
                        cjVar.j(0);
                        break;
                    }
                } else {
                    this.b = false;
                    break;
                }
            default:
                jj jjVar = (jj) obj;
                jjVar.r = 0;
                jjVar.m = null;
                if (!this.b) {
                    jjVar.s.a(4, false);
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
                jj jjVar = (jj) obj;
                jjVar.s.a(0, false);
                jjVar.r = 1;
                jjVar.m = animator;
                this.b = false;
                break;
        }
    }

    public vi(jj jjVar) {
        this.a = 2;
        this.c = jjVar;
    }

    public vi(View view, boolean z) {
        this.a = 0;
        this.b = z;
        this.c = view;
    }
}
