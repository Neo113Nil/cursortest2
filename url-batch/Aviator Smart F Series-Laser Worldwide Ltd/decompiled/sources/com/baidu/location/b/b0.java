package com.baidu.location.b;

import android.location.Location;
import android.net.wifi.ScanResult;
import android.os.Build;
import com.baidu.location.Jni;
import com.baidu.platform.comapi.bmsdk.BmLocated;
import com.google.android.material.timepicker.TimeModel;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    private static ArrayList<String> f4478a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private static ArrayList<String> f4479b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private static ArrayList<String> f4480c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private static String f4481d = com.baidu.location.e.h.f5254a + "/yo.dat";

    /* renamed from: e, reason: collision with root package name */
    private static String f4482e = com.baidu.location.e.h.f5254a + "/yoh.dat";

    /* renamed from: f, reason: collision with root package name */
    private static String f4483f = com.baidu.location.e.h.f5254a + "/yom.dat";

    /* renamed from: g, reason: collision with root package name */
    private static String f4484g = com.baidu.location.e.h.f5254a + "/yol.dat";

    /* renamed from: h, reason: collision with root package name */
    private static String f4485h = com.baidu.location.e.h.f5254a + "/yor.dat";

    /* renamed from: i, reason: collision with root package name */
    private static File f4486i = null;

    /* renamed from: j, reason: collision with root package name */
    private static int f4487j = 8;

    /* renamed from: k, reason: collision with root package name */
    private static int f4488k = 8;

    /* renamed from: l, reason: collision with root package name */
    private static int f4489l = 16;

    /* renamed from: m, reason: collision with root package name */
    private static int f4490m = 2048;

    /* renamed from: n, reason: collision with root package name */
    private static double f4491n = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;

    /* renamed from: o, reason: collision with root package name */
    private static double f4492o = 0.1d;

    /* renamed from: p, reason: collision with root package name */
    private static double f4493p = 30.0d;

    /* renamed from: q, reason: collision with root package name */
    private static double f4494q = 100.0d;

    /* renamed from: r, reason: collision with root package name */
    private static int f4495r = 0;

    /* renamed from: s, reason: collision with root package name */
    private static int f4496s = 64;

    /* renamed from: t, reason: collision with root package name */
    private static int f4497t = 128;

    /* renamed from: u, reason: collision with root package name */
    private static Location f4498u = null;

    /* renamed from: v, reason: collision with root package name */
    private static Location f4499v = null;

    /* renamed from: w, reason: collision with root package name */
    private static Location f4500w = null;

    /* renamed from: x, reason: collision with root package name */
    private static com.baidu.location.c.m f4501x = null;

    /* renamed from: y, reason: collision with root package name */
    private static b0 f4502y = null;

    /* renamed from: z, reason: collision with root package name */
    private static long f4503z = 0;
    private a A;
    private int B;
    long C = 0;

    private class a extends com.baidu.location.e.g {

        /* renamed from: o, reason: collision with root package name */
        boolean f4504o = false;

        /* renamed from: p, reason: collision with root package name */
        int f4505p = 0;

        /* renamed from: q, reason: collision with root package name */
        int f4506q = 0;

        /* renamed from: r, reason: collision with root package name */
        private ArrayList<String> f4507r = new ArrayList<>();

        /* renamed from: s, reason: collision with root package name */
        private boolean f4508s = true;

        public a() {
            this.f5229g = new HashMap();
        }

        @Override // com.baidu.location.e.g
        public void a() {
            Map<String, Object> map;
            StringBuilder sb;
            String str;
            if (this.f4505p != 1) {
                this.f5225c = com.baidu.location.e.i.d();
            }
            this.f5226d = 2;
            if (this.f4507r != null) {
                for (int i8 = 0; i8 < this.f4507r.size(); i8++) {
                    if (this.f4505p == 1) {
                        map = this.f5229g;
                        sb = new StringBuilder();
                        str = "cldc[";
                    } else {
                        map = this.f5229g;
                        sb = new StringBuilder();
                        str = "cltr[";
                    }
                    sb.append(str);
                    sb.append(i8);
                    sb.append("]");
                    map.put(sb.toString(), this.f4507r.get(i8));
                }
                this.f5229g.put("trtm", String.format(Locale.CHINA, TimeModel.NUMBER_FORMAT, Long.valueOf(System.currentTimeMillis())));
                if (this.f4505p != 1) {
                    this.f5229g.put("qt", "cltrg");
                }
            }
        }

        public synchronized void b() {
            ExecutorService c8;
            String str;
            String str2;
            int i8;
            if (this.f4504o) {
                return;
            }
            int i9 = com.baidu.location.e.g.f5224b;
            if (i9 > 4 && (i8 = this.f4506q) < i9) {
                this.f4506q = i8 + 1;
                return;
            }
            this.f4506q = 0;
            this.f4504o = true;
            this.f4505p = 0;
            try {
                ArrayList<String> arrayList = this.f4507r;
                if (arrayList == null || arrayList.size() < 1) {
                    if (this.f4507r == null) {
                        this.f4507r = new ArrayList<>();
                    }
                    this.f4505p = 0;
                    int i10 = 0;
                    while (true) {
                        String str3 = null;
                        String b8 = this.f4505p < 2 ? b0.b() : null;
                        if (b8 == null && this.f4505p != 1 && this.f4508s) {
                            this.f4505p = 2;
                            try {
                                str3 = l.a();
                            } catch (Exception unused) {
                            }
                        } else {
                            this.f4505p = 1;
                            str3 = b8;
                        }
                        if (str3 == null) {
                            break;
                        }
                        if (!str3.contains("err!")) {
                            this.f4507r.add(str3);
                            i10 += str3.length();
                            if (i10 >= com.baidu.location.e.b.f5163d) {
                                break;
                            }
                        }
                    }
                }
                ArrayList<String> arrayList2 = this.f4507r;
                if (arrayList2 == null || arrayList2.size() < 1) {
                    ArrayList<String> arrayList3 = this.f4507r;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    this.f4504o = false;
                    return;
                }
                if (this.f4505p != 1) {
                    c8 = z.a().c();
                    if (c8 != null) {
                        str2 = com.baidu.location.e.i.d();
                        a(c8, str2);
                    } else {
                        str = com.baidu.location.e.i.d();
                        b(str);
                    }
                } else {
                    c8 = z.a().c();
                    if (c8 != null) {
                        str2 = com.baidu.location.e.e.f5203b;
                        a(c8, str2);
                    } else {
                        str = com.baidu.location.e.e.f5203b;
                        b(str);
                    }
                }
            } catch (Exception unused2) {
                ArrayList<String> arrayList4 = this.f4507r;
                if (arrayList4 != null) {
                    arrayList4.clear();
                }
            }
        }

        @Override // com.baidu.location.e.g
        public void a(boolean z7) {
            if (z7 && this.f5227e != null) {
                ArrayList<String> arrayList = this.f4507r;
                if (arrayList != null) {
                    arrayList.clear();
                }
                try {
                    JSONObject jSONObject = new JSONObject(this.f5227e);
                    if (jSONObject.has("ison") && jSONObject.getInt("ison") == 0) {
                        this.f4508s = false;
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
            Map<String, Object> map = this.f5229g;
            if (map != null) {
                map.clear();
            }
            this.f4504o = false;
        }
    }

    private b0() {
        String i8;
        this.A = null;
        this.B = 0;
        this.A = new a();
        this.B = 0;
        if (Build.VERSION.SDK_INT <= 28 || (i8 = com.baidu.location.e.i.i()) == null) {
            return;
        }
        f4481d = i8 + "/yo2.dat";
        f4482e = i8 + "/yoh2.dat";
        f4483f = i8 + "/yom2.dat";
        f4484g = i8 + "/yol2.dat";
        f4485h = i8 + "/yor2.dat";
    }

    private static synchronized int a(List<String> list, int i8) {
        synchronized (b0.class) {
            if (list != null && i8 <= 256) {
                if (i8 >= 0) {
                    try {
                        if (f4486i == null) {
                            File file = new File(f4481d);
                            f4486i = file;
                            if (!file.exists()) {
                                f4486i = null;
                                return -2;
                            }
                        }
                        RandomAccessFile randomAccessFile = new RandomAccessFile(f4486i, "rw");
                        if (randomAccessFile.length() < 1) {
                            randomAccessFile.close();
                            return -3;
                        }
                        long j8 = i8;
                        randomAccessFile.seek(j8);
                        int readInt = randomAccessFile.readInt();
                        int readInt2 = randomAccessFile.readInt();
                        int readInt3 = randomAccessFile.readInt();
                        int readInt4 = randomAccessFile.readInt();
                        long readLong = randomAccessFile.readLong();
                        long j9 = readLong;
                        if (a(readInt, readInt2, readInt3, readInt4, readLong)) {
                            int i9 = 1;
                            if (readInt2 >= 1) {
                                byte[] bArr = new byte[f4490m];
                                int i10 = f4487j;
                                while (i10 > 0 && readInt2 > 0) {
                                    long j10 = (((readInt + readInt2) - i9) % readInt3) * readInt4;
                                    byte[] bArr2 = bArr;
                                    long j11 = j9;
                                    randomAccessFile.seek(j10 + j11);
                                    int readInt5 = randomAccessFile.readInt();
                                    if (readInt5 > 0 && readInt5 < readInt4) {
                                        randomAccessFile.read(bArr2, 0, readInt5);
                                        int i11 = readInt5 - 1;
                                        if (bArr2[i11] == 0) {
                                            list.add(new String(bArr2, 0, i11));
                                        }
                                    }
                                    i10--;
                                    readInt2--;
                                    j9 = j11;
                                    bArr = bArr2;
                                    i9 = 1;
                                }
                                randomAccessFile.seek(j8);
                                randomAccessFile.writeInt(readInt);
                                randomAccessFile.writeInt(readInt2);
                                randomAccessFile.writeInt(readInt3);
                                randomAccessFile.writeInt(readInt4);
                                randomAccessFile.writeLong(j9);
                                randomAccessFile.close();
                                return f4487j - i10;
                            }
                        }
                        randomAccessFile.close();
                        return -4;
                    } catch (Exception e8) {
                        e8.printStackTrace();
                        return -5;
                    }
                }
            }
            return -1;
        }
    }

    public static String b() {
        return f();
    }

    public static void d() {
        f4488k = 0;
        a(1, false);
        a(2, false);
        a(3, false);
        f4488k = 8;
    }

    public static String e() {
        File file = new File(f4483f);
        if (file.exists()) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(20L);
                int readInt = randomAccessFile.readInt();
                if (readInt > 128) {
                    String str = "&p1=" + readInt;
                    randomAccessFile.seek(20L);
                    randomAccessFile.writeInt(0);
                    randomAccessFile.close();
                    return str;
                }
                randomAccessFile.close();
            } catch (Exception unused) {
            }
        }
        File file2 = new File(f4484g);
        if (file2.exists()) {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                randomAccessFile2.seek(20L);
                int readInt2 = randomAccessFile2.readInt();
                if (readInt2 > 256) {
                    String str2 = "&p2=" + readInt2;
                    randomAccessFile2.seek(20L);
                    randomAccessFile2.writeInt(0);
                    randomAccessFile2.close();
                    return str2;
                }
                randomAccessFile2.close();
            } catch (Exception unused2) {
            }
        }
        File file3 = new File(f4485h);
        if (file3.exists()) {
            try {
                RandomAccessFile randomAccessFile3 = new RandomAccessFile(file3, "rw");
                randomAccessFile3.seek(20L);
                int readInt3 = randomAccessFile3.readInt();
                if (readInt3 > 512) {
                    String str3 = "&p3=" + readInt3;
                    randomAccessFile3.seek(20L);
                    randomAccessFile3.writeInt(0);
                    randomAccessFile3.close();
                    return str3;
                }
                randomAccessFile3.close();
            } catch (Exception unused3) {
            }
        }
        return null;
    }

    private static String f() {
        String str = null;
        for (int i8 = 1; i8 < 5; i8++) {
            str = a(i8);
            if (str != null) {
                return str;
            }
        }
        a(f4480c, f4496s);
        try {
            if (f4480c.size() > 0) {
                String str2 = f4480c.get(0);
                try {
                    f4480c.remove(0);
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                str = str2;
            }
        } catch (ArrayIndexOutOfBoundsException unused2) {
        }
        if (str != null) {
            return str;
        }
        a(f4480c, f4495r);
        try {
            if (f4480c.size() > 0) {
                String str3 = f4480c.get(0);
                try {
                    f4480c.remove(0);
                } catch (ArrayIndexOutOfBoundsException unused3) {
                }
                str = str3;
            }
        } catch (ArrayIndexOutOfBoundsException unused4) {
        }
        if (str != null) {
            return str;
        }
        a(f4480c, f4497t);
        try {
            if (f4480c.size() <= 0) {
                return str;
            }
            String str4 = f4480c.get(0);
            try {
                f4480c.remove(0);
            } catch (ArrayIndexOutOfBoundsException unused5) {
            }
            return str4;
        } catch (ArrayIndexOutOfBoundsException unused6) {
            return str;
        }
    }

    public void c() {
        if (com.baidu.location.c.h.a().l() && !com.baidu.location.e.i.b()) {
            this.A.b();
        }
    }

    public static synchronized b0 a() {
        b0 b0Var;
        synchronized (b0.class) {
            try {
                if (f4502y == null) {
                    f4502y = new b0();
                }
                b0Var = f4502y;
            } catch (Throwable th) {
                throw th;
            }
        }
        return b0Var;
    }

    private static void b(String str) {
        e(str);
    }

    private static void c(String str) {
        e(str);
    }

    private static void d(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return;
            }
            File file2 = new File(com.baidu.location.e.h.f5254a);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            if (!file.createNewFile()) {
                file = null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(0L);
            randomAccessFile.writeInt(32);
            randomAccessFile.writeInt(2048);
            randomAccessFile.writeInt(BmLocated.HALF_LEFT_TOP);
            randomAccessFile.writeInt(0);
            randomAccessFile.writeInt(0);
            randomAccessFile.writeInt(0);
            randomAccessFile.close();
        } catch (Exception unused) {
        }
    }

    private static synchronized void e(String str) {
        ArrayList<String> arrayList;
        synchronized (b0.class) {
            try {
                if (str.contains("err!")) {
                    return;
                }
                int i8 = com.baidu.location.e.i.f5279m;
                if (i8 == 1) {
                    arrayList = f4478a;
                } else if (i8 == 2) {
                    arrayList = f4479b;
                } else if (i8 != 3) {
                    return;
                } else {
                    arrayList = f4480c;
                }
                if (arrayList == null) {
                    return;
                }
                if (arrayList.size() <= f4489l) {
                    arrayList.add(str);
                }
                if (arrayList.size() >= f4489l) {
                    a(i8, false);
                }
                while (arrayList.size() > f4489l) {
                    arrayList.remove(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static String a(int i8) {
        String str;
        ArrayList<String> arrayList;
        String str2 = null;
        if (i8 == 1) {
            str = f4482e;
            arrayList = f4478a;
        } else if (i8 == 2) {
            str = f4483f;
            arrayList = f4479b;
        } else {
            if (i8 == 3) {
                str = f4484g;
            } else {
                if (i8 != 4) {
                    return null;
                }
                str = f4485h;
            }
            arrayList = f4480c;
        }
        if (arrayList == null) {
            return null;
        }
        if (arrayList.size() < 1) {
            a(str, arrayList);
        }
        synchronized (b0.class) {
            int size = arrayList.size();
            if (size > 0) {
                int i9 = size - 1;
                try {
                    String str3 = arrayList.get(i9);
                    try {
                        arrayList.remove(i9);
                    } catch (Exception unused) {
                    }
                    str2 = str3;
                } catch (Exception unused2) {
                }
            }
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x000e, code lost:
    
        if (r15 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0018, code lost:
    
        if (r15 != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8 A[EDGE_INSN: B:37:0x00c8->B:29:0x00c8 BREAK  A[LOOP:0: B:13:0x0057->B:20:0x00c4], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i8, boolean z7) {
        String str;
        ArrayList<String> arrayList;
        File file;
        int size;
        boolean z8;
        try {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        str = f4484g;
                    } else {
                        if (i8 != 4) {
                            return;
                        }
                        str = f4485h;
                        if (!z7) {
                            return;
                        }
                    }
                    arrayList = f4480c;
                    file = new File(str);
                    if (!file.exists()) {
                        d(str);
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                    randomAccessFile.seek(4L);
                    int readInt = randomAccessFile.readInt();
                    int readInt2 = randomAccessFile.readInt();
                    int readInt3 = randomAccessFile.readInt();
                    int readInt4 = randomAccessFile.readInt();
                    int readInt5 = randomAccessFile.readInt();
                    size = arrayList.size();
                    while (true) {
                        z8 = false;
                        if (size <= f4488k) {
                            break;
                        }
                        if (z7) {
                            readInt5++;
                        }
                        if (readInt3 >= readInt) {
                            if (!z7) {
                                z8 = true;
                                break;
                            }
                            randomAccessFile.seek((readInt4 * readInt2) + 128);
                            byte[] bytes = (arrayList.get(0) + (char) 0).getBytes();
                            randomAccessFile.writeInt(bytes.length);
                            randomAccessFile.write(bytes, 0, bytes.length);
                            arrayList.remove(0);
                            readInt4++;
                            if (readInt4 > readInt3) {
                                readInt4 = 0;
                            }
                        } else {
                            randomAccessFile.seek((readInt2 * readInt3) + 128);
                            byte[] bytes2 = (arrayList.get(0) + (char) 0).getBytes();
                            randomAccessFile.writeInt(bytes2.length);
                            randomAccessFile.write(bytes2, 0, bytes2.length);
                            arrayList.remove(0);
                            readInt3++;
                        }
                        size--;
                    }
                    randomAccessFile.seek(12L);
                    randomAccessFile.writeInt(readInt3);
                    randomAccessFile.writeInt(readInt4);
                    randomAccessFile.writeInt(readInt5);
                    randomAccessFile.close();
                    if (!z8 || i8 >= 4) {
                        return;
                    }
                    a(i8 + 1, true);
                    return;
                }
                str = f4483f;
                arrayList = f4479b;
                file = new File(str);
                if (!file.exists()) {
                }
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                randomAccessFile2.seek(4L);
                int readInt6 = randomAccessFile2.readInt();
                int readInt22 = randomAccessFile2.readInt();
                int readInt32 = randomAccessFile2.readInt();
                int readInt42 = randomAccessFile2.readInt();
                int readInt52 = randomAccessFile2.readInt();
                size = arrayList.size();
                while (true) {
                    z8 = false;
                    if (size <= f4488k) {
                    }
                    size--;
                }
                randomAccessFile2.seek(12L);
                randomAccessFile2.writeInt(readInt32);
                randomAccessFile2.writeInt(readInt42);
                randomAccessFile2.writeInt(readInt52);
                randomAccessFile2.close();
                if (z8) {
                    return;
                } else {
                    return;
                }
            }
            str = f4482e;
            if (z7) {
                return;
            }
            RandomAccessFile randomAccessFile22 = new RandomAccessFile(file, "rw");
            randomAccessFile22.seek(4L);
            int readInt62 = randomAccessFile22.readInt();
            int readInt222 = randomAccessFile22.readInt();
            int readInt322 = randomAccessFile22.readInt();
            int readInt422 = randomAccessFile22.readInt();
            int readInt522 = randomAccessFile22.readInt();
            size = arrayList.size();
            while (true) {
                z8 = false;
                if (size <= f4488k) {
                }
                size--;
            }
            randomAccessFile22.seek(12L);
            randomAccessFile22.writeInt(readInt322);
            randomAccessFile22.writeInt(readInt422);
            randomAccessFile22.writeInt(readInt522);
            randomAccessFile22.close();
            if (z8) {
            }
        } catch (Exception unused) {
            return;
        }
        arrayList = f4478a;
        file = new File(str);
        if (!file.exists()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(com.baidu.location.c.b bVar, com.baidu.location.c.m mVar, Location location, String str, String str2) {
        StringBuilder sb;
        String str3;
        String encode;
        StringBuilder sb2;
        String str4;
        String encode2;
        String encode3;
        if ((com.baidu.location.e.i.f5281n == 3 && !a(location, mVar) && !a(location, false)) || bVar == null || bVar.c()) {
            return;
        }
        if (bVar.a()) {
            if (!a(location, mVar)) {
                mVar = null;
            }
            String str5 = com.baidu.location.e.i.a(bVar, mVar, location, str, 1) + str2;
            if (str5 != null) {
                if (Build.VERSION.SDK_INT > 28) {
                    encode3 = Jni.encodeTp4(str5);
                } else {
                    String encodeTp4 = Jni.encodeTp4(str5);
                    encode3 = (encodeTp4 == null || encodeTp4.length() >= 1000) ? Jni.encode(str5) : encodeTp4;
                }
                a(encode3);
                f4499v = location;
                f4498u = location;
                if (mVar != null) {
                    f4501x = mVar;
                    return;
                }
                return;
            }
            return;
        }
        if (mVar != null && mVar.c() && a(location, mVar)) {
            if (!a(location) && !com.baidu.location.c.h.a().e()) {
                sb2 = new StringBuilder();
                sb2.append("&cfr=1");
            } else {
                if (a(location) || !com.baidu.location.c.h.a().e()) {
                    if (com.baidu.location.c.h.a().e()) {
                        str = "&cfr=2" + str;
                    }
                    str4 = com.baidu.location.e.i.a(bVar, mVar, location, str, 2) + str2;
                    if (str4 == null) {
                        if (Build.VERSION.SDK_INT > 28) {
                            encode2 = Jni.encodeTp4(str4);
                        } else {
                            String encodeTp42 = Jni.encodeTp4(str4);
                            encode2 = (encodeTp42 == null || encodeTp42.length() >= 1000) ? Jni.encode(str4) : encodeTp42;
                        }
                        b(encode2);
                        f4500w = location;
                        f4498u = location;
                        f4501x = mVar;
                        return;
                    }
                    return;
                }
                sb2 = new StringBuilder();
                sb2.append("&cfr=3");
            }
            sb2.append(str);
            str = sb2.toString();
            str4 = com.baidu.location.e.i.a(bVar, mVar, location, str, 2) + str2;
            if (str4 == null) {
            }
        } else {
            if (!a(location) && !com.baidu.location.c.h.a().e()) {
                sb = new StringBuilder();
                sb.append("&cfr=1");
            } else {
                if (a(location) || !com.baidu.location.c.h.a().e()) {
                    if (com.baidu.location.c.h.a().e()) {
                        str = "&cfr=2" + str;
                    }
                    if (!a(location, mVar)) {
                        mVar = null;
                    }
                    str3 = com.baidu.location.e.i.a(bVar, mVar, location, str, 3) + str2;
                    if (str3 == null) {
                        if (Build.VERSION.SDK_INT > 28) {
                            encode = Jni.encodeTp4(str3);
                        } else {
                            String encodeTp43 = Jni.encodeTp4(str3);
                            encode = (encodeTp43 == null || encodeTp43.length() >= 1000) ? Jni.encode(str3) : encodeTp43;
                        }
                        c(encode);
                        f4498u = location;
                        if (mVar != null) {
                            f4501x = mVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                sb = new StringBuilder();
                sb.append("&cfr=3");
            }
            sb.append(str);
            str = sb.toString();
            if (!a(location, mVar)) {
            }
            str3 = com.baidu.location.e.i.a(bVar, mVar, location, str, 3) + str2;
            if (str3 == null) {
            }
        }
    }

    private static void a(String str) {
        e(str);
    }

    private static boolean a(int i8, int i9, int i10, int i11, long j8) {
        return i8 >= 0 && i8 < i10 && i9 >= 0 && i9 <= i10 && i10 >= 0 && i10 <= 1024 && i11 >= 128 && i11 <= 1024;
    }

    private static boolean a(Location location) {
        if (location == null) {
            return false;
        }
        Location location2 = f4499v;
        if (location2 == null || f4498u == null) {
            f4499v = location;
            return true;
        }
        double distanceTo = location.distanceTo(location2);
        return ((double) location.distanceTo(f4498u)) > (((((double) com.baidu.location.e.i.f5293w) * distanceTo) * distanceTo) + (((double) com.baidu.location.e.i.f5294x) * distanceTo)) + ((double) com.baidu.location.e.i.f5295y);
    }

    private static boolean a(Location location, com.baidu.location.c.m mVar) {
        List<ScanResult> list;
        boolean z7 = false;
        if (location != null && mVar != null && (list = mVar.f5138a) != null && !list.isEmpty()) {
            if (mVar.a(f4501x)) {
                return false;
            }
            z7 = true;
            if (f4500w == null) {
                f4500w = location;
            }
        }
        return z7;
    }

    public static boolean a(Location location, boolean z7) {
        return com.baidu.location.c.f.a(f4498u, location, z7);
    }

    private static boolean a(String str, List<String> list) {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(8L);
            int readInt = randomAccessFile.readInt();
            int readInt2 = randomAccessFile.readInt();
            int readInt3 = randomAccessFile.readInt();
            byte[] bArr = new byte[f4490m];
            int i8 = f4488k + 1;
            boolean z7 = false;
            while (i8 > 0 && readInt2 > 0) {
                if (readInt2 < readInt3) {
                    readInt3 = 0;
                }
                try {
                    randomAccessFile.seek(((readInt2 - 1) * readInt) + 128);
                    int readInt4 = randomAccessFile.readInt();
                    if (readInt4 > 0 && readInt4 < readInt) {
                        randomAccessFile.read(bArr, 0, readInt4);
                        int i9 = readInt4 - 1;
                        if (bArr[i9] == 0) {
                            list.add(0, new String(bArr, 0, i9));
                            z7 = true;
                        }
                    }
                    i8--;
                    readInt2--;
                } catch (Exception unused) {
                    return z7;
                }
            }
            randomAccessFile.seek(12L);
            randomAccessFile.writeInt(readInt2);
            randomAccessFile.writeInt(readInt3);
            randomAccessFile.close();
            return z7;
        } catch (Exception unused2) {
            return false;
        }
    }
}
