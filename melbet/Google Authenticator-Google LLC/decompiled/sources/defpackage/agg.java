package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agg extends agi {
    public static agg a;
    public static final agn b = new afw(3);
    private final Application d;

    public agg(Application application) {
        this.d = application;
    }

    private static final agd d(Class cls, Application application) {
        if (!adz.class.isAssignableFrom(cls)) {
            return ym.i(cls);
        }
        try {
            agd agdVar = (agd) cls.getConstructor(Application.class).newInstance(application);
            agdVar.getClass();
            return agdVar;
        } catch (IllegalAccessException e) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e);
        } catch (InstantiationException e2) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e2);
        } catch (NoSuchMethodException e3) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e3);
        } catch (InvocationTargetException e4) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e4);
        }
    }

    @Override // defpackage.agi, defpackage.agh
    public final agd a(Class cls) {
        Application application = this.d;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.agi, defpackage.agh
    public final agd b(Class cls, ago agoVar) {
        if (this.d != null) {
            return a(cls);
        }
        Application application = (Application) agoVar.a(b);
        if (application != null) {
            return d(cls, application);
        }
        if (adz.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return ym.i(cls);
    }
}
