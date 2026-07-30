package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sb1 extends z92 implements Function2 {
    public final /* synthetic */ int n;
    public int o;
    public /* synthetic */ Object p;
    public Object q;
    public Object r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb1(ot2 ot2Var, yf yfVar, bu2 bu2Var, o30 o30Var) {
        super(o30Var);
        this.n = 1;
        this.q = ot2Var;
        this.r = yfVar;
        this.s = bu2Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.n;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                sb1 sb1Var = new sb1(0, o30Var, (q80) obj2);
                sb1Var.p = obj;
                return sb1Var;
            case 1:
                sb1 sb1Var2 = new sb1((ot2) this.q, (yf) this.r, (bu2) obj2, o30Var);
                sb1Var2.p = obj;
                return sb1Var2;
            default:
                sb1 sb1Var3 = new sb1(2, o30Var, (zp2) obj2);
                sb1Var3.p = obj;
                return sb1Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ur2 ur2Var = (ur2) obj;
        o30 o30Var = (o30) obj2;
        switch (this.n) {
        }
        return ((sb1) create(ur2Var, o30Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0207, code lost:
    
        if (defpackage.zm3.i(r2, r4, r5, r3, r18) == r1) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x021b, code lost:
    
        if (defpackage.zm3.j(r2, (defpackage.bu2) r7, r3, r18) == r1) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01cc, code lost:
    
        if (r3 == r1) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0287, code lost:
    
        if (r3 == r2) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0266, code lost:
    
        if (r4 == r2) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0154, code lost:
    
        if (r2 != r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c6, code lost:
    
        if (r10 != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x005f, code lost:
    
        if (r9 == r1) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x0287 -> B:115:0x028b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0154 -> B:9:0x0158). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00c6 -> B:30:0x00ca). Please report as a decompilation issue!!! */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ur2 ur2Var;
        Object b;
        t22 t22Var;
        ur2 ur2Var2;
        ur2 ur2Var3;
        Object h;
        ur2 ur2Var4;
        Object b2;
        ur2 ur2Var5;
        n22 n22Var;
        t22 t22Var2;
        Object a;
        n22 n22Var2;
        Object obj2;
        t22 t22Var3;
        ur2 ur2Var6;
        Object a2;
        Object obj3;
        int i = this.n;
        int i2 = 2;
        Object obj4 = this.s;
        t22 t22Var4 = null;
        switch (i) {
            case 0:
                lz1 lz1Var = ((q80) obj4).a;
                b50 b50Var = b50.m;
                int i3 = this.o;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            t22 t22Var5 = (t22) this.r;
                            t22Var = (t22) this.q;
                            ur2Var2 = (ur2) this.p;
                            ca2.b(obj);
                            t22Var4 = t22Var5;
                            Object a3 = obj;
                            m22 m22Var = (m22) a3;
                            List list = m22Var.a;
                            int size = list.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size) {
                                    t22Var4 = (t22) m22Var.a.get(0);
                                } else if (s93.A((t22) list.get(i4))) {
                                    i4++;
                                }
                            }
                            if (t22Var4 != null) {
                                n22 n22Var3 = n22.m;
                                this.p = ur2Var2;
                                this.q = t22Var;
                                this.r = t22Var4;
                                this.o = 2;
                                a3 = ur2Var2.a(n22Var3, this);
                                break;
                            } else {
                                lz1Var.setValue(new au1(au1.f(t22Var4.c, t22Var.c)));
                                break;
                            }
                        } else {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        ur2Var = (ur2) this.p;
                        ca2.b(obj);
                        b = obj;
                    }
                } else {
                    ca2.b(obj);
                    ur2Var = (ur2) this.p;
                    n22 n22Var4 = n22.m;
                    this.p = ur2Var;
                    this.o = 1;
                    b = zs2.b(ur2Var, false, n22Var4, this);
                    break;
                }
                t22Var = (t22) b;
                lz1Var.setValue(new au1(0L));
                ur2Var2 = ur2Var;
                if (t22Var4 != null) {
                }
            case 1:
                b50 b50Var2 = b50.m;
                int i5 = this.o;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2 && i5 != 3) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            ca2.b(obj);
                            break;
                        }
                    } else {
                        ur2Var3 = (ur2) this.p;
                        ca2.b(obj);
                        h = obj;
                    }
                } else {
                    ca2.b(obj);
                    ur2Var3 = (ur2) this.p;
                    this.p = ur2Var3;
                    this.o = 1;
                    h = zm3.h(ur2Var3, this);
                    break;
                }
                m22 m22Var2 = (m22) h;
                if (zm3.E(m22Var2) && (m22Var2.b & 33) != 0) {
                    List list2 = m22Var2.a;
                    int size2 = list2.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        if (!((t22) list2.get(i6)).b()) {
                        }
                    }
                    ot2 ot2Var = (ot2) this.q;
                    yf yfVar = (yf) this.r;
                    this.p = null;
                    this.o = 2;
                    break;
                }
                if (!zm3.E(m22Var2)) {
                    this.p = null;
                    this.o = 3;
                    break;
                }
                break;
            default:
                zp2 zp2Var = (zp2) obj4;
                b50 b50Var3 = b50.m;
                int i7 = this.o;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 == 3) {
                                t22Var3 = (t22) this.q;
                                ur2Var6 = (ur2) this.p;
                                ca2.b(obj);
                                a2 = obj;
                                List list3 = ((m22) a2).a;
                                int size3 = list3.size();
                                int i8 = 0;
                                while (true) {
                                    if (i8 < size3) {
                                        obj3 = list3.get(i8);
                                        t22 t22Var6 = (t22) obj3;
                                        if (t22Var6.b() || !s22.a(t22Var6.a, t22Var3.a) || !t22Var6.d) {
                                            i8++;
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                t22 t22Var7 = (t22) obj3;
                                if (t22Var7 == null) {
                                    break;
                                } else {
                                    t22Var7.a();
                                    n22 n22Var5 = n22.m;
                                    this.p = ur2Var6;
                                    this.q = t22Var3;
                                    this.r = null;
                                    this.o = 3;
                                    a2 = ur2Var6.a(n22Var5, this);
                                    break;
                                }
                            } else {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            n22Var = (n22) this.r;
                            t22Var2 = (t22) this.q;
                            ur2Var5 = (ur2) this.p;
                            ca2.b(obj);
                            a = obj;
                            List list4 = ((m22) a).a;
                            int size4 = list4.size();
                            int i9 = 0;
                            while (true) {
                                if (i9 < size4) {
                                    obj2 = list4.get(i9);
                                    t22 t22Var8 = (t22) obj2;
                                    if (t22Var8.b()) {
                                        n22Var2 = n22Var;
                                    } else {
                                        n22Var2 = n22Var;
                                        if (s22.a(t22Var8.a, t22Var2.a) && t22Var8.d) {
                                        }
                                    }
                                    i9++;
                                    n22Var = n22Var2;
                                } else {
                                    n22Var2 = n22Var;
                                    obj2 = null;
                                }
                            }
                            t22 t22Var9 = (t22) obj2;
                            if (t22Var9 != null && t22Var9.b - t22Var2.b < ur2Var5.h().c()) {
                                if (au1.c(au1.f(t22Var9.c, t22Var2.c)) <= ur2Var5.h().e()) {
                                    n22Var = n22Var2;
                                    i2 = 2;
                                    this.p = ur2Var5;
                                    this.q = t22Var2;
                                    this.r = n22Var;
                                    this.o = i2;
                                    a = ur2Var5.a(n22Var, this);
                                    break;
                                }
                            } else {
                                t22Var9 = null;
                            }
                            if (t22Var9 == null || !((Boolean) zp2Var.C.invoke()).booleanValue()) {
                                break;
                            } else {
                                t22Var9.a();
                                t22Var3 = t22Var2;
                                ur2Var6 = ur2Var5;
                                n22 n22Var52 = n22.m;
                                this.p = ur2Var6;
                                this.q = t22Var3;
                                this.r = null;
                                this.o = 3;
                                a2 = ur2Var6.a(n22Var52, this);
                            }
                        }
                    } else {
                        ur2Var4 = (ur2) this.p;
                        ca2.b(obj);
                        b2 = obj;
                    }
                } else {
                    ca2.b(obj);
                    ur2Var4 = (ur2) this.p;
                    n22 n22Var6 = n22.m;
                    this.p = ur2Var4;
                    this.o = 1;
                    b2 = zs2.b(ur2Var4, true, n22Var6, this);
                    break;
                }
                t22 t22Var10 = (t22) b2;
                int i10 = t22Var10.i;
                long j = t22Var10.c;
                if (i10 != 3 && i10 != 4) {
                    break;
                } else {
                    ur2Var5 = ur2Var4;
                    n22Var = (zp2Var.D || (au1.d(j) >= 0.0f && au1.d(j) < ((float) ((int) (ur2Var4.r.K >> 32))) && au1.e(j) >= 0.0f && au1.e(j) < ((float) ((int) (ur2Var4.r.K & 4294967295L))))) ? n22.m : n22.n;
                    t22Var2 = t22Var10;
                    this.p = ur2Var5;
                    this.q = t22Var2;
                    this.r = n22Var;
                    this.o = i2;
                    a = ur2Var5.a(n22Var, this);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sb1(int i, o30 o30Var, Object obj) {
        super(o30Var);
        this.n = i;
        this.s = obj;
    }
}
