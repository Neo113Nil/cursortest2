package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jvi implements jvh {
    private static final eva a;
    private static final eva b;

    static {
        fwm fwmVar = jts.b;
        a = fwmVar.n("45782874", false);
        b = fwmVar.o("9", new jta(15), "EOgHGAQ");
    }

    @Override // defpackage.jvh
    public final lgc a(Context context) {
        return (lgc) b.bC(context);
    }

    @Override // defpackage.jvh
    public final boolean b(Context context) {
        return ((Boolean) a.bC(context)).booleanValue();
    }
}
