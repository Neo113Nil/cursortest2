package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements InterfaceC0511t {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0512u f5254n;

    /* renamed from: u, reason: collision with root package name */
    public final C0494b f5255u;

    public ReflectiveGenericLifecycleObserver(InterfaceC0512u interfaceC0512u) {
        this.f5254n = interfaceC0512u;
        C0496d c0496d = C0496d.f5270c;
        Class<?> cls = interfaceC0512u.getClass();
        C0494b c0494b = (C0494b) c0496d.f5271a.get(cls);
        this.f5255u = c0494b == null ? c0496d.a(cls, null) : c0494b;
    }

    @Override // androidx.lifecycle.InterfaceC0511t
    public final void a(InterfaceC0513v interfaceC0513v, EnumC0506n enumC0506n) {
        HashMap hashMap = this.f5255u.f5266a;
        List list = (List) hashMap.get(enumC0506n);
        InterfaceC0512u interfaceC0512u = this.f5254n;
        C0494b.a(list, interfaceC0513v, enumC0506n, interfaceC0512u);
        C0494b.a((List) hashMap.get(EnumC0506n.ON_ANY), interfaceC0513v, enumC0506n, interfaceC0512u);
    }
}
