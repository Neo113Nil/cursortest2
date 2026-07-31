package c5;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import c5.d;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private boolean f2181a;

    /* renamed from: b, reason: collision with root package name */
    private c f2182b;

    /* renamed from: c, reason: collision with root package name */
    private long f2183c;

    /* renamed from: d, reason: collision with root package name */
    private c5.b f2184d;

    /* renamed from: e, reason: collision with root package name */
    private FlutterJNI f2185e;

    /* renamed from: f, reason: collision with root package name */
    private ExecutorService f2186f;

    /* renamed from: g, reason: collision with root package name */
    Future<b> f2187g;

    class a implements Callable<b> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f2188a;

        a(Context context) {
            this.f2188a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            d.this.f2185e.prefetchDefaultFontManager();
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b call() {
            u5.e.a("FlutterLoader initTask");
            try {
                d.this.j(this.f2188a);
                d.this.f2185e.loadLibrary();
                d.this.f2185e.updateRefreshRate();
                d.this.f2186f.execute(new Runnable() { // from class: c5.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a.this.c();
                    }
                });
                return new b(u5.b.d(this.f2188a), u5.b.a(this.f2188a), u5.b.c(this.f2188a), null);
            } finally {
                u5.e.b();
            }
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final String f2190a;

        /* renamed from: b, reason: collision with root package name */
        final String f2191b;

        /* renamed from: c, reason: collision with root package name */
        final String f2192c;

        private b(String str, String str2, String str3) {
            this.f2190a = str;
            this.f2191b = str2;
            this.f2192c = str3;
        }

        /* synthetic */ b(String str, String str2, String str3, a aVar) {
            this(str, str2, str3);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private String f2193a;

        public String a() {
            return this.f2193a;
        }
    }

    public d() {
        this(z4.a.e().d().a());
    }

    public d(FlutterJNI flutterJNI) {
        this(flutterJNI, z4.a.e().b());
    }

    public d(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.f2181a = false;
        this.f2185e = flutterJNI;
        this.f2186f = executorService;
    }

    private String g(String str) {
        return this.f2184d.f2176d + File.separator + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e j(Context context) {
        return null;
    }

    private static boolean l(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
    }

    public boolean d() {
        return this.f2184d.f2179g;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(Context context, String[] strArr) {
        boolean z6;
        if (this.f2181a) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f2182b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        u5.e.a("FlutterLoader#ensureInitializationComplete");
        try {
            try {
                b bVar = this.f2187g.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                StringBuilder sb = new StringBuilder();
                sb.append("--icu-native-lib-path=");
                sb.append(this.f2184d.f2178f);
                String str = File.separator;
                sb.append(str);
                sb.append("libflutter.so");
                arrayList.add(sb.toString());
                if (strArr != null) {
                    Collections.addAll(arrayList, strArr);
                }
                arrayList.add("--aot-shared-library-name=" + this.f2184d.f2173a);
                arrayList.add("--aot-shared-library-name=" + this.f2184d.f2178f + str + this.f2184d.f2173a);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("--cache-dir-path=");
                sb2.append(bVar.f2191b);
                arrayList.add(sb2.toString());
                if (this.f2184d.f2177e != null) {
                    arrayList.add("--domain-network-policy=" + this.f2184d.f2177e);
                }
                if (this.f2182b.a() != null) {
                    arrayList.add("--log-tag=" + this.f2182b.a());
                }
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                int i7 = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                if (i7 == 0) {
                    ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    double d7 = memoryInfo.totalMem;
                    Double.isNaN(d7);
                    i7 = (int) ((d7 / 1000000.0d) / 2.0d);
                }
                arrayList.add("--old-gen-heap-size=" + i7);
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 12 * 4));
                arrayList.add("--prefetched-default-font-manager");
                if (bundle != null && !bundle.getBoolean("io.flutter.embedding.android.EnableSkParagraph", true)) {
                    z6 = false;
                    arrayList.add("--enable-skparagraph=" + z6);
                    if (bundle != null && bundle.getBoolean("io.flutter.embedding.android.EnableImpeller", false)) {
                        arrayList.add("--enable-impeller");
                    }
                    arrayList.add("--leak-vm=" + (!l(bundle) ? "true" : "false"));
                    this.f2185e.init(context, (String[]) arrayList.toArray(new String[0]), null, bVar.f2190a, bVar.f2191b, SystemClock.uptimeMillis() - this.f2183c);
                    this.f2181a = true;
                }
                z6 = true;
                arrayList.add("--enable-skparagraph=" + z6);
                if (bundle != null) {
                    arrayList.add("--enable-impeller");
                }
                if (!l(bundle)) {
                }
                arrayList.add("--leak-vm=" + (!l(bundle) ? "true" : "false"));
                this.f2185e.init(context, (String[]) arrayList.toArray(new String[0]), null, bVar.f2190a, bVar.f2191b, SystemClock.uptimeMillis() - this.f2183c);
                this.f2181a = true;
            } catch (Exception e7) {
                z4.b.c("FlutterLoader", "Flutter initialization failed.", e7);
                throw new RuntimeException(e7);
            }
        } finally {
            u5.e.b();
        }
    }

    public String f() {
        return this.f2184d.f2176d;
    }

    public String h(String str) {
        return g(str);
    }

    public String i(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("packages");
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str2);
        sb.append(str3);
        sb.append(str);
        return h(sb.toString());
    }

    public boolean k() {
        return this.f2181a;
    }

    public void m(Context context) {
        n(context, new c());
    }

    public void n(Context context, c cVar) {
        if (this.f2182b != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        u5.e.a("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f2182b = cVar;
            this.f2183c = SystemClock.uptimeMillis();
            this.f2184d = c5.a.e(applicationContext);
            (Build.VERSION.SDK_INT >= 17 ? io.flutter.view.e.e((DisplayManager) applicationContext.getSystemService("display"), this.f2185e) : io.flutter.view.e.d(((WindowManager) applicationContext.getSystemService("window")).getDefaultDisplay().getRefreshRate(), this.f2185e)).f();
            this.f2187g = this.f2186f.submit(new a(applicationContext));
        } finally {
            u5.e.b();
        }
    }
}
