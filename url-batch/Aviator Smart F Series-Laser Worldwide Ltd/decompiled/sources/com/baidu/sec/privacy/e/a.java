package com.baidu.sec.privacy.e;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;

/* loaded from: classes2.dex */
public class a implements com.baidu.sec.privacy.b.a {

    /* renamed from: a, reason: collision with root package name */
    public static volatile a f10642a;

    /* renamed from: b, reason: collision with root package name */
    public static Context f10643b;

    /* renamed from: c, reason: collision with root package name */
    public com.baidu.sec.privacy.e.d.a<String> f10644c;

    /* renamed from: d, reason: collision with root package name */
    public com.baidu.sec.privacy.e.d.a<Integer> f10645d;

    /* renamed from: e, reason: collision with root package name */
    public com.baidu.sec.privacy.e.d.a<Integer> f10646e;

    /* renamed from: f, reason: collision with root package name */
    public com.baidu.sec.privacy.e.d.a<String> f10647f;

    /* renamed from: g, reason: collision with root package name */
    public com.baidu.sec.privacy.e.d.a<String> f10648g;

    /* renamed from: h, reason: collision with root package name */
    public com.baidu.sec.privacy.e.d.a<String> f10649h;

    /* renamed from: i, reason: collision with root package name */
    public com.baidu.sec.privacy.e.d.a<String> f10650i;

    /* renamed from: com.baidu.sec.privacy.e.a$a, reason: collision with other inner class name */
    public class C0145a implements com.baidu.sec.privacy.e.d.a<String> {
        public C0145a() {
        }

        @Override // com.baidu.sec.privacy.e.d.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(String str, Object... objArr) {
            return (String) a.this.d(str);
        }
    }

    public class b implements com.baidu.sec.privacy.e.d.a<Integer> {
        public b() {
        }

        @Override // com.baidu.sec.privacy.e.d.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer a(String str, Object... objArr) {
            return (Integer) a.this.d(str);
        }
    }

    public class c implements com.baidu.sec.privacy.e.d.a<Integer> {
        public c(a aVar) {
        }

        @Override // com.baidu.sec.privacy.e.d.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer a(String str, Object... objArr) {
            return (Integer) a.c(str);
        }
    }

    public class d implements com.baidu.sec.privacy.e.d.a<String> {
        public d() {
        }

        @Override // com.baidu.sec.privacy.e.d.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(String str, Object... objArr) {
            return a.this.f();
        }
    }

    public class e implements com.baidu.sec.privacy.e.d.a<String> {
        public e() {
        }

        @Override // com.baidu.sec.privacy.e.d.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(String str, Object... objArr) {
            return a.this.e();
        }
    }

    public class f implements com.baidu.sec.privacy.e.d.a<String> {
        public f() {
        }

        @Override // com.baidu.sec.privacy.e.d.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(String str, Object... objArr) {
            return a.this.d();
        }
    }

    public class g implements com.baidu.sec.privacy.e.d.a<String> {
        public g(a aVar) {
        }

        @Override // com.baidu.sec.privacy.e.d.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(String str, Object... objArr) {
            return Build.MANUFACTURER;
        }
    }

    public a(Context context) {
        f10643b = context;
    }

    public final Object d(String str) {
        try {
        } catch (Throwable th) {
            com.baidu.sec.privacy.f.c.a(th);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("&&");
        if (split.length != 2) {
            return null;
        }
        String str2 = split[0];
        String str3 = split[1];
        if ("1".equals(str2)) {
            return h(str3);
        }
        if ("2".equals(str2)) {
            return Integer.valueOf(f(str3));
        }
        return null;
    }

    public final int e(String str) {
        try {
            return Settings.Secure.getInt(f10643b.getContentResolver(), str);
        } catch (Settings.SettingNotFoundException unused) {
            return -1;
        }
    }

    public final int f(String str) {
        try {
            return Settings.System.getInt(f10643b.getContentResolver(), str);
        } catch (Settings.SettingNotFoundException unused) {
            return -1;
        }
    }

    public boolean g() {
        if (com.baidu.sec.privacy.f.c.d(f10643b)) {
            return true;
        }
        return com.baidu.sec.privacy.d.a.a();
    }

    public final String h(String str) {
        try {
            return Settings.System.getString(f10643b.getContentResolver(), str);
        } catch (Throwable th) {
            com.baidu.sec.privacy.f.c.a(th);
            return "";
        }
    }

    public String c(String str, boolean z7) {
        return c(str, z7, false);
    }

    public final String e() {
        return com.baidu.sec.privacy.f.b.a(f10643b);
    }

    public final String f() {
        return com.baidu.sec.privacy.f.b.b(f10643b);
    }

    public static a a(Context context) {
        if (f10642a == null) {
            synchronized (a.class) {
                f10642a = new a(context);
            }
        }
        return f10642a;
    }

    public int b(String str, boolean z7) {
        return b(str, z7, false);
    }

    public String c(String str, boolean z7, boolean z8) {
        if (z7) {
            if (this.f10644c == null) {
                this.f10644c = new C0145a();
            }
            return com.baidu.sec.privacy.f.f.a(f10643b, 42, "1&&" + str, z8, this.f10644c, new Object[0]);
        }
        if (com.baidu.sec.privacy.f.f.a(f10643b, 42)) {
            return h(str);
        }
        return com.baidu.sec.privacy.f.f.a(f10643b, z8);
    }

    public final String g(String str) {
        try {
            return Settings.Secure.getString(f10643b.getContentResolver(), str);
        } catch (Throwable th) {
            com.baidu.sec.privacy.f.c.a(th);
            return "";
        }
    }

    public int b(String str, boolean z7, boolean z8) {
        if (z7) {
            if (this.f10645d == null) {
                this.f10645d = new b();
            }
            return com.baidu.sec.privacy.f.f.a(f10643b, 42, "2&&" + str, -1, z8, this.f10645d, new Object[0]);
        }
        if (com.baidu.sec.privacy.f.f.a(f10643b, 42)) {
            return f(str);
        }
        return com.baidu.sec.privacy.f.f.a(f10643b, -1, z8);
    }

    @Override // com.baidu.sec.privacy.b.a
    public boolean a() {
        return com.baidu.sec.privacy.d.b.b(com.baidu.sec.privacy.d.a.f10632e);
    }

    @Override // com.baidu.sec.privacy.b.a
    public File a(String str) {
        try {
            if (com.baidu.sec.privacy.f.f.a(f10643b, 44)) {
                return new File(str);
            }
            return null;
        } catch (Throwable th) {
            com.baidu.sec.privacy.f.c.a(th);
            return null;
        }
    }

    public static Object c(String str) {
        try {
        } catch (Throwable th) {
            com.baidu.sec.privacy.f.c.a(th);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("&&");
        if (split.length != 2) {
            return null;
        }
        String str2 = split[0];
        String str3 = split[1];
        if ("1".equals(str2)) {
            return a(com.baidu.sec.privacy.b.b.a()).g(str3);
        }
        if ("2".equals(str2)) {
            return Integer.valueOf(a(com.baidu.sec.privacy.b.b.a()).e(str3));
        }
        return null;
    }

    public String b(boolean z7) {
        if (this.f10647f == null) {
            this.f10647f = new d();
        }
        return com.baidu.sec.privacy.f.f.a(f10643b, 7, z7, this.f10647f, new Object[0]);
    }

    @Override // com.baidu.sec.privacy.b.a
    public Class a(ClassLoader classLoader, String str) {
        if (com.baidu.sec.privacy.f.f.a(f10643b, 54)) {
            return classLoader.loadClass(str);
        }
        return null;
    }

    public String b() {
        if (this.f10650i == null) {
            this.f10650i = new g(this);
        }
        return com.baidu.sec.privacy.f.f.a(f10643b, 71, false, this.f10650i, new Object[0]);
    }

    public final String d() {
        try {
            return com.baidu.sec.privacy.f.d.b(f10643b);
        } catch (Throwable th) {
            com.baidu.sec.privacy.f.c.a(th);
            return "";
        }
    }

    public boolean a(String str, String str2) {
        try {
            if (com.baidu.sec.privacy.f.f.a(f10643b, 42) && com.baidu.sec.privacy.f.e.a(f10643b, new String[]{"android.permission.WRITE_SETTINGS"})) {
                return Settings.System.putString(f10643b.getContentResolver(), str, str2);
            }
            return false;
        } catch (Throwable th) {
            com.baidu.sec.privacy.f.c.a(th);
            return false;
        }
    }

    public int a(String str, boolean z7) {
        return a(str, z7, false);
    }

    public int a(String str, boolean z7, boolean z8) {
        if (z7) {
            if (this.f10646e == null) {
                this.f10646e = new c(this);
            }
            return com.baidu.sec.privacy.f.f.a(f10643b, 48, "2&&" + str, -1, z8, this.f10646e, new Object[0]);
        }
        if (com.baidu.sec.privacy.f.f.a(f10643b, 48)) {
            return e(str);
        }
        return com.baidu.sec.privacy.f.f.a(f10643b, -1, z8);
    }

    public Pair<String, String> c() {
        if (this.f10649h == null) {
            this.f10649h = new f();
        }
        String a8 = com.baidu.sec.privacy.f.f.a(f10643b, 64, false, this.f10649h, new Object[0]);
        String str = "";
        if (com.baidu.sec.privacy.f.f.a("64")) {
            str = "" + com.baidu.sec.privacy.d.a.a("64la_in", 0L);
        }
        return new Pair<>(a8, str);
    }

    public String a(boolean z7) {
        if (this.f10648g == null) {
            this.f10648g = new e();
        }
        return com.baidu.sec.privacy.f.f.a(f10643b, 8, z7, this.f10648g, new Object[0]);
    }
}
