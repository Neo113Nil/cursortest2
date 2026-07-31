package kotlin;

import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class KotlinVersion implements Comparable<KotlinVersion> {
    public static final int MAX_COMPONENT_VALUE = 255;
    private final int major;
    private final int minor;
    private final int patch;
    private final int version;

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    public static final KotlinVersion CURRENT = c.a();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public KotlinVersion(int i4, int i5, int i6) {
        this.major = i4;
        this.minor = i5;
        this.patch = i6;
        this.version = versionOf(i4, i5, i6);
    }

    private final int versionOf(int i4, int i5, int i6) {
        if (new IntRange(0, MAX_COMPONENT_VALUE).h(i4) && new IntRange(0, MAX_COMPONENT_VALUE).h(i5) && new IntRange(0, MAX_COMPONENT_VALUE).h(i6)) {
            return (i4 << 16) + (i5 << 8) + i6;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i4 + JwtParser.SEPARATOR_CHAR + i5 + JwtParser.SEPARATOR_CHAR + i6).toString());
    }

    public boolean equals(@Nullable Object obj) {
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

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.major);
        sb.append(JwtParser.SEPARATOR_CHAR);
        sb.append(this.minor);
        sb.append(JwtParser.SEPARATOR_CHAR);
        sb.append(this.patch);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull KotlinVersion other) {
        Intrinsics.checkNotNullParameter(other, "other");
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
