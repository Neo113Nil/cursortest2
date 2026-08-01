package a;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class s implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W0.l f1082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W0.l f1083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W0.a f1084c;
    public final /* synthetic */ W0.a d;

    public s(W0.l lVar, W0.l lVar2, W0.a aVar, W0.a aVar2) {
        this.f1082a = lVar;
        this.f1083b = lVar2;
        this.f1084c = aVar;
        this.d = aVar2;
    }

    public final void onBackCancelled() {
        this.d.a();
    }

    public final void onBackInvoked() {
        this.f1084c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        X0.e.e(backEvent, "backEvent");
        this.f1083b.c(new C0055b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        X0.e.e(backEvent, "backEvent");
        this.f1082a.c(new C0055b(backEvent));
    }
}
