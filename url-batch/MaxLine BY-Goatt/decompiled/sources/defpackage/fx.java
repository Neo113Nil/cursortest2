package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fx implements o30 {
    public static final fx m = new fx();

    @Override // defpackage.o30
    public final CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // defpackage.o30
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
