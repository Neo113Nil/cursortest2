package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ado {
    public static final /* synthetic */ int a = 0;
    private static final adn b = adn.a;

    public static final void a(bd bdVar, String str) {
        bdVar.getClass();
        adl adlVar = new adl(bdVar, str);
        d(adlVar);
        adn b2 = b(bdVar);
        if (b2.b.contains(adm.c) && e(b2, bdVar.getClass(), adlVar.getClass())) {
            c(b2, adlVar);
        }
    }

    public static final adn b(bd bdVar) {
        while (bdVar != null) {
            if (bdVar.ao()) {
                bdVar.G();
            }
            bdVar = bdVar.F;
        }
        return b;
    }

    public static final void c(adn adnVar, adt adtVar) {
        bd bdVar = adtVar.a;
        String name = bdVar.getClass().getName();
        Set set = adnVar.b;
        set.contains(adm.a);
        if (set.contains(adm.b)) {
            at atVar = new at(name, adtVar, 18);
            if (!bdVar.ao()) {
                atVar.run();
                return;
            }
            Handler handler = bdVar.G().l.d;
            if (ksp.b(handler.getLooper(), Looper.myLooper())) {
                atVar.run();
            } else {
                handler.post(atVar);
            }
        }
    }

    public static final void d(adt adtVar) {
        if (by.U(3)) {
            adtVar.a.getClass().getName();
        }
    }

    public static final boolean e(adn adnVar, Class cls, Class cls2) {
        Set set = (Set) adnVar.c.get(cls.getName());
        if (set == null) {
            return true;
        }
        return (ksp.b(cls2.getSuperclass(), adt.class) || !ixc.t(set, cls2.getSuperclass())) && !set.contains(cls2);
    }
}
