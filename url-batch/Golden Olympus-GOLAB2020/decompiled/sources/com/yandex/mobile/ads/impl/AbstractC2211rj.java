package com.yandex.mobile.ads.impl;

import java.util.ArrayList;

/* renamed from: com.yandex.mobile.ads.impl.rj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2211rj implements iv {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f31238a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<s62> f31239b = new ArrayList<>(1);

    /* renamed from: c, reason: collision with root package name */
    private int f31240c;

    /* renamed from: d, reason: collision with root package name */
    private mv f31241d;

    protected AbstractC2211rj(boolean z4) {
        this.f31238a = z4;
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final void a(s62 s62Var) {
        s62Var.getClass();
        if (this.f31239b.contains(s62Var)) {
            return;
        }
        this.f31239b.add(s62Var);
        this.f31240c++;
    }

    protected final void b(mv mvVar) {
        for (int i4 = 0; i4 < this.f31240c; i4++) {
            this.f31239b.get(i4).getClass();
        }
    }

    protected final void c(int i4) {
        mv mvVar = this.f31241d;
        int i5 = u82.f32873a;
        for (int i6 = 0; i6 < this.f31240c; i6++) {
            this.f31239b.get(i6).a(mvVar, this.f31238a, i4);
        }
    }

    protected final void e() {
        mv mvVar = this.f31241d;
        int i4 = u82.f32873a;
        for (int i5 = 0; i5 < this.f31240c; i5++) {
            this.f31239b.get(i5).a(mvVar, this.f31238a);
        }
        this.f31241d = null;
    }

    protected final void c(mv mvVar) {
        this.f31241d = mvVar;
        for (int i4 = 0; i4 < this.f31240c; i4++) {
            this.f31239b.get(i4).b(mvVar, this.f31238a);
        }
    }
}
