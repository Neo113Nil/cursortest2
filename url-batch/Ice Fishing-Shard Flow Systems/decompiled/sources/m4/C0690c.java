package m4;

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
import c2.e;
import h4.z;
import i4.AbstractC0549e;
import i4.C0548d;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.s;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p5.d;

/* renamed from: m4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0690c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6534a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6535b;

    /* renamed from: c, reason: collision with root package name */
    public e f6536c;

    /* renamed from: d, reason: collision with root package name */
    public long f6537d;

    /* renamed from: e, reason: collision with root package name */
    public d f6538e;

    /* renamed from: f, reason: collision with root package name */
    public FlutterJNI f6539f;

    /* renamed from: g, reason: collision with root package name */
    public ExecutorService f6540g;

    /* renamed from: h, reason: collision with root package name */
    public Future f6541h;

    public static String b(Context context, String str) {
        File file = new File(str);
        try {
            String canonicalPath = file.getCanonicalPath();
            boolean startsWith = canonicalPath.startsWith(context.getApplicationContext().getFilesDir().getCanonicalPath() + File.separator);
            boolean endsWith = canonicalPath.endsWith(".so");
            if (startsWith && endsWith) {
                return canonicalPath;
            }
            Log.e("FlutterLoader", "External path " + canonicalPath + " rejected; not overriding aot-shared-library-name.");
            return null;
        } catch (IOException unused) {
            Log.e("FlutterLoader", "External path " + file.getPath() + " is not a valid path. Please ensure this shared AOT library exists.");
            return null;
        }
    }

    public static void c(Context context, String str, ArrayList arrayList) {
        String str2;
        try {
            str2 = b(context, str);
        } catch (IOException e7) {
            Log.e("FlutterLoader", "Error while validating AOT shared library name flag: " + str, e7);
            str2 = null;
        }
        if (str2 != null) {
            arrayList.add(0, AbstractC0549e.f5527a.f5524a + str2);
            return;
        }
        Log.e("FlutterLoader", "Skipping unsafe AOT shared library name flag: " + str + ". Please ensure that the library is vetted and placed in your application's internal storage.");
    }

    public final void a(Context context, String[] strArr) {
        boolean z7;
        boolean z8;
        Iterator it;
        if (this.f6535b) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f6536c == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            A4.a.d("FlutterLoader#ensureInitializationComplete");
            try {
                C0689b c0689b = (C0689b) this.f6541h.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                arrayList.add("--icu-native-lib-path=" + ((String) this.f6538e.f7208e) + File.separator + "libflutter.so");
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle != null) {
                    z7 = false;
                    z8 = false;
                    for (Iterator it2 = AbstractC0549e.f5536k.iterator(); it2.hasNext(); it2 = it) {
                        C0548d c0548d = (C0548d) it2.next();
                        String str = c0548d.f5525b;
                        if (bundle.containsKey(str)) {
                            if (c0548d == AbstractC0549e.f5535i) {
                                Log.w("FlutterLoader", "For testing purposes only: test flag specified in the manifest was loaded by the FlutterLoader.");
                            } else {
                                if (AbstractC0549e.f5537l.contains(c0548d)) {
                                    throw new IllegalArgumentException(str + " is disabled and no longer allowed. Please remove this flag from your application manifest.");
                                }
                                z zVar = AbstractC0549e.f5538m;
                                if (((C0548d) zVar.get(c0548d)) != null) {
                                    StringBuilder sb = new StringBuilder();
                                    it = it2;
                                    sb.append("If you are trying to specify ");
                                    sb.append(str);
                                    sb.append(" in your application manifest, please make sure to use the new metadata key name: ");
                                    sb.append(((C0548d) zVar.get(c0548d)).f5525b);
                                    Log.w("FlutterLoader", sb.toString());
                                } else {
                                    it = it2;
                                    if (!c0548d.f5526c) {
                                        Log.e("FlutterLoader", "Flag with metadata key " + str + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                    }
                                }
                                if (c0548d == AbstractC0549e.f5531e) {
                                    z7 = true;
                                } else if (c0548d == AbstractC0549e.j) {
                                    z8 = true;
                                } else {
                                    C0548d c0548d2 = AbstractC0549e.f5534h;
                                    if (c0548d == c0548d2) {
                                        this.f6534a = bundle.getBoolean(c0548d2.f5525b, false);
                                    } else {
                                        if (c0548d != AbstractC0549e.f5527a) {
                                            if (c0548d == AbstractC0549e.f5528b) {
                                            }
                                        }
                                        String string = bundle.getString(str);
                                        if (string == null) {
                                            Log.e("FlutterLoader", "Flag " + str + " was specified with an empty path. Please specify a path to the desired AOT shared library.");
                                        } else {
                                            c(context, string, arrayList);
                                        }
                                    }
                                }
                                String str2 = c0548d.f5524a;
                                if (str2.endsWith("=")) {
                                    Object obj = bundle.get(str);
                                    String obj2 = obj != null ? obj.toString() : null;
                                    if (obj2 == null) {
                                        Log.e("FlutterLoader", "Flag with metadata key " + str + " requires a value, but no value was found. Please specify a value.");
                                    } else {
                                        arrayList.add(str2 + obj2);
                                    }
                                } else if (bundle.getBoolean(str, false)) {
                                    arrayList.add(str2);
                                }
                            }
                        }
                        it = it2;
                    }
                } else {
                    z7 = false;
                    z8 = false;
                }
                if (strArr != null) {
                    for (String str3 : strArr) {
                        C0548d a7 = AbstractC0549e.a(str3);
                        if (a7 == null) {
                            arrayList.add(str3);
                        } else if (a7.equals(AbstractC0549e.f5535i)) {
                            Log.w("FlutterLoader", "For testing purposes only: test flag specified on the command line was loaded by the FlutterLoader.");
                        } else {
                            C0548d c0548d3 = AbstractC0549e.f5527a;
                            if (!a7.equals(c0548d3) && !a7.equals(AbstractC0549e.f5528b)) {
                                if (a7.f5526c) {
                                    arrayList.add(str3);
                                } else {
                                    Log.e("FlutterLoader", "Command line argument " + str3 + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                }
                            }
                            c(context, str3.substring(c0548d3.f5524a.length()), arrayList);
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                C0548d c0548d4 = AbstractC0549e.f5527a;
                sb2.append(c0548d4.f5524a);
                sb2.append((String) this.f6538e.f7205b);
                arrayList.add(sb2.toString());
                arrayList.add(c0548d4.f5524a + ((String) this.f6538e.f7208e) + File.separator + ((String) this.f6538e.f7205b));
                StringBuilder sb3 = new StringBuilder();
                sb3.append("--cache-dir-path=");
                sb3.append(c0689b.f6533b);
                arrayList.add(sb3.toString());
                Object obj3 = this.f6538e.f7207d;
                arrayList.add("--domain-network-policy=" + ((String) this.f6538e.f7207d));
                this.f6536c.getClass();
                if (!z7) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    arrayList.add(AbstractC0549e.f5531e.f5524a + String.valueOf((int) ((r2.totalMem / 1000000.0d) / 2.0d)));
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (!z8) {
                    arrayList.add(AbstractC0549e.j.f5524a + "true");
                }
                this.f6539f.init(context, (String[]) arrayList.toArray(new String[0]), null, c0689b.f6532a, c0689b.f6533b, SystemClock.uptimeMillis() - this.f6537d, Build.VERSION.SDK_INT);
                this.f6535b = true;
                Trace.endSection();
            } finally {
            }
        } catch (Exception e7) {
            Log.e("FlutterLoader", "Flutter initialization failed.", e7);
            throw new RuntimeException(e7);
        }
    }

    public final void d(Context context) {
        e eVar = new e();
        if (this.f6536c != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        A4.a.d("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f6536c = eVar;
            this.f6537d = SystemClock.uptimeMillis();
            this.f6538e = d4.c.w(applicationContext);
            s a7 = s.a((DisplayManager) applicationContext.getSystemService("display"), this.f6539f);
            a7.f5921b.setAsyncWaitForVsyncDelegate(a7.f5923d);
            this.f6541h = this.f6540g.submit(new CallableC0688a(this, applicationContext));
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
