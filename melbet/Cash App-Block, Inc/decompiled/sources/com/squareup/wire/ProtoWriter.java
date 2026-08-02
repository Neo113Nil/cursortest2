package com.squareup.wire;

import okio.BufferedSink;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ProtoWriter {
    public final BufferedSink sink;

    public ProtoWriter(BufferedSink bufferedSink) {
        bufferedSink.getClass();
        this.sink = bufferedSink;
    }

    public final void writeBytes(ByteString byteString) {
        byteString.getClass();
        this.sink.write(byteString);
    }

    public final void writeVarint32(int i) {
        while (true) {
            int i2 = i & (-128);
            BufferedSink bufferedSink = this.sink;
            if (i2 == 0) {
                bufferedSink.writeByte(i);
                return;
            } else {
                bufferedSink.writeByte((i & 127) | 128);
                i >>>= 7;
            }
        }
    }

    public final void writeVarint64(long j) {
        while (true) {
            long j2 = (-128) & j;
            BufferedSink bufferedSink = this.sink;
            if (j2 == 0) {
                bufferedSink.writeByte((int) j);
                return;
            } else {
                bufferedSink.writeByte((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }
}
