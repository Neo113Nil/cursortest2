package a;

import a1.InterfaceC0058a;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class s implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1.l f1159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1.l f1160b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0058a f1161c;
    public final /* synthetic */ InterfaceC0058a d;

    public s(a1.l lVar, a1.l lVar2, InterfaceC0058a interfaceC0058a, InterfaceC0058a interfaceC0058a2) {
        this.f1159a = lVar;
        this.f1160b = lVar2;
        this.f1161c = interfaceC0058a;
        this.d = interfaceC0058a2;
    }

    public final void onBackCancelled() {
        this.d.a();
    }

    public final void onBackInvoked() {
        this.f1161c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        b1.d.e(backEvent, "backEvent");
        this.f1160b.c(new C0054b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        b1.d.e(backEvent, "backEvent");
        this.f1159a.c(new C0054b(backEvent));
    }
}
