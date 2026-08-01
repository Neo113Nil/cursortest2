package m;

import java.util.concurrent.Executors;
import k0.y;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271a extends y {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0271a f3258e;
    public final Object d;

    public C0271a(int i) {
        switch (i) {
            case 1:
                this.d = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.d = new C0271a(1);
                break;
        }
    }

    public static C0271a n() {
        if (f3258e != null) {
            return f3258e;
        }
        synchronized (C0271a.class) {
            try {
                if (f3258e == null) {
                    f3258e = new C0271a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3258e;
    }
}
