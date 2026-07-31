package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.InterfaceC1861cm;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f10 implements InterfaceC1861cm {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f25542a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private long f25543b = 0;

    /* renamed from: c, reason: collision with root package name */
    private final d f25544c;

    /* renamed from: d, reason: collision with root package name */
    private final int f25545d;

    final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f25546a;

        a(File file) {
            this.f25546a = file;
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        long f25547a;

        /* renamed from: b, reason: collision with root package name */
        final String f25548b;

        /* renamed from: c, reason: collision with root package name */
        final String f25549c;

        /* renamed from: d, reason: collision with root package name */
        final long f25550d;

        /* renamed from: e, reason: collision with root package name */
        final long f25551e;

        /* renamed from: f, reason: collision with root package name */
        final long f25552f;

        /* renamed from: g, reason: collision with root package name */
        final long f25553g;

        /* renamed from: h, reason: collision with root package name */
        final List<ze0> f25554h;

        /* JADX INFO: Access modifiers changed from: private */
        public static List<ze0> a(InterfaceC1861cm.a aVar) {
            List<ze0> list = aVar.f24253h;
            if (list != null) {
                return list;
            }
            Map<String, String> map = aVar.f24252g;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new ze0(entry.getKey(), entry.getValue()));
            }
            return arrayList;
        }

        private b(String str, String str2, long j4, long j5, long j6, long j7, List<ze0> list) {
            this.f25548b = str;
            this.f25549c = "".equals(str2) ? null : str2;
            this.f25550d = j4;
            this.f25551e = j5;
            this.f25552f = j6;
            this.f25553g = j7;
            this.f25554h = list;
        }

        static b a(c cVar) {
            if (f10.a(cVar) == 538247942) {
                String str = new String(f10.a(cVar, f10.b(cVar)), "UTF-8");
                String str2 = new String(f10.a(cVar, f10.b(cVar)), "UTF-8");
                long b4 = f10.b(cVar);
                long b5 = f10.b(cVar);
                long b6 = f10.b(cVar);
                long b7 = f10.b(cVar);
                int a4 = f10.a(cVar);
                if (a4 >= 0) {
                    List arrayList = a4 == 0 ? Collections.EMPTY_LIST : new ArrayList();
                    int i4 = 0;
                    while (i4 < a4) {
                        arrayList.add(new ze0(new String(f10.a(cVar, f10.b(cVar)), "UTF-8").intern(), new String(f10.a(cVar, f10.b(cVar)), "UTF-8").intern()));
                        i4++;
                        str = str;
                        str2 = str2;
                        b4 = b4;
                    }
                    return new b(str, str2, b4, b5, b6, b7, arrayList);
                }
                throw new IOException(C1877de.a("readHeaderList size=", a4));
            }
            throw new IOException();
        }

        final InterfaceC1861cm.a a(byte[] bArr) {
            InterfaceC1861cm.a aVar = new InterfaceC1861cm.a();
            aVar.f24246a = bArr;
            aVar.f24247b = this.f25549c;
            aVar.f24248c = this.f25550d;
            aVar.f24249d = this.f25551e;
            aVar.f24250e = this.f25552f;
            aVar.f24251f = this.f25553g;
            List<ze0> list = this.f25554h;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (ze0 ze0Var : list) {
                treeMap.put(ze0Var.a(), ze0Var.b());
            }
            aVar.f24252g = treeMap;
            aVar.f24253h = Collections.unmodifiableList(this.f25554h);
            return aVar;
        }

        final boolean a(BufferedOutputStream bufferedOutputStream) {
            try {
                f10.a(bufferedOutputStream, 538247942);
                byte[] bytes = this.f25548b.getBytes("UTF-8");
                f10.a(bufferedOutputStream, bytes.length);
                bufferedOutputStream.write(bytes, 0, bytes.length);
                String str = this.f25549c;
                if (str == null) {
                    str = "";
                }
                byte[] bytes2 = str.getBytes("UTF-8");
                f10.a(bufferedOutputStream, bytes2.length);
                bufferedOutputStream.write(bytes2, 0, bytes2.length);
                f10.a(bufferedOutputStream, this.f25550d);
                f10.a(bufferedOutputStream, this.f25551e);
                f10.a(bufferedOutputStream, this.f25552f);
                f10.a(bufferedOutputStream, this.f25553g);
                List<ze0> list = this.f25554h;
                if (list != null) {
                    f10.a(bufferedOutputStream, list.size());
                    for (ze0 ze0Var : list) {
                        byte[] bytes3 = ze0Var.a().getBytes("UTF-8");
                        f10.a(bufferedOutputStream, bytes3.length);
                        bufferedOutputStream.write(bytes3, 0, bytes3.length);
                        byte[] bytes4 = ze0Var.b().getBytes("UTF-8");
                        f10.a(bufferedOutputStream, bytes4.length);
                        bufferedOutputStream.write(bytes4, 0, bytes4.length);
                    }
                } else {
                    f10.a(bufferedOutputStream, 0);
                }
                bufferedOutputStream.flush();
                return true;
            } catch (IOException e4) {
                Object[] objArr = {e4.toString()};
                boolean z4 = ii2.f27214a;
                ap0.a(objArr);
                return false;
            }
        }
    }

    public interface d {
    }

    public f10(File file, int i4) {
        this.f25544c = new a(file);
        this.f25545d = i4;
    }

    private void b() {
        if (this.f25543b < this.f25545d) {
            return;
        }
        if (ii2.f27214a) {
            ap0.e(new Object[0]);
        }
        long j4 = this.f25543b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.f25542a.entrySet().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            b bVar = (b) ((Map.Entry) it.next()).getValue();
            String str = bVar.f25548b;
            File file = ((a) this.f25544c).f25546a;
            int length = str.length() / 2;
            if (new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode())).delete()) {
                this.f25543b -= bVar.f25547a;
            } else {
                String str2 = bVar.f25548b;
                int length2 = str2.length() / 2;
                ap0.a(str2, String.valueOf(str2.substring(0, length2).hashCode()) + String.valueOf(str2.substring(length2).hashCode()));
            }
            it.remove();
            i4++;
            if (this.f25543b < this.f25545d * 0.9f) {
                break;
            }
        }
        if (ii2.f27214a) {
            ap0.e(Integer.valueOf(i4), Long.valueOf(this.f25543b - j4), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1861cm
    public final synchronized void a() {
        File file = ((a) this.f25544c).f25546a;
        if (!file.exists()) {
            if (!file.mkdirs()) {
                Object[] objArr = {file.getAbsolutePath()};
                boolean z4 = ii2.f27214a;
                ap0.b(objArr);
            }
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            try {
                try {
                    long length = file2.length();
                    c cVar = new c(new BufferedInputStream(new FileInputStream(file2)), length);
                    try {
                        b a4 = b.a(cVar);
                        a4.f25547a = length;
                        String str = a4.f25548b;
                        if (this.f25542a.containsKey(str)) {
                            this.f25543b = (a4.f25547a - ((b) this.f25542a.get(str)).f25547a) + this.f25543b;
                        } else {
                            this.f25543b += a4.f25547a;
                        }
                        this.f25542a.put(str, a4);
                        cVar.close();
                    } catch (Throwable th) {
                        cVar.close();
                        throw th;
                    }
                } catch (IOException unused) {
                    file2.delete();
                }
            } catch (Throwable unused2) {
                Intrinsics.checkNotNullParameter(file2, "<this>");
                try {
                    file2.delete();
                } catch (Throwable unused3) {
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1861cm
    public final synchronized InterfaceC1861cm.a get(String str) {
        b bVar = (b) this.f25542a.get(str);
        if (bVar == null) {
            return null;
        }
        File file = ((a) this.f25544c).f25546a;
        int length = str.length() / 2;
        File file2 = new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode()));
        try {
            c cVar = new c(new BufferedInputStream(new FileInputStream(file2)), file2.length());
            try {
                b a4 = b.a(cVar);
                if (TextUtils.equals(str, a4.f25548b)) {
                    return bVar.a(a(cVar, cVar.f25555a - cVar.f25556b));
                }
                Object[] objArr = {file2.getAbsolutePath(), str, a4.f25548b};
                boolean z4 = ii2.f27214a;
                ap0.a(objArr);
                b bVar2 = (b) this.f25542a.remove(str);
                if (bVar2 != null) {
                    this.f25543b -= bVar2.f25547a;
                }
                return null;
            } finally {
                cVar.close();
            }
        } catch (IOException e4) {
            Object[] objArr2 = {file2.getAbsolutePath(), e4.toString()};
            boolean z5 = ii2.f27214a;
            ap0.a(objArr2);
            b(str);
            return null;
        }
    }

    static class c extends FilterInputStream {

        /* renamed from: a, reason: collision with root package name */
        private final long f25555a;

        /* renamed from: b, reason: collision with root package name */
        private long f25556b;

        c(BufferedInputStream bufferedInputStream, long j4) {
            super(bufferedInputStream);
            this.f25555a = j4;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() {
            int read = super.read();
            if (read != -1) {
                this.f25556b++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i4, int i5) {
            int read = super.read(bArr, i4, i5);
            if (read != -1) {
                this.f25556b += read;
            }
            return read;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1861cm
    public final synchronized void a(String str) {
        InterfaceC1861cm.a aVar = get(str);
        if (aVar != null) {
            aVar.f24251f = 0L;
            aVar.f24250e = 0L;
            a(str, aVar);
        }
    }

    static long b(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            long j4 = read & 255;
            int read2 = inputStream.read();
            if (read2 != -1) {
                long j5 = j4 | ((read2 & 255) << 8);
                int read3 = inputStream.read();
                if (read3 != -1) {
                    long j6 = j5 | ((read3 & 255) << 16);
                    int read4 = inputStream.read();
                    if (read4 != -1) {
                        long j7 = j6 | ((read4 & 255) << 24);
                        int read5 = inputStream.read();
                        if (read5 != -1) {
                            long j8 = j7 | ((read5 & 255) << 32);
                            int read6 = inputStream.read();
                            if (read6 != -1) {
                                long j9 = j8 | ((read6 & 255) << 40);
                                int read7 = inputStream.read();
                                if (read7 != -1) {
                                    long j10 = j9 | ((read7 & 255) << 48);
                                    int read8 = inputStream.read();
                                    if (read8 != -1) {
                                        return ((read8 & 255) << 56) | j10;
                                    }
                                    throw new EOFException();
                                }
                                throw new EOFException();
                            }
                            throw new EOFException();
                        }
                        throw new EOFException();
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1861cm
    public final synchronized void a(String str, InterfaceC1861cm.a aVar) {
        File file;
        BufferedOutputStream bufferedOutputStream;
        b bVar;
        long j4 = this.f25543b;
        byte[] bArr = aVar.f24246a;
        long length = j4 + bArr.length;
        int i4 = this.f25545d;
        if (length <= i4 || bArr.length <= i4 * 0.9f) {
            File file2 = ((a) this.f25544c).f25546a;
            int length2 = str.length() / 2;
            File file3 = new File(file2, String.valueOf(str.substring(0, length2).hashCode()) + String.valueOf(str.substring(length2).hashCode()));
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3));
                file = file3;
                try {
                    bVar = new b(str, aVar.f24247b, aVar.f24248c, aVar.f24249d, aVar.f24250e, aVar.f24251f, b.a(aVar));
                } catch (IOException unused) {
                    if (!file.delete()) {
                        Object[] objArr = {file.getAbsolutePath()};
                        boolean z4 = ii2.f27214a;
                        ap0.a(objArr);
                    }
                    if (!((a) this.f25544c).f25546a.exists()) {
                        boolean z5 = ii2.f27214a;
                        ap0.a(new Object[0]);
                        this.f25542a.clear();
                        this.f25543b = 0L;
                        a();
                    }
                    return;
                }
            } catch (IOException unused2) {
                file = file3;
            }
            if (bVar.a(bufferedOutputStream)) {
                bufferedOutputStream.write(aVar.f24246a);
                bufferedOutputStream.close();
                bVar.f25547a = file.length();
                if (!this.f25542a.containsKey(str)) {
                    this.f25543b += bVar.f25547a;
                } else {
                    this.f25543b = (bVar.f25547a - ((b) this.f25542a.get(str)).f25547a) + this.f25543b;
                }
                this.f25542a.put(str, bVar);
                b();
                return;
            }
            bufferedOutputStream.close();
            Object[] objArr2 = {file.getAbsolutePath()};
            boolean z6 = ii2.f27214a;
            ap0.a(objArr2);
            throw new IOException();
        }
    }

    public final synchronized void b(String str) {
        try {
            File file = ((a) this.f25544c).f25546a;
            int length = str.length() / 2;
            boolean delete = new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode())).delete();
            b bVar = (b) this.f25542a.remove(str);
            if (bVar != null) {
                this.f25543b -= bVar.f25547a;
            }
            if (!delete) {
                int length2 = str.length() / 2;
                Object[] objArr = {str, String.valueOf(str.substring(0, length2).hashCode()) + String.valueOf(str.substring(length2).hashCode())};
                boolean z4 = ii2.f27214a;
                ap0.a(objArr);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    static int a(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            int read2 = inputStream.read();
            if (read2 != -1) {
                int i4 = read | (read2 << 8);
                int read3 = inputStream.read();
                if (read3 != -1) {
                    int i5 = i4 | (read3 << 16);
                    int read4 = inputStream.read();
                    if (read4 != -1) {
                        return (read4 << 24) | i5;
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    static byte[] a(c cVar, long j4) {
        long j5 = cVar.f25555a - cVar.f25556b;
        if (j4 >= 0 && j4 <= j5) {
            int i4 = (int) j4;
            if (i4 == j4) {
                byte[] bArr = new byte[i4];
                new DataInputStream(cVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j4 + ", maxLength=" + j5);
    }

    static void a(BufferedOutputStream bufferedOutputStream, int i4) {
        bufferedOutputStream.write(i4 & KotlinVersion.MAX_COMPONENT_VALUE);
        bufferedOutputStream.write((i4 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bufferedOutputStream.write((i4 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bufferedOutputStream.write((i4 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    static void a(BufferedOutputStream bufferedOutputStream, long j4) {
        bufferedOutputStream.write((byte) j4);
        bufferedOutputStream.write((byte) (j4 >>> 8));
        bufferedOutputStream.write((byte) (j4 >>> 16));
        bufferedOutputStream.write((byte) (j4 >>> 24));
        bufferedOutputStream.write((byte) (j4 >>> 32));
        bufferedOutputStream.write((byte) (j4 >>> 40));
        bufferedOutputStream.write((byte) (j4 >>> 48));
        bufferedOutputStream.write((byte) (j4 >>> 56));
    }
}
