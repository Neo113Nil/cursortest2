package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ceu implements cet {
    private static volatile cev c;
    public final cfm a;
    public final iee b;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public ceu(cfm cfmVar, iee ieeVar, cfz cfzVar) {
        this.a = cfmVar;
        this.b = ieeVar;
        cfzVar.a.execute(new ath(cfzVar, 5));
    }

    public static ceu a() {
        cev cevVar = c;
        if (cevVar != null) {
            return (ceu) cevVar.l.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (c == null) {
            synchronized (ceu.class) {
                if (c == null) {
                    context.getClass();
                    c = new cev(context);
                }
            }
        }
    }
}
