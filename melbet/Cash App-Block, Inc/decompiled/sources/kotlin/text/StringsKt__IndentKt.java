package kotlin.text;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes3.dex */
public class StringsKt__IndentKt extends StringsKt__AppendableKt {
    public static String prependIndent(String str, String str2) {
        int i = 0;
        return SequencesKt___SequencesKt.joinToString$default(SequencesKt___SequencesKt.map(new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(str, i), new StringsKt__IndentKt$$ExternalSyntheticLambda0(str2, i)), "\n", 62);
    }

    public static final String replaceIndent(String str) {
        List list;
        int i;
        str.getClass();
        LinesIterator linesIterator = new LinesIterator(str);
        if (linesIterator.hasNext()) {
            Object next = linesIterator.next();
            if (linesIterator.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (linesIterator.hasNext()) {
                    arrayList.add(linesIterator.next());
                }
                list = arrayList;
            } else {
                list = CollectionsKt__CollectionsJVMKt.listOf(next);
            }
        } else {
            list = EmptyList.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (!CharsKt.isWhitespace(str2.charAt(i))) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                i = str2.length();
            }
            arrayList3.add(Integer.valueOf(i));
        }
        Integer num = (Integer) CollectionsKt.minOrNull((Iterable) arrayList3);
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        list.size();
        int size = list.size() - 1;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            String str3 = (String) obj2;
            String drop = ((i == 0 || i == size) && StringsKt.isBlank(str3)) ? null : StringsKt___StringsKt.drop(intValue, str3);
            if (drop != null) {
                arrayList4.add(drop);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length2);
        CollectionsKt.joinTo$default(arrayList4, sb, "\n", null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
        return sb.toString();
    }

    public static String trimMargin$default(String str) {
        List list;
        if (StringsKt.isBlank("|")) {
            a$$ExternalSyntheticBUOutline0.m$3("marginPrefix must be non-blank string.");
            return null;
        }
        LinesIterator linesIterator = new LinesIterator(str);
        if (linesIterator.hasNext()) {
            Object next = linesIterator.next();
            if (linesIterator.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (linesIterator.hasNext()) {
                    arrayList.add(linesIterator.next());
                }
                list = arrayList;
            } else {
                list = CollectionsKt__CollectionsJVMKt.listOf(next);
            }
        } else {
            list = EmptyList.INSTANCE;
        }
        int length = str.length();
        list.size();
        int size = list.size() - 1;
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && StringsKt.isBlank(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!CharsKt.isWhitespace(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String substring = (i3 != -1 && StringsKt__StringsJVMKt.startsWith(str2, "|", i3, false)) ? str2.substring("|".length() + i3) : null;
                if (substring != null) {
                    str2 = substring;
                }
            }
            if (str2 != null) {
                arrayList2.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        CollectionsKt.joinTo$default(arrayList2, sb, "\n", null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
        return sb.toString();
    }
}
