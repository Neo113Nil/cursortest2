package com.onesignal.session.internal.outcomes.impl;

import android.content.ContentValues;
import ge.a0;
import ge.k0;
import ge.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import oc.d;
import org.json.JSONArray;
import org.json.JSONException;
import wd.b0;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l implements com.onesignal.session.internal.outcomes.impl.d {
    private final ha.d _databaseProvider;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends nd.i implements Function2 {
        final /* synthetic */ String $notificationIdColumnName;
        final /* synthetic */ String $notificationTableName;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, l lVar, ld.a aVar) {
            super(2, aVar);
            this.$notificationTableName = str;
            this.$notificationIdColumnName = str2;
            this.this$0 = lVar;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return new a(this.$notificationTableName, this.$notificationIdColumnName, this.this$0, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((a) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            StringBuilder sb2 = new StringBuilder("NOT EXISTS(SELECT NULL FROM ");
            sb2.append(this.$notificationTableName);
            sb2.append(" n WHERE n.");
            sb2.append(this.$notificationIdColumnName);
            sb2.append(" = channel_influence_id AND channel_type = \"");
            String cVar = oc.c.NOTIFICATION.toString();
            Locale locale = Locale.ROOT;
            locale.getClass();
            String lowerCase = cVar.toLowerCase(locale);
            lowerCase.getClass();
            sb2.append(lowerCase);
            sb2.append("\")");
            this.this$0._databaseProvider.getOs().delete("cached_unique_outcome", sb2.toString(), null);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends nd.i implements Function2 {
        final /* synthetic */ com.onesignal.session.internal.outcomes.impl.f $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.session.internal.outcomes.impl.f fVar, ld.a aVar) {
            super(2, aVar);
            this.$event = fVar;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return l.this.new b(this.$event, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((b) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            l.this._databaseProvider.getOs().delete("outcome", "timestamp = ?", new String[]{String.valueOf(this.$event.getTimestamp())});
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return l.this.getAllEventsToSend(this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class e extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public e(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return l.this.getNotCachedUniqueInfluencesForOutcome(null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class g extends nd.i implements Function2 {
        final /* synthetic */ com.onesignal.session.internal.outcomes.impl.f $eventParams;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.onesignal.session.internal.outcomes.impl.f fVar, l lVar, ld.a aVar) {
            super(2, aVar);
            this.$eventParams = fVar;
            this.this$0 = lVar;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return new g(this.$eventParams, this.this$0, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((g) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            n indirectBody;
            n directBody;
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            b0 b0Var = new b0();
            b0Var.f10141d = new JSONArray();
            b0 b0Var2 = new b0();
            b0Var2.f10141d = new JSONArray();
            b0 b0Var3 = new b0();
            oc.d dVar = oc.d.UNATTRIBUTED;
            b0Var3.f10141d = dVar;
            b0 b0Var4 = new b0();
            b0Var4.f10141d = dVar;
            m outcomeSource = this.$eventParams.getOutcomeSource();
            if (outcomeSource != null && (directBody = outcomeSource.getDirectBody()) != null) {
                JSONArray notificationIds = directBody.getNotificationIds();
                if (notificationIds != null && notificationIds.length() > 0) {
                    b0Var3.f10141d = oc.d.DIRECT;
                    b0Var.f10141d = notificationIds;
                }
                JSONArray inAppMessagesIds = directBody.getInAppMessagesIds();
                if (inAppMessagesIds != null && inAppMessagesIds.length() > 0) {
                    b0Var4.f10141d = oc.d.DIRECT;
                    b0Var2.f10141d = inAppMessagesIds;
                }
            }
            m outcomeSource2 = this.$eventParams.getOutcomeSource();
            if (outcomeSource2 != null && (indirectBody = outcomeSource2.getIndirectBody()) != null) {
                JSONArray notificationIds2 = indirectBody.getNotificationIds();
                if (notificationIds2 != null && notificationIds2.length() > 0) {
                    b0Var3.f10141d = oc.d.INDIRECT;
                    b0Var.f10141d = notificationIds2;
                }
                JSONArray inAppMessagesIds2 = indirectBody.getInAppMessagesIds();
                if (inAppMessagesIds2 != null && inAppMessagesIds2.length() > 0) {
                    b0Var4.f10141d = oc.d.INDIRECT;
                    b0Var2.f10141d = inAppMessagesIds2;
                }
            }
            ContentValues contentValues = new ContentValues();
            com.onesignal.session.internal.outcomes.impl.f fVar = this.$eventParams;
            contentValues.put(pc.e.NOTIFICATIONS_IDS, ((JSONArray) b0Var.f10141d).toString());
            contentValues.put("iam_ids", ((JSONArray) b0Var2.f10141d).toString());
            String obj2 = ((oc.d) b0Var3.f10141d).toString();
            Locale locale = Locale.ROOT;
            locale.getClass();
            String lowerCase = obj2.toLowerCase(locale);
            lowerCase.getClass();
            contentValues.put("notification_influence_type", lowerCase);
            String obj3 = ((oc.d) b0Var4.f10141d).toString();
            locale.getClass();
            String lowerCase2 = obj3.toLowerCase(locale);
            lowerCase2.getClass();
            contentValues.put("iam_influence_type", lowerCase2);
            contentValues.put("name", fVar.getOutcomeId());
            contentValues.put("weight", new Float(fVar.getWeight()));
            contentValues.put("timestamp", new Long(fVar.getTimestamp()));
            contentValues.put("session_time", new Long(fVar.getSessionTime()));
            this.this$0._databaseProvider.getOs().insert("outcome", null, contentValues);
            return contentValues;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class h extends nd.i implements Function2 {
        final /* synthetic */ com.onesignal.session.internal.outcomes.impl.f $eventParams;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.onesignal.session.internal.outcomes.impl.f fVar, l lVar, ld.a aVar) {
            super(2, aVar);
            this.$eventParams = fVar;
            this.this$0 = lVar;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return new h(this.$eventParams, this.this$0, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((h) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            String outcomeId = this.$eventParams.getOutcomeId();
            ArrayList arrayList = new ArrayList();
            m outcomeSource = this.$eventParams.getOutcomeSource();
            n directBody = outcomeSource != null ? outcomeSource.getDirectBody() : null;
            m outcomeSource2 = this.$eventParams.getOutcomeSource();
            n indirectBody = outcomeSource2 != null ? outcomeSource2.getIndirectBody() : null;
            this.this$0.addIdsToListFromSource(arrayList, directBody);
            this.this$0.addIdsToListFromSource(arrayList, indirectBody);
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj2 = arrayList.get(i3);
                i3++;
                com.onesignal.session.internal.outcomes.impl.a aVar2 = (com.onesignal.session.internal.outcomes.impl.a) obj2;
                ContentValues contentValues = new ContentValues();
                contentValues.put("channel_influence_id", aVar2.getInfluenceId());
                contentValues.put("channel_type", aVar2.getChannel().toString());
                contentValues.put("name", outcomeId);
                this.this$0._databaseProvider.getOs().insert("cached_unique_outcome", null, contentValues);
            }
            return Unit.f5554a;
        }
    }

    public l(ha.d dVar) {
        dVar.getClass();
        this._databaseProvider = dVar;
    }

    private final void addIdToListFromChannel(List<com.onesignal.session.internal.outcomes.impl.a> list, JSONArray jSONArray, oc.c cVar) {
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    String string = jSONArray.getString(i3);
                    string.getClass();
                    list.add(new com.onesignal.session.internal.outcomes.impl.a(string, cVar));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addIdsToListFromSource(List<com.onesignal.session.internal.outcomes.impl.a> list, n nVar) {
        if (nVar != null) {
            JSONArray inAppMessagesIds = nVar.getInAppMessagesIds();
            JSONArray notificationIds = nVar.getNotificationIds();
            addIdToListFromChannel(list, inAppMessagesIds, oc.c.IAM);
            addIdToListFromChannel(list, notificationIds, oc.c.NOTIFICATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m getIAMInfluenceSource(oc.d dVar, n nVar, n nVar2, String str, m mVar) {
        m directBody;
        m indirectBody;
        int i3 = k.$EnumSwitchMapping$0[dVar.ordinal()];
        if (i3 == 1) {
            nVar.setInAppMessagesIds(new JSONArray(str));
            return (mVar == null || (directBody = mVar.setDirectBody(nVar)) == null) ? new m(nVar, null) : directBody;
        }
        if (i3 != 2) {
            return mVar;
        }
        nVar2.setInAppMessagesIds(new JSONArray(str));
        return (mVar == null || (indirectBody = mVar.setIndirectBody(nVar2)) == null) ? new m(null, nVar2) : indirectBody;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m getNotificationInfluenceSource(oc.d dVar, n nVar, n nVar2, String str) {
        int i3 = k.$EnumSwitchMapping$0[dVar.ordinal()];
        if (i3 == 1) {
            nVar.setNotificationIds(new JSONArray(str));
            return new m(nVar, null);
        }
        if (i3 != 2) {
            return null;
        }
        nVar2.setNotificationIds(new JSONArray(str));
        return new m(null, nVar2);
    }

    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object cleanCachedUniqueOutcomeEventNotifications(ld.a aVar) {
        ne.e eVar = k0.f4372a;
        Object B = a0.B(ne.d.f7275i, new a("notification", pc.e.NOTIFICATION_ID_TAG, this, null), aVar);
        return B == md.a.f6622d ? B : Unit.f5554a;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object deleteOldOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f fVar, ld.a aVar) {
        ne.e eVar = k0.f4372a;
        Object B = a0.B(ne.d.f7275i, new b(fVar, null), aVar);
        return B == md.a.f6622d ? B : Unit.f5554a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.onesignal.session.internal.outcomes.impl.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAllEventsToSend(ld.a aVar) {
        c cVar;
        int i3;
        if (aVar instanceof c) {
            cVar = (c) aVar;
            int i10 = cVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.label = i10 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = cVar.label;
                if (i3 == 0) {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list = (List) cVar.L$0;
                    cf.c.M(obj);
                    return list;
                }
                cf.c.M(obj);
                ArrayList arrayList = new ArrayList();
                ne.e eVar = k0.f4372a;
                ne.d dVar = ne.d.f7275i;
                d dVar2 = new d(arrayList, null);
                cVar.L$0 = arrayList;
                cVar.label = 1;
                return a0.B(dVar, dVar2, cVar) == aVar2 ? aVar2 : arrayList;
            }
        }
        cVar = new c(aVar);
        Object obj2 = cVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = cVar.label;
        if (i3 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.session.internal.outcomes.impl.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getNotCachedUniqueInfluencesForOutcome(String str, List<oc.b> list, ld.a aVar) {
        e eVar;
        int i3;
        if (aVar instanceof e) {
            eVar = (e) aVar;
            int i10 = eVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.label = i10 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = eVar.label;
                if (i3 == 0) {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list2 = (List) eVar.L$0;
                    cf.c.M(obj);
                    return list2;
                }
                cf.c.M(obj);
                ArrayList arrayList = new ArrayList();
                ne.e eVar2 = k0.f4372a;
                ne.d dVar = ne.d.f7275i;
                f fVar = new f(list, str, this, arrayList, null);
                eVar.L$0 = arrayList;
                eVar.label = 1;
                return a0.B(dVar, fVar, eVar) == aVar2 ? aVar2 : arrayList;
            }
        }
        eVar = new e(aVar);
        Object obj2 = eVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = eVar.label;
        if (i3 == 0) {
        }
    }

    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object saveOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f fVar, ld.a aVar) {
        ne.e eVar = k0.f4372a;
        Object B = a0.B(ne.d.f7275i, new g(fVar, this, null), aVar);
        return B == md.a.f6622d ? B : Unit.f5554a;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object saveUniqueOutcomeEventParams(com.onesignal.session.internal.outcomes.impl.f fVar, ld.a aVar) {
        com.onesignal.debug.internal.logging.b.debug$default("OutcomeEventsCache.saveUniqueOutcomeEventParams(eventParams: " + fVar + ')', null, 2, null);
        ne.e eVar = k0.f4372a;
        Object B = a0.B(ne.d.f7275i, new h(fVar, this, null), aVar);
        return B == md.a.f6622d ? B : Unit.f5554a;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class f extends nd.i implements Function2 {
        final /* synthetic */ List<oc.b> $influences;
        final /* synthetic */ String $name;
        final /* synthetic */ List<oc.b> $uniqueInfluences;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<oc.b> list, String str, l lVar, List<oc.b> list2, ld.a aVar) {
            super(2, aVar);
            this.$influences = list;
            this.$name = str;
            this.this$0 = lVar;
            this.$uniqueInfluences = list2;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return new f(this.$influences, this.$name, this.this$0, this.$uniqueInfluences, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((f) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            try {
                for (oc.b bVar : this.$influences) {
                    JSONArray jSONArray = new JSONArray();
                    JSONArray ids = bVar.getIds();
                    if (ids != null) {
                        int length = ids.length();
                        for (int i3 = 0; i3 < length; i3++) {
                            String string = ids.getString(i3);
                            ha.b.query$default(this.this$0._databaseProvider.getOs(), "cached_unique_outcome", new String[0], "channel_influence_id = ? AND channel_type = ? AND name = ?", new String[]{string, bVar.getInfluenceChannel().toString(), this.$name}, null, null, null, "1", new a(jSONArray, string), 112, null);
                        }
                        if (jSONArray.length() > 0) {
                            oc.b copy = bVar.copy();
                            copy.setIds(jSONArray);
                            this.$uniqueInfluences.add(copy);
                        }
                    }
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return Unit.f5554a;
        }

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        public static final class a extends p implements Function1 {
            final /* synthetic */ JSONArray $availableInfluenceIds;
            final /* synthetic */ String $channelInfluenceId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(JSONArray jSONArray, String str) {
                super(1);
                this.$availableInfluenceIds = jSONArray;
                this.$channelInfluenceId = str;
            }

            public final void invoke(ha.a aVar) {
                aVar.getClass();
                if (aVar.getCount() == 0) {
                    this.$availableInfluenceIds.put(this.$channelInfluenceId);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ha.a) obj);
                return Unit.f5554a;
            }
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends nd.i implements Function2 {
        final /* synthetic */ List<com.onesignal.session.internal.outcomes.impl.f> $events;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<com.onesignal.session.internal.outcomes.impl.f> list, ld.a aVar) {
            super(2, aVar);
            this.$events = list;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return l.this.new d(this.$events, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((d) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            rc.a.INSTANCE.run(l.this._databaseProvider);
            ha.b.query$default(l.this._databaseProvider.getOs(), "outcome", null, null, null, null, null, null, null, new a(l.this, this.$events), 254, null);
            return Unit.f5554a;
        }

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        public static final class a extends p implements Function1 {
            final /* synthetic */ List<com.onesignal.session.internal.outcomes.impl.f> $events;
            final /* synthetic */ l this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l lVar, List<com.onesignal.session.internal.outcomes.impl.f> list) {
                super(1);
                this.this$0 = lVar;
                this.$events = list;
            }

            public final void invoke(ha.a aVar) {
                aVar.getClass();
                if (aVar.moveToFirst()) {
                    do {
                        String string = aVar.getString("notification_influence_type");
                        d.a aVar2 = oc.d.Companion;
                        oc.d fromString = aVar2.fromString(string);
                        oc.d fromString2 = aVar2.fromString(aVar.getString("iam_influence_type"));
                        String optString = aVar.getOptString(pc.e.NOTIFICATIONS_IDS);
                        if (optString == null) {
                            optString = "[]";
                        }
                        String optString2 = aVar.getOptString("iam_ids");
                        String str = optString2 == null ? "[]" : optString2;
                        String string2 = aVar.getString("name");
                        float f3 = aVar.getFloat("weight");
                        long j = aVar.getLong("timestamp");
                        long j3 = aVar.getLong("session_time");
                        try {
                            n nVar = new n(null, null, 3, null);
                            n nVar2 = new n(null, null, 3, null);
                            m notificationInfluenceSource = this.this$0.getNotificationInfluenceSource(fromString, nVar, nVar2, optString);
                            this.this$0.getIAMInfluenceSource(fromString2, nVar, nVar2, str, notificationInfluenceSource);
                            if (notificationInfluenceSource == null) {
                                notificationInfluenceSource = new m(null, null);
                            }
                            this.$events.add(new com.onesignal.session.internal.outcomes.impl.f(string2, notificationInfluenceSource, f3, j3, j));
                        } catch (JSONException e2) {
                            com.onesignal.debug.internal.logging.b.error("Generating JSONArray from notifications ids outcome:JSON Failed.", e2);
                        }
                    } while (aVar.moveToNext());
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ha.a) obj);
                return Unit.f5554a;
            }
        }
    }
}
