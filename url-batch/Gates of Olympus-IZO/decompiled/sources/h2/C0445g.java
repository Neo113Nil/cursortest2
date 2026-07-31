package h2;

/* renamed from: h2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0445g {

    /* renamed from: d, reason: collision with root package name */
    public static final C0445g f5074d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5075a;

    /* renamed from: b, reason: collision with root package name */
    public final C0443e f5076b;

    /* renamed from: c, reason: collision with root package name */
    public final C0444f f5077c;

    static {
        C0443e c0443e = C0443e.f5071a;
        C0444f c0444f = C0444f.f5072b;
        f5074d = new C0445g(false, c0443e, c0444f);
        new C0445g(true, c0443e, c0444f);
    }

    public C0445g(boolean z3, C0443e c0443e, C0444f c0444f) {
        Z1.i.f(c0443e, "bytes");
        Z1.i.f(c0444f, "number");
        this.f5075a = z3;
        this.f5076b = c0443e;
        this.f5077c = c0444f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(\n    upperCase = ");
        sb.append(this.f5075a);
        sb.append(",\n    bytes = BytesHexFormat(\n");
        this.f5076b.a(sb, "        ");
        sb.append('\n');
        sb.append("    ),");
        sb.append('\n');
        sb.append("    number = NumberHexFormat(");
        sb.append('\n');
        this.f5077c.a(sb, "        ");
        sb.append('\n');
        sb.append("    )");
        sb.append('\n');
        sb.append(")");
        String sb2 = sb.toString();
        Z1.i.e(sb2, "toString(...)");
        return sb2;
    }
}
