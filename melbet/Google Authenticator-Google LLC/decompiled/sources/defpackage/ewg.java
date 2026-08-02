package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewg {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public final hac c;
    public final hac d;
    public final hac e = hoq.v(new ewf(this, 0));
    public final hac f;
    public volatile eud g;
    public final hac h;
    public volatile euf i;
    private final Context j;
    private final hac k;

    public ewg(Context context, hac hacVar, hac hacVar2) {
        this.j = context;
        this.d = hacVar;
        this.c = hacVar2;
        this.f = g(context, "storage-info.pb");
        this.h = g(djl.a(context), "device-encrypted-storage-info.pb");
        this.k = hoq.v(new ewf(hacVar, 2));
    }

    public static void e(String str, jll jllVar, String str2) {
        File file = new File(str);
        hqc.a(file);
        File createTempFile = File.createTempFile(str2, ".pb", file.getParentFile());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            try {
                jllVar.e(fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                if (createTempFile.renameTo(file)) {
                    return;
                }
                throw new IOException(String.valueOf(createTempFile) + " could not be renamed to " + file.toString());
            } finally {
            }
        } catch (IOException e) {
            createTempFile.delete();
            throw e;
        }
    }

    private static hac g(Context context, String str) {
        return hoq.v(new dxi(context, str, 16));
    }

    public final eud a() {
        eud eudVar;
        eud eudVar2;
        eud eudVar3 = this.g;
        if (eudVar3 != null) {
            return eudVar3;
        }
        synchronized (a) {
            eudVar = this.g;
            if (eudVar == null) {
                if (djl.i(this.j)) {
                    StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        try {
                            FileInputStream fileInputStream = new FileInputStream((String) this.f.bB());
                            try {
                                eudVar2 = (eud) jkp.t(eud.b, fileInputStream, jkd.a);
                                fileInputStream.close();
                            } catch (Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IOException | IllegalStateException unused) {
                            eudVar2 = eud.b;
                        }
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        eudVar = eudVar2;
                        this.g = eudVar;
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        throw th3;
                    }
                } else {
                    eudVar = eud.b;
                }
            }
        }
        return eudVar;
    }

    public final euf b() {
        euf eufVar;
        euf eufVar2;
        FileInputStream fileInputStream;
        euf eufVar3 = this.i;
        if (eufVar3 != null) {
            return eufVar3;
        }
        synchronized (b) {
            eufVar = this.i;
            if (eufVar == null) {
                StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                try {
                    try {
                        fileInputStream = new FileInputStream((String) this.h.bB());
                    } catch (IOException | IllegalStateException unused) {
                        eufVar2 = euf.b;
                    }
                    try {
                        eufVar2 = (euf) jkp.t(euf.b, fileInputStream, jkd.a);
                        fileInputStream.close();
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        eufVar = eufVar2;
                        this.i = eufVar;
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th3;
                }
            }
        }
        return eufVar;
    }

    public final evx c(boolean z) {
        boolean z2;
        hel o;
        jjq jjqVar;
        String str;
        hel o2;
        hel o3;
        int i;
        boolean z3;
        boolean z4;
        euc eucVar;
        String str2 = "";
        if (z) {
            euf b2 = b();
            z2 = b2.e;
            o = hel.o(new jkv(b2.i, euf.a));
            jjqVar = b2.d;
            str = b2.f;
            o2 = hel.o(b2.g);
            o3 = hel.o(b2.h);
            if ((b2.c & 8) != 0) {
                eug eugVar = b2.j;
                if (eugVar == null) {
                    eugVar = eug.a;
                }
                if (eugVar.c == Build.VERSION.SDK_INT) {
                    eug eugVar2 = b2.j;
                    if (eugVar2 == null) {
                        eugVar2 = eug.a;
                    }
                    str2 = eugVar2.b;
                }
            }
            i = b2.c & 1;
            z3 = b2.l;
            z4 = b2.k;
            eucVar = b2.m;
            if (eucVar == null) {
                eucVar = euc.a;
            }
        } else {
            eud a2 = a();
            z2 = a2.e;
            o = hel.o(new jkv(a2.j, eud.a));
            jjqVar = a2.d;
            str = a2.f;
            o2 = hel.o(a2.h);
            o3 = hel.o(a2.i);
            if ((a2.c & 16) != 0) {
                eug eugVar3 = a2.k;
                if (eugVar3 == null) {
                    eugVar3 = eug.a;
                }
                if (eugVar3.c == Build.VERSION.SDK_INT) {
                    eug eugVar4 = a2.k;
                    if (eugVar4 == null) {
                        eugVar4 = eug.a;
                    }
                    str2 = eugVar4.b;
                }
            }
            i = a2.c & 1;
            z3 = a2.m;
            z4 = a2.l;
            eucVar = a2.n;
            if (eucVar == null) {
                eucVar = euc.a;
            }
        }
        return new evx(z2, o, jjqVar, str, str2, o2, o3, 1 == i, z3, z4, eucVar);
    }

    public final hvi d(boolean z) {
        hvm hvmVar = (hvm) this.d.bB();
        hvmVar.getClass();
        return hti.g(hvc.v(z ? hnu.aK((hvi) this.k.bB()) : hve.a), new doj(this, 6), hvmVar);
    }

    public final void f() {
        if (!djl.h(this.j)) {
            long j = a().g;
            TimeUnit timeUnit = TimeUnit.HOURS;
            if (j + 86400000 < System.currentTimeMillis()) {
                d(true);
                return;
            }
        }
        hvi hviVar = hve.a;
    }
}
