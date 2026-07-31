package coil.disk;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DiskLruCache.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "coil.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DiskLruCache$launchCleanup$1 extends SuspendLambda implements Function2 {
    int label;
    final /* synthetic */ DiskLruCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiskLruCache$launchCleanup$1(DiskLruCache diskLruCache, Continuation continuation) {
        super(2, continuation);
        this.this$0 = diskLruCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new DiskLruCache$launchCleanup$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((DiskLruCache$launchCleanup$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean z;
        boolean z2;
        boolean journalRewriteRequired;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                z = diskLruCache.initialized;
                if (z) {
                    z2 = diskLruCache.closed;
                    if (!z2) {
                        try {
                            diskLruCache.trimToSize();
                        } catch (IOException unused) {
                            diskLruCache.mostRecentTrimFailed = true;
                        }
                        try {
                            journalRewriteRequired = diskLruCache.journalRewriteRequired();
                            if (journalRewriteRequired) {
                                diskLruCache.writeJournal();
                            }
                        } catch (IOException unused2) {
                            diskLruCache.mostRecentRebuildFailed = true;
                            diskLruCache.journalWriter = Okio.buffer(Okio.blackhole());
                        }
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
