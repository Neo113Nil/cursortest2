package androidx.lifecycle;

/* loaded from: classes.dex */
public class N implements M {

    /* renamed from: a, reason: collision with root package name */
    public static N f5036a;

    @Override // androidx.lifecycle.M
    public J a(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            kotlin.jvm.internal.i.d(newInstance, "{\n                modelC…wInstance()\n            }");
            return (J) newInstance;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException("Cannot create an instance of " + cls, e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        }
    }
}
