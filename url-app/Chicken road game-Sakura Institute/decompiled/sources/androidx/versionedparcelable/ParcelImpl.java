package androidx.versionedparcelable;

import E1.l;
import android.os.Parcel;
import android.os.Parcelable;
import y1.b;
import y1.c;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new l(13);

    /* renamed from: d, reason: collision with root package name */
    public final c f5506d;

    public ParcelImpl(Parcel parcel) {
        this.f5506d = new b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        new b(parcel).i(this.f5506d);
    }
}
