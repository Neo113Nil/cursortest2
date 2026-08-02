package org.brotli.dec;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes10.dex */
public final class BrotliInputStream extends InputStream {
    public final byte[] buffer;
    public int bufferOffset;
    public int remainingBufferBytes;
    public final State state;

    public BrotliInputStream(ByteArrayInputStream byteArrayInputStream) {
        State state = new State();
        this.state = state;
        this.buffer = new byte[16384];
        this.remainingBufferBytes = 0;
        this.bufferOffset = 0;
        try {
            State.setInput(state, byteArrayInputStream);
        } catch (BrotliRuntimeException e) {
            throw new IOException("Brotli decoder initialization failed", e);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        State state = this.state;
        int i = state.runningState;
        if (i == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("State MUST be initialized");
            return;
        }
        if (i == 11) {
            return;
        }
        state.runningState = 11;
        BitReader bitReader = state.br;
        ByteArrayInputStream byteArrayInputStream = bitReader.input;
        bitReader.input = null;
        if (byteArrayInputStream != null) {
            byteArrayInputStream.close();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        State state = this.state;
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Bad offset: "));
            return 0;
        }
        if (i2 < 0) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Bad length: "));
            return 0;
        }
        int i3 = i + i2;
        if (i3 > bArr.length) {
            Handlers$$ExternalSyntheticBUOutline0.m(bArr.length, JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i3, "Buffer overflow: ", " > "));
            return 0;
        }
        if (i2 == 0) {
            return 0;
        }
        int max = Math.max(this.remainingBufferBytes - this.bufferOffset, 0);
        if (max != 0) {
            max = Math.min(max, i2);
            System.arraycopy(this.buffer, this.bufferOffset, bArr, i, max);
            this.bufferOffset += max;
            i += max;
            i2 -= max;
            if (i2 == 0) {
                return max;
            }
        }
        try {
            state.output = bArr;
            state.outputOffset = i;
            state.outputLength = i2;
            state.outputUsed = 0;
            Utils.decompress(state);
            int i4 = state.outputUsed;
            if (i4 == 0) {
                return -1;
            }
            return i4 + max;
        } catch (BrotliRuntimeException e) {
            throw new IOException("Brotli stream decoding failed", e);
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.bufferOffset;
        int i2 = this.remainingBufferBytes;
        byte[] bArr = this.buffer;
        if (i >= i2) {
            int read = read(bArr, 0, bArr.length);
            this.remainingBufferBytes = read;
            this.bufferOffset = 0;
            if (read == -1) {
                return -1;
            }
        }
        int i3 = this.bufferOffset;
        this.bufferOffset = i3 + 1;
        return bArr[i3] & 255;
    }
}
