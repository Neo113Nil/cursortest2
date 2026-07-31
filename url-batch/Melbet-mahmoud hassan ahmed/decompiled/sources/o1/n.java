package o1;

import android.os.Parcel;
import android.os.Parcelable;
import o2.m0;

/* loaded from: classes.dex */
public final class n extends i {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: g, reason: collision with root package name */
    public final String f19686g;

    /* renamed from: h, reason: collision with root package name */
    public final String f19687h;

    class a implements Parcelable.Creator<n> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i7) {
            return new n[i7];
        }
    }

    n(Parcel parcel) {
        super((String) m0.j(parcel.readString()));
        this.f19686g = parcel.readString();
        this.f19687h = (String) m0.j(parcel.readString());
    }

    public n(String str, String str2, String str3) {
        super(str);
        this.f19686g = str2;
        this.f19687h = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f19673f.equals(nVar.f19673f) && m0.c(this.f19686g, nVar.f19686g) && m0.c(this.f19687h, nVar.f19687h);
    }

    public int hashCode() {
        int hashCode = (527 + this.f19673f.hashCode()) * 31;
        String str = this.f19686g;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19687h;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // o1.i
    public String toString() {
        return this.f19673f + ": url=" + this.f19687h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f19673f);
        parcel.writeString(this.f19686g);
        parcel.writeString(this.f19687h);
    }
}
