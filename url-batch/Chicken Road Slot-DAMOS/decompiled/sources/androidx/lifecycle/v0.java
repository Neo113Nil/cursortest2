package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v0 extends x0 {

    /* renamed from: c, reason: collision with root package name */
    public static v0 f732c;

    /* renamed from: d, reason: collision with root package name */
    public static final u8.d f733d = new u8.d(7);

    /* renamed from: b, reason: collision with root package name */
    public final Application f734b;

    public v0(Application application) {
        this.f734b = application;
    }

    @Override // androidx.lifecycle.x0, androidx.lifecycle.w0
    public final u0 a(Class cls) {
        Application application = this.f734b;
        if (application != null) {
            return d(cls, application);
        }
        a2.r.r("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // androidx.lifecycle.x0, androidx.lifecycle.w0
    public final u0 c(Class cls, k4.e eVar) {
        if (this.f734b != null) {
            return a(cls);
        }
        Application application = (Application) eVar.f5386a.get(f733d);
        if (application != null) {
            return d(cls, application);
        }
        if (!a.class.isAssignableFrom(cls)) {
            return z4.w.m(cls);
        }
        te.a1.e("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final u0 d(Class cls, Application application) {
        if (!a.class.isAssignableFrom(cls)) {
            return z4.w.m(cls);
        }
        try {
            u0 u0Var = (u0) cls.getConstructor(Application.class).newInstance(application);
            u0Var.getClass();
            return u0Var;
        } catch (IllegalAccessException e2) {
            a2.r.l("Cannot create an instance of ", cls, e2);
            return null;
        } catch (InstantiationException e9) {
            a2.r.l("Cannot create an instance of ", cls, e9);
            return null;
        } catch (NoSuchMethodException e10) {
            a2.r.l("Cannot create an instance of ", cls, e10);
            return null;
        } catch (InvocationTargetException e11) {
            a2.r.l("Cannot create an instance of ", cls, e11);
            return null;
        }
    }
}
