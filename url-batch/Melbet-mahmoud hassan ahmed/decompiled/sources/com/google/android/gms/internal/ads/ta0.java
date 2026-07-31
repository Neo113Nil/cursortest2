package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ta0 {

    /* renamed from: j, reason: collision with root package name */
    public static final my3<ta0> f12150j = new my3() { // from class: com.google.android.gms.internal.ads.s90
    };

    /* renamed from: a, reason: collision with root package name */
    public final Object f12151a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12152b;

    /* renamed from: c, reason: collision with root package name */
    public final zo f12153c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12154d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12155e;

    /* renamed from: f, reason: collision with root package name */
    public final long f12156f;

    /* renamed from: g, reason: collision with root package name */
    public final long f12157g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12158h;

    /* renamed from: i, reason: collision with root package name */
    public final int f12159i;

    public ta0(Object obj, int i7, zo zoVar, Object obj2, int i8, long j7, long j8, int i9, int i10) {
        this.f12151a = obj;
        this.f12152b = i7;
        this.f12153c = zoVar;
        this.f12154d = obj2;
        this.f12155e = i8;
        this.f12156f = j7;
        this.f12157g = j8;
        this.f12158h = i9;
        this.f12159i = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ta0.class == obj.getClass()) {
            ta0 ta0Var = (ta0) obj;
            if (this.f12152b == ta0Var.f12152b && this.f12155e == ta0Var.f12155e && this.f12156f == ta0Var.f12156f && this.f12157g == ta0Var.f12157g && this.f12158h == ta0Var.f12158h && this.f12159i == ta0Var.f12159i && m43.a(this.f12151a, ta0Var.f12151a) && m43.a(this.f12154d, ta0Var.f12154d) && m43.a(this.f12153c, ta0Var.f12153c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12151a, Integer.valueOf(this.f12152b), this.f12153c, this.f12154d, Integer.valueOf(this.f12155e), Integer.valueOf(this.f12152b), Long.valueOf(this.f12156f), Long.valueOf(this.f12157g), Integer.valueOf(this.f12158h), Integer.valueOf(this.f12159i)});
    }
}
