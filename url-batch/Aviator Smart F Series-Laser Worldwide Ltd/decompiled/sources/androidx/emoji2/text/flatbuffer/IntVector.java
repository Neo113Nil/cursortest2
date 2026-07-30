package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class IntVector extends BaseVector {
    public IntVector __assign(int i8, ByteBuffer byteBuffer) {
        __reset(i8, 4, byteBuffer);
        return this;
    }

    public int get(int i8) {
        return this.bb.getInt(__element(i8));
    }

    public long getAsUnsigned(int i8) {
        return get(i8) & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32;
    }
}
