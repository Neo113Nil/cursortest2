package r0;

import java.util.Map;

/* loaded from: classes.dex */
public interface C extends M0.b {
    boolean B();

    B I(int i3, int i4, Map map, Y1.c cVar);

    default B Y(int i3, int i4, Map map, Y1.c cVar) {
        return I(i3, i4, map, cVar);
    }

    M0.j getLayoutDirection();
}
