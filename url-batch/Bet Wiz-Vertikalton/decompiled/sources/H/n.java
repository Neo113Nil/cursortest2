package H;

import K.f0;
import K.j0;
import X.C0040i;
import X.U;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f281b;

    /* renamed from: c, reason: collision with root package name */
    public Object f282c;
    public Object d;

    public /* synthetic */ n() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f280a) {
            case 0:
                try {
                    obj = ((f) this.f281b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.d).post(new a((g) this.f282c, 1, obj));
                break;
            case 1:
                f0.h((View) this.f281b, (B.j) this.f282c);
                ((ValueAnimator) this.d).start();
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f281b;
                U u2 = (U) this.f282c;
                if (arrayList.contains(u2)) {
                    arrayList.remove(u2);
                    ((C0040i) this.d).getClass();
                    T0.c.a(u2.f988c.f1067E, u2.f986a);
                    break;
                }
                break;
        }
    }

    public n(C0040i c0040i, ArrayList arrayList, U u2) {
        this.d = c0040i;
        this.f281b = arrayList;
        this.f282c = u2;
    }

    public n(View view, j0 j0Var, B.j jVar, ValueAnimator valueAnimator) {
        this.f281b = view;
        this.f282c = jVar;
        this.d = valueAnimator;
    }
}
