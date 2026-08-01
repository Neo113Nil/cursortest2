package androidx.lifecycle;

/* loaded from: classes.dex */
public class T implements S {

    /* renamed from: a, reason: collision with root package name */
    public static T f1474a;

    @Override // androidx.lifecycle.S
    public P a(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            X0.f.d(newInstance, "{\n            modelClass…).newInstance()\n        }");
            return (P) newInstance;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }

    @Override // androidx.lifecycle.S
    public final P b(X0.b bVar, Z.c cVar) {
        return c(q1.d.C(bVar), cVar);
    }

    @Override // androidx.lifecycle.S
    public P c(Class cls, Z.c cVar) {
        return a(cls);
    }
}
