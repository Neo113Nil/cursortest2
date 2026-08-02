package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class deu {
    public static final deu a = new deu();
    private static volatile dev b;

    public final dev a(Context context) {
        dev devVar;
        dev devVar2 = b;
        if (devVar2 != null) {
            return devVar2;
        }
        synchronized (this) {
            devVar = b;
            if (devVar == null) {
                devVar = new dev(context);
                b = devVar;
            }
        }
        return devVar;
    }
}
