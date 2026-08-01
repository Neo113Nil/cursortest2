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
    public final /* synthetic */ int f249a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f250b;

    /* renamed from: c, reason: collision with root package name */
    public Object f251c;

    /* renamed from: d, reason: collision with root package name */
    public Object f252d;

    public /* synthetic */ n() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f249a) {
            case 0:
                try {
                    obj = ((f) this.f250b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f252d).post(new a((g) this.f251c, 1, obj));
                break;
            case 1:
                k0.h((View) this.f250b, (B.j) this.f251c);
                ((ValueAnimator) this.f252d).start();
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f250b;
                X x2 = (X) this.f251c;
                if (arrayList.contains(x2)) {
                    arrayList.remove(x2);
                    ((C0052i) this.f252d).getClass();
                    X0.e.a(x2.f1295c.f1381E, x2.f1293a);
                    break;
                }
                break;
        }
    }

    public n(C0052i c0052i, ArrayList arrayList, X x2) {
        this.f252d = c0052i;
        this.f250b = arrayList;
        this.f251c = x2;
    }

    public n(View view, o0 o0Var, B.j jVar, ValueAnimator valueAnimator) {
        this.f250b = view;
        this.f251c = jVar;
        this.f252d = valueAnimator;
    }
}
