package b;

import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class y implements InterfaceC0242c {

    /* renamed from: a, reason: collision with root package name */
    public final q f5254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0238A f5255b;

    public y(C0238A c0238a, q onBackPressedCallback) {
        kotlin.jvm.internal.i.e(onBackPressedCallback, "onBackPressedCallback");
        this.f5255b = c0238a;
        this.f5254a = onBackPressedCallback;
    }

    @Override // b.InterfaceC0242c
    public final void cancel() {
        C0238A c0238a = this.f5255b;
        d3.f fVar = c0238a.f5206b;
        q qVar = this.f5254a;
        fVar.remove(qVar);
        if (kotlin.jvm.internal.i.a(c0238a.f5207c, qVar)) {
            qVar.handleOnBackCancelled();
            c0238a.f5207c = null;
        }
        qVar.removeCancellable(this);
        InterfaceC1328a enabledChangedCallback$activity_release = qVar.getEnabledChangedCallback$activity_release();
        if (enabledChangedCallback$activity_release != null) {
            enabledChangedCallback$activity_release.invoke();
        }
        qVar.setEnabledChangedCallback$activity_release(null);
    }
}
