package u1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Y2.e f41191a;

    /* renamed from: b, reason: collision with root package name */
    public final List f41192b;

    /* renamed from: c, reason: collision with root package name */
    public final String f41193c;

    public v(Class cls, Class cls2, Class cls3, List list, Y2.e eVar) {
        this.f41191a = eVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f41192b = list;
        this.f41193c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final x a(int i, int i4, G1.a aVar, com.bumptech.glide.load.data.f fVar, s1.h hVar) {
        Y2.e eVar = this.f41191a;
        List list = (List) eVar.l();
        try {
            List list2 = this.f41192b;
            int size = list2.size();
            x xVar = null;
            for (int i9 = 0; i9 < size; i9++) {
                try {
                    xVar = ((i) list2.get(i9)).a(i, i4, aVar, fVar, hVar);
                } catch (s e6) {
                    list.add(e6);
                }
                if (xVar != null) {
                    break;
                }
            }
            if (xVar != null) {
                return xVar;
            }
            throw new s(this.f41193c, new ArrayList(list));
        } finally {
            eVar.G(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f41192b.toArray()) + '}';
    }
}
