package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class fw extends hw {
    public final tf g;
    public final /* synthetic */ jw h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(jw jwVar, long j, tf tfVar) {
        super(j);
        this.h = jwVar;
        this.g = tfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.H(this.h, Unit.a);
    }

    @Override // defpackage.hw
    public final String toString() {
        return super.toString() + this.g;
    }
}
