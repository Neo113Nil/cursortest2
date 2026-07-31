package o1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o2.m0;

/* loaded from: classes.dex */
public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: g, reason: collision with root package name */
    public final int f19677g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19678h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19679i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f19680j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f19681k;

    class a implements Parcelable.Creator<k> {
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

    public k(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f19677g = i7;
        this.f19678h = i8;
        this.f19679i = i9;
        this.f19680j = iArr;
        this.f19681k = iArr2;
    }

    k(Parcel parcel) {
        super("MLLT");
        this.f19677g = parcel.readInt();
        this.f19678h = parcel.readInt();
        this.f19679i = parcel.readInt();
        this.f19680j = (int[]) m0.j(parcel.createIntArray());
        this.f19681k = (int[]) m0.j(parcel.createIntArray());
    }

    @Override // o1.i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f19677g == kVar.f19677g && this.f19678h == kVar.f19678h && this.f19679i == kVar.f19679i && Arrays.equals(this.f19680j, kVar.f19680j) && Arrays.equals(this.f19681k, kVar.f19681k);
    }

    public int hashCode() {
        return ((((((((527 + this.f19677g) * 31) + this.f19678h) * 31) + this.f19679i) * 31) + Arrays.hashCode(this.f19680j)) * 31) + Arrays.hashCode(this.f19681k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f19677g);
        parcel.writeInt(this.f19678h);
        parcel.writeInt(this.f19679i);
        parcel.writeIntArray(this.f19680j);
        parcel.writeIntArray(this.f19681k);
    }
}
