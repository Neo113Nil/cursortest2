package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Gq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2580Gq implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25221a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f25222b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f25223c;

    /* renamed from: d, reason: collision with root package name */
    public final C4009uN f25224d;

    /* renamed from: e, reason: collision with root package name */
    public final C4009uN f25225e;

    /* renamed from: f, reason: collision with root package name */
    public final C4117wN f25226f;

    public C2580Gq(C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, C4009uN c4009uN4, C4117wN c4117wN) {
        this.f25222b = c4009uN;
        this.f25223c = c4009uN2;
        this.f25224d = c4009uN3;
        this.f25225e = c4009uN4;
        this.f25226f = c4117wN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f25221a) {
            case 0:
                return new C2563Fq((Context) this.f25222b.d(), (Executor) this.f25223c.d(), (C3644ni) this.f25226f.f34977a, (Tt) this.f25224d.d(), (C3165eo) this.f25225e.d());
            case 1:
                return new Nz((C3011bx) this.f25222b.d(), (InterfaceC3024cA) this.f25223c.d(), (InterfaceC3457kA) this.f25224d.d(), (C4158xA) this.f25225e.d(), (ExecutorService) this.f25226f.f34977a);
            default:
                return new C3403jA((C4307zy) this.f25222b.d(), (C4307zy) this.f25223c.d(), C4009uN.b(this.f25224d), (ExecutorService) this.f25226f.f34977a, (C4158xA) this.f25225e.d());
        }
    }

    public C2580Gq(C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, C4117wN c4117wN, C4009uN c4009uN4) {
        this.f25222b = c4009uN;
        this.f25223c = c4009uN2;
        this.f25224d = c4009uN3;
        this.f25226f = c4117wN;
        this.f25225e = c4009uN4;
    }

    public C2580Gq(C4009uN c4009uN, C4009uN c4009uN2, C4117wN c4117wN, C4009uN c4009uN3, C4009uN c4009uN4) {
        this.f25222b = c4009uN;
        this.f25223c = c4009uN2;
        this.f25226f = c4117wN;
        this.f25224d = c4009uN3;
        this.f25225e = c4009uN4;
    }
}
