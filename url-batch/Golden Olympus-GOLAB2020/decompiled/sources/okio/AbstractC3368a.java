package okio;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import okio.h;

/* renamed from: okio.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3368a {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f43252a;

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f43253b;

    static {
        h.a aVar = h.f43270e;
        f43252a = aVar.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").h();
        f43253b = aVar.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").h();
    }

    public static final byte[] a(String str) {
        int i4;
        char charAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i5 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i5];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            char charAt2 = str.charAt(i9);
            if ('A' <= charAt2 && charAt2 < '[') {
                i4 = charAt2 - 'A';
            } else if ('a' <= charAt2 && charAt2 < '{') {
                i4 = charAt2 - 'G';
            } else if ('0' <= charAt2 && charAt2 < ':') {
                i4 = charAt2 + 4;
            } else if (charAt2 == '+' || charAt2 == '-') {
                i4 = 62;
            } else if (charAt2 == '/' || charAt2 == '_') {
                i4 = 63;
            } else {
                if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                    return null;
                }
            }
            i7 = (i7 << 6) | i4;
            i6++;
            if (i6 % 4 == 0) {
                bArr[i8] = (byte) (i7 >> 16);
                int i10 = i8 + 2;
                bArr[i8 + 1] = (byte) (i7 >> 8);
                i8 += 3;
                bArr[i10] = (byte) i7;
            }
        }
        int i11 = i6 % 4;
        if (i11 == 1) {
            return null;
        }
        if (i11 == 2) {
            bArr[i8] = (byte) ((i7 << 12) >> 16);
            i8++;
        } else if (i11 == 3) {
            int i12 = i7 << 6;
            int i13 = i8 + 1;
            bArr[i8] = (byte) (i12 >> 16);
            i8 += 2;
            bArr[i13] = (byte) (i12 >> 8);
        }
        if (i8 == i5) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i8);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static final String b(byte[] bArr, byte[] map) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            byte b4 = bArr[i4];
            int i6 = i4 + 2;
            byte b5 = bArr[i4 + 1];
            i4 += 3;
            byte b6 = bArr[i6];
            bArr2[i5] = map[(b4 & 255) >> 2];
            bArr2[i5 + 1] = map[((b4 & 3) << 4) | ((b5 & 255) >> 4)];
            int i7 = i5 + 3;
            bArr2[i5 + 2] = map[((b5 & 15) << 2) | ((b6 & 255) >> 6)];
            i5 += 4;
            bArr2[i7] = map[b6 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b7 = bArr[i4];
            bArr2[i5] = map[(b7 & 255) >> 2];
            bArr2[i5 + 1] = map[(b7 & 3) << 4];
            bArr2[i5 + 2] = 61;
            bArr2[i5 + 3] = 61;
        } else if (length2 == 2) {
            int i8 = i4 + 1;
            byte b8 = bArr[i4];
            byte b9 = bArr[i8];
            bArr2[i5] = map[(b8 & 255) >> 2];
            bArr2[i5 + 1] = map[((b8 & 3) << 4) | ((b9 & 255) >> 4)];
            bArr2[i5 + 2] = map[(b9 & 15) << 2];
            bArr2[i5 + 3] = 61;
        }
        return E.b(bArr2);
    }

    public static /* synthetic */ String c(byte[] bArr, byte[] bArr2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            bArr2 = f43252a;
        }
        return b(bArr, bArr2);
    }
}
