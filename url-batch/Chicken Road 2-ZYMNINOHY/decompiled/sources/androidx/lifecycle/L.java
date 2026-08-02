package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class L extends N {

    /* renamed from: c, reason: collision with root package name */
    public static L f5034c;

    /* renamed from: b, reason: collision with root package name */
    public final Application f5035b;

    public L(Application application) {
        this.f5035b = application;
    }

    @Override // androidx.lifecycle.N, androidx.lifecycle.M
    public final J a(Class cls) {
        Application application = this.f5035b;
        if (application != null) {
            return c(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.M
    public final J b(Class cls, R.c cVar) {
        if (this.f5035b != null) {
            return a(cls);
        }
        Application application = (Application) cVar.f2272a.get(K.f5032a);
        if (application != null) {
            return c(cls, application);
        }
        if (AbstractC0222a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.a(cls);
    }

    public final J c(Class cls, Application application) {
        if (!AbstractC0222a.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        try {
            J j4 = (J) cls.getConstructor(Application.class).newInstance(application);
            kotlin.jvm.internal.i.d(j4, "{\n                try {\n…          }\n            }");
            return j4;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException("Cannot create an instance of " + cls, e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        }
    }
}
