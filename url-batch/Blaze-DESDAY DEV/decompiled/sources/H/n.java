package H;

import K.i0;
import K.m0;
import Y.C0043i;
import Y.U;
import Y.V;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f300b;

    /* renamed from: c, reason: collision with root package name */
    public Object f301c;
    public Object d;

    public /* synthetic */ n() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f299a) {
            case 0:
                try {
                    obj = ((f) this.f300b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.d).post(new a((g) this.f301c, 1, obj));
                break;
            case 1:
                i0.h((View) this.f300b, (B.j) this.f301c);
                ((ValueAnimator) this.d).start();
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f300b;
                U u2 = (U) this.f301c;
                if (arrayList.contains(u2)) {
                    arrayList.remove(u2);
                    ((C0043i) this.d).getClass();
                    V.a(u2.f1035c.f1114E, u2.f1033a);
                    break;
                }
                break;
        }
    }

    public n(C0043i c0043i, ArrayList arrayList, U u2) {
        this.d = c0043i;
        this.f300b = arrayList;
        this.f301c = u2;
    }

    public n(View view, m0 m0Var, B.j jVar, ValueAnimator valueAnimator) {
        this.f300b = view;
        this.f301c = jVar;
        this.d = valueAnimator;
    }
}
