package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ftw extends fty {
    public final int a;
    public final ful b;

    public ftw(int i, ful fulVar) {
        super(3);
        this.a = i;
        this.b = fulVar;
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        if (ksp.b(fulVar, ful.a)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // defpackage.fty
    public final Bundle a() {
        Bundle b = b();
        b.putInt("state_account_id", this.a);
        imi.d(b, "state_account_info", this.b);
        return b;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof ftw) && ((ftw) obj).a == this.a;
    }
}
