package e3;

import H1.RunnableC0139m;
import O4.c;
import U4.e;
import android.util.Log;
import java.util.Collection;
import kotlin.jvm.internal.i;

/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0344a implements e {

    /* renamed from: f, reason: collision with root package name */
    public final H4.b f4006f;

    public C0344a(H4.b bVar) {
        this.f4006f = bVar;
    }

    @Override // U4.e
    public final c r(Collection logs) {
        i.e(logs, "logs");
        Log.d("OneSignalOtel", "OTEL export request sent to backend. count=" + logs.size());
        c r6 = this.f4006f.r(logs);
        r6.f(new RunnableC0139m(r6, this));
        return r6;
    }

    @Override // U4.e
    public final c shutdown() {
        c shutdown = this.f4006f.shutdown();
        i.d(shutdown, "shutdown(...)");
        return shutdown;
    }
}
