package f4;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import n.ExecutorC4797a;

/* loaded from: classes2.dex */
public final class y extends Binder {

    /* renamed from: n, reason: collision with root package name */
    public final h4.c f37805n;

    public y(h4.c cVar) {
        this.f37805n = cVar;
    }

    public final void a(z zVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = zVar.f37806a;
        f fVar = (f) this.f37805n.f38233u;
        h3.h hVar = new h3.h();
        fVar.f37736n.execute(new a7.b(fVar, intent, hVar, 8));
        hVar.f38206a.a(new ExecutorC4797a(1), new F3.l(12, zVar));
    }
}
