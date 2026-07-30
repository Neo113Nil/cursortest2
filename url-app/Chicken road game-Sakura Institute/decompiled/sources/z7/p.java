package z7;

import java.io.IOException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class p {
    public static int a(int i7, int i8, int i9) {
        if ((i8 & 8) != 0) {
            i7--;
        }
        if (i9 <= i7) {
            return i7 - i9;
        }
        throw new IOException(r6.i.b(i9, i7, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
