package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jqq implements jrq {
    private volatile Object a;
    private final Object b = new Object();
    private final bd c;
    private final jqu d;

    public jqq(bd bdVar) {
        this.c = bdVar;
        this.d = new jqu(bdVar);
    }

    public static final Context e(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static final void g(bd bdVar) {
        if (bdVar.n == null) {
            bdVar.ah(new Bundle());
        }
    }

    @Override // defpackage.jrq
    public final Object C() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = a();
                }
            }
        }
        return this.a;
    }

    protected Object a() {
        bnh f;
        bd bdVar = this.c;
        a.v(bdVar.Q(), "Hilt Fragments must be attached before creating the component.");
        iwi.a(bdVar.Q() instanceof jrr, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", bdVar.Q().getClass());
        d(bdVar);
        bd bdVar2 = bdVar;
        while (true) {
            if (bdVar2 == null) {
                iwi.a(bdVar.Q() instanceof jrr, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", bdVar.Q().getClass());
                f = ((jqi) ((jrr) bdVar.Q()).b()).f();
                break;
            }
            if (bdVar2 instanceof jrr) {
                jrq b = ((jrr) bdVar2).b();
                if (b instanceof jqi) {
                    f = ((jqi) b).f();
                    break;
                }
            }
            bdVar2 = bdVar2.F;
        }
        bnt n = ((jqp) imq.a(f, jqp.class)).n();
        n.b = this.d.C();
        n.a = bdVar;
        iwm.a(n.a, bd.class);
        iwm.a(n.b, jpx.class);
        return new bnd(n.c, n.e, n.f, n.a);
    }

    public final void f() {
        bd bdVar = this.c;
        a.v(bdVar.Q(), "Hilt Fragments must be attached before initializing saved state.");
        iwi.a(bdVar.Q() instanceof jrq, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", bdVar.Q().getClass());
        jqw jqwVar = ((jqs) jqu.a(this.d.a).a(jqs.class)).b;
        if (jqwVar.c()) {
            jqwVar.b(bdVar.P());
        }
        bdVar.L().a(new gkd(jqwVar, 3));
    }

    protected void d(bd bdVar) {
    }
}
