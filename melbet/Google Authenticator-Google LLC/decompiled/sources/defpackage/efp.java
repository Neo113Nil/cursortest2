package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class efp extends dja {
    final /* synthetic */ View a;
    final /* synthetic */ int b;
    public final /* synthetic */ efq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efp(efq efqVar, View view, int i) {
        super(null);
        this.a = view;
        this.b = i;
        this.d = efqVar;
    }

    @Override // defpackage.dja
    public final void j(Object obj) {
        View view = this.a;
        view.post(new dpi(this, view, this.b, obj, 3));
    }
}
