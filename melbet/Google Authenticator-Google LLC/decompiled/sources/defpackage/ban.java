package defpackage;

import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ban implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public Writer g;
    public int i;
    private final File k;
    public long f = 0;
    public final LinkedHashMap h = new LinkedHashMap(0, 0.75f, true);
    private long n = 0;
    final ThreadPoolExecutor j = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new bak());
    private final Callable o = new baj(this);
    private final int l = 1;
    public final int d = 1;
    private final long m = 262144000;
    public final boolean e = true;

    public ban(File file) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.k = new File(file, "journal.bkp");
    }

    public static void c(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void f(File file, File file2, boolean z) {
        if (z) {
            c(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private final void l() {
        if (this.g == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void m(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void n(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final synchronized void a(bal balVar, boolean z) {
        bam bamVar = balVar.a;
        if (bamVar.f != balVar) {
            throw new IllegalStateException();
        }
        if (z && !bamVar.e) {
            for (int i = 0; i < this.d; i = 1) {
                if (!balVar.b[0]) {
                    balVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index 0");
                }
                if (!bamVar.d().exists()) {
                    balVar.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.d; i2 = 1) {
            File d = bamVar.d();
            if (!z) {
                c(d);
            } else if (d.exists()) {
                File c = bamVar.c();
                d.renameTo(c);
                long[] jArr = bamVar.b;
                long j = jArr[0];
                long length = c.length();
                jArr[0] = length;
                this.f = (this.f - j) + length;
            }
        }
        this.i++;
        bamVar.f = null;
        if (bamVar.e || z) {
            bamVar.e = true;
            this.g.append((CharSequence) "CLEAN");
            this.g.append(' ');
            this.g.append((CharSequence) bamVar.a);
            this.g.append((CharSequence) bamVar.a());
            this.g.append('\n');
            if (z) {
                this.n++;
            }
        } else {
            LinkedHashMap linkedHashMap = this.h;
            String str = bamVar.a;
            linkedHashMap.remove(str);
            this.g.append((CharSequence) "REMOVE");
            this.g.append(' ');
            this.g.append((CharSequence) str);
            this.g.append('\n');
        }
        n(this.g);
        if (this.f > this.m || h()) {
            this.j.submit(this.o);
        }
    }

    public final void b() {
        close();
        baq.b(this.a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.g == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.h.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bal balVar = ((bam) arrayList.get(i)).f;
            if (balVar != null) {
                balVar.a();
            }
        }
        g();
        m(this.g);
        this.g = null;
    }

    public final void d() {
        String a;
        String substring;
        bap bapVar = new bap(new FileInputStream(this.b), baq.a);
        try {
            String a2 = bapVar.a();
            String a3 = bapVar.a();
            String a4 = bapVar.a();
            String a5 = bapVar.a();
            String a6 = bapVar.a();
            if (!"libcore.io.DiskLruCache".equals(a2) || !"1".equals(a3) || !Integer.toString(this.l).equals(a4) || !Integer.toString(this.d).equals(a5) || !"".equals(a6)) {
                throw new IOException("unexpected journal header: [" + a2 + ", " + a3 + ", " + a5 + ", " + a6 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    a = bapVar.a();
                    int indexOf = a.indexOf(32);
                    if (indexOf == -1) {
                        throw new IOException("unexpected journal line: ".concat(String.valueOf(a)));
                    }
                    int i2 = indexOf + 1;
                    int indexOf2 = a.indexOf(32, i2);
                    if (indexOf2 == -1) {
                        substring = a.substring(i2);
                        if (indexOf == 6) {
                            if (a.startsWith("REMOVE")) {
                                this.h.remove(substring);
                                i++;
                            } else {
                                indexOf = 6;
                            }
                        }
                    } else {
                        substring = a.substring(i2, indexOf2);
                    }
                    LinkedHashMap linkedHashMap = this.h;
                    bam bamVar = (bam) linkedHashMap.get(substring);
                    if (bamVar == null) {
                        bamVar = new bam(this, substring);
                        linkedHashMap.put(substring, bamVar);
                    }
                    if (indexOf2 != -1 && indexOf == 5) {
                        if (a.startsWith("CLEAN")) {
                            String[] split = a.substring(indexOf2 + 1).split(" ");
                            bamVar.e = true;
                            bamVar.f = null;
                            if (split.length != bamVar.g.d) {
                                throw bam.e(split);
                            }
                            for (int i3 = 0; i3 < split.length; i3++) {
                                try {
                                    bamVar.b[i3] = Long.parseLong(split[i3]);
                                } catch (NumberFormatException unused) {
                                    throw bam.e(split);
                                }
                            }
                            i++;
                        } else {
                            indexOf = 5;
                        }
                    }
                    if (indexOf2 != -1 || indexOf != 5 || !a.startsWith("DIRTY")) {
                        if (indexOf2 != -1 || indexOf != 4 || !a.startsWith("READ")) {
                            break;
                        }
                    } else {
                        bamVar.f = new bal(this, bamVar);
                    }
                    i++;
                } catch (EOFException unused2) {
                    this.i = i - this.h.size();
                    if (bapVar.b == -1) {
                        e();
                    } else {
                        this.g = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), baq.a));
                    }
                    baq.a(bapVar);
                    return;
                }
            }
            throw new IOException("unexpected journal line: ".concat(String.valueOf(a)));
        } catch (Throwable th) {
            baq.a(bapVar);
            throw th;
        }
    }

    public final synchronized void e() {
        Writer writer = this.g;
        if (writer != null) {
            m(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), baq.a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.l));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.d));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (bam bamVar : this.h.values()) {
                if (bamVar.f != null) {
                    bufferedWriter.write(a.Z(bamVar.a, "DIRTY ", "\n"));
                } else {
                    bufferedWriter.write("CLEAN " + bamVar.a + bamVar.a() + "\n");
                }
            }
            m(bufferedWriter);
            File file = this.b;
            if (file.exists()) {
                f(file, this.k, true);
            }
            f(this.c, file, false);
            this.k.delete();
            this.g = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), baq.a));
        } catch (Throwable th) {
            m(bufferedWriter);
            throw th;
        }
    }

    public final void g() {
        while (this.f > this.m) {
            j((String) ((Map.Entry) this.h.entrySet().iterator().next()).getKey());
        }
    }

    public final boolean h() {
        int i = this.i;
        return i >= 2000 && i >= this.h.size();
    }

    public final synchronized bal i(String str) {
        l();
        LinkedHashMap linkedHashMap = this.h;
        bam bamVar = (bam) linkedHashMap.get(str);
        if (bamVar == null) {
            bamVar = new bam(this, str);
            linkedHashMap.put(str, bamVar);
        } else if (bamVar.f != null) {
            return null;
        }
        bal balVar = new bal(this, bamVar);
        bamVar.f = balVar;
        this.g.append((CharSequence) "DIRTY");
        this.g.append(' ');
        this.g.append((CharSequence) str);
        this.g.append('\n');
        n(this.g);
        return balVar;
    }

    public final synchronized void j(String str) {
        l();
        LinkedHashMap linkedHashMap = this.h;
        bam bamVar = (bam) linkedHashMap.get(str);
        if (bamVar != null && bamVar.f == null) {
            for (int i = 0; i < this.d; i = 1) {
                File c = bamVar.c();
                if (c.exists() && !c.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(String.valueOf(c))));
                }
                long j = this.f;
                long[] jArr = bamVar.b;
                this.f = j - jArr[0];
                jArr[0] = 0;
            }
            this.i++;
            this.g.append((CharSequence) "REMOVE");
            this.g.append(' ');
            this.g.append((CharSequence) str);
            this.g.append('\n');
            linkedHashMap.remove(str);
            if (h()) {
                this.j.submit(this.o);
            }
        }
    }

    public final synchronized bdi k(String str) {
        l();
        bam bamVar = (bam) this.h.get(str);
        if (bamVar != null && bamVar.e) {
            for (int i = 0; i < this.d; i = 1) {
                if (bamVar.c().exists()) {
                }
            }
            this.i++;
            this.g.append((CharSequence) "READ");
            this.g.append(' ');
            this.g.append((CharSequence) str);
            this.g.append('\n');
            if (h()) {
                this.j.submit(this.o);
            }
            return new bdi(this, str, bamVar.c);
        }
        return null;
    }
}
