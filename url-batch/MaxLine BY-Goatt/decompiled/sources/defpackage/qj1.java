package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface qj1 extends h41 {
    default pj1 G(int i, int i2, Map map, Function1 function1) {
        return O(i, i2, map, null, function1);
    }

    pj1 O(int i, int i2, Map map, Function1 function1, Function1 function12);
}
