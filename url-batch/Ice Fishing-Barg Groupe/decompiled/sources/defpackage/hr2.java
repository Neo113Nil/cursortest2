package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class hr2 extends mr2 {
    public static hr2 TSizfFm2Yiuu;
    public final Application lS5Rgt96tfkO;
    public static final gr2 Companion = new gr2();
    public static final ib0 Y1f8riQaR6yg = new ib0(22);

    public hr2(Application application) {
        this.lS5Rgt96tfkO = application;
    }

    @Override // defpackage.mr2, defpackage.kr2
    public final dr2 PxuCJdSBwIXG(Class cls) {
        Application application = this.lS5Rgt96tfkO;
        if (application != null) {
            return Y1f8riQaR6yg(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    public final dr2 Y1f8riQaR6yg(Class cls, Application application) {
        if (!a7.class.isAssignableFrom(cls)) {
            return sj0.BRwzKIf41E4i(cls);
        }
        try {
            dr2 dr2Var = (dr2) cls.getConstructor(Application.class).newInstance(application);
            dr2Var.getClass();
            return dr2Var;
        } catch (IllegalAccessException e) {
            rc1.dgRBjINgWbAK("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            rc1.dgRBjINgWbAK("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            rc1.dgRBjINgWbAK("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            rc1.dgRBjINgWbAK("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    @Override // defpackage.mr2, defpackage.kr2
    public final dr2 lS5Rgt96tfkO(Class cls, z71 z71Var) {
        if (this.lS5Rgt96tfkO != null) {
            return PxuCJdSBwIXG(cls);
        }
        Application application = (Application) z71Var.PxuCJdSBwIXG.get(Y1f8riQaR6yg);
        if (application != null) {
            return Y1f8riQaR6yg(cls, application);
        }
        if (!a7.class.isAssignableFrom(cls)) {
            return sj0.BRwzKIf41E4i(cls);
        }
        u9.XL4ISE6Oc65B("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }
}
