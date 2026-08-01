package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class o90 extends ix {
    public static o90 j;
    public final Application i;

    public o90(Application application) {
        super(17);
        this.i = application;
    }

    @Override // defpackage.ix, defpackage.p90
    public final m90 c(Class cls) {
        Application application = this.i;
        if (application != null) {
            return m(cls, application);
        }
        o8.w("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // defpackage.p90
    public final m90 i(Class cls, ev evVar) {
        if (this.i != null) {
            return c(cls);
        }
        Application application = (Application) evVar.a.get(vg.n);
        if (application != null) {
            return m(cls, application);
        }
        if (!f3.class.isAssignableFrom(cls)) {
            return super.c(cls);
        }
        o8.j("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final m90 m(Class cls, Application application) {
        if (!f3.class.isAssignableFrom(cls)) {
            return super.c(cls);
        }
        try {
            m90 m90Var = (m90) cls.getConstructor(Application.class).newInstance(application);
            m90Var.getClass();
            return m90Var;
        } catch (IllegalAccessException e) {
            o8.p("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            o8.p("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            o8.p("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            o8.p("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
