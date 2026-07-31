package V5;

import U5.AbstractC0216c;
import k5.C0483m;

/* loaded from: classes.dex */
public final class h extends A3.c {

    /* renamed from: b, reason: collision with root package name */
    public final u f2735b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(u uVar, AbstractC0216c json) {
        super(8);
        kotlin.jvm.internal.i.e(json, "json");
        this.f2735b = uVar;
    }

    @Override // A3.c, S5.b
    public final long a() {
        u uVar = this.f2735b;
        String j4 = uVar.j();
        try {
            kotlin.jvm.internal.i.e(j4, "<this>");
            k5.q k0 = A3.c.k0(j4);
            if (k0 != null) {
                return k0.f5214f;
            }
            F5.q.D(j4);
            throw null;
        } catch (IllegalArgumentException unused) {
            u.m(uVar, "Failed to parse type 'ULong' for input '" + j4 + '\'', 0, 6);
            throw null;
        }
    }

    @Override // S5.a
    public final int j(R5.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // A3.c, S5.b
    public final int p() {
        u uVar = this.f2735b;
        String j4 = uVar.j();
        try {
            kotlin.jvm.internal.i.e(j4, "<this>");
            k5.o j02 = A3.c.j0(j4);
            if (j02 != null) {
                return j02.f5212f;
            }
            F5.q.D(j4);
            throw null;
        } catch (IllegalArgumentException unused) {
            u.m(uVar, "Failed to parse type 'UInt' for input '" + j4 + '\'', 0, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    @Override // A3.c, S5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte r() {
        C0483m c0483m;
        u uVar = this.f2735b;
        String j4 = uVar.j();
        try {
            kotlin.jvm.internal.i.e(j4, "<this>");
            k5.o j02 = A3.c.j0(j4);
            if (j02 != null) {
                int i7 = j02.f5212f;
                if (Integer.compare(Integer.MIN_VALUE ^ i7, -2147483393) <= 0) {
                    c0483m = new C0483m((byte) i7);
                    if (c0483m == null) {
                        return c0483m.f5210f;
                    }
                    F5.q.D(j4);
                    throw null;
                }
            }
            c0483m = null;
            if (c0483m == null) {
            }
        } catch (IllegalArgumentException unused) {
            u.m(uVar, "Failed to parse type 'UByte' for input '" + j4 + '\'', 0, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    @Override // A3.c, S5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final short t() {
        k5.t tVar;
        u uVar = this.f2735b;
        String j4 = uVar.j();
        try {
            kotlin.jvm.internal.i.e(j4, "<this>");
            k5.o j02 = A3.c.j0(j4);
            if (j02 != null) {
                int i7 = j02.f5212f;
                if (Integer.compare(Integer.MIN_VALUE ^ i7, -2147418113) <= 0) {
                    tVar = new k5.t((short) i7);
                    if (tVar == null) {
                        return tVar.f5217f;
                    }
                    F5.q.D(j4);
                    throw null;
                }
            }
            tVar = null;
            if (tVar == null) {
            }
        } catch (IllegalArgumentException unused) {
            u.m(uVar, "Failed to parse type 'UShort' for input '" + j4 + '\'', 0, 6);
            throw null;
        }
    }
}
