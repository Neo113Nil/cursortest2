package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends S.n implements c {

    /* renamed from: t, reason: collision with root package name */
    public Function1 f4310t;

    /* renamed from: u, reason: collision with root package name */
    public s f4311u;

    @Override // X.c
    public final void Q(s sVar) {
        if (Intrinsics.a(this.f4311u, sVar)) {
            return;
        }
        this.f4311u = sVar;
        this.f4310t.invoke(sVar);
    }
}
