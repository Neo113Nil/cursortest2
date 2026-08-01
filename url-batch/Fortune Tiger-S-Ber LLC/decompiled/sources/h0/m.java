package h0;

import android.os.Handler;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public e f2000f;
    public f g;
    public Handler h;

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        try {
            obj = this.f2000f.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.h.post(new androidx.fragment.app.e(this.g, obj, 2));
    }
}
