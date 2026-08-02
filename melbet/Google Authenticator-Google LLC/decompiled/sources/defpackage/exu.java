package defpackage;

import android.os.StrictMode;
import java.util.Iterator;
import java.util.ServiceLoader;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exu {
    public static final exv a;

    static {
        exv extVar;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Iterator it = ServiceLoader.load(exv.class, exv.class.getClassLoader()).iterator();
            if (it.hasNext()) {
                extVar = (exv) it.next();
                hoq.I(!it.hasNext(), "Expected at most one FlagsService");
            } else {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                extVar = new ext();
            }
            a = extVar;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
