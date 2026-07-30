package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class tm0 extends sf1 implements Function2 {
    public v11 i;
    public v11 j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ w11 n;
    public final /* synthetic */ z11 o;
    public final /* synthetic */ z11 p;
    public final /* synthetic */ float q;
    public final /* synthetic */ zr r;
    public final /* synthetic */ float s;
    public final /* synthetic */ d81 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm0(w11 w11Var, z11 z11Var, z11 z11Var2, float f, zr zrVar, float f2, d81 d81Var, dn dnVar) {
        super(2, dnVar);
        this.n = w11Var;
        this.o = z11Var;
        this.p = z11Var2;
        this.q = f;
        this.r = zrVar;
        this.s = f2;
        this.t = d81Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((tm0) h((dn) obj2, (b81) obj)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        tm0 tm0Var = new tm0(this.n, this.o, this.p, this.q, this.r, this.s, this.t, dnVar);
        tm0Var.m = obj;
        return tm0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ca  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0177 -> B:7:0x0178). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x018d -> B:8:0x0187). Please report as a decompilation issue!!! */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        b81 b81Var;
        v11 v11Var;
        char c;
        int i;
        int i2;
        b81 b81Var2;
        v11 v11Var2;
        v11 v11Var3;
        v11 v11Var4;
        z11 z11Var;
        w11 w11Var;
        Object obj2;
        z11 z11Var2;
        b81 b81Var3;
        int i3;
        tm0 tm0Var = this;
        tn tnVar = tn.d;
        int i4 = tm0Var.l;
        z11 z11Var3 = tm0Var.p;
        v11 v11Var5 = null;
        w11 w11Var2 = tm0Var.n;
        char c2 = 3;
        int i5 = 2;
        int i6 = 1;
        z11 z11Var4 = tm0Var.o;
        if (i4 == 0) {
            ca0.v(obj);
            b81Var = (b81) tm0Var.m;
            v11 v11Var6 = new v11();
            v11Var6.d = true;
            v11Var = v11Var6;
            if (!v11Var.d) {
            }
        } else if (i4 == 1) {
            v11 v11Var7 = tm0Var.j;
            v11Var4 = tm0Var.i;
            b81 b81Var4 = (b81) tm0Var.m;
            ca0.v(obj);
            v11Var2 = null;
            w11Var = w11Var2;
            c = 3;
            i = 2;
            i2 = 1;
            z11Var = z11Var4;
            b81Var2 = b81Var4;
            v11Var3 = v11Var7;
            obj2 = obj;
            v11Var3.d = ((Boolean) obj2).booleanValue();
            v11 v11Var8 = v11Var2;
            w11Var2 = w11Var;
            v11Var5 = v11Var8;
            tm0Var = this;
            z11Var4 = z11Var;
            b81Var = b81Var2;
            i6 = i2;
            i5 = i;
            c2 = c;
            v11Var = v11Var4;
            if (!v11Var.d) {
            }
        } else if (i4 == 2) {
            i3 = tm0Var.k;
            v11 v11Var9 = tm0Var.i;
            b81Var3 = (b81) tm0Var.m;
            ca0.v(obj);
            z11Var2 = z11Var3;
            v11Var = v11Var9;
            if (v11Var.d) {
            }
        } else {
            if (i4 != 3) {
                dd0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v11 v11Var10 = tm0Var.j;
            v11 v11Var11 = tm0Var.i;
            b81Var3 = (b81) tm0Var.m;
            ca0.v(obj);
            v11 v11Var12 = null;
            w11 w11Var3 = w11Var2;
            v11Var = v11Var10;
            char c3 = 3;
            int i7 = 2;
            int i8 = 1;
            z11 z11Var5 = z11Var4;
            Object b = obj;
            v11Var.d = ((Boolean) b).booleanValue();
            v11 v11Var13 = v11Var12;
            w11Var2 = w11Var3;
            v11Var5 = v11Var13;
            z11Var4 = z11Var5;
            v11Var = v11Var11;
            b81Var = b81Var3;
            i5 = i7;
            i6 = i8;
            c2 = c3;
            if (!v11Var.d) {
                v11Var.d = false;
                float floatValue = w11Var2.d - ((Number) ((q7) z11Var4.d).e.getValue()).floatValue();
                boolean z = ((qm0) z11Var3.d).c;
                zr zrVar = tm0Var.r;
                if (!z) {
                    float abs = Math.abs(floatValue);
                    float f = tm0Var.q;
                    if (abs >= f) {
                        float signum = Math.signum(floatValue) * f;
                        zrVar.c(b81Var, signum);
                        q7 q7Var = (q7) z11Var4.d;
                        q7 j = mo.j(q7Var, ((Number) q7Var.e.getValue()).floatValue() + signum);
                        z11Var4.d = j;
                        int a = pk0.a(Math.abs(w11Var2.d - ((Number) j.e.getValue()).floatValue()) / tm0Var.s);
                        if (a > 100) {
                            a = 100;
                        }
                        q7 q7Var2 = (q7) z11Var4.d;
                        float f2 = w11Var2.d;
                        zr zrVar2 = tm0Var.r;
                        z11Var2 = z11Var3;
                        int i9 = a;
                        sm0 sm0Var = new sm0(zrVar2, z11Var2, w11Var2, tm0Var.t, v11Var, 0);
                        v11 v11Var14 = v11Var;
                        tm0Var.m = b81Var;
                        tm0Var.i = v11Var14;
                        tm0Var.j = v11Var5;
                        tm0Var.k = i9;
                        tm0Var.l = i5;
                        zrVar2.getClass();
                        w11 w11Var4 = new w11();
                        w11Var4.d = ((Number) q7Var2.e.getValue()).floatValue();
                        b81 b81Var5 = b81Var;
                        Object g = ka0.g(q7Var2, new Float(f2), new sj1(i9, qu.a), new j7(w11Var4, zrVar2, b81Var5, sm0Var, 5), tm0Var);
                        if (g != tn.d) {
                            g = Unit.a;
                        }
                        if (g != tnVar) {
                            i3 = i9;
                            v11Var = v11Var14;
                            b81Var3 = b81Var5;
                            if (v11Var.d) {
                                tm0Var.m = b81Var3;
                                tm0Var.i = v11Var;
                                tm0Var.j = v11Var;
                                tm0Var.l = 3;
                                c3 = 3;
                                w11 w11Var5 = w11Var2;
                                v11Var12 = v11Var5;
                                w11Var3 = w11Var5;
                                i7 = i5;
                                z11Var5 = z11Var4;
                                z11Var3 = z11Var2;
                                i8 = 1;
                                b = zr.b(tm0Var.r, z11Var3, w11Var3, tm0Var.t, z11Var5, 50 - i3, tm0Var);
                                if (b != tnVar) {
                                    v11Var11 = v11Var;
                                    v11Var.d = ((Boolean) b).booleanValue();
                                    v11 v11Var132 = v11Var12;
                                    w11Var2 = w11Var3;
                                    v11Var5 = v11Var132;
                                    z11Var4 = z11Var5;
                                    v11Var = v11Var11;
                                    b81Var = b81Var3;
                                    i5 = i7;
                                    i6 = i8;
                                    c2 = c3;
                                    if (!v11Var.d) {
                                        return Unit.a;
                                    }
                                }
                            } else {
                                i8 = 1;
                                c3 = 3;
                                w11Var2 = w11Var2;
                                v11Var5 = v11Var5;
                                b81Var = b81Var3;
                                z11Var3 = z11Var2;
                                i6 = i8;
                                c2 = c3;
                                if (!v11Var.d) {
                                }
                            }
                        }
                        return tnVar;
                    }
                }
                w11 w11Var6 = w11Var2;
                v11Var2 = v11Var5;
                w11Var = w11Var6;
                b81Var2 = b81Var;
                c = c2;
                i = i5;
                z11Var = z11Var4;
                v11Var3 = v11Var;
                i2 = i6;
                zrVar.c(b81Var2, floatValue);
                tm0Var.m = b81Var2;
                tm0Var.i = v11Var3;
                tm0Var.j = v11Var3;
                tm0Var.l = i2;
                obj2 = zr.b(tm0Var.r, z11Var3, w11Var, tm0Var.t, z11Var, 50L, tm0Var);
                if (obj2 != tnVar) {
                    v11Var4 = v11Var3;
                    v11Var3.d = ((Boolean) obj2).booleanValue();
                    v11 v11Var82 = v11Var2;
                    w11Var2 = w11Var;
                    v11Var5 = v11Var82;
                    tm0Var = this;
                    z11Var4 = z11Var;
                    b81Var = b81Var2;
                    i6 = i2;
                    i5 = i;
                    c2 = c;
                    v11Var = v11Var4;
                    if (!v11Var.d) {
                    }
                }
                return tnVar;
            }
        }
    }
}
