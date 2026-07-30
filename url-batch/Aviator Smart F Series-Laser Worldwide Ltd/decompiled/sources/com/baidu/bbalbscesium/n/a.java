package com.baidu.bbalbscesium.n;

import android.content.Context;
import cn.hutool.core.util.l;
import com.baidu.bbalbscesium.k.b.c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final String f4168c = "Cesium";

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f4169d = false;

    /* renamed from: e, reason: collision with root package name */
    private static final String f4170e = ".cesium";

    /* renamed from: a, reason: collision with root package name */
    private Context f4171a;

    /* renamed from: b, reason: collision with root package name */
    private C0047a f4172b;

    /* renamed from: com.baidu.bbalbscesium.n.a$a, reason: collision with other inner class name */
    public final class C0047a {

        /* renamed from: a, reason: collision with root package name */
        private File f4173a;

        /* renamed from: b, reason: collision with root package name */
        private String f4174b;

        /* renamed from: c, reason: collision with root package name */
        private C0047a f4175c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f4176d = true;

        C0047a(File file) {
            this.f4173a = file;
            this.f4174b = file.getName();
        }

        public C0047a a(File file) {
            if (this.f4176d) {
                throw new IllegalStateException("isolate session is not support");
            }
            ArrayList arrayList = new ArrayList();
            C0047a c0047a = this;
            do {
                arrayList.add(c0047a.c());
                c0047a = c0047a.d();
            } while (c0047a != null);
            int size = arrayList.size() - 1;
            while (size >= 0) {
                File file2 = new File(file, (String) arrayList.get(size));
                size--;
                file = file2;
            }
            return a.this.new C0047a(file);
        }

        public C0047a b(String str) {
            return a.this.new C0047a(str, this);
        }

        public String c() {
            return this.f4174b;
        }

        public C0047a d() {
            return this.f4175c;
        }

        C0047a(String str, C0047a c0047a) {
            this.f4174b = str;
            this.f4175c = c0047a;
        }

        public File a(String str) {
            return new File(this.f4173a, str);
        }

        public File b() {
            File file = this.f4173a;
            if (file != null) {
                return file;
            }
            File file2 = this.f4175c == null ? new File(a.this.a(), this.f4174b) : new File(this.f4175c.b(), this.f4174b);
            this.f4173a = file2;
            return file2;
        }

        public String a(String str, boolean z7) {
            return a.a(b(), str, l.UTF_8, z7);
        }

        public void a() {
            b().mkdirs();
        }

        public boolean a(String str, String str2, boolean z7) {
            return a.a(b(), str, str2, l.UTF_8, z7);
        }
    }

    public a(Context context) {
        this.f4171a = context;
        b().mkdirs();
    }

    private File b() {
        return new File(a(), f4170e);
    }

    public File a() {
        return new File(this.f4171a.getApplicationInfo().dataDir);
    }

    public synchronized C0047a c() {
        try {
            if (this.f4172b == null) {
                this.f4172b = new C0047a(f4170e, null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4172b;
    }

    public static String a(File file, String str, String str2, boolean z7) {
        FileInputStream fileInputStream;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        a(file);
        File file2 = new File(file, str);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fileInputStream = new FileInputStream(file2);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (z7) {
                        byteArray = new c().a(byteArray);
                    }
                    String str3 = new String(byteArray, str2);
                    com.baidu.bbalbscesium.o.c.a(fileInputStream);
                    com.baidu.bbalbscesium.o.c.a(byteArrayOutputStream);
                    return str3;
                } catch (Exception unused) {
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    com.baidu.bbalbscesium.o.c.a(fileInputStream);
                    com.baidu.bbalbscesium.o.c.a(byteArrayOutputStream2);
                    return "";
                } catch (Throwable th2) {
                    th = th2;
                    com.baidu.bbalbscesium.o.c.a(fileInputStream);
                    com.baidu.bbalbscesium.o.c.a(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception unused2) {
                fileInputStream = null;
            } catch (Throwable th3) {
                fileInputStream = null;
                th = th3;
            }
        } catch (Exception unused3) {
            fileInputStream = null;
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
            byteArrayOutputStream = null;
        }
    }

    public static void a(File file) {
        file.mkdirs();
    }

    public static boolean a(File file, String str, String str2, String str3, boolean z7) {
        FileOutputStream fileOutputStream;
        Throwable th;
        a(file);
        File file2 = new File(file, str);
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file2);
            try {
                if (z7) {
                    fileOutputStream.write(new c().b(str2.getBytes()));
                } else {
                    fileOutputStream.write(str2.getBytes(str3));
                }
                com.baidu.bbalbscesium.o.c.a(fileOutputStream);
                return true;
            } catch (Exception unused) {
                fileOutputStream2 = fileOutputStream;
                com.baidu.bbalbscesium.o.c.a(fileOutputStream2);
                return false;
            } catch (Throwable th2) {
                th = th2;
                com.baidu.bbalbscesium.o.c.a(fileOutputStream);
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            fileOutputStream = null;
            th = th3;
        }
    }
}
