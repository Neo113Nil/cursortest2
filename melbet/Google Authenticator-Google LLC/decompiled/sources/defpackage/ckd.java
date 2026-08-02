package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckd extends cri {
    public static final Parcelable.Creator CREATOR = new aqr(19);
    public final List a;

    public ckd(List list) {
        this.a = DesugarCollections.unmodifiableList(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ckd) {
            return this.a.equals(((ckd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "BatchedLogErrorParcelable[LogErrors: " + this.a + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int q = oy.q(parcel, 20293);
        oy.M(parcel, 1, list);
        oy.r(parcel, q);
    }
}
