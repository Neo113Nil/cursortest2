package d2;

import a2.C0162b;
import s2.C1411a;

/* loaded from: classes.dex */
public final class h implements InterfaceC0384b {

    /* renamed from: b, reason: collision with root package name */
    public static h f8266b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f8267c = new i(0, 0, 0, false, false);

    /* renamed from: a, reason: collision with root package name */
    public Object f8268a;

    public /* synthetic */ h(Object obj) {
        this.f8268a = obj;
    }

    public static synchronized h b() {
        h hVar;
        synchronized (h.class) {
            try {
                if (f8266b == null) {
                    f8266b = new h();
                }
                hVar = f8266b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // d2.InterfaceC0384b
    public void a(C0162b c0162b) {
        C1411a c1411a = (C1411a) this.f8268a;
        if (c0162b.f4265b == 0) {
            c1411a.h(null, c1411a.f5797w);
            return;
        }
        h hVar = c1411a.o;
        if (hVar != null) {
            ((b2.h) hVar.f8268a).c(c0162b);
        }
    }
}
