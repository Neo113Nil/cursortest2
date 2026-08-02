package q0;

import B0.C0023a;
import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.s;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: q0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3379a;

    /* renamed from: b, reason: collision with root package name */
    public C0023a f3380b;

    /* renamed from: c, reason: collision with root package name */
    public long f3381c;

    /* renamed from: d, reason: collision with root package name */
    public o0.b f3382d;

    /* renamed from: e, reason: collision with root package name */
    public FlutterJNI f3383e;

    /* renamed from: f, reason: collision with root package name */
    public ExecutorService f3384f;

    /* renamed from: g, reason: collision with root package name */
    public Future f3385g;

    public final void a(Context context, String[] strArr) {
        if (this.f3379a) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f3380b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            E0.a.b("FlutterLoader#ensureInitializationComplete");
            try {
                C0286c c0286c = (C0286c) this.f3385g.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                StringBuilder sb = new StringBuilder("--icu-native-lib-path=");
                sb.append((String) this.f3382d.f3332i);
                String str = File.separator;
                sb.append(str);
                sb.append("libflutter.so");
                arrayList.add(sb.toString());
                if (strArr != null) {
                    Collections.addAll(arrayList, strArr);
                }
                arrayList.add("--aot-shared-library-name=".concat((String) this.f3382d.f3329f));
                arrayList.add("--aot-shared-library-name=" + ((String) this.f3382d.f3332i) + str + ((String) this.f3382d.f3329f));
                StringBuilder sb2 = new StringBuilder("--cache-dir-path=");
                sb2.append(c0286c.f3378b);
                arrayList.add(sb2.toString());
                arrayList.add("--domain-network-policy=".concat((String) this.f3382d.f3331h));
                this.f3380b.getClass();
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                int i2 = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                if (i2 == 0) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    i2 = (int) ((r11.totalMem / 1000000.0d) / 2.0d);
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
                    if (bundle.containsKey("io.flutter.embedding.android.DisableMergedPlatformUIThread") && bundle.getBoolean("io.flutter.embedding.android.DisableMergedPlatformUIThread")) {
                        arrayList.add("--no-enable-merged-platform-ui-thread");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableSurfaceControl", false)) {
                        arrayList.add("--enable-surface-control");
                    }
                    String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                    if (string != null) {
                        arrayList.add("--impeller-backend=".concat(string));
                    }
                }
                arrayList.add("--leak-vm=".concat(bundle == null ? true : bundle.getBoolean("io.flutter.embedding.android.LeakVM", true) ? "true" : "false"));
                this.f3383e.init(context, (String[]) arrayList.toArray(new String[0]), null, c0286c.f3377a, c0286c.f3378b, SystemClock.uptimeMillis() - this.f3381c);
                this.f3379a = true;
                Trace.endSection();
            } finally {
            }
        } catch (Exception e2) {
            Log.e("FlutterLoader", "Flutter initialization failed.", e2);
            throw new RuntimeException(e2);
        }
    }

    public final void b(Context context) {
        C0023a c0023a = new C0023a(28);
        if (this.f3380b != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        E0.a.b("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f3380b = c0023a;
            this.f3381c = SystemClock.uptimeMillis();
            this.f3382d = AbstractC0284a.a(applicationContext);
            s a2 = s.a((DisplayManager) applicationContext.getSystemService("display"), this.f3383e);
            a2.f2826b.setAsyncWaitForVsyncDelegate(a2.f2828d);
            this.f3385g = this.f3384f.submit(new CallableC0285b(this, applicationContext));
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
