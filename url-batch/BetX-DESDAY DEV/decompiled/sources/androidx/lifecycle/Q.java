package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class Q extends T {

    /* renamed from: c, reason: collision with root package name */
    public static Q f1472c;

    /* renamed from: d, reason: collision with root package name */
    public static final H0.e f1473d = new H0.e(16);

    /* renamed from: b, reason: collision with root package name */
    public final Application f1474b;

    public Q(Application application) {
        this.f1474b = application;
    }

    @Override // androidx.lifecycle.T, androidx.lifecycle.S
    public final P a(Class cls) {
        Application application = this.f1474b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.T, androidx.lifecycle.S
    public final P c(Class cls, Z.c cVar) {
        if (this.f1474b != null) {
            return a(cls);
        }
        Application application = (Application) cVar.f883a.get(f1473d);
        if (application != null) {
            return d(cls, application);
        }
        if (AbstractC0068a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.a(cls);
    }

    public final P d(Class cls, Application application) {
        if (!AbstractC0068a.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        try {
            P p2 = (P) cls.getConstructor(Application.class).newInstance(application);
            X0.f.d(p2, "{\n                try {\n…          }\n            }");
            return p2;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException("Cannot create an instance of " + cls, e5);
        }
    }
}
