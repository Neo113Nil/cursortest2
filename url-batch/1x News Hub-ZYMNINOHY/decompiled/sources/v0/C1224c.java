package v0;

import e1.C0312c;
import e1.InterfaceC0313d;
import e1.InterfaceC0314e;
import h1.C0339a;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: v0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1224c implements InterfaceC0313d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1224c f10536a = new C1224c();

    /* renamed from: b, reason: collision with root package name */
    public static final C0312c f10537b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0312c f10538c;

    static {
        C0339a c0339a = new C0339a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(h1.d.class, c0339a);
        f10537b = new C0312c("eventsDroppedCount", Collections.unmodifiableMap(new HashMap(hashMap)));
        C0339a c0339a2 = new C0339a(3);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(h1.d.class, c0339a2);
        f10538c = new C0312c("reason", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // e1.InterfaceC0310a
    public final void a(Object obj, Object obj2) {
        y0.d dVar = (y0.d) obj;
        InterfaceC0314e interfaceC0314e = (InterfaceC0314e) obj2;
        interfaceC0314e.a(f10537b, dVar.f10816a);
        interfaceC0314e.d(f10538c, dVar.f10817b);
    }
}
