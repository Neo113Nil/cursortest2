package androidx.work.impl;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: WorkDatabase.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0003\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "PRUNE_THRESHOLD_MILLIS", "J", "work-runtime_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class WorkDatabaseKt {
    private static final long PRUNE_THRESHOLD_MILLIS = TimeUnit.DAYS.toMillis(1);
}
