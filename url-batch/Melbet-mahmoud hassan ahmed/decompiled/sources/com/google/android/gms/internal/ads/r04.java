package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class r04 {

    /* renamed from: a, reason: collision with root package name */
    public final long f10947a;

    /* renamed from: b, reason: collision with root package name */
    public final ei0 f10948b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10949c;

    /* renamed from: d, reason: collision with root package name */
    public final s54 f10950d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10951e;

    /* renamed from: f, reason: collision with root package name */
    public final ei0 f10952f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10953g;

    /* renamed from: h, reason: collision with root package name */
    public final s54 f10954h;

    /* renamed from: i, reason: collision with root package name */
    public final long f10955i;

    /* renamed from: j, reason: collision with root package name */
    public final long f10956j;

    public r04(long j7, ei0 ei0Var, int i7, s54 s54Var, long j8, ei0 ei0Var2, int i8, s54 s54Var2, long j9, long j10) {
        this.f10947a = j7;
        this.f10948b = ei0Var;
        this.f10949c = i7;
        this.f10950d = s54Var;
        this.f10951e = j8;
        this.f10952f = ei0Var2;
        this.f10953g = i8;
        this.f10954h = s54Var2;
        this.f10955i = j9;
        this.f10956j = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r04.class == obj.getClass()) {
            r04 r04Var = (r04) obj;
            if (this.f10947a == r04Var.f10947a && this.f10949c == r04Var.f10949c && this.f10951e == r04Var.f10951e && this.f10953g == r04Var.f10953g && this.f10955i == r04Var.f10955i && this.f10956j == r04Var.f10956j && m43.a(this.f10948b, r04Var.f10948b) && m43.a(this.f10950d, r04Var.f10950d) && m43.a(this.f10952f, r04Var.f10952f) && m43.a(this.f10954h, r04Var.f10954h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f10947a), this.f10948b, Integer.valueOf(this.f10949c), this.f10950d, Long.valueOf(this.f10951e), this.f10952f, Integer.valueOf(this.f10953g), this.f10954h, Long.valueOf(this.f10955i), Long.valueOf(this.f10956j)});
    }
}
