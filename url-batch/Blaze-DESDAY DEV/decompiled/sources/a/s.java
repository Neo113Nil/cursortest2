package a;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import f1.InterfaceC0090a;

/* loaded from: classes.dex */
public final class s implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1.l f1232a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.l f1233b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0090a f1234c;
    public final /* synthetic */ InterfaceC0090a d;

    public s(f1.l lVar, f1.l lVar2, InterfaceC0090a interfaceC0090a, InterfaceC0090a interfaceC0090a2) {
        this.f1232a = lVar;
        this.f1233b = lVar2;
        this.f1234c = interfaceC0090a;
        this.d = interfaceC0090a2;
    }

    public final void onBackCancelled() {
        this.d.b();
    }

    public final void onBackInvoked() {
        this.f1234c.b();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        g1.d.e(backEvent, "backEvent");
        this.f1233b.e(new C0058b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        g1.d.e(backEvent, "backEvent");
        this.f1232a.e(new C0058b(backEvent));
    }
}
