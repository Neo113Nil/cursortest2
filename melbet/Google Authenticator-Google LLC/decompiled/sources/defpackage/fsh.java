package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fsh {
    public Bundle a;
    public boolean c;
    public int d = 3;
    public gzp b = gyf.a;

    public final boolean a() {
        int i = this.d;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        boolean z = false;
        if (i2 == 1) {
            return false;
        }
        if (i2 != 2) {
            throw new koj();
        }
        if (i != 3) {
            throw new IllegalStateException("Check failed.");
        }
        Bundle bundle = this.a;
        if (bundle == null ? !(this.b.f() && (!((Boolean) this.b.b()).booleanValue() || this.c)) : !(!bundle.getBoolean("tiktok_accounts_disabled") || this.c)) {
            z = true;
        }
        this.d = z ? 1 : 2;
        return z;
    }
}
