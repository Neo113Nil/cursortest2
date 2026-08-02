package okhttp3.internal.http2;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.internal._UtilJvmKt;
import okio.ByteString;

/* loaded from: classes3.dex */
public abstract class Http2 {
    public static final String[] BINARY;
    public static final ByteString CONNECTION_PREFACE;
    public static final String[] FLAGS;
    public static final String[] FRAME_NAMES;

    static {
        ByteString.Companion companion = ByteString.Companion;
        CONNECTION_PREFACE = ByteString.Companion.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        FRAME_NAMES = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        FLAGS = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            binaryString.getClass();
            strArr[i] = StringsKt__StringsJVMKt.replace(_UtilJvmKt.format("%8s", binaryString), ' ', '0', false);
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = FLAGS;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, strArr3[i4], "|PADDED");
        }
        int length = FLAGS.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = FLAGS;
            if (strArr4[i7] == null) {
                strArr4[i7] = BINARY[i7];
            }
        }
    }

    public static String formattedType$okhttp(int i) {
        String[] strArr = FRAME_NAMES;
        return i < strArr.length ? strArr[i] : _UtilJvmKt.format("0x%02x", Integer.valueOf(i));
    }

    public static String frameLog(boolean z, int i, int i2, int i3, int i4) {
        String str;
        String str2;
        String formattedType$okhttp = formattedType$okhttp(i3);
        if (i4 == 0) {
            str = "";
        } else {
            String[] strArr = BINARY;
            if (i3 != 2 && i3 != 3) {
                if (i3 == 4 || i3 == 6) {
                    str = i4 == 1 ? "ACK" : strArr[i4];
                } else if (i3 != 7 && i3 != 8) {
                    String[] strArr2 = FLAGS;
                    if (i4 < strArr2.length) {
                        str2 = strArr2[i4];
                        str2.getClass();
                    } else {
                        str2 = strArr[i4];
                    }
                    str = (i3 != 5 || (i4 & 4) == 0) ? (i3 != 0 || (i4 & 32) == 0) ? str2 : StringsKt__StringsJVMKt.replace$default(str2, "PRIORITY", "COMPRESSED") : StringsKt__StringsJVMKt.replace$default(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr[i4];
        }
        return _UtilJvmKt.format("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), formattedType$okhttp, str);
    }

    public static String frameLogWindowUpdate(int i, int i2, long j, boolean z) {
        return _UtilJvmKt.format("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), formattedType$okhttp(8), Long.valueOf(j));
    }
}
