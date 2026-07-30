package com.baidu.bbalbscesium;

import android.content.Context;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import cn.hutool.core.util.l;
import com.baidu.bbalbscesium.j.a;
import com.baidu.bbalbscesium.n.a;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {

    /* renamed from: g, reason: collision with root package name */
    private static boolean f3904g = false;

    /* renamed from: h, reason: collision with root package name */
    private static String f3905h = null;

    /* renamed from: i, reason: collision with root package name */
    private static final String f3906i = "CuidV270Manager";

    /* renamed from: j, reason: collision with root package name */
    private static final String f3907j = "bohrium";

    /* renamed from: k, reason: collision with root package name */
    private static final String f3908k = "libbh.so";

    /* renamed from: a, reason: collision with root package name */
    private Context f3909a;

    /* renamed from: b, reason: collision with root package name */
    private a.C0047a f3910b;

    /* renamed from: c, reason: collision with root package name */
    private volatile FileLock f3911c;

    /* renamed from: d, reason: collision with root package name */
    private volatile RandomAccessFile f3912d;

    /* renamed from: e, reason: collision with root package name */
    private com.baidu.bbalbscesium.j.b f3913e;

    /* renamed from: f, reason: collision with root package name */
    d f3914f;

    public static class a {

        /* renamed from: g, reason: collision with root package name */
        private static final String f3915g = "dik";

        /* renamed from: h, reason: collision with root package name */
        private static final String f3916h = "v270fk";

        /* renamed from: i, reason: collision with root package name */
        private static final String f3917i = "cck";

        /* renamed from: j, reason: collision with root package name */
        private static final String f3918j = "ek";

        /* renamed from: k, reason: collision with root package name */
        private static final String f3919k = "ctk";

        /* renamed from: l, reason: collision with root package name */
        private static final String f3920l = "vsk";

        /* renamed from: m, reason: collision with root package name */
        private static final int f3921m = 1;

        /* renamed from: n, reason: collision with root package name */
        public static final String[] f3922n = {"V", "O", "0"};

        /* renamed from: a, reason: collision with root package name */
        private String f3923a;

        /* renamed from: b, reason: collision with root package name */
        private String f3924b;

        /* renamed from: c, reason: collision with root package name */
        private String f3925c;

        /* renamed from: d, reason: collision with root package name */
        private long f3926d;

        /* renamed from: e, reason: collision with root package name */
        private String f3927e;

        /* renamed from: f, reason: collision with root package name */
        private int f3928f = 1;

        /* renamed from: com.baidu.bbalbscesium.h$a$a, reason: collision with other inner class name */
        public interface InterfaceC0043a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f3929a = "0";

            /* renamed from: b, reason: collision with root package name */
            public static final String f3930b = "O";

            /* renamed from: c, reason: collision with root package name */
            public static final String f3931c = "V";
        }

        public String b() {
            return this.f3923a;
        }

        public String c() {
            return this.f3927e;
        }

        public String d() {
            String str = this.f3924b;
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3923a);
            sb.append(b5.b.VERTICAL);
            sb.append(str);
            if ("V".equals(str)) {
                sb.append(this.f3925c);
            }
            if (!TextUtils.isEmpty(this.f3927e)) {
                sb.append(this.f3927e);
            }
            return sb.toString().trim();
        }

        public String e() {
            return this.f3924b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f3928f == aVar.f3928f && this.f3923a.equals(aVar.f3923a) && this.f3924b.equals(aVar.f3924b) && this.f3925c.equals(aVar.f3925c)) {
                String str = this.f3927e;
                String str2 = aVar.f3927e;
                if (str == str2) {
                    return true;
                }
                if (str != null && str.equals(str2)) {
                    return true;
                }
            }
            return false;
        }

        public String f() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(f3915g, this.f3923a);
                jSONObject.put(f3916h, this.f3924b);
                jSONObject.put(f3917i, this.f3925c);
                jSONObject.put(f3920l, this.f3928f);
                jSONObject.put(f3919k, this.f3926d);
                jSONObject.put(f3918j, this.f3927e);
                return jSONObject.toString();
            } catch (JSONException e8) {
                com.baidu.bbalbscesium.o.c.a(e8);
                return null;
            }
        }

        public f g() {
            f fVar = new f();
            fVar.f3887a = this.f3923a;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3924b);
            if ("V".equals(this.f3924b)) {
                sb.append(this.f3925c);
            }
            if (!TextUtils.isEmpty(this.f3927e)) {
                sb.append(this.f3927e);
            }
            fVar.f3888b = sb.toString().trim();
            return fVar;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f3923a, this.f3924b, this.f3925c, this.f3927e, Integer.valueOf(this.f3928f)});
        }

        public String a() {
            return this.f3925c;
        }
    }

    public h(Context context, com.baidu.bbalbscesium.n.a aVar, d dVar) {
        if (context == null) {
            throw new NullPointerException("context should not be null!!!");
        }
        this.f3909a = context.getApplicationContext();
        a.C0047a b8 = aVar.c().b(f3907j);
        this.f3910b = b8;
        b8.a();
        this.f3914f = dVar;
        a(aVar);
    }

    public a a(f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("arg non-nullable is expected");
        }
        a aVar = new a();
        aVar.f3926d = System.currentTimeMillis();
        aVar.f3928f = 1;
        try {
            int i8 = 0;
            aVar.f3924b = fVar.f3888b.substring(0, 1);
            aVar.f3923a = fVar.f3887a;
            aVar.f3925c = a(fVar.f3887a);
            String[] strArr = a.f3922n;
            int length = strArr.length;
            while (true) {
                if (i8 >= length) {
                    String str = fVar.f3888b;
                    if (str != null && str.length() >= 2) {
                        aVar.f3927e = fVar.f3888b.substring(1);
                    }
                } else {
                    if (strArr[i8].equals(aVar.f3924b)) {
                        break;
                    }
                    i8++;
                }
            }
            return aVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public a b() {
        if (new File(this.f3910b.b(), f3908k).exists()) {
            return b(a(true));
        }
        return null;
    }

    public a c(String str) {
        String a8 = com.baidu.bbalbscesium.m.c.a(("com.baidu" + a(this.f3909a)).getBytes(), true);
        a aVar = new a();
        aVar.f3926d = System.currentTimeMillis();
        aVar.f3928f = 1;
        aVar.f3923a = a8;
        aVar.f3924b = ExifInterface.LONGITUDE_EAST;
        aVar.f3925c = a(a8);
        aVar.f3927e = "RO";
        return aVar;
    }

    public a d() {
        a aVar;
        a.g gVar = new a.g();
        gVar.f3987a = true;
        List<com.baidu.bbalbscesium.j.a> a8 = this.f3913e.a();
        Collections.sort(a8, com.baidu.bbalbscesium.j.a.f3966f);
        List<c> b8 = this.f3914f.b(this.f3909a);
        if (b8 == null) {
            return null;
        }
        for (c cVar : b8) {
            if (!cVar.f3868d && cVar.f3867c) {
                Iterator<com.baidu.bbalbscesium.j.a> it = a8.iterator();
                while (it.hasNext()) {
                    a.h a9 = it.next().a(cVar.f3865a.packageName, gVar);
                    if (a9 != null && a9.b() && (aVar = a9.f3992a) != null) {
                        return aVar;
                    }
                }
            }
        }
        return null;
    }

    public static a b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("dik", "");
            String optString2 = jSONObject.optString("cck", "");
            long optLong = jSONObject.optLong("ctk", 0L);
            int optInt = jSONObject.optInt("vsk", 1);
            String optString3 = jSONObject.optString("ek", "");
            String optString4 = jSONObject.optString("v270fk", "V");
            if (!TextUtils.isEmpty(optString)) {
                a aVar = new a();
                aVar.f3923a = optString;
                aVar.f3925c = optString2;
                aVar.f3926d = optLong;
                aVar.f3928f = optInt;
                aVar.f3927e = optString3;
                aVar.f3924b = optString4;
                return aVar;
            }
        } catch (Exception e8) {
            com.baidu.bbalbscesium.o.c.a(e8);
        }
        return null;
    }

    public static void d(String str) {
        f3905h = str;
    }

    public a a(String str, String str2) {
        com.baidu.bbalbscesium.j.a a8 = this.f3913e.a(str2);
        a.g gVar = new a.g();
        gVar.f3987a = true;
        a.h a9 = a8.a(str, gVar);
        if (a9 == null || !a9.b()) {
            return null;
        }
        return a9.f3992a;
    }

    public synchronized void c() {
        if (this.f3911c != null) {
            try {
                this.f3911c.release();
            } catch (IOException e8) {
                e8.printStackTrace();
            }
            this.f3911c = null;
        }
        com.baidu.bbalbscesium.o.c.a(this.f3912d);
        this.f3912d = null;
    }

    public static a a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                String a8 = a(str);
                long currentTimeMillis = System.currentTimeMillis();
                a aVar = new a();
                aVar.f3923a = str;
                aVar.f3925c = a8;
                aVar.f3926d = currentTimeMillis;
                aVar.f3928f = 1;
                aVar.f3927e = str3;
                aVar.f3924b = str2;
                return aVar;
            } catch (Exception e8) {
                com.baidu.bbalbscesium.o.c.a(e8);
            }
        }
        return null;
    }

    private String a(Context context) {
        String str = f3905h;
        return TextUtils.isEmpty(str) ? "123456" : str;
    }

    private static String a(String str) {
        try {
            return new com.baidu.bbalbscesium.o.a(com.baidu.bbalbscesium.o.a.f4178d, false, false).a(new com.baidu.bbalbscesium.i.a().a(str.getBytes(l.UTF_8)));
        } catch (Exception e8) {
            e8.printStackTrace();
            return "";
        }
    }

    private String a(boolean z7) {
        return this.f3910b.a(f3908k, z7);
    }

    public void a(a aVar) {
        a.e eVar = new a.e();
        Iterator<com.baidu.bbalbscesium.j.a> it = this.f3913e.a().iterator();
        while (it.hasNext()) {
            it.next().a(eVar, aVar);
        }
    }

    private void a(com.baidu.bbalbscesium.n.a aVar) {
        com.baidu.bbalbscesium.j.b bVar = new com.baidu.bbalbscesium.j.b(new b());
        a.b bVar2 = new a.b();
        bVar2.f3971a = this.f3909a;
        bVar2.f3972b = aVar;
        a.d dVar = new a.d();
        for (com.baidu.bbalbscesium.j.a aVar2 : bVar.a()) {
            aVar2.a(bVar2);
            aVar2.a(dVar);
        }
        this.f3913e = bVar;
    }

    public synchronized boolean a() {
        RandomAccessFile randomAccessFile;
        File a8 = this.f3910b.a(".lock");
        if (!a8.exists()) {
            try {
                a8.createNewFile();
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        }
        try {
            randomAccessFile = new RandomAccessFile(a8, "rw");
            for (int i8 = 0; i8 < 100; i8++) {
                try {
                    try {
                        this.f3911c = randomAccessFile.getChannel().lock();
                        this.f3912d = randomAccessFile;
                        return true;
                    } catch (OverlappingFileLockException unused) {
                        Thread.sleep(100L);
                    }
                } catch (Exception e9) {
                    e = e9;
                    com.baidu.bbalbscesium.o.c.a(e);
                    if (this.f3911c == null) {
                        com.baidu.bbalbscesium.o.c.a(randomAccessFile);
                    }
                    return false;
                }
            }
        } catch (Exception e10) {
            e = e10;
            randomAccessFile = null;
        }
        return false;
    }

    public boolean a(a aVar, boolean z7, boolean z8) {
        a b8;
        if (aVar == null || TextUtils.isEmpty(aVar.f3923a)) {
            throw new NullPointerException("content should not be null");
        }
        if (!z8) {
            try {
                if (new File(this.f3910b.b(), f3908k).exists() && (b8 = b(a(true))) != null) {
                    String d8 = b8.d();
                    if (!TextUtils.isEmpty(d8) && d8.equals(aVar.d())) {
                        return true;
                    }
                }
            } catch (Exception e8) {
                e8.printStackTrace();
                return false;
            }
        }
        return this.f3910b.a(f3908k, aVar.f(), z7);
    }
}
