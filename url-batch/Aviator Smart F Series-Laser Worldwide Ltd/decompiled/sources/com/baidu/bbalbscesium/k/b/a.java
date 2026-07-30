package com.baidu.bbalbscesium.k.b;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class a {
    static void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i8) {
        if (i8 < 0 || byteBuffer2.remaining() < i8 || byteBuffer3.remaining() < i8 || byteBuffer.remaining() < i8) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i9 = 0; i9 < i8; i9++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }
}
