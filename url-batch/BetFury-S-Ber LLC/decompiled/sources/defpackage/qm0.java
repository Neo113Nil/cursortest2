package defpackage;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class qm0 extends xy {
    public static qm0 j;
    public static final xy k = new xy(25);
    public final Application i;

    public qm0(Application application) {
        super(26);
        this.i = application;
    }

    @Override // defpackage.xy, defpackage.rm0
    public final om0 a(Class cls) {
        Application application = this.i;
        if (application != null) {
            return n(cls, application);
        }
        s9.y("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // defpackage.xy, defpackage.rm0
    public final om0 e(Class cls, a30 a30Var) {
        if (this.i != null) {
            return a(cls);
        }
        Application application = (Application) a30Var.a.get(k);
        if (application != null) {
            return n(cls, application);
        }
        if (!AndroidViewModel.class.isAssignableFrom(cls)) {
            return d50.m(cls);
        }
        s9.k("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final om0 n(Class cls, Application application) {
        if (!AndroidViewModel.class.isAssignableFrom(cls)) {
            return d50.m(cls);
        }
        try {
            om0 om0Var = (om0) cls.getConstructor(Application.class).newInstance(application);
            om0Var.getClass();
            return om0Var;
        } catch (IllegalAccessException e) {
            s9.q("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            s9.q("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            s9.q("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            s9.q("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
