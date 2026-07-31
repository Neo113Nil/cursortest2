package M1;

import I.C0143d;
import I.C0167p;
import I.C0174t;
import O2.l;
import Q1.j;
import R1.y;
import a.AbstractC0235a;
import e2.InterfaceC0426e;
import h2.AbstractC0508a;
import k1.i;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC0426e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3468f;

    public /* synthetic */ c(int i3, int i4, Object obj) {
        this.f3466d = i4;
        this.f3468f = obj;
        this.f3467e = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        int i3 = this.f3466d;
        C0167p c0167p = (C0167p) obj;
        ((Integer) obj2).intValue();
        switch (i3) {
            case 0:
                AbstractC0235a.f((C0174t) this.f3468f, c0167p, C0143d.U(this.f3467e | 1));
                break;
            case 1:
                AbstractC0508a.g((String) this.f3468f, c0167p, C0143d.U(this.f3467e | 1));
                break;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC0508a.c((Q1.c) this.f3468f, c0167p, C0143d.U(this.f3467e | 1));
                break;
            case i.INTEGER_FIELD_NUMBER /* 3 */:
                l0.c.a((Q1.f) this.f3468f, c0167p, C0143d.U(this.f3467e | 1));
                break;
            case i.LONG_FIELD_NUMBER /* 4 */:
                O2.d.c((Q1.g) this.f3468f, c0167p, C0143d.U(this.f3467e | 1));
                break;
            default:
                l.I((j) this.f3468f, c0167p, C0143d.U(this.f3467e | 1));
                break;
        }
        return y.f4171a;
    }
}
