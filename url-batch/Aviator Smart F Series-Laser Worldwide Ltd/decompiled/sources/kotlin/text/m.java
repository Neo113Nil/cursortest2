package kotlin.text;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class m {
    public static final <T extends Appendable> T append(T t7, CharSequence... value) {
        kotlin.jvm.internal.s.checkNotNullParameter(t7, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(value, "value");
        for (CharSequence charSequence : value) {
            t7.append(charSequence);
        }
        return t7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void appendElement(Appendable appendable, T t7, f6.l lVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(appendable, "<this>");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(t7));
            return;
        }
        if (t7 == 0 || (t7 instanceof CharSequence)) {
            appendable.append((CharSequence) t7);
        } else if (t7 instanceof Character) {
            appendable.append(((Character) t7).charValue());
        } else {
            appendable.append(String.valueOf(t7));
        }
    }

    private static final Appendable appendLine(Appendable appendable) {
        kotlin.jvm.internal.s.checkNotNullParameter(appendable, "<this>");
        Appendable append = appendable.append('\n');
        kotlin.jvm.internal.s.checkNotNullExpressionValue(append, "append('\\n')");
        return append;
    }

    public static final <T extends Appendable> T appendRange(T t7, CharSequence value, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(t7, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(value, "value");
        T t8 = (T) t7.append(value, i8, i9);
        kotlin.jvm.internal.s.checkNotNull(t8, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return t8;
    }

    private static final Appendable appendLine(Appendable appendable, CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(appendable, "<this>");
        Appendable append = appendable.append(charSequence);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(append, "append(value)");
        Appendable append2 = append.append('\n');
        kotlin.jvm.internal.s.checkNotNullExpressionValue(append2, "append('\\n')");
        return append2;
    }

    private static final Appendable appendLine(Appendable appendable, char c8) {
        kotlin.jvm.internal.s.checkNotNullParameter(appendable, "<this>");
        Appendable append = appendable.append(c8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(append, "append(value)");
        Appendable append2 = append.append('\n');
        kotlin.jvm.internal.s.checkNotNullExpressionValue(append2, "append('\\n')");
        return append2;
    }
}
