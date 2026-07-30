package kotlin.text;

/* loaded from: classes3.dex */
class p extends o {
    private static final StringBuilder appendLine(StringBuilder sb, StringBuffer stringBuffer) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append(stringBuffer);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    private static final StringBuilder appendRange(StringBuilder sb, char[] value, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(value, "value");
        sb.append(value, i8, i9 - i8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "this.append(value, start…x, endIndex - startIndex)");
        return sb;
    }

    public static final Appendable appendln(Appendable appendable) {
        kotlin.jvm.internal.s.checkNotNullParameter(appendable, "<this>");
        Appendable append = appendable.append(v.LINE_SEPARATOR);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(append, "append(SystemProperties.LINE_SEPARATOR)");
        return append;
    }

    public static final StringBuilder clear(StringBuilder sb) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.setLength(0);
        return sb;
    }

    private static final StringBuilder deleteAt(StringBuilder sb, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        StringBuilder deleteCharAt = sb.deleteCharAt(i8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(deleteCharAt, "this.deleteCharAt(index)");
        return deleteCharAt;
    }

    private static final StringBuilder deleteRange(StringBuilder sb, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        StringBuilder delete = sb.delete(i8, i9);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(delete, "this.delete(startIndex, endIndex)");
        return delete;
    }

    private static final StringBuilder insertRange(StringBuilder sb, int i8, char[] value, int i9, int i10) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(value, "value");
        StringBuilder insert = sb.insert(i8, value, i9, i10 - i9);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(insert, "this.insert(index, value…x, endIndex - startIndex)");
        return insert;
    }

    private static final void set(StringBuilder sb, int i8, char c8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.setCharAt(i8, c8);
    }

    private static final StringBuilder setRange(StringBuilder sb, int i8, int i9, String value) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(value, "value");
        StringBuilder replace = sb.replace(i8, i9, value);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(replace, "this.replace(startIndex, endIndex, value)");
        return replace;
    }

    private static final void toCharArray(StringBuilder sb, char[] destination, int i8, int i9, int i10) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        sb.getChars(i9, i10, destination, i8);
    }

    static /* synthetic */ void toCharArray$default(StringBuilder sb, char[] destination, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = sb.length();
        }
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        sb.getChars(i9, i10, destination, i8);
    }

    private static final StringBuilder appendLine(StringBuilder sb, StringBuilder sb2) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append((CharSequence) sb2);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    private static final StringBuilder appendRange(StringBuilder sb, CharSequence value, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(value, "value");
        sb.append(value, i8, i9);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
        return sb;
    }

    private static final Appendable appendln(Appendable appendable, CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(appendable, "<this>");
        Appendable append = appendable.append(charSequence);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(append, "append(value)");
        return appendln(append);
    }

    private static final StringBuilder insertRange(StringBuilder sb, int i8, CharSequence value, int i9, int i10) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(value, "value");
        StringBuilder insert = sb.insert(i8, value, i9, i10);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(insert, "this.insert(index, value, startIndex, endIndex)");
        return insert;
    }

    private static final StringBuilder appendLine(StringBuilder sb, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append(i8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    private static final Appendable appendln(Appendable appendable, char c8) {
        kotlin.jvm.internal.s.checkNotNullParameter(appendable, "<this>");
        Appendable append = appendable.append(c8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(append, "append(value)");
        return appendln(append);
    }

    private static final StringBuilder appendLine(StringBuilder sb, short s7) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append((int) s7);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value.toInt())");
        sb.append('\n');
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    public static final StringBuilder appendln(StringBuilder sb) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append(v.LINE_SEPARATOR);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(SystemProperties.LINE_SEPARATOR)");
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb, byte b8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append((int) b8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value.toInt())");
        sb.append('\n');
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    private static final StringBuilder appendln(StringBuilder sb, StringBuffer stringBuffer) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append(stringBuffer);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    private static final StringBuilder appendLine(StringBuilder sb, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append(j8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    private static final StringBuilder appendln(StringBuilder sb, CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append(charSequence);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    private static final StringBuilder appendLine(StringBuilder sb, float f8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append(f8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    private static final StringBuilder appendln(StringBuilder sb, String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append(str);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    private static final StringBuilder appendLine(StringBuilder sb, double d8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append(d8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    private static final StringBuilder appendln(StringBuilder sb, Object obj) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append(obj);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    private static final StringBuilder appendln(StringBuilder sb, StringBuilder sb2) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append((CharSequence) sb2);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    private static final StringBuilder appendln(StringBuilder sb, char[] value) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(value, "value");
        sb.append(value);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    private static final StringBuilder appendln(StringBuilder sb, char c8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append(c8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    private static final StringBuilder appendln(StringBuilder sb, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append(z7);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    private static final StringBuilder appendln(StringBuilder sb, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append(i8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    private static final StringBuilder appendln(StringBuilder sb, short s7) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append((int) s7);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value.toInt())");
        return appendln(sb);
    }

    private static final StringBuilder appendln(StringBuilder sb, byte b8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append((int) b8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value.toInt())");
        return appendln(sb);
    }

    private static final StringBuilder appendln(StringBuilder sb, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append(j8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    private static final StringBuilder appendln(StringBuilder sb, float f8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append(f8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    private static final StringBuilder appendln(StringBuilder sb, double d8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sb, "<this>");
        sb.append(d8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }
}
