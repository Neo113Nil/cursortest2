package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.apps.tiktok.account.ui.onegoogle.expresssignin.selector.ExpressSignInActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fze implements ftj, ftg {
    private final Context a;

    public fze(Context context) {
        this.a = context;
    }

    @Override // defpackage.ftg
    public final hvi a(ftk ftkVar) {
        return hnu.aJ(new Intent(this.a, (Class<?>) ExpressSignInActivity.class));
    }
}
