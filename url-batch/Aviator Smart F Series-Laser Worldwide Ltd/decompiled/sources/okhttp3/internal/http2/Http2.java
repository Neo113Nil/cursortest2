package okhttp3.internal.http2;

import kotlin.jvm.internal.s;
import kotlin.text.t;
import okhttp3.internal.Util;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class Http2 {
    private static final String[] BINARY;
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;
    public static final Http2 INSTANCE = new Http2();
    public static final ByteString CONNECTION_PREFACE = ByteString.Companion.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final String[] FLAGS = new String[64];

    static {
        String replace$default;
        String[] strArr = new String[256];
        int i8 = 0;
        for (int i9 = 0; i9 < 256; i9++) {
            String binaryString = Integer.toBinaryString(i9);
            s.checkNotNullExpressionValue(binaryString, "toBinaryString(it)");
            replace$default = t.replace$default(Util.format("%8s", binaryString), ' ', '0', false, 4, (Object) null);
            strArr[i9] = replace$default;
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i10 = iArr[0];
        strArr2[i10 | 8] = s.stringPlus(strArr2[i10], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i11 = 0;
        while (i11 < 3) {
            int i12 = iArr2[i11];
            i11++;
            int i13 = iArr[0];
            String[] strArr3 = FLAGS;
            int i14 = i13 | i12;
            StringBuilder sb = new StringBuilder();
            sb.append((Object) strArr3[i13]);
            sb.append('|');
            sb.append((Object) strArr3[i12]);
            strArr3[i14] = sb.toString();
            strArr3[i14 | 8] = ((Object) strArr3[i13]) + '|' + ((Object) strArr3[i12]) + "|PADDED";
        }
        int length = FLAGS.length;
        while (i8 < length) {
            int i15 = i8 + 1;
            String[] strArr4 = FLAGS;
            if (strArr4[i8] == null) {
                strArr4[i8] = BINARY[i8];
            }
            i8 = i15;
        }
    }

    private Http2() {
    }

    public final String formatFlags(int i8, int i9) {
        String str;
        String replace$default;
        String replace$default2;
        if (i9 == 0) {
            return "";
        }
        if (i8 != 2 && i8 != 3) {
            if (i8 == 4 || i8 == 6) {
                return i9 == 1 ? "ACK" : BINARY[i9];
            }
            if (i8 != 7 && i8 != 8) {
                String[] strArr = FLAGS;
                if (i9 < strArr.length) {
                    str = strArr[i9];
                    s.checkNotNull(str);
                } else {
                    str = BINARY[i9];
                }
                String str2 = str;
                if (i8 == 5 && (i9 & 4) != 0) {
                    replace$default2 = t.replace$default(str2, "HEADERS", "PUSH_PROMISE", false, 4, (Object) null);
                    return replace$default2;
                }
                if (i8 != 0 || (i9 & 32) == 0) {
                    return str2;
                }
                replace$default = t.replace$default(str2, "PRIORITY", "COMPRESSED", false, 4, (Object) null);
                return replace$default;
            }
        }
        return BINARY[i9];
    }

    public final String formattedType$okhttp(int i8) {
        String[] strArr = FRAME_NAMES;
        return i8 < strArr.length ? strArr[i8] : Util.format("0x%02x", Integer.valueOf(i8));
    }

    public final String frameLog(boolean z7, int i8, int i9, int i10, int i11) {
        return Util.format("%s 0x%08x %5d %-13s %s", z7 ? "<<" : ">>", Integer.valueOf(i8), Integer.valueOf(i9), formattedType$okhttp(i10), formatFlags(i10, i11));
    }
}
