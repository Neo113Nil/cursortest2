package R4;

import Q4.AbstractC0149c;
import f4.C0436m;
import f4.C0438o;
import f4.C0440q;
import f4.C0443t;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class h extends K1.b {

    /* renamed from: a, reason: collision with root package name */
    public final u f2684a;

    public h(u uVar, AbstractC0149c json) {
        kotlin.jvm.internal.i.e(json, "json");
        this.f2684a = uVar;
    }

    @Override // K1.b, O4.b
    public final long c() {
        u uVar = this.f2684a;
        String j2 = uVar.j();
        try {
            kotlin.jvm.internal.i.e(j2, "<this>");
            C0440q L5 = AbstractC1341c.L(j2);
            if (L5 != null) {
                return L5.f5684a;
            }
            B4.r.J(j2);
            throw null;
        } catch (IllegalArgumentException unused) {
            u.n(uVar, B0.o.j("Failed to parse type 'ULong' for input '", j2, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // O4.a
    public final int g(N4.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // K1.b, O4.b
    public final int q() {
        u uVar = this.f2684a;
        String j2 = uVar.j();
        try {
            kotlin.jvm.internal.i.e(j2, "<this>");
            C0438o K5 = AbstractC1341c.K(j2);
            if (K5 != null) {
                return K5.f5682a;
            }
            B4.r.J(j2);
            throw null;
        } catch (IllegalArgumentException unused) {
            u.n(uVar, B0.o.j("Failed to parse type 'UInt' for input '", j2, '\''), 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[Catch: IllegalArgumentException -> 0x0031, TryCatch #0 {IllegalArgumentException -> 0x0031, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0022, B:9:0x002a, B:12:0x002d, B:13:0x0030), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[Catch: IllegalArgumentException -> 0x0031, TryCatch #0 {IllegalArgumentException -> 0x0031, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0022, B:9:0x002a, B:12:0x002d, B:13:0x0030), top: B:2:0x0007 }] */
    @Override // K1.b, O4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte s() {
        C0436m c0436m;
        u uVar = this.f2684a;
        String j2 = uVar.j();
        try {
            kotlin.jvm.internal.i.e(j2, "<this>");
            C0438o K5 = AbstractC1341c.K(j2);
            if (K5 != null) {
                int i2 = K5.f5682a;
                if (Integer.compare(Integer.MIN_VALUE ^ i2, -2147483393) <= 0) {
                    c0436m = new C0436m((byte) i2);
                    if (c0436m == null) {
                        return c0436m.f5680a;
                    }
                    B4.r.J(j2);
                    throw null;
                }
            }
            c0436m = null;
            if (c0436m == null) {
            }
        } catch (IllegalArgumentException unused) {
            u.n(uVar, B0.o.j("Failed to parse type 'UByte' for input '", j2, '\''), 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[Catch: IllegalArgumentException -> 0x0031, TryCatch #0 {IllegalArgumentException -> 0x0031, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0022, B:9:0x002a, B:12:0x002d, B:13:0x0030), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[Catch: IllegalArgumentException -> 0x0031, TryCatch #0 {IllegalArgumentException -> 0x0031, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0022, B:9:0x002a, B:12:0x002d, B:13:0x0030), top: B:2:0x0007 }] */
    @Override // K1.b, O4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final short t() {
        C0443t c0443t;
        u uVar = this.f2684a;
        String j2 = uVar.j();
        try {
            kotlin.jvm.internal.i.e(j2, "<this>");
            C0438o K5 = AbstractC1341c.K(j2);
            if (K5 != null) {
                int i2 = K5.f5682a;
                if (Integer.compare(Integer.MIN_VALUE ^ i2, -2147418113) <= 0) {
                    c0443t = new C0443t((short) i2);
                    if (c0443t == null) {
                        return c0443t.f5687a;
                    }
                    B4.r.J(j2);
                    throw null;
                }
            }
            c0443t = null;
            if (c0443t == null) {
            }
        } catch (IllegalArgumentException unused) {
            u.n(uVar, B0.o.j("Failed to parse type 'UShort' for input '", j2, '\''), 0, null, 6);
            throw null;
        }
    }
}
