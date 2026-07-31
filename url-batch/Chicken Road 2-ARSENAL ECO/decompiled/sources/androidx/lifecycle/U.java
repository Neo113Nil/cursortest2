package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class U extends W {

    /* renamed from: c, reason: collision with root package name */
    public static U f3495c;

    /* renamed from: b, reason: collision with root package name */
    public final Application f3496b;

    public U(Application application) {
        this.f3496b = application;
    }

    @Override // androidx.lifecycle.W, androidx.lifecycle.V
    public final S a(Class cls) {
        Application application = this.f3496b;
        if (application != null) {
            return c(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.V
    public final S b(Class cls, O.c cVar) {
        if (this.f3496b != null) {
            return a(cls);
        }
        Application application = (Application) cVar.f1763a.get(T.f3493a);
        if (application != null) {
            return c(cls, application);
        }
        if (AbstractC0234a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.a(cls);
    }

    public final S c(Class cls, Application application) {
        if (!AbstractC0234a.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        try {
            S s6 = (S) cls.getConstructor(Application.class).newInstance(application);
            kotlin.jvm.internal.i.d(s6, "{\n                try {\n…          }\n            }");
            return s6;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        }
    }
}
