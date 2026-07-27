package A0;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;

/* renamed from: A0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f324a;

    /* renamed from: b, reason: collision with root package name */
    public final int f325b;

    /* renamed from: c, reason: collision with root package name */
    public final int f326c;

    /* renamed from: d, reason: collision with root package name */
    public final String f327d;

    public C0034e(Object obj, int i2, int i4, String str) {
        this.f324a = obj;
        this.f325b = i2;
        this.f326c = i4;
        this.f327d = str;
        if (i2 > i4) {
            throw new IllegalArgumentException("Reversed range is not supported");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0034e)) {
            return false;
        }
        C0034e c0034e = (C0034e) obj;
        return Intrinsics.a(this.f324a, c0034e.f324a) && this.f325b == c0034e.f325b && this.f326c == c0034e.f326c && Intrinsics.a(this.f327d, c0034e.f327d);
    }

    public final int hashCode() {
        Object obj = this.f324a;
        return this.f327d.hashCode() + AbstractC0784j.c(this.f326c, AbstractC0784j.c(this.f325b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.f324a);
        sb.append(", start=");
        sb.append(this.f325b);
        sb.append(", end=");
        sb.append(this.f326c);
        sb.append(", tag=");
        return AbstractC0017m.m(sb, this.f327d, ')');
    }

    public C0034e(int i2, int i4, Object obj) {
        this(obj, i2, i4, "");
    }
}
