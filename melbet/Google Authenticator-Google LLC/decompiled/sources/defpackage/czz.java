package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class czz extends cri {
    public static final Parcelable.Creator CREATOR = new ctt(14);
    public final czx a;
    public final czy b;

    public czz(czx czxVar, czy czyVar) {
        this.a = czxVar;
        this.b = czyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof czz) {
            czz czzVar = (czz) obj;
            if (Objects.equals(this.a, czzVar.a) && Objects.equals(this.b, czzVar.b)) {
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
        czx czxVar = this.a;
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 1, czxVar, i);
        oy.H(parcel, 2, this.b, i);
        oy.r(parcel, q);
    }
}
