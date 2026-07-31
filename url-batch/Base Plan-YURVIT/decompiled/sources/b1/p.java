package b1;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final X0.c f1773a;

    static {
        String str;
        int i2 = x.f1779a;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = Arrays.asList(new X0.a()).iterator();
            P0.h.e(it, "<this>");
            Iterator it2 = U0.e.O(new U0.a(new E0.m(1, it))).iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                if (it2.hasNext()) {
                    ((X0.a) obj).getClass();
                    do {
                        ((X0.a) it2.next()).getClass();
                    } while (it2.hasNext());
                }
            }
            if (((X0.a) obj) == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null) {
                throw new IllegalStateException("The main looper is not available");
            }
            f1773a = new X0.c(X0.d.a(mainLooper), false);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
