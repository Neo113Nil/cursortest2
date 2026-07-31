package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class vr3 implements hr3 {

    /* renamed from: a, reason: collision with root package name */
    private final kr3 f13489a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13490b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f13491c;

    /* renamed from: d, reason: collision with root package name */
    private final int f13492d;

    vr3(kr3 kr3Var, String str, Object[] objArr) {
        this.f13489a = kr3Var;
        this.f13490b = str;
        this.f13491c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f13492d = charAt;
            return;
        }
        int i7 = charAt & 8191;
        int i8 = 13;
        int i9 = 1;
        while (true) {
            int i10 = i9 + 1;
            char charAt2 = str.charAt(i9);
            if (charAt2 < 55296) {
                this.f13492d = i7 | (charAt2 << i8);
                return;
            } else {
                i7 |= (charAt2 & 8191) << i8;
                i8 += 13;
                i9 = i10;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.hr3
    public final boolean a() {
        return (this.f13492d & 2) == 2;
    }

    final String b() {
        return this.f13490b;
    }

    @Override // com.google.android.gms.internal.ads.hr3
    public final int c() {
        return (this.f13492d & 1) == 1 ? 1 : 2;
    }

    final Object[] d() {
        return this.f13491c;
    }

    @Override // com.google.android.gms.internal.ads.hr3
    public final kr3 zza() {
        return this.f13489a;
    }
}
