package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fwh implements bbu {
    final /* synthetic */ eex a;

    public fwh(eex eexVar) {
        this.a = eexVar;
    }

    @Override // defpackage.bbu
    public final Class a() {
        return Bitmap.class;
    }

    @Override // defpackage.bbu
    public final void f(azw azwVar, bbt bbtVar) {
        bbtVar.b(BitmapFactory.decodeResource(((Context) this.a.a).getResources(), R.drawable.account_switcher_blue));
    }

    @Override // defpackage.bbu
    public final int g() {
        return 1;
    }

    @Override // defpackage.bbu
    public final void bo() {
    }

    @Override // defpackage.bbu
    public final void d() {
    }
}
