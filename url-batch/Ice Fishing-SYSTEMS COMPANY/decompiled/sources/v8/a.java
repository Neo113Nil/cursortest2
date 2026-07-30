package v8;

import kotlin.jvm.internal.h;
import u8.m;
import u8.s;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f41375a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f41376b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(M7.a.f1916a);
        h.d(bytes, "getBytes(...)");
        f41375a = bytes;
        f41376b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final String a(long j9, u8.e eVar) {
        h.e(eVar, "<this>");
        if (j9 > 0) {
            long j10 = j9 - 1;
            if (eVar.k(j10) == 13) {
                String F8 = eVar.F(j10, M7.a.f1916a);
                eVar.H(2L);
                return F8;
            }
        }
        String F9 = eVar.F(j9, M7.a.f1916a);
        eVar.H(1L);
        return F9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        if (r19 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
    
        return -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int b(u8.e eVar, m mVar, boolean z8) {
        int i;
        byte[] bArr;
        int i4;
        int i9;
        s sVar;
        byte[] bArr2;
        int i10;
        h.e(eVar, "<this>");
        s sVar2 = eVar.f41276n;
        if (sVar2 == null) {
            return z8 ? -2 : -1;
        }
        int i11 = sVar2.f41312b;
        int i12 = sVar2.f41313c;
        byte[] bArr3 = sVar2.f41311a;
        s sVar3 = sVar2;
        int i13 = -1;
        int i14 = 0;
        loop0: while (true) {
            int i15 = i14 + 1;
            int[] iArr = mVar.f41295u;
            int i16 = iArr[i14];
            int i17 = i14 + 2;
            int i18 = iArr[i15];
            if (i18 != -1) {
                i13 = i18;
            }
            if (sVar3 == null) {
                break;
            }
            if (i16 >= 0) {
                int i19 = i11 + 1;
                int i20 = bArr3[i11] & 255;
                int i21 = i17 + i16;
                while (i17 != i21) {
                    if (i20 == iArr[i17]) {
                        i = iArr[i17 + i16];
                        if (i19 == i12) {
                            sVar3 = sVar3.f41316f;
                            h.b(sVar3);
                            i9 = sVar3.f41312b;
                            i4 = sVar3.f41313c;
                            bArr = sVar3.f41311a;
                            if (sVar3 == sVar2) {
                                sVar3 = null;
                            }
                        } else {
                            bArr = bArr3;
                            i4 = i12;
                            i9 = i19;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        byte[] bArr4 = bArr;
                        i14 = -i;
                        i11 = i9;
                        i12 = i4;
                        bArr3 = bArr4;
                    } else {
                        i17++;
                    }
                }
                break loop0;
            }
            int i22 = (i16 * (-1)) + i17;
            while (true) {
                int i23 = i11 + 1;
                int i24 = i17 + 1;
                if ((bArr3[i11] & 255) != iArr[i17]) {
                    break loop0;
                }
                boolean z9 = i24 == i22;
                if (i23 == i12) {
                    h.b(sVar3);
                    s sVar4 = sVar3.f41316f;
                    h.b(sVar4);
                    i10 = sVar4.f41312b;
                    int i25 = sVar4.f41313c;
                    bArr2 = sVar4.f41311a;
                    if (sVar4 != sVar2) {
                        sVar = sVar4;
                        i12 = i25;
                    } else {
                        if (!z9) {
                            break loop0;
                        }
                        i12 = i25;
                        sVar = null;
                    }
                } else {
                    sVar = sVar3;
                    bArr2 = bArr3;
                    i10 = i23;
                }
                if (z9) {
                    i = iArr[i24];
                    int i26 = i10;
                    i4 = i12;
                    i9 = i26;
                    byte[] bArr5 = bArr2;
                    sVar3 = sVar;
                    bArr = bArr5;
                    break;
                }
                i11 = i10;
                bArr3 = bArr2;
                sVar3 = sVar;
                i17 = i24;
            }
        }
        return i13;
    }
}
