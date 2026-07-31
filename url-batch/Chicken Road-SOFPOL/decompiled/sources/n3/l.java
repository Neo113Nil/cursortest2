package n3;

import android.os.Handler;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public d f5367d;

    /* renamed from: e, reason: collision with root package name */
    public e f5368e;

    /* renamed from: f, reason: collision with root package name */
    public Handler f5369f;

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        try {
            obj = this.f5367d.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f5369f.post(new b7.d(5, this.f5368e, obj));
    }
}
