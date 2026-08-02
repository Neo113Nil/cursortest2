package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import operations.numeric.compare.LessThan;
import type.JsonLogicList;
import utils.AnyUtilsKt;

/* loaded from: classes3.dex */
public abstract class DropMode {

    public final class Last extends DropMode {
        public static final Last INSTANCE$1 = new Last();
        public static final Last INSTANCE = new Last();
        public static final Last INSTANCE$2 = new Last();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean compareOrBetween(LessThan lessThan, JsonLogicList jsonLogicList, Function2 function2) {
        ArrayList comparableList = AnyUtilsKt.getComparableList(jsonLogicList);
        if (comparableList.size() == 2) {
            return lessThan.compareListOfTwo(comparableList, function2);
        }
        if (comparableList.size() > 2) {
            boolean compareListOfTwo = lessThan.compareListOfTwo(CollectionsKt__CollectionsKt.listOf((Object[]) new Comparable[]{CollectionsKt.firstOrNull((List) comparableList), CollectionsKt.getOrNull(1, comparableList)}), function2);
            boolean compareListOfTwo2 = lessThan.compareListOfTwo(CollectionsKt__CollectionsKt.listOf((Object[]) new Comparable[]{CollectionsKt.getOrNull(1, comparableList), CollectionsKt.getOrNull(2, comparableList)}), function2);
            if (compareListOfTwo && compareListOfTwo2) {
                return true;
            }
        }
        return false;
    }

    public static int luhnSum(CharSequence charSequence) {
        int i = 0;
        boolean z = false;
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            char charAt = charSequence.charAt(length);
            if (charAt != ' ') {
                if (charAt < '0' || charAt > '9') {
                    return -1;
                }
                int i2 = charAt - '0';
                if (z) {
                    i2 *= 2;
                }
                if (i2 > 9) {
                    i2 = (i2 % 10) + 1;
                }
                i += i2;
                z = !z;
            }
        }
        return i;
    }

    public abstract String getText();
}
