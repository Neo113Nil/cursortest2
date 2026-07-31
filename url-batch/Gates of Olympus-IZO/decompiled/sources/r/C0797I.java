package r;

import H2.AbstractC0080b;

/* renamed from: r.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0797I implements InterfaceC0796H {

    /* renamed from: a, reason: collision with root package name */
    public final float f7006a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7007b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7008c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7009d;

    public C0797I(float f3, float f4, float f5, float f6) {
        this.f7006a = f3;
        this.f7007b = f4;
        this.f7008c = f5;
        this.f7009d = f6;
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        }
        if (f4 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        if (f5 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        }
        if (f6 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
    }

    @Override // r.InterfaceC0796H
    public final float a(M0.j jVar) {
        return jVar == M0.j.f2775d ? this.f7008c : this.f7006a;
    }

    @Override // r.InterfaceC0796H
    public final float b(M0.j jVar) {
        return jVar == M0.j.f2775d ? this.f7006a : this.f7008c;
    }

    @Override // r.InterfaceC0796H
    public final float c() {
        return this.f7009d;
    }

    @Override // r.InterfaceC0796H
    public final float d() {
        return this.f7007b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0797I)) {
            return false;
        }
        C0797I c0797i = (C0797I) obj;
        return M0.e.a(this.f7006a, c0797i.f7006a) && M0.e.a(this.f7007b, c0797i.f7007b) && M0.e.a(this.f7008c, c0797i.f7008c) && M0.e.a(this.f7009d, c0797i.f7009d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f7009d) + AbstractC0080b.a(this.f7008c, AbstractC0080b.a(this.f7007b, Float.hashCode(this.f7006a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) M0.e.b(this.f7006a)) + ", top=" + ((Object) M0.e.b(this.f7007b)) + ", end=" + ((Object) M0.e.b(this.f7008c)) + ", bottom=" + ((Object) M0.e.b(this.f7009d)) + ')';
    }
}
