package v0;

import e1.C0312c;
import e1.InterfaceC0313d;
import e1.InterfaceC0314e;
import h1.C0339a;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: v0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1227f implements InterfaceC0313d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1227f f10543a = new C1227f();

    /* renamed from: b, reason: collision with root package name */
    public static final C0312c f10544b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0312c f10545c;

    static {
        C0339a c0339a = new C0339a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(h1.d.class, c0339a);
        f10544b = new C0312c("currentCacheSizeBytes", Collections.unmodifiableMap(new HashMap(hashMap)));
        C0339a c0339a2 = new C0339a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(h1.d.class, c0339a2);
        f10545c = new C0312c("maxCacheSizeBytes", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // e1.InterfaceC0310a
    public final void a(Object obj, Object obj2) {
        y0.f fVar = (y0.f) obj;
        InterfaceC0314e interfaceC0314e = (InterfaceC0314e) obj2;
        interfaceC0314e.a(f10544b, fVar.f10821a);
        interfaceC0314e.a(f10545c, fVar.f10822b);
    }
}
