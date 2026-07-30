package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Y extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public static Y f3889c;

    /* renamed from: b, reason: collision with root package name */
    public final Application f3890b;

    public Y(Application application) {
        this.f3890b = application;
    }

    @Override // androidx.lifecycle.a0, androidx.lifecycle.Z
    public final W a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Application application = this.f3890b;
        if (application != null) {
            return c(modelClass, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.Z
    public final W b(Class modelClass, b0.d extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (this.f3890b != null) {
            return a(modelClass);
        }
        Application application = (Application) extras.a(X.f3887a);
        if (application != null) {
            return c(modelClass, application);
        }
        if (AbstractC0235a.class.isAssignableFrom(modelClass)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.a(modelClass);
    }

    public final W c(Class cls, Application application) {
        if (!AbstractC0235a.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        try {
            W w4 = (W) cls.getConstructor(Application.class).newInstance(application);
            Intrinsics.checkNotNullExpressionValue(w4, "{\n                try {\n…          }\n            }");
            return w4;
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        }
    }
}
