package a4;

import java.io.IOException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class t {
    public static int a(int i, int i4, int i5) {
        if ((i4 & 8) != 0) {
            i--;
        }
        if (i5 <= i) {
            return i - i5;
        }
        throw new IOException(b.d(i5, i, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
