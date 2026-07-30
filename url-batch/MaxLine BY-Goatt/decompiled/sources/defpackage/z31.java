package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z31 implements Parcelable {
    public static final Parcelable.Creator<z31> CREATOR = new s3(8);
    public final IntentSender m;
    public final Intent n;
    public final int o;
    public final int p;

    public z31(IntentSender intentSender, Intent intent, int i, int i2) {
        this.m = intentSender;
        this.n = intent;
        this.o = i;
        this.p = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.m, i);
        parcel.writeParcelable(this.n, i);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
    }
}
