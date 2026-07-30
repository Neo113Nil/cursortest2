package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class jm1 extends dm1 {
    public final q50 b;
    public String c;
    public boolean d;
    public final eu e;
    public Function0 f;
    public final av0 g;
    public md h;
    public final av0 i;
    public long j;
    public float k;
    public float l;
    public final im1 m;

    public jm1(q50 q50Var) {
        this.b = q50Var;
        q50Var.i = new im1(this, 0);
        this.c = "";
        this.d = true;
        this.e = new eu();
        this.f = xl.o;
        this.g = gb0.F(null);
        this.i = gb0.F(new va1(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new im1(this, 1);
    }

    @Override // defpackage.dm1
    public final void a(hu huVar) {
        e(huVar, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(hu huVar, float f, md mdVar) {
        int i;
        boolean z;
        eu euVar;
        md mdVar2;
        t5 t5Var;
        long j;
        t5 h;
        hu huVar2;
        md mdVar3;
        t5 t5Var2;
        t5 t5Var3;
        int i2;
        int i3;
        q50 q50Var = this.b;
        boolean z2 = q50Var.d;
        int i4 = 3;
        av0 av0Var = this.g;
        if (z2 && q50Var.e != 16) {
            md mdVar4 = (md) av0Var.getValue();
            nv nvVar = mm1.a;
            if (!(mdVar4 instanceof md) ? mdVar4 == null : !((i3 = mdVar4.c) != 5 && i3 != 3)) {
                if (!(mdVar instanceof md) ? mdVar == null : !((i2 = mdVar.c) != 5 && i2 != 3)) {
                    i = 1;
                    z = this.d;
                    euVar = this.e;
                    if (!z && va1.a(this.j, huVar.x())) {
                        t5Var3 = euVar.a;
                        if (t5Var3 != null) {
                            Bitmap.Config config = t5Var3.a.getConfig();
                            config.getClass();
                            if (config == Bitmap.Config.ALPHA_8) {
                                i4 = 1;
                            } else if (config == Bitmap.Config.RGB_565) {
                                i4 = 2;
                            } else if (config != Bitmap.Config.ARGB_4444) {
                                if (config != Bitmap.Config.RGBA_F16) {
                                    if (config == Bitmap.Config.HARDWARE) {
                                        i4 = 4;
                                    }
                                }
                            }
                            if (i == i4) {
                                huVar2 = huVar;
                                if (mdVar == null) {
                                    mdVar3 = mdVar;
                                } else {
                                    mdVar3 = ((md) av0Var.getValue()) != null ? (md) av0Var.getValue() : this.h;
                                }
                                t5Var2 = euVar.a;
                                if (t5Var2 == null) {
                                    o80.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                                }
                                hu.R(huVar2, t5Var2, euVar.c, 0L, 0L, f, mdVar3, 0, 858);
                            }
                        }
                        i4 = 0;
                        if (i == i4) {
                        }
                    }
                    if (i != 1) {
                        long j2 = q50Var.e;
                        nv nvVar2 = mm1.a;
                        if (hi.d(j2) != 1.0f) {
                            j2 = hi.b(1.0f, j2);
                        }
                        mdVar2 = new md(5, j2);
                    } else {
                        mdVar2 = null;
                    }
                    this.h = mdVar2;
                    float intBitsToFloat = Float.intBitsToFloat((int) (huVar.x() >> 32));
                    av0 av0Var2 = this.i;
                    this.k = intBitsToFloat / Float.intBitsToFloat((int) (((va1) av0Var2.getValue()).a >> 32));
                    this.l = Float.intBitsToFloat((int) (huVar.x() & 4294967295L)) / Float.intBitsToFloat((int) (((va1) av0Var2.getValue()).a & 4294967295L));
                    long ceil = (((int) Math.ceil(Float.intBitsToFloat((int) (huVar.x() & 4294967295L)))) & 4294967295L) | (((int) Math.ceil(Float.intBitsToFloat((int) (huVar.x() >> 32)))) << 32);
                    vc0 layoutDirection = huVar.getLayoutDirection();
                    t5Var = euVar.a;
                    j3 j3Var = euVar.b;
                    if (t5Var != null || j3Var == null) {
                        j = 4294967295L;
                    } else {
                        j = 4294967295L;
                        int i5 = (int) (ceil >> 32);
                        Bitmap bitmap = t5Var.a;
                        if (i5 <= bitmap.getWidth() && ((int) (ceil & 4294967295L)) <= bitmap.getHeight() && euVar.d == i) {
                            h = t5Var;
                            euVar.c = ceil;
                            zf zfVar = euVar.e;
                            long x = ca0.x(ceil);
                            yf yfVar = zfVar.d;
                            nr nrVar = yfVar.a;
                            vc0 vc0Var = yfVar.b;
                            xf xfVar = yfVar.c;
                            long j3 = yfVar.d;
                            huVar2 = huVar;
                            yfVar.a = huVar2;
                            yfVar.b = layoutDirection;
                            yfVar.c = j3Var;
                            yfVar.d = x;
                            j3Var.k();
                            hu.V(zfVar, hi.b, 0L, 0L, 62);
                            this.m.invoke(zfVar);
                            j3Var.i();
                            yf yfVar2 = zfVar.d;
                            yfVar2.a = nrVar;
                            yfVar2.b = vc0Var;
                            yfVar2.c = xfVar;
                            yfVar2.d = j3;
                            h.a.prepareToDraw();
                            this.d = false;
                            this.j = huVar2.x();
                            if (mdVar == null) {
                            }
                            t5Var2 = euVar.a;
                            if (t5Var2 == null) {
                            }
                            hu.R(huVar2, t5Var2, euVar.c, 0L, 0L, f, mdVar3, 0, 858);
                        }
                    }
                    h = p4.h((int) (ceil >> 32), (int) (ceil & j), i);
                    Canvas canvas = k3.a;
                    j3Var = new j3();
                    j3Var.a = new Canvas(h.a);
                    euVar.a = h;
                    euVar.b = j3Var;
                    euVar.d = i;
                    euVar.c = ceil;
                    zf zfVar2 = euVar.e;
                    long x2 = ca0.x(ceil);
                    yf yfVar3 = zfVar2.d;
                    nr nrVar2 = yfVar3.a;
                    vc0 vc0Var2 = yfVar3.b;
                    xf xfVar2 = yfVar3.c;
                    long j32 = yfVar3.d;
                    huVar2 = huVar;
                    yfVar3.a = huVar2;
                    yfVar3.b = layoutDirection;
                    yfVar3.c = j3Var;
                    yfVar3.d = x2;
                    j3Var.k();
                    hu.V(zfVar2, hi.b, 0L, 0L, 62);
                    this.m.invoke(zfVar2);
                    j3Var.i();
                    yf yfVar22 = zfVar2.d;
                    yfVar22.a = nrVar2;
                    yfVar22.b = vc0Var2;
                    yfVar22.c = xfVar2;
                    yfVar22.d = j32;
                    h.a.prepareToDraw();
                    this.d = false;
                    this.j = huVar2.x();
                    if (mdVar == null) {
                    }
                    t5Var2 = euVar.a;
                    if (t5Var2 == null) {
                    }
                    hu.R(huVar2, t5Var2, euVar.c, 0L, 0L, f, mdVar3, 0, 858);
                }
            }
        }
        i = 0;
        z = this.d;
        euVar = this.e;
        if (!z) {
            t5Var3 = euVar.a;
            if (t5Var3 != null) {
            }
            i4 = 0;
            if (i == i4) {
            }
        }
        if (i != 1) {
        }
        this.h = mdVar2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (huVar.x() >> 32));
        av0 av0Var22 = this.i;
        this.k = intBitsToFloat2 / Float.intBitsToFloat((int) (((va1) av0Var22.getValue()).a >> 32));
        this.l = Float.intBitsToFloat((int) (huVar.x() & 4294967295L)) / Float.intBitsToFloat((int) (((va1) av0Var22.getValue()).a & 4294967295L));
        long ceil2 = (((int) Math.ceil(Float.intBitsToFloat((int) (huVar.x() & 4294967295L)))) & 4294967295L) | (((int) Math.ceil(Float.intBitsToFloat((int) (huVar.x() >> 32)))) << 32);
        vc0 layoutDirection2 = huVar.getLayoutDirection();
        t5Var = euVar.a;
        j3 j3Var2 = euVar.b;
        if (t5Var != null) {
        }
        j = 4294967295L;
        h = p4.h((int) (ceil2 >> 32), (int) (ceil2 & j), i);
        Canvas canvas2 = k3.a;
        j3Var2 = new j3();
        j3Var2.a = new Canvas(h.a);
        euVar.a = h;
        euVar.b = j3Var2;
        euVar.d = i;
        euVar.c = ceil2;
        zf zfVar22 = euVar.e;
        long x22 = ca0.x(ceil2);
        yf yfVar32 = zfVar22.d;
        nr nrVar22 = yfVar32.a;
        vc0 vc0Var22 = yfVar32.b;
        xf xfVar22 = yfVar32.c;
        long j322 = yfVar32.d;
        huVar2 = huVar;
        yfVar32.a = huVar2;
        yfVar32.b = layoutDirection2;
        yfVar32.c = j3Var2;
        yfVar32.d = x22;
        j3Var2.k();
        hu.V(zfVar22, hi.b, 0L, 0L, 62);
        this.m.invoke(zfVar22);
        j3Var2.i();
        yf yfVar222 = zfVar22.d;
        yfVar222.a = nrVar22;
        yfVar222.b = vc0Var22;
        yfVar222.c = xfVar22;
        yfVar222.d = j322;
        h.a.prepareToDraw();
        this.d = false;
        this.j = huVar2.x();
        if (mdVar == null) {
        }
        t5Var2 = euVar.a;
        if (t5Var2 == null) {
        }
        hu.R(huVar2, t5Var2, euVar.c, 0L, 0L, f, mdVar3, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        av0 av0Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((va1) av0Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((va1) av0Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
