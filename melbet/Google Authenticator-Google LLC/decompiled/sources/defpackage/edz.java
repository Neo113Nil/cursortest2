package defpackage;

import android.util.Log;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class edz implements hut {
    final WeakReference a;

    public edz(eea eeaVar) {
        this.a = new WeakReference(eeaVar);
    }

    @Override // defpackage.hut
    public final void a(Throwable th) {
        Log.e(eea.a, "ContinueWithAccountListener execution threw an exception", th);
    }

    @Override // defpackage.hut
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        eea eeaVar = (eea) this.a.get();
        if (eeaVar == null || bool.booleanValue()) {
            return;
        }
        dih.W(new ect(eeaVar, 2));
    }
}
