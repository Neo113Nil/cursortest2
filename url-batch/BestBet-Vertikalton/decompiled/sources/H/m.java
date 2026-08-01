package H;

import G1.AbstractC0001b;
import K.f0;
import K.j0;
import Y.C0042i;
import Y.U;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import java.util.ArrayList;
import u0.C0385x;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f502a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f503b;

    /* renamed from: c, reason: collision with root package name */
    public Object f504c;
    public Object d;

    public /* synthetic */ m() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f502a) {
            case 0:
                try {
                    obj = ((f) this.f503b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.d).post(new a((g) this.f504c, 1, obj));
                break;
            case 1:
                f0.h((View) this.f503b, (C0385x) this.f504c);
                ((ValueAnimator) this.d).start();
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f503b;
                U u2 = (U) this.f504c;
                if (arrayList.contains(u2)) {
                    arrayList.remove(u2);
                    ((C0042i) this.d).getClass();
                    AbstractC0001b.a(u2.f1367c.f1446E, u2.f1365a);
                    break;
                }
                break;
        }
    }

    public m(C0042i c0042i, ArrayList arrayList, U u2) {
        this.d = c0042i;
        this.f503b = arrayList;
        this.f504c = u2;
    }

    public m(View view, j0 j0Var, C0385x c0385x, ValueAnimator valueAnimator) {
        this.f503b = view;
        this.f504c = c0385x;
        this.d = valueAnimator;
    }
}
