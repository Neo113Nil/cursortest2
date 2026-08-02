package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jut implements jus {
    private static final eva a;
    private static final eva b;

    static {
        fwm fwmVar = jts.b;
        a = fwmVar.n("45359255", false);
        b = fwmVar.n("36", true);
    }

    @Override // defpackage.jus
    public final boolean a(Context context) {
        return ((Boolean) a.bC(context)).booleanValue();
    }

    @Override // defpackage.jus
    public final boolean b(Context context) {
        return ((Boolean) b.bC(context)).booleanValue();
    }
}
