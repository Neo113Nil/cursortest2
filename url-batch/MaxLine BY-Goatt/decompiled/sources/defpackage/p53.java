package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class p53 extends r53 {
    public static p53 c;
    public static final dq2 d = new dq2(12);
    public final Application b;

    public p53(Application application) {
        this.b = application;
    }

    @Override // defpackage.r53, defpackage.q53
    public final n53 a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        ch2.h("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // defpackage.r53, defpackage.q53
    public final n53 b(Class cls, wm1 wm1Var) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) wm1Var.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!dc.class.isAssignableFrom(cls)) {
            return iv1.s(cls);
        }
        lh.e("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final n53 d(Class cls, Application application) {
        if (!dc.class.isAssignableFrom(cls)) {
            return iv1.s(cls);
        }
        try {
            n53 n53Var = (n53) cls.getConstructor(Application.class).newInstance(application);
            n53Var.getClass();
            return n53Var;
        } catch (IllegalAccessException e) {
            b71.n("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            b71.n("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            b71.n("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            b71.n("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
