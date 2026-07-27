package p0;

import kotlin.jvm.functions.Function1;
import r0.InterfaceC1080v;

/* renamed from: p0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0951L extends S.n implements InterfaceC1080v {

    /* renamed from: t, reason: collision with root package name */
    public Function1 f9001t;

    /* renamed from: u, reason: collision with root package name */
    public long f9002u;

    @Override // S.n
    public final boolean q0() {
        return true;
    }

    @Override // r0.InterfaceC1080v
    public final void z(long j4) {
        if (M0.j.a(this.f9002u, j4)) {
            return;
        }
        this.f9001t.invoke(new M0.j(j4));
        this.f9002u = j4;
    }
}
