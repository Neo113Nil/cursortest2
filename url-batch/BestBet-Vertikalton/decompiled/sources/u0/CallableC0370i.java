package u0;

import com.fortunequest.neontrack.data.FortuneQuestDatabase_Impl;
import java.util.concurrent.Callable;
import l0.C0276c;
import l0.C0283j;

/* renamed from: u0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0370i implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f4185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0372k f4186b;

    public CallableC0370i(C0372k c0372k, long j2) {
        this.f4186b = c0372k;
        this.f4185a = j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C0372k c0372k = this.f4186b;
        C0369h c0369h = (C0369h) c0372k.f4192c;
        FortuneQuestDatabase_Impl fortuneQuestDatabase_Impl = (FortuneQuestDatabase_Impl) c0372k.f4190a;
        C0283j a2 = c0369h.a();
        a2.n(1, this.f4185a);
        try {
            fortuneQuestDatabase_Impl.a();
            fortuneQuestDatabase_Impl.a();
            C0276c m2 = fortuneQuestDatabase_Impl.f().m();
            fortuneQuestDatabase_Impl.f2099e.c(m2);
            if (m2.s()) {
                m2.d();
            } else {
                m2.a();
            }
            try {
                a2.d();
                fortuneQuestDatabase_Impl.f().m().v();
                c0369h.n(a2);
                return X0.g.f1277c;
            } finally {
                fortuneQuestDatabase_Impl.j();
            }
        } catch (Throwable th) {
            c0369h.n(a2);
            throw th;
        }
    }
}
