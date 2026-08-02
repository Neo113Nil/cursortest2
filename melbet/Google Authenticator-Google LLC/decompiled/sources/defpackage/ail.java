package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ail {
    final int a;
    final int b;
    final String c;

    public ail(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.z;
        this.b = preference.A;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ail)) {
            return false;
        }
        ail ailVar = (ail) obj;
        return this.a == ailVar.a && this.b == ailVar.b && TextUtils.equals(this.c, ailVar.c);
    }

    public final int hashCode() {
        return ((((this.a + 527) * 31) + this.b) * 31) + this.c.hashCode();
    }
}
