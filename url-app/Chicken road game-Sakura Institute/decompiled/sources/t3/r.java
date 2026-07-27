package t3;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class r {
    public static int a(int i2, int i4, int i5) {
        if ((i4 & 8) != 0) {
            i2--;
        }
        if (i5 <= i2) {
            return i2 - i5;
        }
        throw new IOException(r0.B.b(i5, i2, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
