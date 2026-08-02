package io.flutter.embedding.android;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class KeyData {
    private static final int BYTES_PER_FIELD = 8;
    public static final String CHANNEL = "flutter/keydata";
    private static final int FIELD_COUNT = 6;
    private static final String TAG = "KeyData";
    String character;
    DeviceType deviceType;
    long logicalKey;
    long physicalKey;
    boolean synthesized;
    long timestamp;
    Type type;

    public enum DeviceType {
        kKeyboard(0),
        kDirectionalPad(1),
        kGamepad(2),
        kJoystick(3),
        kHdmi(4);

        private final long value;

        DeviceType(long j4) {
            this.value = j4;
        }

        public static DeviceType fromLong(long j4) {
            int i4 = (int) j4;
            if (i4 == 0) {
                return kKeyboard;
            }
            if (i4 == 1) {
                return kDirectionalPad;
            }
            if (i4 == 2) {
                return kGamepad;
            }
            if (i4 == 3) {
                return kJoystick;
            }
            if (i4 == 4) {
                return kHdmi;
            }
            throw new AssertionError("Unexpected DeviceType value");
        }

        public long getValue() {
            return this.value;
        }
    }

    public enum Type {
        kDown(0),
        kUp(1),
        kRepeat(2);

        private long value;

        Type(long j4) {
            this.value = j4;
        }

        public static Type fromLong(long j4) {
            int i4 = (int) j4;
            if (i4 == 0) {
                return kDown;
            }
            if (i4 == 1) {
                return kUp;
            }
            if (i4 == 2) {
                return kRepeat;
            }
            throw new AssertionError("Unexpected Type value");
        }

        public long getValue() {
            return this.value;
        }
    }

    public KeyData() {
    }

    public ByteBuffer toBytes() {
        try {
            String str = this.character;
            byte[] bytes = str == null ? null : str.getBytes(CharEncoding.UTF_8);
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(this.timestamp);
            allocateDirect.putLong(this.type.getValue());
            allocateDirect.putLong(this.physicalKey);
            allocateDirect.putLong(this.logicalKey);
            allocateDirect.putLong(this.synthesized ? 1L : 0L);
            allocateDirect.putLong(this.deviceType.getValue());
            if (bytes != null) {
                allocateDirect.put(bytes);
            }
            return allocateDirect;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    public KeyData(ByteBuffer byteBuffer) {
        long j4 = byteBuffer.getLong();
        this.timestamp = byteBuffer.getLong();
        this.type = Type.fromLong(byteBuffer.getLong());
        this.physicalKey = byteBuffer.getLong();
        this.logicalKey = byteBuffer.getLong();
        this.synthesized = byteBuffer.getLong() != 0;
        this.deviceType = DeviceType.fromLong(byteBuffer.getLong());
        if (byteBuffer.remaining() != j4) {
            throw new AssertionError(String.format("Unexpected char length: charSize is %d while buffer has position %d, capacity %d, limit %d", Long.valueOf(j4), Integer.valueOf(byteBuffer.position()), Integer.valueOf(byteBuffer.capacity()), Integer.valueOf(byteBuffer.limit())));
        }
        this.character = null;
        if (j4 != 0) {
            int i4 = (int) j4;
            byte[] bArr = new byte[i4];
            byteBuffer.get(bArr, 0, i4);
            try {
                this.character = new String(bArr, CharEncoding.UTF_8);
            } catch (UnsupportedEncodingException unused) {
                throw new AssertionError("UTF-8 unsupported");
            }
        }
    }
}
