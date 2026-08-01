package defpackage;

import android.os.RemoteException;
import android.util.Log;
import java.util.Set;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class u20 extends rv {
    public final /* synthetic */ w20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u20(w20 w20Var, String[] strArr) {
        super(strArr);
        this.b = w20Var;
    }

    @Override // defpackage.rv
    public final void a(Set set) {
        set.getClass();
        w20 w20Var = this.b;
        if (w20Var.e.get()) {
            return;
        }
        try {
            tu tuVar = w20Var.g;
            if (tuVar != null) {
                tuVar.d(w20Var.f, (String[]) set.toArray(new String[0]));
            }
        } catch (RemoteException e) {
            Log.w("ROOM", "Cannot broadcast invalidation", e);
        }
    }
}
