package y2;

import L1.p;
import L1.s;
import L1.x;
import e2.AbstractC0381e;
import h.AbstractC0416e;
import h2.AbstractC0454p;
import k.C0523b;
import kotlinx.serialization.descriptors.SerialDescriptor;
import t.u;

/* loaded from: classes.dex */
public final class b extends g2.i {

    /* renamed from: a, reason: collision with root package name */
    public final u f8833a;

    /* renamed from: b, reason: collision with root package name */
    public final C0523b f8834b;

    public b(u uVar, x2.c cVar) {
        Z1.i.f(cVar, "json");
        this.f8833a = uVar;
        this.f8834b = cVar.f8733b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c5 A[Catch: IllegalArgumentException -> 0x00ca, TryCatch #0 {IllegalArgumentException -> 0x00ca, blocks: (B:3:0x0009, B:7:0x00c2, B:10:0x00c5, B:11:0x00c9, B:12:0x001c, B:19:0x0033, B:21:0x0040, B:23:0x004b, B:29:0x0068, B:32:0x008e, B:37:0x0076, B:40:0x008a, B:43:0x0097, B:45:0x00ad, B:51:0x00ba), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c2 A[Catch: IllegalArgumentException -> 0x00ca, TryCatch #0 {IllegalArgumentException -> 0x00ca, blocks: (B:3:0x0009, B:7:0x00c2, B:10:0x00c5, B:11:0x00c9, B:12:0x001c, B:19:0x0033, B:21:0x0040, B:23:0x004b, B:29:0x0068, B:32:0x008e, B:37:0x0076, B:40:0x008a, B:43:0x0097, B:45:0x00ad, B:51:0x00ba), top: B:2:0x0009 }] */
    @Override // g2.i, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d() {
        int i3;
        L1.u uVar;
        u uVar2 = this.f8833a;
        String j3 = uVar2.j();
        try {
            Z1.i.f(j3, "<this>");
            int i4 = 10;
            AbstractC0381e.m(10);
            int length = j3.length();
            if (length != 0) {
                char charAt = j3.charAt(0);
                if (Z1.i.g(charAt, 48) >= 0) {
                    i3 = 0;
                } else if (length != 1 && charAt == '+') {
                    i3 = 1;
                }
                long j4 = 10;
                long j5 = 0;
                long j6 = 0;
                long j7 = 512409557603043100L;
                while (i3 < length) {
                    int digit = Character.digit((int) j3.charAt(i3), i4);
                    if (digit >= 0) {
                        int i5 = length;
                        long j8 = j6 ^ Long.MIN_VALUE;
                        long j9 = j4;
                        if (Long.compare(j8, j7 ^ Long.MIN_VALUE) > 0) {
                            if (j7 == 512409557603043100L) {
                                if (j9 < j5) {
                                    j7 = Long.MAX_VALUE < (j9 ^ Long.MIN_VALUE) ? j5 : 1L;
                                } else {
                                    int i6 = 1;
                                    long j10 = (Long.MAX_VALUE / j9) << 1;
                                    if ((((-1) - (j10 * j9)) ^ Long.MIN_VALUE) < (j9 ^ Long.MIN_VALUE)) {
                                        i6 = 0;
                                    }
                                    j7 = j10 + i6;
                                }
                                if (Long.compare(j8, j7 ^ Long.MIN_VALUE) > 0) {
                                }
                            }
                        }
                        long j11 = j6 * j9;
                        long j12 = (digit & 4294967295L) + j11;
                        if (Long.compare(j12 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) >= 0) {
                            i3++;
                            j6 = j12;
                            length = i5;
                            j4 = j9;
                            i4 = 10;
                            j5 = 0;
                        }
                    }
                }
                uVar = new L1.u(j6);
                if (uVar == null) {
                    return uVar.f2724d;
                }
                AbstractC0454p.e0(j3);
                throw null;
            }
            uVar = null;
            if (uVar == null) {
            }
        } catch (IllegalArgumentException unused) {
            u.n(uVar2, "Failed to parse type 'ULong' for input '" + j3 + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // g2.i, kotlinx.serialization.encoding.Decoder
    public final int l() {
        u uVar = this.f8833a;
        String j3 = uVar.j();
        try {
            Z1.i.f(j3, "<this>");
            s z3 = AbstractC0416e.z(j3);
            if (z3 != null) {
                return z3.f2722d;
            }
            AbstractC0454p.e0(j3);
            throw null;
        } catch (IllegalArgumentException unused) {
            u.n(uVar, "Failed to parse type 'UInt' for input '" + j3 + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // v2.a
    public final C0523b o() {
        return this.f8834b;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[Catch: IllegalArgumentException -> 0x0031, TryCatch #0 {IllegalArgumentException -> 0x0031, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0022, B:9:0x002a, B:12:0x002d, B:13:0x0030), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[Catch: IllegalArgumentException -> 0x0031, TryCatch #0 {IllegalArgumentException -> 0x0031, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0022, B:9:0x002a, B:12:0x002d, B:13:0x0030), top: B:2:0x0007 }] */
    @Override // g2.i, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte q() {
        p pVar;
        u uVar = this.f8833a;
        String j3 = uVar.j();
        try {
            Z1.i.f(j3, "<this>");
            s z3 = AbstractC0416e.z(j3);
            if (z3 != null) {
                int i3 = z3.f2722d;
                if (Integer.compare(Integer.MIN_VALUE ^ i3, -2147483393) <= 0) {
                    pVar = new p((byte) i3);
                    if (pVar == null) {
                        return pVar.f2717d;
                    }
                    AbstractC0454p.e0(j3);
                    throw null;
                }
            }
            pVar = null;
            if (pVar == null) {
            }
        } catch (IllegalArgumentException unused) {
            u.n(uVar, "Failed to parse type 'UByte' for input '" + j3 + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // v2.a
    public final int s(SerialDescriptor serialDescriptor) {
        Z1.i.f(serialDescriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[Catch: IllegalArgumentException -> 0x0031, TryCatch #0 {IllegalArgumentException -> 0x0031, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0022, B:9:0x002a, B:12:0x002d, B:13:0x0030), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[Catch: IllegalArgumentException -> 0x0031, TryCatch #0 {IllegalArgumentException -> 0x0031, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0022, B:9:0x002a, B:12:0x002d, B:13:0x0030), top: B:2:0x0007 }] */
    @Override // g2.i, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final short t() {
        x xVar;
        u uVar = this.f8833a;
        String j3 = uVar.j();
        try {
            Z1.i.f(j3, "<this>");
            s z3 = AbstractC0416e.z(j3);
            if (z3 != null) {
                int i3 = z3.f2722d;
                if (Integer.compare(Integer.MIN_VALUE ^ i3, -2147418113) <= 0) {
                    xVar = new x((short) i3);
                    if (xVar == null) {
                        return xVar.f2727d;
                    }
                    AbstractC0454p.e0(j3);
                    throw null;
                }
            }
            xVar = null;
            if (xVar == null) {
            }
        } catch (IllegalArgumentException unused) {
            u.n(uVar, "Failed to parse type 'UShort' for input '" + j3 + '\'', 0, null, 6);
            throw null;
        }
    }
}
