package androidx.work;

import G0.h;
import G0.k;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l2.c;

@Metadata
/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends k {
    @Override // G0.k
    public final h a(ArrayList inputs) {
        Object newArray;
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        c cVar = new c(4);
        HashMap hashMap = new HashMap();
        int size = inputs.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = inputs.get(i2);
            i2++;
            Map unmodifiableMap = Collections.unmodifiableMap(((h) obj).f810a);
            Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "input.keyValueMap");
            for (Map.Entry entry : unmodifiableMap.entrySet()) {
                String key = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj2 = hashMap.get(key);
                Intrinsics.checkNotNullExpressionValue(key, "key");
                if (obj2 != null) {
                    Class<?> cls2 = obj2.getClass();
                    if (cls2.equals(cls)) {
                        Intrinsics.checkNotNullExpressionValue(value, "value");
                        int length = Array.getLength(obj2);
                        int length2 = Array.getLength(value);
                        Class<?> componentType = obj2.getClass().getComponentType();
                        Intrinsics.b(componentType);
                        Object newArray2 = Array.newInstance(componentType, length + length2);
                        System.arraycopy(obj2, 0, newArray2, 0, length);
                        System.arraycopy(value, 0, newArray2, length, length2);
                        Intrinsics.checkNotNullExpressionValue(newArray2, "newArray");
                        value = newArray2;
                        Intrinsics.checkNotNullExpressionValue(value, "if (existingValue == nul…      }\n                }");
                        hashMap.put(key, value);
                    } else {
                        if (!Intrinsics.a(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        int length3 = Array.getLength(obj2);
                        newArray = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj2, 0, newArray, 0, length3);
                        Array.set(newArray, length3, value);
                        Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
                        value = newArray;
                        Intrinsics.checkNotNullExpressionValue(value, "if (existingValue == nul…      }\n                }");
                        hashMap.put(key, value);
                    }
                } else if (cls.isArray()) {
                    Intrinsics.checkNotNullExpressionValue(value, "if (existingValue == nul…      }\n                }");
                    hashMap.put(key, value);
                } else {
                    newArray = Array.newInstance(cls, 1);
                    Array.set(newArray, 0, value);
                    Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
                    value = newArray;
                    Intrinsics.checkNotNullExpressionValue(value, "if (existingValue == nul…      }\n                }");
                    hashMap.put(key, value);
                }
            }
        }
        cVar.D(hashMap);
        h hVar = new h((HashMap) cVar.f6269d);
        h.c(hVar);
        Intrinsics.checkNotNullExpressionValue(hVar, "output.build()");
        return hVar;
    }
}
