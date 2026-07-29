package com.applovin.impl.mediation.a;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final g f2663a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2664b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2665c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2666d;
    private final String e;

    public interface a {
        void a(f fVar);
    }

    private f(g gVar, com.applovin.impl.mediation.e eVar, String str, String str2) {
        this.f2663a = gVar;
        this.e = str2;
        if (str != null) {
            this.f2666d = str.substring(0, Math.min(str.length(), gVar.a()));
        } else {
            this.f2666d = null;
        }
        if (eVar != null) {
            this.f2664b = eVar.e();
            this.f2665c = eVar.f();
        } else {
            this.f2664b = null;
            this.f2665c = null;
        }
    }

    public static f a(g gVar, com.applovin.impl.mediation.e eVar, String str) {
        if (gVar == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (eVar != null) {
            return new f(gVar, eVar, str, null);
        }
        throw new IllegalArgumentException("No adapterWrapper specified");
    }

    public static f a(g gVar, String str) {
        return b(gVar, null, str);
    }

    public static f b(g gVar, com.applovin.impl.mediation.e eVar, String str) {
        if (gVar != null) {
            return new f(gVar, eVar, null, str);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public g a() {
        return this.f2663a;
    }

    public String b() {
        return this.f2664b;
    }

    public String c() {
        return this.f2665c;
    }

    public String d() {
        return this.f2666d;
    }

    public String e() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SignalCollectionResult{mSignalProviderSpec=");
        sb.append(this.f2663a);
        sb.append(", mSdkVersion='");
        sb.append(this.f2664b);
        sb.append('\'');
        sb.append(", mAdapterVersion='");
        sb.append(this.f2665c);
        sb.append('\'');
        sb.append(", mSignalDataLength='");
        sb.append(this.f2666d != null ? this.f2666d.length() : 0);
        sb.append('\'');
        sb.append(", mErrorMessage=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
