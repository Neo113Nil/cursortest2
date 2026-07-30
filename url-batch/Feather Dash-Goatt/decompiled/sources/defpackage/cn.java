package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class cn implements sn {
    public final CoroutineContext d;

    public cn(CoroutineContext coroutineContext) {
        this.d = coroutineContext;
    }

    @Override // defpackage.sn
    public final CoroutineContext f() {
        return this.d;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.d + ')';
    }
}
