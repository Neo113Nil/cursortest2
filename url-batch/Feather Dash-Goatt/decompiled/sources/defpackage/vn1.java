package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class vn1 extends sc1 {
    public static vn1 e;
    public static final tc1 f = new tc1(4);
    public final Application d;

    public vn1(Application application) {
        super(5);
        this.d = application;
    }

    @Override // defpackage.sc1, defpackage.wn1
    public final tn1 a(Class cls) {
        Application application = this.d;
        if (application != null) {
            return g(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.sc1, defpackage.wn1
    public final tn1 b(Class cls, bn0 bn0Var) {
        if (this.d != null) {
            return a(cls);
        }
        Application application = (Application) bn0Var.a.get(f);
        if (application != null) {
            return g(cls, application);
        }
        if (!d7.class.isAssignableFrom(cls)) {
            return ca0.i(cls);
        }
        dd0.e("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final tn1 g(Class cls, Application application) {
        if (!d7.class.isAssignableFrom(cls)) {
            return ca0.i(cls);
        }
        try {
            tn1 tn1Var = (tn1) cls.getConstructor(Application.class).newInstance(application);
            tn1Var.getClass();
            return tn1Var;
        } catch (IllegalAccessException e2) {
            dd0.i("Cannot create an instance of ", cls, e2);
            return null;
        } catch (InstantiationException e3) {
            dd0.i("Cannot create an instance of ", cls, e3);
            return null;
        } catch (NoSuchMethodException e4) {
            dd0.i("Cannot create an instance of ", cls, e4);
            return null;
        } catch (InvocationTargetException e5) {
            dd0.i("Cannot create an instance of ", cls, e5);
            return null;
        }
    }
}
