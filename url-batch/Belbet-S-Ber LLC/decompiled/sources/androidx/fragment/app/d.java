package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new b(1);

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f528f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f529g;

    public d(Parcel parcel) {
        this.f528f = parcel.createStringArrayList();
        this.f529g = parcel.createTypedArrayList(c.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f528f);
        parcel.writeTypedList(this.f529g);
    }
}
