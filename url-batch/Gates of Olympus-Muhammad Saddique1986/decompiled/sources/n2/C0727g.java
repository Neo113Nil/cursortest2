package n2;

/* renamed from: n2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0727g {

    /* renamed from: d, reason: collision with root package name */
    public static final C0727g f7365d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7366a;

    /* renamed from: b, reason: collision with root package name */
    public final C0725e f7367b;

    /* renamed from: c, reason: collision with root package name */
    public final C0726f f7368c;

    static {
        C0725e c0725e = C0725e.f7362a;
        C0726f c0726f = C0726f.f7363b;
        f7365d = new C0727g(false, c0725e, c0726f);
        new C0727g(true, c0725e, c0726f);
    }

    public C0727g(boolean z3, C0725e c0725e, C0726f c0726f) {
        f2.j.f(c0725e, "bytes");
        f2.j.f(c0726f, "number");
        this.f7366a = z3;
        this.f7367b = c0725e;
        this.f7368c = c0726f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(\n    upperCase = ");
        sb.append(this.f7366a);
        sb.append(",\n    bytes = BytesHexFormat(\n");
        this.f7367b.a(sb, "        ");
        sb.append('\n');
        sb.append("    ),");
        sb.append('\n');
        sb.append("    number = NumberHexFormat(");
        sb.append('\n');
        this.f7368c.a(sb, "        ");
        sb.append('\n');
        sb.append("    )");
        sb.append('\n');
        sb.append(")");
        String sb2 = sb.toString();
        f2.j.e(sb2, "toString(...)");
        return sb2;
    }
}
