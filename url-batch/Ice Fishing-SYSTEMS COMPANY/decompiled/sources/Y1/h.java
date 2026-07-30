package Y1;

import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f3921a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3922b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3923c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3924d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3925e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3926f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3927g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3928h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f3929j;

    /* renamed from: k, reason: collision with root package name */
    public final String f3930k;

    /* renamed from: l, reason: collision with root package name */
    public final String f3931l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f3921a = num;
        this.f3922b = str;
        this.f3923c = str2;
        this.f3924d = str3;
        this.f3925e = str4;
        this.f3926f = str5;
        this.f3927g = str6;
        this.f3928h = str7;
        this.i = str8;
        this.f3929j = str9;
        this.f3930k = str10;
        this.f3931l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f3921a;
            if (num != null ? num.equals(((h) aVar).f3921a) : ((h) aVar).f3921a == null) {
                String str = this.f3922b;
                if (str != null ? str.equals(((h) aVar).f3922b) : ((h) aVar).f3922b == null) {
                    String str2 = this.f3923c;
                    if (str2 != null ? str2.equals(((h) aVar).f3923c) : ((h) aVar).f3923c == null) {
                        String str3 = this.f3924d;
                        if (str3 != null ? str3.equals(((h) aVar).f3924d) : ((h) aVar).f3924d == null) {
                            String str4 = this.f3925e;
                            if (str4 != null ? str4.equals(((h) aVar).f3925e) : ((h) aVar).f3925e == null) {
                                String str5 = this.f3926f;
                                if (str5 != null ? str5.equals(((h) aVar).f3926f) : ((h) aVar).f3926f == null) {
                                    String str6 = this.f3927g;
                                    if (str6 != null ? str6.equals(((h) aVar).f3927g) : ((h) aVar).f3927g == null) {
                                        String str7 = this.f3928h;
                                        if (str7 != null ? str7.equals(((h) aVar).f3928h) : ((h) aVar).f3928h == null) {
                                            String str8 = this.i;
                                            if (str8 != null ? str8.equals(((h) aVar).i) : ((h) aVar).i == null) {
                                                String str9 = this.f3929j;
                                                if (str9 != null ? str9.equals(((h) aVar).f3929j) : ((h) aVar).f3929j == null) {
                                                    String str10 = this.f3930k;
                                                    if (str10 != null ? str10.equals(((h) aVar).f3930k) : ((h) aVar).f3930k == null) {
                                                        String str11 = this.f3931l;
                                                        if (str11 != null ? str11.equals(((h) aVar).f3931l) : ((h) aVar).f3931l == null) {
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
        Integer num = this.f3921a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f3922b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f3923c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f3924d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f3925e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f3926f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f3927g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f3928h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f3929j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f3930k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f3931l;
        return (str11 != null ? str11.hashCode() : 0) ^ hashCode11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f3921a);
        sb.append(", model=");
        sb.append(this.f3922b);
        sb.append(", hardware=");
        sb.append(this.f3923c);
        sb.append(", device=");
        sb.append(this.f3924d);
        sb.append(", product=");
        sb.append(this.f3925e);
        sb.append(", osBuild=");
        sb.append(this.f3926f);
        sb.append(", manufacturer=");
        sb.append(this.f3927g);
        sb.append(", fingerprint=");
        sb.append(this.f3928h);
        sb.append(", locale=");
        sb.append(this.i);
        sb.append(", country=");
        sb.append(this.f3929j);
        sb.append(", mccMnc=");
        sb.append(this.f3930k);
        sb.append(", applicationBuild=");
        return AbstractC5051n.g(sb, this.f3931l, "}");
    }
}
