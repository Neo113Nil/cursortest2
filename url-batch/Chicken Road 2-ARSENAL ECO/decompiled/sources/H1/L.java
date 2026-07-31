package H1;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* loaded from: classes.dex */
public final class L extends Binder {

    /* renamed from: d, reason: collision with root package name */
    public final D3.M f923d;

    public L(D3.M m4) {
        this.f923d = m4;
    }

    public final void a(M m4) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = m4.f924a;
        AbstractServiceC0135i abstractServiceC0135i = (AbstractServiceC0135i) this.f923d.f401g;
        k1.h hVar = new k1.h();
        abstractServiceC0135i.f962f.execute(new RunnableC0134h(abstractServiceC0135i, intent, hVar, 0));
        hVar.f5157a.a(new P.c(0), new B0.b(4, m4));
    }
}
