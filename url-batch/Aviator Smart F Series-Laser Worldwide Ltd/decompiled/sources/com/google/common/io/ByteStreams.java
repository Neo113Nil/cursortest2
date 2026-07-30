package com.google.common.io;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public final class ByteStreams {
    private static final int BUFFER_SIZE = 8192;
    private static final int MAX_ARRAY_LEN = 2147483639;
    private static final OutputStream NULL_OUTPUT_STREAM = new OutputStream() { // from class: com.google.common.io.ByteStreams.1
        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i8) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            Preconditions.checkNotNull(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i8, int i9) {
            Preconditions.checkNotNull(bArr);
            Preconditions.checkPositionIndexes(i8, i9 + i8, bArr.length);
        }
    };
    private static final int TO_BYTE_ARRAY_DEQUE_SIZE = 20;
    private static final int ZERO_COPY_CHUNK_SIZE = 524288;

    private static final class LimitedInputStream extends FilterInputStream {
        private long left;
        private long mark;

        LimitedInputStream(InputStream inputStream, long j8) {
            super(inputStream);
            this.mark = -1L;
            Preconditions.checkNotNull(inputStream);
            Preconditions.checkArgument(j8 >= 0, "limit must be non-negative");
            this.left = j8;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.left);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i8) {
            ((FilterInputStream) this).in.mark(i8);
            this.mark = this.left;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            if (this.left == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.left--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.mark == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.left = this.mark;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j8) {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j8, this.left));
            this.left -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i8, int i9) {
            long j8 = this.left;
            if (j8 == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i8, (int) Math.min(i9, j8));
            if (read != -1) {
                this.left -= read;
            }
            return read;
        }
    }

    private ByteStreams() {
    }

    private static byte[] combineBuffers(Queue<byte[]> queue, int i8) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i8) {
            return remove;
        }
        int length = i8 - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i8);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i8 - length, min);
            length -= min;
        }
        return copyOf;
    }

    @CanIgnoreReturnValue
    public static long copy(InputStream inputStream, OutputStream outputStream) {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(outputStream);
        byte[] createBuffer = createBuffer();
        long j8 = 0;
        while (true) {
            int read = inputStream.read(createBuffer);
            if (read == -1) {
                return j8;
            }
            outputStream.write(createBuffer, 0, read);
            j8 += read;
        }
    }

    static byte[] createBuffer() {
        return new byte[8192];
    }

    @CanIgnoreReturnValue
    @Beta
    public static long exhaust(InputStream inputStream) {
        byte[] createBuffer = createBuffer();
        long j8 = 0;
        while (true) {
            long read = inputStream.read(createBuffer);
            if (read == -1) {
                return j8;
            }
            j8 += read;
        }
    }

    @Beta
    public static InputStream limit(InputStream inputStream, long j8) {
        return new LimitedInputStream(inputStream, j8);
    }

    @Beta
    public static ByteArrayDataInput newDataInput(byte[] bArr) {
        return newDataInput(new ByteArrayInputStream(bArr));
    }

    @Beta
    public static ByteArrayDataOutput newDataOutput() {
        return newDataOutput(new ByteArrayOutputStream());
    }

    @Beta
    public static OutputStream nullOutputStream() {
        return NULL_OUTPUT_STREAM;
    }

    @CanIgnoreReturnValue
    @Beta
    public static int read(InputStream inputStream, byte[] bArr, int i8, int i9) {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(bArr);
        int i10 = 0;
        if (i9 < 0) {
            throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", Integer.valueOf(i9)));
        }
        Preconditions.checkPositionIndexes(i8, i8 + i9, bArr.length);
        while (i10 < i9) {
            int read = inputStream.read(bArr, i8 + i10, i9 - i10);
            if (read == -1) {
                break;
            }
            i10 += read;
        }
        return i10;
    }

    @CanIgnoreReturnValue
    @Beta
    @ParametricNullness
    public static <T> T readBytes(InputStream inputStream, ByteProcessor<T> byteProcessor) {
        int read;
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(byteProcessor);
        byte[] createBuffer = createBuffer();
        do {
            read = inputStream.read(createBuffer);
            if (read == -1) {
                break;
            }
        } while (byteProcessor.processBytes(createBuffer, 0, read));
        return byteProcessor.getResult();
    }

    @Beta
    public static void readFully(InputStream inputStream, byte[] bArr) {
        readFully(inputStream, bArr, 0, bArr.length);
    }

    @Beta
    public static void skipFully(InputStream inputStream, long j8) {
        long skipUpTo = skipUpTo(inputStream, j8);
        if (skipUpTo >= j8) {
            return;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append("reached end of stream after skipping ");
        sb.append(skipUpTo);
        sb.append(" bytes; ");
        sb.append(j8);
        sb.append(" bytes expected");
        throw new EOFException(sb.toString());
    }

    private static long skipSafely(InputStream inputStream, long j8) {
        int available = inputStream.available();
        if (available == 0) {
            return 0L;
        }
        return inputStream.skip(Math.min(available, j8));
    }

    static long skipUpTo(InputStream inputStream, long j8) {
        byte[] bArr = null;
        long j9 = 0;
        while (j9 < j8) {
            long j10 = j8 - j9;
            long skipSafely = skipSafely(inputStream, j10);
            if (skipSafely == 0) {
                int min = (int) Math.min(j10, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                if (bArr == null) {
                    bArr = new byte[min];
                }
                skipSafely = inputStream.read(bArr, 0, min);
                if (skipSafely == -1) {
                    break;
                }
            }
            j9 += skipSafely;
        }
        return j9;
    }

    public static byte[] toByteArray(InputStream inputStream) {
        Preconditions.checkNotNull(inputStream);
        return toByteArrayInternal(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] toByteArrayInternal(InputStream inputStream, Queue<byte[]> queue, int i8) {
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i8) * 2));
        while (i8 < MAX_ARRAY_LEN) {
            int min2 = Math.min(min, MAX_ARRAY_LEN - i8);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i9 = 0;
            while (i9 < min2) {
                int read = inputStream.read(bArr, i9, min2 - i9);
                if (read == -1) {
                    return combineBuffers(queue, i8);
                }
                i9 += read;
                i8 += read;
            }
            min = IntMath.saturatedMultiply(min, min < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return combineBuffers(queue, MAX_ARRAY_LEN);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static class ByteArrayDataInputStream implements ByteArrayDataInput {
        final DataInput input;

        ByteArrayDataInputStream(ByteArrayInputStream byteArrayInputStream) {
            this.input = new DataInputStream(byteArrayInputStream);
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public boolean readBoolean() {
            try {
                return this.input.readBoolean();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public byte readByte() {
            try {
                return this.input.readByte();
            } catch (EOFException e8) {
                throw new IllegalStateException(e8);
            } catch (IOException e9) {
                throw new AssertionError(e9);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public char readChar() {
            try {
                return this.input.readChar();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public double readDouble() {
            try {
                return this.input.readDouble();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public float readFloat() {
            try {
                return this.input.readFloat();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public void readFully(byte[] bArr) {
            try {
                this.input.readFully(bArr);
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int readInt() {
            try {
                return this.input.readInt();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        @CheckForNull
        public String readLine() {
            try {
                return this.input.readLine();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public long readLong() {
            try {
                return this.input.readLong();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public short readShort() {
            try {
                return this.input.readShort();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public String readUTF() {
            try {
                return this.input.readUTF();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int readUnsignedByte() {
            try {
                return this.input.readUnsignedByte();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int readUnsignedShort() {
            try {
                return this.input.readUnsignedShort();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int skipBytes(int i8) {
            try {
                return this.input.skipBytes(i8);
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public void readFully(byte[] bArr, int i8, int i9) {
            try {
                this.input.readFully(bArr, i8, i9);
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    private static class ByteArrayDataOutputStream implements ByteArrayDataOutput {
        final ByteArrayOutputStream byteArrayOutputStream;
        final DataOutput output;

        ByteArrayDataOutputStream(ByteArrayOutputStream byteArrayOutputStream) {
            this.byteArrayOutputStream = byteArrayOutputStream;
            this.output = new DataOutputStream(byteArrayOutputStream);
        }

        @Override // com.google.common.io.ByteArrayDataOutput
        public byte[] toByteArray() {
            return this.byteArrayOutputStream.toByteArray();
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void write(int i8) {
            try {
                this.output.write(i8);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeBoolean(boolean z7) {
            try {
                this.output.writeBoolean(z7);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeByte(int i8) {
            try {
                this.output.writeByte(i8);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeBytes(String str) {
            try {
                this.output.writeBytes(str);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeChar(int i8) {
            try {
                this.output.writeChar(i8);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeChars(String str) {
            try {
                this.output.writeChars(str);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeDouble(double d8) {
            try {
                this.output.writeDouble(d8);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeFloat(float f8) {
            try {
                this.output.writeFloat(f8);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeInt(int i8) {
            try {
                this.output.writeInt(i8);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeLong(long j8) {
            try {
                this.output.writeLong(j8);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeShort(int i8) {
            try {
                this.output.writeShort(i8);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeUTF(String str) {
            try {
                this.output.writeUTF(str);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void write(byte[] bArr) {
            try {
                this.output.write(bArr);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void write(byte[] bArr, int i8, int i9) {
            try {
                this.output.write(bArr, i8, i9);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }
    }

    @Beta
    public static ByteArrayDataInput newDataInput(byte[] bArr, int i8) {
        Preconditions.checkPositionIndex(i8, bArr.length);
        return newDataInput(new ByteArrayInputStream(bArr, i8, bArr.length - i8));
    }

    @Beta
    public static ByteArrayDataOutput newDataOutput(int i8) {
        if (i8 >= 0) {
            return newDataOutput(new ByteArrayOutputStream(i8));
        }
        throw new IllegalArgumentException(String.format("Invalid size: %s", Integer.valueOf(i8)));
    }

    @Beta
    public static void readFully(InputStream inputStream, byte[] bArr, int i8, int i9) {
        int read = read(inputStream, bArr, i8, i9);
        if (read == i9) {
            return;
        }
        StringBuilder sb = new StringBuilder(81);
        sb.append("reached end of stream after reading ");
        sb.append(read);
        sb.append(" bytes; ");
        sb.append(i9);
        sb.append(" bytes expected");
        throw new EOFException(sb.toString());
    }

    static byte[] toByteArray(InputStream inputStream, long j8) {
        Preconditions.checkArgument(j8 >= 0, "expectedSize (%s) must be non-negative", j8);
        if (j8 <= 2147483639) {
            int i8 = (int) j8;
            byte[] bArr = new byte[i8];
            int i9 = i8;
            while (i9 > 0) {
                int i10 = i8 - i9;
                int read = inputStream.read(bArr, i10, i9);
                if (read == -1) {
                    return Arrays.copyOf(bArr, i10);
                }
                i9 -= read;
            }
            int read2 = inputStream.read();
            if (read2 == -1) {
                return bArr;
            }
            ArrayDeque arrayDeque = new ArrayDeque(22);
            arrayDeque.add(bArr);
            arrayDeque.add(new byte[]{(byte) read2});
            return toByteArrayInternal(inputStream, arrayDeque, i8 + 1);
        }
        StringBuilder sb = new StringBuilder(62);
        sb.append(j8);
        sb.append(" bytes is too large to fit in a byte array");
        throw new OutOfMemoryError(sb.toString());
    }

    @Beta
    public static ByteArrayDataInput newDataInput(ByteArrayInputStream byteArrayInputStream) {
        return new ByteArrayDataInputStream((ByteArrayInputStream) Preconditions.checkNotNull(byteArrayInputStream));
    }

    @Beta
    public static ByteArrayDataOutput newDataOutput(ByteArrayOutputStream byteArrayOutputStream) {
        return new ByteArrayDataOutputStream((ByteArrayOutputStream) Preconditions.checkNotNull(byteArrayOutputStream));
    }

    @CanIgnoreReturnValue
    public static long copy(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) {
        Preconditions.checkNotNull(readableByteChannel);
        Preconditions.checkNotNull(writableByteChannel);
        long j8 = 0;
        if (readableByteChannel instanceof FileChannel) {
            FileChannel fileChannel = (FileChannel) readableByteChannel;
            long position = fileChannel.position();
            long j9 = position;
            while (true) {
                long transferTo = fileChannel.transferTo(j9, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, writableByteChannel);
                j9 += transferTo;
                fileChannel.position(j9);
                if (transferTo <= 0 && j9 >= fileChannel.size()) {
                    return j9 - position;
                }
            }
        } else {
            ByteBuffer wrap = ByteBuffer.wrap(createBuffer());
            while (readableByteChannel.read(wrap) != -1) {
                Java8Compatibility.flip(wrap);
                while (wrap.hasRemaining()) {
                    j8 += writableByteChannel.write(wrap);
                }
                Java8Compatibility.clear(wrap);
            }
            return j8;
        }
    }
}
