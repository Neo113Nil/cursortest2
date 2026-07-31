package o1;

import android.os.Parcel;
import android.os.Parcelable;
import o2.m0;

/* loaded from: classes.dex */
public final class j extends i {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: g, reason: collision with root package name */
    public final String f19674g;

    /* renamed from: h, reason: collision with root package name */
    public final String f19675h;

    /* renamed from: i, reason: collision with root package name */
    public final String f19676i;

    class a implements Parcelable.Creator<j> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j[] newArray(int i7) {
            return new j[i7];
        }
    }

    j(Parcel parcel) {
        super("----");
        this.f19674g = (String) m0.j(parcel.readString());
        this.f19675h = (String) m0.j(parcel.readString());
        this.f19676i = (String) m0.j(parcel.readString());
    }

    public j(String str, String str2, String str3) {
        super("----");
        this.f19674g = str;
        this.f19675h = str2;
        this.f19676i = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return m0.c(this.f19675h, jVar.f19675h) && m0.c(this.f19674g, jVar.f19674g) && m0.c(this.f19676i, jVar.f19676i);
    }

    public int hashCode() {
        String str = this.f19674g;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19675h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19676i;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // o1.i
    public String toString() {
        return this.f19673f + ": domain=" + this.f19674g + ", description=" + this.f19675h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f19673f);
        parcel.writeString(this.f19674g);
        parcel.writeString(this.f19676i);
    }
}
