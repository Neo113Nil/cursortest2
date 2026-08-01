package c2;

import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l0 implements x2.c {

    /* renamed from: d, reason: collision with root package name */
    public boolean f1608d;

    /* renamed from: e, reason: collision with root package name */
    public long f1609e = 9223372034707292159L;

    /* renamed from: i, reason: collision with root package name */
    public long f1610i = 0;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o0 f1611r;

    public l0(o0 o0Var) {
        this.f1611r = o0Var;
    }

    public final void a(a2.k kVar, float f3) {
        o0 o0Var = this.f1611r;
        w1 w1Var = o0Var.f1637z;
        if (w1Var == null) {
            w1Var = new w1();
            o0Var.f1637z = w1Var;
        }
        int p4 = kotlin.collections.w.p((a2.k[]) w1Var.f1695b, kVar);
        if (p4 >= 0) {
            float[] fArr = (float[]) w1Var.f1696c;
            if (fArr[p4] != f3) {
                fArr[p4] = f3;
                ((byte[]) w1Var.f1697d)[p4] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) w1Var.f1697d;
                if (bArr[p4] == 2) {
                    bArr[p4] = 0;
                    return;
                }
                return;
            }
        }
        int i3 = w1Var.f1694a;
        a2.k[] kVarArr = (a2.k[]) w1Var.f1695b;
        if (i3 == kVarArr.length) {
            int i10 = i3 * 2;
            w1Var.f1695b = (a2.k[]) Arrays.copyOf(kVarArr, i10);
            w1Var.f1696c = Arrays.copyOf((float[]) w1Var.f1696c, i10);
            w1Var.f1697d = Arrays.copyOf((byte[]) w1Var.f1697d, i10);
        }
        ((a2.k[]) w1Var.f1695b)[i3] = kVar;
        ((byte[]) w1Var.f1697d)[i3] = 3;
        ((float[]) w1Var.f1696c)[i3] = f3;
        w1Var.f1694a++;
    }

    @Override // x2.c
    public final float d() {
        return this.f1611r.d();
    }

    @Override // x2.c
    public final float g() {
        return this.f1611r.g();
    }
}
