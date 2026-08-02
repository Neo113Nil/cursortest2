package com.squareup.cash.treehouse.activity;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class HostActivityDataBridge$setCachedActivityItem$4 extends SuspendLambda implements Function2 {
    public final /* synthetic */ SerializableActivityItem $activityItem;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HostActivityDataBridge$setCachedActivityItem$4(SerializableActivityItem serializableActivityItem, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$activityItem = serializableActivityItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        SerializableActivityItem serializableActivityItem = this.$activityItem;
        switch (i) {
            case 0:
                HostActivityDataBridge$setCachedActivityItem$4 hostActivityDataBridge$setCachedActivityItem$4 = new HostActivityDataBridge$setCachedActivityItem$4(serializableActivityItem, continuation, 0);
                hostActivityDataBridge$setCachedActivityItem$4.L$0 = obj;
                return hostActivityDataBridge$setCachedActivityItem$4;
            default:
                HostActivityDataBridge$setCachedActivityItem$4 hostActivityDataBridge$setCachedActivityItem$42 = new HostActivityDataBridge$setCachedActivityItem$4(serializableActivityItem, continuation, 1);
                hostActivityDataBridge$setCachedActivityItem$42.L$0 = obj;
                return hostActivityDataBridge$setCachedActivityItem$42;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ActivityDataBridge activityDataBridge = (ActivityDataBridge) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((HostActivityDataBridge$setCachedActivityItem$4) create(activityDataBridge, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        SerializableActivityItem serializableActivityItem = this.$activityItem;
        switch (i) {
            case 0:
                ActivityDataBridge activityDataBridge = (ActivityDataBridge) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (activityDataBridge.setCachedActivityItem(serializableActivityItem, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                ActivityDataBridge activityDataBridge2 = (ActivityDataBridge) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                this.L$0 = null;
                this.label = 1;
                Object cacheActivityItemAndCheckEnrichedReceipt = activityDataBridge2.cacheActivityItemAndCheckEnrichedReceipt(serializableActivityItem, this);
                return cacheActivityItemAndCheckEnrichedReceipt == coroutineSingletons2 ? coroutineSingletons2 : cacheActivityItemAndCheckEnrichedReceipt;
        }
    }
}
