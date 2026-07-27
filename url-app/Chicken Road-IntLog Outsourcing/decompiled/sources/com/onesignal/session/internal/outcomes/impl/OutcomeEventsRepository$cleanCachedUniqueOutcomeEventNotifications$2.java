package com.onesignal.session.internal.outcomes.impl;

import D4.InterfaceC0022w;
import b2.AbstractC0279e;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.session.internal.influence.InfluenceChannel;
import e5.g;
import f4.v;
import java.util.Locale;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$cleanCachedUniqueOutcomeEventNotifications$2", f = "OutcomeEventsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OutcomeEventsRepository$cleanCachedUniqueOutcomeEventNotifications$2 extends h implements InterfaceC1445p {
    final /* synthetic */ String $notificationIdColumnName;
    final /* synthetic */ String $notificationTableName;
    int label;
    final /* synthetic */ OutcomeEventsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutcomeEventsRepository$cleanCachedUniqueOutcomeEventNotifications$2(String str, String str2, OutcomeEventsRepository outcomeEventsRepository, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$notificationTableName = str;
        this.$notificationIdColumnName = str2;
        this.this$0 = outcomeEventsRepository;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new OutcomeEventsRepository$cleanCachedUniqueOutcomeEventNotifications$2(this.$notificationTableName, this.$notificationIdColumnName, this.this$0, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((OutcomeEventsRepository$cleanCachedUniqueOutcomeEventNotifications$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        IDatabaseProvider iDatabaseProvider;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        StringBuilder sb = new StringBuilder("NOT EXISTS(SELECT NULL FROM ");
        sb.append(this.$notificationTableName);
        sb.append(" n WHERE n.");
        sb.append(this.$notificationIdColumnName);
        sb.append(" = channel_influence_id AND channel_type = \"");
        String influenceChannel = InfluenceChannel.NOTIFICATION.toString();
        Locale ROOT = Locale.ROOT;
        i.d(ROOT, "ROOT");
        String lowerCase = influenceChannel.toLowerCase(ROOT);
        i.d(lowerCase, "toLowerCase(...)");
        String h3 = AbstractC0279e.h(sb, lowerCase, "\")");
        iDatabaseProvider = this.this$0._databaseProvider;
        iDatabaseProvider.getOs().delete("cached_unique_outcome", h3, null);
        return v.f5689a;
    }
}
