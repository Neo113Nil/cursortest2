package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class blv {
    public static final /* synthetic */ int a = 0;
    private static final AtomicReference b = new AtomicReference();

    public static ByteBuffer a(InputStream inputStream, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] bArr = (byte[]) b.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[16384];
        }
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                b.set(bArr);
                throw th;
            }
        }
        b.set(bArr);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return z ? ByteBuffer.wrap(byteArray) : b(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
    }

    public static ByteBuffer b(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    public static void c(ByteBuffer byteBuffer, File file) {
        RandomAccessFile randomAccessFile;
        b(byteBuffer);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileChannel = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
                fileChannel.write(byteBuffer);
                fileChannel.force(false);
                fileChannel.close();
                randomAccessFile.close();
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused) {
                    }
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    public static byte[] d(ByteBuffer byteBuffer) {
        blu bluVar = null;
        if (!byteBuffer.isReadOnly() && byteBuffer.hasArray()) {
            bluVar = new blu(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        }
        if (bluVar != null && bluVar.a == 0 && bluVar.b == bluVar.c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        b(asReadOnlyBuffer);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }
}
