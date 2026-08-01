package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.b;
import m1.c;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new b(14);

    /* renamed from: f, reason: collision with root package name */
    public final c f816f;

    public ParcelImpl(Parcel parcel) {
        this.f816f = new m1.b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new m1.b(parcel).i(this.f816f);
    }
}
