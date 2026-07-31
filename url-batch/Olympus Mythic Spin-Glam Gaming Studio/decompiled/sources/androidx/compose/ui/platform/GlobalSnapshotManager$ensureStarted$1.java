package androidx.compose.ui.platform;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GlobalSnapshotManager.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class GlobalSnapshotManager$ensureStarted$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ Channel $channel;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GlobalSnapshotManager$ensureStarted$1(Channel channel, Continuation continuation) {
        super(2, continuation);
        this.$channel = channel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new GlobalSnapshotManager$ensureStarted$1(this.$channel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((GlobalSnapshotManager$ensureStarted$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #1 {all -> 0x0017, blocks: (B:6:0x0013, B:7:0x0038, B:9:0x0040, B:10:0x002b, B:20:0x0026), top: B:2:0x0007 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0035 -> B:7:0x0038). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        ReceiveChannel receiveChannel;
        ChannelIterator it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                receiveChannel = this.$channel;
                it = receiveChannel.iterator();
                this.L$0 = receiveChannel;
                this.L$1 = it;
                this.label = 1;
                obj = it.hasNext(this);
                if (obj == coroutine_suspended) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (ChannelIterator) this.L$1;
                receiveChannel = (ReceiveChannel) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    Snapshot.INSTANCE.sendApplyNotifications();
                    this.L$0 = receiveChannel;
                    this.L$1 = it;
                    this.label = 1;
                    obj = it.hasNext(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        ChannelsKt.cancelConsumed(receiveChannel, null);
                        return Unit.INSTANCE;
                    }
                }
            }
        } finally {
        }
    }
}
