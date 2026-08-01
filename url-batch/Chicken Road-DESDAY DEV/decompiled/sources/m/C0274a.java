package m;

import java.util.concurrent.Executors;
import k0.k;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274a extends k {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0274a f3106e;
    public final Object d;

    public C0274a(int i) {
        switch (i) {
            case 1:
                this.d = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.d = new C0274a(1);
                break;
        }
    }

    public static C0274a w() {
        if (f3106e != null) {
            return f3106e;
        }
        synchronized (C0274a.class) {
            try {
                if (f3106e == null) {
                    f3106e = new C0274a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3106e;
    }
}
