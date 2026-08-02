package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgg implements kfi {
    public final kfi a;
    public volatile boolean b;
    public List c = new ArrayList();

    public kgg(kfi kfiVar) {
        this.a = kfiVar;
    }

    private final void b(Runnable runnable) {
        synchronized (this) {
            if (this.b) {
                runnable.run();
            } else {
                this.c.add(runnable);
            }
        }
    }

    @Override // defpackage.kfi
    public final void a(kbq kbqVar, kfh kfhVar, kaa kaaVar) {
        b(new fv((Object) this, kbqVar, kfhVar, kaaVar, 12));
    }

    @Override // defpackage.kfi
    public final void c(kaa kaaVar) {
        b(new kga(this, kaaVar, 8, null));
    }

    @Override // defpackage.kmp
    public final void d(kmo kmoVar) {
        if (this.b) {
            this.a.d(kmoVar);
        } else {
            b(new kga(this, kmoVar, 7));
        }
    }

    @Override // defpackage.kmp
    public final void e() {
        if (this.b) {
            this.a.e();
        } else {
            b(new kgf(this, 5));
        }
    }
}
