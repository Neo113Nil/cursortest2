package y0;

import kotlin.jvm.functions.Function1;
import r0.n0;

/* renamed from: y0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1319c extends S.n implements n0 {

    /* renamed from: t, reason: collision with root package name */
    public boolean f11539t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f11540u;

    /* renamed from: v, reason: collision with root package name */
    public Function1 f11541v;

    public C1319c(boolean z4, boolean z5, Function1 function1) {
        this.f11539t = z4;
        this.f11540u = z5;
        this.f11541v = function1;
    }

    @Override // r0.n0
    public final boolean T() {
        return this.f11540u;
    }

    @Override // r0.n0
    public final boolean X() {
        return this.f11539t;
    }

    @Override // r0.n0
    public final void p(i iVar) {
        this.f11541v.invoke(iVar);
    }
}
