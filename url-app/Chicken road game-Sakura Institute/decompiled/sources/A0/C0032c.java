package A0;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;

/* renamed from: A0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f316a;

    /* renamed from: b, reason: collision with root package name */
    public final int f317b;

    /* renamed from: c, reason: collision with root package name */
    public final int f318c;

    /* renamed from: d, reason: collision with root package name */
    public final String f319d;

    public /* synthetic */ C0032c(int i2, int i4, Object obj) {
        this(obj, i2, i4, "");
    }

    public final C0034e a(int i2) {
        int i4 = this.f318c;
        if (i4 != Integer.MIN_VALUE) {
            i2 = i4;
        }
        if (i2 == Integer.MIN_VALUE) {
            throw new IllegalStateException("Item.end should be set first");
        }
        return new C0034e(this.f316a, this.f317b, i2, this.f319d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0032c)) {
            return false;
        }
        C0032c c0032c = (C0032c) obj;
        return Intrinsics.a(this.f316a, c0032c.f316a) && this.f317b == c0032c.f317b && this.f318c == c0032c.f318c && Intrinsics.a(this.f319d, c0032c.f319d);
    }

    public final int hashCode() {
        Object obj = this.f316a;
        return this.f319d.hashCode() + AbstractC0784j.c(this.f318c, AbstractC0784j.c(this.f317b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.f316a);
        sb.append(", start=");
        sb.append(this.f317b);
        sb.append(", end=");
        sb.append(this.f318c);
        sb.append(", tag=");
        return AbstractC0017m.m(sb, this.f319d, ')');
    }

    public C0032c(Object obj, int i2, int i4, String str) {
        this.f316a = obj;
        this.f317b = i2;
        this.f318c = i4;
        this.f319d = str;
    }
}
