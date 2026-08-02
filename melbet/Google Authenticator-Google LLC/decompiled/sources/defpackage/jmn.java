package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jmn extends jmo {
    @Override // defpackage.jmo
    public final double a(Object obj, long j) {
        return Double.longBitsToDouble(h(obj, j));
    }

    @Override // defpackage.jmo
    public final float b(Object obj, long j) {
        return Float.intBitsToFloat(g(obj, j));
    }

    @Override // defpackage.jmo
    public final void c(Object obj, long j, boolean z) {
        if (jmp.a) {
            jmp.k(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            jmp.l(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.jmo
    public final void d(Object obj, long j, double d) {
        j(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.jmo
    public final void e(Object obj, long j, float f) {
        i(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.jmo
    public final boolean f(Object obj, long j) {
        return jmp.a ? jmp.t(obj, j) : jmp.u(obj, j);
    }
}
