package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BringIntoViewResponder.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2", f = "BringIntoViewResponder.kt", l = {Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 230}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class BringIntoViewResponderModifier$bringChildIntoView$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ LayoutCoordinates $childCoordinates;
    final /* synthetic */ Rect $rect;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ BringIntoViewResponderModifier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BringIntoViewResponderModifier$bringChildIntoView$2(BringIntoViewResponderModifier bringIntoViewResponderModifier, LayoutCoordinates layoutCoordinates, Rect rect, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bringIntoViewResponderModifier;
        this.$childCoordinates = layoutCoordinates;
        this.$rect = rect;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        BringIntoViewResponderModifier$bringChildIntoView$2 bringIntoViewResponderModifier$bringChildIntoView$2 = new BringIntoViewResponderModifier$bringChildIntoView$2(this.this$0, this.$childCoordinates, this.$rect, continuation);
        bringIntoViewResponderModifier$bringChildIntoView$2.L$0 = obj;
        return bringIntoViewResponderModifier$bringChildIntoView$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((BringIntoViewResponderModifier$bringChildIntoView$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:23:0x0032, B:24:0x00a8, B:26:0x00b0), top: B:22:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Pair pair;
        Pair pair2;
        Pair pair3;
        Rect localRectOf;
        Pair pair4;
        boolean completelyOverlaps;
        LayoutCoordinates layoutCoordinates;
        Pair pair5;
        Pair pair6;
        Object dispatchRequest;
        Pair pair7;
        Pair pair8;
        Pair pair9;
        Pair pair10;
        Pair pair11;
        Object dispatchRequest2;
        Pair pair12;
        Pair pair13;
        Pair pair14;
        Pair pair15;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                LayoutCoordinates layoutCoordinates2 = this.this$0.getLayoutCoordinates();
                if (layoutCoordinates2 != null && this.$childCoordinates.isAttached()) {
                    localRectOf = BringIntoViewResponderKt.localRectOf(layoutCoordinates2, this.$childCoordinates, this.$rect);
                    Pair pair16 = new Pair(localRectOf, JobKt.getJob(coroutineScope.getCoroutineContext()));
                    pair4 = this.this$0.newestReceivedRequest;
                    this.this$0.newestReceivedRequest = pair16;
                    if (pair4 != null) {
                        try {
                            completelyOverlaps = BringIntoViewResponderKt.completelyOverlaps((Rect) pair4.getFirst(), localRectOf);
                            if (completelyOverlaps) {
                                Job job = (Job) pair4.getSecond();
                                this.L$0 = layoutCoordinates2;
                                this.L$1 = pair16;
                                this.L$2 = pair4;
                                this.label = 2;
                                if (job.join(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                layoutCoordinates = layoutCoordinates2;
                                pair5 = pair16;
                                pair6 = pair4;
                                pair11 = this.this$0.newestDispatchedRequest;
                                if (pair11 == pair6) {
                                }
                                pair13 = this.this$0.newestDispatchedRequest;
                                pair14 = this.this$0.newestReceivedRequest;
                                if (pair13 == pair14) {
                                }
                                pair15 = this.this$0.newestReceivedRequest;
                                if (pair15 == pair5) {
                                }
                                return Unit.INSTANCE;
                            }
                        } catch (Throwable th) {
                            th = th;
                            coroutine_suspended = pair16;
                            pair = this.this$0.newestDispatchedRequest;
                            pair2 = this.this$0.newestReceivedRequest;
                            if (pair == pair2) {
                                this.this$0.newestDispatchedRequest = null;
                            }
                            pair3 = this.this$0.newestReceivedRequest;
                            if (pair3 == coroutine_suspended) {
                                this.this$0.newestReceivedRequest = null;
                            }
                            throw th;
                        }
                    }
                    BringIntoViewResponderModifier bringIntoViewResponderModifier = this.this$0;
                    this.L$0 = pair16;
                    this.label = 1;
                    dispatchRequest = bringIntoViewResponderModifier.dispatchRequest(pair16, layoutCoordinates2, this);
                    if (dispatchRequest == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pair7 = pair16;
                    Unit unit = Unit.INSTANCE;
                    pair8 = this.this$0.newestDispatchedRequest;
                    pair9 = this.this$0.newestReceivedRequest;
                    if (pair8 == pair9) {
                    }
                    pair10 = this.this$0.newestReceivedRequest;
                    if (pair10 == pair7) {
                    }
                    return unit;
                }
                return Unit.INSTANCE;
            }
            if (i == 1) {
                pair7 = (Pair) this.L$0;
                ResultKt.throwOnFailure(obj);
                Unit unit2 = Unit.INSTANCE;
                pair8 = this.this$0.newestDispatchedRequest;
                pair9 = this.this$0.newestReceivedRequest;
                if (pair8 == pair9) {
                    this.this$0.newestDispatchedRequest = null;
                }
                pair10 = this.this$0.newestReceivedRequest;
                if (pair10 == pair7) {
                    this.this$0.newestReceivedRequest = null;
                }
                return unit2;
            }
            if (i != 2) {
                if (i == 3) {
                    pair12 = (Pair) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    pair5 = pair12;
                    pair13 = this.this$0.newestDispatchedRequest;
                    pair14 = this.this$0.newestReceivedRequest;
                    if (pair13 == pair14) {
                        this.this$0.newestDispatchedRequest = null;
                    }
                    pair15 = this.this$0.newestReceivedRequest;
                    if (pair15 == pair5) {
                        this.this$0.newestReceivedRequest = null;
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pair6 = (Pair) this.L$2;
            pair5 = (Pair) this.L$1;
            layoutCoordinates = (LayoutCoordinates) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                pair11 = this.this$0.newestDispatchedRequest;
                if (pair11 == pair6) {
                    BringIntoViewResponderModifier bringIntoViewResponderModifier2 = this.this$0;
                    this.L$0 = pair5;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    dispatchRequest2 = bringIntoViewResponderModifier2.dispatchRequest(pair5, layoutCoordinates, this);
                    if (dispatchRequest2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pair12 = pair5;
                    pair5 = pair12;
                }
                pair13 = this.this$0.newestDispatchedRequest;
                pair14 = this.this$0.newestReceivedRequest;
                if (pair13 == pair14) {
                }
                pair15 = this.this$0.newestReceivedRequest;
                if (pair15 == pair5) {
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                coroutine_suspended = pair5;
                pair = this.this$0.newestDispatchedRequest;
                pair2 = this.this$0.newestReceivedRequest;
                if (pair == pair2) {
                }
                pair3 = this.this$0.newestReceivedRequest;
                if (pair3 == coroutine_suspended) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
