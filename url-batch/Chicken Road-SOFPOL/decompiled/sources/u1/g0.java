package u1;

import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public interface g0 extends r2.c {
    f0 J(int i, int i8, Map map, p6.c cVar, p6.c cVar2);

    default f0 e0(int i, int i8, Map map, p6.c cVar) {
        return J(i, i8, map, null, cVar);
    }

    r2.l getLayoutDirection();

    boolean p();
}
