package o1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o2.m0;

/* loaded from: classes.dex */
public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: g, reason: collision with root package name */
    public final String f19663g;

    /* renamed from: h, reason: collision with root package name */
    public final String f19664h;

    /* renamed from: i, reason: collision with root package name */
    public final String f19665i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f19666j;

    class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i7) {
            return new f[i7];
        }
    }

    f(Parcel parcel) {
        super("GEOB");
        this.f19663g = (String) m0.j(parcel.readString());
        this.f19664h = (String) m0.j(parcel.readString());
        this.f19665i = (String) m0.j(parcel.readString());
        this.f19666j = (byte[]) m0.j(parcel.createByteArray());
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f19663g = str;
        this.f19664h = str2;
        this.f19665i = str3;
        this.f19666j = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return m0.c(this.f19663g, fVar.f19663g) && m0.c(this.f19664h, fVar.f19664h) && m0.c(this.f19665i, fVar.f19665i) && Arrays.equals(this.f19666j, fVar.f19666j);
    }

    public int hashCode() {
        String str = this.f19663g;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19664h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19665i;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f19666j);
    }

    @Override // o1.i
    public String toString() {
        return this.f19673f + ": mimeType=" + this.f19663g + ", filename=" + this.f19664h + ", description=" + this.f19665i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f19663g);
        parcel.writeString(this.f19664h);
        parcel.writeString(this.f19665i);
        parcel.writeByteArray(this.f19666j);
    }
}
