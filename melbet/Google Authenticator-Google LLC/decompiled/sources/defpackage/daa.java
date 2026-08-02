package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.callingcard.CallingCardIdentifier;
import com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class daa extends cri {
    public static final Parcelable.Creator CREATOR = new ctt(16);
    public final CallingCardRequestStatus a;
    public final CallingCardIdentifier b;

    public daa(CallingCardRequestStatus callingCardRequestStatus, CallingCardIdentifier callingCardIdentifier) {
        this.a = callingCardRequestStatus;
        this.b = callingCardIdentifier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof daa) {
            daa daaVar = (daa) obj;
            if (Objects.equals(this.a, daaVar.a) && Objects.equals(this.b, daaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CallingCardRequestStatus callingCardRequestStatus = this.a;
        int q = oy.q(parcel, 20293);
        int i2 = i | 1;
        oy.H(parcel, 1, callingCardRequestStatus, i2);
        oy.H(parcel, 2, this.b, i2);
        oy.r(parcel, q);
    }
}
