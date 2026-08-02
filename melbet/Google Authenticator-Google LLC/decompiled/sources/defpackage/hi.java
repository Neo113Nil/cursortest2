package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hi extends gn {
    final /* synthetic */ hk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi(hk hkVar, Context context, gd gdVar, View view) {
        super(context, gdVar, view, true, R.attr.actionOverflowMenuStyle);
        this.d = hkVar;
        this.b = 8388613;
        e(hkVar.n);
    }

    @Override // defpackage.gn
    protected final void c() {
        hk hkVar = this.d;
        gd gdVar = hkVar.c;
        if (gdVar != null) {
            gdVar.i(true);
        }
        hkVar.j = null;
        super.c();
    }
}
