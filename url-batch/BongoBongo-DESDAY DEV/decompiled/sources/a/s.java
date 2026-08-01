package a;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import g1.InterfaceC0110a;

/* loaded from: classes.dex */
public final class s implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1.l f1278a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.l f1279b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0110a f1280c;
    public final /* synthetic */ InterfaceC0110a d;

    public s(g1.l lVar, g1.l lVar2, InterfaceC0110a interfaceC0110a, InterfaceC0110a interfaceC0110a2) {
        this.f1278a = lVar;
        this.f1279b = lVar2;
        this.f1280c = interfaceC0110a;
        this.d = interfaceC0110a2;
    }

    public final void onBackCancelled() {
        this.d.b();
    }

    public final void onBackInvoked() {
        this.f1280c.b();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        h1.d.e(backEvent, "backEvent");
        this.f1279b.e(new C0057b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        h1.d.e(backEvent, "backEvent");
        this.f1278a.e(new C0057b(backEvent));
    }
}
