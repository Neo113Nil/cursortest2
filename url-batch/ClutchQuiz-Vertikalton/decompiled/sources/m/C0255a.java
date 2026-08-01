package m;

import d0.ExecutorC0090d;
import h0.g;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255a extends g {
    public static volatile C0255a h;
    public static final ExecutorC0090d i = new ExecutorC0090d(1);

    /* renamed from: g, reason: collision with root package name */
    public final c f3093g = new c();

    public static C0255a q() {
        if (h != null) {
            return h;
        }
        synchronized (C0255a.class) {
            try {
                if (h == null) {
                    h = new C0255a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h;
    }
}
