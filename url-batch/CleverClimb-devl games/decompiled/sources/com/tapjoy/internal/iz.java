package com.tapjoy.internal;

/* loaded from: classes2.dex */
final class iz {

    /* renamed from: a, reason: collision with root package name */
    final byte[] f8432a;

    /* renamed from: b, reason: collision with root package name */
    int f8433b;

    /* renamed from: c, reason: collision with root package name */
    int f8434c;

    /* renamed from: d, reason: collision with root package name */
    boolean f8435d;
    boolean e;
    iz f;
    iz g;

    iz() {
        this.f8432a = new byte[8192];
        this.e = true;
        this.f8435d = false;
    }

    iz(iz izVar) {
        this(izVar.f8432a, izVar.f8433b, izVar.f8434c);
        izVar.f8435d = true;
    }

    iz(byte[] bArr, int i, int i2) {
        this.f8432a = bArr;
        this.f8433b = i;
        this.f8434c = i2;
        this.e = false;
        this.f8435d = true;
    }

    public final iz a() {
        iz izVar = this.f != this ? this.f : null;
        this.g.f = this.f;
        this.f.g = this.g;
        this.f = null;
        this.g = null;
        return izVar;
    }

    public final iz a(iz izVar) {
        izVar.g = this;
        izVar.f = this.f;
        this.f.g = izVar;
        this.f = izVar;
        return izVar;
    }

    public final void a(iz izVar, int i) {
        if (!izVar.e) {
            throw new IllegalArgumentException();
        }
        if (izVar.f8434c + i > 8192) {
            if (izVar.f8435d) {
                throw new IllegalArgumentException();
            }
            if ((izVar.f8434c + i) - izVar.f8433b > 8192) {
                throw new IllegalArgumentException();
            }
            System.arraycopy(izVar.f8432a, izVar.f8433b, izVar.f8432a, 0, izVar.f8434c - izVar.f8433b);
            izVar.f8434c -= izVar.f8433b;
            izVar.f8433b = 0;
        }
        System.arraycopy(this.f8432a, this.f8433b, izVar.f8432a, izVar.f8434c, i);
        izVar.f8434c += i;
        this.f8433b += i;
    }
}
