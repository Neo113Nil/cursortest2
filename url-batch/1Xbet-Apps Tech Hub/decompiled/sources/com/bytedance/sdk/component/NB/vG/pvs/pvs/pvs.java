package com.bytedance.sdk.component.NB.vG.pvs.pvs;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* compiled from: DiskLruCache.java */
/* loaded from: classes.dex */
public final class pvs implements Closeable {
    static final Pattern pvs = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final OutputStream vG = new OutputStream() { // from class: com.bytedance.sdk.component.NB.vG.pvs.pvs.pvs.2
        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }
    };
    private int IP;
    private final File Jd;
    private long Mxy;
    private final File NB;
    private final int Wyp;
    final ExecutorService icD;
    private Writer kj;
    private final File sUS;
    private final int so;
    private final File yiw;
    private long qh = 0;
    private final LinkedHashMap<String, icD> Ju = new LinkedHashMap<>(0, 0.75f, true);
    private long bNS = -1;
    private long mnm = 0;
    private final Callable<Void> vA = new Callable<Void>() { // from class: com.bytedance.sdk.component.NB.vG.pvs.pvs.pvs.1
        @Override // java.util.concurrent.Callable
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (pvs.this) {
                if (pvs.this.kj == null) {
                    return null;
                }
                pvs.this.so();
                if (pvs.this.sUS()) {
                    pvs.this.NB();
                    pvs.this.IP = 0;
                }
                return null;
            }
        }
    };

    private pvs(File file, int i, int i2, long j, ExecutorService executorService) {
        this.Jd = file;
        this.so = i;
        this.NB = new File(file, "journal");
        this.sUS = new File(file, "journal.tmp");
        this.yiw = new File(file, "journal.bkp");
        this.Wyp = i2;
        this.Mxy = j;
        this.icD = executorService;
    }

    public static pvs pvs(File file, int i, int i2, long j, ExecutorService executorService) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                pvs(file2, file3, false);
            }
        }
        pvs pvsVar = new pvs(file, i, i2, j, executorService);
        if (pvsVar.NB.exists()) {
            try {
                pvsVar.vG();
                pvsVar.Jd();
                return pvsVar;
            } catch (IOException e) {
                Log.w("DiskLruCache ", file + " is corrupt: " + e.getMessage() + ", removing");
                pvsVar.icD();
            }
        }
        file.mkdirs();
        pvs pvsVar2 = new pvs(file, i, i2, j, executorService);
        pvsVar2.NB();
        return pvsVar2;
    }

    private void vG() throws IOException {
        com.bytedance.sdk.component.NB.vG.pvs.pvs.vG vGVar = new com.bytedance.sdk.component.NB.vG.pvs.pvs.vG(new FileInputStream(this.NB), Jd.pvs);
        try {
            String pvs2 = vGVar.pvs();
            String pvs3 = vGVar.pvs();
            String pvs4 = vGVar.pvs();
            String pvs5 = vGVar.pvs();
            String pvs6 = vGVar.pvs();
            if (!"libcore.io.DiskLruCache".equals(pvs2) || !"1".equals(pvs3) || !Integer.toString(this.so).equals(pvs4) || !Integer.toString(this.Wyp).equals(pvs5) || !"".equals(pvs6)) {
                throw new IOException("unexpected journal header: [" + pvs2 + ", " + pvs3 + ", " + pvs5 + ", " + pvs6 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    Jd(vGVar.pvs());
                    i++;
                } catch (EOFException unused) {
                    this.IP = i - this.Ju.size();
                    if (vGVar.icD()) {
                        NB();
                    } else {
                        this.kj = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.NB, true), Jd.pvs));
                    }
                    com.bytedance.sdk.component.NB.vG.vG.icD.pvs(vGVar);
                    return;
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.NB.vG.vG.icD.pvs(vGVar);
            throw th;
        }
    }

    private void Jd(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(String.valueOf(str)));
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.Ju.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        icD icd = this.Ju.get(substring);
        if (icd == null) {
            icd = new icD(substring);
            this.Ju.put(substring, icd);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            icd.Jd = true;
            icd.NB = null;
            icd.pvs(split);
            return;
        }
        if (indexOf2 != -1 || indexOf != 5 || !str.startsWith("DIRTY")) {
            if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: ".concat(String.valueOf(str)));
            }
            return;
        }
        icd.NB = new C0038pvs(icd);
    }

    private void Jd() throws IOException {
        pvs(this.sUS);
        Iterator<icD> it = this.Ju.values().iterator();
        while (it.hasNext()) {
            icD next = it.next();
            int i = 0;
            if (next.NB == null) {
                while (i < this.Wyp) {
                    this.qh += next.vG[i];
                    i++;
                }
            } else {
                next.NB = null;
                while (i < this.Wyp) {
                    pvs(next.pvs(i));
                    pvs(next.icD(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void NB() throws IOException {
        Writer writer = this.kj;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.sUS), Jd.pvs));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.so));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.Wyp));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (icD icd : this.Ju.values()) {
                if (icd.NB != null) {
                    bufferedWriter.write("DIRTY " + icd.icD + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + icd.icD + icd.pvs() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.NB.exists()) {
                pvs(this.NB, this.yiw, true);
            }
            pvs(this.sUS, this.NB, false);
            this.yiw.delete();
            this.kj = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.NB, true), Jd.pvs));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    private static void pvs(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void pvs(File file, File file2, boolean z) throws IOException {
        if (z) {
            pvs(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public synchronized vG pvs(String str) throws IOException {
        InputStream inputStream;
        yiw();
        NB(str);
        icD icd = this.Ju.get(str);
        if (icd == null) {
            return null;
        }
        if (!icd.Jd) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.Wyp];
        for (int i = 0; i < this.Wyp; i++) {
            try {
                inputStreamArr[i] = new FileInputStream(icd.pvs(i));
            } catch (FileNotFoundException unused) {
                for (int i2 = 0; i2 < this.Wyp && (inputStream = inputStreamArr[i2]) != null; i2++) {
                    com.bytedance.sdk.component.NB.vG.vG.icD.pvs(inputStream);
                }
                return null;
            }
        }
        this.IP++;
        this.kj.append((CharSequence) ("READ " + str + '\n'));
        if (sUS()) {
            this.icD.submit(this.vA);
        }
        return new vG(str, icd.sUS, inputStreamArr, icd.vG);
    }

    public C0038pvs icD(String str) throws IOException {
        return pvs(str, -1L);
    }

    private synchronized C0038pvs pvs(String str, long j) throws IOException {
        yiw();
        NB(str);
        icD icd = this.Ju.get(str);
        if (j != -1 && (icd == null || icd.sUS != j)) {
            return null;
        }
        if (icd == null) {
            icd = new icD(str);
            this.Ju.put(str, icd);
        } else if (icd.NB != null) {
            return null;
        }
        C0038pvs c0038pvs = new C0038pvs(icd);
        icd.NB = c0038pvs;
        this.kj.write("DIRTY " + str + '\n');
        this.kj.flush();
        return c0038pvs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void pvs(C0038pvs c0038pvs, boolean z) throws IOException {
        icD icd = c0038pvs.icD;
        if (icd.NB != c0038pvs) {
            throw new IllegalStateException();
        }
        if (z && !icd.Jd) {
            for (int i = 0; i < this.Wyp; i++) {
                if (!c0038pvs.vG[i]) {
                    c0038pvs.icD();
                    throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i)));
                }
                if (!icd.icD(i).exists()) {
                    c0038pvs.icD();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.Wyp; i2++) {
            File icD2 = icd.icD(i2);
            if (z) {
                if (icD2.exists()) {
                    File pvs2 = icd.pvs(i2);
                    icD2.renameTo(pvs2);
                    long j = icd.vG[i2];
                    long length = pvs2.length();
                    icd.vG[i2] = length;
                    this.qh = (this.qh - j) + length;
                }
            } else {
                pvs(icD2);
            }
        }
        this.IP++;
        icd.NB = null;
        if (icd.Jd | z) {
            icd.Jd = true;
            this.kj.write("CLEAN " + icd.icD + icd.pvs() + '\n');
            if (z) {
                long j2 = this.mnm;
                this.mnm = 1 + j2;
                icd.sUS = j2;
            }
        } else {
            this.Ju.remove(icd.icD);
            this.kj.write("REMOVE " + icd.icD + '\n');
        }
        this.kj.flush();
        if (this.qh > this.Mxy || sUS()) {
            this.icD.submit(this.vA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean sUS() {
        int i = this.IP;
        return i >= 2000 && i >= this.Ju.size();
    }

    public synchronized boolean vG(String str) throws IOException {
        yiw();
        NB(str);
        icD icd = this.Ju.get(str);
        if (icd != null && icd.NB == null) {
            for (int i = 0; i < this.Wyp; i++) {
                File pvs2 = icd.pvs(i);
                if (pvs2.exists() && !pvs2.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(pvs2)));
                }
                this.qh -= icd.vG[i];
                icd.vG[i] = 0;
            }
            this.IP++;
            this.kj.append((CharSequence) ("REMOVE " + str + '\n'));
            this.Ju.remove(str);
            if (sUS()) {
                this.icD.submit(this.vA);
            }
            return true;
        }
        return false;
    }

    private void yiw() {
        if (this.kj == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized void pvs() throws IOException {
        yiw();
        so();
        this.kj.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.kj == null) {
            return;
        }
        Iterator it = new ArrayList(this.Ju.values()).iterator();
        while (it.hasNext()) {
            icD icd = (icD) it.next();
            if (icd.NB != null) {
                icd.NB.icD();
            }
        }
        so();
        this.kj.close();
        this.kj = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void so() throws IOException {
        long j = this.Mxy;
        long j2 = this.bNS;
        if (j2 >= 0) {
            j = j2;
        }
        while (this.qh > j) {
            vG(this.Ju.entrySet().iterator().next().getKey());
        }
        this.bNS = -1L;
    }

    public void icD() throws IOException {
        close();
        Jd.pvs(this.Jd);
    }

    private void NB(String str) {
        if (!pvs.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class vG implements Closeable {
        private final InputStream[] Jd;
        private final long[] NB;
        private final String icD;
        private final long vG;

        private vG(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.icD = str;
            this.vG = j;
            this.Jd = inputStreamArr;
            this.NB = jArr;
        }

        public InputStream pvs(int i) {
            return this.Jd[i];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.Jd) {
                com.bytedance.sdk.component.NB.vG.vG.icD.pvs(inputStream);
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: com.bytedance.sdk.component.NB.vG.pvs.pvs.pvs$pvs, reason: collision with other inner class name */
    public final class C0038pvs {
        private boolean Jd;
        private boolean NB;
        private final icD icD;
        private final boolean[] vG;

        private C0038pvs(icD icd) {
            this.icD = icd;
            this.vG = icd.Jd ? null : new boolean[pvs.this.Wyp];
        }

        public OutputStream pvs(int i) throws IOException {
            FileOutputStream fileOutputStream;
            C0039pvs c0039pvs;
            if (i < 0 || i >= pvs.this.Wyp) {
                throw new IllegalArgumentException("Expected index " + i + " to be greater than 0 and less than the maximum value count of " + pvs.this.Wyp);
            }
            synchronized (pvs.this) {
                if (this.icD.NB != this) {
                    throw new IllegalStateException();
                }
                if (!this.icD.Jd) {
                    this.vG[i] = true;
                }
                File icD = this.icD.icD(i);
                try {
                    fileOutputStream = new FileOutputStream(icD);
                } catch (FileNotFoundException unused) {
                    pvs.this.Jd.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(icD);
                    } catch (FileNotFoundException unused2) {
                        return pvs.vG;
                    }
                }
                c0039pvs = new C0039pvs(fileOutputStream);
            }
            return c0039pvs;
        }

        public void pvs() throws IOException {
            if (this.Jd) {
                pvs.this.pvs(this, false);
                pvs.this.vG(this.icD.icD);
            } else {
                pvs.this.pvs(this, true);
            }
            this.NB = true;
        }

        public void icD() throws IOException {
            pvs.this.pvs(this, false);
        }

        /* compiled from: DiskLruCache.java */
        /* renamed from: com.bytedance.sdk.component.NB.vG.pvs.pvs.pvs$pvs$pvs, reason: collision with other inner class name */
        private class C0039pvs extends FilterOutputStream {
            private C0039pvs(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C0038pvs.this.Jd = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C0038pvs.this.Jd = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C0038pvs.this.Jd = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C0038pvs.this.Jd = true;
                }
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    private final class icD {
        private boolean Jd;
        private C0038pvs NB;
        private final String icD;
        private long sUS;
        private final long[] vG;

        private icD(String str) {
            this.icD = str;
            this.vG = new long[pvs.this.Wyp];
        }

        public String pvs() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.vG) {
                sb.append(' ').append(j);
            }
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pvs(String[] strArr) throws IOException {
            if (strArr.length != pvs.this.Wyp) {
                throw icD(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.vG[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw icD(strArr);
                }
            }
        }

        private IOException icD(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File pvs(int i) {
            return new File(pvs.this.Jd, this.icD + "." + i);
        }

        public File icD(int i) {
            return new File(pvs.this.Jd, this.icD + "." + i + ".tmp");
        }
    }
}
