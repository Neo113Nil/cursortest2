package n0;

import java.util.List;
import m0.i2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final g f5268c = new g(0, 2, 1);

    @Override // n0.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, m0.c cVar, i2 i2Var, u0.i iVar, k0 k0Var) {
        int i = ((u0.d) kVar.c(0)).f7143a;
        List list = (List) kVar.c(1);
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            int i9 = i + i8;
            cVar.b(i9, obj);
            cVar.f(i9, obj);
        }
    }
}
