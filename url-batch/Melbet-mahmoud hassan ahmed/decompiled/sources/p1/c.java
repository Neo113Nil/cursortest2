package p1;

import android.os.Parcel;
import android.os.Parcelable;
import j1.a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import l4.i;
import m4.k;
import o2.m0;
import p1.c;
import r0.f2;
import r0.s1;

/* loaded from: classes.dex */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    public final List<b> f19964f;

    class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new c(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i7) {
            return new c[i7];
        }
    }

    public static final class b implements Parcelable {

        /* renamed from: f, reason: collision with root package name */
        public final long f19966f;

        /* renamed from: g, reason: collision with root package name */
        public final long f19967g;

        /* renamed from: h, reason: collision with root package name */
        public final int f19968h;

        /* renamed from: i, reason: collision with root package name */
        public static final Comparator<b> f19965i = new Comparator() { // from class: p1.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int c7;
                c7 = c.b.c((c.b) obj, (c.b) obj2);
                return c7;
            }
        };
        public static final Parcelable.Creator<b> CREATOR = new a();

        class a implements Parcelable.Creator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i7) {
                return new b[i7];
            }
        }

        public b(long j7, long j8, int i7) {
            o2.a.a(j7 < j8);
            this.f19966f = j7;
            this.f19967g = j8;
            this.f19968h = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int c(b bVar, b bVar2) {
            return k.j().e(bVar.f19966f, bVar2.f19966f).e(bVar.f19967g, bVar2.f19967g).d(bVar.f19968h, bVar2.f19968h).i();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f19966f == bVar.f19966f && this.f19967g == bVar.f19967g && this.f19968h == bVar.f19968h;
        }

        public int hashCode() {
            return i.b(Long.valueOf(this.f19966f), Long.valueOf(this.f19967g), Integer.valueOf(this.f19968h));
        }

        public String toString() {
            return m0.C("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f19966f), Long.valueOf(this.f19967g), Integer.valueOf(this.f19968h));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeLong(this.f19966f);
            parcel.writeLong(this.f19967g);
            parcel.writeInt(this.f19968h);
        }
    }

    public c(List<b> list) {
        this.f19964f = list;
        o2.a.a(!a(list));
    }

    private static boolean a(List<b> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j7 = list.get(0).f19967g;
        for (int i7 = 1; i7 < list.size(); i7++) {
            if (list.get(i7).f19966f < j7) {
                return true;
            }
            j7 = list.get(i7).f19967g;
        }
        return false;
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
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f19964f.equals(((c) obj).f19964f);
    }

    @Override // j1.a.b
    public /* synthetic */ byte[] f() {
        return j1.b.a(this);
    }

    public int hashCode() {
        return this.f19964f.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f19964f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeList(this.f19964f);
    }
}
