package p1;

import android.os.Parcel;
import android.os.Parcelable;
import j1.a;
import r0.f2;
import r0.s1;

/* loaded from: classes.dex */
public final class e implements a.b {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    public final float f19970f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19971g;

    class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i7) {
            return new e[i7];
        }
    }

    public e(float f7, int i7) {
        this.f19970f = f7;
        this.f19971g = i7;
    }

    private e(Parcel parcel) {
        this.f19970f = parcel.readFloat();
        this.f19971g = parcel.readInt();
    }

    /* synthetic */ e(Parcel parcel, a aVar) {
        this(parcel);
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f19970f == eVar.f19970f && this.f19971g == eVar.f19971g;
    }

    @Override // j1.a.b
    public /* synthetic */ byte[] f() {
        return j1.b.a(this);
    }

    public int hashCode() {
        return ((527 + o4.b.a(this.f19970f)) * 31) + this.f19971g;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f19970f + ", svcTemporalLayerCount=" + this.f19971g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(this.f19970f);
        parcel.writeInt(this.f19971g);
    }
}
