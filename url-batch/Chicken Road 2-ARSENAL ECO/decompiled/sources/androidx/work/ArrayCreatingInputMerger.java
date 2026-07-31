package androidx.work;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
import l0.g;
import l0.j;

/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends j {
    @Override // l0.j
    public final g a(ArrayList arrayList) {
        Object newArray;
        E3.j jVar = new E3.j(2);
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Map unmodifiableMap = Collections.unmodifiableMap(((g) obj).f5271a);
            i.d(unmodifiableMap, "input.keyValueMap");
            for (Map.Entry entry : unmodifiableMap.entrySet()) {
                String key = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj2 = hashMap.get(key);
                i.d(key, "key");
                if (obj2 != null) {
                    Class<?> cls2 = obj2.getClass();
                    if (cls2.equals(cls)) {
                        i.d(value, "value");
                        int length = Array.getLength(obj2);
                        int length2 = Array.getLength(value);
                        Class<?> componentType = obj2.getClass().getComponentType();
                        i.b(componentType);
                        Object newArray2 = Array.newInstance(componentType, length + length2);
                        System.arraycopy(obj2, 0, newArray2, 0, length);
                        System.arraycopy(value, 0, newArray2, length, length2);
                        i.d(newArray2, "newArray");
                        value = newArray2;
                        i.d(value, "if (existingValue == nul…      }\n                }");
                        hashMap.put(key, value);
                    } else {
                        if (!i.a(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        int length3 = Array.getLength(obj2);
                        newArray = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj2, 0, newArray, 0, length3);
                        Array.set(newArray, length3, value);
                        i.d(newArray, "newArray");
                        value = newArray;
                        i.d(value, "if (existingValue == nul…      }\n                }");
                        hashMap.put(key, value);
                    }
                } else if (cls.isArray()) {
                    i.d(value, "if (existingValue == nul…      }\n                }");
                    hashMap.put(key, value);
                } else {
                    newArray = Array.newInstance(cls, 1);
                    Array.set(newArray, 0, value);
                    i.d(newArray, "newArray");
                    value = newArray;
                    i.d(value, "if (existingValue == nul…      }\n                }");
                    hashMap.put(key, value);
                }
            }
        }
        jVar.a(hashMap);
        g gVar = new g(jVar.f659a);
        g.c(gVar);
        return gVar;
    }
}
