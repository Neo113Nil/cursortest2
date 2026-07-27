package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f7528a;

    static {
        Intrinsics.checkNotNullParameter("  ", "groupSeparator");
        Intrinsics.checkNotNullParameter("", "byteSeparator");
        Intrinsics.checkNotNullParameter("", "bytePrefix");
        Intrinsics.checkNotNullParameter("", "byteSuffix");
        e eVar = new e();
        if (!B.a("  ") && !B.a("") && !B.a("")) {
            B.a("");
        }
        f7528a = eVar;
    }

    public final void a(StringBuilder sb, String indent) {
        Intrinsics.checkNotNullParameter(sb, "sb");
        Intrinsics.checkNotNullParameter(indent, "indent");
        sb.append(indent);
        sb.append("bytesPerLine = ");
        sb.append(Integer.MAX_VALUE);
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append(",");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append(indent);
        sb.append("bytesPerGroup = ");
        sb.append(Integer.MAX_VALUE);
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append(",");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append(indent);
        sb.append("groupSeparator = \"");
        sb.append("  ");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append("\",");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append(indent);
        sb.append("byteSeparator = \"");
        sb.append("");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append("\",");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append(indent);
        sb.append("bytePrefix = \"");
        sb.append("");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append("\",");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append(indent);
        sb.append("byteSuffix = \"");
        sb.append("");
        sb.append("\"");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BytesHexFormat(");
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
