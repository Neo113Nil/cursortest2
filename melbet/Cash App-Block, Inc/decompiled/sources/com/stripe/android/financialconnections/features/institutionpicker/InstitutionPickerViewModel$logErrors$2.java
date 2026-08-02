package com.stripe.android.financialconnections.features.institutionpicker;

import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerState;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class InstitutionPickerViewModel$logErrors$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ InstitutionPickerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstitutionPickerViewModel$logErrors$2(InstitutionPickerViewModel institutionPickerViewModel, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = institutionPickerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        InstitutionPickerViewModel institutionPickerViewModel = this.this$0;
        switch (i) {
            case 0:
                InstitutionPickerViewModel$logErrors$2 institutionPickerViewModel$logErrors$2 = new InstitutionPickerViewModel$logErrors$2(institutionPickerViewModel, continuation, 0);
                institutionPickerViewModel$logErrors$2.L$0 = obj;
                return institutionPickerViewModel$logErrors$2;
            case 1:
                InstitutionPickerViewModel$logErrors$2 institutionPickerViewModel$logErrors$22 = new InstitutionPickerViewModel$logErrors$2(institutionPickerViewModel, continuation, 1);
                institutionPickerViewModel$logErrors$22.L$0 = obj;
                return institutionPickerViewModel$logErrors$22;
            case 2:
                InstitutionPickerViewModel$logErrors$2 institutionPickerViewModel$logErrors$23 = new InstitutionPickerViewModel$logErrors$2(institutionPickerViewModel, continuation, 2);
                institutionPickerViewModel$logErrors$23.L$0 = obj;
                return institutionPickerViewModel$logErrors$23;
            default:
                InstitutionPickerViewModel$logErrors$2 institutionPickerViewModel$logErrors$24 = new InstitutionPickerViewModel$logErrors$2(institutionPickerViewModel, continuation, 3);
                institutionPickerViewModel$logErrors$24.L$0 = obj;
                return institutionPickerViewModel$logErrors$24;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((InstitutionPickerViewModel$logErrors$2) create((Throwable) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        int i2 = 0;
        InstitutionPickerViewModel institutionPickerViewModel = this.this$0;
        Object obj2 = this.L$0;
        switch (i) {
            case 0:
                InstitutionPickerState.Payload payload = (InstitutionPickerState.Payload) obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = institutionPickerViewModel.eventTracker;
                FinancialConnectionsSessionManifest.Pane pane = InstitutionPickerViewModel.PANE;
                financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(pane, 25));
                long j = payload.featuredInstitutionsDuration;
                List list = payload.featuredInstitutions.data;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((FinancialConnectionsInstitution) it.next()).id);
                }
                Set set = CollectionsKt.toSet(arrayList);
                set.getClass();
                Set set2 = set;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
                for (Object obj3 : set2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    arrayList2.add(new Pair(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "institutions[", "]"), (String) obj3));
                    i2 = i3;
                }
                Map map = MapsKt__MapsKt.toMap(arrayList2);
                FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
                financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.plus(map, MapsKt__MapsKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)), new Pair("result_count", String.valueOf(set.size())), new Pair("duration", String.valueOf(j))))), "search.feature_institutions_loaded", true));
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                institutionPickerViewModel.handleError.invoke("Error fetching initial payload", (Throwable) obj2, InstitutionPickerViewModel.PANE, true);
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                institutionPickerViewModel.handleError.invoke("Error searching institutions", (Throwable) obj2, InstitutionPickerViewModel.PANE, false);
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                institutionPickerViewModel.handleError.invoke("Error selecting or creating session for institution", (Throwable) obj2, InstitutionPickerViewModel.PANE, true);
                return Unit.INSTANCE;
        }
    }
}
