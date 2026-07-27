package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f7529b = new f();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7530a;

    public f() {
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "suffix");
        this.f7530a = true;
        if (B.a("")) {
            return;
        }
        B.a("");
    }

    public final void a(StringBuilder sb, String indent) {
        Intrinsics.checkNotNullParameter(sb, "sb");
        Intrinsics.checkNotNullParameter(indent, "indent");
        sb.append(indent);
        sb.append("prefix = \"");
        sb.append("");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append("\",");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append(indent);
        sb.append("suffix = \"");
        sb.append("");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append("\",");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append(indent);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append(',');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append(indent);
        sb.append("minLength = ");
        sb.append(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberHexFormat(");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        a(sb, "    ");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append(")");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
