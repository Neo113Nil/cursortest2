package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class D implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f4531a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f4532b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B f4533c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B f4534d;

    public D(A a9, A a10, B b9, B b10) {
        this.f4531a = a9;
        this.f4532b = a10;
        this.f4533c = b9;
        this.f4534d = b10;
    }

    public final void onBackCancelled() {
        this.f4534d.invoke();
    }

    public final void onBackInvoked() {
        this.f4533c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.h.e(backEvent, "backEvent");
        this.f4532b.invoke(new C0460b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.h.e(backEvent, "backEvent");
        this.f4531a.invoke(new C0460b(backEvent));
    }
}
