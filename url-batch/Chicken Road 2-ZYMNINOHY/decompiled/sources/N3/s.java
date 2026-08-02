package N3;

import E.AbstractC0005f;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class s {
    public static int a(int i4, int i5, int i6) {
        if ((i5 & 8) != 0) {
            i4--;
        }
        if (i6 <= i4) {
            return i4 - i6;
        }
        throw new IOException(AbstractC0005f.i(i6, i4, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
