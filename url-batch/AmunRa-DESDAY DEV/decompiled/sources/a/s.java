package a;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class s implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y0.l f1120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y0.l f1121b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y0.a f1122c;
    public final /* synthetic */ Y0.a d;

    public s(Y0.l lVar, Y0.l lVar2, Y0.a aVar, Y0.a aVar2) {
        this.f1120a = lVar;
        this.f1121b = lVar2;
        this.f1122c = aVar;
        this.d = aVar2;
    }

    public final void onBackCancelled() {
        this.d.a();
    }

    public final void onBackInvoked() {
        this.f1122c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        Z0.d.e(backEvent, "backEvent");
        this.f1121b.c(new C0055b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        Z0.d.e(backEvent, "backEvent");
        this.f1120a.c(new C0055b(backEvent));
    }
}
