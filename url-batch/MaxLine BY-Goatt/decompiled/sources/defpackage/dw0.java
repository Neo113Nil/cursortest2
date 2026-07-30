package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dw0 {
    public final ew0 a;
    public Outline f;
    public float j;
    public bx1 k;
    public oa l;
    public oa m;
    public boolean n;
    public ns o;
    public vs3 p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public ca0 b = o70.d;
    public u81 c = u81.m;
    public Function1 d = bl0.t;
    public final j6 e = new j6(17, this);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final du r = new du();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    public dw0(ew0 ew0Var) {
        this.a = ew0Var;
        ew0Var.t(false);
        this.t = 0L;
        this.u = 0L;
        this.v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.w;
            Outline outline2 = null;
            ew0 ew0Var = this.a;
            if (z || ew0Var.G() > 0.0f) {
                oa oaVar = this.l;
                if (oaVar != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    boolean z2 = oaVar instanceof oa;
                    if (!z2) {
                        ch2.h("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = oaVar.a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            c2.o(outline, oaVar);
                        } else {
                            if (!z2) {
                                ch2.h("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(path);
                        }
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = oaVar;
                    if (outline != null) {
                        outline.setAlpha(ew0Var.a());
                        outline2 = outline;
                    }
                    ew0Var.k(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.n && this.w) {
                        ew0Var.t(false);
                        ew0Var.p();
                    } else {
                        ew0Var.t(this.w);
                    }
                } else {
                    ew0Var.t(this.w);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long Q = zm3.Q(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        Q = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (Q >> 32);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (Q & 4294967295L)) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(ew0Var.a());
                    ew0Var.k(outline5, (4294967295L & Math.round(Float.intBitsToFloat(r15))) | (Math.round(Float.intBitsToFloat(i4)) << 32));
                }
            } else {
                ew0Var.t(false);
                ew0Var.k(null, 0L);
            }
        }
        this.g = false;
    }

    public final void b() {
        if (this.s && this.q == 0) {
            du duVar = this.r;
            dw0 dw0Var = (dw0) duVar.b;
            if (dw0Var != null) {
                dw0Var.e();
                duVar.b = null;
            }
            un1 un1Var = (un1) duVar.d;
            if (un1Var != null) {
                Object[] objArr = un1Var.b;
                long[] jArr = un1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    ((dw0) objArr[(i << 3) + i3]).e();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                un1Var.b();
            }
            this.a.p();
        }
    }

    public final void c(yd0 yd0Var) {
        du duVar = this.r;
        duVar.c = (dw0) duVar.b;
        un1 un1Var = (un1) duVar.d;
        if (un1Var != null && un1Var.h()) {
            un1 un1Var2 = (un1) duVar.e;
            if (un1Var2 == null) {
                int i = pe2.a;
                un1Var2 = new un1();
                duVar.e = un1Var2;
            }
            un1Var2.i(un1Var);
            un1Var.b();
        }
        duVar.a = true;
        this.d.invoke(yd0Var);
        duVar.a = false;
        dw0 dw0Var = (dw0) duVar.c;
        if (dw0Var != null) {
            dw0Var.e();
        }
        un1 un1Var3 = (un1) duVar.e;
        if (un1Var3 == null || !un1Var3.h()) {
            return;
        }
        Object[] objArr = un1Var3.b;
        long[] jArr = un1Var3.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            ((dw0) objArr[(i2 << 3) + i4]).e();
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        un1Var3.b();
    }

    public final bx1 d() {
        bx1 zw1Var;
        bx1 bx1Var = this.k;
        oa oaVar = this.l;
        if (bx1Var != null) {
            return bx1Var;
        }
        if (oaVar != null) {
            yw1 yw1Var = new yw1(oaVar);
            this.k = yw1Var;
            return yw1Var;
        }
        long Q = zm3.Q(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            Q = j2;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (Q >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (Q & 4294967295L)) + intBitsToFloat2;
        if (this.j > 0.0f) {
            zw1Var = new ax1(l41.l(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            zw1Var = new zw1(new w72(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.k = zw1Var;
        return zw1Var;
    }

    public final void e() {
        this.q--;
        b();
    }

    public final void f(float f, long j, long j2) {
        if (au1.b(this.h, j) && ql2.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = j;
        this.i = j2;
        this.j = f;
        a();
    }
}
