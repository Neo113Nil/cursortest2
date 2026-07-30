package okhttp3.internal.ws;

import kotlin.jvm.internal.s;
import okio.ByteString;
import okio.c;

/* loaded from: classes5.dex */
public final class WebSocketProtocol {
    public static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int B0_FLAG_FIN = 128;
    public static final int B0_FLAG_RSV1 = 64;
    public static final int B0_FLAG_RSV2 = 32;
    public static final int B0_FLAG_RSV3 = 16;
    public static final int B0_MASK_OPCODE = 15;
    public static final int B1_FLAG_MASK = 128;
    public static final int B1_MASK_LENGTH = 127;
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    public static final long CLOSE_MESSAGE_MAX = 123;
    public static final int CLOSE_NO_STATUS_CODE = 1005;
    public static final WebSocketProtocol INSTANCE = new WebSocketProtocol();
    public static final int OPCODE_BINARY = 2;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 8;
    public static final int OPCODE_CONTROL_PING = 9;
    public static final int OPCODE_CONTROL_PONG = 10;
    public static final int OPCODE_FLAG_CONTROL = 8;
    public static final int OPCODE_TEXT = 1;
    public static final long PAYLOAD_BYTE_MAX = 125;
    public static final int PAYLOAD_LONG = 127;
    public static final int PAYLOAD_SHORT = 126;
    public static final long PAYLOAD_SHORT_MAX = 65535;

    private WebSocketProtocol() {
    }

    public final String acceptHeader(String key) {
        s.checkNotNullParameter(key, "key");
        return ByteString.Companion.encodeUtf8(s.stringPlus(key, ACCEPT_MAGIC)).sha1().base64();
    }

    public final String closeCodeExceptionMessage(int i8) {
        if (i8 < 1000 || i8 >= 5000) {
            return s.stringPlus("Code must be in range [1000,5000): ", Integer.valueOf(i8));
        }
        if ((1004 > i8 || i8 >= 1007) && (1015 > i8 || i8 >= 3000)) {
            return null;
        }
        return "Code " + i8 + " is reserved and may not be used.";
    }

    public final void toggleMask(c.a cursor, byte[] key) {
        s.checkNotNullParameter(cursor, "cursor");
        s.checkNotNullParameter(key, "key");
        int length = key.length;
        int i8 = 0;
        do {
            byte[] bArr = cursor.data;
            int i9 = cursor.start;
            int i10 = cursor.end;
            if (bArr != null) {
                while (i9 < i10) {
                    int i11 = i8 % length;
                    bArr[i9] = (byte) (bArr[i9] ^ key[i11]);
                    i9++;
                    i8 = i11 + 1;
                }
            }
        } while (cursor.next() != -1);
    }

    public final void validateCloseCode(int i8) {
        String closeCodeExceptionMessage = closeCodeExceptionMessage(i8);
        if (closeCodeExceptionMessage == null) {
            return;
        }
        s.checkNotNull(closeCodeExceptionMessage);
        throw new IllegalArgumentException(closeCodeExceptionMessage.toString());
    }
}
