package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dup {
    public final View.OnClickListener a;
    public final gzp b;

    public dup(View.OnClickListener onClickListener, gzp gzpVar) {
        this.a = onClickListener;
        this.b = gzpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dup)) {
            return false;
        }
        dup dupVar = (dup) obj;
        return ksp.b(this.a, dupVar.a) && ksp.b(this.b, dupVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 2040732332;
    }

    public final String toString() {
        return "UseWithoutAnAccountData(clickListener=" + this.a + ", availabilityChecker=" + this.b + ")";
    }
}
