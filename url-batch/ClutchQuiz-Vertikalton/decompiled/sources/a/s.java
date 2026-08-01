package a;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class s implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1.l f1226a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.l f1227b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.a f1228c;
    public final /* synthetic */ f1.a d;

    public s(f1.l lVar, f1.l lVar2, f1.a aVar, f1.a aVar2) {
        this.f1226a = lVar;
        this.f1227b = lVar2;
        this.f1228c = aVar;
        this.d = aVar2;
    }

    public final void onBackCancelled() {
        this.d.c();
    }

    public final void onBackInvoked() {
        this.f1228c.c();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        g1.f.e(backEvent, "backEvent");
        this.f1227b.g(new C0055b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        g1.f.e(backEvent, "backEvent");
        this.f1226a.g(new C0055b(backEvent));
    }
}
