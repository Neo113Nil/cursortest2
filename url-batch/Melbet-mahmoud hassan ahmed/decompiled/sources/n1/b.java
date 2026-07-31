package n1;

import android.os.Parcel;
import android.os.Parcelable;
import j1.a;
import java.util.List;
import java.util.Map;
import o2.m0;
import o2.r;
import r0.f2;
import r0.s1;

/* loaded from: classes.dex */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    public final int f19379f;

    /* renamed from: g, reason: collision with root package name */
    public final String f19380g;

    /* renamed from: h, reason: collision with root package name */
    public final String f19381h;

    /* renamed from: i, reason: collision with root package name */
    public final String f19382i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f19383j;

    /* renamed from: k, reason: collision with root package name */
    public final int f19384k;

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

    public b(int i7, String str, String str2, String str3, boolean z6, int i8) {
        o2.a.a(i8 == -1 || i8 > 0);
        this.f19379f = i7;
        this.f19380g = str;
        this.f19381h = str2;
        this.f19382i = str3;
        this.f19383j = z6;
        this.f19384k = i8;
    }

    b(Parcel parcel) {
        this.f19379f = parcel.readInt();
        this.f19380g = parcel.readString();
        this.f19381h = parcel.readString();
        this.f19382i = parcel.readString();
        this.f19383j = m0.L0(parcel);
        this.f19384k = parcel.readInt();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b a(Map<String, List<String>> map) {
        boolean z6;
        int i7;
        List<String> list;
        String str;
        List<String> list2;
        String str2;
        List<String> list3;
        String str3;
        List<String> list4;
        boolean z7;
        List<String> list5;
        int i8;
        List<String> list6 = map.get("icy-br");
        int i9 = -1;
        boolean z8 = true;
        if (list6 != null) {
            String str4 = list6.get(0);
            try {
                i8 = Integer.parseInt(str4) * 1000;
                if (i8 > 0) {
                    z6 = true;
                } else {
                    try {
                        r.i("IcyHeaders", "Invalid bitrate: " + str4);
                        z6 = false;
                        i8 = -1;
                    } catch (NumberFormatException unused) {
                        r.i("IcyHeaders", "Invalid bitrate header: " + str4);
                        i7 = i8;
                        z6 = false;
                        list = map.get("icy-genre");
                        if (list == null) {
                        }
                        list2 = map.get("icy-name");
                        if (list2 == null) {
                        }
                        list3 = map.get("icy-url");
                        if (list3 == null) {
                        }
                        list4 = map.get("icy-pub");
                        if (list4 == null) {
                        }
                        list5 = map.get("icy-metaint");
                        if (list5 != null) {
                        }
                        if (z6) {
                        }
                    }
                }
                i7 = i8;
            } catch (NumberFormatException unused2) {
                i8 = -1;
            }
        } else {
            z6 = false;
            i7 = -1;
        }
        list = map.get("icy-genre");
        if (list == null) {
            str = list.get(0);
            z6 = true;
        } else {
            str = null;
        }
        list2 = map.get("icy-name");
        if (list2 == null) {
            str2 = list2.get(0);
            z6 = true;
        } else {
            str2 = null;
        }
        list3 = map.get("icy-url");
        if (list3 == null) {
            str3 = list3.get(0);
            z6 = true;
        } else {
            str3 = null;
        }
        list4 = map.get("icy-pub");
        if (list4 == null) {
            z7 = list4.get(0).equals("1");
            z6 = true;
        } else {
            z7 = false;
        }
        list5 = map.get("icy-metaint");
        if (list5 != null) {
            String str5 = list5.get(0);
            try {
                int parseInt = Integer.parseInt(str5);
                if (parseInt > 0) {
                    i9 = parseInt;
                } else {
                    try {
                        r.i("IcyHeaders", "Invalid metadata interval: " + str5);
                        z8 = z6;
                    } catch (NumberFormatException unused3) {
                        i9 = parseInt;
                        r.i("IcyHeaders", "Invalid metadata interval: " + str5);
                        if (z6) {
                        }
                    }
                }
                z6 = z8;
            } catch (NumberFormatException unused4) {
            }
        }
        if (z6) {
            return new b(i7, str, str2, str3, z7, i9);
        }
        return null;
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
    public void e(f2.b bVar) {
        String str = this.f19381h;
        if (str != null) {
            bVar.g0(str);
        }
        String str2 = this.f19380g;
        if (str2 != null) {
            bVar.X(str2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f19379f == bVar.f19379f && m0.c(this.f19380g, bVar.f19380g) && m0.c(this.f19381h, bVar.f19381h) && m0.c(this.f19382i, bVar.f19382i) && this.f19383j == bVar.f19383j && this.f19384k == bVar.f19384k;
    }

    @Override // j1.a.b
    public /* synthetic */ byte[] f() {
        return j1.b.a(this);
    }

    public int hashCode() {
        int i7 = (527 + this.f19379f) * 31;
        String str = this.f19380g;
        int hashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19381h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19382i;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f19383j ? 1 : 0)) * 31) + this.f19384k;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f19381h + "\", genre=\"" + this.f19380g + "\", bitrate=" + this.f19379f + ", metadataInterval=" + this.f19384k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f19379f);
        parcel.writeString(this.f19380g);
        parcel.writeString(this.f19381h);
        parcel.writeString(this.f19382i);
        m0.Z0(parcel, this.f19383j);
        parcel.writeInt(this.f19384k);
    }
}
