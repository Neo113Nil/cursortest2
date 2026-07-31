package o1;

import android.os.Parcel;
import android.os.Parcelable;
import o2.m0;

/* loaded from: classes.dex */
public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: g, reason: collision with root package name */
    public final String f19660g;

    /* renamed from: h, reason: collision with root package name */
    public final String f19661h;

    /* renamed from: i, reason: collision with root package name */
    public final String f19662i;

    class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i7) {
            return new e[i7];
        }
    }

    e(Parcel parcel) {
        super("COMM");
        this.f19660g = (String) m0.j(parcel.readString());
        this.f19661h = (String) m0.j(parcel.readString());
        this.f19662i = (String) m0.j(parcel.readString());
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f19660g = str;
        this.f19661h = str2;
        this.f19662i = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return m0.c(this.f19661h, eVar.f19661h) && m0.c(this.f19660g, eVar.f19660g) && m0.c(this.f19662i, eVar.f19662i);
    }

    public int hashCode() {
        String str = this.f19660g;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19661h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19662i;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // o1.i
    public String toString() {
        return this.f19673f + ": language=" + this.f19660g + ", description=" + this.f19661h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f19673f);
        parcel.writeString(this.f19660g);
        parcel.writeString(this.f19662i);
    }
}
