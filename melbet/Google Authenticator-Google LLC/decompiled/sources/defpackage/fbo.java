package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import j$.nio.channels.DesugarChannels;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fbo implements far {
    public boolean a;
    private final boolean b;
    private final boolean c;

    public fbo(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16, types: [fbs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [fbs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r1v13, types: [fbs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [fbs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [fbs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [fbs, java.lang.Object] */
    @Override // defpackage.far
    public final /* synthetic */ Object a(fym fymVar) {
        fba fbaVar;
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        gzp a;
        ?? r12;
        FileLock tryLock;
        Uri build = ((Uri) fymVar.e).buildUpon().path(String.valueOf(((Uri) fymVar.a).getPath()).concat(".lock")).fragment("").build();
        Closeable closeable = null;
        if (this.a) {
            Semaphore b = fymVar.c.a().b(build.toString());
            if (true != b.tryAcquire()) {
                b = null;
            }
            fbb fbbVar = new fbb(b);
            try {
                if (fbbVar.a != null) {
                    fbaVar = new fba(fbbVar.a(), 0);
                    fbbVar.close();
                } else {
                    fbbVar.close();
                    fbaVar = null;
                }
            } finally {
            }
        } else {
            Semaphore b2 = fymVar.c.a().b(build.toString());
            try {
                b2.acquire();
                fbb fbbVar2 = new fbb(b2);
                try {
                    fbaVar = new fba(fbbVar2.a(), 0);
                    fbbVar2.close();
                } finally {
                }
            } catch (InterruptedException e) {
                throw new InterruptedIOException("semaphore not acquired: ".concat(e.toString()));
            }
        }
        fbe fbeVar = new fbe(fbaVar);
        try {
            if (fbeVar.a != null) {
                boolean z = this.b;
                fbe fbeVar2 = new fbe((z && this.c) ? fymVar.c.c(build) : (!z || this.c) ? fymVar.c.d(build) : (Closeable) ((iyi) fymVar.d).r(build, new fbq(1)));
                try {
                    Closeable closeable2 = fbeVar2.a;
                    if (closeable2 instanceof fax) {
                        convertMaybeLegacyFileChannelFromLibrary = ((fax) closeable2).a();
                    } else {
                        if (!(closeable2 instanceof RandomAccessFile)) {
                            throw new IOException("Lock stream not convertible to FileChannel");
                        }
                        convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((RandomAccessFile) closeable2).getChannel());
                    }
                    FileChannel fileChannel = convertMaybeLegacyFileChannelFromLibrary;
                    if (this.a) {
                        fymVar.c.a();
                        try {
                            tryLock = fileChannel.tryLock(0L, Long.MAX_VALUE, z);
                        } catch (IOException unused) {
                        }
                        r12 = tryLock == null ? 0 : new fba(tryLock, 1);
                    } else {
                        fymVar.c.a();
                        gzp a2 = fbc.a(fileChannel, z);
                        if (a2.f()) {
                            r12 = a2.b();
                        } else {
                            fbc.a.longValue();
                            fbc.b.longValue();
                            fbj fbjVar = new fbj();
                            do {
                                SystemClock.sleep(fbjVar.next().longValue());
                                a = fbc.a(fileChannel, z);
                            } while (!a.f());
                            r12 = a.b();
                        }
                    }
                    fbe fbeVar3 = new fbe(r12);
                    try {
                        if (fbeVar3.a != null) {
                            final Closeable a3 = fbeVar.a();
                            final Closeable a4 = fbeVar2.a();
                            final Closeable a5 = fbeVar3.a();
                            closeable = new Closeable() { // from class: fbn
                                @Override // java.io.Closeable, java.lang.AutoCloseable
                                public final void close() {
                                    Closeable closeable3 = a3;
                                    Closeable closeable4 = a4;
                                    Closeable closeable5 = a5;
                                    if (closeable5 != null) {
                                        try {
                                            try {
                                                closeable5.close();
                                            } catch (Throwable th) {
                                                if (closeable4 != null) {
                                                    try {
                                                        closeable4.close();
                                                    } catch (Throwable th2) {
                                                        th.addSuppressed(th2);
                                                    }
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            if (closeable3 != null) {
                                                try {
                                                    closeable3.close();
                                                } catch (Throwable th4) {
                                                    th3.addSuppressed(th4);
                                                }
                                            }
                                            throw th3;
                                        }
                                    }
                                    if (closeable4 != null) {
                                        closeable4.close();
                                    }
                                    if (closeable3 != null) {
                                        closeable3.close();
                                    }
                                }
                            };
                        }
                        fbeVar3.close();
                        fbeVar2.close();
                    } finally {
                    }
                } finally {
                }
            }
            fbeVar.close();
            return closeable;
        } finally {
        }
    }
}
