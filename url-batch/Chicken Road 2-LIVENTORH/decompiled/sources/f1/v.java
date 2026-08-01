package f1;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new androidx.fragment.app.b(9);

    /* renamed from: f, reason: collision with root package name */
    public int f1511f;

    /* renamed from: g, reason: collision with root package name */
    public int f1512g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1513h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1511f);
        parcel.writeInt(this.f1512g);
        parcel.writeInt(this.f1513h ? 1 : 0);
    }
}
