package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cv extends i1 {
    public static final Parcelable.Creator<cv> CREATOR = new va3(4);
    public final Intent m;

    public cv(Intent intent) {
        this.m = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.V(parcel, 1, this.m, i);
        yk3.c0(parcel, b0);
    }
}
