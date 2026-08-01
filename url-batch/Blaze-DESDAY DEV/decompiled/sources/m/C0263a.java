package m;

import java.util.concurrent.Executors;
import k0.AbstractC0180a;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0263a extends AbstractC0180a {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0263a f3146e;
    public final Object d;

    public C0263a(int i) {
        switch (i) {
            case 1:
                this.d = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.d = new C0263a(1);
                break;
        }
    }

    public static C0263a t() {
        if (f3146e != null) {
            return f3146e;
        }
        synchronized (C0263a.class) {
            try {
                if (f3146e == null) {
                    f3146e = new C0263a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3146e;
    }
}
