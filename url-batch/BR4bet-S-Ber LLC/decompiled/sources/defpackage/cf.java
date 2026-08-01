package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class cf {
    public static final List a;

    static {
        try {
            Iterator it = Arrays.asList(new r2()).iterator();
            it.getClass();
            a = y40.V(new kd(new dc(1, it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
