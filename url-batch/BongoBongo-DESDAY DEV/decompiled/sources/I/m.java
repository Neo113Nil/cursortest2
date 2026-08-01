package I;

import L.i0;
import L.m0;
import Z.C0042i;
import Z.U;
import Z.V;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f342a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f343b;

    /* renamed from: c, reason: collision with root package name */
    public Object f344c;
    public Object d;

    public /* synthetic */ m() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f342a) {
            case 0:
                try {
                    obj = ((e) this.f343b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.d).post(new A.b((f) this.f344c, 4, obj));
                break;
            case 1:
                i0.h((View) this.f343b, (C.j) this.f344c);
                ((ValueAnimator) this.d).start();
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f343b;
                U u2 = (U) this.f344c;
                if (arrayList.contains(u2)) {
                    arrayList.remove(u2);
                    ((C0042i) this.d).getClass();
                    V.a(u2.f1083c.f1166E, u2.f1081a);
                    break;
                }
                break;
        }
    }

    public m(C0042i c0042i, ArrayList arrayList, U u2) {
        this.d = c0042i;
        this.f343b = arrayList;
        this.f344c = u2;
    }

    public m(View view, m0 m0Var, C.j jVar, ValueAnimator valueAnimator) {
        this.f343b = view;
        this.f344c = jVar;
        this.d = valueAnimator;
    }
}
