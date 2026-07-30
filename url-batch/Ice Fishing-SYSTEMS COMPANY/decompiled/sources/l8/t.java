package l8;

import java.io.IOException;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public abstract class t {
    public static int a(int i, int i4, int i9) {
        if ((i4 & 8) != 0) {
            i--;
        }
        if (i9 <= i) {
            return i - i9;
        }
        throw new IOException(AbstractC5051n.c(i9, i, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
