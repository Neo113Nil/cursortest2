package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    private final a0.b f1369f;

    static class a implements Parcelable.Creator<ParcelImpl> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelImpl[] newArray(int i7) {
            return new ParcelImpl[i7];
        }
    }

    public ParcelImpl(a0.b bVar) {
        this.f1369f = bVar;
    }

    protected ParcelImpl(Parcel parcel) {
        this.f1369f = new b(parcel).H();
    }

    public <T extends a0.b> T a() {
        return (T) this.f1369f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        new b(parcel).l0(this.f1369f);
    }
}
