package a;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import c1.InterfaceC0085a;

/* loaded from: classes.dex */
public final class s implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1.l f1202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1.l f1203b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0085a f1204c;
    public final /* synthetic */ InterfaceC0085a d;

    public s(c1.l lVar, c1.l lVar2, InterfaceC0085a interfaceC0085a, InterfaceC0085a interfaceC0085a2) {
        this.f1202a = lVar;
        this.f1203b = lVar2;
        this.f1204c = interfaceC0085a;
        this.d = interfaceC0085a2;
    }

    public final void onBackCancelled() {
        this.d.b();
    }

    public final void onBackInvoked() {
        this.f1204c.b();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        d1.d.e(backEvent, "backEvent");
        this.f1203b.e(new C0058b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        d1.d.e(backEvent, "backEvent");
        this.f1202a.e(new C0058b(backEvent));
    }
}
