package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x0 extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public static x0 f1053c;

    /* renamed from: d, reason: collision with root package name */
    public static final j4.i f1054d = new j4.i(3);

    /* renamed from: b, reason: collision with root package name */
    public final Application f1055b;

    public x0(Application application) {
        this.f1055b = application;
    }

    @Override // androidx.lifecycle.z0, androidx.lifecycle.y0
    public final w0 a(Class cls) {
        Application application = this.f1055b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.z0, androidx.lifecycle.y0
    public final w0 c(Class cls, q3.b bVar) {
        if (this.f1055b != null) {
            return a(cls);
        }
        Application application = (Application) ((LinkedHashMap) bVar.f5679a).get(f1054d);
        if (application != null) {
            return d(cls, application);
        }
        if (a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return a8.m.s(cls);
    }

    public final w0 d(Class cls, Application application) {
        if (!a.class.isAssignableFrom(cls)) {
            return a8.m.s(cls);
        }
        try {
            w0 w0Var = (w0) cls.getConstructor(Application.class).newInstance(application);
            r6.k.e(w0Var, "{\n                try {\n…          }\n            }");
            return w0Var;
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        }
    }
}
