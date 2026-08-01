package J;

import M.e0;
import M.i0;
import Z.C0039i;
import Z.U;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f380a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f381b;

    /* renamed from: c, reason: collision with root package name */
    public Object f382c;
    public Object d;

    public /* synthetic */ m() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f380a) {
            case 0:
                try {
                    obj = ((e) this.f381b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.d).post(new B.b((f) this.f382c, 4, obj));
                break;
            case 1:
                e0.h((View) this.f381b, (D.j) this.f382c);
                ((ValueAnimator) this.d).start();
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f381b;
                U u2 = (U) this.f382c;
                if (arrayList.contains(u2)) {
                    arrayList.remove(u2);
                    ((C0039i) this.d).getClass();
                    X0.a.a(u2.f1097c.f1176E, u2.f1095a);
                    break;
                }
                break;
        }
    }

    public m(C0039i c0039i, ArrayList arrayList, U u2) {
        this.d = c0039i;
        this.f381b = arrayList;
        this.f382c = u2;
    }

    public m(View view, i0 i0Var, D.j jVar, ValueAnimator valueAnimator) {
        this.f381b = view;
        this.f382c = jVar;
        this.d = valueAnimator;
    }
}
