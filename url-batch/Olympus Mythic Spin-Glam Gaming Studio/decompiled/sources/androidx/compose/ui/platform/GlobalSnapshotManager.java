package androidx.compose.ui.platform;

import androidx.compose.runtime.snapshots.Snapshot;
import com.ironsource.X3;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: GlobalSnapshotManager.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/GlobalSnapshotManager;", "", "()V", X3.i.d0, "Ljava/util/concurrent/atomic/AtomicBoolean;", "ensureStarted", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GlobalSnapshotManager {
    public static final GlobalSnapshotManager INSTANCE = new GlobalSnapshotManager();
    private static final AtomicBoolean started = new AtomicBoolean(false);

    private GlobalSnapshotManager() {
    }

    public final void ensureStarted() {
        if (started.compareAndSet(false, true)) {
            final Channel Channel$default = ChannelKt.Channel$default(-1, null, null, 6, null);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(AndroidUiDispatcher.INSTANCE.getMain()), null, null, new GlobalSnapshotManager$ensureStarted$1(Channel$default, null), 3, null);
            Snapshot.INSTANCE.registerGlobalWriteObserver(new Function1() { // from class: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m2120invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m2120invoke(@NotNull Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Channel.this.mo8216trySendJP2dKIU(Unit.INSTANCE);
                }
            });
        }
    }
}
