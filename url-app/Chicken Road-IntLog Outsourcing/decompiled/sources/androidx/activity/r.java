package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import t4.InterfaceC1430a;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class r implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1441l f4069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1441l f4070b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1430a f4071c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1430a f4072d;

    public r(InterfaceC1441l interfaceC1441l, InterfaceC1441l interfaceC1441l2, InterfaceC1430a interfaceC1430a, InterfaceC1430a interfaceC1430a2) {
        this.f4069a = interfaceC1441l;
        this.f4070b = interfaceC1441l2;
        this.f4071c = interfaceC1430a;
        this.f4072d = interfaceC1430a2;
    }

    public final void onBackCancelled() {
        this.f4072d.invoke();
    }

    public final void onBackInvoked() {
        this.f4071c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        this.f4070b.invoke(new b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        this.f4069a.invoke(new b(backEvent));
    }
}
