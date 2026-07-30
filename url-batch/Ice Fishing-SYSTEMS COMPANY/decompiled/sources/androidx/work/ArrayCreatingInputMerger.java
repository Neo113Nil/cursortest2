package androidx.work;

import J0.g;
import J0.h;
import J0.k;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends k {
    @Override // J0.k
    public final h a(ArrayList arrayList) {
        Object newArray;
        g gVar = new g(0);
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map unmodifiableMap = Collections.unmodifiableMap(((h) it.next()).f1316a);
            kotlin.jvm.internal.h.d(unmodifiableMap, "input.keyValueMap");
            for (Map.Entry entry : unmodifiableMap.entrySet()) {
                String key = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = hashMap.get(key);
                kotlin.jvm.internal.h.d(key, "key");
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        kotlin.jvm.internal.h.d(value, "value");
                        int length = Array.getLength(obj);
                        int length2 = Array.getLength(value);
                        Class<?> componentType = obj.getClass().getComponentType();
                        kotlin.jvm.internal.h.b(componentType);
                        Object newArray2 = Array.newInstance(componentType, length + length2);
                        System.arraycopy(obj, 0, newArray2, 0, length);
                        System.arraycopy(value, 0, newArray2, length, length2);
                        kotlin.jvm.internal.h.d(newArray2, "newArray");
                        value = newArray2;
                        kotlin.jvm.internal.h.d(value, "if (existingValue == nul…      }\n                }");
                        hashMap.put(key, value);
                    } else {
                        if (!kotlin.jvm.internal.h.a(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        int length3 = Array.getLength(obj);
                        newArray = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj, 0, newArray, 0, length3);
                        Array.set(newArray, length3, value);
                        kotlin.jvm.internal.h.d(newArray, "newArray");
                        value = newArray;
                        kotlin.jvm.internal.h.d(value, "if (existingValue == nul…      }\n                }");
                        hashMap.put(key, value);
                    }
                } else if (cls.isArray()) {
                    kotlin.jvm.internal.h.d(value, "if (existingValue == nul…      }\n                }");
                    hashMap.put(key, value);
                } else {
                    newArray = Array.newInstance(cls, 1);
                    Array.set(newArray, 0, value);
                    kotlin.jvm.internal.h.d(newArray, "newArray");
                    value = newArray;
                    kotlin.jvm.internal.h.d(value, "if (existingValue == nul…      }\n                }");
                    hashMap.put(key, value);
                }
            }
        }
        gVar.a(hashMap);
        h hVar = new h(gVar.f1313a);
        h.c(hVar);
        return hVar;
    }
}
