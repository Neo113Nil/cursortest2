package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class a80 extends pr2 implements Function2 {
    public final /* synthetic */ int m = 0;
    public z72 n;
    public int o;
    public final /* synthetic */ float p;
    public Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ ff2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a80(im2 im2Var, float f, Function1 function1, ff2 ff2Var, o30 o30Var) {
        super(2, o30Var);
        this.q = im2Var;
        this.p = f;
        this.r = function1;
        this.s = ff2Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        Object obj2 = this.r;
        switch (i) {
            case 0:
                yf2 yf2Var = (yf2) this.s;
                return new a80(this.p, (b80) obj2, yf2Var, o30Var);
            default:
                ff2 ff2Var = this.s;
                return new a80((im2) this.q, this.p, (Function1) obj2, ff2Var, o30Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a50 a50Var = (a50) obj;
        o30 o30Var = (o30) obj2;
        switch (this.m) {
        }
        return ((a80) create(a50Var, o30Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0113, code lost:
    
        if (r1 == r12) goto L93;
     */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        z72 z72Var;
        nd ndVar;
        float f;
        int i;
        long j;
        float f2;
        z72 z72Var2;
        Object b;
        float f3;
        int i2 = this.m;
        float f4 = this.p;
        Object obj2 = this.r;
        switch (i2) {
            case 0:
                b50 b50Var = b50.m;
                int i3 = this.o;
                if (i3 == 0) {
                    ca2.b(obj);
                    if (Math.abs(f4) > 1.0f) {
                        z72Var = new z72();
                        z72Var.m = f4;
                        z72 z72Var3 = new z72();
                        nd i4 = tk3.i(0.0f, f4);
                        try {
                            b80 b80Var = (b80) obj2;
                            q70 q70Var = b80Var.a;
                            oc ocVar = new oc(z72Var3, (yf2) this.s, z72Var, b80Var);
                            this.n = z72Var;
                            this.q = i4;
                            this.o = 1;
                            if (nk2.e(i4, q70Var, false, ocVar, this) == b50Var) {
                                return b50Var;
                            }
                        } catch (CancellationException unused) {
                            ndVar = i4;
                            z72Var.m = ((Number) ndVar.a()).floatValue();
                            f4 = z72Var.m;
                            return new Float(f4);
                        }
                    }
                    return new Float(f4);
                }
                if (i3 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ndVar = (nd) this.q;
                z72Var = this.n;
                try {
                    ca2.b(obj);
                } catch (CancellationException unused2) {
                    z72Var.m = ((Number) ndVar.a()).floatValue();
                    f4 = z72Var.m;
                    return new Float(f4);
                }
                f4 = z72Var.m;
                return new Float(f4);
            default:
                Function1 function1 = (Function1) obj2;
                im2 im2Var = (im2) this.q;
                tt1 tt1Var = im2Var.a;
                b50 b50Var2 = b50.m;
                int i5 = this.o;
                if (i5 == 0) {
                    ca2.b(obj);
                    q70 q70Var2 = im2Var.b;
                    k03 k03Var = v33.a;
                    float f5 = ((od) new js0(q70Var2.a).v(new od(0.0f), new od(f4))).a;
                    q80 q80Var = (q80) tt1Var.n;
                    lz1 lz1Var = q80Var.o;
                    int n = ((ky1) lz1Var.getValue()).c + q80Var.n();
                    if (n == 0) {
                        f2 = 0.0f;
                        f = 0.0f;
                    } else {
                        int i6 = q80Var.d;
                        if (f4 < 0.0f) {
                            i6++;
                        }
                        int c = d.c(((int) (f5 / n)) + i6, 0, q80Var.m());
                        q80Var.n();
                        int i7 = ((ky1) lz1Var.getValue()).c;
                        long j2 = i6;
                        long j3 = j2 - 1;
                        if (j3 < 0) {
                            i = n;
                            f = 0.0f;
                            j = 0;
                        } else {
                            f = 0.0f;
                            i = n;
                            j = j3;
                        }
                        int i8 = (int) j;
                        long j4 = j2 + 1;
                        if (j4 > 2147483647L) {
                            j4 = 2147483647L;
                        }
                        int abs = Math.abs((d.c(d.c(c, i8, (int) j4), 0, q80Var.m()) - i6) * i) - i;
                        if (abs < 0) {
                            abs = 0;
                        }
                        f2 = abs == 0 ? abs : Math.signum(f4) * abs;
                    }
                    if (!Float.isNaN(f2)) {
                        z72Var2 = new z72();
                        float signum = Math.signum(f4) * Math.abs(f2);
                        z72Var2.m = signum;
                        function1.invoke(new Float(signum));
                        float f6 = z72Var2.m;
                        fm2 fm2Var = new fm2(z72Var2, function1, 1);
                        this.n = z72Var2;
                        this.o = 1;
                        b = im2.b(im2Var, this.s, f6, this.p, fm2Var, this);
                        break;
                    } else {
                        lh.g("calculateApproachOffset returned NaN. Please use a valid value.");
                        return null;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            ca2.b(obj);
                            return obj;
                        }
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z72 z72Var4 = this.n;
                    ca2.b(obj);
                    f = 0.0f;
                    z72Var2 = z72Var4;
                    b = obj;
                }
                nd ndVar2 = (nd) b;
                float floatValue = ((Number) ndVar2.a()).floatValue();
                q80 q80Var2 = (q80) tt1Var.n;
                by1 by1Var = q80Var2.l().m;
                List list = q80Var2.l().a;
                int size = list.size();
                int i9 = 0;
                float f7 = Float.NEGATIVE_INFINITY;
                float f8 = Float.POSITIVE_INFINITY;
                while (i9 < size) {
                    rj1 rj1Var = (rj1) list.get(i9);
                    ky1 l = q80Var2.l();
                    ww1 ww1Var = l.e;
                    float f9 = floatValue;
                    ww1 ww1Var2 = ww1.m;
                    l.f();
                    int i10 = q80Var2.l().f;
                    int i11 = q80Var2.l().d;
                    int i12 = q80Var2.l().b;
                    int i13 = rj1Var.l;
                    q80Var2.m();
                    by1Var.getClass();
                    float f10 = i13 - f;
                    if (f10 <= f && f10 > f7) {
                        f7 = f10;
                    }
                    if (f10 >= f && f10 < f8) {
                        f8 = f10;
                    }
                    i9++;
                    floatValue = f9;
                }
                float f11 = floatValue;
                float f12 = f7 == Float.NEGATIVE_INFINITY ? f8 : f7;
                if (f8 == Float.POSITIVE_INFINITY) {
                    f8 = f12;
                }
                boolean z = j8.w(q80Var2) == f;
                if (!q80Var2.c()) {
                    if (z || !j8.O(q80Var2)) {
                        f8 = f;
                    } else {
                        f12 = f;
                        f8 = f12;
                    }
                }
                if (q80Var2.a()) {
                    f3 = f8;
                } else if (z || j8.O(q80Var2)) {
                    f3 = f8;
                    f12 = f;
                } else {
                    f3 = f;
                    f12 = f3;
                }
                float floatValue2 = ((Number) ((j30) tt1Var.o).a(Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f3))).floatValue();
                if (floatValue2 != f12 && floatValue2 != f3 && floatValue2 != f) {
                    throw new IllegalStateException(("Final Snapping Offset Should Be one of " + f12 + ", " + f3 + " or 0.0").toString());
                }
                float f13 = (floatValue2 == Float.POSITIVE_INFINITY || floatValue2 == Float.NEGATIVE_INFINITY) ? f : floatValue2;
                if (Float.isNaN(f13)) {
                    lh.g("calculateSnapOffset returned NaN. Please use a valid value.");
                    return null;
                }
                z72Var2.m = f13;
                nd C = tk3.C(ndVar2, f, 30);
                eo2 eo2Var = im2Var.c;
                fm2 fm2Var2 = new fm2(z72Var2, function1, 0);
                this.n = null;
                this.o = 2;
                Object d = yh2.d(this.s, f13, f13, C, eo2Var, fm2Var2, this);
                if (d != b50Var2) {
                    return d;
                }
                return b50Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a80(float f, b80 b80Var, yf2 yf2Var, o30 o30Var) {
        super(2, o30Var);
        this.p = f;
        this.r = b80Var;
        this.s = yf2Var;
    }
}
