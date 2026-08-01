package a;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import f1.InterfaceC0099a;

/* loaded from: classes.dex */
public final class s implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1.l f1287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.l f1288b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0099a f1289c;
    public final /* synthetic */ InterfaceC0099a d;

    public s(f1.l lVar, f1.l lVar2, InterfaceC0099a interfaceC0099a, InterfaceC0099a interfaceC0099a2) {
        this.f1287a = lVar;
        this.f1288b = lVar2;
        this.f1289c = interfaceC0099a;
        this.d = interfaceC0099a2;
    }

    public final void onBackCancelled() {
        this.d.a();
    }

    public final void onBackInvoked() {
        this.f1289c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        g1.d.e(backEvent, "backEvent");
        this.f1288b.c(new b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        g1.d.e(backEvent, "backEvent");
        this.f1287a.c(new b(backEvent));
    }
}
