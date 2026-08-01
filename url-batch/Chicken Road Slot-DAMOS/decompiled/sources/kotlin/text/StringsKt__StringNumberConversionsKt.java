package kotlin.text;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0087\u0080\u0004b\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\u0010\u0003\u001a+\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0087\u0080\u0004b\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\u0010\t\u001a#\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\u0002H\u0087\u0080\u0004b\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\u0010\f\u001a+\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0087\u0080\u0004b\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\u0010\r\u001a#\u0010\u000e\u001a\u0004\u0018\u00010\b*\u00020\u0002H\u0087\u0080\u0004b\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\u0010\u000f\u001a+\u0010\u000e\u001a\u0004\u0018\u00010\b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0087\u0080\u0004b\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\u0010\u0010\u001a#\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u0002H\u0087\u0080\u0004b\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\u0010\u0013\u001a+\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0087\u0080\u0004b\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\u0010\u0014\u001a\u0012\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0080\u0080\u0004¨\u0006\u0018"}, d2 = {"toByteOrNull", "", "", "(Ljava/lang/String;)Ljava/lang/Byte;", "Lkotlin/SinceKotlin;", "version", "1.1", "radix", "", "(Ljava/lang/String;I)Ljava/lang/Byte;", "toShortOrNull", "", "(Ljava/lang/String;)Ljava/lang/Short;", "(Ljava/lang/String;I)Ljava/lang/Short;", "toIntOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "(Ljava/lang/String;I)Ljava/lang/Integer;", "toLongOrNull", "", "(Ljava/lang/String;)Ljava/lang/Long;", "(Ljava/lang/String;I)Ljava/lang/Long;", "numberFormatError", "", "input", "kotlin-stdlib"}, k = a4.j.STRING_FIELD_NUMBER, mv = {2, a4.j.LONG_FIELD_NUMBER, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes.dex */
public class StringsKt__StringNumberConversionsKt extends n {
    public static Integer toIntOrNull(String str) {
        boolean z10;
        int i3;
        int i10;
        str.getClass();
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char charAt = str.charAt(0);
        int i12 = -2147483647;
        if (charAt < '0') {
            i3 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z10 = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i12 = Integer.MIN_VALUE;
                z10 = true;
            }
        } else {
            z10 = false;
            i3 = 0;
        }
        int i13 = -59652323;
        while (i3 < length) {
            int digit = Character.digit((int) str.charAt(i3), 10);
            if (digit < 0) {
                return null;
            }
            if ((i11 < i13 && (i13 != -59652323 || i11 < (i13 = i12 / 10))) || (i10 = i11 * 10) < i12 + digit) {
                return null;
            }
            i11 = i10 - digit;
            i3++;
        }
        return z10 ? Integer.valueOf(i11) : Integer.valueOf(-i11);
    }
}
