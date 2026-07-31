package o2;

import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes3.dex */
final class M0 extends C0 {

    /* renamed from: f, reason: collision with root package name */
    private final C3345o f42016f;

    public M0(C3345o c3345o) {
        this.f42016f = c3345o;
    }

    @Override // o2.InterfaceC3353s0
    public void a(Throwable th) {
        Object c02 = u().c0();
        if (c02 instanceof C3308B) {
            C3345o c3345o = this.f42016f;
            Result.Companion companion = Result.Companion;
            c3345o.resumeWith(Result.m243constructorimpl(ResultKt.createFailure(((C3308B) c02).f41962a)));
        } else {
            C3345o c3345o2 = this.f42016f;
            Result.Companion companion2 = Result.Companion;
            c3345o2.resumeWith(Result.m243constructorimpl(E0.h(c02)));
        }
    }
}
