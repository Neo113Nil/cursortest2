package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import okio.internal.DefaultSocket;

/* loaded from: classes3.dex */
public interface Deferred extends Job {
    Object await(Continuation continuation);

    Object getCompleted();

    DefaultSocket getOnAwait();
}
