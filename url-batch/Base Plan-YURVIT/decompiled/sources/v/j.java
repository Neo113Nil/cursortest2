package v;

import android.os.Handler;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public c f3079e;

    /* renamed from: f, reason: collision with root package name */
    public d f3080f;

    /* renamed from: g, reason: collision with root package name */
    public Handler f3081g;

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        try {
            obj = this.f3079e.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f3081g.post(new b1.i(this.f3080f, obj, 4, false));
    }
}
