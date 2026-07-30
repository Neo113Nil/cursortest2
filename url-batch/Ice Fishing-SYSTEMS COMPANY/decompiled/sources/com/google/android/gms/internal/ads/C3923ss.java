package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.ss, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3923ss implements Rs {

    /* renamed from: c, reason: collision with root package name */
    public static String f34321c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34322a;

    /* renamed from: b, reason: collision with root package name */
    public final C3157eg f34323b;

    public C3923ss(Context context, C3157eg c3157eg) {
        this.f34322a = 3;
        this.f34323b = c3157eg;
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final J3.a a() {
        switch (this.f34322a) {
            case 0:
                return this.f34323b.b(new CallableC2988ba(1));
            case 1:
                return this.f34323b.b(CallableC2988ba.f29504c);
            case 2:
                return this.f34323b.b(CallableC2988ba.f29505d);
            case 3:
                return this.f34323b.b(new CallableC3454k7(22, this));
            case 4:
                return this.f34323b.b(new CallableC2988ba(4));
            default:
                return this.f34323b.b(CallableC2988ba.f29506e);
        }
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final int d() {
        switch (this.f34322a) {
            case 0:
                return 55;
            case 1:
                return 20;
            case 2:
                return 24;
            case 3:
                return 27;
            case 4:
                return 45;
            default:
                return 51;
        }
    }

    public /* synthetic */ C3923ss(C3157eg c3157eg, int i) {
        this.f34322a = i;
        this.f34323b = c3157eg;
    }
}
