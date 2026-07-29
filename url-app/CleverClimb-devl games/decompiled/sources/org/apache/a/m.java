package org.apache.a;

import com.mopub.common.Constants;
import java.io.Serializable;
import java.util.Locale;

/* compiled from: HttpHost.java */
/* loaded from: classes2.dex */
public final class m implements Serializable, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    protected final String f9998a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f9999b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f10000c;

    /* renamed from: d, reason: collision with root package name */
    protected final String f10001d;

    public m(String str, int i, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Host name may not be null");
        }
        this.f9998a = str;
        this.f9999b = str.toLowerCase(Locale.ENGLISH);
        if (str2 != null) {
            this.f10001d = str2.toLowerCase(Locale.ENGLISH);
        } else {
            this.f10001d = Constants.HTTP;
        }
        this.f10000c = i;
    }

    public m(String str, int i) {
        this(str, i, null);
    }

    public String a() {
        return this.f9998a;
    }

    public int b() {
        return this.f10000c;
    }

    public String c() {
        return this.f10001d;
    }

    public String d() {
        org.apache.a.k.b bVar = new org.apache.a.k.b(32);
        bVar.a(this.f10001d);
        bVar.a("://");
        bVar.a(this.f9998a);
        if (this.f10000c != -1) {
            bVar.a(':');
            bVar.a(Integer.toString(this.f10000c));
        }
        return bVar.toString();
    }

    public String e() {
        if (this.f10000c != -1) {
            org.apache.a.k.b bVar = new org.apache.a.k.b(this.f9998a.length() + 6);
            bVar.a(this.f9998a);
            bVar.a(":");
            bVar.a(Integer.toString(this.f10000c));
            return bVar.toString();
        }
        return this.f9998a;
    }

    public String toString() {
        return d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f9999b.equals(mVar.f9999b) && this.f10000c == mVar.f10000c && this.f10001d.equals(mVar.f10001d);
    }

    public int hashCode() {
        return org.apache.a.k.f.a(org.apache.a.k.f.a(org.apache.a.k.f.a(17, this.f9999b), this.f10000c), this.f10001d);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
