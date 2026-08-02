package kotlinx.atomicfu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AtomicFU {
    public static final ArrayList access$removeOnce(List list, List list2) {
        HashMap hashMap = new HashMap(list2.size());
        for (Object obj : list2) {
            Integer num = (Integer) hashMap.get(obj);
            hashMap.put(obj, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            Integer num2 = (Integer) hashMap.get(obj2);
            if (num2 == null || num2.intValue() <= 0) {
                arrayList.add(obj2);
            } else {
                hashMap.put(obj2, Integer.valueOf(num2.intValue() - 1));
            }
        }
        return arrayList;
    }

    public static final AtomicRef atomic(Object obj) {
        AtomicRef atomicRef = new AtomicRef();
        atomicRef.value = obj;
        return atomicRef;
    }

    public static int zza(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
            default:
                return 0;
            case 16:
                return 17;
        }
    }

    public static final AtomicInt atomic(int i) {
        AtomicInt atomicInt = new AtomicInt();
        atomicInt.value = i;
        return atomicInt;
    }

    public static final AtomicBoolean atomic(boolean z) {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        atomicBoolean._value = z ? 1 : 0;
        return atomicBoolean;
    }
}
