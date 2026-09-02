package k0;

import android.os.Handler;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public e f2157f;

    /* renamed from: g, reason: collision with root package name */
    public f f2158g;

    /* renamed from: h, reason: collision with root package name */
    public Handler f2159h;

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        try {
            obj = this.f2157f.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f2159h.post(new androidx.fragment.app.e(this.f2158g, obj, 5));
    }
}
