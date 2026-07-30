package com.baidu.mapsdkplatform.comapi;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public class NativeLoader {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7888a = "NativeLoader";

    /* renamed from: b, reason: collision with root package name */
    private static Context f7889b;

    /* renamed from: e, reason: collision with root package name */
    private static NativeLoader f7892e;

    /* renamed from: c, reason: collision with root package name */
    private static final Set<String> f7890c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private static final Set<String> f7891d = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private static c f7893f = c.ARMEABI;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f7894g = false;

    /* renamed from: h, reason: collision with root package name */
    private static String f7895h = null;

    class a implements FilenameFilter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7896a;

        a(String str) {
            this.f7896a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return (str == null || !str.contains("libBaiduMapSDK_") || str.contains(this.f7896a)) ? false : true;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7898a;

        static {
            int[] iArr = new int[c.values().length];
            f7898a = iArr;
            try {
                iArr[c.ARM64.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7898a[c.ARMV7.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7898a[c.ARMEABI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7898a[c.X86_64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7898a[c.X86.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private enum c {
        ARMEABI("armeabi"),
        ARMV7("armeabi-v7a"),
        ARM64("arm64-v8a"),
        X86("x86"),
        X86_64("x86_64");


        /* renamed from: g, reason: collision with root package name */
        private String f7905g;

        c(String str) {
            this.f7905g = str;
        }

        public String a() {
            return this.f7905g;
        }
    }

    private NativeLoader() {
    }

    static void a(boolean z7, String str) {
        f7894g = z7;
        f7895h = str;
    }

    private boolean b(String str) {
        try {
            Set<String> set = f7890c;
            synchronized (set) {
                try {
                    if (set.contains(str)) {
                        return true;
                    }
                    System.loadLibrary(str);
                    synchronized (set) {
                        set.add(str);
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
            return a(str);
        }
    }

    private boolean c(String str, String str2) {
        c cVar = c.ARMEABI;
        if (a(str2, cVar)) {
            return g(str2, str);
        }
        Log.e(f7888a, "found lib " + cVar.a() + "/" + str + ".so error");
        return false;
    }

    private boolean d(String str, String str2) {
        return !a(str2, c.ARMV7) ? c(str, str2) : g(str2, str);
    }

    private boolean e(String str, String str2) {
        return !a(str2, c.X86_64) ? f(str, str2) : g(str2, str);
    }

    private boolean f(String str, String str2) {
        return !a(str2, c.X86) ? d(str, str2) : g(str2, str);
    }

    private boolean g(String str, String str2) {
        try {
            System.loadLibrary(new File(b(), str).getAbsolutePath());
            Set<String> set = f7890c;
            synchronized (set) {
                set.add(str2);
            }
            a(str, str2);
            return true;
        } catch (Throwable th) {
            Set<String> set2 = f7891d;
            synchronized (set2) {
                set2.add(str2);
                a(th);
                return false;
            }
        }
    }

    public static synchronized NativeLoader getInstance() {
        NativeLoader nativeLoader;
        synchronized (NativeLoader.class) {
            try {
                if (f7892e == null) {
                    f7892e = new NativeLoader();
                    f7893f = c();
                }
                nativeLoader = f7892e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nativeLoader;
    }

    public static void setContext(Context context) {
        f7889b = context;
    }

    public synchronized boolean loadLibrary(String str) {
        if (!f7894g) {
            return b(str);
        }
        String str2 = f7895h;
        if (str2 == null || str2.isEmpty()) {
            Log.e(f7888a, "Given custom so file path is null, please check!");
            return false;
        }
        return a(str);
    }

    private boolean a(String str) {
        String mapLibraryName = System.mapLibraryName(str);
        Set<String> set = f7890c;
        synchronized (set) {
            try {
                if (set.contains(str)) {
                    return true;
                }
                int i8 = b.f7898a[f7893f.ordinal()];
                boolean f8 = i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? false : f(str, mapLibraryName) : e(str, mapLibraryName) : c(str, mapLibraryName) : d(str, mapLibraryName) : b(str, mapLibraryName);
                synchronized (set) {
                    set.add(str);
                }
                return f8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @TargetApi(21)
    private static c c() {
        String str = Build.SUPPORTED_ABIS[0];
        if (str == null) {
            return c.ARMEABI;
        }
        if (str.contains("arm") && str.contains("v7")) {
            f7893f = c.ARMV7;
        }
        if (str.contains("arm") && str.contains("64") && d()) {
            f7893f = c.ARM64;
        }
        if (str.contains("x86")) {
            if (str.contains("64")) {
                f7893f = c.X86_64;
            } else {
                f7893f = c.X86;
            }
        }
        return f7893f;
    }

    private static boolean d() {
        boolean is64Bit;
        if (Build.VERSION.SDK_INT >= 23) {
            is64Bit = Process.is64Bit();
            return is64Bit;
        }
        return Build.CPU_ABI.equals(Build.SUPPORTED_64_BIT_ABIS[0]);
    }

    private boolean b(String str, String str2) {
        if (!a(str2, c.ARM64)) {
            return d(str, str2);
        }
        return g(str2, str);
    }

    private String b() {
        if (f7889b == null) {
            return "";
        }
        File file = new File(f7889b.getFilesDir(), "libs" + File.separator + f7893f.a());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    private boolean a(String str, c cVar) {
        ZipFile zipFile;
        File file = new File(b(), str);
        if (file.exists() && file.length() > 0) {
            return true;
        }
        String str2 = a(cVar) + str;
        String a8 = !f7894g ? a() : f7895h;
        if (a8 == null || a8.isEmpty()) {
            return false;
        }
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(a8);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e8) {
            e = e8;
        }
        try {
            ZipEntry entry = zipFile.getEntry(str2);
            if (entry == null) {
                try {
                    zipFile.close();
                } catch (IOException e9) {
                    Log.e(f7888a, "Release file failed", e9);
                }
                return false;
            }
            a(zipFile.getInputStream(entry), new FileOutputStream(new File(b(), str)));
            try {
                zipFile.close();
            } catch (IOException e10) {
                Log.e(f7888a, "Release file failed", e10);
            }
            return true;
        } catch (Exception e11) {
            e = e11;
            zipFile2 = zipFile;
            Log.e(f7888a, "Copy library file error", e);
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException e12) {
                    Log.e(f7888a, "Release file failed", e12);
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            zipFile2 = zipFile;
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException e13) {
                    Log.e(f7888a, "Release file failed", e13);
                }
            }
            throw th;
        }
    }

    private void a(String str, String str2) {
        if (str == null || str.isEmpty() || !str.contains("libBaiduMapSDK_")) {
            return;
        }
        try {
            String[] split = str.split("_v");
            if (split.length <= 1) {
                return;
            }
            File[] listFiles = new File(b()).listFiles(new a(split[1]));
            if (listFiles == null || listFiles.length == 0) {
                return;
            }
            for (File file : listFiles) {
                file.delete();
            }
        } catch (Exception unused) {
        }
    }

    @TargetApi(8)
    private String a() {
        return f7889b == null ? "" : f7889b.getPackageCodePath();
    }

    private void a(Throwable th) {
        Log.e(f7888a, "loadException", th);
        for (String str : f7891d) {
            Log.e(f7888a, str + " Failed to load.");
        }
    }

    private void a(InputStream inputStream, FileOutputStream fileOutputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        }
        fileOutputStream.flush();
        try {
            inputStream.close();
        } catch (IOException e8) {
            Log.e(f7888a, "Close InputStream error", e8);
        }
        try {
            fileOutputStream.close();
        } catch (IOException e9) {
            Log.e(f7888a, "Close OutputStream error", e9);
        }
    }

    private String a(c cVar) {
        return "lib/" + cVar.a() + "/";
    }
}
