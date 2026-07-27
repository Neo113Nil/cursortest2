package com.onesignal.session.internal.outcomes.impl;

import D4.AbstractC0024y;
import D4.E;
import K4.c;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.influence.Influence;
import com.onesignal.session.internal.influence.InfluenceChannel;
import com.onesignal.session.internal.influence.InfluenceType;
import e5.g;
import f4.v;
import java.util.ArrayList;
import java.util.List;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class OutcomeEventsRepository implements IOutcomeEventsRepository {
    private final IDatabaseProvider _databaseProvider;

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
        i.e(_databaseProvider, "_databaseProvider");
        this._databaseProvider = _databaseProvider;
    }

    private final void addIdToListFromChannel(List<CachedUniqueOutcome> list, JSONArray jSONArray, InfluenceChannel influenceChannel) {
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    String string = jSONArray.getString(i2);
                    i.b(string);
                    list.add(new CachedUniqueOutcome(string, influenceChannel));
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addIdsToListFromSource(List<CachedUniqueOutcome> list, OutcomeSourceBody outcomeSourceBody) {
        if (outcomeSourceBody != null) {
            JSONArray inAppMessagesIds = outcomeSourceBody.getInAppMessagesIds();
            JSONArray notificationIds = outcomeSourceBody.getNotificationIds();
            addIdToListFromChannel(list, inAppMessagesIds, InfluenceChannel.IAM);
            addIdToListFromChannel(list, notificationIds, InfluenceChannel.NOTIFICATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OutcomeSource getIAMInfluenceSource(InfluenceType influenceType, OutcomeSourceBody outcomeSourceBody, OutcomeSourceBody outcomeSourceBody2, String str, OutcomeSource outcomeSource) {
        OutcomeSource directBody;
        OutcomeSource indirectBody;
        int i2 = WhenMappings.$EnumSwitchMapping$0[influenceType.ordinal()];
        if (i2 == 1) {
            outcomeSourceBody.setInAppMessagesIds(new JSONArray(str));
            return (outcomeSource == null || (directBody = outcomeSource.setDirectBody(outcomeSourceBody)) == null) ? new OutcomeSource(outcomeSourceBody, null) : directBody;
        }
        if (i2 != 2) {
            return outcomeSource;
        }
        outcomeSourceBody2.setInAppMessagesIds(new JSONArray(str));
        return (outcomeSource == null || (indirectBody = outcomeSource.setIndirectBody(outcomeSourceBody2)) == null) ? new OutcomeSource(null, outcomeSourceBody2) : indirectBody;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OutcomeSource getNotificationInfluenceSource(InfluenceType influenceType, OutcomeSourceBody outcomeSourceBody, OutcomeSourceBody outcomeSourceBody2, String str) {
        OutcomeSource outcomeSource;
        int i2 = WhenMappings.$EnumSwitchMapping$0[influenceType.ordinal()];
        if (i2 == 1) {
            outcomeSourceBody.setNotificationIds(new JSONArray(str));
            outcomeSource = new OutcomeSource(outcomeSourceBody, null);
        } else {
            if (i2 != 2) {
                return null;
            }
            outcomeSourceBody2.setNotificationIds(new JSONArray(str));
            outcomeSource = new OutcomeSource(null, outcomeSourceBody2);
        }
        return outcomeSource;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsRepository
    public Object cleanCachedUniqueOutcomeEventNotifications(InterfaceC1218d interfaceC1218d) {
        Object w3 = AbstractC0024y.w(E.f461c, new OutcomeEventsRepository$cleanCachedUniqueOutcomeEventNotifications$2(OneSignalDbContract.NotificationTable.TABLE_NAME, "notification_id", this, null), interfaceC1218d);
        return w3 == EnumC1260a.f11058a ? w3 : v.f5689a;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsRepository
    public Object deleteOldOutcomeEvent(OutcomeEventParams outcomeEventParams, InterfaceC1218d interfaceC1218d) {
        Object w3 = AbstractC0024y.w(E.f461c, new OutcomeEventsRepository$deleteOldOutcomeEvent$2(this, outcomeEventParams, null), interfaceC1218d);
        return w3 == EnumC1260a.f11058a ? w3 : v.f5689a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAllEventsToSend(InterfaceC1218d interfaceC1218d) {
        OutcomeEventsRepository$getAllEventsToSend$1 outcomeEventsRepository$getAllEventsToSend$1;
        int i2;
        if (interfaceC1218d instanceof OutcomeEventsRepository$getAllEventsToSend$1) {
            outcomeEventsRepository$getAllEventsToSend$1 = (OutcomeEventsRepository$getAllEventsToSend$1) interfaceC1218d;
            int i3 = outcomeEventsRepository$getAllEventsToSend$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                outcomeEventsRepository$getAllEventsToSend$1.label = i3 - Integer.MIN_VALUE;
                Object obj = outcomeEventsRepository$getAllEventsToSend$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = outcomeEventsRepository$getAllEventsToSend$1.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) outcomeEventsRepository$getAllEventsToSend$1.L$0;
                    g.y(obj);
                    return list;
                }
                g.y(obj);
                ArrayList arrayList = new ArrayList();
                c cVar = E.f461c;
                OutcomeEventsRepository$getAllEventsToSend$2 outcomeEventsRepository$getAllEventsToSend$2 = new OutcomeEventsRepository$getAllEventsToSend$2(this, arrayList, null);
                outcomeEventsRepository$getAllEventsToSend$1.L$0 = arrayList;
                outcomeEventsRepository$getAllEventsToSend$1.label = 1;
                return AbstractC0024y.w(cVar, outcomeEventsRepository$getAllEventsToSend$2, outcomeEventsRepository$getAllEventsToSend$1) == enumC1260a ? enumC1260a : arrayList;
            }
        }
        outcomeEventsRepository$getAllEventsToSend$1 = new OutcomeEventsRepository$getAllEventsToSend$1(this, interfaceC1218d);
        Object obj2 = outcomeEventsRepository$getAllEventsToSend$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = outcomeEventsRepository$getAllEventsToSend$1.label;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getNotCachedUniqueInfluencesForOutcome(String str, List<Influence> list, InterfaceC1218d interfaceC1218d) {
        OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1 outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1;
        int i2;
        if (interfaceC1218d instanceof OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1) {
            outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1 = (OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1) interfaceC1218d;
            int i3 = outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1.label = i3 - Integer.MIN_VALUE;
                Object obj = outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list2 = (List) outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1.L$0;
                    g.y(obj);
                    return list2;
                }
                g.y(obj);
                ArrayList arrayList = new ArrayList();
                c cVar = E.f461c;
                OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$2 outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$2 = new OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$2(list, str, this, arrayList, null);
                outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1.L$0 = arrayList;
                outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1.label = 1;
                return AbstractC0024y.w(cVar, outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$2, outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1) == enumC1260a ? enumC1260a : arrayList;
            }
        }
        outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1 = new OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1(this, interfaceC1218d);
        Object obj2 = outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = outcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1.label;
        if (i2 == 0) {
        }
    }

    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsRepository
    public Object saveOutcomeEvent(OutcomeEventParams outcomeEventParams, InterfaceC1218d interfaceC1218d) {
        Object w3 = AbstractC0024y.w(E.f461c, new OutcomeEventsRepository$saveOutcomeEvent$2(outcomeEventParams, this, null), interfaceC1218d);
        return w3 == EnumC1260a.f11058a ? w3 : v.f5689a;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsRepository
    public Object saveUniqueOutcomeEventParams(OutcomeEventParams outcomeEventParams, InterfaceC1218d interfaceC1218d) {
        Logging.debug$default("OutcomeEventsCache.saveUniqueOutcomeEventParams(eventParams: " + outcomeEventParams + ')', null, 2, null);
        Object w3 = AbstractC0024y.w(E.f461c, new OutcomeEventsRepository$saveUniqueOutcomeEventParams$2(outcomeEventParams, this, null), interfaceC1218d);
        return w3 == EnumC1260a.f11058a ? w3 : v.f5689a;
    }
}
