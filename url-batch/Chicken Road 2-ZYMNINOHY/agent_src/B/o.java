package B;

import C3.v;
import E1.C0029e;
import E1.C0037m;
import E1.C0048y;
import E1.InterfaceC0044u;
import E1.W;
import android.os.Handler;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185a;

    /* renamed from: b, reason: collision with root package name */
    public Object f186b;

    /* renamed from: c, reason: collision with root package name */
    public Object f187c;

    /* renamed from: d, reason: collision with root package name */
    public Object f188d;

    public /* synthetic */ o() {
        this.f185a = 0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f185a) {
            case 0:
                try {
                    obj = ((g) this.f186b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f188d).post(new a((h) this.f187c, 1, obj));
                break;
            case 1:
                C0029e c0029e = (C0029e) this.f186b;
                io.flutter.plugins.inapppurchase.f fVar = (io.flutter.plugins.inapppurchase.f) this.f187c;
                v vVar = (v) this.f188d;
                C0037m c0037m = W.f543k;
                c0029e.J(24, 4, c0037m);
                fVar.f(c0037m, vVar.f321b);
                break;
            case 2:
                super/*E1.e*/.e((C0048y) this.f187c, (InterfaceC0044u) this.f188d);
                break;
            case 3:
                super/*E1.e*/.b((v) this.f187c, (io.flutter.plugins.inapppurchase.f) this.f188d);
                break;
            default:
                super/*E1.e*/.a((v) this.f187c, (io.flutter.plugins.inapppurchase.f) this.f188d);
                break;
        }
    }

    public /* synthetic */ o(C0029e c0029e, Object obj, Object obj2, int i4) {
        this.f185a = i4;
        this.f186b = c0029e;
        this.f187c = obj;
        this.f188d = obj2;
    }
}
