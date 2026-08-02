package kotlinx.coroutines;

import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes3.dex */
public abstract class Dispatchers {
    public static final DefaultScheduler Default = DefaultScheduler.INSTANCE;
    public static final Unconfined Unconfined = Unconfined.INSTANCE;
}
