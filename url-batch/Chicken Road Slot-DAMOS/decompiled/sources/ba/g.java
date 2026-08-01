package ba;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends e {
    private final Class<?> clazz;
    private Object obj;

    public g(Class<?> cls) {
        cls.getClass();
        this.clazz = cls;
    }

    private final boolean doesHaveAllParameters(Constructor<?> constructor, b bVar) {
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        genericParameterTypes.getClass();
        for (Type type : genericParameterTypes) {
            if (type instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                actualTypeArguments.getClass();
                Type type2 = actualTypeArguments.length == 0 ? null : actualTypeArguments[0];
                if (!(type2 instanceof WildcardType)) {
                    if (type2 instanceof Class) {
                        if (!bVar.hasService((Class) type2)) {
                            com.onesignal.debug.internal.logging.b.error$default("Constructor " + constructor + " could not find service: " + type2, null, 2, null);
                        }
                    }
                    return false;
                }
                Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
                upperBounds.getClass();
                Type type3 = (Type) w.n(upperBounds);
                if ((type3 instanceof Class) && !bVar.hasService((Class) type3)) {
                    com.onesignal.debug.internal.logging.b.error$default("Constructor " + constructor + " could not find service: " + type3, null, 2, null);
                    return false;
                }
            } else {
                if (!(type instanceof Class)) {
                    com.onesignal.debug.internal.logging.b.error$default("Constructor " + constructor + " could not identify param type: " + type, null, 2, null);
                    return false;
                }
                if (!bVar.hasService((Class) type)) {
                    com.onesignal.debug.internal.logging.b.error$default("Constructor " + constructor + " could not find service: " + type, null, 2, null);
                    return false;
                }
            }
        }
        return true;
    }

    @Override // ba.e
    public Object resolve(b bVar) {
        bVar.getClass();
        Object obj = this.obj;
        if (obj != null) {
            return obj;
        }
        Constructor<?>[] constructors = this.clazz.getConstructors();
        constructors.getClass();
        int length = constructors.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            Constructor<?> constructor = constructors[i3];
            constructor.getClass();
            if (doesHaveAllParameters(constructor, bVar)) {
                ArrayList arrayList = new ArrayList();
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                genericParameterTypes.getClass();
                for (Type type : genericParameterTypes) {
                    if (type instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                        actualTypeArguments.getClass();
                        Type type2 = actualTypeArguments.length == 0 ? null : actualTypeArguments[0];
                        if (type2 instanceof WildcardType) {
                            Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
                            upperBounds.getClass();
                            Type type3 = (Type) w.n(upperBounds);
                            if (type3 instanceof Class) {
                                arrayList.add(bVar.getAllServices((Class) type3));
                            } else {
                                arrayList.add(null);
                            }
                        } else if (type2 instanceof Class) {
                            arrayList.add(bVar.getAllServices((Class) type2));
                        } else {
                            arrayList.add(null);
                        }
                    } else if (type instanceof Class) {
                        arrayList.add(bVar.getService((Class) type));
                    } else {
                        arrayList.add(null);
                    }
                }
                Object[] array = arrayList.toArray(new Object[0]);
                this.obj = constructor.newInstance(Arrays.copyOf(array, array.length));
            } else {
                i3++;
            }
        }
        return this.obj;
    }
}
