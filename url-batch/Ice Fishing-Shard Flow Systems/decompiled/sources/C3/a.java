package C3;

import t3.C0928c;

/* loaded from: classes.dex */
public abstract class a {
    public static /* synthetic */ Object processNotification$default(b bVar, C0928c c0928c, int i2, V5.b bVar2, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processNotification");
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        return bVar.processNotification(c0928c, i2, bVar2);
    }
}
