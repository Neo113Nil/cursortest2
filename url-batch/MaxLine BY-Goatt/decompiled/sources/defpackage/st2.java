package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class st2 extends i1 {
    public static final Parcelable.Creator<st2> CREATOR = new s3(26);
    public final int m;
    public List n;

    public st2(int i, List list) {
        this.m = i;
        this.n = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.d0(parcel, 1, 4);
        parcel.writeInt(this.m);
        yk3.Y(parcel, 2, this.n);
        yk3.c0(parcel, b0);
    }
}
