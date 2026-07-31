package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* loaded from: classes3.dex */
public class StringsKt__StringNumberConversionsKt extends m {
    public static final Void l(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }

    public static final Integer m(String str, int i4) {
        boolean z4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i4);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i7 = 0;
        char charAt = str.charAt(0);
        int i8 = -2147483647;
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            i5 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i8 = Integer.MIN_VALUE;
                z4 = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z4 = false;
            }
        } else {
            z4 = false;
            i5 = 0;
        }
        int i9 = -59652323;
        while (i5 < length) {
            int a4 = CharsKt__CharJVMKt.a(str.charAt(i5), i4);
            if (a4 < 0) {
                return null;
            }
            if ((i7 < i9 && (i9 != -59652323 || i7 < (i9 = i8 / i4))) || (i6 = i7 * i4) < i8 + a4) {
                return null;
            }
            i7 = i6 - a4;
            i5++;
        }
        return z4 ? Integer.valueOf(i7) : Integer.valueOf(-i7);
    }

    public static Long n(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return o(str, 10);
    }

    public static final Long o(String str, int i4) {
        boolean z4;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i4);
        int length = str.length();
        Long l4 = null;
        if (length == 0) {
            return null;
        }
        int i5 = 0;
        char charAt = str.charAt(0);
        long j4 = -9223372036854775807L;
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            z4 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j4 = Long.MIN_VALUE;
                i5 = 1;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z4 = false;
                i5 = 1;
            }
        } else {
            z4 = false;
        }
        long j5 = 0;
        long j6 = -256204778801521550L;
        while (i5 < length) {
            int a4 = CharsKt__CharJVMKt.a(str.charAt(i5), i4);
            if (a4 < 0) {
                return l4;
            }
            if (j5 < j6) {
                if (j6 != -256204778801521550L) {
                    return l4;
                }
                j6 = j4 / i4;
                if (j5 < j6) {
                    return l4;
                }
            }
            Long l5 = l4;
            int i6 = i5;
            long j7 = j5 * i4;
            long j8 = a4;
            if (j7 < j4 + j8) {
                return l5;
            }
            j5 = j7 - j8;
            i5 = i6 + 1;
            l4 = l5;
        }
        return z4 ? Long.valueOf(j5) : Long.valueOf(-j5);
    }

    @Nullable
    public static Integer toIntOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return m(str, 10);
    }
}
