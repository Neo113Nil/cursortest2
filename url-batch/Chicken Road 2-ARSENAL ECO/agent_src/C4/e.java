package C4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Supplier {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f213f;

    public /* synthetic */ e(h hVar) {
        this.f213f = hVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        h hVar = this.f213f;
        hVar.getClass();
        final HashMap hashMap = new HashMap();
        hVar.f222f.getClass();
        Map map = Collections.EMPTY_MAP;
        if (map != null) {
            final int i7 = 0;
            map.forEach(new BiConsumer() { // from class: C4.f
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    String str = (String) obj;
                    String str2 = (String) obj2;
                    switch (i7) {
                        case 0:
                            hashMap.put(str, Collections.singletonList(str2));
                            break;
                        default:
                            hashMap.merge(str, Collections.singletonList(str2), new g());
                            break;
                    }
                }
            });
        }
        final int i8 = 1;
        hVar.f221e.forEach(new BiConsumer() { // from class: C4.f
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                String str = (String) obj;
                String str2 = (String) obj2;
                switch (i8) {
                    case 0:
                        hashMap.put(str, Collections.singletonList(str2));
                        break;
                    default:
                        hashMap.merge(str, Collections.singletonList(str2), new g());
                        break;
                }
            }
        });
        return hashMap;
    }
}
