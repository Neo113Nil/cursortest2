package c;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class r implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l2.l f2606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l2.l f2607b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l2.a f2608c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l2.a f2609d;

    public r(l2.l lVar, l2.l lVar2, l2.a aVar, l2.a aVar2) {
        this.f2606a = lVar;
        this.f2607b = lVar2;
        this.f2608c = aVar;
        this.f2609d = aVar2;
    }

    public final void onBackCancelled() {
        this.f2609d.invoke();
    }

    public final void onBackInvoked() {
        this.f2608c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        this.f2607b.invoke(new C0197b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        this.f2606a.invoke(new C0197b(backEvent));
    }
}
