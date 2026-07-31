package b;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class B implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y1.c f4121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y1.c f4122b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y1.a f4123c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y1.a f4124d;

    public B(Y1.c cVar, Y1.c cVar2, Y1.a aVar, Y1.a aVar2) {
        this.f4121a = cVar;
        this.f4122b = cVar2;
        this.f4123c = aVar;
        this.f4124d = aVar2;
    }

    public final void onBackCancelled() {
        this.f4124d.b();
    }

    public final void onBackInvoked() {
        this.f4123c.b();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        Z1.i.f(backEvent, "backEvent");
        this.f4122b.j(new C0242b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        Z1.i.f(backEvent, "backEvent");
        this.f4121a.j(new C0242b(backEvent));
    }
}
