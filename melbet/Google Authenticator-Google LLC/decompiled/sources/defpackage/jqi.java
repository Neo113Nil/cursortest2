package defpackage;

import android.app.Activity;
import android.app.Application;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jqi implements jrq {
    protected final Activity a;
    private volatile Object b;
    private final Object c = new Object();
    private final jrq d;
    private jqw e;
    private final jqy f;
    private final jrq g;
    private jqw h;

    public jqi(Activity activity, jrq jrqVar, jrq jrqVar2, jqy jqyVar) {
        this.a = activity;
        this.d = jrqVar;
        this.g = jrqVar2;
        this.f = jqyVar;
    }

    @Override // defpackage.jrq
    public final Object C() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = a();
                }
            }
        }
        return this.b;
    }

    protected Object a() {
        Activity activity = this.a;
        if (!(activity.getApplication() instanceof jrq)) {
            throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(Application.class.equals(activity.getApplication().getClass()) ? "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?" : "Found: ".concat(String.valueOf(String.valueOf(activity.getApplication().getClass())))));
        }
        byo c = ((jqh) imq.a(this.d, jqh.class)).c();
        c.b = activity;
        return new bmz((bnl) c.a, (bna) c.c, (Activity) c.b);
    }

    public final jpw b() {
        return ((jqm) this.d).C();
    }

    public final jpy c() {
        return ((jrc) this.g).C();
    }

    public final void d() {
        jqw jqwVar = this.e;
        if (jqwVar != null) {
            jqwVar.a();
        }
        jqw jqwVar2 = this.h;
        if (jqwVar2 != null) {
            jqwVar2.a();
        }
    }

    public final void e() {
        jqm jqmVar = (jqm) this.d;
        jqw jqwVar = ((jqk) jqm.b(jqmVar.a, jqmVar.b).a(jqk.class)).b;
        this.e = jqwVar;
        if (jqwVar.c()) {
            this.e.b(((ng) this.a).P());
        }
        jrc jrcVar = (jrc) this.g;
        jqw jqwVar2 = ((jra) jrc.b(jrcVar.a, jrcVar.b).a(jra.class)).b;
        this.h = jqwVar2;
        if (jqwVar2.c()) {
            this.h.b(((ng) this.a).P());
        }
    }

    public final bnh f() {
        return this.f.C();
    }
}
