package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new b(1);

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f413f;
    public final ArrayList g;

    public d(Parcel parcel) {
        this.f413f = parcel.createStringArrayList();
        this.g = parcel.createTypedArrayList(c.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeStringList(this.f413f);
        parcel.writeTypedList(this.g);
    }
}
