package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class StringsKt__IndentKt extends m {
    private static final f6.l getIndentFunction$StringsKt__IndentKt(final String str) {
        return str.length() == 0 ? new f6.l() { // from class: kotlin.text.StringsKt__IndentKt$getIndentFunction$1
            @Override // f6.l
            public final String invoke(String line) {
                kotlin.jvm.internal.s.checkNotNullParameter(line, "line");
                return line;
            }
        } : new f6.l() { // from class: kotlin.text.StringsKt__IndentKt$getIndentFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // f6.l
            public final String invoke(String line) {
                kotlin.jvm.internal.s.checkNotNullParameter(line, "line");
                return str + line;
            }
        };
    }

    private static final int indentWidth$StringsKt__IndentKt(String str) {
        int length = str.length();
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                i8 = -1;
                break;
            }
            if (!b.isWhitespace(str.charAt(i8))) {
                break;
            }
            i8++;
        }
        return i8 == -1 ? str.length() : i8;
    }

    public static final String prependIndent(String str, final String indent) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indent, "indent");
        return SequencesKt___SequencesKt.joinToString$default(SequencesKt___SequencesKt.map(StringsKt__StringsKt.lineSequence(str), new f6.l() { // from class: kotlin.text.StringsKt__IndentKt$prependIndent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // f6.l
            public final String invoke(String it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                if (t.isBlank(it)) {
                    return it.length() < indent.length() ? indent : it;
                }
                return indent + it;
            }
        }), "\n", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String prependIndent$default(String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str2 = "    ";
        }
        return prependIndent(str, str2);
    }

    private static final String reindent$StringsKt__IndentKt(List<String> list, int i8, f6.l lVar, f6.l lVar2) {
        String str;
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        for (Object obj : list) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) obj;
            if ((i9 == 0 || i9 == lastIndex) && t.isBlank(str2)) {
                str2 = null;
            } else {
                String str3 = (String) lVar2.invoke(str2);
                if (str3 != null && (str = (String) lVar.invoke(str3)) != null) {
                    str2 = str;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i9 = i10;
        }
        String sb = ((StringBuilder) kotlin.collections.p.joinTo$default(arrayList, new StringBuilder(i8), "\n", null, null, 0, null, null, 124, null)).toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    public static final String replaceIndent(String str, String newIndent) {
        Comparable minOrNull;
        String str2;
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(newIndent, "newIndent");
        List<String> lines = StringsKt__StringsKt.lines(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : lines) {
            if (!t.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.r.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(indentWidth$StringsKt__IndentKt((String) it.next())));
        }
        minOrNull = CollectionsKt___CollectionsKt.minOrNull((Iterable<? extends Comparable>) arrayList2);
        Integer num = (Integer) minOrNull;
        int i8 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * lines.size());
        f6.l indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(newIndent);
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(lines);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : lines) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str3 = (String) obj2;
            if ((i8 == 0 || i8 == lastIndex) && t.isBlank(str3)) {
                str3 = null;
            } else {
                String drop = StringsKt___StringsKt.drop(str3, intValue);
                if (drop != null && (str2 = (String) indentFunction$StringsKt__IndentKt.invoke(drop)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i8 = i9;
        }
        String sb = ((StringBuilder) kotlin.collections.p.joinTo$default(arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    public static /* synthetic */ String replaceIndent$default(String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str2 = "";
        }
        return replaceIndent(str, str2);
    }

    public static final String replaceIndentByMargin(String str, String newIndent, String marginPrefix) {
        int i8;
        String str2;
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(newIndent, "newIndent");
        kotlin.jvm.internal.s.checkNotNullParameter(marginPrefix, "marginPrefix");
        if (!(!t.isBlank(marginPrefix))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List<String> lines = StringsKt__StringsKt.lines(str);
        int length = str.length() + (newIndent.length() * lines.size());
        f6.l indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(newIndent);
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(lines);
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        for (Object obj : lines) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str3 = (String) obj;
            String str4 = null;
            if ((i9 == 0 || i9 == lastIndex) && t.isBlank(str3)) {
                str3 = null;
            } else {
                int length2 = str3.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        i8 = -1;
                        break;
                    }
                    if (!b.isWhitespace(str3.charAt(i11))) {
                        i8 = i11;
                        break;
                    }
                    i11++;
                }
                if (i8 != -1) {
                    int i12 = i8;
                    if (t.startsWith$default(str3, marginPrefix, i8, false, 4, null)) {
                        int length3 = i12 + marginPrefix.length();
                        kotlin.jvm.internal.s.checkNotNull(str3, "null cannot be cast to non-null type java.lang.String");
                        str4 = str3.substring(length3);
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(str4, "this as java.lang.String).substring(startIndex)");
                    }
                }
                if (str4 != null && (str2 = (String) indentFunction$StringsKt__IndentKt.invoke(str4)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i9 = i10;
        }
        String sb = ((StringBuilder) kotlin.collections.p.joinTo$default(arrayList, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    public static /* synthetic */ String replaceIndentByMargin$default(String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str2 = "";
        }
        if ((i8 & 2) != 0) {
            str3 = b5.b.VERTICAL;
        }
        return replaceIndentByMargin(str, str2, str3);
    }

    public static String trimIndent(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return replaceIndent(str, "");
    }

    public static final String trimMargin(String str, String marginPrefix) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(marginPrefix, "marginPrefix");
        return replaceIndentByMargin(str, "", marginPrefix);
    }

    public static /* synthetic */ String trimMargin$default(String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str2 = b5.b.VERTICAL;
        }
        return trimMargin(str, str2);
    }
}
