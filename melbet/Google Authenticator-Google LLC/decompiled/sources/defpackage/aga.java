package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aga implements agh {
    private final Application a;
    private final ame b;
    private final Bundle c;
    private final agh d;

    public aga(Application application, ame ameVar, Bundle bundle) {
        agg aggVar;
        this.b = ameVar;
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (agg.a == null) {
                agg.a = new agg(application);
            }
            aggVar = agg.a;
            aggVar.getClass();
        } else {
            aggVar = new agg(null);
        }
        this.d = aggVar;
    }

    @Override // defpackage.agh
    public final agd a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.agh
    public final agd b(Class cls, ago agoVar) {
        Object a = agoVar.a(agj.a);
        if (a == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        String str = (String) a;
        if (agoVar.a(afx.a) == null || agoVar.a(afx.b) == null) {
            return d(str, cls);
        }
        Application application = (Application) agoVar.a(agg.b);
        boolean isAssignableFrom = adz.class.isAssignableFrom(cls);
        Constructor b = (!isAssignableFrom || application == null) ? agb.b(cls, agb.b) : agb.b(cls, agb.a);
        if (b == null) {
            return this.d.b(cls, agoVar);
        }
        afr a2 = afx.a(agoVar);
        return (!isAssignableFrom || application == null) ? agb.a(cls, b, a2) : agb.a(cls, b, application, a2);
    }

    @Override // defpackage.agh
    public final agd c(ktj ktjVar, ago agoVar) {
        return b(ixf.f(ktjVar), agoVar);
    }

    public final agd d(String str, Class cls) {
        Application application = this.a;
        boolean isAssignableFrom = adz.class.isAssignableFrom(cls);
        boolean z = application != null;
        Constructor b = (isAssignableFrom && z) ? agb.b(cls, agb.a) : agb.b(cls, agb.b);
        if (b != null) {
            ame ameVar = this.b;
            afu afuVar = new afu(str, ameVar.aE(), ameVar.L(), this.c);
            agd a = (isAssignableFrom && z) ? agb.a(cls, b, application, afuVar.b) : agb.a(cls, b, afuVar.b);
            a.u("androidx.lifecycle.savedstate.vm.tag", afuVar);
            return a;
        }
        if (z) {
            return this.d.a(cls);
        }
        if (agi.c == null) {
            agi.c = new agi();
        }
        agi.c.getClass();
        return ym.i(cls);
    }
}
