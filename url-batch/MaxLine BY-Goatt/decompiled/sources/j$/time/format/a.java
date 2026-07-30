package j$.time.format;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class a extends b0 {
    public final /* synthetic */ a0 d;

    public a(a0 a0Var) {
        this.d = a0Var;
    }

    @Override // j$.time.format.b0
    public final String b(j$.time.chrono.m mVar, j$.time.temporal.q qVar, long j, g0 g0Var, Locale locale) {
        return this.d.a(j, g0Var);
    }

    @Override // j$.time.format.b0
    public final String c(j$.time.temporal.q qVar, long j, g0 g0Var, Locale locale) {
        return this.d.a(j, g0Var);
    }

    @Override // j$.time.format.b0
    public final Iterator d(j$.time.chrono.m mVar, j$.time.temporal.q qVar, g0 g0Var, Locale locale) {
        List list = (List) ((HashMap) this.d.b).get(g0Var);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }

    @Override // j$.time.format.b0
    public final Iterator e(j$.time.temporal.q qVar, g0 g0Var, Locale locale) {
        List list = (List) ((HashMap) this.d.b).get(g0Var);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
