package defpackage;

import android.app.Dialog;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aq extends bi {
    final /* synthetic */ bi a;
    final /* synthetic */ ar b;

    public aq(ar arVar, bi biVar) {
        this.b = arVar;
        this.a = biVar;
    }

    @Override // defpackage.bi
    public final View a(int i) {
        bi biVar = this.a;
        if (biVar.b()) {
            return biVar.a(i);
        }
        Dialog dialog = this.b.e;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.bi
    public final boolean b() {
        return this.a.b() || this.b.f;
    }
}
