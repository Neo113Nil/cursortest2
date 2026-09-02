package m;

import java.util.concurrent.Executors;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a extends h.a {

    /* renamed from: l, reason: collision with root package name */
    public static volatile a f2679l;

    /* renamed from: k, reason: collision with root package name */
    public final Object f2680k;

    public a(int i) {
        switch (i) {
            case 1:
                this.f2680k = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.f2680k = new a(1);
                break;
        }
    }

    public static a t0() {
        if (f2679l != null) {
            return f2679l;
        }
        synchronized (a.class) {
            try {
                if (f2679l == null) {
                    f2679l = new a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2679l;
    }
}
