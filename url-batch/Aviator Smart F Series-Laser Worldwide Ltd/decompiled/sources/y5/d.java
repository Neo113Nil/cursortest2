package y5;

/* loaded from: classes3.dex */
public final class d implements Comparable {
    public static final int MAX_COMPONENT_VALUE = 255;
    private final int major;
    private final int minor;
    private final int patch;
    private final int version;
    public static final a Companion = new a(null);
    public static final d CURRENT = e.get();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    public d(int i8, int i9, int i10) {
        this.major = i8;
        this.minor = i9;
        this.patch = i10;
        this.version = versionOf(i8, i9, i10);
    }

    private final int versionOf(int i8, int i9, int i10) {
        if (new j6.m(0, 255).contains(i8) && new j6.m(0, 255).contains(i9) && new j6.m(0, 255).contains(i10)) {
            return (i8 << 16) + (i9 << 8) + i10;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i8 + '.' + i9 + '.' + i10).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        d dVar = obj instanceof d ? (d) obj : null;
        return dVar != null && this.version == dVar.version;
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

    public final boolean isAtLeast(int i8, int i9) {
        int i10 = this.major;
        return i10 > i8 || (i10 == i8 && this.minor >= i9);
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
    public int compareTo(d other) {
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        return this.version - other.version;
    }

    public final boolean isAtLeast(int i8, int i9, int i10) {
        int i11;
        int i12 = this.major;
        return i12 > i8 || (i12 == i8 && ((i11 = this.minor) > i9 || (i11 == i9 && this.patch >= i10)));
    }

    public d(int i8, int i9) {
        this(i8, i9, 0);
    }
}
