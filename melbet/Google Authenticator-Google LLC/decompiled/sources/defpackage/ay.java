package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ay extends bi {
    final /* synthetic */ bd a;

    public ay(bd bdVar) {
        this.a = bdVar;
    }

    @Override // defpackage.bi
    public final View a(int i) {
        bd bdVar = this.a;
        View view = bdVar.R;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException(a.ab(bdVar, "Fragment ", " does not have a view"));
    }

    @Override // defpackage.bi
    public final boolean b() {
        return this.a.R != null;
    }
}
