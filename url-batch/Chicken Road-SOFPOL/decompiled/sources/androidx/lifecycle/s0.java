package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s0 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static s0 f861c;

    /* renamed from: d, reason: collision with root package name */
    public static final w5.f f862d = new w5.f(4);

    /* renamed from: b, reason: collision with root package name */
    public final Application f863b;

    public s0(Application application) {
        this.f863b = application;
    }

    @Override // androidx.lifecycle.u0, androidx.lifecycle.t0
    public final r0 a(Class cls) {
        Application application = this.f863b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.u0, androidx.lifecycle.t0
    public final r0 c(Class cls, l4.e eVar) {
        if (this.f863b != null) {
            return a(cls);
        }
        Application application = (Application) eVar.f4829a.get(f862d);
        if (application != null) {
            return d(cls, application);
        }
        if (a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return h0.a.y(cls);
    }

    public final r0 d(Class cls, Application application) {
        if (!a.class.isAssignableFrom(cls)) {
            return h0.a.y(cls);
        }
        try {
            r0 r0Var = (r0) cls.getConstructor(Application.class).newInstance(application);
            q6.i.b(r0Var);
            return r0Var;
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        } catch (InstantiationException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        }
    }
}
