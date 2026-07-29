package org.apache.a.c.b;

import java.net.InetAddress;
import org.apache.a.c.b.e;
import org.apache.a.m;

/* compiled from: RouteTracker.java */
/* loaded from: classes2.dex */
public final class f implements Cloneable, e {

    /* renamed from: a, reason: collision with root package name */
    private final m f9675a;

    /* renamed from: b, reason: collision with root package name */
    private final InetAddress f9676b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9677c;

    /* renamed from: d, reason: collision with root package name */
    private m[] f9678d;
    private e.b e;
    private e.a f;
    private boolean g;

    public f(m mVar, InetAddress inetAddress) {
        if (mVar == null) {
            throw new IllegalArgumentException("Target host may not be null.");
        }
        this.f9675a = mVar;
        this.f9676b = inetAddress;
        this.e = e.b.PLAIN;
        this.f = e.a.PLAIN;
    }

    public f(b bVar) {
        this(bVar.a(), bVar.b());
    }

    public final void a(boolean z) {
        if (this.f9677c) {
            throw new IllegalStateException("Already connected.");
        }
        this.f9677c = true;
        this.g = z;
    }

    public final void a(m mVar, boolean z) {
        if (mVar == null) {
            throw new IllegalArgumentException("Proxy host may not be null.");
        }
        if (this.f9677c) {
            throw new IllegalStateException("Already connected.");
        }
        this.f9677c = true;
        this.f9678d = new m[]{mVar};
        this.g = z;
    }

    public final void b(boolean z) {
        if (!this.f9677c) {
            throw new IllegalStateException("No tunnel unless connected.");
        }
        if (this.f9678d == null) {
            throw new IllegalStateException("No tunnel without proxy.");
        }
        this.e = e.b.TUNNELLED;
        this.g = z;
    }

    public final void b(m mVar, boolean z) {
        if (mVar == null) {
            throw new IllegalArgumentException("Proxy host may not be null.");
        }
        if (!this.f9677c) {
            throw new IllegalStateException("No tunnel unless connected.");
        }
        if (this.f9678d == null) {
            throw new IllegalStateException("No proxy tunnel without proxy.");
        }
        m[] mVarArr = new m[this.f9678d.length + 1];
        System.arraycopy(this.f9678d, 0, mVarArr, 0, this.f9678d.length);
        mVarArr[mVarArr.length - 1] = mVar;
        this.f9678d = mVarArr;
        this.g = z;
    }

    public final void c(boolean z) {
        if (!this.f9677c) {
            throw new IllegalStateException("No layered protocol unless connected.");
        }
        this.f = e.a.LAYERED;
        this.g = z;
    }

    @Override // org.apache.a.c.b.e
    public final m a() {
        return this.f9675a;
    }

    @Override // org.apache.a.c.b.e
    public final InetAddress b() {
        return this.f9676b;
    }

    @Override // org.apache.a.c.b.e
    public final int c() {
        if (!this.f9677c) {
            return 0;
        }
        if (this.f9678d == null) {
            return 1;
        }
        return 1 + this.f9678d.length;
    }

    @Override // org.apache.a.c.b.e
    public final m a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Hop index must not be negative: " + i);
        }
        int c2 = c();
        if (i < c2) {
            if (i < c2 - 1) {
                return this.f9678d[i];
            }
            return this.f9675a;
        }
        throw new IllegalArgumentException("Hop index " + i + " exceeds tracked route length " + c2 + ".");
    }

    public final boolean d() {
        return this.f9677c;
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

    public final b h() {
        if (this.f9677c) {
            return new b(this.f9675a, this.f9676b, this.f9678d, this.g, this.e, this.f);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f9677c == fVar.f9677c && this.g == fVar.g && this.e == fVar.e && this.f == fVar.f && org.apache.a.k.f.a(this.f9675a, fVar.f9675a) && org.apache.a.k.f.a(this.f9676b, fVar.f9676b) && org.apache.a.k.f.a((Object[]) this.f9678d, (Object[]) fVar.f9678d);
    }

    public final int hashCode() {
        int a2 = org.apache.a.k.f.a(org.apache.a.k.f.a(17, this.f9675a), this.f9676b);
        if (this.f9678d != null) {
            for (int i = 0; i < this.f9678d.length; i++) {
                a2 = org.apache.a.k.f.a(a2, this.f9678d[i]);
            }
        }
        return org.apache.a.k.f.a(org.apache.a.k.f.a(org.apache.a.k.f.a(org.apache.a.k.f.a(a2, this.f9677c), this.g), this.e), this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((c() * 30) + 50);
        sb.append("RouteTracker[");
        if (this.f9676b != null) {
            sb.append(this.f9676b);
            sb.append("->");
        }
        sb.append('{');
        if (this.f9677c) {
            sb.append('c');
        }
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
        if (this.f9678d != null) {
            for (int i = 0; i < this.f9678d.length; i++) {
                sb.append(this.f9678d[i]);
                sb.append("->");
            }
        }
        sb.append(this.f9675a);
        sb.append(']');
        return sb.toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
