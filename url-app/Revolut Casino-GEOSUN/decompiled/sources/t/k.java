package t;

import android.os.Handler;

/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public d f2991e;

    /* renamed from: f, reason: collision with root package name */
    public e f2992f;

    /* renamed from: g, reason: collision with root package name */
    public Handler f2993g;

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        try {
            obj = this.f2991e.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f2993g.post(new R0.i(this.f2992f, obj, 4, false));
    }
}
