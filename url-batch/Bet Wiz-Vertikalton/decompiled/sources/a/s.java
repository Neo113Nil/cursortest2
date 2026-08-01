package a;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import d1.InterfaceC0081a;

/* loaded from: classes.dex */
public final class s implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1.l f1189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1.l f1190b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0081a f1191c;
    public final /* synthetic */ InterfaceC0081a d;

    public s(d1.l lVar, d1.l lVar2, InterfaceC0081a interfaceC0081a, InterfaceC0081a interfaceC0081a2) {
        this.f1189a = lVar;
        this.f1190b = lVar2;
        this.f1191c = interfaceC0081a;
        this.d = interfaceC0081a2;
    }

    public final void onBackCancelled() {
        this.d.a();
    }

    public final void onBackInvoked() {
        this.f1191c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        e1.d.e(backEvent, "backEvent");
        this.f1190b.c(new C0054b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        e1.d.e(backEvent, "backEvent");
        this.f1189a.c(new C0054b(backEvent));
    }
}
