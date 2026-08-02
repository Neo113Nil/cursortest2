package x1;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: x1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1246g {

    /* renamed from: a, reason: collision with root package name */
    public final String f10738a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10739b;

    /* renamed from: c, reason: collision with root package name */
    public HandlerThread f10740c;

    /* renamed from: d, reason: collision with root package name */
    public Handler f10741d;

    /* renamed from: e, reason: collision with root package name */
    public A1.a f10742e;
    public C1245f f;

    public C1246g(String str, int i3) {
        this.f10738a = str;
        this.f10739b = i3;
    }

    public final synchronized void a(A1.a aVar) {
        HandlerThread handlerThread = new HandlerThread(this.f10738a, this.f10739b);
        this.f10740c = handlerThread;
        handlerThread.start();
        this.f10741d = new Handler(this.f10740c.getLooper());
        this.f10742e = aVar;
    }
}
