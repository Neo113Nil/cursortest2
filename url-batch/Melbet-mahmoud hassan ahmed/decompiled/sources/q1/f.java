package q1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o2.a0;

/* loaded from: classes.dex */
public final class f extends q1.b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    public final List<c> f20187f;

    class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i7) {
            return new f[i7];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f20188a;

        /* renamed from: b, reason: collision with root package name */
        public final long f20189b;

        private b(int i7, long j7) {
            this.f20188a = i7;
            this.f20189b = j7;
        }

        /* synthetic */ b(int i7, long j7, a aVar) {
            this(i7, j7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Parcel parcel) {
            parcel.writeInt(this.f20188a);
            parcel.writeLong(this.f20189b);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f20190a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f20191b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f20192c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f20193d;

        /* renamed from: e, reason: collision with root package name */
        public final long f20194e;

        /* renamed from: f, reason: collision with root package name */
        public final List<b> f20195f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f20196g;

        /* renamed from: h, reason: collision with root package name */
        public final long f20197h;

        /* renamed from: i, reason: collision with root package name */
        public final int f20198i;

        /* renamed from: j, reason: collision with root package name */
        public final int f20199j;

        /* renamed from: k, reason: collision with root package name */
        public final int f20200k;

        private c(long j7, boolean z6, boolean z7, boolean z8, List<b> list, long j8, boolean z9, long j9, int i7, int i8, int i9) {
            this.f20190a = j7;
            this.f20191b = z6;
            this.f20192c = z7;
            this.f20193d = z8;
            this.f20195f = Collections.unmodifiableList(list);
            this.f20194e = j8;
            this.f20196g = z9;
            this.f20197h = j9;
            this.f20198i = i7;
            this.f20199j = i8;
            this.f20200k = i9;
        }

        private c(Parcel parcel) {
            this.f20190a = parcel.readLong();
            this.f20191b = parcel.readByte() == 1;
            this.f20192c = parcel.readByte() == 1;
            this.f20193d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i7 = 0; i7 < readInt; i7++) {
                arrayList.add(b.c(parcel));
            }
            this.f20195f = Collections.unmodifiableList(arrayList);
            this.f20194e = parcel.readLong();
            this.f20196g = parcel.readByte() == 1;
            this.f20197h = parcel.readLong();
            this.f20198i = parcel.readInt();
            this.f20199j = parcel.readInt();
            this.f20200k = parcel.readInt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c e(a0 a0Var) {
            ArrayList arrayList;
            boolean z6;
            long j7;
            boolean z7;
            long j8;
            int i7;
            int i8;
            int i9;
            boolean z8;
            boolean z9;
            long j9;
            long E = a0Var.E();
            boolean z10 = (a0Var.C() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z10) {
                arrayList = arrayList2;
                z6 = false;
                j7 = -9223372036854775807L;
                z7 = false;
                j8 = -9223372036854775807L;
                i7 = 0;
                i8 = 0;
                i9 = 0;
                z8 = false;
            } else {
                int C = a0Var.C();
                boolean z11 = (C & 128) != 0;
                boolean z12 = (C & 64) != 0;
                boolean z13 = (C & 32) != 0;
                long E2 = z12 ? a0Var.E() : -9223372036854775807L;
                if (!z12) {
                    int C2 = a0Var.C();
                    ArrayList arrayList3 = new ArrayList(C2);
                    for (int i10 = 0; i10 < C2; i10++) {
                        arrayList3.add(new b(a0Var.C(), a0Var.E(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z13) {
                    long C3 = a0Var.C();
                    boolean z14 = (128 & C3) != 0;
                    j9 = ((((C3 & 1) << 32) | a0Var.E()) * 1000) / 90;
                    z9 = z14;
                } else {
                    z9 = false;
                    j9 = -9223372036854775807L;
                }
                int I = a0Var.I();
                int C4 = a0Var.C();
                z8 = z12;
                i9 = a0Var.C();
                j8 = j9;
                arrayList = arrayList2;
                long j10 = E2;
                i7 = I;
                i8 = C4;
                j7 = j10;
                boolean z15 = z11;
                z7 = z9;
                z6 = z15;
            }
            return new c(E, z10, z6, z8, arrayList, j7, z7, j8, i7, i8, i9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(Parcel parcel) {
            parcel.writeLong(this.f20190a);
            parcel.writeByte(this.f20191b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f20192c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f20193d ? (byte) 1 : (byte) 0);
            int size = this.f20195f.size();
            parcel.writeInt(size);
            for (int i7 = 0; i7 < size; i7++) {
                this.f20195f.get(i7).d(parcel);
            }
            parcel.writeLong(this.f20194e);
            parcel.writeByte(this.f20196g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f20197h);
            parcel.writeInt(this.f20198i);
            parcel.writeInt(this.f20199j);
            parcel.writeInt(this.f20200k);
        }
    }

    private f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            arrayList.add(c.d(parcel));
        }
        this.f20187f = Collections.unmodifiableList(arrayList);
    }

    /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    private f(List<c> list) {
        this.f20187f = Collections.unmodifiableList(list);
    }

    static f a(a0 a0Var) {
        int C = a0Var.C();
        ArrayList arrayList = new ArrayList(C);
        for (int i7 = 0; i7 < C; i7++) {
            arrayList.add(c.e(a0Var));
        }
        return new f(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int size = this.f20187f.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            this.f20187f.get(i8).f(parcel);
        }
    }
}
