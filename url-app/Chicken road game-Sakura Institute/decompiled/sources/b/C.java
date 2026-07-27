package b;

import kotlin.jvm.internal.Intrinsics;
import z2.C1433q;

/* loaded from: classes.dex */
public final class C implements InterfaceC0488c {

    /* renamed from: d, reason: collision with root package name */
    public final v f5512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D f5513e;

    public C(D d4, v onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f5513e = d4;
        this.f5512d = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [M2.m, kotlin.jvm.functions.Function0] */
    @Override // b.InterfaceC0488c
    public final void cancel() {
        D d4 = this.f5513e;
        C1433q c1433q = d4.f5515b;
        v vVar = this.f5512d;
        c1433q.remove(vVar);
        if (Intrinsics.a(d4.f5516c, vVar)) {
            vVar.a();
            d4.f5516c = null;
        }
        vVar.getClass();
        Intrinsics.checkNotNullParameter(this, "cancellable");
        vVar.f5587b.remove(this);
        ?? r02 = vVar.f5588c;
        if (r02 != 0) {
            r02.invoke();
        }
        vVar.f5588c = null;
    }
}
