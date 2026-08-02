package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class goz extends jya {
    final /* synthetic */ gpa a;
    final /* synthetic */ iee b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public goz(gpa gpaVar, iws iwsVar, iee ieeVar) {
        super(iwsVar);
        this.b = ieeVar;
        this.a = gpaVar;
    }

    @Override // defpackage.jyb, defpackage.iws
    public final void a(iwr iwrVar, kaa kaaVar) {
        this.a.a = SystemClock.elapsedRealtime();
        super.a(new goy(this, iwrVar, this.b), kaaVar);
    }
}
