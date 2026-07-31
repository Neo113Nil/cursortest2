package gbcorp.c312.merkmarker.info.data.repository;

import gbcorp.c312.merkmarker.info.data.datastore.MRKMROnboardingPrefs;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MRKMROnboardingRepo.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.data.repository.MRKMROnboardingRepo$setOnboardingState$2", f = "MRKMROnboardingRepo.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, nl = {20}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class MRKMROnboardingRepo$setOnboardingState$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $state;
    int label;
    final /* synthetic */ MRKMROnboardingRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MRKMROnboardingRepo$setOnboardingState$2(MRKMROnboardingRepo mRKMROnboardingRepo, boolean z, Continuation<? super MRKMROnboardingRepo$setOnboardingState$2> continuation) {
        super(2, continuation);
        this.this$0 = mRKMROnboardingRepo;
        this.$state = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MRKMROnboardingRepo$setOnboardingState$2(this.this$0, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MRKMROnboardingRepo$setOnboardingState$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MRKMROnboardingPrefs mRKMROnboardingPrefs;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mRKMROnboardingPrefs = this.this$0.mrkmrOnboardingStoreManager;
            this.label = 1;
            if (mRKMROnboardingPrefs.setOnboardedState(this.$state, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
