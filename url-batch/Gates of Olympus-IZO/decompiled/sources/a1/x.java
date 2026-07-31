package a1;

import android.animation.ValueAnimator;
import android.view.View;
import h1.C0438i;
import k2.AbstractC0546s;
import k2.AbstractC0552y;
import k2.C0536h;

/* loaded from: classes.dex */
public final class x implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3571d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3572e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3573f;

    public /* synthetic */ x(Object obj, int i3, Object obj2) {
        this.f3571d = i3;
        this.f3572e = obj;
        this.f3573f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3571d) {
            case 0:
                z.g((View) this.f3572e);
                ((ValueAnimator) this.f3573f).start();
                break;
            case 1:
                ((C0536h) this.f3573f).B((k2.Q) this.f3572e);
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                ((C0536h) this.f3572e).B((l2.d) this.f3573f);
                break;
            default:
                int i3 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f3572e).run();
                    } catch (Throwable th) {
                        AbstractC0552y.l(P1.j.f3073d, th);
                    }
                    p2.g gVar = (p2.g) this.f3573f;
                    Runnable S2 = gVar.S();
                    if (S2 == null) {
                        break;
                    } else {
                        this.f3572e = S2;
                        i3++;
                        if (i3 >= 16) {
                            AbstractC0546s abstractC0546s = gVar.f6780g;
                            if (abstractC0546s.Q(gVar)) {
                                abstractC0546s.P(gVar, this);
                                break;
                            }
                        }
                    }
                }
        }
    }

    public x(p2.g gVar, Runnable runnable) {
        this.f3571d = 3;
        this.f3573f = gVar;
        this.f3572e = runnable;
    }

    public x(View view, C0162D c0162d, C2.c cVar, ValueAnimator valueAnimator) {
        this.f3571d = 0;
        this.f3572e = view;
        this.f3573f = valueAnimator;
    }
}
