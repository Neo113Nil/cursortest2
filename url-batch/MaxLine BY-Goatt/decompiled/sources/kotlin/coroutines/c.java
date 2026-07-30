package kotlin.coroutines;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class c implements Serializable {
    public static final a n = new a(null);
    private static final long serialVersionUID = 0;
    public final CoroutineContext[] m;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public c(CoroutineContext[] coroutineContextArr) {
        this.m = coroutineContextArr;
    }

    private final Object readResolve() {
        CoroutineContext coroutineContext = h.m;
        for (CoroutineContext coroutineContext2 : this.m) {
            coroutineContext = coroutineContext.p(coroutineContext2);
        }
        return coroutineContext;
    }
}
