package a0;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0348c {

    /* renamed from: a, reason: collision with root package name */
    public final String f4758a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4759b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4760c;

    public AbstractC0348c(int i2, long j4, String str) {
        this.f4758a = str;
        this.f4759b = j4;
        this.f4760c = i2;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i2 < -1 || i2 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i2);

    public abstract float b(int i2);

    public boolean c() {
        return false;
    }

    public abstract long d(float f4, float f5, float f6);

    public abstract float e(float f4, float f5, float f6);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC0348c abstractC0348c = (AbstractC0348c) obj;
        if (this.f4760c == abstractC0348c.f4760c && Intrinsics.a(this.f4758a, abstractC0348c.f4758a)) {
            return AbstractC0347b.a(this.f4759b, abstractC0348c.f4759b);
        }
        return false;
    }

    public abstract long f(float f4, float f5, float f6, float f7, AbstractC0348c abstractC0348c);

    public int hashCode() {
        int hashCode = this.f4758a.hashCode() * 31;
        int i2 = AbstractC0347b.f4757e;
        return AbstractC0017m.c(hashCode, 31, this.f4759b) + this.f4760c;
    }

    public final String toString() {
        return this.f4758a + " (id=" + this.f4760c + ", model=" + ((Object) AbstractC0347b.b(this.f4759b)) + ')';
    }
}
