package com.squareup.cash.support.incidents.backend.real;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.support.incidents.backend.api.Incident;
import com.squareup.protos.cash.incidentalerts.app.v1.GetIncidentRequest;
import com.squareup.protos.cash.incidentalerts.app.v1.GetIncidentResponse;
import com.squareup.protos.cash.incidentalerts.app.v1.GetIncidentsListRequest;
import com.squareup.protos.cash.incidentalerts.app.v1.GetIncidentsListResponse;
import com.squareup.protos.cash.incidentalerts.app.v1.Incident;
import com.squareup.protos.cash.incidentalerts.app.v1.IncidentAlertsService;
import com.squareup.protos.cash.incidentalerts.app.v1.SubscribeToIncidentRequest;
import com.squareup.protos.cash.incidentalerts.app.v1.SubscribeToIncidentResponse;
import com.squareup.protos.cash.incidentalerts.app.v1.SubscribeToIncidentResponse$Result$Success;
import com.squareup.protos.cash.incidentalerts.app.v1.UnsubscribeFromIncidentRequest;
import com.squareup.protos.cash.incidentalerts.app.v1.UnsubscribeFromIncidentResponse;
import com.squareup.protos.cash.incidentalerts.app.v1.UnsubscribeFromIncidentResponse$Result$Success;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealIncidentsService {
    public final IncidentAlertsService incidentAlertsService;
    public final StateFlowImpl store = FlowKt.MutableStateFlow(EmptyList.INSTANCE);

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Incident.Status.values().length];
            try {
                RetailerType.Companion companion = Incident.Status.Companion;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RetailerType.Companion companion2 = Incident.Status.Companion;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RetailerType.Companion companion3 = Incident.Status.Companion;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealIncidentsService(IncidentAlertsService incidentAlertsService) {
        this.incidentAlertsService = incidentAlertsService;
    }

    public static com.squareup.cash.support.incidents.backend.api.Incident toIncident(Incident incident) {
        String str = incident.id;
        str.getClass();
        String str2 = incident.title;
        str2.getClass();
        String str3 = incident.details;
        str3.getClass();
        Incident.Status status = incident.status;
        Long l = status == Incident.Status.RESOLVED ? incident.resolved_at : incident.reported_at;
        l.getClass();
        Instant ofEpochMilli = Instant.ofEpochMilli(l.longValue());
        ofEpochMilli.getClass();
        Boolean bool = incident.customer_subscribed;
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        int i = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        Incident.Status status2 = i != 1 ? i != 2 ? i != 3 ? Incident.Status.UNKNOWN : Incident.Status.RESOLVED : Incident.Status.IDENTIFIED : Incident.Status.INVESTIGATING;
        Boolean bool2 = incident.customer_can_change_subscription;
        bool2.getClass();
        return new com.squareup.cash.support.incidents.backend.api.Incident(str, str2, str3, ofEpochMilli, booleanValue, status2, bool2.booleanValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x004d, code lost:
    
        if (r9 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getIncident(final String str, ContinuationImpl continuationImpl) {
        RealIncidentsService$getIncident$1 realIncidentsService$getIncident$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealIncidentsService$getIncident$1) {
            realIncidentsService$getIncident$1 = (RealIncidentsService$getIncident$1) continuationImpl;
            int i2 = realIncidentsService$getIncident$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realIncidentsService$getIncident$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realIncidentsService$getIncident$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realIncidentsService$getIncident$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetIncidentRequest getIncidentRequest = new GetIncidentRequest(str, ByteString.EMPTY);
                    realIncidentsService$getIncident$1.L$0 = str;
                    realIncidentsService$getIncident$1.label = 1;
                    obj = this.incidentAlertsService.getIncident(getIncidentRequest, realIncidentsService$getIncident$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        com.squareup.cash.support.incidents.backend.api.Incident incident = realIncidentsService$getIncident$1.L$2;
                        SafeTrace.throwOnFailure(obj);
                        return incident;
                    }
                    str = realIncidentsService$getIncident$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    com.squareup.protos.cash.incidentalerts.app.v1.Incident incident2 = ((GetIncidentResponse) ((ApiResult.Success) apiResult).response).incident;
                    if (incident2 != null) {
                        final com.squareup.cash.support.incidents.backend.api.Incident incident3 = toIncident(incident2);
                        StateFlowImpl stateFlowImpl = this.store;
                        ArrayList mutableList = CollectionsKt.toMutableList((Collection) stateFlowImpl.getValue());
                        if (!mutableList.isEmpty()) {
                            Iterator it = mutableList.iterator();
                            while (it.hasNext()) {
                                if (Intrinsics.areEqual(((com.squareup.cash.support.incidents.backend.api.Incident) it.next()).id, str)) {
                                    mutableList.replaceAll(new UnaryOperator() { // from class: com.squareup.cash.support.incidents.backend.real.RealIncidentsService$$ExternalSyntheticLambda0
                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            com.squareup.cash.support.incidents.backend.api.Incident incident4 = (com.squareup.cash.support.incidents.backend.api.Incident) obj2;
                                            incident4.getClass();
                                            return Intrinsics.areEqual(str, incident4.id) ? incident3 : incident4;
                                        }
                                    });
                                    break;
                                }
                            }
                        }
                        mutableList.add(incident3);
                        realIncidentsService$getIncident$1.L$0 = null;
                        realIncidentsService$getIncident$1.L$2 = incident3;
                        realIncidentsService$getIncident$1.label = 2;
                        stateFlowImpl.getClass();
                        stateFlowImpl.updateState(null, mutableList);
                        return Unit.INSTANCE == coroutineSingletons ? coroutineSingletons : incident3;
                    }
                }
                return null;
            }
        }
        realIncidentsService$getIncident$1 = new RealIncidentsService$getIncident$1(this, continuationImpl);
        Object obj2 = realIncidentsService$getIncident$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realIncidentsService$getIncident$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0049, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getOpenIncidents(ContinuationImpl continuationImpl) {
        RealIncidentsService$getOpenIncidents$1 realIncidentsService$getOpenIncidents$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealIncidentsService$getOpenIncidents$1) {
            realIncidentsService$getOpenIncidents$1 = (RealIncidentsService$getOpenIncidents$1) continuationImpl;
            int i2 = realIncidentsService$getOpenIncidents$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realIncidentsService$getOpenIncidents$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realIncidentsService$getOpenIncidents$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realIncidentsService$getOpenIncidents$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetIncidentsListRequest getIncidentsListRequest = new GetIncidentsListRequest(ByteString.EMPTY);
                    realIncidentsService$getOpenIncidents$1.label = 1;
                    obj = this.incidentAlertsService.getIncidentsList(getIncidentsListRequest, realIncidentsService$getOpenIncidents$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ArrayList arrayList = realIncidentsService$getOpenIncidents$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                        return arrayList;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if (apiResult instanceof ApiResult.Failure) {
                        return EmptyList.INSTANCE;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                List list = ((GetIncidentsListResponse) ((ApiResult.Success) apiResult).response).incidents;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(toIncident((com.squareup.protos.cash.incidentalerts.app.v1.Incident) it.next()));
                }
                realIncidentsService$getOpenIncidents$1.L$1 = arrayList2;
                realIncidentsService$getOpenIncidents$1.label = 2;
                StateFlowImpl stateFlowImpl = this.store;
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, arrayList2);
                return Unit.INSTANCE == coroutineSingletons ? coroutineSingletons : arrayList2;
            }
        }
        realIncidentsService$getOpenIncidents$1 = new RealIncidentsService$getOpenIncidents$1(this, continuationImpl);
        Object obj2 = realIncidentsService$getOpenIncidents$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realIncidentsService$getOpenIncidents$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
    
        if (kotlin.Unit.INSTANCE == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004c, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object subscribeToIncident(String str, ContinuationImpl continuationImpl) {
        RealIncidentsService$subscribeToIncident$1 realIncidentsService$subscribeToIncident$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealIncidentsService$subscribeToIncident$1) {
            realIncidentsService$subscribeToIncident$1 = (RealIncidentsService$subscribeToIncident$1) continuationImpl;
            int i2 = realIncidentsService$subscribeToIncident$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realIncidentsService$subscribeToIncident$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realIncidentsService$subscribeToIncident$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realIncidentsService$subscribeToIncident$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SubscribeToIncidentRequest subscribeToIncidentRequest = new SubscribeToIncidentRequest(str, ByteString.EMPTY);
                    realIncidentsService$subscribeToIncident$1.L$0 = str;
                    realIncidentsService$subscribeToIncident$1.label = 1;
                    obj = this.incidentAlertsService.subscribeToIncident(subscribeToIncidentRequest, realIncidentsService$subscribeToIncident$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Boolean.TRUE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = realIncidentsService$subscribeToIncident$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if ((apiResult instanceof ApiResult.Success) || !(((SubscribeToIncidentResponse) ((ApiResult.Success) apiResult).response).result instanceof SubscribeToIncidentResponse$Result$Success)) {
                    return Boolean.FALSE;
                }
                StateFlowImpl stateFlowImpl = this.store;
                List<com.squareup.cash.support.incidents.backend.api.Incident> list = (List) stateFlowImpl.getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (com.squareup.cash.support.incidents.backend.api.Incident incident : list) {
                    if (Intrinsics.areEqual(incident.id, str)) {
                        incident = com.squareup.cash.support.incidents.backend.api.Incident.copy$default(incident, true);
                    }
                    arrayList.add(incident);
                }
                realIncidentsService$subscribeToIncident$1.L$0 = null;
                realIncidentsService$subscribeToIncident$1.label = 2;
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, arrayList);
            }
        }
        realIncidentsService$subscribeToIncident$1 = new RealIncidentsService$subscribeToIncident$1(this, continuationImpl);
        Object obj2 = realIncidentsService$subscribeToIncident$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realIncidentsService$subscribeToIncident$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        if (kotlin.Unit.INSTANCE == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004c, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object unsubscribeFromIncident(String str, ContinuationImpl continuationImpl) {
        RealIncidentsService$unsubscribeFromIncident$1 realIncidentsService$unsubscribeFromIncident$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealIncidentsService$unsubscribeFromIncident$1) {
            realIncidentsService$unsubscribeFromIncident$1 = (RealIncidentsService$unsubscribeFromIncident$1) continuationImpl;
            int i2 = realIncidentsService$unsubscribeFromIncident$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realIncidentsService$unsubscribeFromIncident$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realIncidentsService$unsubscribeFromIncident$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realIncidentsService$unsubscribeFromIncident$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    UnsubscribeFromIncidentRequest unsubscribeFromIncidentRequest = new UnsubscribeFromIncidentRequest(str, ByteString.EMPTY);
                    realIncidentsService$unsubscribeFromIncident$1.L$0 = str;
                    realIncidentsService$unsubscribeFromIncident$1.label = 1;
                    obj = this.incidentAlertsService.unsubscribeFromIncident(unsubscribeFromIncidentRequest, realIncidentsService$unsubscribeFromIncident$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Boolean.TRUE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = realIncidentsService$unsubscribeFromIncident$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if ((apiResult instanceof ApiResult.Success) || !(((UnsubscribeFromIncidentResponse) ((ApiResult.Success) apiResult).response).result instanceof UnsubscribeFromIncidentResponse$Result$Success)) {
                    return Boolean.FALSE;
                }
                StateFlowImpl stateFlowImpl = this.store;
                List<com.squareup.cash.support.incidents.backend.api.Incident> list = (List) stateFlowImpl.getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (com.squareup.cash.support.incidents.backend.api.Incident incident : list) {
                    if (Intrinsics.areEqual(incident.id, str)) {
                        incident = com.squareup.cash.support.incidents.backend.api.Incident.copy$default(incident, false);
                    }
                    arrayList.add(incident);
                }
                realIncidentsService$unsubscribeFromIncident$1.L$0 = null;
                realIncidentsService$unsubscribeFromIncident$1.label = 2;
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, arrayList);
            }
        }
        realIncidentsService$unsubscribeFromIncident$1 = new RealIncidentsService$unsubscribeFromIncident$1(this, continuationImpl);
        Object obj2 = realIncidentsService$unsubscribeFromIncident$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realIncidentsService$unsubscribeFromIncident$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
        return Boolean.FALSE;
    }
}
