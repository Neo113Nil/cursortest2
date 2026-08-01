package w1;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final t1.c f4515a;

    static {
        String str;
        int i = r.f4517a;
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
            Iterator it = Arrays.asList(new t1.a()).iterator();
            k1.e.e(it, "<this>");
            Iterator it2 = q1.f.w(new q1.a(new Y0.q(2, it))).iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                if (it2.hasNext()) {
                    int a2 = ((t1.a) obj).a();
                    do {
                        Object next = it2.next();
                        int a3 = ((t1.a) next).a();
                        if (a2 < a3) {
                            obj = next;
                            a2 = a3;
                        }
                    } while (it2.hasNext());
                }
            }
            t1.a aVar = (t1.a) obj;
            if (aVar == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            try {
                aVar.getClass();
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper == null) {
                    throw new IllegalStateException("The main looper is not available");
                }
                f4515a = new t1.c(t1.d.a(mainLooper));
            } catch (Throwable th) {
                aVar.getClass();
                throw th;
            }
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
