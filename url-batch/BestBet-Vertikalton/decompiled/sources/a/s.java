package a;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import j1.InterfaceC0170a;

/* loaded from: classes.dex */
public final class s implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j1.l f1606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1.l f1607b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0170a f1608c;
    public final /* synthetic */ InterfaceC0170a d;

    public s(j1.l lVar, j1.l lVar2, InterfaceC0170a interfaceC0170a, InterfaceC0170a interfaceC0170a2) {
        this.f1606a = lVar;
        this.f1607b = lVar2;
        this.f1608c = interfaceC0170a;
        this.d = interfaceC0170a2;
    }

    public final void onBackCancelled() {
        this.d.c();
    }

    public final void onBackInvoked() {
        this.f1608c.c();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        k1.e.e(backEvent, "backEvent");
        this.f1607b.g(new C0056b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        k1.e.e(backEvent, "backEvent");
        this.f1606a.g(new C0056b(backEvent));
    }
}
