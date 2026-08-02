package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hf extends gn {
    final /* synthetic */ hk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf(hk hkVar, Context context, gw gwVar, View view) {
        super(context, gwVar, view, false, R.attr.actionOverflowMenuStyle);
        this.d = hkVar;
        if (!gwVar.m.o()) {
            View view2 = hkVar.h;
            this.a = view2 == null ? (View) hkVar.f : view2;
        }
        e(hkVar.n);
    }

    @Override // defpackage.gn
    protected final void c() {
        hk hkVar = this.d;
        hkVar.k = null;
        hkVar.l = 0;
        super.c();
    }
}
