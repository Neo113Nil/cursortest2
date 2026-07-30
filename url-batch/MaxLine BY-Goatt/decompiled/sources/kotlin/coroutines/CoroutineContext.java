package kotlin.coroutines;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface CoroutineContext {

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface Element extends CoroutineContext {
        g getKey();
    }

    CoroutineContext H(g gVar);

    Element m(g gVar);

    CoroutineContext p(CoroutineContext coroutineContext);

    Object y(Object obj, Function2 function2);
}
