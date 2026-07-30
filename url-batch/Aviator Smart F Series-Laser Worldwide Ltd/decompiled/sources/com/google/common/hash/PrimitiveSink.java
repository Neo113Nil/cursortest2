package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

@CanIgnoreReturnValue
@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public interface PrimitiveSink {
    PrimitiveSink putBoolean(boolean z7);

    PrimitiveSink putByte(byte b8);

    PrimitiveSink putBytes(ByteBuffer byteBuffer);

    PrimitiveSink putBytes(byte[] bArr);

    PrimitiveSink putBytes(byte[] bArr, int i8, int i9);

    PrimitiveSink putChar(char c8);

    PrimitiveSink putDouble(double d8);

    PrimitiveSink putFloat(float f8);

    PrimitiveSink putInt(int i8);

    PrimitiveSink putLong(long j8);

    PrimitiveSink putShort(short s7);

    PrimitiveSink putString(CharSequence charSequence, Charset charset);

    PrimitiveSink putUnencodedChars(CharSequence charSequence);
}
