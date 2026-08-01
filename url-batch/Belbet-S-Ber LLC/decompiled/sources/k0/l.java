package k0;

import android.os.Handler;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public e f2304f;

    /* renamed from: g, reason: collision with root package name */
    public f f2305g;
    public Handler h;

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        try {
            obj = this.f2304f.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.h.post(new androidx.fragment.app.e(this.f2305g, obj, 6));
    }
}
