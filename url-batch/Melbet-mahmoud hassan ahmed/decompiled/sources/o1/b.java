package o1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o2.m0;

/* loaded from: classes.dex */
public final class b extends i {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f19648g;

    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i7) {
            return new b[i7];
        }
    }

    b(Parcel parcel) {
        super((String) m0.j(parcel.readString()));
        this.f19648g = (byte[]) m0.j(parcel.createByteArray());
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.f19648g = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f19673f.equals(bVar.f19673f) && Arrays.equals(this.f19648g, bVar.f19648g);
    }

    public int hashCode() {
        return ((527 + this.f19673f.hashCode()) * 31) + Arrays.hashCode(this.f19648g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f19673f);
        parcel.writeByteArray(this.f19648g);
    }
}
