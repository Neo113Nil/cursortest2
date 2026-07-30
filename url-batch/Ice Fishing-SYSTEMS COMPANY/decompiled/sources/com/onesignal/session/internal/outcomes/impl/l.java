package com.onesignal.session.internal.outcomes.impl;

import E7.p;
import G5.d;
import O7.AbstractC0399y;
import O7.F;
import O7.InterfaceC0397w;
import android.content.ContentValues;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import q7.v;
import t0.AbstractC5051n;
import v7.InterfaceC5133d;
import w4.AbstractC5171b;
import w4.InterfaceC5170a;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class l implements com.onesignal.session.internal.outcomes.impl.d {
    private final w4.d _databaseProvider;

    public static final class a extends x7.h implements p {
        final /* synthetic */ String $notificationIdColumnName;
        final /* synthetic */ String $notificationTableName;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, l lVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$notificationTableName = str;
            this.$notificationIdColumnName = str2;
            this.this$0 = lVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return new a(this.$notificationTableName, this.$notificationIdColumnName, this.this$0, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((a) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            StringBuilder sb = new StringBuilder("NOT EXISTS(SELECT NULL FROM ");
            sb.append(this.$notificationTableName);
            sb.append(" n WHERE n.");
            sb.append(this.$notificationIdColumnName);
            sb.append(" = channel_influence_id AND channel_type = \"");
            String cVar = G5.c.NOTIFICATION.toString();
            Locale ROOT = Locale.ROOT;
            kotlin.jvm.internal.h.d(ROOT, "ROOT");
            String lowerCase = cVar.toLowerCase(ROOT);
            kotlin.jvm.internal.h.d(lowerCase, "toLowerCase(...)");
            this.this$0._databaseProvider.getOs().delete("cached_unique_outcome", AbstractC5051n.g(sb, lowerCase, "\")"), null);
            return v.f40183a;
        }
    }

    public static final class b extends x7.h implements p {
        final /* synthetic */ com.onesignal.session.internal.outcomes.impl.f $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.session.internal.outcomes.impl.f fVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$event = fVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return l.this.new b(this.$event, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((b) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            l.this._databaseProvider.getOs().delete("outcome", "timestamp = ?", new String[]{String.valueOf(this.$event.getTimestamp())});
            return v.f40183a;
        }
    }

    public static final class c extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return l.this.getAllEventsToSend(this);
        }
    }

    public static final class d extends x7.h implements p {
        final /* synthetic */ List<com.onesignal.session.internal.outcomes.impl.f> $events;
        int label;

        public static final class a extends kotlin.jvm.internal.i implements E7.l {
            final /* synthetic */ List<com.onesignal.session.internal.outcomes.impl.f> $events;
            final /* synthetic */ l this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l lVar, List<com.onesignal.session.internal.outcomes.impl.f> list) {
                super(1);
                this.this$0 = lVar;
                this.$events = list;
            }

            @Override // E7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC5170a) obj);
                return v.f40183a;
            }

            public final void invoke(InterfaceC5170a cursor) {
                kotlin.jvm.internal.h.e(cursor, "cursor");
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString("notification_influence_type");
                        d.a aVar = G5.d.Companion;
                        G5.d fromString = aVar.fromString(string);
                        G5.d fromString2 = aVar.fromString(cursor.getString("iam_influence_type"));
                        String optString = cursor.getOptString(H5.e.NOTIFICATIONS_IDS);
                        if (optString == null) {
                            optString = "[]";
                        }
                        String optString2 = cursor.getOptString("iam_ids");
                        String str = optString2 == null ? "[]" : optString2;
                        String string2 = cursor.getString("name");
                        float f6 = cursor.getFloat("weight");
                        long j9 = cursor.getLong(com.anythink.expressad.foundation.d.d.f18754u);
                        long j10 = cursor.getLong("session_time");
                        try {
                            n nVar = new n(null, null, 3, null);
                            n nVar2 = new n(null, null, 3, null);
                            m notificationInfluenceSource = this.this$0.getNotificationInfluenceSource(fromString, nVar, nVar2, optString);
                            this.this$0.getIAMInfluenceSource(fromString2, nVar, nVar2, str, notificationInfluenceSource);
                            if (notificationInfluenceSource == null) {
                                notificationInfluenceSource = new m(null, null);
                            }
                            this.$events.add(new com.onesignal.session.internal.outcomes.impl.f(string2, notificationInfluenceSource, f6, j10, j9));
                        } catch (JSONException e6) {
                            com.onesignal.debug.internal.logging.b.error("Generating JSONArray from notifications ids outcome:JSON Failed.", e6);
                        }
                    } while (cursor.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<com.onesignal.session.internal.outcomes.impl.f> list, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$events = list;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return l.this.new d(this.$events, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((d) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            J5.a.INSTANCE.run(l.this._databaseProvider);
            AbstractC5171b.query$default(l.this._databaseProvider.getOs(), "outcome", null, null, null, null, null, null, null, new a(l.this, this.$events), 254, null);
            return v.f40183a;
        }
    }

    public static final class e extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public e(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return l.this.getNotCachedUniqueInfluencesForOutcome(null, null, this);
        }
    }

    public static final class f extends x7.h implements p {
        final /* synthetic */ List<G5.b> $influences;
        final /* synthetic */ String $name;
        final /* synthetic */ List<G5.b> $uniqueInfluences;
        int label;
        final /* synthetic */ l this$0;

        public static final class a extends kotlin.jvm.internal.i implements E7.l {
            final /* synthetic */ JSONArray $availableInfluenceIds;
            final /* synthetic */ String $channelInfluenceId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(JSONArray jSONArray, String str) {
                super(1);
                this.$availableInfluenceIds = jSONArray;
                this.$channelInfluenceId = str;
            }

            @Override // E7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC5170a) obj);
                return v.f40183a;
            }

            public final void invoke(InterfaceC5170a it) {
                kotlin.jvm.internal.h.e(it, "it");
                if (it.getCount() == 0) {
                    this.$availableInfluenceIds.put(this.$channelInfluenceId);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<G5.b> list, String str, l lVar, List<G5.b> list2, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$influences = list;
            this.$name = str;
            this.this$0 = lVar;
            this.$uniqueInfluences = list2;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return new f(this.$influences, this.$name, this.this$0, this.$uniqueInfluences, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((f) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            try {
                for (G5.b bVar : this.$influences) {
                    JSONArray jSONArray = new JSONArray();
                    JSONArray ids = bVar.getIds();
                    if (ids != null) {
                        int length = ids.length();
                        for (int i = 0; i < length; i++) {
                            String string = ids.getString(i);
                            AbstractC5171b.query$default(this.this$0._databaseProvider.getOs(), "cached_unique_outcome", new String[0], "channel_influence_id = ? AND channel_type = ? AND name = ?", new String[]{string, bVar.getInfluenceChannel().toString(), this.$name}, null, null, null, "1", new a(jSONArray, string), 112, null);
                        }
                        if (jSONArray.length() > 0) {
                            G5.b copy = bVar.copy();
                            copy.setIds(jSONArray);
                            this.$uniqueInfluences.add(copy);
                        }
                    }
                }
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
            return v.f40183a;
        }
    }

    public static final class g extends x7.h implements p {
        final /* synthetic */ com.onesignal.session.internal.outcomes.impl.f $eventParams;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.onesignal.session.internal.outcomes.impl.f fVar, l lVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$eventParams = fVar;
            this.this$0 = lVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return new g(this.$eventParams, this.this$0, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((g) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            G5.d dVar;
            n indirectBody;
            n directBody;
            G5.d dVar2;
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            G5.d dVar3 = G5.d.UNATTRIBUTED;
            m outcomeSource = this.$eventParams.getOutcomeSource();
            if (outcomeSource == null || (directBody = outcomeSource.getDirectBody()) == null) {
                dVar = dVar3;
            } else {
                JSONArray notificationIds = directBody.getNotificationIds();
                if (notificationIds == null || notificationIds.length() <= 0) {
                    dVar2 = dVar3;
                } else {
                    dVar2 = G5.d.DIRECT;
                    jSONArray = notificationIds;
                }
                JSONArray inAppMessagesIds = directBody.getInAppMessagesIds();
                if (inAppMessagesIds != null && inAppMessagesIds.length() > 0) {
                    dVar3 = G5.d.DIRECT;
                    jSONArray2 = inAppMessagesIds;
                }
                dVar = dVar3;
                dVar3 = dVar2;
            }
            m outcomeSource2 = this.$eventParams.getOutcomeSource();
            if (outcomeSource2 != null && (indirectBody = outcomeSource2.getIndirectBody()) != null) {
                JSONArray notificationIds2 = indirectBody.getNotificationIds();
                if (notificationIds2 != null && notificationIds2.length() > 0) {
                    dVar3 = G5.d.INDIRECT;
                    jSONArray = notificationIds2;
                }
                JSONArray inAppMessagesIds2 = indirectBody.getInAppMessagesIds();
                if (inAppMessagesIds2 != null && inAppMessagesIds2.length() > 0) {
                    dVar = G5.d.INDIRECT;
                    jSONArray2 = inAppMessagesIds2;
                }
            }
            ContentValues contentValues = new ContentValues();
            com.onesignal.session.internal.outcomes.impl.f fVar = this.$eventParams;
            contentValues.put(H5.e.NOTIFICATIONS_IDS, jSONArray.toString());
            contentValues.put("iam_ids", jSONArray2.toString());
            String obj2 = dVar3.toString();
            Locale ROOT = Locale.ROOT;
            kotlin.jvm.internal.h.d(ROOT, "ROOT");
            String lowerCase = obj2.toLowerCase(ROOT);
            kotlin.jvm.internal.h.d(lowerCase, "toLowerCase(...)");
            contentValues.put("notification_influence_type", lowerCase);
            String obj3 = dVar.toString();
            kotlin.jvm.internal.h.d(ROOT, "ROOT");
            String lowerCase2 = obj3.toLowerCase(ROOT);
            kotlin.jvm.internal.h.d(lowerCase2, "toLowerCase(...)");
            contentValues.put("iam_influence_type", lowerCase2);
            contentValues.put("name", fVar.getOutcomeId());
            contentValues.put("weight", new Float(fVar.getWeight()));
            contentValues.put(com.anythink.expressad.foundation.d.d.f18754u, new Long(fVar.getTimestamp()));
            contentValues.put("session_time", new Long(fVar.getSessionTime()));
            this.this$0._databaseProvider.getOs().insert("outcome", null, contentValues);
            return contentValues;
        }
    }

    public static final class h extends x7.h implements p {
        final /* synthetic */ com.onesignal.session.internal.outcomes.impl.f $eventParams;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.onesignal.session.internal.outcomes.impl.f fVar, l lVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$eventParams = fVar;
            this.this$0 = lVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return new h(this.$eventParams, this.this$0, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((h) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            String outcomeId = this.$eventParams.getOutcomeId();
            ArrayList<com.onesignal.session.internal.outcomes.impl.a> arrayList = new ArrayList();
            m outcomeSource = this.$eventParams.getOutcomeSource();
            n directBody = outcomeSource != null ? outcomeSource.getDirectBody() : null;
            m outcomeSource2 = this.$eventParams.getOutcomeSource();
            n indirectBody = outcomeSource2 != null ? outcomeSource2.getIndirectBody() : null;
            this.this$0.addIdsToListFromSource(arrayList, directBody);
            this.this$0.addIdsToListFromSource(arrayList, indirectBody);
            for (com.onesignal.session.internal.outcomes.impl.a aVar : arrayList) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("channel_influence_id", aVar.getInfluenceId());
                contentValues.put("channel_type", aVar.getChannel().toString());
                contentValues.put("name", outcomeId);
                this.this$0._databaseProvider.getOs().insert("cached_unique_outcome", null, contentValues);
            }
            return v.f40183a;
        }
    }

    public l(w4.d _databaseProvider) {
        kotlin.jvm.internal.h.e(_databaseProvider, "_databaseProvider");
        this._databaseProvider = _databaseProvider;
    }

    private final void addIdToListFromChannel(List<com.onesignal.session.internal.outcomes.impl.a> list, JSONArray jSONArray, G5.c cVar) {
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = jSONArray.getString(i);
                    kotlin.jvm.internal.h.b(string);
                    list.add(new com.onesignal.session.internal.outcomes.impl.a(string, cVar));
                } catch (JSONException e6) {
                    e6.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addIdsToListFromSource(List<com.onesignal.session.internal.outcomes.impl.a> list, n nVar) {
        if (nVar != null) {
            JSONArray inAppMessagesIds = nVar.getInAppMessagesIds();
            JSONArray notificationIds = nVar.getNotificationIds();
            addIdToListFromChannel(list, inAppMessagesIds, G5.c.IAM);
            addIdToListFromChannel(list, notificationIds, G5.c.NOTIFICATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m getIAMInfluenceSource(G5.d dVar, n nVar, n nVar2, String str, m mVar) {
        m directBody;
        m indirectBody;
        int i = k.$EnumSwitchMapping$0[dVar.ordinal()];
        if (i == 1) {
            nVar.setInAppMessagesIds(new JSONArray(str));
            return (mVar == null || (directBody = mVar.setDirectBody(nVar)) == null) ? new m(nVar, null) : directBody;
        }
        if (i != 2) {
            return mVar;
        }
        nVar2.setInAppMessagesIds(new JSONArray(str));
        return (mVar == null || (indirectBody = mVar.setIndirectBody(nVar2)) == null) ? new m(null, nVar2) : indirectBody;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m getNotificationInfluenceSource(G5.d dVar, n nVar, n nVar2, String str) {
        int i = k.$EnumSwitchMapping$0[dVar.ordinal()];
        if (i == 1) {
            nVar.setNotificationIds(new JSONArray(str));
            return new m(nVar, null);
        }
        if (i != 2) {
            return null;
        }
        nVar2.setNotificationIds(new JSONArray(str));
        return new m(null, nVar2);
    }

    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object cleanCachedUniqueOutcomeEventNotifications(InterfaceC5133d interfaceC5133d) {
        Object y6 = AbstractC0399y.y(F.f2553c, new a("notification", H5.e.NOTIFICATION_ID_TAG, this, null), interfaceC5133d);
        return y6 == EnumC5179a.f41704n ? y6 : v.f40183a;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object deleteOldOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f fVar, InterfaceC5133d interfaceC5133d) {
        Object y6 = AbstractC0399y.y(F.f2553c, new b(fVar, null), interfaceC5133d);
        return y6 == EnumC5179a.f41704n ? y6 : v.f40183a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.session.internal.outcomes.impl.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAllEventsToSend(InterfaceC5133d interfaceC5133d) {
        c cVar;
        int i;
        if (interfaceC5133d instanceof c) {
            cVar = (c) interfaceC5133d;
            int i4 = cVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cVar.label = i4 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = cVar.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) cVar.L$0;
                    com.bumptech.glide.f.r(obj);
                    return list;
                }
                com.bumptech.glide.f.r(obj);
                ArrayList arrayList = new ArrayList();
                V7.d dVar = F.f2553c;
                d dVar2 = new d(arrayList, null);
                cVar.L$0 = arrayList;
                cVar.label = 1;
                return AbstractC0399y.y(dVar, dVar2, cVar) == enumC5179a ? enumC5179a : arrayList;
            }
        }
        cVar = new c(interfaceC5133d);
        Object obj2 = cVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = cVar.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.session.internal.outcomes.impl.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getNotCachedUniqueInfluencesForOutcome(String str, List<G5.b> list, InterfaceC5133d interfaceC5133d) {
        e eVar;
        int i;
        if (interfaceC5133d instanceof e) {
            eVar = (e) interfaceC5133d;
            int i4 = eVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                eVar.label = i4 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = eVar.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list2 = (List) eVar.L$0;
                    com.bumptech.glide.f.r(obj);
                    return list2;
                }
                com.bumptech.glide.f.r(obj);
                ArrayList arrayList = new ArrayList();
                V7.d dVar = F.f2553c;
                f fVar = new f(list, str, this, arrayList, null);
                eVar.L$0 = arrayList;
                eVar.label = 1;
                return AbstractC0399y.y(dVar, fVar, eVar) == enumC5179a ? enumC5179a : arrayList;
            }
        }
        eVar = new e(interfaceC5133d);
        Object obj2 = eVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = eVar.label;
        if (i == 0) {
        }
    }

    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object saveOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f fVar, InterfaceC5133d interfaceC5133d) {
        Object y6 = AbstractC0399y.y(F.f2553c, new g(fVar, this, null), interfaceC5133d);
        return y6 == EnumC5179a.f41704n ? y6 : v.f40183a;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object saveUniqueOutcomeEventParams(com.onesignal.session.internal.outcomes.impl.f fVar, InterfaceC5133d interfaceC5133d) {
        com.onesignal.debug.internal.logging.b.debug$default("OutcomeEventsCache.saveUniqueOutcomeEventParams(eventParams: " + fVar + ')', null, 2, null);
        Object y6 = AbstractC0399y.y(F.f2553c, new h(fVar, this, null), interfaceC5133d);
        return y6 == EnumC5179a.f41704n ? y6 : v.f40183a;
    }
}
