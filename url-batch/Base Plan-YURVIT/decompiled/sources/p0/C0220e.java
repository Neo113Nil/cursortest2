package p0;

import B0.C0000a;
import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.t;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: p0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0220e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2938a;

    /* renamed from: b, reason: collision with root package name */
    public C0000a f2939b;

    /* renamed from: c, reason: collision with root package name */
    public long f2940c;

    /* renamed from: d, reason: collision with root package name */
    public C0217b f2941d;

    /* renamed from: e, reason: collision with root package name */
    public FlutterJNI f2942e;

    /* renamed from: f, reason: collision with root package name */
    public ExecutorService f2943f;

    /* renamed from: g, reason: collision with root package name */
    public Future f2944g;

    public static String b(Context context, String str) {
        if (!str.startsWith("--aot-shared-library-name=")) {
            throw new IllegalArgumentException("AOT shared library name flag was not specified correctly; please use --aot-shared-library-name=<path>.");
        }
        File file = new File(str.substring(26));
        try {
            String canonicalPath = file.getCanonicalPath();
            boolean startsWith = canonicalPath.startsWith(context.getApplicationContext().getFilesDir().getCanonicalPath() + File.separator);
            boolean endsWith = canonicalPath.endsWith(".so");
            if (startsWith && endsWith) {
                return "--aot-shared-library-name=".concat(canonicalPath);
            }
            Log.e("FlutterLoader", "External path " + canonicalPath + " rejected; not overriding aot-shared-library-name.");
            return null;
        } catch (IOException unused) {
            Log.e("FlutterLoader", "External path " + file.getPath() + " is not a valid path. Please ensure this shared AOT library exists.");
            return null;
        }
    }

    public final void a(Context context, String[] strArr) {
        if (this.f2938a) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f2939b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            C0.a.b("FlutterLoader#ensureInitializationComplete");
            try {
                C0219d c0219d = (C0219d) this.f2944g.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                arrayList.add("--icu-native-lib-path=" + this.f2941d.f2932d + File.separator + "libflutter.so");
                if (strArr != null) {
                    for (String str : strArr) {
                        if (str.startsWith("--aot-shared-library-name=")) {
                            String b2 = b(context, str);
                            if (b2 != null) {
                                str = b2;
                            } else {
                                Log.w("FlutterLoader", "Skipping unsafe AOT shared library name flag: " + str + ". Please ensure that the library is vetted and placed in your application's internal storage.");
                            }
                        }
                        arrayList.add(str);
                    }
                }
                arrayList.add("--aot-shared-library-name=" + this.f2941d.f2929a);
                arrayList.add("--aot-shared-library-name=" + this.f2941d.f2932d + File.separator + this.f2941d.f2929a);
                StringBuilder sb = new StringBuilder();
                sb.append("--cache-dir-path=");
                sb.append(c0219d.f2937b);
                arrayList.add(sb.toString());
                String str2 = this.f2941d.f2931c;
                arrayList.add("--domain-network-policy=" + this.f2941d.f2931c);
                this.f2939b.getClass();
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                int i2 = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                if (i2 == 0) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    i2 = (int) ((r7.totalMem / 1000000.0d) / 2.0d);
                }
                arrayList.add("--old-gen-heap-size=" + i2);
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (bundle != null) {
                    if (bundle.containsKey("io.flutter.embedding.android.EnableImpeller")) {
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller")) {
                            arrayList.add("--enable-impeller=true");
                        } else {
                            arrayList.add("--enable-impeller=false");
                        }
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                        arrayList.add("--enable-vulkan-validation");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false)) {
                        arrayList.add("--enable-opengl-gpu-tracing");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanGPUTracing", false)) {
                        arrayList.add("--enable-vulkan-gpu-tracing");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.DisableMergedPlatformUIThread", false)) {
                        throw new IllegalArgumentException("io.flutter.embedding.android.DisableMergedPlatformUIThread is no longer allowed.");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableFlutterGPU", false)) {
                        arrayList.add("--enable-flutter-gpu");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableSurfaceControl", false)) {
                        arrayList.add("--enable-surface-control");
                    }
                    String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                    if (string != null) {
                        arrayList.add("--impeller-backend=" + string);
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.ImpellerLazyShaderInitialization")) {
                        arrayList.add("--impeller-lazy-shader-mode");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.ImpellerAntialiasLines")) {
                        arrayList.add("--impeller-antialias-lines");
                    }
                }
                arrayList.add("--leak-vm=" + (bundle == null ? true : bundle.getBoolean("io.flutter.embedding.android.LeakVM", true) ? "true" : "false"));
                this.f2942e.init(context, (String[]) arrayList.toArray(new String[0]), null, c0219d.f2936a, c0219d.f2937b, SystemClock.uptimeMillis() - this.f2940c, Build.VERSION.SDK_INT);
                this.f2938a = true;
                Trace.endSection();
            } finally {
            }
        } catch (Exception e2) {
            Log.e("FlutterLoader", "Flutter initialization failed.", e2);
            throw new RuntimeException(e2);
        }
    }

    public final void c(Context context) {
        C0000a c0000a = new C0000a(27);
        if (this.f2939b != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        C0.a.b("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f2939b = c0000a;
            this.f2940c = SystemClock.uptimeMillis();
            this.f2941d = AbstractC0216a.a(applicationContext);
            t a2 = t.a((DisplayManager) applicationContext.getSystemService("display"), this.f2942e);
            a2.f2637b.setAsyncWaitForVsyncDelegate(a2.f2639d);
            this.f2944g = this.f2943f.submit(new CallableC0218c(this, applicationContext));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
