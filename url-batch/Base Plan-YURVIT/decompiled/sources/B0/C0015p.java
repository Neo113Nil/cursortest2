package B0;

import F.C0035q;
import a.AbstractC0086a;

/* renamed from: B0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0015p implements Z0.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f103e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Z0.e f104f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f105g;

    public /* synthetic */ C0015p(Z0.e eVar, I.d dVar, int i2) {
        this.f103e = i2;
        this.f104f = eVar;
        this.f105g = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018b  */
    @Override // Z0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, I0.b bVar) {
        C0014o c0014o;
        int i2;
        v vVar;
        int i3;
        z zVar;
        int i4;
        B b2;
        int i5;
        Z0.m mVar;
        int i6;
        boolean z2;
        Object obj2;
        Object obj3;
        C0015p c0015p;
        switch (this.f103e) {
            case 0:
                if (bVar instanceof C0014o) {
                    c0014o = (C0014o) bVar;
                    int i7 = c0014o.f101i;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        c0014o.f101i = i7 - Integer.MIN_VALUE;
                        Object obj4 = c0014o.f100h;
                        i2 = c0014o.f101i;
                        if (i2 != 0) {
                            AbstractC0086a.I(obj4);
                            Object c2 = ((I.b) obj).c((I.d) this.f105g);
                            c0014o.f101i = 1;
                            Object a2 = this.f104f.a(c2, c0014o);
                            H0.a aVar = H0.a.f511e;
                            if (a2 == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC0086a.I(obj4);
                        }
                        return D0.h.f206a;
                    }
                }
                c0014o = new C0014o(this, bVar);
                Object obj42 = c0014o.f100h;
                i2 = c0014o.f101i;
                if (i2 != 0) {
                }
                return D0.h.f206a;
            case 1:
                if (bVar instanceof v) {
                    vVar = (v) bVar;
                    int i8 = vVar.f127i;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        vVar.f127i = i8 - Integer.MIN_VALUE;
                        Object obj5 = vVar.f126h;
                        i3 = vVar.f127i;
                        if (i3 != 0) {
                            AbstractC0086a.I(obj5);
                            Object c3 = ((I.b) obj).c((I.d) this.f105g);
                            vVar.f127i = 1;
                            Object a3 = this.f104f.a(c3, vVar);
                            H0.a aVar2 = H0.a.f511e;
                            if (a3 == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC0086a.I(obj5);
                        }
                        return D0.h.f206a;
                    }
                }
                vVar = new v(this, bVar);
                Object obj52 = vVar.f126h;
                i3 = vVar.f127i;
                if (i3 != 0) {
                }
                return D0.h.f206a;
            case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                if (bVar instanceof z) {
                    zVar = (z) bVar;
                    int i9 = zVar.f146i;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        zVar.f146i = i9 - Integer.MIN_VALUE;
                        Object obj6 = zVar.f145h;
                        i4 = zVar.f146i;
                        if (i4 != 0) {
                            AbstractC0086a.I(obj6);
                            Object c4 = ((I.b) obj).c((I.d) this.f105g);
                            zVar.f146i = 1;
                            Object a4 = this.f104f.a(c4, zVar);
                            H0.a aVar3 = H0.a.f511e;
                            if (a4 == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC0086a.I(obj6);
                        }
                        return D0.h.f206a;
                    }
                }
                zVar = new z(this, bVar);
                Object obj62 = zVar.f145h;
                i4 = zVar.f146i;
                if (i4 != 0) {
                }
                return D0.h.f206a;
            case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                if (bVar instanceof B) {
                    b2 = (B) bVar;
                    int i10 = b2.f12i;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        b2.f12i = i10 - Integer.MIN_VALUE;
                        Object obj7 = b2.f11h;
                        i5 = b2.f12i;
                        if (i5 != 0) {
                            AbstractC0086a.I(obj7);
                            Object c5 = ((I.b) obj).c((I.d) this.f105g);
                            b2.f12i = 1;
                            Object a5 = this.f104f.a(c5, b2);
                            H0.a aVar4 = H0.a.f511e;
                            if (a5 == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC0086a.I(obj7);
                        }
                        return D0.h.f206a;
                    }
                }
                b2 = new B(this, bVar);
                Object obj72 = b2.f11h;
                i5 = b2.f12i;
                if (i5 != 0) {
                }
                return D0.h.f206a;
            default:
                if (bVar instanceof Z0.m) {
                    mVar = (Z0.m) bVar;
                    int i11 = mVar.f1114j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        mVar.f1114j = i11 - Integer.MIN_VALUE;
                        Object obj8 = mVar.f1113i;
                        i6 = mVar.f1114j;
                        z2 = true;
                        H0.a aVar5 = H0.a.f511e;
                        if (i6 != 0) {
                            AbstractC0086a.I(obj8);
                            C0035q c0035q = (C0035q) this.f105g;
                            mVar.f1112h = this;
                            mVar.f1116l = obj;
                            mVar.f1114j = 1;
                            Object i12 = c0035q.i(obj, mVar);
                            if (i12 == aVar5) {
                                return aVar5;
                            }
                            obj2 = i12;
                            obj3 = obj;
                            c0015p = this;
                        } else {
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c0015p = mVar.f1112h;
                                AbstractC0086a.I(obj8);
                                if (z2) {
                                    return D0.h.f206a;
                                }
                                throw new a1.a(c0015p);
                            }
                            Object obj9 = mVar.f1116l;
                            C0015p c0015p2 = mVar.f1112h;
                            AbstractC0086a.I(obj8);
                            obj3 = obj9;
                            c0015p = c0015p2;
                            obj2 = obj8;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            z2 = false;
                        } else {
                            Z0.e eVar = c0015p.f104f;
                            mVar.f1112h = c0015p;
                            mVar.f1116l = null;
                            mVar.f1114j = 2;
                            if (eVar.a(obj3, mVar) == aVar5) {
                                return aVar5;
                            }
                        }
                        if (z2) {
                        }
                    }
                }
                mVar = new Z0.m(this, bVar);
                Object obj82 = mVar.f1113i;
                i6 = mVar.f1114j;
                z2 = true;
                H0.a aVar52 = H0.a.f511e;
                if (i6 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                if (z2) {
                }
        }
    }

    public C0015p(C0035q c0035q, Z0.e eVar) {
        this.f103e = 4;
        this.f105g = c0035q;
        this.f104f = eVar;
    }
}
