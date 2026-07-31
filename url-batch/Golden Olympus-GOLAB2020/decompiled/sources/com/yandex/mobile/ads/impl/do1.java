package com.yandex.mobile.ads.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class do1 {

    public static final class a {
        private a() {
        }

        public static final Class[] a(Object... objArr) {
            ArrayList arrayList = new ArrayList();
            int length = objArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                Object obj = objArr[i4];
                Class<?> cls = obj != null ? obj.getClass() : null;
                if (cls != null) {
                    arrayList.add(cls);
                }
            }
            return (Class[]) arrayList.toArray(new Class[0]);
        }

        public /* synthetic */ a(int i4) {
            this();
        }

        @Nullable
        public static Object a(@Nullable Object obj, @NotNull Class clazz, @NotNull String methodName, @NotNull Class[] argumentsTypes, @NotNull Object... arguments) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(argumentsTypes, "argumentsTypes");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Object obj2 = null;
            try {
                Method a4 = a(clazz, methodName, argumentsTypes);
                if (a4 == null) {
                    return null;
                }
                a4.setAccessible(true);
                obj2 = a4.invoke(obj, Arrays.copyOf(arguments, arguments.length));
                a4.setAccessible(false);
                return obj2;
            } catch (Throwable unused) {
                Object[] args = {methodName};
                int i4 = ap0.f23396b;
                Intrinsics.checkNotNullParameter(args, "args");
                return obj2;
            }
        }

        @Nullable
        public static Object a(@NotNull Object obj, @NotNull String methodName, @NotNull Object... arguments) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Object[] copyOf = Arrays.copyOf(arguments, arguments.length);
            ArrayList arrayList = new ArrayList();
            int length = copyOf.length;
            for (int i4 = 0; i4 < length; i4++) {
                Object obj2 = copyOf[i4];
                Class<?> cls = obj2 != null ? obj2.getClass() : null;
                if (cls != null) {
                    arrayList.add(cls);
                }
            }
            return a(obj, obj.getClass(), methodName, (Class[]) arrayList.toArray(new Class[0]), Arrays.copyOf(arguments, arguments.length));
        }

        private static Method a(Class cls, String str, Class[] clsArr) {
            while (cls != null) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                Intrinsics.checkNotNull(declaredMethods);
                for (Method method : declaredMethods) {
                    Intrinsics.checkNotNull(method);
                    Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                    if (Intrinsics.areEqual(str, method.getName())) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes.length == clsArr2.length) {
                            int length = parameterTypes.length;
                            for (int i4 = 0; i4 < length; i4++) {
                                if (!parameterTypes[i4].isAssignableFrom(clsArr2[i4])) {
                                    break;
                                }
                            }
                            return method;
                        }
                        continue;
                    }
                }
                cls = cls.getSuperclass();
            }
            return null;
        }

        @Nullable
        public static Object a(@NotNull String className, @NotNull Object... arguments) {
            Intrinsics.checkNotNullParameter(className, "className");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Class<?> cls = Class.forName(className);
            Intrinsics.checkNotNull(cls);
            Object[] copyOf = Arrays.copyOf(arguments, arguments.length);
            ArrayList arrayList = new ArrayList(copyOf.length);
            for (Object obj : copyOf) {
                arrayList.add(obj.getClass());
            }
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            try {
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                boolean isAccessible = declaredConstructor.isAccessible();
                if (!isAccessible) {
                    declaredConstructor.setAccessible(true);
                }
                Object newInstance = declaredConstructor.newInstance(Arrays.copyOf(copyOf, copyOf.length));
                if (!isAccessible) {
                    declaredConstructor.setAccessible(false);
                }
                return newInstance;
            } catch (Throwable unused) {
                Object[] args = {cls.getCanonicalName(), Arrays.toString(copyOf)};
                int i4 = ap0.f23396b;
                Intrinsics.checkNotNullParameter(args, "args");
                return null;
            }
        }
    }

    @Nullable
    public static Object a(@NotNull Class clazz, @NotNull String methodName, @NotNull Object... arguments) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return a.a(null, clazz, methodName, a.a(Arrays.copyOf(arguments, arguments.length)), Arrays.copyOf(arguments, arguments.length));
    }
}
