package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chs extends cri {
    public static final Parcelable.Creator CREATOR = new aqr(6);
    public final cid a;
    public final chv b;

    public chs(cid cidVar, chv chvVar) {
        this.a = cidVar;
        this.b = chvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chs)) {
            return false;
        }
        chs chsVar = (chs) obj;
        return this.a.equals(chsVar.a) && this.b.equals(chsVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return String.format("AccountWithAppRestrictionState{googleAccount=%s, appRestrictionState=%s}", this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cid cidVar = this.a;
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 1, cidVar, i);
        oy.H(parcel, 2, this.b, i);
        oy.r(parcel, q);
    }
}
