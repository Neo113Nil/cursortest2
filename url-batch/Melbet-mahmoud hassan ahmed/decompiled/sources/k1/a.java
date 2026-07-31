package k1;

import android.os.Parcel;
import android.os.Parcelable;
import j1.a;
import r0.f2;
import r0.s1;

/* loaded from: classes.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0084a();

    /* renamed from: f, reason: collision with root package name */
    public final int f18205f;

    /* renamed from: g, reason: collision with root package name */
    public final String f18206g;

    /* renamed from: k1.a$a, reason: collision with other inner class name */
    class C0084a implements Parcelable.Creator<a> {
        C0084a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel.readInt(), (String) o2.a.e(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i7) {
            return new a[i7];
        }
    }

    public a(int i7, String str) {
        this.f18205f = i7;
        this.f18206g = str;
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
    public /* synthetic */ void e(f2.b bVar) {
        j1.b.c(this, bVar);
    }

    @Override // j1.a.b
    public /* synthetic */ byte[] f() {
        return j1.b.a(this);
    }

    public String toString() {
        return "Ait(controlCode=" + this.f18205f + ",url=" + this.f18206g + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f18206g);
        parcel.writeInt(this.f18205f);
    }
}
