package com.onesignal.session.internal.outcomes.impl;

import H5.AbstractC0165z;
import H5.F;
import H5.InterfaceC0163x;
import N.p;
import android.content.ContentValues;
import h3.C0406b;
import h3.EnumC0407c;
import h3.EnumC0408d;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import k3.C0470a;
import k5.v;
import o5.InterfaceC0564d;
import org.json.JSONArray;
import org.json.JSONException;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class l implements com.onesignal.session.internal.outcomes.impl.d {
    private final W1.d _databaseProvider;

    public static final class a extends q5.g implements InterfaceC0747p {
        final /* synthetic */ String $notificationIdColumnName;
        final /* synthetic */ String $notificationTableName;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, l lVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$notificationTableName = str;
            this.$notificationIdColumnName = str2;
            this.this$0 = lVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return new a(this.$notificationTableName, this.$notificationIdColumnName, this.this$0, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((a) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            StringBuilder sb = new StringBuilder("NOT EXISTS(SELECT NULL FROM ");
            sb.append(this.$notificationTableName);
            sb.append(" n WHERE n.");
            sb.append(this.$notificationIdColumnName);
            sb.append(" = channel_influence_id AND channel_type = \"");
            String enumC0407c = EnumC0407c.NOTIFICATION.toString();
            Locale ROOT = Locale.ROOT;
            kotlin.jvm.internal.i.d(ROOT, "ROOT");
            String lowerCase = enumC0407c.toLowerCase(ROOT);
            kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
            this.this$0._databaseProvider.getOs().delete("cached_unique_outcome", p.b(sb, lowerCase, "\")"), null);
            return v.f5219a;
        }
    }

    public static final class b extends q5.g implements InterfaceC0747p {
        final /* synthetic */ com.onesignal.session.internal.outcomes.impl.f $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.session.internal.outcomes.impl.f fVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$event = fVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return l.this.new b(this.$event, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((b) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            l.this._databaseProvider.getOs().delete("outcome", "timestamp = ?", new String[]{String.valueOf(this.$event.getTimestamp())});
            return v.f5219a;
        }
    }

    public static final class c extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return l.this.getAllEventsToSend(this);
        }
    }

    public static final class d extends q5.g implements InterfaceC0747p {
        final /* synthetic */ List<com.onesignal.session.internal.outcomes.impl.f> $events;
        int label;

        public static final class a extends kotlin.jvm.internal.j implements InterfaceC0743l {
            final /* synthetic */ List<com.onesignal.session.internal.outcomes.impl.f> $events;
            final /* synthetic */ l this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l lVar, List<com.onesignal.session.internal.outcomes.impl.f> list) {
                super(1);
                this.this$0 = lVar;
                this.$events = list;
            }

            @Override // x5.InterfaceC0743l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((W1.a) obj);
                return v.f5219a;
            }

            public final void invoke(W1.a cursor) {
                kotlin.jvm.internal.i.e(cursor, "cursor");
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString("notification_influence_type");
                        EnumC0408d.a aVar = EnumC0408d.Companion;
                        EnumC0408d fromString = aVar.fromString(string);
                        EnumC0408d fromString2 = aVar.fromString(cursor.getString("iam_influence_type"));
                        String optString = cursor.getOptString(i3.e.NOTIFICATIONS_IDS);
                        if (optString == null) {
                            optString = "[]";
                        }
                        String optString2 = cursor.getOptString("iam_ids");
                        String str = optString2 == null ? "[]" : optString2;
                        String string2 = cursor.getString("name");
                        float f7 = cursor.getFloat("weight");
                        long j4 = cursor.getLong("timestamp");
                        long j7 = cursor.getLong("session_time");
                        try {
                            n nVar = new n(null, null, 3, null);
                            n nVar2 = new n(null, null, 3, null);
                            m notificationInfluenceSource = this.this$0.getNotificationInfluenceSource(fromString, nVar, nVar2, optString);
                            this.this$0.getIAMInfluenceSource(fromString2, nVar, nVar2, str, notificationInfluenceSource);
                            if (notificationInfluenceSource == null) {
                                notificationInfluenceSource = new m(null, null);
                            }
                            this.$events.add(new com.onesignal.session.internal.outcomes.impl.f(string2, notificationInfluenceSource, f7, j7, j4));
                        } catch (JSONException e4) {
                            com.onesignal.debug.internal.logging.b.error("Generating JSONArray from notifications ids outcome:JSON Failed.", e4);
                        }
                    } while (cursor.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<com.onesignal.session.internal.outcomes.impl.f> list, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$events = list;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return l.this.new d(this.$events, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((d) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            C0470a.INSTANCE.run(l.this._databaseProvider);
            W1.b.query$default(l.this._databaseProvider.getOs(), "outcome", null, null, null, null, null, null, null, new a(l.this, this.$events), 254, null);
            return v.f5219a;
        }
    }

    public static final class e extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public e(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return l.this.getNotCachedUniqueInfluencesForOutcome(null, null, this);
        }
    }

    public static final class f extends q5.g implements InterfaceC0747p {
        final /* synthetic */ List<C0406b> $influences;
        final /* synthetic */ String $name;
        final /* synthetic */ List<C0406b> $uniqueInfluences;
        int label;
        final /* synthetic */ l this$0;

        public static final class a extends kotlin.jvm.internal.j implements InterfaceC0743l {
            final /* synthetic */ JSONArray $availableInfluenceIds;
            final /* synthetic */ String $channelInfluenceId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(JSONArray jSONArray, String str) {
                super(1);
                this.$availableInfluenceIds = jSONArray;
                this.$channelInfluenceId = str;
            }

            @Override // x5.InterfaceC0743l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((W1.a) obj);
                return v.f5219a;
            }

            public final void invoke(W1.a it) {
                kotlin.jvm.internal.i.e(it, "it");
                if (it.getCount() == 0) {
                    this.$availableInfluenceIds.put(this.$channelInfluenceId);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<C0406b> list, String str, l lVar, List<C0406b> list2, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$influences = list;
            this.$name = str;
            this.this$0 = lVar;
            this.$uniqueInfluences = list2;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return new f(this.$influences, this.$name, this.this$0, this.$uniqueInfluences, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((f) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            try {
                for (C0406b c0406b : this.$influences) {
                    JSONArray jSONArray = new JSONArray();
                    JSONArray ids = c0406b.getIds();
                    if (ids != null) {
                        int length = ids.length();
                        for (int i7 = 0; i7 < length; i7++) {
                            String string = ids.getString(i7);
                            W1.b.query$default(this.this$0._databaseProvider.getOs(), "cached_unique_outcome", new String[0], "channel_influence_id = ? AND channel_type = ? AND name = ?", new String[]{string, c0406b.getInfluenceChannel().toString(), this.$name}, null, null, null, "1", new a(jSONArray, string), 112, null);
                        }
                        if (jSONArray.length() > 0) {
                            C0406b copy = c0406b.copy();
                            copy.setIds(jSONArray);
                            this.$uniqueInfluences.add(copy);
                        }
                    }
                }
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
            return v.f5219a;
        }
    }

    public static final class g extends q5.g implements InterfaceC0747p {
        final /* synthetic */ com.onesignal.session.internal.outcomes.impl.f $eventParams;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.onesignal.session.internal.outcomes.impl.f fVar, l lVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$eventParams = fVar;
            this.this$0 = lVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return new g(this.$eventParams, this.this$0, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((g) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0408d enumC0408d;
            n indirectBody;
            n directBody;
            EnumC0408d enumC0408d2;
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            EnumC0408d enumC0408d3 = EnumC0408d.UNATTRIBUTED;
            m outcomeSource = this.$eventParams.getOutcomeSource();
            if (outcomeSource == null || (directBody = outcomeSource.getDirectBody()) == null) {
                enumC0408d = enumC0408d3;
            } else {
                JSONArray notificationIds = directBody.getNotificationIds();
                if (notificationIds == null || notificationIds.length() <= 0) {
                    enumC0408d2 = enumC0408d3;
                } else {
                    enumC0408d2 = EnumC0408d.DIRECT;
                    jSONArray = notificationIds;
                }
                JSONArray inAppMessagesIds = directBody.getInAppMessagesIds();
                if (inAppMessagesIds != null && inAppMessagesIds.length() > 0) {
                    enumC0408d3 = EnumC0408d.DIRECT;
                    jSONArray2 = inAppMessagesIds;
                }
                enumC0408d = enumC0408d3;
                enumC0408d3 = enumC0408d2;
            }
            m outcomeSource2 = this.$eventParams.getOutcomeSource();
            if (outcomeSource2 != null && (indirectBody = outcomeSource2.getIndirectBody()) != null) {
                JSONArray notificationIds2 = indirectBody.getNotificationIds();
                if (notificationIds2 != null && notificationIds2.length() > 0) {
                    enumC0408d3 = EnumC0408d.INDIRECT;
                    jSONArray = notificationIds2;
                }
                JSONArray inAppMessagesIds2 = indirectBody.getInAppMessagesIds();
                if (inAppMessagesIds2 != null && inAppMessagesIds2.length() > 0) {
                    enumC0408d = EnumC0408d.INDIRECT;
                    jSONArray2 = inAppMessagesIds2;
                }
            }
            ContentValues contentValues = new ContentValues();
            com.onesignal.session.internal.outcomes.impl.f fVar = this.$eventParams;
            contentValues.put(i3.e.NOTIFICATIONS_IDS, jSONArray.toString());
            contentValues.put("iam_ids", jSONArray2.toString());
            String obj2 = enumC0408d3.toString();
            Locale ROOT = Locale.ROOT;
            kotlin.jvm.internal.i.d(ROOT, "ROOT");
            String lowerCase = obj2.toLowerCase(ROOT);
            kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
            contentValues.put("notification_influence_type", lowerCase);
            String obj3 = enumC0408d.toString();
            kotlin.jvm.internal.i.d(ROOT, "ROOT");
            String lowerCase2 = obj3.toLowerCase(ROOT);
            kotlin.jvm.internal.i.d(lowerCase2, "toLowerCase(...)");
            contentValues.put("iam_influence_type", lowerCase2);
            contentValues.put("name", fVar.getOutcomeId());
            contentValues.put("weight", new Float(fVar.getWeight()));
            contentValues.put("timestamp", new Long(fVar.getTimestamp()));
            contentValues.put("session_time", new Long(fVar.getSessionTime()));
            this.this$0._databaseProvider.getOs().insert("outcome", null, contentValues);
            return contentValues;
        }
    }

    public static final class h extends q5.g implements InterfaceC0747p {
        final /* synthetic */ com.onesignal.session.internal.outcomes.impl.f $eventParams;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.onesignal.session.internal.outcomes.impl.f fVar, l lVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$eventParams = fVar;
            this.this$0 = lVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return new h(this.$eventParams, this.this$0, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((h) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            String outcomeId = this.$eventParams.getOutcomeId();
            ArrayList arrayList = new ArrayList();
            m outcomeSource = this.$eventParams.getOutcomeSource();
            n directBody = outcomeSource != null ? outcomeSource.getDirectBody() : null;
            m outcomeSource2 = this.$eventParams.getOutcomeSource();
            n indirectBody = outcomeSource2 != null ? outcomeSource2.getIndirectBody() : null;
            this.this$0.addIdsToListFromSource(arrayList, directBody);
            this.this$0.addIdsToListFromSource(arrayList, indirectBody);
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj2 = arrayList.get(i7);
                i7++;
                com.onesignal.session.internal.outcomes.impl.a aVar = (com.onesignal.session.internal.outcomes.impl.a) obj2;
                ContentValues contentValues = new ContentValues();
                contentValues.put("channel_influence_id", aVar.getInfluenceId());
                contentValues.put("channel_type", aVar.getChannel().toString());
                contentValues.put("name", outcomeId);
                this.this$0._databaseProvider.getOs().insert("cached_unique_outcome", null, contentValues);
            }
            return v.f5219a;
        }
    }

    public l(W1.d _databaseProvider) {
        kotlin.jvm.internal.i.e(_databaseProvider, "_databaseProvider");
        this._databaseProvider = _databaseProvider;
    }

    private final void addIdToListFromChannel(List<com.onesignal.session.internal.outcomes.impl.a> list, JSONArray jSONArray, EnumC0407c enumC0407c) {
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    String string = jSONArray.getString(i7);
                    kotlin.jvm.internal.i.b(string);
                    list.add(new com.onesignal.session.internal.outcomes.impl.a(string, enumC0407c));
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addIdsToListFromSource(List<com.onesignal.session.internal.outcomes.impl.a> list, n nVar) {
        if (nVar != null) {
            JSONArray inAppMessagesIds = nVar.getInAppMessagesIds();
            JSONArray notificationIds = nVar.getNotificationIds();
            addIdToListFromChannel(list, inAppMessagesIds, EnumC0407c.IAM);
            addIdToListFromChannel(list, notificationIds, EnumC0407c.NOTIFICATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m getIAMInfluenceSource(EnumC0408d enumC0408d, n nVar, n nVar2, String str, m mVar) {
        m directBody;
        m indirectBody;
        int i7 = k.$EnumSwitchMapping$0[enumC0408d.ordinal()];
        if (i7 == 1) {
            nVar.setInAppMessagesIds(new JSONArray(str));
            return (mVar == null || (directBody = mVar.setDirectBody(nVar)) == null) ? new m(nVar, null) : directBody;
        }
        if (i7 != 2) {
            return mVar;
        }
        nVar2.setInAppMessagesIds(new JSONArray(str));
        return (mVar == null || (indirectBody = mVar.setIndirectBody(nVar2)) == null) ? new m(null, nVar2) : indirectBody;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m getNotificationInfluenceSource(EnumC0408d enumC0408d, n nVar, n nVar2, String str) {
        int i7 = k.$EnumSwitchMapping$0[enumC0408d.ordinal()];
        if (i7 == 1) {
            nVar.setNotificationIds(new JSONArray(str));
            return new m(nVar, null);
        }
        if (i7 != 2) {
            return null;
        }
        nVar2.setNotificationIds(new JSONArray(str));
        return new m(null, nVar2);
    }

    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object cleanCachedUniqueOutcomeEventNotifications(InterfaceC0564d interfaceC0564d) {
        Object t6 = AbstractC0165z.t(F.f1029c, new a("notification", i3.e.NOTIFICATION_ID_TAG, this, null), interfaceC0564d);
        return t6 == EnumC0580a.f5697f ? t6 : v.f5219a;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object deleteOldOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f fVar, InterfaceC0564d interfaceC0564d) {
        Object t6 = AbstractC0165z.t(F.f1029c, new b(fVar, null), interfaceC0564d);
        return t6 == EnumC0580a.f5697f ? t6 : v.f5219a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.session.internal.outcomes.impl.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAllEventsToSend(InterfaceC0564d interfaceC0564d) {
        c cVar;
        int i7;
        if (interfaceC0564d instanceof c) {
            cVar = (c) interfaceC0564d;
            int i8 = cVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.label = i8 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = cVar.label;
                if (i7 == 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) cVar.L$0;
                    AbstractC0676f.w(obj);
                    return list;
                }
                AbstractC0676f.w(obj);
                ArrayList arrayList = new ArrayList();
                O5.c cVar2 = F.f1029c;
                d dVar = new d(arrayList, null);
                cVar.L$0 = arrayList;
                cVar.label = 1;
                return AbstractC0165z.t(cVar2, dVar, cVar) == enumC0580a ? enumC0580a : arrayList;
            }
        }
        cVar = new c(interfaceC0564d);
        Object obj2 = cVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = cVar.label;
        if (i7 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.session.internal.outcomes.impl.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getNotCachedUniqueInfluencesForOutcome(String str, List<C0406b> list, InterfaceC0564d interfaceC0564d) {
        e eVar;
        int i7;
        if (interfaceC0564d instanceof e) {
            eVar = (e) interfaceC0564d;
            int i8 = eVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.label = i8 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = eVar.label;
                if (i7 == 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list2 = (List) eVar.L$0;
                    AbstractC0676f.w(obj);
                    return list2;
                }
                AbstractC0676f.w(obj);
                ArrayList arrayList = new ArrayList();
                O5.c cVar = F.f1029c;
                f fVar = new f(list, str, this, arrayList, null);
                eVar.L$0 = arrayList;
                eVar.label = 1;
                return AbstractC0165z.t(cVar, fVar, eVar) == enumC0580a ? enumC0580a : arrayList;
            }
        }
        eVar = new e(interfaceC0564d);
        Object obj2 = eVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = eVar.label;
        if (i7 == 0) {
        }
    }

    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object saveOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f fVar, InterfaceC0564d interfaceC0564d) {
        Object t6 = AbstractC0165z.t(F.f1029c, new g(fVar, this, null), interfaceC0564d);
        return t6 == EnumC0580a.f5697f ? t6 : v.f5219a;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object saveUniqueOutcomeEventParams(com.onesignal.session.internal.outcomes.impl.f fVar, InterfaceC0564d interfaceC0564d) {
        com.onesignal.debug.internal.logging.b.debug$default("OutcomeEventsCache.saveUniqueOutcomeEventParams(eventParams: " + fVar + ')', null, 2, null);
        Object t6 = AbstractC0165z.t(F.f1029c, new h(fVar, this, null), interfaceC0564d);
        return t6 == EnumC0580a.f5697f ? t6 : v.f5219a;
    }
}
