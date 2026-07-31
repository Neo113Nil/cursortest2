package B;

import I.C0143d;
import I.C0167p;
import a.AbstractC0235a;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;
import h2.AbstractC0508a;
import n.AbstractC0695v;
import o.C0740b;
import r0.AbstractC0898U;
import r0.C0901X;
import t1.C1028h;
import u0.AbstractC1101g0;

/* renamed from: B.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0000a extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f338f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f339g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f340h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f341i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0000a(Q.a aVar, Object obj, Object obj2, int i3) {
        super(2);
        this.f337e = 1;
        this.f338f = aVar;
        this.f340h = obj;
        this.f341i = obj2;
        this.f339g = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f337e) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0143d.U(this.f339g | 1);
                U.d dVar = (U.d) this.f341i;
                Q.a aVar = (Q.a) this.f338f;
                AbstractC0508a.e((InterfaceC0013n) this.f340h, dVar, aVar, (C0167p) obj, U3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int U4 = C0143d.U(this.f339g) | 1;
                Object obj3 = this.f340h;
                Object obj4 = this.f341i;
                ((Q.a) this.f338f).e(obj3, obj4, (C0167p) obj, U4);
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((Number) obj2).intValue();
                int U5 = C0143d.U(this.f339g | 1);
                Q.a aVar2 = (Q.a) this.f338f;
                ((R.i) this.f340h).e(this.f341i, aVar2, (C0167p) obj, U5);
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                ((Number) obj2).intValue();
                int U6 = C0143d.U(this.f339g | 1);
                Q.a aVar3 = (Q.a) this.f338f;
                AbstractC0235a.c((InterfaceC0422a) this.f340h, (R0.v) this.f341i, aVar3, (C0167p) obj, U6);
                break;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                ((Number) obj2).intValue();
                int U7 = C0143d.U(this.f339g | 1);
                Q.a aVar4 = (Q.a) this.f338f;
                o.p.a((C0740b) this.f340h, (U.q) this.f341i, aVar4, (C0167p) obj, U7);
                break;
            case 5:
                ((Number) obj2).intValue();
                int U8 = C0143d.U(this.f339g | 1);
                InterfaceC0426e interfaceC0426e = this.f338f;
                AbstractC0898U.c((C0901X) this.f340h, (U.q) this.f341i, interfaceC0426e, (C0167p) obj, U8);
                break;
            case 6:
                ((Number) obj2).intValue();
                int U9 = C0143d.U(this.f339g | 1);
                Q.a aVar5 = (Q.a) this.f338f;
                ((t.I) this.f340h).e(this.f341i, aVar5, (C0167p) obj, U9);
                break;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Number) obj2).intValue();
                int U10 = C0143d.U(this.f339g | 1);
                AbstractC1101g0.a((t0.h0) this.f340h, (u0.X) this.f341i, (Q.a) this.f338f, (C0167p) obj, U10);
                break;
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                ((Number) obj2).intValue();
                int U11 = C0143d.U(this.f339g | 1);
                Q.a aVar6 = (Q.a) this.f338f;
                AbstractC0695v.c((C1028h) this.f340h, (R.i) this.f341i, aVar6, (C0167p) obj, U11);
                break;
            default:
                ((Number) obj2).intValue();
                int U12 = C0143d.U(this.f339g | 1);
                a0 a0Var = (a0) this.f341i;
                Q.a aVar7 = (Q.a) this.f338f;
                x.N.d((U.q) this.f340h, a0Var, aVar7, (C0167p) obj, U12);
                break;
        }
        return R1.y.f4171a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0000a(Object obj, Object obj2, InterfaceC0426e interfaceC0426e, int i3, int i4) {
        super(2);
        this.f337e = i4;
        this.f340h = obj;
        this.f341i = obj2;
        this.f338f = interfaceC0426e;
        this.f339g = i3;
    }
}
