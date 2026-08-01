package H;

import K.f0;
import K.j0;
import X.C0039i;
import X.U;
import X.V;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f297b;

    /* renamed from: c, reason: collision with root package name */
    public Object f298c;
    public Object d;

    public /* synthetic */ n() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f296a) {
            case 0:
                try {
                    obj = ((f) this.f297b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.d).post(new a((g) this.f298c, 1, obj));
                break;
            case 1:
                f0.h((View) this.f297b, (B.j) this.f298c);
                ((ValueAnimator) this.d).start();
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f297b;
                U u2 = (U) this.f298c;
                if (arrayList.contains(u2)) {
                    arrayList.remove(u2);
                    ((C0039i) this.d).getClass();
                    V.a(u2.f962c.f1041E, u2.f960a);
                    break;
                }
                break;
        }
    }

    public n(C0039i c0039i, ArrayList arrayList, U u2) {
        this.d = c0039i;
        this.f297b = arrayList;
        this.f298c = u2;
    }

    public n(View view, j0 j0Var, B.j jVar, ValueAnimator valueAnimator) {
        this.f297b = view;
        this.f298c = jVar;
        this.d = valueAnimator;
    }
}
