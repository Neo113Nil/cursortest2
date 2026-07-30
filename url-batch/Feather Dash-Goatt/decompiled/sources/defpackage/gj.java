package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gj implements dn {
    public static final gj d = new gj();

    @Override // defpackage.dn
    public final CoroutineContext g() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // defpackage.dn
    public final void l(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
