package androidx.versionedparcelable;

import F.k;
import T.b;
import T.c;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new k(4);

    /* renamed from: a, reason: collision with root package name */
    public final c f1891a;

    public ParcelImpl(Parcel parcel) {
        this.f1891a = new b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        new b(parcel).i(this.f1891a);
    }
}
