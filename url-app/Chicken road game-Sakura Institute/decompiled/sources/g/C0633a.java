package g;

import u3.l;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0633a extends l {

    /* renamed from: k, reason: collision with root package name */
    public static volatile C0633a f6663k;

    /* renamed from: j, reason: collision with root package name */
    public final C0635c f6664j = new C0635c();

    public static C0633a u0() {
        if (f6663k != null) {
            return f6663k;
        }
        synchronized (C0633a.class) {
            try {
                if (f6663k == null) {
                    f6663k = new C0633a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f6663k;
    }
}
