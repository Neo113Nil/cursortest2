package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus;
import com.google.android.gms.people.cpg.callingcard.v2.Identifier;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dac extends cri {
    public static final Parcelable.Creator CREATOR = new ctt(20);
    public final CallingCardRequestStatus a;
    public final Identifier b;

    public dac(CallingCardRequestStatus callingCardRequestStatus, Identifier identifier) {
        this.a = callingCardRequestStatus;
        this.b = identifier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dac) {
            dac dacVar = (dac) obj;
            if (Objects.equals(this.a, dacVar.a) && Objects.equals(this.b, dacVar.b)) {
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
