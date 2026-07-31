package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import x5.InterfaceC0732a;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class q implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0743l f3210a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0743l f3211b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0732a f3212c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0732a f3213d;

    public q(InterfaceC0743l interfaceC0743l, InterfaceC0743l interfaceC0743l2, InterfaceC0732a interfaceC0732a, InterfaceC0732a interfaceC0732a2) {
        this.f3210a = interfaceC0743l;
        this.f3211b = interfaceC0743l2;
        this.f3212c = interfaceC0732a;
        this.f3213d = interfaceC0732a2;
    }

    public final void onBackCancelled() {
        this.f3213d.invoke();
    }

    public final void onBackInvoked() {
        this.f3212c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        this.f3211b.invoke(new b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        this.f3210a.invoke(new b(backEvent));
    }
}
