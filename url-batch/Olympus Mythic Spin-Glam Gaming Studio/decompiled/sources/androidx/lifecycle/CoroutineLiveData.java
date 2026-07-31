package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: CoroutineLiveData.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u001e\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\tH\u0080@¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000f\u0010\u000eR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/CoroutineLiveData;", "T", "Landroidx/lifecycle/MediatorLiveData;", "Landroidx/lifecycle/LiveData;", "source", "Lkotlinx/coroutines/DisposableHandle;", "emitSource$lifecycle_livedata", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSource", "", "clearSource$lifecycle_livedata", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearSource", "onActive", "()V", "onInactive", "Landroidx/lifecycle/BlockRunner;", "blockRunner", "Landroidx/lifecycle/BlockRunner;", "Landroidx/lifecycle/EmittedSource;", "emittedSource", "Landroidx/lifecycle/EmittedSource;", "lifecycle-livedata"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CoroutineLiveData<T> extends MediatorLiveData<T> {
    private BlockRunner blockRunner;
    private EmittedSource emittedSource;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emitSource$lifecycle_livedata(LiveData liveData, Continuation continuation) {
        CoroutineLiveData$emitSource$1 coroutineLiveData$emitSource$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof CoroutineLiveData$emitSource$1) {
            coroutineLiveData$emitSource$1 = (CoroutineLiveData$emitSource$1) continuation;
            int i2 = coroutineLiveData$emitSource$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coroutineLiveData$emitSource$1.label = i2 - Integer.MIN_VALUE;
                obj = coroutineLiveData$emitSource$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = coroutineLiveData$emitSource$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    coroutineLiveData$emitSource$1.L$0 = liveData;
                    coroutineLiveData$emitSource$1.label = 1;
                    if (clearSource$lifecycle_livedata(coroutineLiveData$emitSource$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        EmittedSource emittedSource = (EmittedSource) obj;
                        this.emittedSource = emittedSource;
                        return emittedSource;
                    }
                    liveData = (LiveData) coroutineLiveData$emitSource$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                coroutineLiveData$emitSource$1.L$0 = null;
                coroutineLiveData$emitSource$1.label = 2;
                obj = CoroutineLiveDataKt.addDisposableSource(this, liveData, coroutineLiveData$emitSource$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                EmittedSource emittedSource2 = (EmittedSource) obj;
                this.emittedSource = emittedSource2;
                return emittedSource2;
            }
        }
        coroutineLiveData$emitSource$1 = new CoroutineLiveData$emitSource$1(this, continuation);
        obj = coroutineLiveData$emitSource$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = coroutineLiveData$emitSource$1.label;
        if (i != 0) {
        }
        coroutineLiveData$emitSource$1.L$0 = null;
        coroutineLiveData$emitSource$1.label = 2;
        obj = CoroutineLiveDataKt.addDisposableSource(this, liveData, coroutineLiveData$emitSource$1);
        if (obj == coroutine_suspended) {
        }
        EmittedSource emittedSource22 = (EmittedSource) obj;
        this.emittedSource = emittedSource22;
        return emittedSource22;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object clearSource$lifecycle_livedata(Continuation continuation) {
        CoroutineLiveData$clearSource$1 coroutineLiveData$clearSource$1;
        int i;
        if (continuation instanceof CoroutineLiveData$clearSource$1) {
            coroutineLiveData$clearSource$1 = (CoroutineLiveData$clearSource$1) continuation;
            int i2 = coroutineLiveData$clearSource$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coroutineLiveData$clearSource$1.label = i2 - Integer.MIN_VALUE;
                Object obj = coroutineLiveData$clearSource$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = coroutineLiveData$clearSource$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    EmittedSource emittedSource = this.emittedSource;
                    if (emittedSource != null) {
                        coroutineLiveData$clearSource$1.label = 1;
                        if (emittedSource.disposeNow(coroutineLiveData$clearSource$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.emittedSource = null;
                return Unit.INSTANCE;
            }
        }
        coroutineLiveData$clearSource$1 = new CoroutineLiveData$clearSource$1(this, continuation);
        Object obj2 = coroutineLiveData$clearSource$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = coroutineLiveData$clearSource$1.label;
        if (i != 0) {
        }
        this.emittedSource = null;
        return Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    protected void onActive() {
        super.onActive();
        BlockRunner blockRunner = this.blockRunner;
        if (blockRunner != null) {
            blockRunner.maybeRun();
        }
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    protected void onInactive() {
        super.onInactive();
        BlockRunner blockRunner = this.blockRunner;
        if (blockRunner != null) {
            blockRunner.cancel();
        }
    }
}
