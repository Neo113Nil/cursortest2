package J;

import G1.AbstractC0001b;
import M.c0;
import M.g0;
import Z.C0045i;
import Z.U;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f646a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f647b;

    /* renamed from: c, reason: collision with root package name */
    public Object f648c;

    /* renamed from: d, reason: collision with root package name */
    public Object f649d;

    public /* synthetic */ l() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f646a) {
            case 0:
                try {
                    obj = ((e) this.f647b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f649d).post(new B.a((f) this.f648c, 4, obj));
                break;
            case 1:
                c0.h((View) this.f647b, (B1.c) this.f648c);
                ((ValueAnimator) this.f649d).start();
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f647b;
                U u2 = (U) this.f648c;
                if (arrayList.contains(u2)) {
                    arrayList.remove(u2);
                    ((C0045i) this.f649d).getClass();
                    AbstractC0001b.a(u2.f1514c.f1595E, u2.f1512a);
                    break;
                }
                break;
        }
    }

    public l(C0045i c0045i, ArrayList arrayList, U u2) {
        this.f649d = c0045i;
        this.f647b = arrayList;
        this.f648c = u2;
    }

    public l(View view, g0 g0Var, B1.c cVar, ValueAnimator valueAnimator) {
        this.f647b = view;
        this.f648c = cVar;
        this.f649d = valueAnimator;
    }
}
