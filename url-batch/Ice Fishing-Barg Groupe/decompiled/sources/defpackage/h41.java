package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class h41 {
    public static final pi0 PxuCJdSBwIXG;

    static {
        String str;
        int i = yc2.PxuCJdSBwIXG;
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
            Iterator it = z32.KUoIVIumpKat(z32.bEKsvqmvPh2y(Arrays.asList(new e3()).iterator())).iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    ((e3) obj).getClass();
                    do {
                        ((e3) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((e3) obj) == null) {
                u9.rtx2ld2ELZv4("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                PxuCJdSBwIXG = new pi0(qi0.PxuCJdSBwIXG(mainLooper));
            } else {
                u9.rtx2ld2ELZv4("The main looper is not available");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
