package okhttp3.internal.http2;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.Util;
import okio.h;

@Metadata
/* loaded from: classes3.dex */
public final class Http2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Http2 f42934a = new Http2();

    /* renamed from: b, reason: collision with root package name */
    public static final h f42935b = h.f43270e.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f42936c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f42937d = new String[64];

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f42938e;

    static {
        String[] strArr = new String[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        for (int i4 = 0; i4 < 256; i4++) {
            String binaryString = Integer.toBinaryString(i4);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(it)");
            strArr[i4] = StringsKt.F(Util.s("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f42938e = strArr;
        String[] strArr2 = f42937d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i5 = iArr[0];
        strArr2[i5 | 8] = strArr2[i5] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i6 = 0; i6 < 3; i6++) {
            int i7 = iArr2[i6];
            int i8 = iArr[0];
            String[] strArr3 = f42937d;
            int i9 = i8 | i7;
            strArr3[i9] = strArr3[i8] + '|' + strArr3[i7];
            strArr3[i9 | 8] = strArr3[i8] + '|' + strArr3[i7] + "|PADDED";
        }
        int length = f42937d.length;
        for (int i10 = 0; i10 < length; i10++) {
            String[] strArr4 = f42937d;
            if (strArr4[i10] == null) {
                strArr4[i10] = f42938e[i10];
            }
        }
    }

    private Http2() {
    }

    public final String a(int i4, int i5) {
        String str;
        if (i5 == 0) {
            return "";
        }
        if (i4 != 2 && i4 != 3) {
            if (i4 == 4 || i4 == 6) {
                return i5 == 1 ? "ACK" : f42938e[i5];
            }
            if (i4 != 7 && i4 != 8) {
                String[] strArr = f42937d;
                if (i5 < strArr.length) {
                    str = strArr[i5];
                    Intrinsics.checkNotNull(str);
                } else {
                    str = f42938e[i5];
                }
                String str2 = str;
                return (i4 != 5 || (i5 & 4) == 0) ? (i4 != 0 || (i5 & 32) == 0) ? str2 : StringsKt.G(str2, "PRIORITY", "COMPRESSED", false, 4, null) : StringsKt.G(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return f42938e[i5];
    }

    public final String b(int i4) {
        String[] strArr = f42936c;
        return i4 < strArr.length ? strArr[i4] : Util.s("0x%02x", Integer.valueOf(i4));
    }

    public final String c(boolean z4, int i4, int i5, int i6, int i7) {
        return Util.s("%s 0x%08x %5d %-13s %s", z4 ? "<<" : ">>", Integer.valueOf(i4), Integer.valueOf(i5), b(i6), a(i6, i7));
    }
}
