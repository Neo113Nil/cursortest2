package defpackage;

import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lie extends ljv {
    private static boolean b;

    static void a(lia liaVar, String str, Collection collection, lka lkaVar, int i, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        liaVar.a(new lie(str, collection, new ljc(), i, urlResponseInfo, cronetException), lkaVar);
    }

    @Override // defpackage.ljv, org.chromium.net.RequestFinishedInfo
    public final RequestFinishedInfo.Metrics getMetrics() {
        if (!b) {
            b = true;
        }
        return this.a;
    }
}
