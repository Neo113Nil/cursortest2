package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public interface gm0 extends CoroutineContext.Element {
    @Override // kotlin.coroutines.CoroutineContext.Element
    default f getKey() {
        return j50.z;
    }

    Object j(Function1 function1, fn fnVar);
}
