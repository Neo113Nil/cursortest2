package s;

import I.C0143d;
import I.C0167p;
import R1.y;
import e2.InterfaceC0426e;

/* renamed from: s.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0938g extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0939h f8230e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8231f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f8232g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8233h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0938g(C0939h c0939h, int i3, Object obj, int i4) {
        super(2);
        this.f8230e = c0939h;
        this.f8231f = i3;
        this.f8232g = obj;
        this.f8233h = i4;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0143d.U(this.f8233h | 1);
        int i3 = this.f8231f;
        Object obj3 = this.f8232g;
        this.f8230e.a(i3, obj3, (C0167p) obj, U3);
        return y.f4171a;
    }
}
