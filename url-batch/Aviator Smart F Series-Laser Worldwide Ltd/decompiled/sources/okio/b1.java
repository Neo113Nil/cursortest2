package okio;

import java.util.Arrays;
import okio.ByteString;

/* loaded from: classes5.dex */
public abstract class b1 {
    private static final byte[] BASE64;
    private static final byte[] BASE64_URL_SAFE;

    static {
        ByteString.a aVar = ByteString.Companion;
        BASE64 = aVar.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$okio();
        BASE64_URL_SAFE = aVar.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$okio();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4 A[LOOP:1: B:14:0x003b->B:24:0x00a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final byte[] decodeBase64ToArray(String str) {
        int i8;
        int i9;
        char charAt;
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i10 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i10];
        int i11 = 0;
        int i12 = 0;
        if (length > 0) {
            int i13 = 0;
            i8 = 0;
            while (true) {
                int i14 = i11 + 1;
                char charAt2 = str.charAt(i11);
                if ('A' <= charAt2 && charAt2 <= 'Z') {
                    i9 = charAt2 - 'A';
                } else if ('a' <= charAt2 && charAt2 <= 'z') {
                    i9 = charAt2 - 'G';
                } else if ('0' <= charAt2 && charAt2 <= '9') {
                    i9 = charAt2 + 4;
                } else if (charAt2 == '+' || charAt2 == '-') {
                    i9 = 62;
                } else if (charAt2 == '/' || charAt2 == '_') {
                    i9 = 63;
                } else {
                    if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                        return null;
                    }
                    if (i14 < length) {
                        i11 = i13;
                        break;
                    }
                    i11 = i14;
                }
                int i15 = i9 | (i8 << 6);
                i13++;
                if (i13 % 4 == 0) {
                    bArr[i12] = (byte) (i15 >> 16);
                    int i16 = i12 + 2;
                    bArr[i12 + 1] = (byte) (i15 >> 8);
                    i12 += 3;
                    bArr[i16] = (byte) i15;
                }
                i8 = i15;
                if (i14 < length) {
                }
            }
        } else {
            i8 = 0;
        }
        int i17 = i11 % 4;
        if (i17 == 1) {
            return null;
        }
        if (i17 == 2) {
            bArr[i12] = (byte) ((i8 << 12) >> 16);
            i12++;
        } else if (i17 == 3) {
            int i18 = i8 << 6;
            int i19 = i12 + 1;
            bArr[i12] = (byte) (i18 >> 16);
            i12 += 2;
            bArr[i19] = (byte) (i18 >> 8);
        }
        if (i12 == i10) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i12);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    public static final String encodeBase64(byte[] bArr, byte[] map) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            byte b8 = bArr[i8];
            int i10 = i8 + 2;
            byte b9 = bArr[i8 + 1];
            i8 += 3;
            byte b10 = bArr[i10];
            bArr2[i9] = map[(b8 & 255) >> 2];
            bArr2[i9 + 1] = map[((b8 & 3) << 4) | ((b9 & 255) >> 4)];
            int i11 = i9 + 3;
            bArr2[i9 + 2] = map[((b9 & 15) << 2) | ((b10 & 255) >> 6)];
            i9 += 4;
            bArr2[i11] = map[b10 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b11 = bArr[i8];
            bArr2[i9] = map[(b11 & 255) >> 2];
            bArr2[i9 + 1] = map[(b11 & 3) << 4];
            byte b12 = (byte) 61;
            bArr2[i9 + 2] = b12;
            bArr2[i9 + 3] = b12;
        } else if (length2 == 2) {
            int i12 = i8 + 1;
            byte b13 = bArr[i8];
            byte b14 = bArr[i12];
            bArr2[i9] = map[(b13 & 255) >> 2];
            bArr2[i9 + 1] = map[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
            bArr2[i9 + 2] = map[(b14 & 15) << 2];
            bArr2[i9 + 3] = (byte) 61;
        }
        return c1.toUtf8String(bArr2);
    }

    public static /* synthetic */ String encodeBase64$default(byte[] bArr, byte[] bArr2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            bArr2 = BASE64;
        }
        return encodeBase64(bArr, bArr2);
    }

    public static final byte[] getBASE64() {
        return BASE64;
    }

    public static /* synthetic */ void getBASE64$annotations() {
    }

    public static final byte[] getBASE64_URL_SAFE() {
        return BASE64_URL_SAFE;
    }

    public static /* synthetic */ void getBASE64_URL_SAFE$annotations() {
    }
}
