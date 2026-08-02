package com.google.android.gms.people.cpg.callingcard;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.cri;
import defpackage.ctt;
import defpackage.czz;
import defpackage.oy;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GetCallingCardResponse extends cri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ctt(17);
    public final CallingCardRequestStatus a;
    public final int b;
    public final Uri c;
    public final String d;
    public final czz e;

    public GetCallingCardResponse(CallingCardRequestStatus callingCardRequestStatus, int i, Uri uri, String str, czz czzVar) {
        this.a = callingCardRequestStatus;
        this.b = i;
        this.c = uri;
        this.d = str;
        this.e = czzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetCallingCardResponse) {
            GetCallingCardResponse getCallingCardResponse = (GetCallingCardResponse) obj;
            if (Objects.equals(this.a, getCallingCardResponse.a) && this.b == getCallingCardResponse.b && Objects.equals(this.c, getCallingCardResponse.c) && Objects.equals(this.d, getCallingCardResponse.d) && Objects.equals(this.e, getCallingCardResponse.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CallingCardRequestStatus callingCardRequestStatus = this.a;
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 1, callingCardRequestStatus, i);
        oy.v(parcel, 2, this.b);
        oy.H(parcel, 3, this.c, i);
        oy.I(parcel, 4, this.d);
        oy.H(parcel, 5, this.e, i);
        oy.r(parcel, q);
    }
}
