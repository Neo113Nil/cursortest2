package ge;

import kotlin.Unit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q0 extends s0 {

    /* renamed from: i, reason: collision with root package name */
    public final h f4395i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u0 f4396r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(u0 u0Var, long j, h hVar) {
        super(j);
        this.f4396r = u0Var;
        this.f4395i = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4395i.B(this.f4396r, Unit.f5554a);
    }

    @Override // ge.s0
    public final String toString() {
        return super.toString() + this.f4395i;
    }
}
