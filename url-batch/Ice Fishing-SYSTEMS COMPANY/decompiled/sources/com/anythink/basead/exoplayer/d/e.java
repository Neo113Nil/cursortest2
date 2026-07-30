package com.anythink.basead.exoplayer.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.k.af;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class e implements Parcelable, Comparator<a> {
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() { // from class: com.anythink.basead.exoplayer.d.e.1
        private static e a(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ e[] newArray(int i) {
            return new e[i];
        }

        private static e[] a(int i) {
            return new e[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f7001a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7002b;

    /* renamed from: c, reason: collision with root package name */
    private final a[] f7003c;

    /* renamed from: d, reason: collision with root package name */
    private int f7004d;

    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.anythink.basead.exoplayer.d.e.a.1
            private static a a(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ a[] newArray(int i) {
                return new a[i];
            }

            private static a[] a(int i) {
                return new a[i];
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final String f7005a;

        /* renamed from: b, reason: collision with root package name */
        public final String f7006b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f7007c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f7008d;

        /* renamed from: e, reason: collision with root package name */
        private int f7009e;

        /* renamed from: f, reason: collision with root package name */
        private final UUID f7010f;

        public a(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, (byte) 0);
        }

        private boolean b(a aVar) {
            return a() && !aVar.a() && a(aVar.f7010f);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            a aVar = (a) obj;
            return af.a((Object) this.f7005a, (Object) aVar.f7005a) && af.a((Object) this.f7006b, (Object) aVar.f7006b) && af.a(this.f7010f, aVar.f7010f) && Arrays.equals(this.f7007c, aVar.f7007c);
        }

        public final int hashCode() {
            if (this.f7009e == 0) {
                int hashCode = this.f7010f.hashCode() * 31;
                String str = this.f7005a;
                this.f7009e = Arrays.hashCode(this.f7007c) + AbstractC5051n.k((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f7006b);
            }
            return this.f7009e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f7010f.getMostSignificantBits());
            parcel.writeLong(this.f7010f.getLeastSignificantBits());
            parcel.writeString(this.f7005a);
            parcel.writeString(this.f7006b);
            parcel.writeByteArray(this.f7007c);
            parcel.writeByte(this.f7008d ? (byte) 1 : (byte) 0);
        }

        private a(UUID uuid, String str, byte[] bArr, byte b9) {
            this(uuid, (String) null, str, bArr);
        }

        public final boolean a(UUID uuid) {
            return com.anythink.basead.exoplayer.b.bh.equals(this.f7010f) || uuid.equals(this.f7010f);
        }

        private a(UUID uuid, String str, String str2, byte[] bArr) {
            this.f7010f = (UUID) C0544a.a(uuid);
            this.f7005a = str;
            this.f7006b = (String) C0544a.a(str2);
            this.f7007c = bArr;
            this.f7008d = false;
        }

        public final boolean a() {
            return this.f7007c != null;
        }

        public a(Parcel parcel) {
            this.f7010f = new UUID(parcel.readLong(), parcel.readLong());
            this.f7005a = parcel.readString();
            this.f7006b = parcel.readString();
            this.f7007c = parcel.createByteArray();
            this.f7008d = parcel.readByte() != 0;
        }
    }

    public e(List<a> list) {
        this(null, false, (a[]) list.toArray(new a[list.size()]));
    }

    public static e a(e eVar, e eVar2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (eVar != null) {
            str = eVar.f7001a;
            for (a aVar : eVar.f7003c) {
                if (aVar.a()) {
                    arrayList.add(aVar);
                }
            }
        } else {
            str = null;
        }
        if (eVar2 != null) {
            if (str == null) {
                str = eVar2.f7001a;
            }
            int size = arrayList.size();
            for (a aVar2 : eVar2.f7003c) {
                if (aVar2.a() && !a(arrayList, size, aVar2.f7010f)) {
                    arrayList.add(aVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new e(str, arrayList);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(a aVar, a aVar2) {
        a aVar3 = aVar;
        a aVar4 = aVar2;
        UUID uuid = com.anythink.basead.exoplayer.b.bh;
        return uuid.equals(aVar3.f7010f) ? uuid.equals(aVar4.f7010f) ? 0 : 1 : aVar3.f7010f.compareTo(aVar4.f7010f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (af.a((Object) this.f7001a, (Object) eVar.f7001a) && Arrays.equals(this.f7003c, eVar.f7003c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f7004d == 0) {
            String str = this.f7001a;
            this.f7004d = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f7003c);
        }
        return this.f7004d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7001a);
        parcel.writeTypedArray(this.f7003c, 0);
    }

    private e(String str, List<a> list) {
        this(str, false, (a[]) list.toArray(new a[list.size()]));
    }

    private e(a... aVarArr) {
        this((String) null, aVarArr);
    }

    private e(String str, a... aVarArr) {
        this(str, true, aVarArr);
    }

    private e(String str, boolean z8, a... aVarArr) {
        this.f7001a = str;
        aVarArr = z8 ? (a[]) aVarArr.clone() : aVarArr;
        Arrays.sort(aVarArr, this);
        this.f7003c = aVarArr;
        this.f7002b = aVarArr.length;
    }

    public e(Parcel parcel) {
        this.f7001a = parcel.readString();
        a[] aVarArr = (a[]) parcel.createTypedArray(a.CREATOR);
        this.f7003c = aVarArr;
        this.f7002b = aVarArr.length;
    }

    @Deprecated
    private a a(UUID uuid) {
        for (a aVar : this.f7003c) {
            if (aVar.a(uuid)) {
                return aVar;
            }
        }
        return null;
    }

    public final a a(int i) {
        return this.f7003c[i];
    }

    public final e a(String str) {
        return af.a((Object) this.f7001a, (Object) str) ? this : new e(str, false, this.f7003c);
    }

    private static int a(a aVar, a aVar2) {
        UUID uuid = com.anythink.basead.exoplayer.b.bh;
        if (uuid.equals(aVar.f7010f)) {
            return uuid.equals(aVar2.f7010f) ? 0 : 1;
        }
        return aVar.f7010f.compareTo(aVar2.f7010f);
    }

    private static boolean a(ArrayList<a> arrayList, int i, UUID uuid) {
        for (int i4 = 0; i4 < i; i4++) {
            if (arrayList.get(i4).f7010f.equals(uuid)) {
                return true;
            }
        }
        return false;
    }
}
