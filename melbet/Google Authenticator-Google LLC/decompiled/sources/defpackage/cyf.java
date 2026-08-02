package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.net.HttpEngineProviderSingleton;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyf {
    public static String b = "0";
    private static final String c = "cyf";
    private static ctg e;
    private static boolean f;
    private static final clm d = clm.d;
    public static final Object a = new Object();

    private cyf() {
    }

    public static ctg a() {
        ctg ctgVar;
        synchronized (a) {
            ctgVar = e;
        }
        return ctgVar;
    }

    @Deprecated
    public static void b(Context context) {
        synchronized (a) {
            if (c()) {
                return;
            }
            cyh cyhVar = new cyh(context, 37401, 1.0f);
            try {
                new cyi("PlayServices CronetProviderInstaller#installIfNeeded", 0);
                try {
                    oy.au(context, "Context must not be null");
                    if (HttpEngineProviderSingleton.getInstance(context).shouldUseHttpEngine()) {
                        f = true;
                        cyhVar.a();
                        Trace.endSection();
                        cyhVar.close();
                        return;
                    }
                    ClassLoader classLoader = cyf.class.getClassLoader();
                    oy.at(classLoader);
                    try {
                        classLoader.loadClass("org.chromium.net.CronetEngine");
                        new cyi("PlayServices CronetProviderInstaller#installIfNeeded verifyGooglePlayServicesIsAvailable", 0);
                        try {
                            cmd.c(context, 11925000);
                            Trace.endSection();
                            try {
                                new cyi("CronetProviderInstaller#installIfNeeded DynamiteModule#load", 0);
                                try {
                                    ctg b2 = ctg.b(context, ctg.a, "com.google.android.gms.cronet_dynamite");
                                    Trace.endSection();
                                    try {
                                        new cyi("PlayServices CronetProviderInstaller#installIfNeeded loading class", 0);
                                        try {
                                            Class<?> loadClass = b2.c.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                                            if (loadClass.getClassLoader() == cyf.class.getClassLoader()) {
                                                Log.e(c, "ImplVersion class is missing from Cronet module.");
                                                throw new cmb(8);
                                            }
                                            Method method = loadClass.getMethod("getApiLevel", null);
                                            Method method2 = loadClass.getMethod("getCronetVersion", null);
                                            Integer num = (Integer) method.invoke(null, null);
                                            oy.at(num);
                                            int intValue = num.intValue();
                                            String str = (String) method2.invoke(null, null);
                                            oy.at(str);
                                            b = str;
                                            Trace.endSection();
                                            if (intValue >= 3) {
                                                e = b2;
                                                cyhVar.a();
                                                Trace.endSection();
                                                cyhVar.close();
                                                return;
                                            }
                                            Intent m = d.m(context, 2, "cr");
                                            if (m == null) {
                                                Log.e(c, "Unable to fetch error resolution intent");
                                                throw new cmb(2);
                                            }
                                            throw new cmc(2, "Google Play Services update is required. The API Level of the client is 3. The API Level of the implementation is " + intValue + ". The Cronet implementation version is " + b, m);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    } catch (Exception e2) {
                                        Log.e(c, "Unable to read Cronet version from the Cronet module ", e2);
                                        throw ((cmb) new cmb(8).initCause(e2));
                                    }
                                } finally {
                                    try {
                                        Trace.endSection();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                            } catch (ctc e3) {
                                Log.e(c, "Unable to load Cronet module", e3);
                                throw ((cmb) new cmb(8).initCause(e3));
                            }
                        } finally {
                        }
                    } catch (ClassNotFoundException e4) {
                        Log.e(c, "Cronet API is not available. Have you included all required dependencies?");
                        throw ((cmb) new cmb(10).initCause(e4));
                    }
                } finally {
                }
            } finally {
            }
        }
    }

    public static boolean c() {
        synchronized (a) {
            boolean z = true;
            if (f) {
                return true;
            }
            if (a() == null) {
                z = false;
            }
            return z;
        }
    }
}
