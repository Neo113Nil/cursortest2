package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final g f7531d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7532a;

    /* renamed from: b, reason: collision with root package name */
    public final e f7533b;

    /* renamed from: c, reason: collision with root package name */
    public final f f7534c;

    static {
        e eVar = e.f7528a;
        f fVar = f.f7529b;
        f7531d = new g(false, eVar, fVar);
        new g(true, eVar, fVar);
    }

    public g(boolean z4, e bytes, f number) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(number, "number");
        this.f7532a = z4;
        this.f7533b = bytes;
        this.f7534c = number;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append("    upperCase = ");
        sb.append(this.f7532a);
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append(",");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append("    bytes = BytesHexFormat(");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        this.f7533b.a(sb, "        ");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append("    ),");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append("    number = NumberHexFormat(");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        this.f7534c.a(sb, "        ");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append("    )");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append(")");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
