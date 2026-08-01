package b;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import i1.InterfaceC0181a;
import i1.InterfaceC0192l;

/* loaded from: classes.dex */
public final class r implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0192l f2202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0192l f2203b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0181a f2204c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0181a f2205d;

    public r(InterfaceC0192l interfaceC0192l, InterfaceC0192l interfaceC0192l2, InterfaceC0181a interfaceC0181a, InterfaceC0181a interfaceC0181a2) {
        this.f2202a = interfaceC0192l;
        this.f2203b = interfaceC0192l2;
        this.f2204c = interfaceC0181a;
        this.f2205d = interfaceC0181a2;
    }

    public final void onBackCancelled() {
        this.f2205d.c();
    }

    public final void onBackInvoked() {
        this.f2204c.c();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        j1.h.e(backEvent, "backEvent");
        this.f2203b.g(new C0089b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        j1.h.e(backEvent, "backEvent");
        this.f2202a.g(new C0089b(backEvent));
    }
}
