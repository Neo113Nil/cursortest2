package o1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o2.m0;

/* loaded from: classes.dex */
public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: g, reason: collision with root package name */
    public final String f19655g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f19656h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f19657i;

    /* renamed from: j, reason: collision with root package name */
    public final String[] f19658j;

    /* renamed from: k, reason: collision with root package name */
    private final i[] f19659k;

    class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i7) {
            return new d[i7];
        }
    }

    d(Parcel parcel) {
        super("CTOC");
        this.f19655g = (String) m0.j(parcel.readString());
        this.f19656h = parcel.readByte() != 0;
        this.f19657i = parcel.readByte() != 0;
        this.f19658j = (String[]) m0.j(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f19659k = new i[readInt];
        for (int i7 = 0; i7 < readInt; i7++) {
            this.f19659k[i7] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }

    public d(String str, boolean z6, boolean z7, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f19655g = str;
        this.f19656h = z6;
        this.f19657i = z7;
        this.f19658j = strArr;
        this.f19659k = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f19656h == dVar.f19656h && this.f19657i == dVar.f19657i && m0.c(this.f19655g, dVar.f19655g) && Arrays.equals(this.f19658j, dVar.f19658j) && Arrays.equals(this.f19659k, dVar.f19659k);
    }

    public int hashCode() {
        int i7 = (((527 + (this.f19656h ? 1 : 0)) * 31) + (this.f19657i ? 1 : 0)) * 31;
        String str = this.f19655g;
        return i7 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f19655g);
        parcel.writeByte(this.f19656h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f19657i ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f19658j);
        parcel.writeInt(this.f19659k.length);
        for (i iVar : this.f19659k) {
            parcel.writeParcelable(iVar, 0);
        }
    }
}
