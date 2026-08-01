package n;

import h0.d0;
import java.util.concurrent.Executors;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0263a extends d0 {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0263a f3313e;
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

    public static C0263a s() {
        if (f3313e != null) {
            return f3313e;
        }
        synchronized (C0263a.class) {
            try {
                if (f3313e == null) {
                    f3313e = new C0263a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3313e;
    }
}
