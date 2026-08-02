package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jtn implements jtm {
    private static final eva a;
    private static final eva b;

    static {
        fwm fwmVar = jtk.b;
        a = fwmVar.n("44210106", false);
        b = fwmVar.n("45633393", false);
    }

    @Override // defpackage.jtm
    public final boolean a(Context context) {
        return ((Boolean) a.bC(context)).booleanValue();
    }

    @Override // defpackage.jtm
    public final boolean b(Context context) {
        return ((Boolean) b.bC(context)).booleanValue();
    }
}
