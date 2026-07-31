package r3;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    private static p f21310b;

    /* renamed from: c, reason: collision with root package name */
    private static final q f21311c = new q(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private q f21312a;

    private p() {
    }

    @RecentlyNonNull
    public static synchronized p b() {
        p pVar;
        synchronized (p.class) {
            if (f21310b == null) {
                f21310b = new p();
            }
            pVar = f21310b;
        }
        return pVar;
    }

    @RecentlyNullable
    public q a() {
        return this.f21312a;
    }

    public final synchronized void c(q qVar) {
        if (qVar == null) {
            this.f21312a = f21311c;
            return;
        }
        q qVar2 = this.f21312a;
        if (qVar2 == null || qVar2.j() < qVar.j()) {
            this.f21312a = qVar;
        }
    }
}
