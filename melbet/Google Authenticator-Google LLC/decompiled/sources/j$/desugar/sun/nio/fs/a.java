package j$.desugar.sun.nio.fs;

import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class a extends FileChannel implements SeekableByteChannel {
    public static final /* synthetic */ int b = 0;
    public final FileChannel a;

    public a(FileChannel fileChannel) {
        this.a = fileChannel;
    }

    @Override // java.nio.channels.FileChannel
    public final void force(boolean z) {
        this.a.force(z);
    }

    @Override // java.nio.channels.spi.AbstractInterruptibleChannel
    public final void implCloseChannel() {
        this.a.close();
    }

    @Override // java.nio.channels.FileChannel
    public final FileLock lock(long j, long j2, boolean z) {
        FileLock lock = this.a.lock(j, j2, z);
        if (lock == null) {
            return null;
        }
        return new b(lock, this);
    }

    @Override // java.nio.channels.FileChannel
    public final MappedByteBuffer map(FileChannel.MapMode mapMode, long j, long j2) {
        return this.a.map(mapMode, j, j2);
    }

    @Override // java.nio.channels.FileChannel
    public final FileChannel position(long j) {
        FileChannel position = this.a.position(j);
        return position instanceof a ? (a) position : new a(position);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return this.a.read(byteBuffer);
    }

    @Override // java.nio.channels.FileChannel
    public final long size() {
        return this.a.size();
    }

    @Override // java.nio.channels.FileChannel
    public final long transferFrom(ReadableByteChannel readableByteChannel, long j, long j2) {
        return this.a.transferFrom(readableByteChannel, j, j2);
    }

    @Override // java.nio.channels.FileChannel
    public final long transferTo(long j, long j2, WritableByteChannel writableByteChannel) {
        return this.a.transferTo(j, j2, writableByteChannel);
    }

    @Override // java.nio.channels.FileChannel
    public final FileChannel truncate(long j) {
        FileChannel truncate = this.a.truncate(j);
        return truncate instanceof a ? (a) truncate : new a(truncate);
    }

    @Override // java.nio.channels.FileChannel
    public final FileLock tryLock(long j, long j2, boolean z) {
        FileLock tryLock = this.a.tryLock(j, j2, z);
        if (tryLock == null) {
            return null;
        }
        return new b(tryLock, this);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        return this.a.write(byteBuffer);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.ScatteringByteChannel
    public final long read(ByteBuffer[] byteBufferArr, int i, int i2) {
        return this.a.read(byteBufferArr, i, i2);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.GatheringByteChannel
    public final long write(ByteBuffer[] byteBufferArr, int i, int i2) {
        return this.a.write(byteBufferArr, i, i2);
    }

    @Override // java.nio.channels.FileChannel
    public final int read(ByteBuffer byteBuffer, long j) {
        return this.a.read(byteBuffer, j);
    }

    @Override // java.nio.channels.FileChannel
    public final int write(ByteBuffer byteBuffer, long j) {
        return this.a.write(byteBuffer, j);
    }

    @Override // java.nio.channels.FileChannel
    public final long position() {
        return this.a.position();
    }
}
