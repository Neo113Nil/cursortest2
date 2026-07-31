package androidx.lifecycle;

import android.app.Application;
import h.AbstractC0416e;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import n1.C0675b;

/* loaded from: classes.dex */
public final class W extends Y {

    /* renamed from: c, reason: collision with root package name */
    public static W f4003c;

    /* renamed from: d, reason: collision with root package name */
    public static final F0.a f4004d = new F0.a(17);

    /* renamed from: b, reason: collision with root package name */
    public final Application f4005b;

    public W(Application application) {
        this.f4005b = application;
    }

    @Override // androidx.lifecycle.Y, androidx.lifecycle.X
    public final V a(Class cls) {
        Application application = this.f4005b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.Y, androidx.lifecycle.X
    public final V b(Class cls, C0675b c0675b) {
        if (this.f4005b != null) {
            return a(cls);
        }
        Application application = (Application) ((LinkedHashMap) c0675b.f5876a).get(f4004d);
        if (application != null) {
            return d(cls, application);
        }
        if (AbstractC0216a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return AbstractC0416e.o(cls);
    }

    public final V d(Class cls, Application application) {
        if (!AbstractC0216a.class.isAssignableFrom(cls)) {
            return AbstractC0416e.o(cls);
        }
        try {
            V v3 = (V) cls.getConstructor(Application.class).newInstance(application);
            Z1.i.e(v3, "{\n                try {\n…          }\n            }");
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
