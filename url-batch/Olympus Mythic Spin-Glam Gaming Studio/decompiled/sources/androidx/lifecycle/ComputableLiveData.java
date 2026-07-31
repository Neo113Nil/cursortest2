package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: ComputableLiveData.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/lifecycle/ComputableLiveData;", "T", "", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "getExecutor$lifecycle_livedata", "()Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "refreshRunnable", "Ljava/lang/Runnable;", "getRefreshRunnable$lifecycle_livedata$annotations", "()V", "lifecycle-livedata"}, k = 1, mv = {2, 0, 0}, xi = 48)
@RestrictTo
/* loaded from: classes.dex */
public abstract class ComputableLiveData<T> {
    private final Executor executor;
    public final Runnable refreshRunnable;

    /* renamed from: getExecutor$lifecycle_livedata, reason: from getter */
    public final Executor getExecutor() {
        return this.executor;
    }
}
