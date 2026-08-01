package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class c8 implements Parcelable {
    public static final Parcelable.Creator<c8> CREATOR = new u1(3);
    public final ArrayList f;
    public final ArrayList g;

    public c8(Parcel parcel) {
        this.f = parcel.createStringArrayList();
        this.g = parcel.createTypedArrayList(b8.CREATOR);
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
