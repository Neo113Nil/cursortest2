package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class Tz implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27891a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C4117wN f27892b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f27893c;

    /* renamed from: d, reason: collision with root package name */
    public final C4009uN f27894d;

    /* renamed from: e, reason: collision with root package name */
    public final C4009uN f27895e;

    /* renamed from: f, reason: collision with root package name */
    public final C4117wN f27896f;

    /* renamed from: g, reason: collision with root package name */
    public final C4009uN f27897g;

    /* renamed from: h, reason: collision with root package name */
    public final C4009uN f27898h;

    public Tz(C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, C4009uN c4009uN4, C4009uN c4009uN5, C4117wN c4117wN, C4117wN c4117wN2) {
        this.f27893c = c4009uN;
        this.f27894d = c4009uN2;
        this.f27895e = c4009uN3;
        this.f27897g = c4009uN4;
        this.f27898h = c4009uN5;
        this.f27892b = c4117wN;
        this.f27896f = c4117wN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f27891a) {
            case 0:
                return new Sz((Oy) this.f27893c.d(), (InterfaceC3457kA) this.f27894d.d(), (C3403jA) this.f27895e.d(), (C3619nA) this.f27897g.d(), (C4158xA) this.f27898h.d(), (C3066cy) this.f27892b.f34977a, (ExecutorService) this.f27896f.f34977a);
            default:
                return new Xz((Context) this.f27892b.f34977a, C4009uN.b(this.f27893c), (InterfaceC2970bA) this.f27894d.d(), (C4158xA) this.f27895e.d(), (ExecutorService) this.f27896f.f34977a, (Kz) this.f27897g.d(), (Dw) this.f27898h.d());
        }
    }

    public Tz(C4117wN c4117wN, C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, C4117wN c4117wN2, C4009uN c4009uN4, C4009uN c4009uN5) {
        this.f27892b = c4117wN;
        this.f27893c = c4009uN;
        this.f27894d = c4009uN2;
        this.f27895e = c4009uN3;
        this.f27896f = c4117wN2;
        this.f27897g = c4009uN4;
        this.f27898h = c4009uN5;
    }
}
