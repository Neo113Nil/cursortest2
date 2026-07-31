package c1;

import android.animation.ValueAnimator;
import android.view.View;
import q2.AbstractC0831s;
import q2.AbstractC0837y;
import q2.C0821h;
import z.C1256t;

/* loaded from: classes.dex */
public final class z implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5620d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5621e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5622f;

    public /* synthetic */ z(Object obj, int i3, Object obj2) {
        this.f5620d = i3;
        this.f5621e = obj;
        this.f5622f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5620d) {
            case 0:
                C0375B.g((View) this.f5621e);
                ((ValueAnimator) this.f5622f).start();
                break;
            case 1:
                ((C0821h) this.f5622f).E((q2.Q) this.f5621e);
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((C0821h) this.f5621e).E((r2.d) this.f5622f);
                break;
            default:
                int i3 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f5621e).run();
                    } catch (Throwable th) {
                        AbstractC0837y.m(V1.j.f4558d, th);
                    }
                    v2.g gVar = (v2.g) this.f5622f;
                    Runnable H3 = gVar.H();
                    if (H3 == null) {
                        break;
                    } else {
                        this.f5621e = H3;
                        i3++;
                        if (i3 >= 16) {
                            AbstractC0831s abstractC0831s = gVar.f9801g;
                            if (abstractC0831s.F(gVar)) {
                                abstractC0831s.D(gVar, this);
                                break;
                            }
                        }
                    }
                }
        }
    }

    public z(v2.g gVar, Runnable runnable) {
        this.f5620d = 3;
        this.f5622f = gVar;
        this.f5621e = runnable;
    }

    public z(View view, F f3, C1256t c1256t, ValueAnimator valueAnimator) {
        this.f5620d = 0;
        this.f5621e = view;
        this.f5622f = valueAnimator;
    }
}
