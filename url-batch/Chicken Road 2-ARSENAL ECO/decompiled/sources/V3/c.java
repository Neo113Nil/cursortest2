package V3;

import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public interface c {
    static a a(a4.e eVar, Object obj, a4.e eVar2, Boolean bool) {
        if (eVar != null) {
            String str = eVar.f3140b;
            if (!str.isEmpty() && obj != null) {
                if (eVar2 != null) {
                    String str2 = eVar2.f3140b;
                    if (!str2.isEmpty()) {
                        return str.equals(str2) ? c(eVar2, bool) : str.compareTo(str2) > 0 ? new a(new Object[]{eVar2, bool, eVar, obj}) : new a(new Object[]{eVar, obj, eVar2, bool});
                    }
                }
                return c(eVar, obj);
            }
        }
        return c(eVar2, bool);
    }

    static a c(a4.e eVar, Object obj) {
        return (eVar == null || eVar.f3140b.isEmpty() || obj == null) ? a.f2706i : new a(new Object[]{eVar, obj});
    }

    void forEach(BiConsumer biConsumer);

    boolean isEmpty();

    int size();
}
