package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jvl implements jvk {
    private static final eva a;
    private static final eva b;
    private static final eva c;
    private static final eva d;

    static {
        fwm fwmVar = jts.b;
        int i = 16;
        a = fwmVar.o("45800021", new jta(i), "EOgHGAQ");
        b = fwmVar.n("45800022", false);
        c = fwmVar.n("45776518", false);
        d = fwmVar.o("10", new jta(i), "EOgHGAQ");
    }

    @Override // defpackage.jvk
    public final lgc a(Context context) {
        return (lgc) a.bC(context);
    }

    @Override // defpackage.jvk
    public final lgc b(Context context) {
        return (lgc) d.bC(context);
    }

    @Override // defpackage.jvk
    public final boolean c(Context context) {
        return ((Boolean) b.bC(context)).booleanValue();
    }

    @Override // defpackage.jvk
    public final boolean d(Context context) {
        return ((Boolean) c.bC(context)).booleanValue();
    }
}
