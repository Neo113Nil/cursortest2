package b;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d0 implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q6.c f1143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q6.c f1144b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q6.a f1145c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q6.a f1146d;

    public d0(q6.c cVar, q6.c cVar2, q6.a aVar, q6.a aVar2) {
        this.f1143a = cVar;
        this.f1144b = cVar2;
        this.f1145c = aVar;
        this.f1146d = aVar2;
    }

    public final void onBackCancelled() {
        this.f1146d.a();
    }

    public final void onBackInvoked() {
        this.f1145c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        r6.k.f(backEvent, "backEvent");
        this.f1144b.f(new b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        r6.k.f(backEvent, "backEvent");
        this.f1143a.f(new b(backEvent));
    }
}
