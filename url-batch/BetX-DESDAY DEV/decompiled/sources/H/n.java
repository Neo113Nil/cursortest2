package H;

import K.k0;
import K.o0;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.C0052i;
import androidx.fragment.app.X;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f248a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f249b;

    /* renamed from: c, reason: collision with root package name */
    public Object f250c;

    /* renamed from: d, reason: collision with root package name */
    public Object f251d;

    public /* synthetic */ n() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f248a) {
            case 0:
                try {
                    obj = ((f) this.f249b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f251d).post(new a((g) this.f250c, 1, obj));
                break;
            case 1:
                k0.h((View) this.f249b, (B.j) this.f250c);
                ((ValueAnimator) this.f251d).start();
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f249b;
                X x2 = (X) this.f250c;
                if (arrayList.contains(x2)) {
                    arrayList.remove(x2);
                    ((C0052i) this.f251d).getClass();
                    X0.e.a(x2.f1296c.f1382E, x2.f1294a);
                    break;
                }
                break;
        }
    }

    public n(C0052i c0052i, ArrayList arrayList, X x2) {
        this.f251d = c0052i;
        this.f249b = arrayList;
        this.f250c = x2;
    }

    public n(View view, o0 o0Var, B.j jVar, ValueAnimator valueAnimator) {
        this.f249b = view;
        this.f250c = jVar;
        this.f251d = valueAnimator;
    }
}
