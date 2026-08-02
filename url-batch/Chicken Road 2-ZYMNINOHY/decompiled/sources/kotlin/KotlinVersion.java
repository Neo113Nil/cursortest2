package kotlin;

import c3.C0290b;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class KotlinVersion implements Comparable<KotlinVersion> {
    public static final int MAX_COMPONENT_VALUE = 255;
    private final int major;
    private final int minor;
    private final int patch;
    private final int version;
    public static final C0290b Companion = new C0290b();
    public static final KotlinVersion CURRENT = new KotlinVersion(2, 2, 20);

    public KotlinVersion(int i4, int i5, int i6) {
        this.major = i4;
        this.minor = i5;
        this.patch = i6;
        this.version = versionOf(i4, i5, i6);
    }

    private final int versionOf(int i4, int i5, int i6) {
        if (i4 >= 0 && i4 < 256 && i5 >= 0 && i5 < 256 && i6 >= 0 && i6 < 256) {
            return (i4 << 16) + (i5 << 8) + i6;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i4 + '.' + i5 + '.' + i6).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        KotlinVersion kotlinVersion = obj instanceof KotlinVersion ? (KotlinVersion) obj : null;
        return kotlinVersion != null && this.version == kotlinVersion.version;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public int hashCode() {
        return this.version;
    }

    public final boolean isAtLeast(int i4, int i5) {
        int i6 = this.major;
        if (i6 <= i4) {
            return i6 == i4 && this.minor >= i5;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.major);
        sb.append('.');
        sb.append(this.minor);
        sb.append('.');
        sb.append(this.patch);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(KotlinVersion other) {
        i.e(other, "other");
        return this.version - other.version;
    }

    public final boolean isAtLeast(int i4, int i5, int i6) {
        int i7 = this.major;
        if (i7 > i4) {
            return true;
        }
        if (i7 != i4) {
            return false;
        }
        int i8 = this.minor;
        if (i8 <= i5) {
            return i8 == i5 && this.patch >= i6;
        }
        return true;
    }

    public KotlinVersion(int i4, int i5) {
        this(i4, i5, 0);
    }
}
