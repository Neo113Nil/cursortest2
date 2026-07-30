package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kc0 implements ym0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public kc0(lc0 lc0Var, c82 c82Var, ym0 ym0Var) {
        this.m = 0;
        this.o = c82Var;
        this.n = ym0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x02c8, code lost:
    
        if (r2.d(r1, r3) == r6) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02af, code lost:
    
        if (r2 == r6) goto L147;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0187  */
    @Override // defpackage.ym0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, o30 o30Var) {
        jc0 jc0Var;
        int i;
        in0 in0Var;
        Object obj2;
        int i2;
        ln0 ln0Var;
        Object obj3;
        int i3;
        hi1 hi1Var;
        int i4;
        a41 a41Var;
        kc0 kc0Var = this;
        Object obj4 = obj;
        int i5 = kc0Var.m;
        Object obj5 = kc0Var.n;
        Object obj6 = kc0Var.o;
        switch (i5) {
            case 0:
                c82 c82Var = (c82) obj6;
                if (o30Var instanceof jc0) {
                    jc0Var = (jc0) o30Var;
                    int i6 = jc0Var.o;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        jc0Var.o = i6 - Integer.MIN_VALUE;
                        Object obj7 = jc0Var.m;
                        b50 b50Var = b50.m;
                        i = jc0Var.o;
                        if (i != 0) {
                            ca2.b(obj7);
                            Object obj8 = c82Var.m;
                            if (obj8 == yj1.k || !Intrinsics.b(obj8, obj4)) {
                                c82Var.m = obj4;
                                jc0Var.o = 1;
                                if (((ym0) obj5).d(obj4, jc0Var) == b50Var) {
                                    return b50Var;
                                }
                            }
                        } else {
                            if (i != 1) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ca2.b(obj7);
                        }
                        return Unit.a;
                    }
                }
                jc0Var = new jc0(kc0Var, o30Var);
                Object obj72 = jc0Var.m;
                b50 b50Var2 = b50.m;
                i = jc0Var.o;
                if (i != 0) {
                }
                return Unit.a;
            case 1:
                if (o30Var instanceof in0) {
                    in0Var = (in0) o30Var;
                    int i7 = in0Var.o;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        in0Var.o = i7 - Integer.MIN_VALUE;
                        obj2 = in0Var.n;
                        b50 b50Var3 = b50.m;
                        i2 = in0Var.o;
                        if (i2 != 0) {
                            ca2.b(obj2);
                            in0Var.m = kc0Var;
                            in0Var.q = obj4;
                            in0Var.o = 1;
                            obj2 = ((u60) obj6).invoke(obj4, in0Var);
                            break;
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    lh.g("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                kc0Var = in0Var.m;
                                ca2.b(obj2);
                                r4 = true;
                                if (r4) {
                                    return Unit.a;
                                }
                                throw new p(kc0Var);
                            }
                            Object obj9 = in0Var.q;
                            kc0 kc0Var2 = in0Var.m;
                            ca2.b(obj2);
                            obj4 = obj9;
                            kc0Var = kc0Var2;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            ym0 ym0Var = (ym0) kc0Var.n;
                            in0Var.m = kc0Var;
                            in0Var.q = null;
                            in0Var.o = 2;
                            break;
                        }
                        if (r4) {
                        }
                    }
                }
                in0Var = new in0(kc0Var, o30Var);
                obj2 = in0Var.n;
                b50 b50Var32 = b50.m;
                i2 = in0Var.o;
                if (i2 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                if (r4) {
                }
            case 2:
                if (o30Var instanceof ln0) {
                    ln0Var = (ln0) o30Var;
                    int i8 = ln0Var.o;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        ln0Var.o = i8 - Integer.MIN_VALUE;
                        obj3 = ln0Var.n;
                        b50 b50Var4 = b50.m;
                        i3 = ln0Var.o;
                        if (i3 != 0) {
                            ca2.b(obj3);
                            ln0Var.m = kc0Var;
                            ln0Var.q = obj4;
                            ln0Var.o = 1;
                            obj3 = ((Function2) obj5).invoke(obj4, ln0Var);
                            if (obj3 == b50Var4) {
                                return b50Var4;
                            }
                        } else {
                            if (i3 != 1) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj10 = ln0Var.q;
                            kc0 kc0Var3 = ln0Var.m;
                            ca2.b(obj3);
                            obj4 = obj10;
                            kc0Var = kc0Var3;
                        }
                        if (((Boolean) obj3).booleanValue()) {
                            return Unit.a;
                        }
                        ((c82) kc0Var.o).m = obj4;
                        throw new p(kc0Var);
                    }
                }
                ln0Var = new ln0(kc0Var, o30Var);
                obj3 = ln0Var.n;
                b50 b50Var42 = b50.m;
                i3 = ln0Var.o;
                if (i3 != 0) {
                }
                if (((Boolean) obj3).booleanValue()) {
                }
            case 3:
                a41 a41Var2 = (a41) obj4;
                ArrayList arrayList = (ArrayList) obj6;
                if (a41Var2 instanceof jo0) {
                    arrayList.add(a41Var2);
                } else if (a41Var2 instanceof ko0) {
                    arrayList.remove(((ko0) a41Var2).a);
                }
                ((zn1) obj5).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return Unit.a;
            case 4:
                ii1 ii1Var = (ii1) obj6;
                LinkedHashMap linkedHashMap = ii1Var.b;
                if (o30Var instanceof hi1) {
                    hi1Var = (hi1) o30Var;
                    int i9 = hi1Var.n;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        hi1Var.n = i9 - Integer.MIN_VALUE;
                        Object obj11 = hi1Var.m;
                        b50 b50Var5 = b50.m;
                        i4 = hi1Var.n;
                        if (i4 != 0) {
                            ca2.b(obj11);
                            ym0 ym0Var2 = (ym0) obj5;
                            a41 a41Var3 = (a41) obj4;
                            if (a41Var3 instanceof u42) {
                                u42 u42Var = new u42(au1.f(((u42) a41Var3).a, ii1Var.a));
                                linkedHashMap.put(a41Var3, u42Var);
                                a41Var = u42Var;
                            } else if (a41Var3 instanceof t42) {
                                t42 t42Var = (t42) a41Var3;
                                u42 u42Var2 = (u42) linkedHashMap.remove(t42Var.a);
                                a41Var = t42Var;
                                if (u42Var2 != null) {
                                    a41Var = new t42(u42Var2);
                                }
                            } else {
                                boolean z = a41Var3 instanceof v42;
                                a41Var = a41Var3;
                                if (z) {
                                    v42 v42Var = (v42) a41Var3;
                                    u42 u42Var3 = (u42) linkedHashMap.remove(v42Var.a);
                                    a41Var = v42Var;
                                    if (u42Var3 != null) {
                                        a41Var = new v42(u42Var3);
                                    }
                                }
                            }
                            hi1Var.n = 1;
                            if (ym0Var2.d(a41Var, hi1Var) == b50Var5) {
                                return b50Var5;
                            }
                        } else {
                            if (i4 != 1) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ca2.b(obj11);
                        }
                        return Unit.a;
                    }
                }
                hi1Var = new hi1(kc0Var, o30Var);
                Object obj112 = hi1Var.m;
                b50 b50Var52 = b50.m;
                i4 = hi1Var.n;
                if (i4 != 0) {
                }
                return Unit.a;
            case 5:
                ((zn1) obj6).setValue(Boolean.TRUE);
                ((hz1) obj5).i(((rm) obj4).c);
                return Unit.a;
            case 6:
                a41 a41Var4 = (a41) obj4;
                fb fbVar = (fb) obj6;
                if (a41Var4 instanceof u42) {
                    u42 u42Var4 = (u42) a41Var4;
                    wa2 wa2Var = fbVar.t;
                    if (wa2Var == null) {
                        wa2Var = eb2.a(fbVar.s);
                        fbVar.t = wa2Var;
                    }
                    ya2 a = wa2Var.a(fbVar);
                    a.b(u42Var4, fbVar.o, fbVar.w, fbVar.x, ((aw) fbVar.q.getValue()).a, ((qa2) fbVar.r.getValue()).d, fbVar.y);
                    fbVar.u.setValue(a);
                } else if (a41Var4 instanceof v42) {
                    ya2 ya2Var = (ya2) fbVar.u.getValue();
                    if (ya2Var != null) {
                        ya2Var.d();
                    }
                } else if (a41Var4 instanceof t42) {
                    ya2 ya2Var2 = (ya2) fbVar.u.getValue();
                    if (ya2Var2 != null) {
                        ya2Var2.d();
                    }
                } else {
                    fbVar.n.d(a41Var4, (a50) obj5);
                }
                return Unit.a;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                a41 a41Var5 = (a41) obj4;
                bb2 bb2Var = (bb2) obj6;
                if (!(a41Var5 instanceof w42)) {
                    a50 a50Var = (a50) obj5;
                    du duVar = bb2Var.F;
                    if (duVar == null) {
                        duVar = new du(bb2Var.E, bb2Var.B);
                        z71.F(bb2Var);
                        bb2Var.F = duVar;
                    }
                    duVar.d(a41Var5, a50Var);
                } else if (bb2Var.I) {
                    bb2Var.I0((w42) a41Var5);
                } else {
                    bb2Var.J.a(a41Var5);
                }
                return Unit.a;
            case 8:
                long j = ((au1) obj4).a;
                jc jcVar = (jc) obj6;
                if (ap.D(((au1) jcVar.d()).a) && ap.D(j) && au1.e(((au1) jcVar.d()).a) != au1.e(j)) {
                    z71.H((a50) obj5, null, new nh2(jcVar, j, (o30) null), 3);
                    return Unit.a;
                }
                Object e = jcVar.e(o30Var, new au1(j));
                return e == b50.m ? e : Unit.a;
            default:
                a41 a41Var6 = (a41) obj4;
                a82 a82Var = (a82) obj6;
                if (a41Var6 instanceof u42) {
                    a82Var.m++;
                } else if (a41Var6 instanceof v42) {
                    a82Var.m--;
                } else if (a41Var6 instanceof t42) {
                    a82Var.m--;
                }
                r4 = a82Var.m > 0;
                mx2 mx2Var = (mx2) obj5;
                if (mx2Var.C != r4) {
                    mx2Var.C = r4;
                    zm3.C(mx2Var);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ kc0(int i, Object obj, Object obj2, boolean z) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
    }

    public /* synthetic */ kc0(int i, Object obj, Object obj2) {
        this.m = i;
        this.o = obj;
        this.n = obj2;
    }
}
