package I3;

import D3.F;
import E3.f;
import I4.e;
import R0.g;
import a.AbstractC0219a;
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
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1191a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1192b;

    /* renamed from: c, reason: collision with root package name */
    public g f1193c;

    /* renamed from: d, reason: collision with root package name */
    public long f1194d;

    /* renamed from: e, reason: collision with root package name */
    public e f1195e;

    /* renamed from: f, reason: collision with root package name */
    public FlutterJNI f1196f;

    /* renamed from: g, reason: collision with root package name */
    public ExecutorService f1197g;

    /* renamed from: h, reason: collision with root package name */
    public Future f1198h;

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
        } catch (IOException e4) {
            Log.e("FlutterLoader", "Error while validating AOT shared library name flag: " + str, e4);
            str2 = null;
        }
        if (str2 != null) {
            arrayList.add(0, f.f635a.f632a + str2);
            return;
        }
        Log.e("FlutterLoader", "Skipping unsafe AOT shared library name flag: " + str + ". Please ensure that the library is vetted and placed in your application's internal storage.");
    }

    public final void a(Context context, String[] strArr) {
        boolean z5;
        boolean z6;
        Iterator it;
        if (this.f1192b) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f1193c == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            T3.a.d("FlutterLoader#ensureInitializationComplete");
            try {
                b bVar = (b) this.f1198h.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                arrayList.add("--icu-native-lib-path=" + ((String) this.f1195e.f1213e) + File.separator + "libflutter.so");
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle != null) {
                    z5 = false;
                    z6 = false;
                    for (Iterator it2 = f.f645k.iterator(); it2.hasNext(); it2 = it) {
                        E3.e eVar = (E3.e) it2.next();
                        String str = eVar.f633b;
                        if (bundle.containsKey(str)) {
                            if (eVar == f.f643i) {
                                Log.w("FlutterLoader", "For testing purposes only: test flag specified in the manifest was loaded by the FlutterLoader.");
                            } else {
                                if (f.f646l.contains(eVar)) {
                                    throw new IllegalArgumentException(str + " is disabled and no longer allowed. Please remove this flag from your application manifest.");
                                }
                                F f7 = f.f647m;
                                if (((E3.e) f7.get(eVar)) != null) {
                                    StringBuilder sb = new StringBuilder();
                                    it = it2;
                                    sb.append("If you are trying to specify ");
                                    sb.append(str);
                                    sb.append(" in your application manifest, please make sure to use the new metadata key name: ");
                                    sb.append(((E3.e) f7.get(eVar)).f633b);
                                    Log.w("FlutterLoader", sb.toString());
                                } else {
                                    it = it2;
                                    if (!eVar.f634c) {
                                        Log.e("FlutterLoader", "Flag with metadata key " + str + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                    }
                                }
                                if (eVar == f.f639e) {
                                    z5 = true;
                                } else if (eVar == f.f644j) {
                                    z6 = true;
                                } else {
                                    E3.e eVar2 = f.f642h;
                                    if (eVar == eVar2) {
                                        this.f1191a = bundle.getBoolean(eVar2.f633b, false);
                                    } else {
                                        if (eVar != f.f635a) {
                                            if (eVar == f.f636b) {
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
                                String str2 = eVar.f632a;
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
                    z5 = false;
                    z6 = false;
                }
                if (strArr != null) {
                    for (String str3 : strArr) {
                        E3.e a7 = f.a(str3);
                        if (a7 == null) {
                            arrayList.add(str3);
                        } else if (a7.equals(f.f643i)) {
                            Log.w("FlutterLoader", "For testing purposes only: test flag specified on the command line was loaded by the FlutterLoader.");
                        } else {
                            E3.e eVar3 = f.f635a;
                            if (!a7.equals(eVar3) && !a7.equals(f.f636b)) {
                                if (a7.f634c) {
                                    arrayList.add(str3);
                                } else {
                                    Log.e("FlutterLoader", "Command line argument " + str3 + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                }
                            }
                            c(context, str3.substring(eVar3.f632a.length()), arrayList);
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                E3.e eVar4 = f.f635a;
                sb2.append(eVar4.f632a);
                sb2.append((String) this.f1195e.f1210b);
                arrayList.add(sb2.toString());
                arrayList.add(eVar4.f632a + ((String) this.f1195e.f1213e) + File.separator + ((String) this.f1195e.f1210b));
                StringBuilder sb3 = new StringBuilder();
                sb3.append("--cache-dir-path=");
                sb3.append(bVar.f1190b);
                arrayList.add(sb3.toString());
                Object obj3 = this.f1195e.f1212d;
                arrayList.add("--domain-network-policy=" + ((String) this.f1195e.f1212d));
                this.f1193c.getClass();
                if (!z5) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    arrayList.add(f.f639e.f632a + String.valueOf((int) ((r2.totalMem / 1000000.0d) / 2.0d)));
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (!z6) {
                    arrayList.add(f.f644j.f632a + "true");
                }
                this.f1196f.init(context, (String[]) arrayList.toArray(new String[0]), null, bVar.f1189a, bVar.f1190b, SystemClock.uptimeMillis() - this.f1194d, Build.VERSION.SDK_INT);
                this.f1192b = true;
                Trace.endSection();
            } finally {
            }
        } catch (Exception e4) {
            Log.e("FlutterLoader", "Flutter initialization failed.", e4);
            throw new RuntimeException(e4);
        }
    }

    public final void d(Context context) {
        g gVar = new g();
        if (this.f1193c != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        T3.a.d("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f1193c = gVar;
            this.f1194d = SystemClock.uptimeMillis();
            this.f1195e = AbstractC0219a.w(applicationContext);
            t a7 = t.a((DisplayManager) applicationContext.getSystemService("display"), this.f1196f);
            a7.f4738b.setAsyncWaitForVsyncDelegate(a7.f4740d);
            this.f1198h = this.f1197g.submit(new a(this, applicationContext));
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
