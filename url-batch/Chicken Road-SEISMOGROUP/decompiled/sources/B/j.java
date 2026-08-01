package B;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f37a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38b;

    /* renamed from: c, reason: collision with root package name */
    public HandlerThread f39c;

    /* renamed from: d, reason: collision with root package name */
    public Handler f40d;

    /* renamed from: e, reason: collision with root package name */
    public i f41e;

    /* renamed from: f, reason: collision with root package name */
    public h f42f;

    public j(String str, int i2) {
        this.f37a = str;
        this.f38b = i2;
    }

    public final synchronized void a(i iVar) {
        HandlerThread handlerThread = new HandlerThread(this.f37a, this.f38b);
        this.f39c = handlerThread;
        handlerThread.start();
        this.f40d = new Handler(this.f39c.getLooper());
        this.f41e = iVar;
    }
}
