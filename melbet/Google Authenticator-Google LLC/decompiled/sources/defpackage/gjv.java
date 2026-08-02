package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gjv implements grn {
    final /* synthetic */ gka a;
    private final /* synthetic */ int b;

    public gjv(gka gkaVar, int i) {
        this.b = i;
        this.a = gkaVar;
    }

    @Override // defpackage.grn
    public final hvi a(hvi hviVar, Duration duration) {
        if (this.b != 0) {
            duration.getClass();
            return hve.a;
        }
        duration.getClass();
        return hve.a;
    }

    @Override // defpackage.grn
    public final hvi b() {
        int i = this.b;
        gka gkaVar = this.a;
        return i != 0 ? gkaVar.a(1, "run") : gkaVar.a(2, "run");
    }
}
