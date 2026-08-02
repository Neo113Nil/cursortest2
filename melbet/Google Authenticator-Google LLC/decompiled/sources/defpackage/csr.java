package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class csr {
    private static final csr a = new csr();
    private cka b = null;

    public static cka b(Context context) {
        return a.a(context);
    }

    public final synchronized cka a(Context context) {
        cka ckaVar;
        ckaVar = this.b;
        if (ckaVar == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            ckaVar = new cka(context);
            this.b = ckaVar;
        }
        return ckaVar;
    }
}
