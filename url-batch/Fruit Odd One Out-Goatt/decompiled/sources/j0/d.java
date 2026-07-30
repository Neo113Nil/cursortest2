package j0;

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
import e0.i0;
import f0.f;
import f0.g;
import f0.l;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.t;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f653a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f654b;

    /* renamed from: c, reason: collision with root package name */
    public c0.b f655c;

    /* renamed from: d, reason: collision with root package name */
    public long f656d;

    /* renamed from: e, reason: collision with root package name */
    public a f657e;

    /* renamed from: f, reason: collision with root package name */
    public FlutterJNI f658f;

    /* renamed from: g, reason: collision with root package name */
    public ExecutorService f659g;

    /* renamed from: h, reason: collision with root package name */
    public Future f660h;

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
            Log.e("FlutterLoader", "Error while validating AOT shared library name flag: ".concat(str), e2);
            str2 = null;
        }
        if (str2 != null) {
            arrayList.add(0, g.f305a.f302a + str2);
            return;
        }
        Log.e("FlutterLoader", "Skipping unsafe AOT shared library name flag: " + str + ". Please ensure that the library is vetted and placed in your application's internal storage.");
    }

    public final void a(Context context, String[] strArr) {
        boolean z2;
        boolean z3;
        Iterator it;
        if (this.f654b) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            l.b("ensureInitializationComplete must be called on the main thread");
            return;
        }
        if (this.f655c == null) {
            l.b("ensureInitializationComplete must be called after startInitialization");
            return;
        }
        try {
            s0.a.b("FlutterLoader#ensureInitializationComplete");
            try {
                c cVar = (c) this.f660h.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                arrayList.add("--icu-native-lib-path=" + this.f657e.f647d + File.separator + "libflutter.so");
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle != null) {
                    z2 = false;
                    z3 = false;
                    for (Iterator it2 = g.f315k.iterator(); it2.hasNext(); it2 = it) {
                        f fVar = (f) it2.next();
                        String str = fVar.f303b;
                        if (bundle.containsKey(str)) {
                            if (fVar == g.f313i) {
                                Log.w("FlutterLoader", "For testing purposes only: test flag specified in the manifest was loaded by the FlutterLoader.");
                            } else {
                                if (g.f316l.contains(fVar)) {
                                    throw new IllegalArgumentException(str + " is disabled and no longer allowed. Please remove this flag from your application manifest.");
                                }
                                i0 i0Var = g.m;
                                if (((f) i0Var.get(fVar)) != null) {
                                    StringBuilder sb = new StringBuilder();
                                    it = it2;
                                    sb.append("If you are trying to specify ");
                                    sb.append(str);
                                    sb.append(" in your application manifest, please make sure to use the new metadata key name: ");
                                    sb.append(((f) i0Var.get(fVar)).f303b);
                                    Log.w("FlutterLoader", sb.toString());
                                } else {
                                    it = it2;
                                    if (!fVar.f304c) {
                                        Log.e("FlutterLoader", "Flag with metadata key " + str + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                    }
                                }
                                if (fVar == g.f309e) {
                                    z2 = true;
                                } else if (fVar == g.f314j) {
                                    z3 = true;
                                } else {
                                    f fVar2 = g.f312h;
                                    if (fVar == fVar2) {
                                        this.f653a = bundle.getBoolean(fVar2.f303b, false);
                                    } else {
                                        if (fVar != g.f305a) {
                                            if (fVar == g.f306b) {
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
                                String str2 = fVar.f302a;
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
                        f a2 = g.a(str3);
                        if (a2 == null) {
                            arrayList.add(str3);
                        } else if (a2.equals(g.f313i)) {
                            Log.w("FlutterLoader", "For testing purposes only: test flag specified on the command line was loaded by the FlutterLoader.");
                        } else {
                            f fVar3 = g.f305a;
                            if (!a2.equals(fVar3) && !a2.equals(g.f306b)) {
                                if (a2.f304c) {
                                    arrayList.add(str3);
                                } else {
                                    Log.e("FlutterLoader", "Command line argument " + str3 + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                }
                            }
                            c(context, str3.substring(fVar3.f302a.length()), arrayList);
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                f fVar4 = g.f305a;
                sb2.append(fVar4.f302a);
                sb2.append(this.f657e.f644a);
                arrayList.add(sb2.toString());
                arrayList.add(fVar4.f302a + this.f657e.f647d + File.separator + this.f657e.f644a);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("--cache-dir-path=");
                sb3.append(cVar.f652b);
                arrayList.add(sb3.toString());
                String str4 = this.f657e.f646c;
                arrayList.add("--domain-network-policy=" + this.f657e.f646c);
                this.f655c.getClass();
                if (!z2) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    arrayList.add(g.f309e.f302a + String.valueOf((int) ((r2.totalMem / 1000000.0d) / 2.0d)));
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (!z3) {
                    arrayList.add(g.f314j.f302a + "true");
                }
                this.f658f.init(context, (String[]) arrayList.toArray(new String[0]), null, cVar.f651a, cVar.f652b, SystemClock.uptimeMillis() - this.f656d, Build.VERSION.SDK_INT);
                this.f654b = true;
                Trace.endSection();
            } finally {
            }
        } catch (Exception e2) {
            Log.e("FlutterLoader", "Flutter initialization failed.", e2);
            throw new RuntimeException(e2);
        }
    }

    public final void d(Context context) {
        c0.b bVar = new c0.b(4);
        if (this.f655c != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            l.b("startInitialization must be called on the main thread");
            return;
        }
        s0.a.b("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f655c = bVar;
            this.f656d = SystemClock.uptimeMillis();
            this.f657e = a.a.o(applicationContext);
            t a2 = t.a((DisplayManager) applicationContext.getSystemService("display"), this.f658f);
            a2.f640b.setAsyncWaitForVsyncDelegate(a2.f642d);
            this.f660h = this.f659g.submit(new b(this, applicationContext));
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
