package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    ArrayList<m> f739f;

    /* renamed from: g, reason: collision with root package name */
    ArrayList<String> f740g;

    /* renamed from: h, reason: collision with root package name */
    b[] f741h;

    /* renamed from: i, reason: collision with root package name */
    String f742i;

    /* renamed from: j, reason: collision with root package name */
    int f743j;

    static class a implements Parcelable.Creator<k> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i7) {
            return new k[i7];
        }
    }

    public k() {
        this.f742i = null;
    }

    public k(Parcel parcel) {
        this.f742i = null;
        this.f739f = parcel.createTypedArrayList(m.CREATOR);
        this.f740g = parcel.createStringArrayList();
        this.f741h = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f742i = parcel.readString();
        this.f743j = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeTypedList(this.f739f);
        parcel.writeStringList(this.f740g);
        parcel.writeTypedArray(this.f741h, i7);
        parcel.writeString(this.f742i);
        parcel.writeInt(this.f743j);
    }
}
