package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4117wN implements InterfaceC4063vN, InterfaceC3901sN {

    /* renamed from: b, reason: collision with root package name */
    public static final C4117wN f34976b = new C4117wN(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f34977a;

    public C4117wN(Object obj) {
        this.f34977a = obj;
    }

    public static C4117wN a(Object obj) {
        AbstractC3137eE.d(obj, "instance cannot be null");
        return new C4117wN(obj);
    }

    public static C4117wN b(Object obj) {
        return obj == null ? f34976b : new C4117wN(obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        return this.f34977a;
    }
}
