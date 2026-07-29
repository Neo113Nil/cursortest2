package org.apache.a.c.b;

import java.net.InetAddress;
import org.apache.a.c.b.e;
import org.apache.a.m;

/* compiled from: HttpRoute.java */
/* loaded from: classes2.dex */
public final class b implements Cloneable, e {

    /* renamed from: a, reason: collision with root package name */
    private static final m[] f9665a = new m[0];

    /* renamed from: b, reason: collision with root package name */
    private final m f9666b;

    /* renamed from: c, reason: collision with root package name */
    private final InetAddress f9667c;

    /* renamed from: d, reason: collision with root package name */
    private final m[] f9668d;
    private final e.b e;
    private final e.a f;
    private final boolean g;

    private b(InetAddress inetAddress, m mVar, m[] mVarArr, boolean z, e.b bVar, e.a aVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("Target host may not be null.");
        }
        if (mVarArr == null) {
            throw new IllegalArgumentException("Proxies may not be null.");
        }
        if (bVar == e.b.TUNNELLED && mVarArr.length == 0) {
            throw new IllegalArgumentException("Proxy required if tunnelled.");
        }
        bVar = bVar == null ? e.b.PLAIN : bVar;
        aVar = aVar == null ? e.a.PLAIN : aVar;
        this.f9666b = mVar;
        this.f9667c = inetAddress;
        this.f9668d = mVarArr;
        this.g = z;
        this.e = bVar;
        this.f = aVar;
    }

    public b(m mVar, InetAddress inetAddress, m[] mVarArr, boolean z, e.b bVar, e.a aVar) {
        this(inetAddress, mVar, a(mVarArr), z, bVar, aVar);
    }

    public b(m mVar, InetAddress inetAddress, boolean z) {
        this(inetAddress, mVar, f9665a, z, e.b.PLAIN, e.a.PLAIN);
    }

    public b(m mVar) {
        this((InetAddress) null, mVar, f9665a, false, e.b.PLAIN, e.a.PLAIN);
    }

    public b(m mVar, InetAddress inetAddress, m mVar2, boolean z) {
        this(inetAddress, mVar, a(mVar2), z, z ? e.b.TUNNELLED : e.b.PLAIN, z ? e.a.LAYERED : e.a.PLAIN);
        if (mVar2 == null) {
            throw new IllegalArgumentException("Proxy host may not be null.");
        }
    }

    private static m[] a(m mVar) {
        if (mVar == null) {
            return f9665a;
        }
        return new m[]{mVar};
    }

    private static m[] a(m[] mVarArr) {
        if (mVarArr == null || mVarArr.length < 1) {
            return f9665a;
        }
        for (m mVar : mVarArr) {
            if (mVar == null) {
                throw new IllegalArgumentException("Proxy chain may not contain null elements.");
            }
        }
        m[] mVarArr2 = new m[mVarArr.length];
        System.arraycopy(mVarArr, 0, mVarArr2, 0, mVarArr.length);
        return mVarArr2;
    }

    @Override // org.apache.a.c.b.e
    public final m a() {
        return this.f9666b;
    }

    @Override // org.apache.a.c.b.e
    public final InetAddress b() {
        return this.f9667c;
    }

    @Override // org.apache.a.c.b.e
    public final int c() {
        return this.f9668d.length + 1;
    }

    @Override // org.apache.a.c.b.e
    public final m a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Hop index must not be negative: " + i);
        }
        int c2 = c();
        if (i < c2) {
            if (i < c2 - 1) {
                return this.f9668d[i];
            }
            return this.f9666b;
        }
        throw new IllegalArgumentException("Hop index " + i + " exceeds route length " + c2);
    }

    public final m d() {
        if (this.f9668d.length == 0) {
            return null;
        }
        return this.f9668d[0];
    }

    @Override // org.apache.a.c.b.e
    public final boolean e() {
        return this.e == e.b.TUNNELLED;
    }

    @Override // org.apache.a.c.b.e
    public final boolean f() {
        return this.f == e.a.LAYERED;
    }

    @Override // org.apache.a.c.b.e
    public final boolean g() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.g == bVar.g && this.e == bVar.e && this.f == bVar.f && org.apache.a.k.f.a(this.f9666b, bVar.f9666b) && org.apache.a.k.f.a(this.f9667c, bVar.f9667c) && org.apache.a.k.f.a((Object[]) this.f9668d, (Object[]) bVar.f9668d);
    }

    public final int hashCode() {
        int a2 = org.apache.a.k.f.a(org.apache.a.k.f.a(17, this.f9666b), this.f9667c);
        for (int i = 0; i < this.f9668d.length; i++) {
            a2 = org.apache.a.k.f.a(a2, this.f9668d[i]);
        }
        return org.apache.a.k.f.a(org.apache.a.k.f.a(org.apache.a.k.f.a(a2, this.g), this.e), this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((c() * 30) + 50);
        sb.append("HttpRoute[");
        if (this.f9667c != null) {
            sb.append(this.f9667c);
            sb.append("->");
        }
        sb.append('{');
        if (this.e == e.b.TUNNELLED) {
            sb.append('t');
        }
        if (this.f == e.a.LAYERED) {
            sb.append('l');
        }
        if (this.g) {
            sb.append('s');
        }
        sb.append("}->");
        for (m mVar : this.f9668d) {
            sb.append(mVar);
            sb.append("->");
        }
        sb.append(this.f9666b);
        sb.append(']');
        return sb.toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
