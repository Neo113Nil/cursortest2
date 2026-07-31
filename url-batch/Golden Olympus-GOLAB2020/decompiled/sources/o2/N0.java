package o2;

import kotlin.Result;
import kotlin.Unit;

/* loaded from: classes3.dex */
final class N0 extends C0 {

    /* renamed from: f, reason: collision with root package name */
    private final kotlin.coroutines.d f42017f;

    public N0(kotlin.coroutines.d dVar) {
        this.f42017f = dVar;
    }

    @Override // o2.InterfaceC3353s0
    public void a(Throwable th) {
        kotlin.coroutines.d dVar = this.f42017f;
        Result.Companion companion = Result.Companion;
        dVar.resumeWith(Result.m243constructorimpl(Unit.f41027a));
    }
}
