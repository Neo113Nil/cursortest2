package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cs0 implements Parcelable {
    public static final Parcelable.Creator<cs0> CREATOR = new s3(6);
    public ArrayList m;
    public ArrayList n;
    public xm[] o;
    public int p;
    public String q;
    public ArrayList r;
    public ArrayList s;
    public ArrayList t;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.m);
        parcel.writeStringList(this.n);
        parcel.writeTypedArray(this.o, i);
        parcel.writeInt(this.p);
        parcel.writeString(this.q);
        parcel.writeStringList(this.r);
        parcel.writeTypedList(this.s);
        parcel.writeTypedList(this.t);
    }
}
