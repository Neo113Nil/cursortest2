package kotlin;

import b2.C0188b;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class KotlinVersion implements Comparable<KotlinVersion> {
    public static final int MAX_COMPONENT_VALUE = 255;
    private final int major;
    private final int minor;
    private final int patch;
    private final int version;
    public static final C0188b Companion = new C0188b();
    public static final KotlinVersion CURRENT = new KotlinVersion(2, 1, 0);

    public KotlinVersion(int i3, int i4, int i5) {
        this.major = i3;
        this.minor = i4;
        this.patch = i5;
        this.version = versionOf(i3, i4, i5);
    }

    private final int versionOf(int i3, int i4, int i5) {
        if (i3 >= 0 && i3 < 256 && i4 >= 0 && i4 < 256 && i5 >= 0 && i5 < 256) {
            return (i3 << 16) + (i4 << 8) + i5;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i3 + '.' + i4 + '.' + i5).toString());
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

    public final boolean isAtLeast(int i3, int i4) {
        int i5 = this.major;
        if (i5 <= i3) {
            return i5 == i3 && this.minor >= i4;
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
        j.e(other, "other");
        return this.version - other.version;
    }

    public KotlinVersion(int i3, int i4) {
        this(i3, i4, 0);
    }

    public final boolean isAtLeast(int i3, int i4, int i5) {
        int i6 = this.major;
        if (i6 > i3) {
            return true;
        }
        if (i6 != i3) {
            return false;
        }
        int i7 = this.minor;
        if (i7 <= i4) {
            return i7 == i4 && this.patch >= i5;
        }
        return true;
    }
}
