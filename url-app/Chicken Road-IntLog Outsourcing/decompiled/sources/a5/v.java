package a5;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class v {
    public static int a(int i2, int i3, int i6) {
        if ((i3 & 8) != 0) {
            i2--;
        }
        if (i6 <= i2) {
            return i2 - i6;
        }
        throw new IOException(B0.o.h("PROTOCOL_ERROR padding ", i6, i2, " > remaining length "));
    }
}
