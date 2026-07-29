package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b<T> {

    /* renamed from: a, reason: collision with root package name */
    private String f3328a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f3329b;

    /* renamed from: c, reason: collision with root package name */
    private String f3330c;

    /* renamed from: d, reason: collision with root package name */
    private final JSONObject f3331d;
    private String e;
    private final T f;
    private final boolean g;
    private final int h;
    private int i;
    private final int j;
    private final int k;
    private final boolean l;

    public static class a<T> {

        /* renamed from: a, reason: collision with root package name */
        String f3332a;

        /* renamed from: b, reason: collision with root package name */
        String f3333b;

        /* renamed from: c, reason: collision with root package name */
        String f3334c;
        JSONObject e;
        T f;
        int i;
        int j;
        boolean k;
        boolean g = true;
        int h = 1;

        /* renamed from: d, reason: collision with root package name */
        Map<String, String> f3335d = new HashMap();

        public a(j jVar) {
            this.i = ((Integer) jVar.a(com.applovin.impl.sdk.b.b.dH)).intValue();
            this.j = ((Integer) jVar.a(com.applovin.impl.sdk.b.b.dG)).intValue();
            this.k = ((Boolean) jVar.a(com.applovin.impl.sdk.b.b.eU)).booleanValue();
        }

        public a<T> a(int i) {
            this.h = i;
            return this;
        }

        public a<T> a(T t) {
            this.f = t;
            return this;
        }

        public a<T> a(String str) {
            this.f3333b = str;
            return this;
        }

        public a<T> a(Map<String, String> map) {
            this.f3335d = map;
            return this;
        }

        public a<T> a(JSONObject jSONObject) {
            this.e = jSONObject;
            return this;
        }

        public a<T> a(boolean z) {
            this.k = z;
            return this;
        }

        public b<T> a() {
            return new b<>(this);
        }

        public a<T> b(int i) {
            this.i = i;
            return this;
        }

        public a<T> b(String str) {
            this.f3332a = str;
            return this;
        }

        public a<T> c(int i) {
            this.j = i;
            return this;
        }

        public a<T> c(String str) {
            this.f3334c = str;
            return this;
        }
    }

    protected b(a<T> aVar) {
        this.f3328a = aVar.f3333b;
        this.f3329b = aVar.f3335d;
        this.f3330c = aVar.f3332a;
        this.f3331d = aVar.e;
        this.e = aVar.f3334c;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.h;
        this.j = aVar.i;
        this.k = aVar.j;
        this.l = aVar.k;
    }

    public static <T> a<T> a(j jVar) {
        return new a<>(jVar);
    }

    public String a() {
        return this.f3328a;
    }

    public void a(int i) {
        this.i = i;
    }

    public void a(String str) {
        this.f3328a = str;
    }

    public Map<String, String> b() {
        return this.f3329b;
    }

    public void b(String str) {
        this.f3330c = str;
    }

    public String c() {
        return this.f3330c;
    }

    public JSONObject d() {
        return this.f3331d;
    }

    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f3328a == null ? bVar.f3328a != null : !this.f3328a.equals(bVar.f3328a)) {
            return false;
        }
        if (this.f3329b == null ? bVar.f3329b != null : !this.f3329b.equals(bVar.f3329b)) {
            return false;
        }
        if (this.e == null ? bVar.e != null : !this.e.equals(bVar.e)) {
            return false;
        }
        if (this.f3330c == null ? bVar.f3330c != null : !this.f3330c.equals(bVar.f3330c)) {
            return false;
        }
        if (this.f3331d == null ? bVar.f3331d != null : !this.f3331d.equals(bVar.f3331d)) {
            return false;
        }
        if (this.f == null ? bVar.f == null : this.f.equals(bVar.f)) {
            return this.g == bVar.g && this.h == bVar.h && this.i == bVar.i && this.j == bVar.j && this.k == bVar.k && this.l == bVar.l;
        }
        return false;
    }

    public T f() {
        return this.f;
    }

    public boolean g() {
        return this.g;
    }

    public int h() {
        return this.h - this.i;
    }

    public int hashCode() {
        int hashCode = (((((((((((((((((((super.hashCode() * 31) + (this.f3328a != null ? this.f3328a.hashCode() : 0)) * 31) + (this.e != null ? this.e.hashCode() : 0)) * 31) + (this.f3330c != null ? this.f3330c.hashCode() : 0)) * 31) + (this.f != null ? this.f.hashCode() : 0)) * 31) + (this.g ? 1 : 0)) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31) + (this.l ? 1 : 0);
        if (this.f3329b != null) {
            hashCode = (hashCode * 31) + this.f3329b.hashCode();
        }
        if (this.f3331d == null) {
            return hashCode;
        }
        char[] charArray = this.f3331d.toString().toCharArray();
        Arrays.sort(charArray);
        return (hashCode * 31) + new String(charArray).hashCode();
    }

    public int i() {
        return this.i;
    }

    public int j() {
        return this.j;
    }

    public int k() {
        return this.k;
    }

    public boolean l() {
        return this.l;
    }

    public String toString() {
        return "HttpRequest {endpoint=" + this.f3328a + ", backupEndpoint=" + this.e + ", httpMethod=" + this.f3330c + ", body=" + this.f3331d + ", emptyResponse=" + this.f + ", requiresResponse=" + this.g + ", initialRetryAttempts=" + this.h + ", retryAttemptsLeft=" + this.i + ", timeoutMillis=" + this.j + ", retryDelayMillis=" + this.k + ", encodingEnabled=" + this.l + '}';
    }
}
