package C0;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f151a;

    /* renamed from: b, reason: collision with root package name */
    public final String f152b;

    /* renamed from: c, reason: collision with root package name */
    public final String f153c;

    /* renamed from: d, reason: collision with root package name */
    public final String f154d;

    /* renamed from: e, reason: collision with root package name */
    public final String f155e;

    /* renamed from: f, reason: collision with root package name */
    public final String f156f;

    /* renamed from: g, reason: collision with root package name */
    public final String f157g;

    /* renamed from: h, reason: collision with root package name */
    public final String f158h;

    /* renamed from: i, reason: collision with root package name */
    public final String f159i;

    /* renamed from: j, reason: collision with root package name */
    public final String f160j;

    /* renamed from: k, reason: collision with root package name */
    public final String f161k;

    /* renamed from: l, reason: collision with root package name */
    public final String f162l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f151a = num;
        this.f152b = str;
        this.f153c = str2;
        this.f154d = str3;
        this.f155e = str4;
        this.f156f = str5;
        this.f157g = str6;
        this.f158h = str7;
        this.f159i = str8;
        this.f160j = str9;
        this.f161k = str10;
        this.f162l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f151a;
            if (num != null ? num.equals(((h) aVar).f151a) : ((h) aVar).f151a == null) {
                String str = this.f152b;
                if (str != null ? str.equals(((h) aVar).f152b) : ((h) aVar).f152b == null) {
                    String str2 = this.f153c;
                    if (str2 != null ? str2.equals(((h) aVar).f153c) : ((h) aVar).f153c == null) {
                        String str3 = this.f154d;
                        if (str3 != null ? str3.equals(((h) aVar).f154d) : ((h) aVar).f154d == null) {
                            String str4 = this.f155e;
                            if (str4 != null ? str4.equals(((h) aVar).f155e) : ((h) aVar).f155e == null) {
                                String str5 = this.f156f;
                                if (str5 != null ? str5.equals(((h) aVar).f156f) : ((h) aVar).f156f == null) {
                                    String str6 = this.f157g;
                                    if (str6 != null ? str6.equals(((h) aVar).f157g) : ((h) aVar).f157g == null) {
                                        String str7 = this.f158h;
                                        if (str7 != null ? str7.equals(((h) aVar).f158h) : ((h) aVar).f158h == null) {
                                            String str8 = this.f159i;
                                            if (str8 != null ? str8.equals(((h) aVar).f159i) : ((h) aVar).f159i == null) {
                                                String str9 = this.f160j;
                                                if (str9 != null ? str9.equals(((h) aVar).f160j) : ((h) aVar).f160j == null) {
                                                    String str10 = this.f161k;
                                                    if (str10 != null ? str10.equals(((h) aVar).f161k) : ((h) aVar).f161k == null) {
                                                        String str11 = this.f162l;
                                                        if (str11 != null ? str11.equals(((h) aVar).f162l) : ((h) aVar).f162l == null) {
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
        Integer num = this.f151a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f152b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f153c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f154d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f155e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f156f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f157g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f158h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f159i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f160j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f161k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f162l;
        return (str11 != null ? str11.hashCode() : 0) ^ hashCode11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f151a);
        sb.append(", model=");
        sb.append(this.f152b);
        sb.append(", hardware=");
        sb.append(this.f153c);
        sb.append(", device=");
        sb.append(this.f154d);
        sb.append(", product=");
        sb.append(this.f155e);
        sb.append(", osBuild=");
        sb.append(this.f156f);
        sb.append(", manufacturer=");
        sb.append(this.f157g);
        sb.append(", fingerprint=");
        sb.append(this.f158h);
        sb.append(", locale=");
        sb.append(this.f159i);
        sb.append(", country=");
        sb.append(this.f160j);
        sb.append(", mccMnc=");
        sb.append(this.f161k);
        sb.append(", applicationBuild=");
        return N.p.b(sb, this.f162l, "}");
    }
}
