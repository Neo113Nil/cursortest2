package com.my.tracker.obfuscated;

import java.util.Objects;

/* renamed from: com.my.tracker.obfuscated.a1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1608a1 {

    /* renamed from: g, reason: collision with root package name */
    public static final C1608a1 f21131g = new C1608a1(-1, 0.0d, 0.0d, 0.0f, 0.0f, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f21132a;

    /* renamed from: b, reason: collision with root package name */
    public final double f21133b;

    /* renamed from: c, reason: collision with root package name */
    public final double f21134c;

    /* renamed from: d, reason: collision with root package name */
    public final float f21135d;

    /* renamed from: e, reason: collision with root package name */
    public final float f21136e;

    /* renamed from: f, reason: collision with root package name */
    public final long f21137f;

    public C1608a1(int i4, double d4, double d5, float f4, float f5, long j4) {
        this.f21132a = i4;
        this.f21133b = d4;
        this.f21134c = d5;
        this.f21135d = f4;
        this.f21136e = f5;
        this.f21137f = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1608a1.class == obj.getClass()) {
            C1608a1 c1608a1 = (C1608a1) obj;
            if (this.f21132a == c1608a1.f21132a && Double.compare(c1608a1.f21133b, this.f21133b) == 0 && Double.compare(c1608a1.f21134c, this.f21134c) == 0 && Float.compare(c1608a1.f21135d, this.f21135d) == 0 && Float.compare(c1608a1.f21136e, this.f21136e) == 0 && this.f21137f == c1608a1.f21137f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f21132a), Double.valueOf(this.f21133b), Double.valueOf(this.f21134c), Float.valueOf(this.f21135d), Float.valueOf(this.f21136e), Long.valueOf(this.f21137f));
    }
}
