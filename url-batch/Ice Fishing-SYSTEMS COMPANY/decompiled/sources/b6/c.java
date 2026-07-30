package b6;

import java.util.function.BiConsumer;

/* loaded from: classes2.dex */
public interface c {
    static C0530a a(g6.e eVar, String str, g6.e eVar2, Boolean bool) {
        if (eVar != null) {
            String str2 = eVar.f37932b;
            if (!str2.isEmpty() && str != null) {
                if (eVar2 != null) {
                    String str3 = eVar2.f37932b;
                    if (!str3.isEmpty()) {
                        return str2.equals(str3) ? b(eVar2, bool) : str2.compareTo(str3) > 0 ? new C0530a(new Object[]{eVar2, bool, eVar, str}) : new C0530a(new Object[]{eVar, str, eVar2, bool});
                    }
                }
                return b(eVar, str);
            }
        }
        return b(eVar2, bool);
    }

    static C0530a b(g6.e eVar, Object obj) {
        return (eVar == null || eVar.f37932b.isEmpty() || obj == null) ? C0530a.f5557w : new C0530a(new Object[]{eVar, obj});
    }

    void forEach(BiConsumer biConsumer);

    boolean isEmpty();

    int size();
}
