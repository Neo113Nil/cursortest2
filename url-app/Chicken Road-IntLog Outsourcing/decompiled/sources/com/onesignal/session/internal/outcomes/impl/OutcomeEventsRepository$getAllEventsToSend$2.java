package com.onesignal.session.internal.outcomes.impl;

import D4.InterfaceC0022w;
import com.onesignal.core.internal.database.ICursor;
import com.onesignal.core.internal.database.IDatabase;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.influence.InfluenceType;
import com.onesignal.session.internal.outcomes.migrations.RemoveInvalidSessionTimeRecords;
import e5.g;
import f4.v;
import java.util.List;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import org.json.JSONException;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$getAllEventsToSend$2", f = "OutcomeEventsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OutcomeEventsRepository$getAllEventsToSend$2 extends h implements InterfaceC1445p {
    final /* synthetic */ List<OutcomeEventParams> $events;
    int label;
    final /* synthetic */ OutcomeEventsRepository this$0;

    /* renamed from: com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$getAllEventsToSend$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements InterfaceC1441l {
        final /* synthetic */ List<OutcomeEventParams> $events;
        final /* synthetic */ OutcomeEventsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OutcomeEventsRepository outcomeEventsRepository, List<OutcomeEventParams> list) {
            super(1);
            this.this$0 = outcomeEventsRepository;
            this.$events = list;
        }

        @Override // t4.InterfaceC1441l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ICursor) obj);
            return v.f5689a;
        }

        public final void invoke(ICursor cursor) {
            OutcomeSource notificationInfluenceSource;
            i.e(cursor, "cursor");
            if (cursor.moveToFirst()) {
                do {
                    String string = cursor.getString(OutcomeEventsTable.COLUMN_NAME_NOTIFICATION_INFLUENCE_TYPE);
                    InfluenceType.Companion companion = InfluenceType.Companion;
                    InfluenceType fromString = companion.fromString(string);
                    InfluenceType fromString2 = companion.fromString(cursor.getString(OutcomeEventsTable.COLUMN_NAME_IAM_INFLUENCE_TYPE));
                    String optString = cursor.getOptString("notification_ids");
                    if (optString == null) {
                        optString = "[]";
                    }
                    String optString2 = cursor.getOptString(OutcomeEventsTable.COLUMN_NAME_IAM_IDS);
                    String str = optString2 == null ? "[]" : optString2;
                    String string2 = cursor.getString("name");
                    float f3 = cursor.getFloat("weight");
                    long j2 = cursor.getLong("timestamp");
                    long j6 = cursor.getLong("session_time");
                    try {
                        OutcomeSourceBody outcomeSourceBody = new OutcomeSourceBody(null, null, 3, null);
                        OutcomeSourceBody outcomeSourceBody2 = new OutcomeSourceBody(null, null, 3, null);
                        notificationInfluenceSource = this.this$0.getNotificationInfluenceSource(fromString, outcomeSourceBody, outcomeSourceBody2, optString);
                        this.this$0.getIAMInfluenceSource(fromString2, outcomeSourceBody, outcomeSourceBody2, str, notificationInfluenceSource);
                        if (notificationInfluenceSource == null) {
                            notificationInfluenceSource = new OutcomeSource(null, null);
                        }
                        this.$events.add(new OutcomeEventParams(string2, notificationInfluenceSource, f3, j6, j2));
                    } catch (JSONException e3) {
                        Logging.error("Generating JSONArray from notifications ids outcome:JSON Failed.", e3);
                    }
                } while (cursor.moveToNext());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutcomeEventsRepository$getAllEventsToSend$2(OutcomeEventsRepository outcomeEventsRepository, List<OutcomeEventParams> list, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = outcomeEventsRepository;
        this.$events = list;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new OutcomeEventsRepository$getAllEventsToSend$2(this.this$0, this.$events, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((OutcomeEventsRepository$getAllEventsToSend$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        IDatabaseProvider iDatabaseProvider;
        IDatabaseProvider iDatabaseProvider2;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        RemoveInvalidSessionTimeRecords removeInvalidSessionTimeRecords = RemoveInvalidSessionTimeRecords.INSTANCE;
        iDatabaseProvider = this.this$0._databaseProvider;
        removeInvalidSessionTimeRecords.run(iDatabaseProvider);
        iDatabaseProvider2 = this.this$0._databaseProvider;
        IDatabase.DefaultImpls.query$default(iDatabaseProvider2.getOs(), "outcome", null, null, null, null, null, null, null, new AnonymousClass1(this.this$0, this.$events), 254, null);
        return v.f5689a;
    }
}
