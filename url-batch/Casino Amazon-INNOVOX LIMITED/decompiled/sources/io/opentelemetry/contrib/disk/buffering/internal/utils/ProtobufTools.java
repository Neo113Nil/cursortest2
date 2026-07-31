package io.opentelemetry.contrib.disk.buffering.internal.utils;

import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class ProtobufTools {
    public static int toUnsignedInt(byte b) {
        return b & UByte.MAX_VALUE;
    }

    private ProtobufTools() {
    }

    public static void writeRawVarint32(int i, OutputStream outputStream) throws IOException {
        ProtoAdapter.INT32.encode(outputStream, (OutputStream) Integer.valueOf(i));
    }

    public static int readRawVarint32(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw new IllegalStateException();
            }
            i2 |= (read & 127) << i3;
            if ((read & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw new IllegalStateException();
            }
            if ((read2 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw new IllegalStateException();
    }
}
