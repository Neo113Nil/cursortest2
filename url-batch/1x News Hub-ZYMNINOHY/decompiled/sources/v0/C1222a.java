package v0;

import e1.C0312c;
import e1.InterfaceC0313d;
import e1.InterfaceC0314e;
import h1.C0339a;
import java.util.Collections;
import java.util.HashMap;
import y0.C1251a;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1222a implements InterfaceC0313d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1222a f10529a = new C1222a();

    /* renamed from: b, reason: collision with root package name */
    public static final C0312c f10530b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0312c f10531c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0312c f10532d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0312c f10533e;

    static {
        C0339a c0339a = new C0339a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(h1.d.class, c0339a);
        f10530b = new C0312c("window", Collections.unmodifiableMap(new HashMap(hashMap)));
        C0339a c0339a2 = new C0339a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(h1.d.class, c0339a2);
        f10531c = new C0312c("logSourceMetrics", Collections.unmodifiableMap(new HashMap(hashMap2)));
        C0339a c0339a3 = new C0339a(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(h1.d.class, c0339a3);
        f10532d = new C0312c("globalMetrics", Collections.unmodifiableMap(new HashMap(hashMap3)));
        C0339a c0339a4 = new C0339a(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(h1.d.class, c0339a4);
        f10533e = new C0312c("appNamespace", Collections.unmodifiableMap(new HashMap(hashMap4)));
    }

    @Override // e1.InterfaceC0310a
    public final void a(Object obj, Object obj2) {
        C1251a c1251a = (C1251a) obj;
        InterfaceC0314e interfaceC0314e = (InterfaceC0314e) obj2;
        interfaceC0314e.d(f10530b, c1251a.f10803a);
        interfaceC0314e.d(f10531c, c1251a.f10804b);
        interfaceC0314e.d(f10532d, c1251a.f10805c);
        interfaceC0314e.d(f10533e, c1251a.f10806d);
    }
}
