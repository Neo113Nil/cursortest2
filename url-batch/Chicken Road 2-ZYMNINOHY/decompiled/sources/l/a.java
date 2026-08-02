package l;

import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class a extends AbstractC0347t0 {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f14161d;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14162c;

    public a(int i4) {
        switch (i4) {
            case 1:
                this.f14162c = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.f14162c = new a(1);
                break;
        }
    }

    public static a z() {
        if (f14161d != null) {
            return f14161d;
        }
        synchronized (a.class) {
            try {
                if (f14161d == null) {
                    f14161d = new a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f14161d;
    }
}
