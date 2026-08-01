package l;

import java.util.concurrent.Executors;
import k3.m;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a extends m {

    /* renamed from: l, reason: collision with root package name */
    public static volatile a f2843l;

    /* renamed from: k, reason: collision with root package name */
    public final Object f2844k;

    public a(int i4) {
        switch (i4) {
            case 1:
                this.f2844k = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.f2844k = new a(1);
                break;
        }
    }

    public static a W() {
        if (f2843l != null) {
            return f2843l;
        }
        synchronized (a.class) {
            try {
                if (f2843l == null) {
                    f2843l = new a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2843l;
    }
}
