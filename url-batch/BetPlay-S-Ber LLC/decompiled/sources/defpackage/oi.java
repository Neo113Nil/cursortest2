package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class oi extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public oi(wi wiVar) {
        this.a = 1;
        this.c = wiVar;
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
                wi wiVar = (wi) obj;
                if (!this.b) {
                    if (((Float) wiVar.z.getAnimatedValue()).floatValue() != 0.0f) {
                        wiVar.A = 2;
                        wiVar.s.invalidate();
                        break;
                    } else {
                        wiVar.A = 0;
                        wiVar.f(0);
                        break;
                    }
                } else {
                    this.b = false;
                    break;
                }
            default:
                dj djVar = (dj) obj;
                djVar.r = 0;
                djVar.m = null;
                if (!this.b) {
                    djVar.s.a(4, false);
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
                dj djVar = (dj) obj;
                djVar.s.a(0, false);
                djVar.r = 1;
                djVar.m = animator;
                this.b = false;
                break;
        }
    }

    public oi(dj djVar) {
        this.a = 2;
        this.c = djVar;
    }

    public oi(View view, boolean z) {
        this.a = 0;
        this.b = z;
        this.c = view;
    }
}
