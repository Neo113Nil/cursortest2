package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.iP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3366iP {

    /* renamed from: a, reason: collision with root package name */
    public final int f31384a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31385b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31386c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31387d;

    /* renamed from: e, reason: collision with root package name */
    public final C2777Sj f31388e;

    /* renamed from: f, reason: collision with root package name */
    public final int f31389f;

    /* renamed from: g, reason: collision with root package name */
    public final int f31390g;

    public /* synthetic */ C3366iP(C2906a1 c2906a1) {
        this.f31384a = c2906a1.f29153a;
        this.f31385b = c2906a1.f29154b;
        this.f31386c = c2906a1.f29155c;
        this.f31387d = c2906a1.f29156d;
        this.f31388e = (C2777Sj) c2906a1.f29159g;
        this.f31389f = c2906a1.f29157e;
        this.f31390g = c2906a1.f29158f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3366iP.class == obj.getClass()) {
            C3366iP c3366iP = (C3366iP) obj;
            if (this.f31384a == c3366iP.f31384a && this.f31385b == c3366iP.f31385b && this.f31386c == c3366iP.f31386c && this.f31387d == c3366iP.f31387d && this.f31389f == c3366iP.f31389f && this.f31390g == c3366iP.f31390g && this.f31388e.equals(c3366iP.f31388e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.f31384a);
        Integer valueOf2 = Integer.valueOf(this.f31385b);
        Integer valueOf3 = Integer.valueOf(this.f31386c);
        Boolean bool = Boolean.FALSE;
        return Objects.hash(valueOf, valueOf2, valueOf3, bool, bool, Integer.valueOf(this.f31387d), this.f31388e, Integer.valueOf(this.f31389f), Integer.valueOf(this.f31390g), bool, bool);
    }
}
