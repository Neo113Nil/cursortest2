package K6;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class t {
    public static int a(int i2, int i5, int i7) {
        if ((i5 & 8) != 0) {
            i2--;
        }
        if (i7 <= i2) {
            return i2 - i7;
        }
        throw new IOException(C4.p.j("PROTOCOL_ERROR padding ", " > remaining length ", i7, i2));
    }
}
