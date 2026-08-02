package K1;

import E.AbstractC0005f;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f1489a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1490b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1491c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1492d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1493e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1494f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1495g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1496h;

    /* renamed from: i, reason: collision with root package name */
    public final String f1497i;

    /* renamed from: j, reason: collision with root package name */
    public final String f1498j;

    /* renamed from: k, reason: collision with root package name */
    public final String f1499k;

    /* renamed from: l, reason: collision with root package name */
    public final String f1500l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f1489a = num;
        this.f1490b = str;
        this.f1491c = str2;
        this.f1492d = str3;
        this.f1493e = str4;
        this.f1494f = str5;
        this.f1495g = str6;
        this.f1496h = str7;
        this.f1497i = str8;
        this.f1498j = str9;
        this.f1499k = str10;
        this.f1500l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f1489a;
            if (num != null ? num.equals(((h) aVar).f1489a) : ((h) aVar).f1489a == null) {
                String str = this.f1490b;
                if (str != null ? str.equals(((h) aVar).f1490b) : ((h) aVar).f1490b == null) {
                    String str2 = this.f1491c;
                    if (str2 != null ? str2.equals(((h) aVar).f1491c) : ((h) aVar).f1491c == null) {
                        String str3 = this.f1492d;
                        if (str3 != null ? str3.equals(((h) aVar).f1492d) : ((h) aVar).f1492d == null) {
                            String str4 = this.f1493e;
                            if (str4 != null ? str4.equals(((h) aVar).f1493e) : ((h) aVar).f1493e == null) {
                                String str5 = this.f1494f;
                                if (str5 != null ? str5.equals(((h) aVar).f1494f) : ((h) aVar).f1494f == null) {
                                    String str6 = this.f1495g;
                                    if (str6 != null ? str6.equals(((h) aVar).f1495g) : ((h) aVar).f1495g == null) {
                                        String str7 = this.f1496h;
                                        if (str7 != null ? str7.equals(((h) aVar).f1496h) : ((h) aVar).f1496h == null) {
                                            String str8 = this.f1497i;
                                            if (str8 != null ? str8.equals(((h) aVar).f1497i) : ((h) aVar).f1497i == null) {
                                                String str9 = this.f1498j;
                                                if (str9 != null ? str9.equals(((h) aVar).f1498j) : ((h) aVar).f1498j == null) {
                                                    String str10 = this.f1499k;
                                                    if (str10 != null ? str10.equals(((h) aVar).f1499k) : ((h) aVar).f1499k == null) {
                                                        String str11 = this.f1500l;
                                                        if (str11 != null ? str11.equals(((h) aVar).f1500l) : ((h) aVar).f1500l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f1489a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f1490b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f1491c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f1492d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f1493e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f1494f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f1495g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f1496h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f1497i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f1498j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f1499k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f1500l;
        return (str11 != null ? str11.hashCode() : 0) ^ hashCode11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f1489a);
        sb.append(", model=");
        sb.append(this.f1490b);
        sb.append(", hardware=");
        sb.append(this.f1491c);
        sb.append(", device=");
        sb.append(this.f1492d);
        sb.append(", product=");
        sb.append(this.f1493e);
        sb.append(", osBuild=");
        sb.append(this.f1494f);
        sb.append(", manufacturer=");
        sb.append(this.f1495g);
        sb.append(", fingerprint=");
        sb.append(this.f1496h);
        sb.append(", locale=");
        sb.append(this.f1497i);
        sb.append(", country=");
        sb.append(this.f1498j);
        sb.append(", mccMnc=");
        sb.append(this.f1499k);
        sb.append(", applicationBuild=");
        return AbstractC0005f.q(sb, this.f1500l, "}");
    }
}
