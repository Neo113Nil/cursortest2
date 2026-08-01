package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e0 implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f93a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f94b;
    public final /* synthetic */ c0 c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f95d;

    public e0(b0 b0Var, b0 b0Var2, c0 c0Var, c0 c0Var2) {
        this.f93a = b0Var;
        this.f94b = b0Var2;
        this.c = c0Var;
        this.f95d = c0Var2;
    }

    public final void onBackCancelled() {
        this.f95d.a();
    }

    public final void onBackInvoked() {
        this.c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        u2.c.e(backEvent, "backEvent");
        this.f94b.b(new b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        u2.c.e(backEvent, "backEvent");
        this.f93a.b(new b(backEvent));
    }
}
