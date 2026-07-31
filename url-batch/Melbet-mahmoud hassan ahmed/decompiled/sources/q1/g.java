package q1;

import android.os.Parcel;
import android.os.Parcelable;
import o2.a0;
import o2.i0;

/* loaded from: classes.dex */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    public final long f20201f;

    /* renamed from: g, reason: collision with root package name */
    public final long f20202g;

    class a implements Parcelable.Creator<g> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i7) {
            return new g[i7];
        }
    }

    private g(long j7, long j8) {
        this.f20201f = j7;
        this.f20202g = j8;
    }

    /* synthetic */ g(long j7, long j8, a aVar) {
        this(j7, j8);
    }

    static g a(a0 a0Var, long j7, i0 i0Var) {
        long c7 = c(a0Var, j7);
        return new g(c7, i0Var.b(c7));
    }

    static long c(a0 a0Var, long j7) {
        long C = a0Var.C();
        if ((128 & C) != 0) {
            return 8589934591L & ((((C & 1) << 32) | a0Var.E()) + j7);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f20201f);
        parcel.writeLong(this.f20202g);
    }
}
