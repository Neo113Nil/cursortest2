package F0;

import E1.AbstractC0033i;
import android.util.SparseArray;
import java.util.HashMap;
import s0.EnumC1186c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f483a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f484b;

    static {
        HashMap hashMap = new HashMap();
        f484b = hashMap;
        hashMap.put(EnumC1186c.f10290a, 0);
        hashMap.put(EnumC1186c.f10291b, 1);
        hashMap.put(EnumC1186c.f10292c, 2);
        for (EnumC1186c enumC1186c : hashMap.keySet()) {
            f483a.append(((Integer) f484b.get(enumC1186c)).intValue(), enumC1186c);
        }
    }

    public static int a(EnumC1186c enumC1186c) {
        Integer num = (Integer) f484b.get(enumC1186c);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC1186c);
    }

    public static EnumC1186c b(int i3) {
        EnumC1186c enumC1186c = (EnumC1186c) f483a.get(i3);
        if (enumC1186c != null) {
            return enumC1186c;
        }
        throw new IllegalArgumentException(AbstractC0033i.h(i3, "Unknown Priority for value "));
    }
}
