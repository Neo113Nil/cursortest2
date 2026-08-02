package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bgm implements bbu {
    private final Object a;
    private final /* synthetic */ int b;

    public bgm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.bbu
    public final Class a() {
        return this.b != 0 ? ByteBuffer.class : this.a.getClass();
    }

    @Override // defpackage.bbu
    public final void f(azw azwVar, bbt bbtVar) {
        Throwable th;
        RandomAccessFile randomAccessFile;
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        int i = this.b;
        Object obj = this.a;
        if (i == 0) {
            bbtVar.b(obj);
            return;
        }
        try {
            int i2 = blv.a;
            FileChannel fileChannel = null;
            try {
                long length = ((File) obj).length();
                if (length > 2147483647L) {
                    throw new IOException("File too large to map into memory");
                }
                if (length == 0) {
                    throw new IOException("File unsuitable for memory mapping");
                }
                randomAccessFile = new RandomAccessFile((File) obj, "r");
                try {
                    convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
                    try {
                        MappedByteBuffer load = convertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                        if (convertMaybeLegacyFileChannelFromLibrary != null) {
                            try {
                                convertMaybeLegacyFileChannelFromLibrary.close();
                            } catch (IOException unused) {
                            }
                        }
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused2) {
                        }
                        bbtVar.b(load);
                    } catch (Throwable th2) {
                        th = th2;
                        fileChannel = convertMaybeLegacyFileChannelFromLibrary;
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
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                randomAccessFile = null;
            }
        } catch (IOException e) {
            bbtVar.e(e);
        }
    }

    @Override // defpackage.bbu
    public final int g() {
        return 1;
    }

    @Override // defpackage.bbu
    public final void bo() {
    }

    @Override // defpackage.bbu
    public final void d() {
    }
}
