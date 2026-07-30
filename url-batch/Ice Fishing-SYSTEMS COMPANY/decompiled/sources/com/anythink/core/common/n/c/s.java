package com.anythink.core.common.n.c;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    static final int f16070a = 8192;

    /* renamed from: b, reason: collision with root package name */
    static final int f16071b = 1024;

    /* renamed from: c, reason: collision with root package name */
    final byte[] f16072c;

    /* renamed from: d, reason: collision with root package name */
    int f16073d;

    /* renamed from: e, reason: collision with root package name */
    int f16074e;

    /* renamed from: f, reason: collision with root package name */
    boolean f16075f;

    /* renamed from: g, reason: collision with root package name */
    boolean f16076g;

    /* renamed from: h, reason: collision with root package name */
    s f16077h;
    s i;

    public s() {
        this.f16072c = new byte[f16070a];
        this.f16076g = true;
        this.f16075f = false;
    }

    public final s a() {
        this.f16075f = true;
        return new s(this.f16072c, this.f16073d, this.f16074e, true, false);
    }

    public final s b() {
        return new s((byte[]) this.f16072c.clone(), this.f16073d, this.f16074e, false, true);
    }

    public final s c() {
        s sVar = this.f16077h;
        s sVar2 = sVar != this ? sVar : null;
        s sVar3 = this.i;
        sVar3.f16077h = sVar;
        this.f16077h.i = sVar3;
        this.f16077h = null;
        this.i = null;
        return sVar2;
    }

    public final void d() {
        s sVar = this.i;
        if (sVar == this) {
            throw new IllegalStateException();
        }
        if (sVar.f16076g) {
            int i = this.f16074e - this.f16073d;
            if (i > (8192 - sVar.f16074e) + (sVar.f16075f ? 0 : sVar.f16073d)) {
                return;
            }
            a(sVar, i);
            c();
            t.a(this);
        }
    }

    public final s a(s sVar) {
        sVar.i = this;
        sVar.f16077h = this.f16077h;
        this.f16077h.i = sVar;
        this.f16077h = sVar;
        return sVar;
    }

    public s(byte[] bArr, int i, int i4, boolean z8, boolean z9) {
        this.f16072c = bArr;
        this.f16073d = i;
        this.f16074e = i4;
        this.f16075f = z8;
        this.f16076g = z9;
    }

    public final s a(int i) {
        s a9;
        if (i > 0 && i <= this.f16074e - this.f16073d) {
            if (i >= f16071b) {
                a9 = a();
            } else {
                a9 = t.a();
                System.arraycopy(this.f16072c, this.f16073d, a9.f16072c, 0, i);
            }
            a9.f16074e = a9.f16073d + i;
            this.f16073d += i;
            this.i.a(a9);
            return a9;
        }
        throw new IllegalArgumentException();
    }

    public final void a(s sVar, int i) {
        if (sVar.f16076g) {
            int i4 = sVar.f16074e;
            if (i4 + i > f16070a) {
                if (!sVar.f16075f) {
                    int i9 = sVar.f16073d;
                    if ((i4 + i) - i9 <= f16070a) {
                        byte[] bArr = sVar.f16072c;
                        System.arraycopy(bArr, i9, bArr, 0, i4 - i9);
                        sVar.f16074e -= sVar.f16073d;
                        sVar.f16073d = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f16072c, this.f16073d, sVar.f16072c, sVar.f16074e, i);
            sVar.f16074e += i;
            this.f16073d += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
