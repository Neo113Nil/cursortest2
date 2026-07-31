package com.google.flatbuffers;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class StringVector extends BaseVector {
    private Utf8 utf8 = Utf8.getDefault();

    public StringVector __assign(int i4, int i5, ByteBuffer byteBuffer) {
        __reset(i4, i5, byteBuffer);
        return this;
    }
}
