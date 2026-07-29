package com.facebook.appevents;

import com.facebook.AccessToken;
import com.facebook.internal.ab;
import java.io.Serializable;

/* compiled from: AccessTokenAppIdPair.java */
/* loaded from: classes.dex */
class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final String f5940a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5941b;

    public a(AccessToken accessToken) {
        this(accessToken.getToken(), com.facebook.l.i());
    }

    public a(String str, String str2) {
        this.f5940a = ab.a(str) ? null : str;
        this.f5941b = str2;
    }

    public String a() {
        return this.f5940a;
    }

    public String b() {
        return this.f5941b;
    }

    public int hashCode() {
        return (this.f5940a == null ? 0 : this.f5940a.hashCode()) ^ (this.f5941b != null ? this.f5941b.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return ab.a(aVar.f5940a, this.f5940a) && ab.a(aVar.f5941b, this.f5941b);
    }

    /* compiled from: AccessTokenAppIdPair.java */
    /* renamed from: com.facebook.appevents.a$a, reason: collision with other inner class name */
    static class C0360a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final String f5942a;

        /* renamed from: b, reason: collision with root package name */
        private final String f5943b;

        private C0360a(String str, String str2) {
            this.f5942a = str;
            this.f5943b = str2;
        }

        private Object readResolve() {
            return new a(this.f5942a, this.f5943b);
        }
    }

    private Object writeReplace() {
        return new C0360a(this.f5940a, this.f5941b);
    }
}
