package n2;

import java.io.IOException;

/* loaded from: classes.dex */
public final class o {
    public static void a(l lVar) {
        if (lVar != null) {
            try {
                lVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
