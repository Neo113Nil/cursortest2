package a;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class w implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W0.l f937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W0.l f938b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W0.a f939c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W0.a f940d;

    public w(W0.l lVar, W0.l lVar2, W0.a aVar, W0.a aVar2) {
        this.f937a = lVar;
        this.f938b = lVar2;
        this.f939c = aVar;
        this.f940d = aVar2;
    }

    public final void onBackCancelled() {
        this.f940d.a();
    }

    public final void onBackInvoked() {
        this.f939c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        X0.f.e(backEvent, "backEvent");
        this.f938b.c(new C0041b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        X0.f.e(backEvent, "backEvent");
        this.f937a.c(new C0041b(backEvent));
    }
}
