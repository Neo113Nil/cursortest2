package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class a0 implements Z {

    /* renamed from: a, reason: collision with root package name */
    public static a0 f3891a;

    @Override // androidx.lifecycle.Z
    public W a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        try {
            Object newInstance = modelClass.getDeclaredConstructor(null).newInstance(null);
            Intrinsics.checkNotNullExpressionValue(newInstance, "{\n                modelC…wInstance()\n            }");
            return (W) newInstance;
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e9);
        }
    }
}
