package v0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class m implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    private final b[] f22681f;

    /* renamed from: g, reason: collision with root package name */
    private int f22682g;

    /* renamed from: h, reason: collision with root package name */
    public final String f22683h;

    /* renamed from: i, reason: collision with root package name */
    public final int f22684i;

    class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i7) {
            return new m[i7];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        private int f22685f;

        /* renamed from: g, reason: collision with root package name */
        public final UUID f22686g;

        /* renamed from: h, reason: collision with root package name */
        public final String f22687h;

        /* renamed from: i, reason: collision with root package name */
        public final String f22688i;

        /* renamed from: j, reason: collision with root package name */
        public final byte[] f22689j;

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

        b(Parcel parcel) {
            this.f22686g = new UUID(parcel.readLong(), parcel.readLong());
            this.f22687h = parcel.readString();
            this.f22688i = (String) o2.m0.j(parcel.readString());
            this.f22689j = parcel.createByteArray();
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f22686g = (UUID) o2.a.e(uuid);
            this.f22687h = str;
            this.f22688i = (String) o2.a.e(str2);
            this.f22689j = bArr;
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean a(b bVar) {
            return g() && !bVar.g() && h(bVar.f22686g);
        }

        public b c(byte[] bArr) {
            return new b(this.f22686g, this.f22687h, this.f22688i, bArr);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return o2.m0.c(this.f22687h, bVar.f22687h) && o2.m0.c(this.f22688i, bVar.f22688i) && o2.m0.c(this.f22686g, bVar.f22686g) && Arrays.equals(this.f22689j, bVar.f22689j);
        }

        public boolean g() {
            return this.f22689j != null;
        }

        public boolean h(UUID uuid) {
            return r0.j.f20683a.equals(this.f22686g) || uuid.equals(this.f22686g);
        }

        public int hashCode() {
            if (this.f22685f == 0) {
                int hashCode = this.f22686g.hashCode() * 31;
                String str = this.f22687h;
                this.f22685f = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f22688i.hashCode()) * 31) + Arrays.hashCode(this.f22689j);
            }
            return this.f22685f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeLong(this.f22686g.getMostSignificantBits());
            parcel.writeLong(this.f22686g.getLeastSignificantBits());
            parcel.writeString(this.f22687h);
            parcel.writeString(this.f22688i);
            parcel.writeByteArray(this.f22689j);
        }
    }

    m(Parcel parcel) {
        this.f22683h = parcel.readString();
        b[] bVarArr = (b[]) o2.m0.j((b[]) parcel.createTypedArray(b.CREATOR));
        this.f22681f = bVarArr;
        this.f22684i = bVarArr.length;
    }

    public m(String str, List<b> list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    private m(String str, boolean z6, b... bVarArr) {
        this.f22683h = str;
        bVarArr = z6 ? (b[]) bVarArr.clone() : bVarArr;
        this.f22681f = bVarArr;
        this.f22684i = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public m(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public m(List<b> list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    public m(b... bVarArr) {
        this((String) null, bVarArr);
    }

    private static boolean c(ArrayList<b> arrayList, int i7, UUID uuid) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (arrayList.get(i8).f22686g.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static m h(m mVar, m mVar2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (mVar != null) {
            str = mVar.f22683h;
            for (b bVar : mVar.f22681f) {
                if (bVar.g()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (mVar2 != null) {
            if (str == null) {
                str = mVar2.f22683h;
            }
            int size = arrayList.size();
            for (b bVar2 : mVar2.f22681f) {
                if (bVar2.g() && !c(arrayList, size, bVar2.f22686g)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new m(str, arrayList);
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = r0.j.f20683a;
        return uuid.equals(bVar.f22686g) ? uuid.equals(bVar2.f22686g) ? 0 : 1 : bVar.f22686g.compareTo(bVar2.f22686g);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return o2.m0.c(this.f22683h, mVar.f22683h) && Arrays.equals(this.f22681f, mVar.f22681f);
    }

    public m g(String str) {
        return o2.m0.c(this.f22683h, str) ? this : new m(str, false, this.f22681f);
    }

    public int hashCode() {
        if (this.f22682g == 0) {
            String str = this.f22683h;
            this.f22682g = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f22681f);
        }
        return this.f22682g;
    }

    public b i(int i7) {
        return this.f22681f[i7];
    }

    public m j(m mVar) {
        String str;
        String str2 = this.f22683h;
        o2.a.f(str2 == null || (str = mVar.f22683h) == null || TextUtils.equals(str2, str));
        String str3 = this.f22683h;
        if (str3 == null) {
            str3 = mVar.f22683h;
        }
        return new m(str3, (b[]) o2.m0.F0(this.f22681f, mVar.f22681f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f22683h);
        parcel.writeTypedArray(this.f22681f, 0);
    }
}
