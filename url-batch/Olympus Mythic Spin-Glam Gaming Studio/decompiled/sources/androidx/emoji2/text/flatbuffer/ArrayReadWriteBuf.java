package androidx.emoji2.text.flatbuffer;

import com.inmobi.media.core.config.models.AdConfig;

/* loaded from: classes6.dex */
public class ArrayReadWriteBuf implements ReadWriteBuf {
    private byte[] buffer;
    private int writePos;

    public ArrayReadWriteBuf(byte[] bArr, int i) {
        this.buffer = bArr;
        this.writePos = i;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte get(int i) {
        return this.buffer[i];
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public short getShort(int i) {
        byte[] bArr = this.buffer;
        return (short) ((bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr[i + 1] << 8));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public int getInt(int i) {
        byte[] bArr = this.buffer;
        return (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr[i + 3] << 24) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public long getLong(int i) {
        byte[] bArr = this.buffer;
        int i2 = i + 6;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i2] & 255) << 48) | (bArr[i + 7] << 56);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public float getFloat(int i) {
        return Float.intBitsToFloat(getInt(i));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public double getDouble(int i) {
        return Double.longBitsToDouble(getLong(i));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public String getString(int i, int i2) {
        return Utf8Safe.decodeUtf8Array(this.buffer, i, i2);
    }
}
