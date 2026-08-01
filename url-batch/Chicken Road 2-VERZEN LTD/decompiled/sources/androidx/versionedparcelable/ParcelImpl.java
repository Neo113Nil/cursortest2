package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import q.C0091a;
import q.c;
import q.d;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0091a();

    /* renamed from: a, reason: collision with root package name */
    public final d f452a;

    public ParcelImpl(Parcel parcel) {
        this.f452a = new c(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        new c(parcel).i(this.f452a);
    }
}
