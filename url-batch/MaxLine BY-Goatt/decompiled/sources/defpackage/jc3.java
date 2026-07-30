package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jc3 extends i1 {
    public static final Parcelable.Creator<jc3> CREATOR = new va3(8);
    public final Bundle m;

    public jc3(Bundle bundle) {
        this.m = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.T(parcel, 1, this.m);
        yk3.c0(parcel, b0);
    }
}
