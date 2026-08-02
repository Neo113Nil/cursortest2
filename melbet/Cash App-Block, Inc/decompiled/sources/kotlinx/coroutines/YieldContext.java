package kotlinx.coroutines;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlinx.coroutines.Job;

/* loaded from: classes3.dex */
public final class YieldContext extends AbstractCoroutineContextElement {
    public static final Job.Key Key = new Job.Key();
    public boolean dispatcherWasUnconfined;
}
