package z1;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class q {
    public static int a(int i, int i2, int i3) {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException("PROTOCOL_ERROR padding " + i3 + " > remaining length " + i);
    }
}
