package defpackage;

import android.content.Context;
import j$.util.Map;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igu implements ckb {
    @Override // defpackage.ckb
    public final cji a(Context context, String str) {
        cji cjiVar;
        Map map = ckx.a;
        synchronized (map) {
            cjiVar = (cji) Map.EL.computeIfAbsent(map, str, new ckw(context, 0));
        }
        return cjiVar;
    }
}
