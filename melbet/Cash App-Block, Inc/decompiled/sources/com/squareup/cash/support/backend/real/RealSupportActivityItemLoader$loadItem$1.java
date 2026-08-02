package com.squareup.cash.support.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.KeysetHandle;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.ActivityItemKt;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.loader.Activities;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.ActivitiesManager$ActivityGetHandler$Failure;
import com.squareup.cash.activity.backend.loader.ActivitiesManager$ActivityGetHandler$NotFound;
import com.squareup.cash.activity.backend.loader.ActivitiesManager$ActivityGetHandler$Result;
import com.squareup.cash.activity.backend.loader.ActivitiesManager$ActivityGetHandler$Success;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.backend.real.RealSupportActivityItemLoader;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealSupportActivityItemLoader$loadItem$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $entityId;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ RealSupportActivityItemLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSupportActivityItemLoader$loadItem$1(RealSupportActivityItemLoader realSupportActivityItemLoader, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realSupportActivityItemLoader;
        this.$entityId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RealSupportActivityItemLoader$loadItem$1 realSupportActivityItemLoader$loadItem$1 = new RealSupportActivityItemLoader$loadItem$1(this.this$0, this.$entityId, continuation);
        realSupportActivityItemLoader$loadItem$1.L$0 = obj;
        return realSupportActivityItemLoader$loadItem$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealSupportActivityItemLoader$loadItem$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x015d, code lost:
    
        if (r5.emit(r1, r16) == r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fb, code lost:
    
        if (r7 == r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bf, code lost:
    
        if (r5.emit(r1, r16) == r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cd, code lost:
    
        if (r5.emit(r7, r16) == r6) goto L61;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map map;
        List list;
        Object requestItem;
        Object obj2 = SupportActivityItemLoader.State.Failure.INSTANCE;
        RealSupportActivityItemLoader realSupportActivityItemLoader = this.this$0;
        LinkedHashMap linkedHashMap = realSupportActivityItemLoader.cacheFromFetch;
        ErrorReporter errorReporter = realSupportActivityItemLoader.errorReporter;
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = this.$entityId;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Activities activities = RealActivitiesCacheManager.take$default(realSupportActivityItemLoader.activitiesCacheManager, realSupportActivityItemLoader.getActivityContext()).get();
            if (activities == null || (list = activities.recentActivities) == null) {
                map = EmptyMap.INSTANCE;
                map.getClass();
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof FormattedPaymentHistoryActivityItem) {
                        arrayList.add(obj3);
                    }
                }
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                if (mapCapacity < 16) {
                    mapCapacity = 16;
                }
                map = new LinkedHashMap(mapCapacity);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    map.put(ActivityItemKt.getItemId((FormattedPaymentHistoryActivityItem) next), next);
                }
            }
            FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem = (FormattedPaymentHistoryActivityItem) MapsKt__MapsKt.plus(map, linkedHashMap).get(str);
            if (formattedPaymentHistoryActivityItem != null) {
                SupportActivityItemLoader.State.Success success = new SupportActivityItemLoader.State.Success(RealSupportActivityItemLoader.access$toViewModel(realSupportActivityItemLoader, formattedPaymentHistoryActivityItem), formattedPaymentHistoryActivityItem);
                this.L$0 = null;
                this.label = 1;
            } else {
                SupportActivityItemLoader.State.Failure failure = SupportActivityItemLoader.State.Failure.INSTANCE$1;
                this.L$0 = flowCollector;
                this.label = 2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                SafeTrace.throwOnFailure(obj);
                ActivityItemGlobalId activityItemGlobalId = new ActivityItemGlobalId(new ActivityItemGlobalId.ActivityId.ActivityRowId(str), new ActivityToken(ActivityTokenType.CUSTOMER_TOKEN, realSupportActivityItemLoader.getActivityContext().activityToken.token, (String) null, 12), 4);
                KeysetHandle keysetHandle = realSupportActivityItemLoader.getHandler;
                ActivitiesManager.ActivityContext activityContext = realSupportActivityItemLoader.getActivityContext();
                this.L$0 = flowCollector;
                this.label = 3;
                requestItem = keysetHandle.requestItem(activityContext, activityItemGlobalId, this);
            } else if (i == 3) {
                SafeTrace.throwOnFailure(obj);
                requestItem = obj;
                ActivitiesManager$ActivityGetHandler$Result activitiesManager$ActivityGetHandler$Result = (ActivitiesManager$ActivityGetHandler$Result) requestItem;
                boolean areEqual = Intrinsics.areEqual(activitiesManager$ActivityGetHandler$Result, ActivitiesManager$ActivityGetHandler$Failure.INSTANCE);
                ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                if (areEqual) {
                    errorReporter.report(new SupportActivityItemLoaderError(str, RealSupportActivityItemLoader.AnalyticsFailures.FAILED_TO_LOAD), defaultSamplingStrategy);
                } else if (Intrinsics.areEqual(activitiesManager$ActivityGetHandler$Result, ActivitiesManager$ActivityGetHandler$NotFound.INSTANCE)) {
                    errorReporter.report(new SupportActivityItemLoaderError(str, RealSupportActivityItemLoader.AnalyticsFailures.NOT_FOUND), defaultSamplingStrategy);
                } else {
                    if (!(activitiesManager$ActivityGetHandler$Result instanceof ActivitiesManager$ActivityGetHandler$Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ActivityItem activityItem = ((ActivitiesManager$ActivityGetHandler$Success) activitiesManager$ActivityGetHandler$Result).item;
                    FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem2 = activityItem instanceof FormattedPaymentHistoryActivityItem ? (FormattedPaymentHistoryActivityItem) activityItem : null;
                    if (formattedPaymentHistoryActivityItem2 != null) {
                        linkedHashMap.put(ActivityItemKt.getItemId(formattedPaymentHistoryActivityItem2), formattedPaymentHistoryActivityItem2);
                        obj2 = new SupportActivityItemLoader.State.Success(RealSupportActivityItemLoader.access$toViewModel(realSupportActivityItemLoader, formattedPaymentHistoryActivityItem2), formattedPaymentHistoryActivityItem2);
                    } else {
                        errorReporter.report(new SupportActivityItemLoaderError(str, RealSupportActivityItemLoader.AnalyticsFailures.INVALID_FORMAT), defaultSamplingStrategy);
                    }
                }
                this.L$0 = null;
                this.label = 4;
            } else if (i != 4) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        SafeTrace.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
