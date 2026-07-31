package com.google.android.gms.internal.ads;

import x2.a;

/* loaded from: classes.dex */
public final class n90 implements x2.a {

    /* renamed from: a, reason: collision with root package name */
    private final a.EnumC0152a f8987a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8988b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8989c;

    public n90(a.EnumC0152a enumC0152a, String str, int i7) {
        this.f8987a = enumC0152a;
        this.f8988b = str;
        this.f8989c = i7;
    }

    @Override // x2.a
    public final a.EnumC0152a a() {
        return this.f8987a;
    }

    @Override // x2.a
    public final int b() {
        return this.f8989c;
    }

    @Override // x2.a
    public final String getDescription() {
        return this.f8988b;
    }
}
