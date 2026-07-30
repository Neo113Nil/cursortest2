package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ij implements ym0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ ym0 n;

    public /* synthetic */ ij(ym0 ym0Var, int i) {
        this.m = i;
        this.n = ym0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013e  */
    @Override // defpackage.ym0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, o30 o30Var) {
        hj hjVar;
        int i;
        x10 x10Var;
        int i2;
        w60 w60Var;
        int i3;
        bj1 bj1Var;
        int i4;
        dj1 dj1Var;
        int i5;
        hj1 hj1Var;
        int i6;
        int i7 = this.m;
        ym0 ym0Var = this.n;
        pl2 pl2Var = null;
        switch (i7) {
            case 0:
                if (o30Var instanceof hj) {
                    hjVar = (hj) o30Var;
                    int i8 = hjVar.n;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        hjVar.n = i8 - Integer.MIN_VALUE;
                        Object obj2 = hjVar.m;
                        b50 b50Var = b50.m;
                        i = hjVar.n;
                        if (i != 0) {
                            ca2.b(obj2);
                            long j = ((ql2) obj).a;
                            zm3 zm3Var = hb0.o;
                            if (j == 9205357640488583168L) {
                                pl2Var = pl2.c;
                            } else {
                                h72 h72Var = p33.b;
                                if (ql2.d(j) >= 0.5d && ql2.b(j) >= 0.5d) {
                                    float d = ql2.d(j);
                                    zm3 gb0Var = (Float.isInfinite(d) || Float.isNaN(d)) ? zm3Var : new gb0(si1.b(ql2.d(j)));
                                    float b = ql2.b(j);
                                    if (!Float.isInfinite(b) && !Float.isNaN(b)) {
                                        zm3Var = new gb0(si1.b(ql2.b(j)));
                                    }
                                    pl2Var = new pl2(gb0Var, zm3Var);
                                }
                            }
                            if (pl2Var != null) {
                                hjVar.n = 1;
                                if (ym0Var.d(pl2Var, hjVar) == b50Var) {
                                    return b50Var;
                                }
                            }
                        } else {
                            if (i != 1) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ca2.b(obj2);
                        }
                        return Unit.a;
                    }
                }
                hjVar = new hj(this, o30Var);
                Object obj22 = hjVar.m;
                b50 b50Var2 = b50.m;
                i = hjVar.n;
                if (i != 0) {
                }
                return Unit.a;
            case 1:
                if (o30Var instanceof x10) {
                    x10Var = (x10) o30Var;
                    int i9 = x10Var.n;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        x10Var.n = i9 - Integer.MIN_VALUE;
                        Object obj3 = x10Var.m;
                        b50 b50Var3 = b50.m;
                        i2 = x10Var.n;
                        if (i2 != 0) {
                            ca2.b(obj3);
                            long j2 = ((u10) obj).a;
                            h72 h72Var2 = p33.b;
                            zm3 zm3Var2 = hb0.o;
                            if (!u10.k(j2)) {
                                zm3 gb0Var2 = u10.d(j2) ? new gb0(u10.h(j2)) : zm3Var2;
                                if (u10.c(j2)) {
                                    zm3Var2 = new gb0(u10.g(j2));
                                }
                                pl2Var = new pl2(gb0Var2, zm3Var2);
                            }
                            if (pl2Var != null) {
                                x10Var.n = 1;
                                if (ym0Var.d(pl2Var, x10Var) == b50Var3) {
                                    return b50Var3;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ca2.b(obj3);
                        }
                        return Unit.a;
                    }
                }
                x10Var = new x10(this, o30Var);
                Object obj32 = x10Var.m;
                b50 b50Var32 = b50.m;
                i2 = x10Var.n;
                if (i2 != 0) {
                }
                return Unit.a;
            case 2:
                if (o30Var instanceof w60) {
                    w60Var = (w60) o30Var;
                    int i10 = w60Var.n;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        w60Var.n = i10 - Integer.MIN_VALUE;
                        Object obj4 = w60Var.m;
                        b50 b50Var4 = b50.m;
                        i3 = w60Var.n;
                        if (i3 != 0) {
                            ca2.b(obj4);
                            qo2 qo2Var = (qo2) obj;
                            if (qo2Var instanceof g62) {
                                throw ((g62) qo2Var).b;
                            }
                            if (!(qo2Var instanceof h60)) {
                                if (qo2Var instanceof zl0 ? true : qo2Var instanceof u13) {
                                    lh.g("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                    return null;
                                }
                                a.b();
                                return null;
                            }
                            Object obj5 = ((h60) qo2Var).b;
                            w60Var.n = 1;
                            if (ym0Var.d(obj5, w60Var) == b50Var4) {
                                return b50Var4;
                            }
                        } else {
                            if (i3 != 1) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ca2.b(obj4);
                        }
                        return Unit.a;
                    }
                }
                w60Var = new w60(this, o30Var);
                Object obj42 = w60Var.m;
                b50 b50Var42 = b50.m;
                i3 = w60Var.n;
                if (i3 != 0) {
                }
                return Unit.a;
            case 3:
                if (o30Var instanceof bj1) {
                    bj1Var = (bj1) o30Var;
                    int i11 = bj1Var.n;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        bj1Var.n = i11 - Integer.MIN_VALUE;
                        Object obj6 = bj1Var.m;
                        b50 b50Var5 = b50.m;
                        i4 = bj1Var.n;
                        if (i4 != 0) {
                            ca2.b(obj6);
                            Integer num = new Integer(((List) obj).size());
                            bj1Var.n = 1;
                            if (ym0Var.d(num, bj1Var) == b50Var5) {
                                return b50Var5;
                            }
                        } else {
                            if (i4 != 1) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ca2.b(obj6);
                        }
                        return Unit.a;
                    }
                }
                bj1Var = new bj1(this, o30Var);
                Object obj62 = bj1Var.m;
                b50 b50Var52 = b50.m;
                i4 = bj1Var.n;
                if (i4 != 0) {
                }
                return Unit.a;
            case 4:
                if (o30Var instanceof dj1) {
                    dj1Var = (dj1) o30Var;
                    int i12 = dj1Var.n;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        dj1Var.n = i12 - Integer.MIN_VALUE;
                        Object obj7 = dj1Var.m;
                        b50 b50Var6 = b50.m;
                        i5 = dj1Var.n;
                        if (i5 != 0) {
                            ca2.b(obj7);
                            ArrayList arrayList = new ArrayList();
                            Iterator it = ((List) obj).iterator();
                            while (it.hasNext()) {
                                vv.o(((ik) it.next()).v, arrayList);
                            }
                            List H = zv.H(zv.M(zv.P(arrayList)));
                            dj1Var.n = 1;
                            if (ym0Var.d(H, dj1Var) == b50Var6) {
                                return b50Var6;
                            }
                        } else {
                            if (i5 != 1) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ca2.b(obj7);
                        }
                        return Unit.a;
                    }
                }
                dj1Var = new dj1(this, o30Var);
                Object obj72 = dj1Var.m;
                b50 b50Var62 = b50.m;
                i5 = dj1Var.n;
                if (i5 != 0) {
                }
                return Unit.a;
            default:
                if (o30Var instanceof hj1) {
                    hj1Var = (hj1) o30Var;
                    int i13 = hj1Var.n;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        hj1Var.n = i13 - Integer.MIN_VALUE;
                        Object obj8 = hj1Var.m;
                        b50 b50Var7 = b50.m;
                        i6 = hj1Var.n;
                        if (i6 != 0) {
                            ca2.b(obj8);
                            List list = (List) obj;
                            int a = li1.a(rv.l(list, 10));
                            if (a < 16) {
                                a = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                            for (Object obj9 : list) {
                                linkedHashMap.put(((kk) obj9).a, obj9);
                            }
                            hj1Var.n = 1;
                            if (ym0Var.d(linkedHashMap, hj1Var) == b50Var7) {
                                return b50Var7;
                            }
                        } else {
                            if (i6 != 1) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ca2.b(obj8);
                        }
                        return Unit.a;
                    }
                }
                hj1Var = new hj1(this, o30Var);
                Object obj82 = hj1Var.m;
                b50 b50Var72 = b50.m;
                i6 = hj1Var.n;
                if (i6 != 0) {
                }
                return Unit.a;
        }
    }
}
