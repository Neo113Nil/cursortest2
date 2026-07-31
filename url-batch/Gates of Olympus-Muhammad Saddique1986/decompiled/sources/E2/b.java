package E2;

import R1.t;
import R1.w;
import kotlinx.serialization.descriptors.SerialDescriptor;
import n.t0;
import n2.AbstractC0737q;

/* loaded from: classes.dex */
public final class b extends O2.l {

    /* renamed from: g, reason: collision with root package name */
    public final o f1046g;

    /* renamed from: h, reason: collision with root package name */
    public final A1.i f1047h;

    public b(o oVar, D2.c cVar) {
        f2.j.f(cVar, "json");
        this.f1046g = oVar;
        this.f1047h = cVar.f872b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c5 A[Catch: IllegalArgumentException -> 0x00ca, TryCatch #0 {IllegalArgumentException -> 0x00ca, blocks: (B:3:0x0009, B:7:0x00c2, B:10:0x00c5, B:11:0x00c9, B:12:0x001c, B:19:0x0033, B:21:0x0040, B:23:0x004b, B:29:0x0068, B:32:0x008e, B:37:0x0076, B:40:0x008a, B:43:0x0097, B:45:0x00ad, B:51:0x00ba), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c2 A[Catch: IllegalArgumentException -> 0x00ca, TryCatch #0 {IllegalArgumentException -> 0x00ca, blocks: (B:3:0x0009, B:7:0x00c2, B:10:0x00c5, B:11:0x00c9, B:12:0x001c, B:19:0x0033, B:21:0x0040, B:23:0x004b, B:29:0x0068, B:32:0x008e, B:37:0x0076, B:40:0x008a, B:43:0x0097, B:45:0x00ad, B:51:0x00ba), top: B:2:0x0009 }] */
    @Override // O2.l, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c() {
        int i3;
        t tVar;
        o oVar = this.f1046g;
        String j3 = oVar.j();
        try {
            f2.j.f(j3, "<this>");
            int i4 = 10;
            n.r.i(10);
            int length = j3.length();
            if (length != 0) {
                char charAt = j3.charAt(0);
                if (f2.j.g(charAt, 48) >= 0) {
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
                tVar = new t(j6);
                if (tVar == null) {
                    return tVar.f4166d;
                }
                AbstractC0737q.t(j3);
                throw null;
            }
            tVar = null;
            if (tVar == null) {
            }
        } catch (IllegalArgumentException unused) {
            o.n(oVar, "Failed to parse type 'ULong' for input '" + j3 + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // O2.l, kotlinx.serialization.encoding.Decoder
    public final int i() {
        o oVar = this.f1046g;
        String j3 = oVar.j();
        try {
            f2.j.f(j3, "<this>");
            R1.r v3 = t0.v(j3);
            if (v3 != null) {
                return v3.f4164d;
            }
            AbstractC0737q.t(j3);
            throw null;
        } catch (IllegalArgumentException unused) {
            o.n(oVar, "Failed to parse type 'UInt' for input '" + j3 + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // B2.a
    public final A1.i m() {
        return this.f1047h;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[Catch: IllegalArgumentException -> 0x0031, TryCatch #0 {IllegalArgumentException -> 0x0031, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0022, B:9:0x002a, B:12:0x002d, B:13:0x0030), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[Catch: IllegalArgumentException -> 0x0031, TryCatch #0 {IllegalArgumentException -> 0x0031, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0022, B:9:0x002a, B:12:0x002d, B:13:0x0030), top: B:2:0x0007 }] */
    @Override // O2.l, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte o() {
        R1.o oVar;
        o oVar2 = this.f1046g;
        String j3 = oVar2.j();
        try {
            f2.j.f(j3, "<this>");
            R1.r v3 = t0.v(j3);
            if (v3 != null) {
                int i3 = v3.f4164d;
                if (Integer.compare(Integer.MIN_VALUE ^ i3, -2147483393) <= 0) {
                    oVar = new R1.o((byte) i3);
                    if (oVar == null) {
                        return oVar.f4159d;
                    }
                    AbstractC0737q.t(j3);
                    throw null;
                }
            }
            oVar = null;
            if (oVar == null) {
            }
        } catch (IllegalArgumentException unused) {
            o.n(oVar2, "Failed to parse type 'UByte' for input '" + j3 + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // B2.a
    public final int r(SerialDescriptor serialDescriptor) {
        f2.j.f(serialDescriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[Catch: IllegalArgumentException -> 0x0031, TryCatch #0 {IllegalArgumentException -> 0x0031, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0022, B:9:0x002a, B:12:0x002d, B:13:0x0030), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[Catch: IllegalArgumentException -> 0x0031, TryCatch #0 {IllegalArgumentException -> 0x0031, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0022, B:9:0x002a, B:12:0x002d, B:13:0x0030), top: B:2:0x0007 }] */
    @Override // O2.l, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final short s() {
        w wVar;
        o oVar = this.f1046g;
        String j3 = oVar.j();
        try {
            f2.j.f(j3, "<this>");
            R1.r v3 = t0.v(j3);
            if (v3 != null) {
                int i3 = v3.f4164d;
                if (Integer.compare(Integer.MIN_VALUE ^ i3, -2147418113) <= 0) {
                    wVar = new w((short) i3);
                    if (wVar == null) {
                        return wVar.f4169d;
                    }
                    AbstractC0737q.t(j3);
                    throw null;
                }
            }
            wVar = null;
            if (wVar == null) {
            }
        } catch (IllegalArgumentException unused) {
            o.n(oVar, "Failed to parse type 'UShort' for input '" + j3 + '\'', 0, null, 6);
            throw null;
        }
    }
}
