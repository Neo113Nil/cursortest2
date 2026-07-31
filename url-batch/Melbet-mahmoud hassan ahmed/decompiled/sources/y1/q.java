package y1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j1.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r0.f2;
import r0.s1;

/* loaded from: classes.dex */
public final class q implements a.b {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    public final String f23364f;

    /* renamed from: g, reason: collision with root package name */
    public final String f23365g;

    /* renamed from: h, reason: collision with root package name */
    public final List<b> f23366h;

    class a implements Parcelable.Creator<q> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q createFromParcel(Parcel parcel) {
            return new q(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q[] newArray(int i7) {
            return new q[i7];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        public final int f23367f;

        /* renamed from: g, reason: collision with root package name */
        public final int f23368g;

        /* renamed from: h, reason: collision with root package name */
        public final String f23369h;

        /* renamed from: i, reason: collision with root package name */
        public final String f23370i;

        /* renamed from: j, reason: collision with root package name */
        public final String f23371j;

        /* renamed from: k, reason: collision with root package name */
        public final String f23372k;

        class a implements Parcelable.Creator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i7) {
                return new b[i7];
            }
        }

        public b(int i7, int i8, String str, String str2, String str3, String str4) {
            this.f23367f = i7;
            this.f23368g = i8;
            this.f23369h = str;
            this.f23370i = str2;
            this.f23371j = str3;
            this.f23372k = str4;
        }

        b(Parcel parcel) {
            this.f23367f = parcel.readInt();
            this.f23368g = parcel.readInt();
            this.f23369h = parcel.readString();
            this.f23370i = parcel.readString();
            this.f23371j = parcel.readString();
            this.f23372k = parcel.readString();
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
            return this.f23367f == bVar.f23367f && this.f23368g == bVar.f23368g && TextUtils.equals(this.f23369h, bVar.f23369h) && TextUtils.equals(this.f23370i, bVar.f23370i) && TextUtils.equals(this.f23371j, bVar.f23371j) && TextUtils.equals(this.f23372k, bVar.f23372k);
        }

        public int hashCode() {
            int i7 = ((this.f23367f * 31) + this.f23368g) * 31;
            String str = this.f23369h;
            int hashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f23370i;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f23371j;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f23372k;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f23367f);
            parcel.writeInt(this.f23368g);
            parcel.writeString(this.f23369h);
            parcel.writeString(this.f23370i);
            parcel.writeString(this.f23371j);
            parcel.writeString(this.f23372k);
        }
    }

    q(Parcel parcel) {
        this.f23364f = parcel.readString();
        this.f23365g = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            arrayList.add((b) parcel.readParcelable(b.class.getClassLoader()));
        }
        this.f23366h = Collections.unmodifiableList(arrayList);
    }

    public q(String str, String str2, List<b> list) {
        this.f23364f = str;
        this.f23365g = str2;
        this.f23366h = Collections.unmodifiableList(new ArrayList(list));
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
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return TextUtils.equals(this.f23364f, qVar.f23364f) && TextUtils.equals(this.f23365g, qVar.f23365g) && this.f23366h.equals(qVar.f23366h);
    }

    @Override // j1.a.b
    public /* synthetic */ byte[] f() {
        return j1.b.a(this);
    }

    public int hashCode() {
        String str = this.f23364f;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f23365g;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f23366h.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("HlsTrackMetadataEntry");
        if (this.f23364f != null) {
            str = " [" + this.f23364f + ", " + this.f23365g + "]";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f23364f);
        parcel.writeString(this.f23365g);
        int size = this.f23366h.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeParcelable(this.f23366h.get(i8), 0);
        }
    }
}
