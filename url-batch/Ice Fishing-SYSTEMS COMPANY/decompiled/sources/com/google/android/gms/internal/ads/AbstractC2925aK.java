package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.ads.aK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2925aK {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f29198a = Charset.forName("UTF-8");

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e5, code lost:
    
        if (r8 == 1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e7, code lost:
    
        if (r8 == 2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e9, code lost:
    
        if (r8 == 3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00eb, code lost:
    
        if (r8 == 4) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0105, code lost:
    
        if (r10 != r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0107, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0108, code lost:
    
        r0 = new byte[r10];
        java.lang.System.arraycopy(r4, 0, r0, 0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x010e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ee, code lost:
    
        r0 = r10 + 1;
        r4[r10] = (byte) (r9 >> 10);
        r10 = r10 + 2;
        r4[r0] = (byte) (r9 >> 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00fd, code lost:
    
        r4[r10] = (byte) (r9 >> 4);
        r10 = r10 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(String str) {
        byte[] bytes = str.getBytes(f29198a);
        int length = bytes.length;
        int i = (length * 3) / 4;
        byte[] bArr = new byte[i];
        int[] iArr = PA.f26866R;
        int i4 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            if (i9 == 0) {
                while (true) {
                    int i12 = i4 + 4;
                    if (i12 > length) {
                        break;
                    }
                    i10 = (iArr[bytes[i4] & 255] << 18) | (iArr[bytes[i4 + 1] & 255] << 12) | (iArr[bytes[i4 + 2] & 255] << 6) | iArr[bytes[i4 + 3] & 255];
                    if (i10 < 0) {
                        break;
                    }
                    bArr[i11 + 2] = (byte) i10;
                    bArr[i11 + 1] = (byte) (i10 >> 8);
                    bArr[i11] = (byte) (i10 >> 16);
                    i11 += 3;
                    i4 = i12;
                }
                if (i4 >= length) {
                    i9 = 0;
                    break;
                }
                i9 = 0;
            }
            int i13 = i4 + 1;
            int i14 = iArr[bytes[i4] & 255];
            if (i9 == 0) {
                if (i14 < 0) {
                    if (i14 != -1) {
                        break;
                    }
                } else {
                    i9++;
                    i10 = i14;
                }
            } else {
                if (i9 == 1) {
                    if (i14 < 0) {
                        if (i14 != -1) {
                            break;
                        }
                    }
                    i9++;
                    i14 |= i10 << 6;
                } else if (i9 == 2) {
                    if (i14 < 0) {
                        if (i14 != -2) {
                            if (i14 != -1) {
                                break;
                            }
                        } else {
                            bArr[i11] = (byte) (i10 >> 4);
                            i9 = 4;
                            i11++;
                        }
                    }
                    i9++;
                    i14 |= i10 << 6;
                } else if (i9 == 3) {
                    if (i14 < 0) {
                        if (i14 != -2) {
                            if (i14 != -1) {
                                break;
                            }
                        } else {
                            bArr[i11 + 1] = (byte) (i10 >> 2);
                            bArr[i11] = (byte) (i10 >> 10);
                            i11 += 2;
                            i9 = 5;
                        }
                    } else {
                        int i15 = i14 | (i10 << 6);
                        bArr[i11 + 2] = (byte) i15;
                        bArr[i11 + 1] = (byte) (i15 >> 8);
                        bArr[i11] = (byte) (i15 >> 16);
                        i11 += 3;
                        i10 = i15;
                        i9 = 0;
                    }
                } else if (i9 == 4) {
                    if (i14 != -2) {
                        if (i14 != -1) {
                            break;
                        }
                    } else {
                        i9++;
                    }
                } else if (i9 == 5 && i14 != -1) {
                    break;
                }
                i10 = i14;
            }
            i4 = i13;
        }
        throw new IllegalArgumentException("bad base-64");
    }
}
