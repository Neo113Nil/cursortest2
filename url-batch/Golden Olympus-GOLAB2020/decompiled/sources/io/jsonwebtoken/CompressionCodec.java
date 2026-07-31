package io.jsonwebtoken;

/* loaded from: classes3.dex */
public interface CompressionCodec {
    byte[] compress(byte[] bArr);

    byte[] decompress(byte[] bArr);

    String getAlgorithmName();
}
