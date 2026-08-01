package a;

import a1.InterfaceC0059a;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class s implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1.l f1145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1.l f1146b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0059a f1147c;
    public final /* synthetic */ InterfaceC0059a d;

    public s(a1.l lVar, a1.l lVar2, InterfaceC0059a interfaceC0059a, InterfaceC0059a interfaceC0059a2) {
        this.f1145a = lVar;
        this.f1146b = lVar2;
        this.f1147c = interfaceC0059a;
        this.d = interfaceC0059a2;
    }

    public final void onBackCancelled() {
        this.d.a();
    }

    public final void onBackInvoked() {
        this.f1147c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        b1.d.e(backEvent, "backEvent");
        this.f1146b.c(new C0055b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        b1.d.e(backEvent, "backEvent");
        this.f1145a.c(new C0055b(backEvent));
    }
}
