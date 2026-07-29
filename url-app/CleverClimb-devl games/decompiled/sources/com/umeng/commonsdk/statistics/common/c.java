package com.umeng.commonsdk.statistics.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: StoreHelper.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static c f9137a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Context f9138b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f9139c = null;
    private static final String e = "mobclick_agent_user_";
    private static final String f = "mobclick_agent_header_";
    private static final String g = "mobclick_agent_cached_";

    /* renamed from: d, reason: collision with root package name */
    private a f9140d;

    /* compiled from: StoreHelper.java */
    public interface b {
        void a(File file);

        boolean b(File file);

        void c(File file);
    }

    public c(Context context) {
        this.f9140d = new a(context);
    }

    public static synchronized c a(Context context) {
        c cVar;
        synchronized (c.class) {
            f9138b = context.getApplicationContext();
            f9139c = context.getPackageName();
            if (f9137a == null) {
                f9137a = new c(context);
            }
            cVar = f9137a;
        }
        return cVar;
    }

    public void a(int i) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f9138b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("vt", i).commit();
        }
    }

    public int a() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f9138b);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("vt", 0);
        }
        return 0;
    }

    public String b() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f9138b);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("st", null);
        }
        return null;
    }

    public void a(String str) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f9138b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("st", str).commit();
        }
    }

    public boolean c() {
        return com.umeng.commonsdk.framework.b.c(f9138b) > 0;
    }

    /* compiled from: StoreHelper.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f9141a;

        /* renamed from: b, reason: collision with root package name */
        private File f9142b;

        /* renamed from: c, reason: collision with root package name */
        private FilenameFilter f9143c;

        public a(Context context) {
            this(context, ".um");
        }

        public a(Context context, String str) {
            this.f9141a = 10;
            this.f9143c = new FilenameFilter() { // from class: com.umeng.commonsdk.statistics.common.c.a.1
                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str2) {
                    return str2.startsWith("um");
                }
            };
            this.f9142b = new File(context.getFilesDir(), str);
            if (this.f9142b.exists() && this.f9142b.isDirectory()) {
                return;
            }
            this.f9142b.mkdir();
        }

        public boolean a() {
            File[] listFiles = this.f9142b.listFiles();
            return listFiles != null && listFiles.length > 0;
        }

        public void a(b bVar) {
            File file;
            File[] listFiles = this.f9142b.listFiles(this.f9143c);
            if (listFiles != null && listFiles.length >= 10) {
                Arrays.sort(listFiles);
                int length = listFiles.length - 10;
                for (int i = 0; i < length; i++) {
                    listFiles[i].delete();
                }
            }
            if (listFiles == null || listFiles.length <= 0) {
                return;
            }
            bVar.a(this.f9142b);
            int length2 = listFiles.length;
            for (int i2 = 0; i2 < length2; i2++) {
                try {
                } catch (Throwable th) {
                    throw th;
                }
                if (bVar.b(listFiles[i2])) {
                    file = listFiles[i2];
                    file.delete();
                }
            }
            bVar.c(this.f9142b);
        }

        public void a(byte[] bArr) {
            if (bArr == null || bArr.length == 0) {
                return;
            }
            try {
                HelperUtils.writeFile(new File(this.f9142b, String.format(Locale.US, "um_cache_%d.env", Long.valueOf(System.currentTimeMillis()))), bArr);
            } catch (Exception unused) {
            }
        }

        public void b() {
            File[] listFiles = this.f9142b.listFiles(this.f9143c);
            if (listFiles == null || listFiles.length <= 0) {
                return;
            }
            for (File file : listFiles) {
                file.delete();
            }
        }

        public int c() {
            File[] listFiles = this.f9142b.listFiles(this.f9143c);
            if (listFiles == null || listFiles.length <= 0) {
                return 0;
            }
            return listFiles.length;
        }
    }

    private SharedPreferences f() {
        return f9138b.getSharedPreferences(e + f9139c, 0);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        SharedPreferences.Editor edit = f().edit();
        edit.putString("au_p", str);
        edit.putString("au_u", str2);
        edit.commit();
    }

    public String[] d() {
        try {
            SharedPreferences f2 = f();
            String string = f2.getString("au_p", null);
            String string2 = f2.getString("au_u", null);
            if (string != null && string2 != null) {
                return new String[]{string, string2};
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public void e() {
        f().edit().remove("au_p").remove("au_u").commit();
    }
}
