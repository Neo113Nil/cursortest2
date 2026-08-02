package defpackage;

import android.os.StrictMode;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eqp {
    private static volatile gzp a;
    private static volatile gzp b;

    public static gzp a() {
        gzp gzpVar;
        gzp gzpVar2;
        gzp h;
        FileInputStream fileInputStream;
        gzp gzpVar3 = a;
        if (gzpVar3 != null) {
            return gzpVar3;
        }
        long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
        long j = 0;
        gzp h2 = sysconf > 0 ? gzp.h(Long.valueOf(sysconf)) : gyf.a;
        if (h2.f()) {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            byte[] bArr = new byte[440];
            boolean z = false;
            try {
                try {
                    fileInputStream = new FileInputStream(new File("/proc/self/stat"));
                } catch (IOException unused) {
                    gyf gyfVar = gyf.a;
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    gzpVar = gyfVar;
                }
                try {
                    int read = fileInputStream.read(bArr);
                    fileInputStream.close();
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    gzpVar = gzp.h(ByteBuffer.wrap(bArr, 0, read));
                    if (gzpVar.f()) {
                        Object b2 = gzpVar.b();
                        long longValue = ((Long) h2.b()).longValue();
                        while (true) {
                            ByteBuffer byteBuffer = (ByteBuffer) b2;
                            if (byteBuffer.remaining() <= 17) {
                                break;
                            }
                            if (byteBuffer.get() == 40) {
                                int i = 16;
                                while (true) {
                                    if (i < 0) {
                                        break;
                                    }
                                    if (byteBuffer.get(byteBuffer.position() + i) == 41) {
                                        byteBuffer.position(byteBuffer.position() + i + 1);
                                        if (byteBuffer.get() == 32 && b(byteBuffer, 1) && b(byteBuffer, 18)) {
                                            while (true) {
                                                if (!byteBuffer.hasRemaining()) {
                                                    break;
                                                }
                                                byte b3 = byteBuffer.get();
                                                if (b3 != 32) {
                                                    if (b3 < 48 || b3 > 57 || j > 922337203685477580L) {
                                                        break;
                                                    }
                                                    j = (j * 10) + (b3 - 48);
                                                    z = true;
                                                } else if (z) {
                                                    gzpVar2 = gzp.h(Long.valueOf(j));
                                                }
                                            }
                                            gzpVar2 = gyf.a;
                                        }
                                    } else {
                                        i--;
                                    }
                                }
                            }
                        }
                        gzpVar2 = gyf.a;
                        h = !gzpVar2.f() ? gyf.a : gzp.h(Long.valueOf(TimeUnit.SECONDS.toMillis(((Long) gzpVar2.b()).longValue()) / longValue));
                    } else {
                        h = gyf.a;
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th3;
            }
        } else {
            h = gyf.a;
        }
        a = h;
        return h;
    }

    private static boolean b(ByteBuffer byteBuffer, int i) {
        while (byteBuffer.hasRemaining()) {
            if (i <= 0) {
                return true;
            }
            if (byteBuffer.get() == 32) {
                i--;
            }
        }
        return i == 0;
    }
}
