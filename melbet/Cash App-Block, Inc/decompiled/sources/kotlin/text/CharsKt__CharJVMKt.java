package kotlin.text;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import okio.Path$$ExternalSyntheticBUOutline0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "radix", "checkRadix", "(I)I", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/CharsKt")
/* loaded from: classes3.dex */
public class CharsKt__CharJVMKt {
    public static int checkRadix(int i) {
        if (2 <= i && i < 37) {
            return i;
        }
        Path$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "radix ", " was not in valid range "), new IntRange(2, 36, 1));
        return 0;
    }
}
