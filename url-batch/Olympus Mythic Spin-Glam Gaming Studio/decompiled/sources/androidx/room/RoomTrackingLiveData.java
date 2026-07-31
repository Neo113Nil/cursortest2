package androidx.room;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RoomTrackingLiveData.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/room/RoomTrackingLiveData;", "T", "Landroidx/lifecycle/LiveData;", "", "onActive", "()V", "onInactive", "Landroidx/room/RoomDatabase;", "database", "Landroidx/room/RoomDatabase;", "getDatabase", "()Landroidx/room/RoomDatabase;", "Landroidx/room/InvalidationLiveDataContainer;", "container", "Landroidx/room/InvalidationLiveDataContainer;", "", "inTransaction", "Z", "getInTransaction", "()Z", "Ljava/lang/Runnable;", "refreshRunnable", "Ljava/lang/Runnable;", "getRefreshRunnable", "()Ljava/lang/Runnable;", "invalidationRunnable", "getInvalidationRunnable", "Ljava/util/concurrent/Executor;", "getQueryExecutor", "()Ljava/util/concurrent/Executor;", "queryExecutor", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressLint({"RestrictedApi"})
/* loaded from: classes4.dex */
public final class RoomTrackingLiveData<T> extends LiveData<T> {
    private final InvalidationLiveDataContainer container;
    private final RoomDatabase database;
    private final boolean inTransaction;
    private final Runnable invalidationRunnable;
    private final Runnable refreshRunnable;

    public final Runnable getInvalidationRunnable() {
        return this.invalidationRunnable;
    }

    @Override // androidx.lifecycle.LiveData
    protected void onActive() {
        super.onActive();
        InvalidationLiveDataContainer invalidationLiveDataContainer = this.container;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        invalidationLiveDataContainer.onActive(this);
        getQueryExecutor().execute(this.refreshRunnable);
    }

    @Override // androidx.lifecycle.LiveData
    protected void onInactive() {
        super.onInactive();
        InvalidationLiveDataContainer invalidationLiveDataContainer = this.container;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        invalidationLiveDataContainer.onInactive(this);
    }

    public final Executor getQueryExecutor() {
        if (this.inTransaction) {
            return this.database.getTransactionExecutor();
        }
        return this.database.getQueryExecutor();
    }
}
