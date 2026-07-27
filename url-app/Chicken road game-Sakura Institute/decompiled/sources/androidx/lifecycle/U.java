package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;
import p1.C0993c;

/* loaded from: classes.dex */
public final class U extends W {

    /* renamed from: c, reason: collision with root package name */
    public static U f5458c;

    /* renamed from: d, reason: collision with root package name */
    public static final E1.i f5459d = new E1.i(9);

    /* renamed from: b, reason: collision with root package name */
    public final Application f5460b;

    public U(Application application) {
        this.f5460b = application;
    }

    @Override // androidx.lifecycle.W, androidx.lifecycle.V
    public final T a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Application application = this.f5460b;
        if (application != null) {
            return d(modelClass, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.W, androidx.lifecycle.V
    public final T b(Class modelClass, C0993c extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (this.f5460b != null) {
            return a(modelClass);
        }
        Application application = (Application) extras.q(f5459d);
        if (application != null) {
            return d(modelClass, application);
        }
        if (AbstractC0461a.class.isAssignableFrom(modelClass)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return m3.z.j(modelClass);
    }

    public final T d(Class modelClass, Application application) {
        if (!AbstractC0461a.class.isAssignableFrom(modelClass)) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return m3.z.j(modelClass);
        }
        try {
            T t4 = (T) modelClass.getConstructor(Application.class).newInstance(application);
            Intrinsics.checkNotNullExpressionValue(t4, "{\n                try {\n…          }\n            }");
            return t4;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e7);
        }
    }
}
