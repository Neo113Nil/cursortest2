package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cpn extends cpg {
    final /* synthetic */ cpo g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpn(cpo cpoVar, int i, Bundle bundle) {
        super(cpoVar, i, bundle);
        this.g = cpoVar;
    }

    @Override // defpackage.cpg
    protected final void a(clg clgVar) {
        this.g.f.a(clgVar);
        System.currentTimeMillis();
    }

    @Override // defpackage.cpg
    protected final boolean b() {
        this.g.f.a(clg.a);
        return true;
    }
}
