package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new b(1);

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f414f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f415g;

    public d(Parcel parcel) {
        this.f414f = parcel.createStringArrayList();
        this.f415g = parcel.createTypedArrayList(c.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f414f);
        parcel.writeTypedList(this.f415g);
    }
}
