package o;

import H1.d;
import f0.ExecutorC0120d;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318a extends d {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0318a f3763c;

    /* renamed from: d, reason: collision with root package name */
    public static final ExecutorC0120d f3764d = new ExecutorC0120d(1);

    /* renamed from: b, reason: collision with root package name */
    public final c f3765b = new c();

    public static C0318a l0() {
        if (f3763c != null) {
            return f3763c;
        }
        synchronized (C0318a.class) {
            try {
                if (f3763c == null) {
                    f3763c = new C0318a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3763c;
    }
}
