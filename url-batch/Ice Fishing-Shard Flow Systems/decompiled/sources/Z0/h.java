package Z0;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f2972a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2973b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2974c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2975d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2976e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2977f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2978g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2979h;

    /* renamed from: i, reason: collision with root package name */
    public final String f2980i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final String f2981k;

    /* renamed from: l, reason: collision with root package name */
    public final String f2982l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f2972a = num;
        this.f2973b = str;
        this.f2974c = str2;
        this.f2975d = str3;
        this.f2976e = str4;
        this.f2977f = str5;
        this.f2978g = str6;
        this.f2979h = str7;
        this.f2980i = str8;
        this.j = str9;
        this.f2981k = str10;
        this.f2982l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f2972a;
            if (num != null ? num.equals(((h) aVar).f2972a) : ((h) aVar).f2972a == null) {
                String str = this.f2973b;
                if (str != null ? str.equals(((h) aVar).f2973b) : ((h) aVar).f2973b == null) {
                    String str2 = this.f2974c;
                    if (str2 != null ? str2.equals(((h) aVar).f2974c) : ((h) aVar).f2974c == null) {
                        String str3 = this.f2975d;
                        if (str3 != null ? str3.equals(((h) aVar).f2975d) : ((h) aVar).f2975d == null) {
                            String str4 = this.f2976e;
                            if (str4 != null ? str4.equals(((h) aVar).f2976e) : ((h) aVar).f2976e == null) {
                                String str5 = this.f2977f;
                                if (str5 != null ? str5.equals(((h) aVar).f2977f) : ((h) aVar).f2977f == null) {
                                    String str6 = this.f2978g;
                                    if (str6 != null ? str6.equals(((h) aVar).f2978g) : ((h) aVar).f2978g == null) {
                                        String str7 = this.f2979h;
                                        if (str7 != null ? str7.equals(((h) aVar).f2979h) : ((h) aVar).f2979h == null) {
                                            String str8 = this.f2980i;
                                            if (str8 != null ? str8.equals(((h) aVar).f2980i) : ((h) aVar).f2980i == null) {
                                                String str9 = this.j;
                                                if (str9 != null ? str9.equals(((h) aVar).j) : ((h) aVar).j == null) {
                                                    String str10 = this.f2981k;
                                                    if (str10 != null ? str10.equals(((h) aVar).f2981k) : ((h) aVar).f2981k == null) {
                                                        String str11 = this.f2982l;
                                                        if (str11 != null ? str11.equals(((h) aVar).f2982l) : ((h) aVar).f2982l == null) {
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
        Integer num = this.f2972a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f2973b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f2974c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f2975d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f2976e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f2977f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f2978g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f2979h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f2980i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f2981k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f2982l;
        return (str11 != null ? str11.hashCode() : 0) ^ hashCode11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f2972a);
        sb.append(", model=");
        sb.append(this.f2973b);
        sb.append(", hardware=");
        sb.append(this.f2974c);
        sb.append(", device=");
        sb.append(this.f2975d);
        sb.append(", product=");
        sb.append(this.f2976e);
        sb.append(", osBuild=");
        sb.append(this.f2977f);
        sb.append(", manufacturer=");
        sb.append(this.f2978g);
        sb.append(", fingerprint=");
        sb.append(this.f2979h);
        sb.append(", locale=");
        sb.append(this.f2980i);
        sb.append(", country=");
        sb.append(this.j);
        sb.append(", mccMnc=");
        sb.append(this.f2981k);
        sb.append(", applicationBuild=");
        return r4.f.f(sb, this.f2982l, "}");
    }
}
