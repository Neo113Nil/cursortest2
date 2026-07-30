package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.jA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3403jA implements InterfaceC2970bA {

    /* renamed from: a, reason: collision with root package name */
    public final C4307zy f32087a;

    /* renamed from: b, reason: collision with root package name */
    public final C4307zy f32088b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3901sN f32089c;

    /* renamed from: d, reason: collision with root package name */
    public final C4158xA f32090d;

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorService f32091e;

    public C3403jA(C4307zy c4307zy, C4307zy c4307zy2, InterfaceC3901sN interfaceC3901sN, ExecutorService executorService, C4158xA c4158xA) {
        this.f32087a = c4307zy;
        this.f32088b = c4307zy2;
        this.f32089c = interfaceC3901sN;
        this.f32090d = c4158xA;
        this.f32091e = executorService;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2970bA
    public final J3.a a() {
        return C3686oN.c(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2970bA
    public final J3.a b(My my, byte[] bArr) {
        RunnableFutureC3083dE a9 = this.f32088b.a(bArr);
        this.f32090d.e(20305, a9);
        return C3686oN.y(JD.s(a9), new C3351iA(this, my, 0), HD.f25326n);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2970bA
    public final RunnableFutureC3083dE d() {
        C4307zy c4307zy = this.f32087a;
        c4307zy.getClass();
        RunnableFutureC3083dE p6 = C3686oN.p(new Vs(5, c4307zy), c4307zy.f35644b);
        this.f32090d.e(20302, p6);
        return p6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2970bA
    public final J3.a e(My my, byte[] bArr, byte[] bArr2) {
        RunnableFutureC3083dE a9 = ((C4307zy) this.f32089c.d()).a(bArr);
        C4158xA c4158xA = this.f32090d;
        c4158xA.e(20307, a9);
        RunnableFutureC3083dE a10 = this.f32088b.a(bArr2);
        c4158xA.e(20305, a10);
        return C3686oN.y(JD.s(new DD(UB.o(new J3.a[]{a9, a10}), true)), new C3351iA(this, my, 1), HD.f25326n);
    }
}
