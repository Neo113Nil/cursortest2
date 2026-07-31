package com.onesignal.common.consistency.impl;

import com.onesignal.common.consistency.RywData;
import com.onesignal.common.consistency.models.ICondition;
import com.onesignal.common.consistency.models.IConsistencyKeyEnum;
import com.onesignal.common.consistency.models.IConsistencyManager;
import com.onesignal.core.BuildConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: ConsistencyManager.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u001e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u0012\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\u0016J&\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\u001aR(\u0010\u0003\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/onesignal/common/consistency/impl/ConsistencyManager;", "Lcom/onesignal/common/consistency/models/IConsistencyManager;", "()V", "conditions", "", "Lkotlin/Pair;", "Lcom/onesignal/common/consistency/models/ICondition;", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/onesignal/common/consistency/RywData;", "indexedTokens", "", "", "Lcom/onesignal/common/consistency/models/IConsistencyKeyEnum;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "checkConditionsAndComplete", "", "getRywDataFromAwaitableCondition", "condition", "(Lcom/onesignal/common/consistency/models/ICondition;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolveConditionsWithID", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setRywData", "key", "value", "(Ljava/lang/String;Lcom/onesignal/common/consistency/models/IConsistencyKeyEnum;Lcom/onesignal/common/consistency/RywData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConsistencyManager implements IConsistencyManager {
    private final Mutex mutex = MutexKt.Mutex$default(false, 1, null);
    private final Map<String, Map<IConsistencyKeyEnum, RywData>> indexedTokens = new LinkedHashMap();
    private final List<Pair<ICondition, CompletableDeferred<RywData>>> conditions = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:11:0x0063, B:13:0x006b, B:14:0x0075), top: B:10:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.onesignal.common.consistency.models.IConsistencyManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setRywData(String str, IConsistencyKeyEnum iConsistencyKeyEnum, RywData rywData, Continuation<? super Unit> continuation) {
        ConsistencyManager$setRywData$1 consistencyManager$setRywData$1;
        int i;
        Mutex mutex;
        ConsistencyManager consistencyManager;
        LinkedHashMap linkedHashMap;
        try {
            if (continuation instanceof ConsistencyManager$setRywData$1) {
                consistencyManager$setRywData$1 = (ConsistencyManager$setRywData$1) continuation;
                if ((consistencyManager$setRywData$1.label & Integer.MIN_VALUE) != 0) {
                    consistencyManager$setRywData$1.label -= Integer.MIN_VALUE;
                    Object obj = consistencyManager$setRywData$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = consistencyManager$setRywData$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.mutex;
                        consistencyManager$setRywData$1.L$0 = this;
                        consistencyManager$setRywData$1.L$1 = str;
                        consistencyManager$setRywData$1.L$2 = iConsistencyKeyEnum;
                        consistencyManager$setRywData$1.L$3 = rywData;
                        consistencyManager$setRywData$1.L$4 = mutex;
                        consistencyManager$setRywData$1.label = 1;
                        if (mutex.lock(null, consistencyManager$setRywData$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        consistencyManager = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex2 = (Mutex) consistencyManager$setRywData$1.L$4;
                        rywData = (RywData) consistencyManager$setRywData$1.L$3;
                        iConsistencyKeyEnum = (IConsistencyKeyEnum) consistencyManager$setRywData$1.L$2;
                        String str2 = (String) consistencyManager$setRywData$1.L$1;
                        consistencyManager = (ConsistencyManager) consistencyManager$setRywData$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        str = str2;
                    }
                    Map<String, Map<IConsistencyKeyEnum, RywData>> map = consistencyManager.indexedTokens;
                    linkedHashMap = map.get(str);
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap();
                        map.put(str, linkedHashMap);
                    }
                    linkedHashMap.put(iConsistencyKeyEnum, rywData);
                    consistencyManager.checkConditionsAndComplete();
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            Map<String, Map<IConsistencyKeyEnum, RywData>> map2 = consistencyManager.indexedTokens;
            linkedHashMap = map2.get(str);
            if (linkedHashMap == null) {
            }
            linkedHashMap.put(iConsistencyKeyEnum, rywData);
            consistencyManager.checkConditionsAndComplete();
            Unit unit2 = Unit.INSTANCE;
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        consistencyManager$setRywData$1 = new ConsistencyManager$setRywData$1(this, continuation);
        Object obj2 = consistencyManager$setRywData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = consistencyManager$setRywData$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.onesignal.common.consistency.models.IConsistencyManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getRywDataFromAwaitableCondition(ICondition iCondition, Continuation<? super CompletableDeferred<RywData>> continuation) {
        ConsistencyManager$getRywDataFromAwaitableCondition$1 consistencyManager$getRywDataFromAwaitableCondition$1;
        int i;
        Mutex mutex;
        ConsistencyManager consistencyManager;
        try {
            if (continuation instanceof ConsistencyManager$getRywDataFromAwaitableCondition$1) {
                consistencyManager$getRywDataFromAwaitableCondition$1 = (ConsistencyManager$getRywDataFromAwaitableCondition$1) continuation;
                if ((consistencyManager$getRywDataFromAwaitableCondition$1.label & Integer.MIN_VALUE) != 0) {
                    consistencyManager$getRywDataFromAwaitableCondition$1.label -= Integer.MIN_VALUE;
                    Object obj = consistencyManager$getRywDataFromAwaitableCondition$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = consistencyManager$getRywDataFromAwaitableCondition$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.mutex;
                        consistencyManager$getRywDataFromAwaitableCondition$1.L$0 = this;
                        consistencyManager$getRywDataFromAwaitableCondition$1.L$1 = iCondition;
                        consistencyManager$getRywDataFromAwaitableCondition$1.L$2 = mutex;
                        consistencyManager$getRywDataFromAwaitableCondition$1.label = 1;
                        if (mutex.lock(null, consistencyManager$getRywDataFromAwaitableCondition$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        consistencyManager = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex2 = (Mutex) consistencyManager$getRywDataFromAwaitableCondition$1.L$2;
                        ICondition iCondition2 = (ICondition) consistencyManager$getRywDataFromAwaitableCondition$1.L$1;
                        consistencyManager = (ConsistencyManager) consistencyManager$getRywDataFromAwaitableCondition$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        iCondition = iCondition2;
                    }
                    CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    consistencyManager.conditions.add(new Pair<>(iCondition, CompletableDeferred$default));
                    consistencyManager.checkConditionsAndComplete();
                    return CompletableDeferred$default;
                }
            }
            CompletableDeferred CompletableDeferred$default2 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            consistencyManager.conditions.add(new Pair<>(iCondition, CompletableDeferred$default2));
            consistencyManager.checkConditionsAndComplete();
            return CompletableDeferred$default2;
        } finally {
            mutex.unlock(null);
        }
        consistencyManager$getRywDataFromAwaitableCondition$1 = new ConsistencyManager$getRywDataFromAwaitableCondition$1(this, continuation);
        Object obj2 = consistencyManager$getRywDataFromAwaitableCondition$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = consistencyManager$getRywDataFromAwaitableCondition$1.label;
        if (i != 0) {
        }
    }

    @Override // com.onesignal.common.consistency.models.IConsistencyManager
    public Object resolveConditionsWithID(String str, Continuation<? super Unit> continuation) {
        ArrayList arrayList = new ArrayList();
        for (Pair<ICondition, CompletableDeferred<RywData>> pair : this.conditions) {
            ICondition component1 = pair.component1();
            CompletableDeferred<RywData> component2 = pair.component2();
            if (Intrinsics.areEqual(component1.getId(), str) && !component2.isCompleted()) {
                component2.complete(null);
            }
            arrayList.add(new Pair(component1, component2));
        }
        this.conditions.removeAll(arrayList);
        return Unit.INSTANCE;
    }

    private final void checkConditionsAndComplete() {
        ArrayList arrayList = new ArrayList();
        for (Pair<ICondition, CompletableDeferred<RywData>> pair : this.conditions) {
            ICondition component1 = pair.component1();
            CompletableDeferred<RywData> component2 = pair.component2();
            if (component1.isMet(this.indexedTokens)) {
                RywData rywData = component1.getRywData(this.indexedTokens);
                if (!component2.isCompleted()) {
                    component2.complete(rywData);
                }
                arrayList.add(new Pair(component1, component2));
            }
        }
        this.conditions.removeAll(arrayList);
    }
}
