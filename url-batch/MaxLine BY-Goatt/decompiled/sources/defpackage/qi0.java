package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qi0 extends si0 {
    public final fs o;
    public final /* synthetic */ ui0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi0(ui0 ui0Var, long j, fs fsVar) {
        super(j);
        this.p = ui0Var;
        this.o = fsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.o.E(this.p, Unit.a);
    }

    @Override // defpackage.si0
    public final String toString() {
        return super.toString() + this.o;
    }
}
