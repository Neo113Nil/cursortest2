package p1;

import android.os.Parcel;
import android.os.Parcelable;
import j1.a;
import java.util.Arrays;
import o2.m0;
import r0.f2;
import r0.s1;

/* loaded from: classes.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0119a();

    /* renamed from: f, reason: collision with root package name */
    public final String f19955f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f19956g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19957h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19958i;

    /* renamed from: p1.a$a, reason: collision with other inner class name */
    class C0119a implements Parcelable.Creator<a> {
        C0119a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i7) {
            return new a[i7];
        }
    }

    private a(Parcel parcel) {
        this.f19955f = (String) m0.j(parcel.readString());
        this.f19956g = (byte[]) m0.j(parcel.createByteArray());
        this.f19957h = parcel.readInt();
        this.f19958i = parcel.readInt();
    }

    /* synthetic */ a(Parcel parcel, C0119a c0119a) {
        this(parcel);
    }

    public a(String str, byte[] bArr, int i7, int i8) {
        this.f19955f = str;
        this.f19956g = bArr;
        this.f19957h = i7;
        this.f19958i = i8;
    }

    @Override // j1.a.b
    public /* synthetic */ s1 d() {
        return j1.b.b(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // j1.a.b
    public /* synthetic */ void e(f2.b bVar) {
        j1.b.c(this, bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f19955f.equals(aVar.f19955f) && Arrays.equals(this.f19956g, aVar.f19956g) && this.f19957h == aVar.f19957h && this.f19958i == aVar.f19958i;
    }

    @Override // j1.a.b
    public /* synthetic */ byte[] f() {
        return j1.b.a(this);
    }

    public int hashCode() {
        return ((((((527 + this.f19955f.hashCode()) * 31) + Arrays.hashCode(this.f19956g)) * 31) + this.f19957h) * 31) + this.f19958i;
    }

    public String toString() {
        return "mdta: key=" + this.f19955f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f19955f);
        parcel.writeByteArray(this.f19956g);
        parcel.writeInt(this.f19957h);
        parcel.writeInt(this.f19958i);
    }
}
