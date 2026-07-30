package m2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final i f6316e = new i(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f6317a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6318b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6319c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6320d;

    public i(int i7, int i8, int i9, int i10) {
        this.f6317a = i7;
        this.f6318b = i8;
        this.f6319c = i9;
        this.f6320d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f6317a == iVar.f6317a && this.f6318b == iVar.f6318b && this.f6319c == iVar.f6319c && this.f6320d == iVar.f6320d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6320d) + l.h.c(this.f6319c, l.h.c(this.f6318b, Integer.hashCode(this.f6317a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f6317a);
        sb.append(", ");
        sb.append(this.f6318b);
        sb.append(", ");
        sb.append(this.f6319c);
        sb.append(", ");
        return a0.m.l(sb, this.f6320d, ')');
    }
}
