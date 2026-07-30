package j5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Supplier {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f6001d;

    public /* synthetic */ d(g gVar) {
        this.f6001d = gVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        g gVar = this.f6001d;
        gVar.getClass();
        final HashMap hashMap = new HashMap();
        gVar.f6010f.getClass();
        Map map = Collections.EMPTY_MAP;
        if (map != null) {
            final int i2 = 0;
            map.forEach(new BiConsumer() { // from class: j5.e
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    String str = (String) obj;
                    String str2 = (String) obj2;
                    switch (i2) {
                        case 0:
                            hashMap.put(str, Collections.singletonList(str2));
                            break;
                        default:
                            hashMap.merge(str, Collections.singletonList(str2), new f());
                            break;
                    }
                }
            });
        }
        final int i5 = 1;
        gVar.f6009e.forEach(new BiConsumer() { // from class: j5.e
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                String str = (String) obj;
                String str2 = (String) obj2;
                switch (i5) {
                    case 0:
                        hashMap.put(str, Collections.singletonList(str2));
                        break;
                    default:
                        hashMap.merge(str, Collections.singletonList(str2), new f());
                        break;
                }
            }
        });
        return hashMap;
    }
}
