package m1;

import android.os.Parcel;
import android.os.Parcelable;
import j1.a;
import java.util.Arrays;
import l4.d;
import o2.a0;
import o2.m0;
import r0.f2;
import r0.s1;

/* loaded from: classes.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0097a();

    /* renamed from: f, reason: collision with root package name */
    public final int f18895f;

    /* renamed from: g, reason: collision with root package name */
    public final String f18896g;

    /* renamed from: h, reason: collision with root package name */
    public final String f18897h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18898i;

    /* renamed from: j, reason: collision with root package name */
    public final int f18899j;

    /* renamed from: k, reason: collision with root package name */
    public final int f18900k;

    /* renamed from: l, reason: collision with root package name */
    public final int f18901l;

    /* renamed from: m, reason: collision with root package name */
    public final byte[] f18902m;

    /* renamed from: m1.a$a, reason: collision with other inner class name */
    class C0097a implements Parcelable.Creator<a> {
        C0097a() {
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

    public a(int i7, String str, String str2, int i8, int i9, int i10, int i11, byte[] bArr) {
        this.f18895f = i7;
        this.f18896g = str;
        this.f18897h = str2;
        this.f18898i = i8;
        this.f18899j = i9;
        this.f18900k = i10;
        this.f18901l = i11;
        this.f18902m = bArr;
    }

    a(Parcel parcel) {
        this.f18895f = parcel.readInt();
        this.f18896g = (String) m0.j(parcel.readString());
        this.f18897h = (String) m0.j(parcel.readString());
        this.f18898i = parcel.readInt();
        this.f18899j = parcel.readInt();
        this.f18900k = parcel.readInt();
        this.f18901l = parcel.readInt();
        this.f18902m = (byte[]) m0.j(parcel.createByteArray());
    }

    public static a a(a0 a0Var) {
        int m7 = a0Var.m();
        String A = a0Var.A(a0Var.m(), d.f18612a);
        String z6 = a0Var.z(a0Var.m());
        int m8 = a0Var.m();
        int m9 = a0Var.m();
        int m10 = a0Var.m();
        int m11 = a0Var.m();
        int m12 = a0Var.m();
        byte[] bArr = new byte[m12];
        a0Var.j(bArr, 0, m12);
        return new a(m7, A, z6, m8, m9, m10, m11, bArr);
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
    public void e(f2.b bVar) {
        bVar.G(this.f18902m, this.f18895f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18895f == aVar.f18895f && this.f18896g.equals(aVar.f18896g) && this.f18897h.equals(aVar.f18897h) && this.f18898i == aVar.f18898i && this.f18899j == aVar.f18899j && this.f18900k == aVar.f18900k && this.f18901l == aVar.f18901l && Arrays.equals(this.f18902m, aVar.f18902m);
    }

    @Override // j1.a.b
    public /* synthetic */ byte[] f() {
        return j1.b.a(this);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f18895f) * 31) + this.f18896g.hashCode()) * 31) + this.f18897h.hashCode()) * 31) + this.f18898i) * 31) + this.f18899j) * 31) + this.f18900k) * 31) + this.f18901l) * 31) + Arrays.hashCode(this.f18902m);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f18896g + ", description=" + this.f18897h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f18895f);
        parcel.writeString(this.f18896g);
        parcel.writeString(this.f18897h);
        parcel.writeInt(this.f18898i);
        parcel.writeInt(this.f18899j);
        parcel.writeInt(this.f18900k);
        parcel.writeInt(this.f18901l);
        parcel.writeByteArray(this.f18902m);
    }
}
