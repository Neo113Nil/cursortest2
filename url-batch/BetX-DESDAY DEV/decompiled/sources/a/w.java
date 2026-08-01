package a;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class w implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W0.l f938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W0.l f939b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W0.a f940c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W0.a f941d;

    public w(W0.l lVar, W0.l lVar2, W0.a aVar, W0.a aVar2) {
        this.f938a = lVar;
        this.f939b = lVar2;
        this.f940c = aVar;
        this.f941d = aVar2;
    }

    public final void onBackCancelled() {
        this.f941d.a();
    }

    public final void onBackInvoked() {
        this.f940c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        X0.f.e(backEvent, "backEvent");
        this.f939b.c(new C0041b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        X0.f.e(backEvent, "backEvent");
        this.f938a.c(new C0041b(backEvent));
    }
}
