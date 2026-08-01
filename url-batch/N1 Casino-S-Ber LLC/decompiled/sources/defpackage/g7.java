package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class g7 implements Parcelable {
    public static final Parcelable.Creator<g7> CREATOR = new r1(3);
    public final ArrayList f;
    public final ArrayList g;

    public g7(Parcel parcel) {
        this.f = parcel.createStringArrayList();
        this.g = parcel.createTypedArrayList(f7.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f);
        parcel.writeTypedList(this.g);
    }
}
