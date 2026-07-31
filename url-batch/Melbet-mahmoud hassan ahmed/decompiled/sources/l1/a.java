package l1;

import android.os.Parcel;
import android.os.Parcelable;
import j1.a;
import java.util.Arrays;
import o2.m0;
import r0.f2;
import r0.s1;

/* loaded from: classes.dex */
public final class a implements a.b {

    /* renamed from: f, reason: collision with root package name */
    public final String f18527f;

    /* renamed from: g, reason: collision with root package name */
    public final String f18528g;

    /* renamed from: h, reason: collision with root package name */
    public final long f18529h;

    /* renamed from: i, reason: collision with root package name */
    public final long f18530i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f18531j;

    /* renamed from: k, reason: collision with root package name */
    private int f18532k;

    /* renamed from: l, reason: collision with root package name */
    private static final s1 f18525l = new s1.b().e0("application/id3").E();

    /* renamed from: m, reason: collision with root package name */
    private static final s1 f18526m = new s1.b().e0("application/x-scte35").E();
    public static final Parcelable.Creator<a> CREATOR = new C0090a();

    /* renamed from: l1.a$a, reason: collision with other inner class name */
    class C0090a implements Parcelable.Creator<a> {
        C0090a() {
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

    a(Parcel parcel) {
        this.f18527f = (String) m0.j(parcel.readString());
        this.f18528g = (String) m0.j(parcel.readString());
        this.f18529h = parcel.readLong();
        this.f18530i = parcel.readLong();
        this.f18531j = (byte[]) m0.j(parcel.createByteArray());
    }

    public a(String str, String str2, long j7, long j8, byte[] bArr) {
        this.f18527f = str;
        this.f18528g = str2;
        this.f18529h = j7;
        this.f18530i = j8;
        this.f18531j = bArr;
    }

    @Override // j1.a.b
    public s1 d() {
        String str = this.f18527f;
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f18526m;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f18525l;
            default:
                return null;
        }
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
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18529h == aVar.f18529h && this.f18530i == aVar.f18530i && m0.c(this.f18527f, aVar.f18527f) && m0.c(this.f18528g, aVar.f18528g) && Arrays.equals(this.f18531j, aVar.f18531j);
    }

    @Override // j1.a.b
    public byte[] f() {
        if (d() != null) {
            return this.f18531j;
        }
        return null;
    }

    public int hashCode() {
        if (this.f18532k == 0) {
            String str = this.f18527f;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f18528g;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j7 = this.f18529h;
            int i7 = (((hashCode + hashCode2) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31;
            long j8 = this.f18530i;
            this.f18532k = ((i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + Arrays.hashCode(this.f18531j);
        }
        return this.f18532k;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f18527f + ", id=" + this.f18530i + ", durationMs=" + this.f18529h + ", value=" + this.f18528g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f18527f);
        parcel.writeString(this.f18528g);
        parcel.writeLong(this.f18529h);
        parcel.writeLong(this.f18530i);
        parcel.writeByteArray(this.f18531j);
    }
}
