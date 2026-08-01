package androidx.work;

import a4.j;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import jf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t5.e;
import t5.h;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/ArrayCreatingInputMerger;", "Lt5/h;", "work-runtime_release"}, k = 1, mv = {1, j.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends h {
    @Override // t5.h
    public final e a(ArrayList arrayList) {
        Object newInstance;
        a aVar = new a(1);
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            Map unmodifiableMap = Collections.unmodifiableMap(((e) obj).f9302a);
            unmodifiableMap.getClass();
            for (Map.Entry entry : unmodifiableMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj2 = hashMap.get(str);
                str.getClass();
                if (obj2 != null) {
                    Class<?> cls2 = obj2.getClass();
                    if (cls2.equals(cls)) {
                        value.getClass();
                        int length = Array.getLength(obj2);
                        int length2 = Array.getLength(value);
                        Class<?> componentType = obj2.getClass().getComponentType();
                        componentType.getClass();
                        Object newInstance2 = Array.newInstance(componentType, length + length2);
                        System.arraycopy(obj2, 0, newInstance2, 0, length);
                        System.arraycopy(value, 0, newInstance2, length, length2);
                        newInstance2.getClass();
                        value = newInstance2;
                        value.getClass();
                        hashMap.put(str, value);
                    } else {
                        if (!Intrinsics.a(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        int length3 = Array.getLength(obj2);
                        newInstance = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj2, 0, newInstance, 0, length3);
                        Array.set(newInstance, length3, value);
                        newInstance.getClass();
                        value = newInstance;
                        value.getClass();
                        hashMap.put(str, value);
                    }
                } else if (cls.isArray()) {
                    value.getClass();
                    hashMap.put(str, value);
                } else {
                    newInstance = Array.newInstance(cls, 1);
                    Array.set(newInstance, 0, value);
                    newInstance.getClass();
                    value = newInstance;
                    value.getClass();
                    hashMap.put(str, value);
                }
            }
        }
        aVar.a(hashMap);
        e eVar = new e(aVar.f5253a);
        e.c(eVar);
        return eVar;
    }
}
