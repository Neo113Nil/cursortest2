package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class fty {
    private final int a;

    public fty(int i) {
        this.a = i;
    }

    public abstract Bundle a();

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt("state_account_state_type", this.a - 1);
        return bundle;
    }
}
