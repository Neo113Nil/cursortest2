package J1;

import E1.E;
import F1.e;
import F1.f;
import K0.j;
import a.AbstractC0129a;
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
import io.flutter.view.s;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f639a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f640b;

    /* renamed from: c, reason: collision with root package name */
    public j f641c;

    /* renamed from: d, reason: collision with root package name */
    public long f642d;

    /* renamed from: e, reason: collision with root package name */
    public a f643e;
    public FlutterJNI f;

    /* renamed from: g, reason: collision with root package name */
    public ExecutorService f644g;

    /* renamed from: h, reason: collision with root package name */
    public Future f645h;

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
        } catch (IOException e3) {
            Log.e("FlutterLoader", "Error while validating AOT shared library name flag: " + str, e3);
            str2 = null;
        }
        if (str2 != null) {
            arrayList.add(0, f.f501a.f498a + str2);
            return;
        }
        Log.e("FlutterLoader", "Skipping unsafe AOT shared library name flag: " + str + ". Please ensure that the library is vetted and placed in your application's internal storage.");
    }

    public final void a(Context context, String[] strArr) {
        boolean z;
        boolean z2;
        Iterator it;
        if (this.f640b) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f641c == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            Z1.a.b("FlutterLoader#ensureInitializationComplete");
            try {
                c cVar = (c) this.f645h.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                arrayList.add("--icu-native-lib-path=" + this.f643e.f632d + File.separator + "libflutter.so");
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle != null) {
                    z = false;
                    z2 = false;
                    for (Iterator it2 = f.f510k.iterator(); it2.hasNext(); it2 = it) {
                        e eVar = (e) it2.next();
                        String str = eVar.f499b;
                        if (bundle.containsKey(str)) {
                            if (eVar == f.f508i) {
                                Log.w("FlutterLoader", "For testing purposes only: test flag specified in the manifest was loaded by the FlutterLoader.");
                            } else {
                                if (f.f511l.contains(eVar)) {
                                    throw new IllegalArgumentException(str + " is disabled and no longer allowed. Please remove this flag from your application manifest.");
                                }
                                E e3 = f.f512m;
                                if (((e) e3.get(eVar)) != null) {
                                    StringBuilder sb = new StringBuilder();
                                    it = it2;
                                    sb.append("If you are trying to specify ");
                                    sb.append(str);
                                    sb.append(" in your application manifest, please make sure to use the new metadata key name: ");
                                    sb.append(((e) e3.get(eVar)).f499b);
                                    Log.w("FlutterLoader", sb.toString());
                                } else {
                                    it = it2;
                                    if (!eVar.f500c) {
                                        Log.e("FlutterLoader", "Flag with metadata key " + str + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                    }
                                }
                                if (eVar == f.f505e) {
                                    z = true;
                                } else if (eVar == f.f509j) {
                                    z2 = true;
                                } else {
                                    e eVar2 = f.f507h;
                                    if (eVar == eVar2) {
                                        this.f639a = bundle.getBoolean(eVar2.f499b, false);
                                    } else {
                                        if (eVar != f.f501a) {
                                            if (eVar == f.f502b) {
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
                                String str2 = eVar.f498a;
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
                    z = false;
                    z2 = false;
                }
                if (strArr != null) {
                    for (String str3 : strArr) {
                        e a3 = f.a(str3);
                        if (a3 == null) {
                            arrayList.add(str3);
                        } else if (a3.equals(f.f508i)) {
                            Log.w("FlutterLoader", "For testing purposes only: test flag specified on the command line was loaded by the FlutterLoader.");
                        } else {
                            e eVar3 = f.f501a;
                            if (!a3.equals(eVar3) && !a3.equals(f.f502b)) {
                                if (a3.f500c) {
                                    arrayList.add(str3);
                                } else {
                                    Log.e("FlutterLoader", "Command line argument " + str3 + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                }
                            }
                            c(context, str3.substring(eVar3.f498a.length()), arrayList);
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                e eVar4 = f.f501a;
                sb2.append(eVar4.f498a);
                sb2.append(this.f643e.f629a);
                arrayList.add(sb2.toString());
                arrayList.add(eVar4.f498a + this.f643e.f632d + File.separator + this.f643e.f629a);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("--cache-dir-path=");
                sb3.append(cVar.f638b);
                arrayList.add(sb3.toString());
                String str4 = this.f643e.f631c;
                arrayList.add("--domain-network-policy=" + this.f643e.f631c);
                this.f641c.getClass();
                if (!z) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    arrayList.add(f.f505e.f498a + String.valueOf((int) ((r2.totalMem / 1000000.0d) / 2.0d)));
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (!z2) {
                    arrayList.add(f.f509j.f498a + "true");
                }
                this.f.init(context, (String[]) arrayList.toArray(new String[0]), null, cVar.f637a, cVar.f638b, SystemClock.uptimeMillis() - this.f642d, Build.VERSION.SDK_INT);
                this.f640b = true;
                Trace.endSection();
            } finally {
            }
        } catch (Exception e4) {
            Log.e("FlutterLoader", "Flutter initialization failed.", e4);
            throw new RuntimeException(e4);
        }
    }

    public final void d(Context context) {
        j jVar = new j(7);
        if (this.f641c != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        Z1.a.b("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f641c = jVar;
            this.f642d = SystemClock.uptimeMillis();
            this.f643e = AbstractC0129a.s(applicationContext);
            s a3 = s.a((DisplayManager) applicationContext.getSystemService("display"), this.f);
            a3.f9458b.setAsyncWaitForVsyncDelegate(a3.f9460d);
            this.f645h = this.f644g.submit(new b(this, applicationContext));
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
