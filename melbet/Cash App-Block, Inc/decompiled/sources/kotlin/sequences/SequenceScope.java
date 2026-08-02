package kotlin.sequences;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* loaded from: classes3.dex */
public abstract class SequenceScope {
    public abstract void yield(Object obj, Continuation continuation);

    public abstract Object yieldAll(Iterator it, RestrictedSuspendLambda restrictedSuspendLambda);
}
