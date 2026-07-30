package z6;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final f f10127d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10128a;

    /* renamed from: b, reason: collision with root package name */
    public final d f10129b;

    /* renamed from: c, reason: collision with root package name */
    public final e f10130c;

    static {
        d dVar = d.f10124a;
        e eVar = e.f10125b;
        f10127d = new f(false, dVar, eVar);
        new f(true, dVar, eVar);
    }

    public f(boolean z8, d dVar, e eVar) {
        r6.k.f(dVar, "bytes");
        r6.k.f(eVar, "number");
        this.f10128a = z8;
        this.f10129b = dVar;
        this.f10130c = eVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(\n    upperCase = ");
        sb.append(this.f10128a);
        sb.append(",\n    bytes = BytesHexFormat(\n");
        this.f10129b.a(sb, "        ");
        sb.append('\n');
        sb.append("    ),");
        sb.append('\n');
        sb.append("    number = NumberHexFormat(");
        sb.append('\n');
        this.f10130c.a(sb, "        ");
        sb.append('\n');
        sb.append("    )");
        sb.append('\n');
        sb.append(")");
        String sb2 = sb.toString();
        r6.k.e(sb2, "toString(...)");
        return sb2;
    }
}
