package com.onesignal.session.internal.outcomes.impl;

import androidx.core.app.NotificationCompat;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.influence.Influence;
import com.onesignal.session.internal.influence.InfluenceChannel;
import com.onesignal.session.internal.influence.InfluenceType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: OutcomeEventsRepository.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J \u0010\u000e\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u000e\u0010\u0011\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018H\u0096@¢\u0006\u0002\u0010\u0012J4\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u001aH\u0002J*\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00182\u0006\u0010$\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u0018H\u0096@¢\u0006\u0002\u0010&J*\u0010'\u001a\u0004\u0018\u00010\u001a2\u0006\u0010(\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010)\u001a\u00020 H\u0002J\u0016\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u0016J\u0016\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/onesignal/session/internal/outcomes/impl/OutcomeEventsRepository;", "Lcom/onesignal/session/internal/outcomes/impl/IOutcomeEventsRepository;", "_databaseProvider", "Lcom/onesignal/core/internal/database/IDatabaseProvider;", "(Lcom/onesignal/core/internal/database/IDatabaseProvider;)V", "addIdToListFromChannel", "", "cachedUniqueOutcomes", "", "Lcom/onesignal/session/internal/outcomes/impl/CachedUniqueOutcome;", "channelIds", "Lorg/json/JSONArray;", "channel", "Lcom/onesignal/session/internal/influence/InfluenceChannel;", "addIdsToListFromSource", "sourceBody", "Lcom/onesignal/session/internal/outcomes/impl/OutcomeSourceBody;", "cleanCachedUniqueOutcomeEventNotifications", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteOldOutcomeEvent", NotificationCompat.CATEGORY_EVENT, "Lcom/onesignal/session/internal/outcomes/impl/OutcomeEventParams;", "(Lcom/onesignal/session/internal/outcomes/impl/OutcomeEventParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllEventsToSend", "", "getIAMInfluenceSource", "Lcom/onesignal/session/internal/outcomes/impl/OutcomeSource;", "iamInfluenceType", "Lcom/onesignal/session/internal/influence/InfluenceType;", "directSourceBody", "indirectSourceBody", "iamIds", "", "source", "getNotCachedUniqueInfluencesForOutcome", "Lcom/onesignal/session/internal/influence/Influence;", "name", "influences", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNotificationInfluenceSource", "notificationInfluenceType", "notificationIds", "saveOutcomeEvent", "eventParams", "saveUniqueOutcomeEventParams", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OutcomeEventsRepository implements IOutcomeEventsRepository {
    private final IDatabaseProvider _databaseProvider;

    /* compiled from: OutcomeEventsRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InfluenceType.values().length];
            try {
                iArr[InfluenceType.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InfluenceType.INDIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OutcomeEventsRepository(IDatabaseProvider _databaseProvider) {
        Intrinsics.checkNotNullParameter(_databaseProvider, "_databaseProvider");
        this._databaseProvider = _databaseProvider;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsRepository
    public Object deleteOldOutcomeEvent(OutcomeEventParams outcomeEventParams, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new OutcomeEventsRepository$deleteOldOutcomeEvent$2(this, outcomeEventParams, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsRepository
    public Object saveOutcomeEvent(OutcomeEventParams outcomeEventParams, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new OutcomeEventsRepository$saveOutcomeEvent$2(outcomeEventParams, this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAllEventsToSend(Continuation<? super List<OutcomeEventParams>> continuation) {
        OutcomeEventsRepository$getAllEventsToSend$1 outcomeEventsRepository$getAllEventsToSend$1;
        int i;
        if (continuation instanceof OutcomeEventsRepository$getAllEventsToSend$1) {
            outcomeEventsRepository$getAllEventsToSend$1 = (OutcomeEventsRepository$getAllEventsToSend$1) continuation;
            if ((outcomeEventsRepository$getAllEventsToSend$1.label & Integer.MIN_VALUE) != 0) {
                outcomeEventsRepository$getAllEventsToSend$1.label -= Integer.MIN_VALUE;
                Object obj = outcomeEventsRepository$getAllEventsToSend$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = outcomeEventsRepository$getAllEventsToSend$1.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) outcomeEventsRepository$getAllEventsToSend$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    return list;
                }
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                CoroutineDispatcher io2 = Dispatchers.getIO();
                OutcomeEventsRepository$getAllEventsToSend$2 outcomeEventsRepository$getAllEventsToSend$2 = new OutcomeEventsRepository$getAllEventsToSend$2(this, arrayList, null);
                outcomeEventsRepository$getAllEventsToSend$1.L$0 = arrayList;
                outcomeEventsRepository$getAllEventsToSend$1.label = 1;
                return BuildersKt.withContext(io2, outcomeEventsRepository$getAllEventsToSend$2, outcomeEventsRepository$getAllEventsToSend$1) == coroutine_suspended ? coroutine_suspended : arrayList;
            }
        }
        outcomeEventsRepository$getAllEventsToSend$1 = new OutcomeEventsRepository$getAllEventsToSend$1(this, continuation);
        Object obj2 = outcomeEventsRepository$getAllEventsToSend$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = outcomeEventsRepository$getAllEventsToSend$1.label;
        if (i == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OutcomeSource getNotificationInfluenceSource(InfluenceType notificationInfluenceType, OutcomeSourceBody directSourceBody, OutcomeSourceBody indirectSourceBody, String notificationIds) {
        int i = WhenMappings.$EnumSwitchMapping$0[notificationInfluenceType.ordinal()];
        if (i == 1) {
            directSourceBody.setNotificationIds(new JSONArray(notificationIds));
            return new OutcomeSource(directSourceBody, null);
        }
        if (i != 2) {
            return null;
        }
        indirectSourceBody.setNotificationIds(new JSONArray(notificationIds));
        return new OutcomeSource(null, indirectSourceBody);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OutcomeSource getIAMInfluenceSource(InfluenceType iamInfluenceType, OutcomeSourceBody directSourceBody, OutcomeSourceBody indirectSourceBody, String iamIds, OutcomeSource source) {
        OutcomeSource directBody;
        OutcomeSource indirectBody;
        int i = WhenMappings.$EnumSwitchMapping$0[iamInfluenceType.ordinal()];
        if (i == 1) {
            directSourceBody.setInAppMessagesIds(new JSONArray(iamIds));
            return (source == null || (directBody = source.setDirectBody(directSourceBody)) == null) ? new OutcomeSource(directSourceBody, null) : directBody;
        }
        if (i != 2) {
            return source;
        }
        indirectSourceBody.setInAppMessagesIds(new JSONArray(iamIds));
        return (source == null || (indirectBody = source.setIndirectBody(indirectSourceBody)) == null) ? new OutcomeSource(null, indirectSourceBody) : indirectBody;
    }

    private final void addIdToListFromChannel(List<CachedUniqueOutcome> cachedUniqueOutcomes, JSONArray channelIds, InfluenceChannel channel) {
        if (channelIds != null) {
            int length = channelIds.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = channelIds.getString(i);
                    Intrinsics.checkNotNull(string);
                    cachedUniqueOutcomes.add(new CachedUniqueOutcome(string, channel));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addIdsToListFromSource(List<CachedUniqueOutcome> cachedUniqueOutcomes, OutcomeSourceBody sourceBody) {
        if (sourceBody != null) {
            JSONArray inAppMessagesIds = sourceBody.getInAppMessagesIds();
            JSONArray notificationIds = sourceBody.getNotificationIds();
            addIdToListFromChannel(cachedUniqueOutcomes, inAppMessagesIds, InfluenceChannel.IAM);
            addIdToListFromChannel(cachedUniqueOutcomes, notificationIds, InfluenceChannel.NOTIFICATION);
        }
    }

    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsRepository
    public Object saveUniqueOutcomeEventParams(OutcomeEventParams outcomeEventParams, Continuation<? super Unit> continuation) {
        Logging.debug$default("OutcomeEventsCache.saveUniqueOutcomeEventParams(eventParams: " + outcomeEventParams + ')', null, 2, null);
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new OutcomeEventsRepository$saveUniqueOutcomeEventParams$2(outcomeEventParams, this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getNotCachedUniqueInfluencesForOutcome(String str, List<Influence> list, Continuation<? super List<Influence>> continuation) {
        OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1 outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1;
        int i;
        if (continuation instanceof OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1) {
            outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1 = (OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1) continuation;
            if ((outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1.label & Integer.MIN_VALUE) != 0) {
                outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1.label -= Integer.MIN_VALUE;
                Object obj = outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list2 = (List) outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    return list2;
                }
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                CoroutineDispatcher io2 = Dispatchers.getIO();
                OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$2 outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$2 = new OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$2(list, str, this, arrayList, null);
                outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1.L$0 = arrayList;
                outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1.label = 1;
                return BuildersKt.withContext(io2, outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$2, outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1) == coroutine_suspended ? coroutine_suspended : arrayList;
            }
        }
        outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1 = new OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1(this, continuation);
        Object obj2 = outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1.label;
        if (i == 0) {
        }
    }

    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsRepository
    public Object cleanCachedUniqueOutcomeEventNotifications(Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new OutcomeEventsRepository$cleanCachedUniqueOutcomeEventNotifications$2(OneSignalDbContract.NotificationTable.TABLE_NAME, "notification_id", this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
