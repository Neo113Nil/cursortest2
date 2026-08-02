package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class amg {
    public final ame a;
    public boolean b;
    public Bundle c;
    public boolean d;
    public boolean e;
    public final qv f;
    public final yi g = new yi(null);
    private final kri h;

    public amg(ame ameVar, kri kriVar) {
        this.a = ameVar;
        this.h = kriVar;
        long[] jArr = qw.a;
        this.f = new qv(6);
        this.e = true;
    }

    public final void a() {
        ame ameVar = this.a;
        if (ameVar.L().c != aek.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.h.a();
        ameVar.L().a(new na(this, 2));
        this.b = true;
    }
}
