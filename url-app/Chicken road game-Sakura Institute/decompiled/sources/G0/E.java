package G0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final z f3025a;

    /* renamed from: b, reason: collision with root package name */
    public final t f3026b;

    public E(z zVar, t tVar) {
        this.f3025a = zVar;
        this.f3026b = tVar;
    }

    public final void a(y yVar, y yVar2) {
        if (Intrinsics.a((E) this.f3025a.f3097b.get(), this)) {
            this.f3026b.h(yVar, yVar2);
        }
    }
}
