package b;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;

/* renamed from: b.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297A implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f5256a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f5257b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0422a f5258c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0422a f5259d;

    public C0297A(InterfaceC0424c interfaceC0424c, InterfaceC0424c interfaceC0424c2, InterfaceC0422a interfaceC0422a, InterfaceC0422a interfaceC0422a2) {
        this.f5256a = interfaceC0424c;
        this.f5257b = interfaceC0424c2;
        this.f5258c = interfaceC0422a;
        this.f5259d = interfaceC0422a2;
    }

    public final void onBackCancelled() {
        this.f5259d.b();
    }

    public final void onBackInvoked() {
        this.f5258c.b();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        f2.j.f(backEvent, "backEvent");
        this.f5257b.n(new C0306b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        f2.j.f(backEvent, "backEvent");
        this.f5256a.n(new C0306b(backEvent));
    }
}
