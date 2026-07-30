package kotlin.coroutines;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class b implements f {
    public final Function1 d;
    public final f e;

    public b(f fVar, Function1 function1) {
        fVar.getClass();
        this.d = function1;
        this.e = fVar instanceof b ? ((b) fVar).e : fVar;
    }
}
