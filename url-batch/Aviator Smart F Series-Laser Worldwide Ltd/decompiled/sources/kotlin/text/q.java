package kotlin.text;

import kotlin.NotImplementedError;

/* loaded from: classes3.dex */
class q extends p {
    private static final StringBuilder append(StringBuilder sb, Object obj) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append(obj);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "this.append(obj)");
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append('\n');
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    private static final String buildString(f6.l builderAction) {
        kotlin.jvm.internal.s.checkNotNullParameter(builderAction, "builderAction");
        StringBuilder sb = new StringBuilder();
        builderAction.invoke(sb);
        String sb2 = sb.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final StringBuilder append(StringBuilder sb, String... value) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(value, "value");
        for (String str : value) {
            sb.append(str);
        }
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb, CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append(charSequence);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    private static final String buildString(int i8, f6.l builderAction) {
        kotlin.jvm.internal.s.checkNotNullParameter(builderAction, "builderAction");
        StringBuilder sb = new StringBuilder(i8);
        builderAction.invoke(sb);
        String sb2 = sb.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    private static final StringBuilder appendLine(StringBuilder sb, String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append(str);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    public static final StringBuilder append(StringBuilder sb, Object... value) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(value, "value");
        for (Object obj : value) {
            sb.append(obj);
        }
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb, Object obj) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append(obj);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb, char[] value) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(value, "value");
        sb.append(value);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    private static final StringBuilder append(StringBuilder sb, char[] str, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(str, "str");
        throw new NotImplementedError(null, 1, null);
    }

    private static final StringBuilder appendLine(StringBuilder sb, char c8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append(c8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append(z7);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }
}
