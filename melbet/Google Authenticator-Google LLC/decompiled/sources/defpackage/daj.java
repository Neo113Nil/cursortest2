package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class daj extends dae {
    private final cnr a;

    public daj(cnr cnrVar) {
        this.a = cnrVar;
    }

    @Override // defpackage.dae
    public final void c(int i, Bundle bundle, DataHolder dataHolder) {
        this.a.i(new dal(dan.J(i, bundle), dataHolder == null ? null : new cpe(dataHolder)));
    }
}
