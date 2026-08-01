package m;

import java.util.concurrent.Executors;
import k0.z;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0252a extends z {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0252a f3138e;
    public final Object d;

    public C0252a(int i) {
        switch (i) {
            case 1:
                this.d = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.d = new C0252a(1);
                break;
        }
    }

    public static C0252a q() {
        if (f3138e != null) {
            return f3138e;
        }
        synchronized (C0252a.class) {
            try {
                if (f3138e == null) {
                    f3138e = new C0252a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3138e;
    }
}
