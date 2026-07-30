package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ot implements ym0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public ot(c82 c82Var, ym0 ym0Var, String[] strArr, int[] iArr) {
        this.m = 3;
        this.n = c82Var;
        this.q = ym0Var;
        this.o = strArr;
        this.p = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r4.d(r2, r5) == r6) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ac, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00aa, code lost:
    
        if (r4.d(r2, r5) == r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(int[] iArr, o30 o30Var) {
        zz2 zz2Var;
        int i;
        ot otVar = this;
        int[] iArr2 = iArr;
        String[] strArr = (String[]) otVar.o;
        ym0 ym0Var = (ym0) otVar.q;
        if (o30Var instanceof zz2) {
            zz2Var = (zz2) o30Var;
            int i2 = zz2Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zz2Var.q = i2 - Integer.MIN_VALUE;
                Object obj = zz2Var.o;
                b50 b50Var = b50.m;
                i = zz2Var.q;
                Object obj2 = null;
                if (i != 0) {
                    ca2.b(obj);
                    c82 c82Var = (c82) otVar.n;
                    if (c82Var.m == null) {
                        Set z = oi.z(strArr);
                        zz2Var.m = otVar;
                        zz2Var.n = iArr2;
                        zz2Var.q = 1;
                    } else {
                        int[] iArr3 = (int[]) otVar.p;
                        ArrayList arrayList = new ArrayList();
                        int length = strArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            String str = strArr[i3];
                            int i5 = i4 + 1;
                            Object obj3 = obj2;
                            Object obj4 = c82Var.m;
                            if (obj4 == null) {
                                lh.g("Required value was null.");
                                return obj3;
                            }
                            int i6 = iArr3[i4];
                            if (((int[]) obj4)[i6] != iArr2[i6]) {
                                arrayList.add(str);
                            }
                            i3++;
                            obj2 = obj3;
                            i4 = i5;
                        }
                        if (!arrayList.isEmpty()) {
                            Set Q = zv.Q(arrayList);
                            zz2Var.m = otVar;
                            zz2Var.n = iArr2;
                            zz2Var.q = 2;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int[] iArr4 = zz2Var.n;
                    ot otVar2 = zz2Var.m;
                    ca2.b(obj);
                    iArr2 = iArr4;
                    otVar = otVar2;
                }
                ((c82) otVar.n).m = iArr2;
                return Unit.a;
            }
        }
        zz2Var = new zz2(otVar, o30Var);
        Object obj5 = zz2Var.o;
        b50 b50Var2 = b50.m;
        i = zz2Var.q;
        Object obj22 = null;
        if (i != 0) {
        }
        ((c82) otVar.n).m = iArr2;
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f4  */
    @Override // defpackage.ym0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, o30 o30Var) {
        nt ntVar;
        int i;
        int i2 = this.m;
        Object obj2 = this.q;
        boolean z = true;
        Object obj3 = this.o;
        Object obj4 = this.p;
        Object obj5 = this.n;
        switch (i2) {
            case 0:
                if (o30Var instanceof nt) {
                    ntVar = (nt) o30Var;
                    int i3 = ntVar.q;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ntVar.q = i3 - Integer.MIN_VALUE;
                        Object obj6 = ntVar.o;
                        b50 b50Var = b50.m;
                        i = ntVar.q;
                        if (i != 0) {
                            ca2.b(obj6);
                            g61 g61Var = (g61) ((c82) obj5).m;
                            if (g61Var != null) {
                                g61Var.f(new zt("Child of the scoped flow was cancelled"));
                                ntVar.m = this;
                                ntVar.n = obj;
                                ntVar.q = 1;
                                if (g61Var.J(ntVar) == b50Var) {
                                    return b50Var;
                                }
                            }
                        } else {
                            if (i != 1) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = ntVar.n;
                            this = ntVar.m;
                            ca2.b(obj6);
                        }
                        c82 c82Var = (c82) this.n;
                        a50 a50Var = (a50) this.o;
                        d50 d50Var = d50.m;
                        c82Var.m = z71.H(a50Var, null, new mt((pt) this.p, (ym0) this.q, obj, null), 1);
                        return Unit.a;
                    }
                }
                ntVar = new nt(this, o30Var);
                Object obj62 = ntVar.o;
                b50 b50Var2 = b50.m;
                i = ntVar.q;
                if (i != 0) {
                }
                c82 c82Var2 = (c82) this.n;
                a50 a50Var2 = (a50) this.o;
                d50 d50Var2 = d50.m;
                c82Var2.m = z71.H(a50Var2, null, new mt((pt) this.p, (ym0) this.q, obj, null), 1);
                return Unit.a;
            case 1:
                gv2 gv2Var = (gv2) obj4;
                sc1 sc1Var = (sc1) obj5;
                if (((Boolean) obj).booleanValue() && sc1Var.b()) {
                    s93.x((sv2) obj3, sc1Var, gv2Var.j(), (c11) obj2, gv2Var.b);
                } else {
                    s93.u(sc1Var);
                }
                return Unit.a;
            case 2:
                a41 a41Var = (a41) obj;
                a82 a82Var = (a82) obj4;
                a82 a82Var2 = (a82) obj3;
                a82 a82Var3 = (a82) obj5;
                if (a41Var instanceof u42) {
                    a82Var3.m++;
                } else if (a41Var instanceof v42) {
                    a82Var3.m--;
                } else if (a41Var instanceof t42) {
                    a82Var3.m--;
                } else if (a41Var instanceof cy0) {
                    a82Var2.m++;
                } else if (a41Var instanceof dy0) {
                    a82Var2.m--;
                } else if (a41Var instanceof jo0) {
                    a82Var.m++;
                } else if (a41Var instanceof ko0) {
                    a82Var.m--;
                }
                boolean z2 = false;
                boolean z3 = a82Var3.m > 0;
                boolean z4 = a82Var2.m > 0;
                boolean z5 = a82Var.m > 0;
                v70 v70Var = (v70) obj2;
                if (v70Var.B != z3) {
                    v70Var.B = z3;
                    z2 = true;
                }
                if (v70Var.C != z4) {
                    v70Var.C = z4;
                    z2 = true;
                }
                if (v70Var.D != z5) {
                    v70Var.D = z5;
                } else {
                    z = z2;
                }
                if (z) {
                    z71.F(v70Var);
                }
                return Unit.a;
            default:
                return a((int[]) obj, o30Var);
        }
    }

    public /* synthetic */ ot(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
        this.q = obj4;
    }
}
