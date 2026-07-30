package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class m30 implements a50 {
    public final CoroutineContext m;

    public m30(CoroutineContext coroutineContext) {
        this.m = coroutineContext;
    }

    @Override // defpackage.a50
    public final CoroutineContext n() {
        return this.m;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.m + ')';
    }
}
