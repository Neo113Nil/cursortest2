package defpackage;

import android.graphics.Bitmap;
import com.google.firebase.encoders.json.BuildConfig;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class u33 extends q33 {
    public final ow0 b;
    public String c;
    public boolean d;
    public final td0 e;
    public Function0 f;
    public final lz1 g;
    public mo h;
    public final lz1 i;
    public long j;
    public float k;
    public float l;
    public final t33 m;

    public u33(ow0 ow0Var) {
        this.b = ow0Var;
        ow0Var.i = new t33(this, 0);
        this.c = BuildConfig.FLAVOR;
        this.d = true;
        this.e = new td0();
        this.f = m13.o;
        this.g = ij2.j(null);
        this.i = ij2.j(new ql2(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new t33(this, 1);
    }

    @Override // defpackage.q33
    public final void a(yd0 yd0Var) {
        e(yd0Var, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r3 != r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0111, code lost:
    
        if (r9.d == r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(yd0 yd0Var, float f, mo moVar) {
        int i;
        boolean z;
        td0 td0Var;
        mo moVar2;
        y9 y9Var;
        char c;
        long j;
        mo moVar3;
        y9 y9Var2;
        y9 y9Var3;
        int i2;
        int i3;
        int i4;
        ow0 ow0Var = this.b;
        boolean z2 = ow0Var.d;
        lz1 lz1Var = this.g;
        if (z2 && ow0Var.e != 16) {
            mo moVar4 = (mo) lz1Var.getValue();
            ah0 ah0Var = y33.a;
            if (!(moVar4 instanceof mo) ? moVar4 == null : !((i4 = moVar4.c) != 5 && i4 != 3)) {
                if (!(moVar instanceof mo) ? moVar == null : !((i3 = moVar.c) != 5 && i3 != 3)) {
                    i = 1;
                    z = this.d;
                    td0Var = this.e;
                    if (!z && ql2.a(this.j, yd0Var.f())) {
                        y9Var3 = td0Var.a;
                        if (y9Var3 == null) {
                            Bitmap.Config config = y9Var3.a.getConfig();
                            config.getClass();
                            i2 = k31.I(config);
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i != 1) {
                        long j2 = ow0Var.e;
                        ah0 ah0Var2 = y33.a;
                        if (aw.d(j2) != 1.0f) {
                            j2 = aw.b(j2, 1.0f);
                        }
                        moVar2 = new mo(j2, 5);
                    } else {
                        moVar2 = null;
                    }
                    this.h = moVar2;
                    float intBitsToFloat = Float.intBitsToFloat((int) (yd0Var.f() >> 32));
                    lz1 lz1Var2 = this.i;
                    this.k = intBitsToFloat / Float.intBitsToFloat((int) (((ql2) lz1Var2.getValue()).a >> 32));
                    this.l = Float.intBitsToFloat((int) (yd0Var.f() & 4294967295L)) / Float.intBitsToFloat((int) (((ql2) lz1Var2.getValue()).a & 4294967295L));
                    long ceil = (((int) Math.ceil(Float.intBitsToFloat((int) (yd0Var.f() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (yd0Var.f() & 4294967295L)))) & 4294967295L);
                    u81 layoutDirection = yd0Var.getLayoutDirection();
                    y9Var = td0Var.a;
                    y6 y6Var = td0Var.b;
                    if (y9Var != null || y6Var == null) {
                        c = ' ';
                        j = 4294967295L;
                    } else {
                        int i5 = (int) (ceil >> 32);
                        Bitmap bitmap = y9Var.a;
                        c = ' ';
                        j = 4294967295L;
                        if (i5 <= bitmap.getWidth()) {
                            if (((int) (ceil & 4294967295L)) <= bitmap.getHeight()) {
                            }
                        }
                    }
                    y9Var = o70.c((int) (ceil >> c), (int) (ceil & j), i);
                    y6Var = zm3.a(y9Var);
                    td0Var.a = y9Var;
                    td0Var.b = y6Var;
                    td0Var.d = i;
                    td0Var.c = ceil;
                    ns nsVar = td0Var.e;
                    long Q = zm3.Q(ceil);
                    ms msVar = nsVar.m;
                    ca0 ca0Var = msVar.a;
                    u81 u81Var = msVar.b;
                    ls lsVar = msVar.c;
                    y6 y6Var2 = y6Var;
                    long j3 = msVar.d;
                    msVar.a = yd0Var;
                    msVar.b = layoutDirection;
                    msVar.c = y6Var2;
                    msVar.d = Q;
                    y6Var2.m();
                    yd0.H(nsVar, aw.b, 0L, 62);
                    this.m.invoke(nsVar);
                    y6Var2.j();
                    ms msVar2 = nsVar.m;
                    msVar2.a = ca0Var;
                    msVar2.b = u81Var;
                    msVar2.c = lsVar;
                    msVar2.d = j3;
                    y9Var.a.prepareToDraw();
                    this.d = false;
                    this.j = yd0Var.f();
                    if (moVar == null) {
                        moVar3 = moVar;
                    } else {
                        moVar3 = ((mo) lz1Var.getValue()) != null ? (mo) lz1Var.getValue() : this.h;
                    }
                    y9Var2 = td0Var.a;
                    if (y9Var2 == null) {
                        h21.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                    }
                    yd0.S(yd0Var, y9Var2, td0Var.c, 0L, f, moVar3, 0, 858);
                }
            }
        }
        i = 0;
        z = this.d;
        td0Var = this.e;
        if (!z) {
            y9Var3 = td0Var.a;
            if (y9Var3 == null) {
            }
        }
        if (i != 1) {
        }
        this.h = moVar2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (yd0Var.f() >> 32));
        lz1 lz1Var22 = this.i;
        this.k = intBitsToFloat2 / Float.intBitsToFloat((int) (((ql2) lz1Var22.getValue()).a >> 32));
        this.l = Float.intBitsToFloat((int) (yd0Var.f() & 4294967295L)) / Float.intBitsToFloat((int) (((ql2) lz1Var22.getValue()).a & 4294967295L));
        long ceil2 = (((int) Math.ceil(Float.intBitsToFloat((int) (yd0Var.f() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (yd0Var.f() & 4294967295L)))) & 4294967295L);
        u81 layoutDirection2 = yd0Var.getLayoutDirection();
        y9Var = td0Var.a;
        y6 y6Var3 = td0Var.b;
        if (y9Var != null) {
        }
        c = ' ';
        j = 4294967295L;
        y9Var = o70.c((int) (ceil2 >> c), (int) (ceil2 & j), i);
        y6Var3 = zm3.a(y9Var);
        td0Var.a = y9Var;
        td0Var.b = y6Var3;
        td0Var.d = i;
        td0Var.c = ceil2;
        ns nsVar2 = td0Var.e;
        long Q2 = zm3.Q(ceil2);
        ms msVar3 = nsVar2.m;
        ca0 ca0Var2 = msVar3.a;
        u81 u81Var2 = msVar3.b;
        ls lsVar2 = msVar3.c;
        y6 y6Var22 = y6Var3;
        long j32 = msVar3.d;
        msVar3.a = yd0Var;
        msVar3.b = layoutDirection2;
        msVar3.c = y6Var22;
        msVar3.d = Q2;
        y6Var22.m();
        yd0.H(nsVar2, aw.b, 0L, 62);
        this.m.invoke(nsVar2);
        y6Var22.j();
        ms msVar22 = nsVar2.m;
        msVar22.a = ca0Var2;
        msVar22.b = u81Var2;
        msVar22.c = lsVar2;
        msVar22.d = j32;
        y9Var.a.prepareToDraw();
        this.d = false;
        this.j = yd0Var.f();
        if (moVar == null) {
        }
        y9Var2 = td0Var.a;
        if (y9Var2 == null) {
        }
        yd0.S(yd0Var, y9Var2, td0Var.c, 0L, f, moVar3, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        lz1 lz1Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((ql2) lz1Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((ql2) lz1Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
