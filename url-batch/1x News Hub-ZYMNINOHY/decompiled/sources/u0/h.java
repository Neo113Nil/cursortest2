package u0;

import E1.AbstractC0033i;

/* loaded from: classes.dex */
public final class h extends AbstractC1217a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f10491a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10492b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10493c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10494d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10495e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10496g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10497h;

    /* renamed from: i, reason: collision with root package name */
    public final String f10498i;

    /* renamed from: j, reason: collision with root package name */
    public final String f10499j;

    /* renamed from: k, reason: collision with root package name */
    public final String f10500k;

    /* renamed from: l, reason: collision with root package name */
    public final String f10501l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f10491a = num;
        this.f10492b = str;
        this.f10493c = str2;
        this.f10494d = str3;
        this.f10495e = str4;
        this.f = str5;
        this.f10496g = str6;
        this.f10497h = str7;
        this.f10498i = str8;
        this.f10499j = str9;
        this.f10500k = str10;
        this.f10501l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1217a) {
            AbstractC1217a abstractC1217a = (AbstractC1217a) obj;
            Integer num = this.f10491a;
            if (num != null ? num.equals(((h) abstractC1217a).f10491a) : ((h) abstractC1217a).f10491a == null) {
                String str = this.f10492b;
                if (str != null ? str.equals(((h) abstractC1217a).f10492b) : ((h) abstractC1217a).f10492b == null) {
                    String str2 = this.f10493c;
                    if (str2 != null ? str2.equals(((h) abstractC1217a).f10493c) : ((h) abstractC1217a).f10493c == null) {
                        String str3 = this.f10494d;
                        if (str3 != null ? str3.equals(((h) abstractC1217a).f10494d) : ((h) abstractC1217a).f10494d == null) {
                            String str4 = this.f10495e;
                            if (str4 != null ? str4.equals(((h) abstractC1217a).f10495e) : ((h) abstractC1217a).f10495e == null) {
                                String str5 = this.f;
                                if (str5 != null ? str5.equals(((h) abstractC1217a).f) : ((h) abstractC1217a).f == null) {
                                    String str6 = this.f10496g;
                                    if (str6 != null ? str6.equals(((h) abstractC1217a).f10496g) : ((h) abstractC1217a).f10496g == null) {
                                        String str7 = this.f10497h;
                                        if (str7 != null ? str7.equals(((h) abstractC1217a).f10497h) : ((h) abstractC1217a).f10497h == null) {
                                            String str8 = this.f10498i;
                                            if (str8 != null ? str8.equals(((h) abstractC1217a).f10498i) : ((h) abstractC1217a).f10498i == null) {
                                                String str9 = this.f10499j;
                                                if (str9 != null ? str9.equals(((h) abstractC1217a).f10499j) : ((h) abstractC1217a).f10499j == null) {
                                                    String str10 = this.f10500k;
                                                    if (str10 != null ? str10.equals(((h) abstractC1217a).f10500k) : ((h) abstractC1217a).f10500k == null) {
                                                        String str11 = this.f10501l;
                                                        if (str11 != null ? str11.equals(((h) abstractC1217a).f10501l) : ((h) abstractC1217a).f10501l == null) {
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
        Integer num = this.f10491a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f10492b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f10493c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f10494d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f10495e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f10496g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f10497h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f10498i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f10499j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f10500k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f10501l;
        return (str11 != null ? str11.hashCode() : 0) ^ hashCode11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f10491a);
        sb.append(", model=");
        sb.append(this.f10492b);
        sb.append(", hardware=");
        sb.append(this.f10493c);
        sb.append(", device=");
        sb.append(this.f10494d);
        sb.append(", product=");
        sb.append(this.f10495e);
        sb.append(", osBuild=");
        sb.append(this.f);
        sb.append(", manufacturer=");
        sb.append(this.f10496g);
        sb.append(", fingerprint=");
        sb.append(this.f10497h);
        sb.append(", locale=");
        sb.append(this.f10498i);
        sb.append(", country=");
        sb.append(this.f10499j);
        sb.append(", mccMnc=");
        sb.append(this.f10500k);
        sb.append(", applicationBuild=");
        return AbstractC0033i.m(sb, this.f10501l, "}");
    }
}
