package j1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import o2.m0;
import r0.f2;
import r0.s1;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0082a();

    /* renamed from: f, reason: collision with root package name */
    private final b[] f18073f;

    /* renamed from: j1.a$a, reason: collision with other inner class name */
    class C0082a implements Parcelable.Creator<a> {
        C0082a() {
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

    public interface b extends Parcelable {
        s1 d();

        void e(f2.b bVar);

        byte[] f();
    }

    a(Parcel parcel) {
        this.f18073f = new b[parcel.readInt()];
        int i7 = 0;
        while (true) {
            b[] bVarArr = this.f18073f;
            if (i7 >= bVarArr.length) {
                return;
            }
            bVarArr[i7] = (b) parcel.readParcelable(b.class.getClassLoader());
            i7++;
        }
    }

    public a(List<? extends b> list) {
        this.f18073f = (b[]) list.toArray(new b[0]);
    }

    public a(b... bVarArr) {
        this.f18073f = bVarArr;
    }

    public a a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new a((b[]) m0.F0(this.f18073f, bVarArr));
    }

    public a c(a aVar) {
        return aVar == null ? this : a(aVar.f18073f);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f18073f, ((a) obj).f18073f);
    }

    public b g(int i7) {
        return this.f18073f[i7];
    }

    public int h() {
        return this.f18073f.length;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f18073f);
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.f18073f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f18073f.length);
        for (b bVar : this.f18073f) {
            parcel.writeParcelable(bVar, 0);
        }
    }
}
