package h0;

import a.AbstractC0069a;
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
import c0.C;
import d0.e;
import d0.f;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.s;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import t0.AbstractC0236a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2336a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2337b;

    /* renamed from: c, reason: collision with root package name */
    public E.a f2338c;

    /* renamed from: d, reason: collision with root package name */
    public long f2339d;

    /* renamed from: e, reason: collision with root package name */
    public C0173a f2340e;

    /* renamed from: f, reason: collision with root package name */
    public FlutterJNI f2341f;

    /* renamed from: g, reason: collision with root package name */
    public ExecutorService f2342g;

    /* renamed from: h, reason: collision with root package name */
    public Future f2343h;

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
        } catch (IOException e2) {
            Log.e("FlutterLoader", "Error while validating AOT shared library name flag: " + str, e2);
            str2 = null;
        }
        if (str2 != null) {
            arrayList.add(0, f.f1820a.f1817a + str2);
            return;
        }
        Log.e("FlutterLoader", "Skipping unsafe AOT shared library name flag: " + str + ". Please ensure that the library is vetted and placed in your application's internal storage.");
    }

    public final void a(Context context, String[] strArr) {
        boolean z2;
        boolean z3;
        Iterator it;
        if (this.f2337b) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f2338c == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            AbstractC0236a.b("FlutterLoader#ensureInitializationComplete");
            try {
                c cVar = (c) this.f2343h.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                arrayList.add("--icu-native-lib-path=" + this.f2340e.f2330d + File.separator + "libflutter.so");
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle != null) {
                    z2 = false;
                    z3 = false;
                    for (Iterator it2 = f.f1830k.iterator(); it2.hasNext(); it2 = it) {
                        e eVar = (e) it2.next();
                        String str = eVar.f1818b;
                        if (bundle.containsKey(str)) {
                            if (eVar == f.f1828i) {
                                Log.w("FlutterLoader", "For testing purposes only: test flag specified in the manifest was loaded by the FlutterLoader.");
                            } else {
                                if (f.f1831l.contains(eVar)) {
                                    throw new IllegalArgumentException(str + " is disabled and no longer allowed. Please remove this flag from your application manifest.");
                                }
                                C c2 = f.f1832m;
                                if (((e) c2.get(eVar)) != null) {
                                    StringBuilder sb = new StringBuilder();
                                    it = it2;
                                    sb.append("If you are trying to specify ");
                                    sb.append(str);
                                    sb.append(" in your application manifest, please make sure to use the new metadata key name: ");
                                    sb.append(((e) c2.get(eVar)).f1818b);
                                    Log.w("FlutterLoader", sb.toString());
                                } else {
                                    it = it2;
                                    if (!eVar.f1819c) {
                                        Log.e("FlutterLoader", "Flag with metadata key " + str + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                    }
                                }
                                if (eVar == f.f1824e) {
                                    z2 = true;
                                } else if (eVar == f.f1829j) {
                                    z3 = true;
                                } else {
                                    e eVar2 = f.f1827h;
                                    if (eVar == eVar2) {
                                        this.f2336a = bundle.getBoolean(eVar2.f1818b, false);
                                    } else {
                                        if (eVar != f.f1820a) {
                                            if (eVar == f.f1821b) {
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
                                String str2 = eVar.f1817a;
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
                    z2 = false;
                    z3 = false;
                }
                if (strArr != null) {
                    for (String str3 : strArr) {
                        e a2 = f.a(str3);
                        if (a2 == null) {
                            arrayList.add(str3);
                        } else if (a2.equals(f.f1828i)) {
                            Log.w("FlutterLoader", "For testing purposes only: test flag specified on the command line was loaded by the FlutterLoader.");
                        } else {
                            e eVar3 = f.f1820a;
                            if (!a2.equals(eVar3) && !a2.equals(f.f1821b)) {
                                if (a2.f1819c) {
                                    arrayList.add(str3);
                                } else {
                                    Log.e("FlutterLoader", "Command line argument " + str3 + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                }
                            }
                            c(context, str3.substring(eVar3.f1817a.length()), arrayList);
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                e eVar4 = f.f1820a;
                sb2.append(eVar4.f1817a);
                sb2.append(this.f2340e.f2327a);
                arrayList.add(sb2.toString());
                arrayList.add(eVar4.f1817a + this.f2340e.f2330d + File.separator + this.f2340e.f2327a);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("--cache-dir-path=");
                sb3.append(cVar.f2335b);
                arrayList.add(sb3.toString());
                String str4 = this.f2340e.f2329c;
                arrayList.add("--domain-network-policy=" + this.f2340e.f2329c);
                this.f2338c.getClass();
                if (!z2) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    arrayList.add(f.f1824e.f1817a + String.valueOf((int) ((r3.totalMem / 1000000.0d) / 2.0d)));
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (!z3) {
                    arrayList.add(f.f1829j.f1817a + "true");
                }
                this.f2341f.init(context, (String[]) arrayList.toArray(new String[0]), null, cVar.f2334a, cVar.f2335b, SystemClock.uptimeMillis() - this.f2339d, Build.VERSION.SDK_INT);
                this.f2337b = true;
                Trace.endSection();
            } finally {
            }
        } catch (Exception e2) {
            Log.e("FlutterLoader", "Flutter initialization failed.", e2);
            throw new RuntimeException(e2);
        }
    }

    public final void d(Context context) {
        E.a aVar = new E.a(18);
        if (this.f2338c != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        AbstractC0236a.b("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f2338c = aVar;
            this.f2339d = SystemClock.uptimeMillis();
            this.f2340e = AbstractC0069a.u(applicationContext);
            s a2 = s.a((DisplayManager) applicationContext.getSystemService("display"), this.f2341f);
            a2.f2638b.setAsyncWaitForVsyncDelegate(a2.f2640d);
            this.f2343h = this.f2342g.submit(new b(this, applicationContext));
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
