package v0;

import e1.C0312c;
import e1.InterfaceC0313d;
import e1.InterfaceC0314e;
import h1.C0339a;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: v0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1225d implements InterfaceC0313d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1225d f10539a = new C1225d();

    /* renamed from: b, reason: collision with root package name */
    public static final C0312c f10540b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0312c f10541c;

    static {
        C0339a c0339a = new C0339a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(h1.d.class, c0339a);
        f10540b = new C0312c("logSource", Collections.unmodifiableMap(new HashMap(hashMap)));
        C0339a c0339a2 = new C0339a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(h1.d.class, c0339a2);
        f10541c = new C0312c("logEventDropped", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // e1.InterfaceC0310a
    public final void a(Object obj, Object obj2) {
        y0.e eVar = (y0.e) obj;
        InterfaceC0314e interfaceC0314e = (InterfaceC0314e) obj2;
        interfaceC0314e.d(f10540b, eVar.f10819a);
        interfaceC0314e.d(f10541c, eVar.f10820b);
    }
}
