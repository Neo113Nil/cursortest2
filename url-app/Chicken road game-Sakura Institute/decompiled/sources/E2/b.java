package E2;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata
/* loaded from: classes.dex */
public final class b implements C2.a {

    /* renamed from: d, reason: collision with root package name */
    public static final b f2310d = new b();

    @Override // C2.a
    public final CoroutineContext p() {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }

    @Override // C2.a
    public final void u(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }
}
