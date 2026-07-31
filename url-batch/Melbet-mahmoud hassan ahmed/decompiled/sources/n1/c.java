package n1;

import android.os.Parcel;
import android.os.Parcelable;
import j1.a;
import java.util.Arrays;
import r0.f2;
import r0.s1;

/* loaded from: classes.dex */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f19385f;

    /* renamed from: g, reason: collision with root package name */
    public final String f19386g;

    /* renamed from: h, reason: collision with root package name */
    public final String f19387h;

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

    c(Parcel parcel) {
        this.f19385f = (byte[]) o2.a.e(parcel.createByteArray());
        this.f19386g = parcel.readString();
        this.f19387h = parcel.readString();
    }

    public c(byte[] bArr, String str, String str2) {
        this.f19385f = bArr;
        this.f19386g = str;
        this.f19387h = str2;
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
        String str = this.f19386g;
        if (str != null) {
            bVar.i0(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f19385f, ((c) obj).f19385f);
    }

    @Override // j1.a.b
    public /* synthetic */ byte[] f() {
        return j1.b.a(this);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f19385f);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f19386g, this.f19387h, Integer.valueOf(this.f19385f.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeByteArray(this.f19385f);
        parcel.writeString(this.f19386g);
        parcel.writeString(this.f19387h);
    }
}
