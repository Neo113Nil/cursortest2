package defpackage;

import android.os.StrictMode;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gbl extends gbi implements aec {
    public static final hkh a = hkh.l("com/google/apps/tiktok/concurrent/futuresmixin/FuturesMixinImpl");
    private gbn b;
    private final koe c;
    private final agl d;
    private final ael e;
    private final gbk f = new gbk();
    private boolean g = false;
    private boolean h = false;
    private final Set i = new HashSet();

    public gbl(koe koeVar, agl aglVar, ael aelVar) {
        this.c = koeVar;
        this.d = aglVar;
        aelVar.a(this);
        this.e = aelVar;
    }

    private final void l() {
        this.h = true;
        gbk gbkVar = this.f;
        fao.f(gbkVar);
        gbkVar.a.clear();
        gbkVar.b = null;
        this.g = true;
        gbn gbnVar = this.b;
        gbnVar.e = true;
        gbh gbhVar = gbnVar.b;
        gbhVar.g();
        for (gbp gbpVar : gbnVar.c) {
            if (gbpVar.b) {
                try {
                    gbhVar.b(gbpVar.a);
                } catch (NullPointerException e) {
                    throw new IllegalStateException("future=".concat(String.valueOf(String.valueOf(gbpVar))), e);
                }
            } else {
                gbn.a((gbj) gbhVar.b(gbpVar.a), gbpVar);
            }
            gbpVar.c(gbnVar);
        }
    }

    @Override // defpackage.aec
    public final void a(aer aerVar) {
        this.b = (gbn) new agj(this.d).a(gbn.class);
        Set set = this.i;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.b.d((gbj) it.next());
        }
        set.clear();
    }

    @Override // defpackage.aec
    public final void b(aer aerVar) {
        gbn gbnVar = this.b;
        hoq.I(!gbnVar.e, "FuturesMixinViewModel.stopCallbacks() must be called before it becomes detached from its parent.");
        gbnVar.b.c();
    }

    @Override // defpackage.aec
    public final void d(aer aerVar) {
        if (this.g) {
            return;
        }
        l();
    }

    @Override // defpackage.aec
    public final void e(aer aerVar) {
        hoq.I(!this.g, "FuturesMixin.onStart() was manually invoked, and is now re-running.");
        l();
    }

    @Override // defpackage.aec
    public final void f(aer aerVar) {
        if (this.g) {
            gbn gbnVar = this.b;
            gbnVar.e = false;
            Iterator it = gbnVar.c.iterator();
            while (it.hasNext()) {
                ((gbp) it.next()).c(null);
            }
            this.g = false;
        }
    }

    @Override // defpackage.gbi
    protected final void g(hvi hviVar, Object obj, gbj gbjVar) {
        fao.c();
        hoq.I(!((by) this.c.b()).X(), "Futures should not be triggered by lifecycle changes, and cannot be listened to while a Fragment is stopped. Consider using SubscriptionMixin instead. See go/tiktok/concurrent/futuresmixin.md. listen() was called while the Fragment's state is saved - work started at this point in the lifecycle can't be persisted, and can lose state.");
        guc gucVar = gul.a;
        guq b = gta.b();
        if (b != null) {
            gtz k = b.k(gul.b);
            if (k.b() && ((Boolean) k.a()).booleanValue()) {
                StrictMode.noteSlowCall("FuturesMixin called from Lifecycle");
            }
        }
        this.b.b(hviVar, obj, gbjVar);
        if (this.g) {
            return;
        }
        Throwable th = new Throwable();
        th.fillInStackTrace();
        ((hkf) ((hkf) ((hkf) a.g()).h(th)).i("com/google/apps/tiktok/concurrent/futuresmixin/FuturesMixinImpl", "listen", (char) 216, "FuturesMixinImpl.java")).s("listen() called outside listening window");
        gbk gbkVar = this.f;
        gbkVar.a.add(gbjVar);
        gbkVar.b = gvx.h(new cov(7));
        fao.f(gbkVar);
        fao.e(gbkVar);
    }

    @Override // defpackage.gbi
    public final void h(gbj gbjVar) {
        fao.c();
        hoq.I(!this.h, "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        hoq.I(!this.e.c.a(aek.d), "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        hoq.I(!this.g, "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        gbn gbnVar = this.b;
        if (gbnVar != null) {
            gbnVar.d(gbjVar);
        } else {
            this.i.add(gbjVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [hvi, java.lang.Object] */
    @Override // defpackage.gbi
    public final void k(cbp cbpVar, cbp cbpVar2, gbj gbjVar) {
        fao.c();
        hoq.I(!((by) this.c.b()).X(), "Listen called outside safe window. State loss is possible.");
        this.b.b(cbpVar.a, cbpVar2.a, gbjVar);
    }

    @Override // defpackage.aec
    public final /* synthetic */ void bJ(aer aerVar) {
    }
}
