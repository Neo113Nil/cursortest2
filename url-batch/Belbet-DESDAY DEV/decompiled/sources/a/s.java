package a;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class s implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W0.l f1085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W0.l f1086b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W0.a f1087c;
    public final /* synthetic */ W0.a d;

    public s(W0.l lVar, W0.l lVar2, W0.a aVar, W0.a aVar2) {
        this.f1085a = lVar;
        this.f1086b = lVar2;
        this.f1087c = aVar;
        this.d = aVar2;
    }

    public final void onBackCancelled() {
        this.d.a();
    }

    public final void onBackInvoked() {
        this.f1087c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        X0.d.e(backEvent, "backEvent");
        this.f1086b.c(new C0055b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        X0.d.e(backEvent, "backEvent");
        this.f1085a.c(new C0055b(backEvent));
    }
}
