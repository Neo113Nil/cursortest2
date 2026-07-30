package com.onevcat.uniwebview.internal.obfuscated;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.random.Random;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;
import kotlin.text.CharsKt;
import kotlin.text.Typography;

/* loaded from: classes.dex */
public abstract class I {
    public static final String a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            char c = '\\';
            if (charAt == '\\') {
                char charAt2 = i == str.length() + (-1) ? '\\' : str.charAt(i + 1);
                if ('0' > charAt2 || charAt2 >= '8') {
                    if (charAt2 != '\\') {
                        if (charAt2 == 'b') {
                            charAt = '\b';
                        } else if (charAt2 == 'n') {
                            charAt = '\n';
                        } else if (charAt2 == 'r') {
                            charAt = '\r';
                        } else if (charAt2 == 't') {
                            charAt = '\t';
                        } else {
                            c = Typography.quote;
                            if (charAt2 != '\"') {
                                c = '\'';
                                if (charAt2 != '\'') {
                                    c = 'u';
                                    if (charAt2 == 'u') {
                                        if (i < str.length() - 5) {
                                            sb.append(Character.toChars(Integer.parseInt("" + str.charAt(i + 2) + str.charAt(i + 3) + str.charAt(i + 4) + str.charAt(i + 5), CharsKt.checkRadix(16))));
                                            i += 6;
                                        }
                                    }
                                }
                            }
                        }
                        i++;
                    }
                    charAt = c;
                    i++;
                } else {
                    String str2 = "" + charAt2;
                    int i2 = i + 1;
                    if (i2 < str.length() - 1) {
                        int i3 = i + 2;
                        if (Intrinsics.compare((int) str.charAt(i3), 48) >= 0 && Intrinsics.compare((int) str.charAt(i3), 55) <= 0) {
                            str2 = str2 + str.charAt(i3);
                            if (i3 < str.length() - 1) {
                                i2 = i + 3;
                                if (Intrinsics.compare((int) str.charAt(i2), 48) >= 0 && Intrinsics.compare((int) str.charAt(i2), 55) <= 0) {
                                    str2 = str2 + str.charAt(i2);
                                }
                            }
                            i2 = i3;
                        }
                    }
                    sb.append((char) Integer.parseInt(str2, CharsKt.checkRadix(8)));
                    i = i2 + 1;
                }
            }
            sb.append(charAt);
            i++;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    public static final String a(StringCompanionObject stringCompanionObject) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        List plus = CollectionsKt.plus((Collection) CollectionsKt.plus((Iterable) new CharRange('A', 'Z'), (Iterable) new CharRange('a', 'z')), (Iterable) new CharRange('0', '9'));
        IntRange intRange = new IntRange(1, 8);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            Character ch = (Character) CollectionsKt.random(plus, Random.INSTANCE);
            ch.getClass();
            arrayList.add(ch);
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }
}
