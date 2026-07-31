package o;

import B.C0022x;
import I.C0143d;
import I.C0167p;
import R1.y;
import U.q;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;
import n.z0;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0739a extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7374e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f7375f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0422a f7376g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f7377h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0022x f7378i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7379j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0739a(n nVar, InterfaceC0422a interfaceC0422a, q qVar, C0022x c0022x, int i3, int i4) {
        super(2);
        this.f7374e = i4;
        this.f7375f = nVar;
        this.f7376g = interfaceC0422a;
        this.f7377h = qVar;
        this.f7378i = c0022x;
        this.f7379j = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f7374e) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0143d.U(this.f7379j | 1);
                C0022x c0022x = this.f7378i;
                z0.a(this.f7375f, this.f7376g, this.f7377h, c0022x, (C0167p) obj, U3);
                break;
            default:
                ((Number) obj2).intValue();
                int U4 = C0143d.U(this.f7379j | 1);
                C0022x c0022x2 = this.f7378i;
                z0.a(this.f7375f, this.f7376g, this.f7377h, c0022x2, (C0167p) obj, U4);
                break;
        }
        return y.f4171a;
    }
}
