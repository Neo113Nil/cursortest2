package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import n.z0;
import q1.C0812b;

/* loaded from: classes.dex */
public final class W extends Y {

    /* renamed from: c, reason: collision with root package name */
    public static W f5204c;

    /* renamed from: d, reason: collision with root package name */
    public static final A1.i f5205d = new A1.i(19, false);

    /* renamed from: b, reason: collision with root package name */
    public final Application f5206b;

    public W(Application application) {
        this.f5206b = application;
    }

    @Override // androidx.lifecycle.Y, androidx.lifecycle.X
    public final V a(Class cls) {
        Application application = this.f5206b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.Y, androidx.lifecycle.X
    public final V b(Class cls, C0812b c0812b) {
        if (this.f5206b != null) {
            return a(cls);
        }
        Application application = (Application) ((LinkedHashMap) c0812b.f6877a).get(f5205d);
        if (application != null) {
            return d(cls, application);
        }
        if (AbstractC0272a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return z0.i(cls);
    }

    public final V d(Class cls, Application application) {
        if (!AbstractC0272a.class.isAssignableFrom(cls)) {
            return z0.i(cls);
        }
        try {
            V v3 = (V) cls.getConstructor(Application.class).newInstance(application);
            f2.j.e(v3, "{\n                try {\n…          }\n            }");
            return v3;
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("Cannot create an instance of " + cls, e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        }
    }
}
