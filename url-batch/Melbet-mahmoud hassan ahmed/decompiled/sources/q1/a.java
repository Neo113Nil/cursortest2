package q1;

import android.os.Parcel;
import android.os.Parcelable;
import o2.a0;
import o2.m0;

/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0125a();

    /* renamed from: f, reason: collision with root package name */
    public final long f20165f;

    /* renamed from: g, reason: collision with root package name */
    public final long f20166g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f20167h;

    /* renamed from: q1.a$a, reason: collision with other inner class name */
    class C0125a implements Parcelable.Creator<a> {
        C0125a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i7) {
            return new a[i7];
        }
    }

    private a(long j7, byte[] bArr, long j8) {
        this.f20165f = j8;
        this.f20166g = j7;
        this.f20167h = bArr;
    }

    private a(Parcel parcel) {
        this.f20165f = parcel.readLong();
        this.f20166g = parcel.readLong();
        this.f20167h = (byte[]) m0.j(parcel.createByteArray());
    }

    /* synthetic */ a(Parcel parcel, C0125a c0125a) {
        this(parcel);
    }

    static a a(a0 a0Var, int i7, long j7) {
        long E = a0Var.E();
        int i8 = i7 - 4;
        byte[] bArr = new byte[i8];
        a0Var.j(bArr, 0, i8);
        return new a(E, bArr, j7);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f20165f);
        parcel.writeLong(this.f20166g);
        parcel.writeByteArray(this.f20167h);
    }
}
