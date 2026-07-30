package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class g31 extends yc {
    public g31(dn dnVar) {
        super(dnVar);
        if (dnVar == null || dnVar.g() == g.d) {
            return;
        }
        dd0.e("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.dn
    public final CoroutineContext g() {
        return g.d;
    }
}
