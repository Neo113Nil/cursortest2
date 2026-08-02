package K;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;

/* renamed from: K.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0060y implements w2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f830b;

    public /* synthetic */ C0060y(int i3, Object obj) {
        this.f829a = i3;
        this.f830b = obj;
    }

    @Override // w2.e
    public final Object a(Object obj, InterfaceC0300c interfaceC0300c) {
        Object e3;
        switch (this.f829a) {
            case 0:
                N n3 = (N) this.f830b;
                boolean z = n3.f701h.s() instanceof Z;
                C0195i c0195i = C0195i.f2555a;
                return (z || (e3 = N.e(n3, true, interfaceC0300c)) != EnumC0317a.f4969a) ? c0195i : e3;
            case 1:
                ((E1.p) this.f830b).accept(obj);
                return C0195i.f2555a;
            default:
                ((kotlin.jvm.internal.q) this.f830b).f9692a = obj;
                throw new x2.a(this);
        }
    }
}
