package q1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o2.a0;
import o2.i0;

/* loaded from: classes.dex */
public final class d extends q1.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    public final long f20171f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f20172g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f20173h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f20174i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f20175j;

    /* renamed from: k, reason: collision with root package name */
    public final long f20176k;

    /* renamed from: l, reason: collision with root package name */
    public final long f20177l;

    /* renamed from: m, reason: collision with root package name */
    public final List<b> f20178m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f20179n;

    /* renamed from: o, reason: collision with root package name */
    public final long f20180o;

    /* renamed from: p, reason: collision with root package name */
    public final int f20181p;

    /* renamed from: q, reason: collision with root package name */
    public final int f20182q;

    /* renamed from: r, reason: collision with root package name */
    public final int f20183r;

    class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i7) {
            return new d[i7];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f20184a;

        /* renamed from: b, reason: collision with root package name */
        public final long f20185b;

        /* renamed from: c, reason: collision with root package name */
        public final long f20186c;

        private b(int i7, long j7, long j8) {
            this.f20184a = i7;
            this.f20185b = j7;
            this.f20186c = j8;
        }

        /* synthetic */ b(int i7, long j7, long j8, a aVar) {
            this(i7, j7, j8);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f20184a);
            parcel.writeLong(this.f20185b);
            parcel.writeLong(this.f20186c);
        }
    }

    private d(long j7, boolean z6, boolean z7, boolean z8, boolean z9, long j8, long j9, List<b> list, boolean z10, long j10, int i7, int i8, int i9) {
        this.f20171f = j7;
        this.f20172g = z6;
        this.f20173h = z7;
        this.f20174i = z8;
        this.f20175j = z9;
        this.f20176k = j8;
        this.f20177l = j9;
        this.f20178m = Collections.unmodifiableList(list);
        this.f20179n = z10;
        this.f20180o = j10;
        this.f20181p = i7;
        this.f20182q = i8;
        this.f20183r = i9;
    }

    private d(Parcel parcel) {
        this.f20171f = parcel.readLong();
        this.f20172g = parcel.readByte() == 1;
        this.f20173h = parcel.readByte() == 1;
        this.f20174i = parcel.readByte() == 1;
        this.f20175j = parcel.readByte() == 1;
        this.f20176k = parcel.readLong();
        this.f20177l = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            arrayList.add(b.a(parcel));
        }
        this.f20178m = Collections.unmodifiableList(arrayList);
        this.f20179n = parcel.readByte() == 1;
        this.f20180o = parcel.readLong();
        this.f20181p = parcel.readInt();
        this.f20182q = parcel.readInt();
        this.f20183r = parcel.readInt();
    }

    /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    static d a(a0 a0Var, long j7, i0 i0Var) {
        List list;
        boolean z6;
        boolean z7;
        long j8;
        boolean z8;
        long j9;
        int i7;
        int i8;
        int i9;
        boolean z9;
        boolean z10;
        long j10;
        long E = a0Var.E();
        boolean z11 = (a0Var.C() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (z11) {
            list = emptyList;
            z6 = false;
            z7 = false;
            j8 = -9223372036854775807L;
            z8 = false;
            j9 = -9223372036854775807L;
            i7 = 0;
            i8 = 0;
            i9 = 0;
            z9 = false;
        } else {
            int C = a0Var.C();
            boolean z12 = (C & 128) != 0;
            boolean z13 = (C & 64) != 0;
            boolean z14 = (C & 32) != 0;
            boolean z15 = (C & 16) != 0;
            long c7 = (!z13 || z15) ? -9223372036854775807L : g.c(a0Var, j7);
            if (!z13) {
                int C2 = a0Var.C();
                ArrayList arrayList = new ArrayList(C2);
                for (int i10 = 0; i10 < C2; i10++) {
                    int C3 = a0Var.C();
                    long c8 = !z15 ? g.c(a0Var, j7) : -9223372036854775807L;
                    arrayList.add(new b(C3, c8, i0Var.b(c8), null));
                }
                emptyList = arrayList;
            }
            if (z14) {
                long C4 = a0Var.C();
                boolean z16 = (128 & C4) != 0;
                j10 = ((((C4 & 1) << 32) | a0Var.E()) * 1000) / 90;
                z10 = z16;
            } else {
                z10 = false;
                j10 = -9223372036854775807L;
            }
            i7 = a0Var.I();
            z9 = z13;
            i8 = a0Var.C();
            i9 = a0Var.C();
            list = emptyList;
            long j11 = c7;
            z8 = z10;
            j9 = j10;
            z7 = z15;
            z6 = z12;
            j8 = j11;
        }
        return new d(E, z11, z6, z9, z7, j8, i0Var.b(j8), list, z8, j9, i7, i8, i9);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f20171f);
        parcel.writeByte(this.f20172g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f20173h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f20174i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f20175j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f20176k);
        parcel.writeLong(this.f20177l);
        int size = this.f20178m.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            this.f20178m.get(i8).b(parcel);
        }
        parcel.writeByte(this.f20179n ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f20180o);
        parcel.writeInt(this.f20181p);
        parcel.writeInt(this.f20182q);
        parcel.writeInt(this.f20183r);
    }
}
