package androidx.lifecycle;

import a0.C0175f;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240j implements InterfaceC0249t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4572a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4573b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4574c;

    public C0240j(InterfaceC0249t interfaceC0249t) {
        this.f4573b = interfaceC0249t;
        C0234d c0234d = C0234d.f4568c;
        Class<?> cls = interfaceC0249t.getClass();
        C0232b c0232b = (C0232b) c0234d.f4569a.get(cls);
        this.f4574c = c0232b == null ? c0234d.a(cls, null) : c0232b;
    }

    @Override // androidx.lifecycle.InterfaceC0249t
    public final void a(InterfaceC0250u interfaceC0250u, EnumC0243m enumC0243m) {
        switch (this.f4572a) {
            case 0:
                if (enumC0243m == EnumC0243m.ON_START) {
                    ((AbstractC0245o) this.f4573b).b(this);
                    ((C0175f) this.f4574c).d();
                    break;
                }
                break;
            default:
                HashMap hashMap = ((C0232b) this.f4574c).f4564a;
                List list = (List) hashMap.get(enumC0243m);
                InterfaceC0249t interfaceC0249t = (InterfaceC0249t) this.f4573b;
                C0232b.a(list, interfaceC0250u, enumC0243m, interfaceC0249t);
                C0232b.a((List) hashMap.get(EnumC0243m.ON_ANY), interfaceC0250u, enumC0243m, interfaceC0249t);
                break;
        }
    }

    public C0240j(C0175f c0175f, AbstractC0245o abstractC0245o) {
        this.f4573b = abstractC0245o;
        this.f4574c = c0175f;
    }
}
