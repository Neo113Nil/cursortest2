package kotlin.text;

import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public final class CharsKt extends C0754a {
    private CharsKt() {
    }

    public static boolean b(char c4) {
        return Character.isWhitespace(c4) || Character.isSpaceChar(c4);
    }
}
