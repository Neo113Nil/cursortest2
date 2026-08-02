package defpackage;

import android.os.Bundle;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dai extends dae {
    public final cme a;

    public dai(cme cmeVar) {
        this.a = cmeVar;
    }

    @Override // defpackage.dae
    public final void b(int i, Bundle bundle) {
        if (i != 0) {
            if (Log.isLoggable("PeopleClient", 5)) {
                Log.w("PeopleClient", "Non-success data changed callback received.");
            }
        } else {
            cme cmeVar = this.a;
            bundle.getString("account");
            bundle.getString("pagegaiaid");
            bundle.getInt("scope");
            cmeVar.d(new dah(0));
        }
    }
}
