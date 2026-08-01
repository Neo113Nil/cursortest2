package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class q7 implements Parcelable {
    public static final Parcelable.Creator<q7> CREATOR = new s1(3);
    public final ArrayList f;
    public final ArrayList g;

    public q7(Parcel parcel) {
        this.f = parcel.createStringArrayList();
        this.g = parcel.createTypedArrayList(p7.CREATOR);
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
