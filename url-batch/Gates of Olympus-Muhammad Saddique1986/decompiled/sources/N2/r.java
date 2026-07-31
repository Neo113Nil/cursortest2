package N2;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class r {
    public static int a(int i3, int i4, int i5) {
        if ((i4 & 8) != 0) {
            i3--;
        }
        if (i5 <= i3) {
            return i3 - i5;
        }
        throw new IOException(A.k.f(i5, i3, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
