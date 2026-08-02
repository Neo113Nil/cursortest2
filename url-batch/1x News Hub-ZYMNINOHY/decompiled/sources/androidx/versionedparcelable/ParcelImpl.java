package androidx.versionedparcelable;

import H.h;
import Z.b;
import Z.c;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new h(18);

    /* renamed from: a, reason: collision with root package name */
    public final c f2509a;

    public ParcelImpl(Parcel parcel) {
        this.f2509a = new b(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        new b(parcel).k(this.f2509a);
    }
}
