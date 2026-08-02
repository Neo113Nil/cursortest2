package b;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import o3.InterfaceC1328a;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class v implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1339l f5245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1339l f5246b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1328a f5247c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1328a f5248d;

    public v(InterfaceC1339l interfaceC1339l, InterfaceC1339l interfaceC1339l2, InterfaceC1328a interfaceC1328a, InterfaceC1328a interfaceC1328a2) {
        this.f5245a = interfaceC1339l;
        this.f5246b = interfaceC1339l2;
        this.f5247c = interfaceC1328a;
        this.f5248d = interfaceC1328a2;
    }

    public final void onBackCancelled() {
        this.f5248d.invoke();
    }

    public final void onBackInvoked() {
        this.f5247c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        this.f5246b.invoke(new C0241b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        this.f5245a.invoke(new C0241b(backEvent));
    }
}
