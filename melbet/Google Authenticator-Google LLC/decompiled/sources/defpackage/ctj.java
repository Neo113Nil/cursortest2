package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ctj extends cri {
    public static final ctk CREATOR = new ctk(0);
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;
    final Bundle f;

    public ctj(String str, String str2, String str3, String str4, String str5, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 2, this.a);
        oy.I(parcel, 3, this.b);
        oy.I(parcel, 4, this.c);
        oy.I(parcel, 5, this.d);
        oy.I(parcel, 6, this.e);
        oy.z(parcel, 7, this.f);
        oy.r(parcel, q);
    }
}
