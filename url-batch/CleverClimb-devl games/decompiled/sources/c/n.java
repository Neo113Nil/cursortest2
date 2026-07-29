package c;

/* compiled from: Segment.java */
/* loaded from: classes.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    final byte[] f2216a;

    /* renamed from: b, reason: collision with root package name */
    int f2217b;

    /* renamed from: c, reason: collision with root package name */
    int f2218c;

    /* renamed from: d, reason: collision with root package name */
    boolean f2219d;
    boolean e;
    n f;
    n g;

    n() {
        this.f2216a = new byte[8192];
        this.e = true;
        this.f2219d = false;
    }

    n(n nVar) {
        this(nVar.f2216a, nVar.f2217b, nVar.f2218c);
        nVar.f2219d = true;
    }

    n(byte[] bArr, int i, int i2) {
        this.f2216a = bArr;
        this.f2217b = i;
        this.f2218c = i2;
        this.e = false;
        this.f2219d = true;
    }

    public n a() {
        n nVar = this.f != this ? this.f : null;
        this.g.f = this.f;
        this.f.g = this.g;
        this.f = null;
        this.g = null;
        return nVar;
    }

    public n a(n nVar) {
        nVar.g = this;
        nVar.f = this.f;
        this.f.g = nVar;
        this.f = nVar;
        return nVar;
    }

    public n a(int i) {
        n a2;
        if (i <= 0 || i > this.f2218c - this.f2217b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            a2 = new n(this);
        } else {
            a2 = o.a();
            System.arraycopy(this.f2216a, this.f2217b, a2.f2216a, 0, i);
        }
        a2.f2218c = a2.f2217b + i;
        this.f2217b += i;
        this.g.a(a2);
        return a2;
    }

    public void b() {
        if (this.g == this) {
            throw new IllegalStateException();
        }
        if (this.g.e) {
            int i = this.f2218c - this.f2217b;
            if (i > (8192 - this.g.f2218c) + (this.g.f2219d ? 0 : this.g.f2217b)) {
                return;
            }
            a(this.g, i);
            a();
            o.a(this);
        }
    }

    public void a(n nVar, int i) {
        if (!nVar.e) {
            throw new IllegalArgumentException();
        }
        if (nVar.f2218c + i > 8192) {
            if (nVar.f2219d) {
                throw new IllegalArgumentException();
            }
            if ((nVar.f2218c + i) - nVar.f2217b > 8192) {
                throw new IllegalArgumentException();
            }
            System.arraycopy(nVar.f2216a, nVar.f2217b, nVar.f2216a, 0, nVar.f2218c - nVar.f2217b);
            nVar.f2218c -= nVar.f2217b;
            nVar.f2217b = 0;
        }
        System.arraycopy(this.f2216a, this.f2217b, nVar.f2216a, nVar.f2218c, i);
        nVar.f2218c += i;
        this.f2217b += i;
    }
}
