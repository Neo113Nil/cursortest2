package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

@CanIgnoreReturnValue
@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public interface Hasher extends PrimitiveSink {
    HashCode hash();

    @Deprecated
    int hashCode();

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putBoolean(boolean z7);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ PrimitiveSink putBoolean(boolean z7);

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putByte(byte b8);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ PrimitiveSink putByte(byte b8);

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putBytes(ByteBuffer byteBuffer);

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putBytes(byte[] bArr);

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putBytes(byte[] bArr, int i8, int i9);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ PrimitiveSink putBytes(ByteBuffer byteBuffer);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ PrimitiveSink putBytes(byte[] bArr);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ PrimitiveSink putBytes(byte[] bArr, int i8, int i9);

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putChar(char c8);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ PrimitiveSink putChar(char c8);

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putDouble(double d8);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ PrimitiveSink putDouble(double d8);

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putFloat(float f8);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ PrimitiveSink putFloat(float f8);

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putInt(int i8);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ PrimitiveSink putInt(int i8);

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putLong(long j8);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ PrimitiveSink putLong(long j8);

    <T> Hasher putObject(@ParametricNullness T t7, Funnel<? super T> funnel);

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putShort(short s7);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ PrimitiveSink putShort(short s7);

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putString(CharSequence charSequence, Charset charset);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ PrimitiveSink putString(CharSequence charSequence, Charset charset);

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putUnencodedChars(CharSequence charSequence);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ PrimitiveSink putUnencodedChars(CharSequence charSequence);
}
