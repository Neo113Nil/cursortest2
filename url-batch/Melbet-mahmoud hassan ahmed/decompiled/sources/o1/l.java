package o1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o2.m0;

/* loaded from: classes.dex */
public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: g, reason: collision with root package name */
    public final String f19682g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f19683h;

    class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i7) {
            return new l[i7];
        }
    }

    l(Parcel parcel) {
        super("PRIV");
        this.f19682g = (String) m0.j(parcel.readString());
        this.f19683h = (byte[]) m0.j(parcel.createByteArray());
    }

    public l(String str, byte[] bArr) {
        super("PRIV");
        this.f19682g = str;
        this.f19683h = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return m0.c(this.f19682g, lVar.f19682g) && Arrays.equals(this.f19683h, lVar.f19683h);
    }

    public int hashCode() {
        String str = this.f19682g;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f19683h);
    }

    @Override // o1.i
    public String toString() {
        return this.f19673f + ": owner=" + this.f19682g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f19682g);
        parcel.writeByteArray(this.f19683h);
    }
}
