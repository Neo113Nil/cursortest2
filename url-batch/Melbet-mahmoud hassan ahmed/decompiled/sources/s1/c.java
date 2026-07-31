package s1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Comparable<c>, Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    public final int f21608f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21609g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21610h;

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    public final int f21611i;

    class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i7) {
            return new c[i7];
        }
    }

    public c(int i7, int i8, int i9) {
        this.f21608f = i7;
        this.f21609g = i8;
        this.f21610h = i9;
        this.f21611i = i9;
    }

    c(Parcel parcel) {
        this.f21608f = parcel.readInt();
        this.f21609g = parcel.readInt();
        int readInt = parcel.readInt();
        this.f21610h = readInt;
        this.f21611i = readInt;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f21608f == cVar.f21608f && this.f21609g == cVar.f21609g && this.f21610h == cVar.f21610h;
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        int i7 = this.f21608f - cVar.f21608f;
        if (i7 != 0) {
            return i7;
        }
        int i8 = this.f21609g - cVar.f21609g;
        return i8 == 0 ? this.f21610h - cVar.f21610h : i8;
    }

    public int hashCode() {
        return (((this.f21608f * 31) + this.f21609g) * 31) + this.f21610h;
    }

    public String toString() {
        return this.f21608f + "." + this.f21609g + "." + this.f21610h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f21608f);
        parcel.writeInt(this.f21609g);
        parcel.writeInt(this.f21610h);
    }
}
