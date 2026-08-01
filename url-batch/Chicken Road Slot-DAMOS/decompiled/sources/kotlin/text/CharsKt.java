package kotlin.text;

import kotlin.Metadata;

@Metadata(d1 = {"kotlin/text/CharsKt__CharJVMKt", "kotlin/text/CharsKt__CharKt"}, k = a4.j.LONG_FIELD_NUMBER, mv = {2, a4.j.LONG_FIELD_NUMBER, 0}, xi = 49)
/* loaded from: classes.dex */
public final class CharsKt extends a {
    public static boolean a(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }
}
