package m1;

import android.os.Parcel;
import android.os.Parcelable;
import j1.a;
import o2.m0;
import r0.f2;
import r0.s1;

@Deprecated
/* loaded from: classes.dex */
public class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    public final String f18903f;

    /* renamed from: g, reason: collision with root package name */
    public final String f18904g;

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

    protected b(Parcel parcel) {
        this.f18903f = (String) m0.j(parcel.readString());
        this.f18904g = (String) m0.j(parcel.readString());
    }

    public b(String str, String str2) {
        this.f18903f = str;
        this.f18904g = str2;
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
        String str = this.f18903f;
        str.hashCode();
        switch (str) {
            case "ALBUM":
                bVar.L(this.f18904g);
                break;
            case "TITLE":
                bVar.i0(this.f18904g);
                break;
            case "DESCRIPTION":
                bVar.S(this.f18904g);
                break;
            case "ALBUMARTIST":
                bVar.K(this.f18904g);
                break;
            case "ARTIST":
                bVar.M(this.f18904g);
                break;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18903f.equals(bVar.f18903f) && this.f18904g.equals(bVar.f18904g);
    }

    @Override // j1.a.b
    public /* synthetic */ byte[] f() {
        return j1.b.a(this);
    }

    public int hashCode() {
        return ((527 + this.f18903f.hashCode()) * 31) + this.f18904g.hashCode();
    }

    public String toString() {
        return "VC: " + this.f18903f + "=" + this.f18904g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f18903f);
        parcel.writeString(this.f18904g);
    }
}
