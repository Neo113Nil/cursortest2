package b3;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final X2.d f5679a;

    static {
        String str;
        int i2 = u.f5690a;
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
            Iterator it = T2.r.k(T2.n.b(Arrays.asList(new X2.a()).iterator())).iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    int a4 = ((X2.a) obj).a();
                    do {
                        Object next = it.next();
                        int a5 = ((X2.a) next).a();
                        if (a4 < a5) {
                            obj = next;
                            a4 = a5;
                        }
                    } while (it.hasNext());
                }
            }
            X2.a aVar = (X2.a) obj;
            if (aVar == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            try {
                aVar.getClass();
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper == null) {
                    throw new IllegalStateException("The main looper is not available");
                }
                f5679a = new X2.d(X2.e.a(mainLooper));
            } catch (Throwable th) {
                aVar.getClass();
                throw th;
            }
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
