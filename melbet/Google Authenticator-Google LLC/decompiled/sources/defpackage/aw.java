package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aw extends bb {
    final /* synthetic */ bd a;

    public aw(bd bdVar) {
        this.a = bdVar;
    }

    @Override // defpackage.bb
    public final void a() {
        bd bdVar = this.a;
        bdVar.ai.h();
        afx.c(bdVar);
        Bundle bundle = bdVar.i;
        bdVar.ai.i(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
