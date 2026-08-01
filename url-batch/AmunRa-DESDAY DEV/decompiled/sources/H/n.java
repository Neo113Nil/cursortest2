package H;

import K.f0;
import K.j0;
import X.C0040i;
import X.U;
import X.V;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f221b;

    /* renamed from: c, reason: collision with root package name */
    public Object f222c;
    public Object d;

    public /* synthetic */ n() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f220a) {
            case 0:
                try {
                    obj = ((f) this.f221b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.d).post(new a((g) this.f222c, 1, obj));
                break;
            case 1:
                f0.h((View) this.f221b, (B.j) this.f222c);
                ((ValueAnimator) this.d).start();
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f221b;
                U u2 = (U) this.f222c;
                if (arrayList.contains(u2)) {
                    arrayList.remove(u2);
                    ((C0040i) this.d).getClass();
                    V.a(u2.f919c.f995E, u2.f917a);
                    break;
                }
                break;
        }
    }

    public n(C0040i c0040i, ArrayList arrayList, U u2) {
        this.d = c0040i;
        this.f221b = arrayList;
        this.f222c = u2;
    }

    public n(View view, j0 j0Var, B.j jVar, ValueAnimator valueAnimator) {
        this.f221b = view;
        this.f222c = jVar;
        this.d = valueAnimator;
    }
}
