package defpackage;

import defpackage.aa2;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ga2 extends j61 {
    public final fs t;

    public ga2(fs fsVar) {
        this.t = fsVar;
    }

    @Override // defpackage.j61
    public final boolean r() {
        return false;
    }

    @Override // defpackage.j61
    public final void s(Throwable th) {
        aa2.a aVar = aa2.m;
        this.t.resumeWith(Unit.a);
    }
}
