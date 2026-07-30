package q7;

import d6.p;
import d6.s;
import d6.u;
import d6.x;
import kotlinx.serialization.descriptors.SerialDescriptor;
import u3.t;
import z6.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends j1.c {

    /* renamed from: d, reason: collision with root package name */
    public final j5.a f7546d;

    /* renamed from: e, reason: collision with root package name */
    public final j4.i f7547e;

    public b(j5.a aVar, p7.c cVar) {
        r6.k.f(cVar, "json");
        this.f7546d = aVar;
        this.f7547e = cVar.f7216b;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c7 A[Catch: IllegalArgumentException -> 0x00cb, TryCatch #0 {IllegalArgumentException -> 0x00cb, blocks: (B:3:0x000a, B:8:0x00c4, B:11:0x00c7, B:12:0x00ca, B:13:0x001c, B:20:0x0034, B:22:0x0043, B:24:0x004e, B:30:0x006b, B:33:0x0090, B:39:0x0079, B:42:0x008d, B:45:0x0099, B:47:0x00af, B:52:0x00bd), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c4 A[Catch: IllegalArgumentException -> 0x00cb, TryCatch #0 {IllegalArgumentException -> 0x00cb, blocks: (B:3:0x000a, B:8:0x00c4, B:11:0x00c7, B:12:0x00ca, B:13:0x001c, B:20:0x0034, B:22:0x0043, B:24:0x004e, B:30:0x006b, B:33:0x0090, B:39:0x0079, B:42:0x008d, B:45:0x0099, B:47:0x00af, B:52:0x00bd), top: B:2:0x000a }] */
    @Override // j1.c, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d() {
        int i7;
        u uVar;
        long j8;
        j5.a aVar = this.f7546d;
        String k8 = aVar.k();
        try {
            r6.k.f(k8, "<this>");
            int i8 = 10;
            v1.g.b(10);
            int length = k8.length();
            if (length != 0) {
                char charAt = k8.charAt(0);
                if (r6.k.g(charAt, 48) >= 0) {
                    i7 = 0;
                } else if (length != 1 && charAt == '+') {
                    i7 = 1;
                }
                long j9 = 10;
                long j10 = 512409557603043100L;
                int i9 = 1;
                long j11 = 512409557603043100L;
                long j12 = 0;
                while (i7 < length) {
                    int digit = Character.digit((int) k8.charAt(i7), i8);
                    if (digit >= 0) {
                        int i10 = length;
                        long j13 = j12 ^ Long.MIN_VALUE;
                        if (Long.compare(j13, j11 ^ Long.MIN_VALUE) > 0) {
                            if (j11 == j10) {
                                if (j9 >= 0) {
                                    long j14 = (Long.MAX_VALUE / j9) << i9;
                                    if ((((-1) - (j14 * j9)) ^ Long.MIN_VALUE) < (j9 ^ Long.MIN_VALUE)) {
                                        i9 = 0;
                                    }
                                    j8 = j14 + i9;
                                } else if (Long.MAX_VALUE < (j9 ^ Long.MIN_VALUE)) {
                                    j11 = 0;
                                    if (Long.compare(j13, j11 ^ Long.MIN_VALUE) > 0) {
                                    }
                                } else {
                                    j8 = 1;
                                }
                                j11 = j8;
                                if (Long.compare(j13, j11 ^ Long.MIN_VALUE) > 0) {
                                }
                            }
                        }
                        long j15 = j12 * j9;
                        long j16 = (digit & 4294967295L) + j15;
                        if (Long.compare(j16 ^ Long.MIN_VALUE, j15 ^ Long.MIN_VALUE) >= 0) {
                            i7++;
                            j12 = j16;
                            length = i10;
                            i8 = 10;
                            i9 = 1;
                            j10 = 512409557603043100L;
                        }
                    }
                }
                uVar = new u(j12);
                if (uVar == null) {
                    return uVar.f2634f;
                }
                o.q(k8);
                throw null;
            }
            uVar = null;
            if (uVar == null) {
            }
        } catch (IllegalArgumentException unused) {
            j5.a.o(aVar, "Failed to parse type 'ULong' for input '" + k8 + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // n7.a
    public final int m(SerialDescriptor serialDescriptor) {
        r6.k.f(serialDescriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // j1.c, kotlinx.serialization.encoding.Decoder
    public final int s() {
        j5.a aVar = this.f7546d;
        String k8 = aVar.k();
        try {
            r6.k.f(k8, "<this>");
            s o2 = t.o(k8);
            if (o2 != null) {
                return o2.f2632f;
            }
            o.q(k8);
            throw null;
        } catch (IllegalArgumentException unused) {
            j5.a.o(aVar, "Failed to parse type 'UInt' for input '" + k8 + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // n7.a
    public final j4.i t() {
        return this.f7547e;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    @Override // j1.c, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte v() {
        p pVar;
        j5.a aVar = this.f7546d;
        String k8 = aVar.k();
        try {
            r6.k.f(k8, "<this>");
            s o2 = t.o(k8);
            if (o2 != null) {
                int i7 = o2.f2632f;
                if (Integer.compare(Integer.MIN_VALUE ^ i7, -2147483393) <= 0) {
                    pVar = new p((byte) i7);
                    if (pVar == null) {
                        return pVar.f2627f;
                    }
                    o.q(k8);
                    throw null;
                }
            }
            pVar = null;
            if (pVar == null) {
            }
        } catch (IllegalArgumentException unused) {
            j5.a.o(aVar, "Failed to parse type 'UByte' for input '" + k8 + '\'', 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    @Override // j1.c, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final short x() {
        x xVar;
        j5.a aVar = this.f7546d;
        String k8 = aVar.k();
        try {
            r6.k.f(k8, "<this>");
            s o2 = t.o(k8);
            if (o2 != null) {
                int i7 = o2.f2632f;
                if (Integer.compare(Integer.MIN_VALUE ^ i7, -2147418113) <= 0) {
                    xVar = new x((short) i7);
                    if (xVar == null) {
                        return xVar.f2637f;
                    }
                    o.q(k8);
                    throw null;
                }
            }
            xVar = null;
            if (xVar == null) {
            }
        } catch (IllegalArgumentException unused) {
            j5.a.o(aVar, "Failed to parse type 'UShort' for input '" + k8 + '\'', 0, null, 6);
            throw null;
        }
    }
}
