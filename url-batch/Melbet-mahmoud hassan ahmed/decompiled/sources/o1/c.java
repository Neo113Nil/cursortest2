package o1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o2.m0;

/* loaded from: classes.dex */
public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: g, reason: collision with root package name */
    public final String f19649g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19650h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19651i;

    /* renamed from: j, reason: collision with root package name */
    public final long f19652j;

    /* renamed from: k, reason: collision with root package name */
    public final long f19653k;

    /* renamed from: l, reason: collision with root package name */
    private final i[] f19654l;

    class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i7) {
            return new c[i7];
        }
    }

    c(Parcel parcel) {
        super("CHAP");
        this.f19649g = (String) m0.j(parcel.readString());
        this.f19650h = parcel.readInt();
        this.f19651i = parcel.readInt();
        this.f19652j = parcel.readLong();
        this.f19653k = parcel.readLong();
        int readInt = parcel.readInt();
        this.f19654l = new i[readInt];
        for (int i7 = 0; i7 < readInt; i7++) {
            this.f19654l[i7] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }

    public c(String str, int i7, int i8, long j7, long j8, i[] iVarArr) {
        super("CHAP");
        this.f19649g = str;
        this.f19650h = i7;
        this.f19651i = i8;
        this.f19652j = j7;
        this.f19653k = j8;
        this.f19654l = iVarArr;
    }

    @Override // o1.i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f19650h == cVar.f19650h && this.f19651i == cVar.f19651i && this.f19652j == cVar.f19652j && this.f19653k == cVar.f19653k && m0.c(this.f19649g, cVar.f19649g) && Arrays.equals(this.f19654l, cVar.f19654l);
    }

    public int hashCode() {
        int i7 = (((((((527 + this.f19650h) * 31) + this.f19651i) * 31) + ((int) this.f19652j)) * 31) + ((int) this.f19653k)) * 31;
        String str = this.f19649g;
        return i7 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f19649g);
        parcel.writeInt(this.f19650h);
        parcel.writeInt(this.f19651i);
        parcel.writeLong(this.f19652j);
        parcel.writeLong(this.f19653k);
        parcel.writeInt(this.f19654l.length);
        for (i iVar : this.f19654l) {
            parcel.writeParcelable(iVar, 0);
        }
    }
}
