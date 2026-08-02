package B;

import android.os.Handler;
import android.webkit.WebView;
import b0.s;
import n0.C1130J;
import n0.C1140b;
import n0.C1148j;
import n0.InterfaceC1153o;
import x1.C1244e;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109a;

    /* renamed from: b, reason: collision with root package name */
    public Object f110b;

    /* renamed from: c, reason: collision with root package name */
    public Object f111c;

    /* renamed from: d, reason: collision with root package name */
    public Object f112d;

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f109a) {
            case 0:
                try {
                    obj = ((g) this.f110b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f112d).post(new a((h) this.f111c, 1, obj));
                return;
            case 1:
                ((C1130J) this.f110b).N((s) this.f111c, (InterfaceC1153o) this.f112d);
                return;
            case 2:
                C1148j c1148j = (C1148j) this.f111c;
                ((C1130J) this.f110b).M((B0.g) this.f112d, c1148j);
                return;
            case 3:
                ((C1130J) this.f110b).L((C1140b) this.f111c, (B0.g) this.f112d);
                return;
            case 4:
                ((n1.i) this.f112d).getClass();
                n1.i.b((WebView) this.f110b, (String) this.f111c);
                return;
            default:
                synchronized (x1.l.f) {
                    x1.l.a((x1.l) this.f112d, (C1244e) this.f110b);
                }
                ((O1.j) this.f111c).success(null);
                return;
        }
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i3) {
        this.f109a = i3;
        this.f112d = obj;
        this.f110b = obj2;
        this.f111c = obj3;
    }

    public /* synthetic */ n(C1130J c1130j, Object obj, Object obj2, int i3) {
        this.f109a = i3;
        this.f110b = c1130j;
        this.f111c = obj;
        this.f112d = obj2;
    }
}
