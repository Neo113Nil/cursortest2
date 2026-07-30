package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tp3 extends i1 {
    public static final Parcelable.Creator<tp3> CREATOR = new va3(24);
    public final List m;

    public tp3(ArrayList arrayList) {
        this.m = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.Y(parcel, 1, this.m);
        yk3.c0(parcel, b0);
    }
}
