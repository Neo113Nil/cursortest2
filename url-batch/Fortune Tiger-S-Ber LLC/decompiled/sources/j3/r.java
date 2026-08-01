package j3;

import java.io.IOException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class r {
    public static int a(int i4, int i5, int i6) {
        if ((i5 & 8) != 0) {
            i4--;
        }
        if (i6 <= i4) {
            return i4 - i6;
        }
        throw new IOException("PROTOCOL_ERROR padding " + i6 + " > remaining length " + i4);
    }
}
