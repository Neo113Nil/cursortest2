package m;

import b1.g;
import e0.ExecutorC0105d;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286a extends g {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0286a f3530e;

    /* renamed from: f, reason: collision with root package name */
    public static final ExecutorC0105d f3531f = new ExecutorC0105d(1);
    public final c d = new c();

    public static C0286a D() {
        if (f3530e != null) {
            return f3530e;
        }
        synchronized (C0286a.class) {
            try {
                if (f3530e == null) {
                    f3530e = new C0286a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3530e;
    }
}
