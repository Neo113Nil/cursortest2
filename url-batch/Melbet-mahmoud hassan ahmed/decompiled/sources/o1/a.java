package o1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o2.m0;
import r0.f2;

/* loaded from: classes.dex */
public final class a extends i {
    public static final Parcelable.Creator<a> CREATOR = new C0115a();

    /* renamed from: g, reason: collision with root package name */
    public final String f19644g;

    /* renamed from: h, reason: collision with root package name */
    public final String f19645h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19646i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f19647j;

    /* renamed from: o1.a$a, reason: collision with other inner class name */
    class C0115a implements Parcelable.Creator<a> {
        C0115a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i7) {
            return new a[i7];
        }
    }

    a(Parcel parcel) {
        super("APIC");
        this.f19644g = (String) m0.j(parcel.readString());
        this.f19645h = parcel.readString();
        this.f19646i = parcel.readInt();
        this.f19647j = (byte[]) m0.j(parcel.createByteArray());
    }

    public a(String str, String str2, int i7, byte[] bArr) {
        super("APIC");
        this.f19644g = str;
        this.f19645h = str2;
        this.f19646i = i7;
        this.f19647j = bArr;
    }

    @Override // o1.i, j1.a.b
    public void e(f2.b bVar) {
        bVar.G(this.f19647j, this.f19646i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f19646i == aVar.f19646i && m0.c(this.f19644g, aVar.f19644g) && m0.c(this.f19645h, aVar.f19645h) && Arrays.equals(this.f19647j, aVar.f19647j);
    }

    public int hashCode() {
        int i7 = (527 + this.f19646i) * 31;
        String str = this.f19644g;
        int hashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19645h;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f19647j);
    }

    @Override // o1.i
    public String toString() {
        return this.f19673f + ": mimeType=" + this.f19644g + ", description=" + this.f19645h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f19644g);
        parcel.writeString(this.f19645h);
        parcel.writeInt(this.f19646i);
        parcel.writeByteArray(this.f19647j);
    }
}
