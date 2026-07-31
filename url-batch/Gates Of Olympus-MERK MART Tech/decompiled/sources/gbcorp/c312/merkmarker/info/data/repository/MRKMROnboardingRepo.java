package gbcorp.c312.merkmarker.info.data.repository;

import gbcorp.c312.merkmarker.info.data.datastore.MRKMROnboardingPrefs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;

/* compiled from: MRKMROnboardingRepo.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/repository/MRKMROnboardingRepo;", "", "mrkmrOnboardingStoreManager", "Lgbcorp/c312/merkmarker/info/data/datastore/MRKMROnboardingPrefs;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lgbcorp/c312/merkmarker/info/data/datastore/MRKMROnboardingPrefs;Lkotlinx/coroutines/CoroutineDispatcher;)V", "observeOnboardingState", "Lkotlinx/coroutines/flow/Flow;", "", "setOnboardingState", "", "state", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MRKMROnboardingRepo {
    public static final int $stable = 8;
    private final CoroutineDispatcher coroutineDispatcher;
    private final MRKMROnboardingPrefs mrkmrOnboardingStoreManager;

    public MRKMROnboardingRepo(MRKMROnboardingPrefs mrkmrOnboardingStoreManager, CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(mrkmrOnboardingStoreManager, "mrkmrOnboardingStoreManager");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        this.mrkmrOnboardingStoreManager = mrkmrOnboardingStoreManager;
        this.coroutineDispatcher = coroutineDispatcher;
    }

    public final Flow<Boolean> observeOnboardingState() {
        return this.mrkmrOnboardingStoreManager.getOnboardedStateFlow();
    }

    public final Object setOnboardingState(boolean z, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.coroutineDispatcher, new MRKMROnboardingRepo$setOnboardingState$2(this, z, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
