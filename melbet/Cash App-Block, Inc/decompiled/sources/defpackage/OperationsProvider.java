package defpackage;

import array.Find;
import array.Size;
import encoding.Encode;
import format.DecimalFormat;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import string.Trim;
import string.compareToDate.CompareToDate;

/* loaded from: classes9.dex */
public abstract class OperationsProvider {
    public static final LinkedHashMap standardOperations = MapsKt__MapsKt.mutableMapOf(new Pair("capitalize", Trim.INSTANCE$1), new Pair("isBlank", Trim.INSTANCE$2), new Pair("length", Trim.INSTANCE$3), new Pair("lowercase", Trim.INSTANCE$4), new Pair("replace", Trim.INSTANCE$6), new Pair("uppercase", Trim.INSTANCE$9), new Pair("toArray", Trim.INSTANCE$8), new Pair("decimalFormat", DecimalFormat.INSTANCE), new Pair("encode", Encode.INSTANCE), new Pair("match", Trim.INSTANCE$5), new Pair("compareToDate", CompareToDate.INSTANCE), new Pair("split", Trim.INSTANCE$7), new Pair("currentTime", Drop.INSTANCE$1), new Pair("size", Size.INSTANCE), new Pair("sort", Size.INSTANCE$3), new Pair("distinct", Size.INSTANCE$1), new Pair("joinToString", Size.INSTANCE$2), new Pair("drop", Drop.INSTANCE), new Pair("reverse", Drop.INSTANCE$2), new Pair("trim", Trim.INSTANCE));
    public static final LinkedHashMap functionalOperations = MapsKt__MapsKt.mutableMapOf(new Pair("find", Find.INSTANCE));
}
