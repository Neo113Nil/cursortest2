package j6;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f5069a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5070b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5071c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5072d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5073e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5074f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5075h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5076i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final String f5077k;

    /* renamed from: l, reason: collision with root package name */
    public final String f5078l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f5069a = num;
        this.f5070b = str;
        this.f5071c = str2;
        this.f5072d = str3;
        this.f5073e = str4;
        this.f5074f = str5;
        this.g = str6;
        this.f5075h = str7;
        this.f5076i = str8;
        this.j = str9;
        this.f5077k = str10;
        this.f5078l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f5069a.equals(((h) aVar).f5069a)) {
            return false;
        }
        if (!this.f5070b.equals(((h) aVar).f5070b)) {
            return false;
        }
        if (!this.f5071c.equals(((h) aVar).f5071c)) {
            return false;
        }
        if (!this.f5072d.equals(((h) aVar).f5072d)) {
            return false;
        }
        if (!this.f5073e.equals(((h) aVar).f5073e)) {
            return false;
        }
        if (!this.f5074f.equals(((h) aVar).f5074f)) {
            return false;
        }
        if (!this.g.equals(((h) aVar).g)) {
            return false;
        }
        if (!this.f5075h.equals(((h) aVar).f5075h)) {
            return false;
        }
        if (!this.f5076i.equals(((h) aVar).f5076i)) {
            return false;
        }
        if (!this.j.equals(((h) aVar).j)) {
            return false;
        }
        if (this.f5077k.equals(((h) aVar).f5077k)) {
            return this.f5078l.equals(((h) aVar).f5078l);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.f5069a.hashCode() ^ 1000003) * 1000003) ^ this.f5070b.hashCode()) * 1000003) ^ this.f5071c.hashCode()) * 1000003) ^ this.f5072d.hashCode()) * 1000003) ^ this.f5073e.hashCode()) * 1000003) ^ this.f5074f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.f5075h.hashCode()) * 1000003) ^ this.f5076i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.f5077k.hashCode()) * 1000003) ^ this.f5078l.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f5069a);
        sb2.append(", model=");
        sb2.append(this.f5070b);
        sb2.append(", hardware=");
        sb2.append(this.f5071c);
        sb2.append(", device=");
        sb2.append(this.f5072d);
        sb2.append(", product=");
        sb2.append(this.f5073e);
        sb2.append(", osBuild=");
        sb2.append(this.f5074f);
        sb2.append(", manufacturer=");
        sb2.append(this.g);
        sb2.append(", fingerprint=");
        sb2.append(this.f5075h);
        sb2.append(", locale=");
        sb2.append(this.f5076i);
        sb2.append(", country=");
        sb2.append(this.j);
        sb2.append(", mccMnc=");
        sb2.append(this.f5077k);
        sb2.append(", applicationBuild=");
        return v4.a.o(sb2, this.f5078l, "}");
    }
}
