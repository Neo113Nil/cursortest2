package androidx.lifecycle;

/* loaded from: classes.dex */
public class X implements W {

    /* renamed from: a, reason: collision with root package name */
    public static X f4562a;

    @Override // androidx.lifecycle.W
    public T b(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            kotlin.jvm.internal.i.d(newInstance, "{\n                modelC…wInstance()\n            }");
            return (T) newInstance;
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InstantiationException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        }
    }
}
