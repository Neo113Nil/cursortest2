package C4;

import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public interface f {
    static b a(H4.e eVar, Object obj, H4.e eVar2, Boolean bool) {
        if (eVar != null) {
            String str = eVar.f991b;
            if (!str.isEmpty() && obj != null) {
                if (eVar2 != null) {
                    String str2 = eVar2.f991b;
                    if (!str2.isEmpty()) {
                        return str.equals(str2) ? b(eVar2, bool) : str.compareTo(str2) > 0 ? new b(new Object[]{eVar2, bool, eVar, obj}) : new b(new Object[]{eVar, obj, eVar2, bool});
                    }
                }
                return b(eVar, obj);
            }
        }
        return b(eVar2, bool);
    }

    static b b(H4.e eVar, Object obj) {
        return (eVar == null || eVar.f991b.isEmpty() || obj == null) ? b.f297l : new b(new Object[]{eVar, obj});
    }

    void forEach(BiConsumer biConsumer);

    boolean isEmpty();

    int size();
}
