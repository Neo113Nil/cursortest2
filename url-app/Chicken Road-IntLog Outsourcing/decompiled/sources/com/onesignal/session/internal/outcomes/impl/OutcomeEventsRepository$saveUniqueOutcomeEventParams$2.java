package com.onesignal.session.internal.outcomes.impl;

import D4.InterfaceC0022w;
import android.content.ContentValues;
import com.onesignal.core.internal.database.IDatabaseProvider;
import e5.g;
import f4.v;
import java.util.ArrayList;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$saveUniqueOutcomeEventParams$2", f = "OutcomeEventsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OutcomeEventsRepository$saveUniqueOutcomeEventParams$2 extends h implements InterfaceC1445p {
    final /* synthetic */ OutcomeEventParams $eventParams;
    int label;
    final /* synthetic */ OutcomeEventsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutcomeEventsRepository$saveUniqueOutcomeEventParams$2(OutcomeEventParams outcomeEventParams, OutcomeEventsRepository outcomeEventsRepository, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$eventParams = outcomeEventParams;
        this.this$0 = outcomeEventsRepository;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new OutcomeEventsRepository$saveUniqueOutcomeEventParams$2(this.$eventParams, this.this$0, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((OutcomeEventsRepository$saveUniqueOutcomeEventParams$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        IDatabaseProvider iDatabaseProvider;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        String outcomeId = this.$eventParams.getOutcomeId();
        ArrayList<CachedUniqueOutcome> arrayList = new ArrayList();
        OutcomeSource outcomeSource = this.$eventParams.getOutcomeSource();
        OutcomeSourceBody directBody = outcomeSource != null ? outcomeSource.getDirectBody() : null;
        OutcomeSource outcomeSource2 = this.$eventParams.getOutcomeSource();
        OutcomeSourceBody indirectBody = outcomeSource2 != null ? outcomeSource2.getIndirectBody() : null;
        this.this$0.addIdsToListFromSource(arrayList, directBody);
        this.this$0.addIdsToListFromSource(arrayList, indirectBody);
        for (CachedUniqueOutcome cachedUniqueOutcome : arrayList) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("channel_influence_id", cachedUniqueOutcome.getInfluenceId());
            contentValues.put("channel_type", cachedUniqueOutcome.getChannel().toString());
            contentValues.put("name", outcomeId);
            iDatabaseProvider = this.this$0._databaseProvider;
            iDatabaseProvider.getOs().insert("cached_unique_outcome", null, contentValues);
        }
        return v.f5689a;
    }
}
