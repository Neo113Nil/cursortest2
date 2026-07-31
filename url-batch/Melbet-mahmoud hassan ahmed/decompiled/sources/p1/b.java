package p1;

import android.os.Parcel;
import android.os.Parcelable;
import j1.a;
import o4.f;
import r0.f2;
import r0.s1;

/* loaded from: classes.dex */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    public final long f19959f;

    /* renamed from: g, reason: collision with root package name */
    public final long f19960g;

    /* renamed from: h, reason: collision with root package name */
    public final long f19961h;

    /* renamed from: i, reason: collision with root package name */
    public final long f19962i;

    /* renamed from: j, reason: collision with root package name */
    public final long f19963j;

    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i7) {
            return new b[i7];
        }
    }

    public b(long j7, long j8, long j9, long j10, long j11) {
        this.f19959f = j7;
        this.f19960g = j8;
        this.f19961h = j9;
        this.f19962i = j10;
        this.f19963j = j11;
    }

    private b(Parcel parcel) {
        this.f19959f = parcel.readLong();
        this.f19960g = parcel.readLong();
        this.f19961h = parcel.readLong();
        this.f19962i = parcel.readLong();
        this.f19963j = parcel.readLong();
    }

    /* synthetic */ b(Parcel parcel, a aVar) {
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
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f19959f == bVar.f19959f && this.f19960g == bVar.f19960g && this.f19961h == bVar.f19961h && this.f19962i == bVar.f19962i && this.f19963j == bVar.f19963j;
    }

    @Override // j1.a.b
    public /* synthetic */ byte[] f() {
        return j1.b.a(this);
    }

    public int hashCode() {
        return ((((((((527 + f.b(this.f19959f)) * 31) + f.b(this.f19960g)) * 31) + f.b(this.f19961h)) * 31) + f.b(this.f19962i)) * 31) + f.b(this.f19963j);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f19959f + ", photoSize=" + this.f19960g + ", photoPresentationTimestampUs=" + this.f19961h + ", videoStartPosition=" + this.f19962i + ", videoSize=" + this.f19963j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f19959f);
        parcel.writeLong(this.f19960g);
        parcel.writeLong(this.f19961h);
        parcel.writeLong(this.f19962i);
        parcel.writeLong(this.f19963j);
    }
}
