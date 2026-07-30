package com.baidu.bbalbscesium.i;

/* loaded from: classes.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    public static int f3945a = 5;

    /* renamed from: b, reason: collision with root package name */
    public static int f3946b = 40;

    /* renamed from: c, reason: collision with root package name */
    private b f3947c;

    public d() {
        b bVar = new b(f3946b);
        this.f3947c = bVar;
        bVar.a(0, f3946b, true);
    }

    public void a(b bVar, int i8, int i9, int i10) {
        b d8 = this.f3947c.d(i8, i8 + i9);
        if (i10 == 0) {
            d8.a(bVar);
        } else if (i10 == 2) {
            d8.b(bVar);
        } else if (i10 != 3) {
            d8.e(bVar);
        } else {
            d8.d(bVar);
        }
        for (int i11 = 0; i11 < i9; i11++) {
            this.f3947c.a(i8 + i11, d8.e(i11));
        }
    }

    public byte[] a() {
        return this.f3947c.h();
    }
}
