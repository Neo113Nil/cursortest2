package le;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final he.d f5995a;

    static {
        String str;
        int i3 = u.f6001a;
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
            Iterator it = de.n.d(de.k.b(Arrays.asList(new he.a()).iterator())).iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    ((he.a) obj).getClass();
                    do {
                        ((he.a) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((he.a) obj) == null) {
                i0.l("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                f5995a = new he.d(he.e.a(mainLooper));
            } else {
                i0.l("The main looper is not available");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
