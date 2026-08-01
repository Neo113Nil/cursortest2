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
    public final /* synthetic */ int f282a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f283b;

    /* renamed from: c, reason: collision with root package name */
    public Object f284c;
    public Object d;

    public /* synthetic */ n() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f282a) {
            case 0:
                try {
                    obj = ((f) this.f283b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.d).post(new a((g) this.f284c, 1, obj));
                break;
            case 1:
                i0.h((View) this.f283b, (B.j) this.f284c);
                ((ValueAnimator) this.d).start();
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f283b;
                U u2 = (U) this.f284c;
                if (arrayList.contains(u2)) {
                    arrayList.remove(u2);
                    ((C0043i) this.d).getClass();
                    V.a(u2.f1008c.f1087E, u2.f1006a);
                    break;
                }
                break;
        }
    }

    public n(C0043i c0043i, ArrayList arrayList, U u2) {
        this.d = c0043i;
        this.f283b = arrayList;
        this.f284c = u2;
    }

    public n(View view, m0 m0Var, B.j jVar, ValueAnimator valueAnimator) {
        this.f283b = view;
        this.f284c = jVar;
        this.d = valueAnimator;
    }
}
