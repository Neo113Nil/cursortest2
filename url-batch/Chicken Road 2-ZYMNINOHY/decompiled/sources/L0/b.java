package L0;

import E.AbstractC0005f;
import T.B;
import T.D;
import W.AbstractC0108a;
import a.AbstractC0124a;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements D {

    /* renamed from: a, reason: collision with root package name */
    public final int f1604a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1605b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1606c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1607d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1608e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1609f;

    public b(int i4, String str, String str2, String str3, boolean z, int i5) {
        AbstractC0124a.h(i5 == -1 || i5 > 0);
        this.f1604a = i4;
        this.f1605b = str;
        this.f1606c = str2;
        this.f1607d = str3;
        this.f1608e = z;
        this.f1609f = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b d(Map map) {
        boolean z;
        int i4;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z4;
        List list5;
        int i5;
        List list6 = (List) map.get("icy-br");
        boolean z5 = true;
        int i6 = -1;
        if (list6 != null) {
            String str4 = (String) list6.get(0);
            try {
                i5 = Integer.parseInt(str4) * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                if (i5 > 0) {
                    z = true;
                } else {
                    try {
                        AbstractC0108a.s("IcyHeaders", "Invalid bitrate: " + str4);
                        z = false;
                        i5 = -1;
                    } catch (NumberFormatException unused) {
                        AbstractC0005f.y("Invalid bitrate header: ", str4, "IcyHeaders");
                        z = false;
                        i4 = i5;
                        list = (List) map.get("icy-genre");
                        if (list == null) {
                        }
                        list2 = (List) map.get("icy-name");
                        if (list2 == null) {
                        }
                        list3 = (List) map.get("icy-url");
                        if (list3 == null) {
                        }
                        list4 = (List) map.get("icy-pub");
                        if (list4 == null) {
                        }
                        list5 = (List) map.get("icy-metaint");
                        if (list5 != null) {
                        }
                        int i7 = i6;
                        if (z) {
                        }
                    }
                }
            } catch (NumberFormatException unused2) {
                i5 = -1;
            }
            i4 = i5;
        } else {
            z = false;
            i4 = -1;
        }
        list = (List) map.get("icy-genre");
        if (list == null) {
            str = (String) list.get(0);
            z = true;
        } else {
            str = null;
        }
        list2 = (List) map.get("icy-name");
        if (list2 == null) {
            str2 = (String) list2.get(0);
            z = true;
        } else {
            str2 = null;
        }
        list3 = (List) map.get("icy-url");
        if (list3 == null) {
            str3 = (String) list3.get(0);
            z = true;
        } else {
            str3 = null;
        }
        list4 = (List) map.get("icy-pub");
        if (list4 == null) {
            z4 = ((String) list4.get(0)).equals("1");
            z = true;
        } else {
            z4 = false;
        }
        list5 = (List) map.get("icy-metaint");
        if (list5 != null) {
            String str5 = (String) list5.get(0);
            try {
                int parseInt = Integer.parseInt(str5);
                if (parseInt > 0) {
                    i6 = parseInt;
                } else {
                    try {
                        AbstractC0108a.s("IcyHeaders", "Invalid metadata interval: " + str5);
                        z5 = z;
                    } catch (NumberFormatException unused3) {
                        i6 = parseInt;
                        AbstractC0005f.y("Invalid metadata interval: ", str5, "IcyHeaders");
                        int i72 = i6;
                        if (z) {
                        }
                    }
                }
                z = z5;
            } catch (NumberFormatException unused4) {
            }
        }
        int i722 = i6;
        if (z) {
            return new b(i4, str, str2, str3, z4, i722);
        }
        return null;
    }

    @Override // T.D
    public final void c(B b4) {
        String str = this.f1606c;
        if (str != null) {
            b4.f2629x = str;
        }
        String str2 = this.f1605b;
        if (str2 != null) {
            b4.f2628w = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f1604a == bVar.f1604a && Objects.equals(this.f1605b, bVar.f1605b) && Objects.equals(this.f1606c, bVar.f1606c) && Objects.equals(this.f1607d, bVar.f1607d) && this.f1608e == bVar.f1608e && this.f1609f == bVar.f1609f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = (527 + this.f1604a) * 31;
        String str = this.f1605b;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1606c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f1607d;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f1608e ? 1 : 0)) * 31) + this.f1609f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f1606c + "\", genre=\"" + this.f1605b + "\", bitrate=" + this.f1604a + ", metadataInterval=" + this.f1609f;
    }
}
