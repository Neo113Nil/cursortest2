package cn.hutool.core.io;

/* loaded from: classes.dex */
public class e {
    private byte[][] buffers;
    private int buffersCount;
    private byte[] currentBuffer;
    private int currentBufferIndex;
    private final int minChunkLen;
    private int offset;
    private int size;

    public e() {
        this(1024);
    }

    private void needNewBuffer(int i8) {
        int max = Math.max(this.minChunkLen, i8 - this.size);
        int i9 = this.currentBufferIndex + 1;
        this.currentBufferIndex = i9;
        this.currentBuffer = new byte[max];
        this.offset = 0;
        byte[][] bArr = this.buffers;
        if (i9 >= bArr.length) {
            byte[][] bArr2 = new byte[bArr.length << 1][];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.buffers = bArr2;
        }
        this.buffers[this.currentBufferIndex] = this.currentBuffer;
        this.buffersCount++;
    }

    public e append(byte[] bArr, int i8, int i9) {
        int i10 = i8 + i9;
        if (i8 < 0 || i9 < 0 || i10 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i9 == 0) {
            return this;
        }
        int i11 = this.size + i9;
        byte[] bArr2 = this.currentBuffer;
        if (bArr2 != null) {
            int min = Math.min(i9, bArr2.length - this.offset);
            System.arraycopy(bArr, i10 - i9, this.currentBuffer, this.offset, min);
            i9 -= min;
            this.offset += min;
            this.size += min;
        }
        if (i9 > 0) {
            needNewBuffer(i11);
            int min2 = Math.min(i9, this.currentBuffer.length - this.offset);
            System.arraycopy(bArr, i10 - i9, this.currentBuffer, this.offset, min2);
            this.offset += min2;
            this.size += min2;
        }
        return this;
    }

    public byte[] array(int i8) {
        return this.buffers[i8];
    }

    public byte get(int i8) {
        if (i8 >= this.size || i8 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i9 = 0;
        while (true) {
            byte[] bArr = this.buffers[i9];
            if (i8 < bArr.length) {
                return bArr[i8];
            }
            i9++;
            i8 -= bArr.length;
        }
    }

    public int index() {
        return this.currentBufferIndex;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int offset() {
        return this.offset;
    }

    public void reset() {
        this.size = 0;
        this.offset = 0;
        this.currentBufferIndex = -1;
        this.currentBuffer = null;
        this.buffersCount = 0;
    }

    public int size() {
        return this.size;
    }

    public byte[] toArray() {
        byte[] bArr = new byte[this.size];
        if (this.currentBufferIndex == -1) {
            return bArr;
        }
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = this.currentBufferIndex;
            if (i8 >= i10) {
                System.arraycopy(this.buffers[i10], 0, bArr, i9, this.offset);
                return bArr;
            }
            byte[] bArr2 = this.buffers[i8];
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i9, length);
            i9 += length;
            i8++;
        }
    }

    public e(int i8) {
        this.buffers = new byte[16][];
        this.currentBufferIndex = -1;
        this.minChunkLen = Math.abs(i8 <= 0 ? 1024 : i8);
    }

    public byte[] toArray(int i8, int i9) {
        byte[] bArr = new byte[i9];
        if (i9 == 0) {
            return bArr;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr2 = this.buffers[i10];
            if (i8 < bArr2.length) {
                break;
            }
            i8 -= bArr2.length;
            i10++;
        }
        int i11 = 0;
        while (i10 < this.buffersCount) {
            byte[] bArr3 = this.buffers[i10];
            int min = Math.min(bArr3.length - i8, i9);
            System.arraycopy(bArr3, i8, bArr, i11, min);
            i11 += min;
            i9 -= min;
            if (i9 == 0) {
                break;
            }
            i10++;
            i8 = 0;
        }
        return bArr;
    }

    public e append(byte[] bArr) {
        return append(bArr, 0, bArr.length);
    }

    public e append(byte b8) {
        byte[] bArr = this.currentBuffer;
        if (bArr == null || this.offset == bArr.length) {
            needNewBuffer(this.size + 1);
        }
        byte[] bArr2 = this.currentBuffer;
        int i8 = this.offset;
        bArr2[i8] = b8;
        this.offset = i8 + 1;
        this.size++;
        return this;
    }

    public e append(e eVar) {
        if (eVar.size == 0) {
            return this;
        }
        for (int i8 = 0; i8 < eVar.currentBufferIndex; i8++) {
            append(eVar.buffers[i8]);
        }
        append(eVar.currentBuffer, 0, eVar.offset);
        return this;
    }
}
