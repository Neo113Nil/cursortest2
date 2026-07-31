package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.idsync.impl.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0028e implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C f731a = new C();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m fromModel(IdSyncConfig idSyncConfig) {
        m mVar = new m();
        mVar.f739a = idSyncConfig.getCom.facebook.react.uimanager.ViewProps.ENABLED java.lang.String();
        l lVar = new l();
        lVar.f738a = idSyncConfig.getLaunchDelay();
        int size = idSyncConfig.getRequests().size();
        k[] kVarArr = new k[size];
        for (int i = 0; i < size; i++) {
            kVarArr[i] = this.f731a.fromModel(idSyncConfig.getRequests().get(i));
        }
        lVar.b = kVarArr;
        mVar.b = lVar;
        return mVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig toModel(m mVar) {
        l lVar = mVar.b;
        if (lVar == null) {
            lVar = new l();
        }
        boolean z = mVar.f739a;
        long j = lVar.f738a;
        k[] kVarArr = lVar.b;
        ArrayList arrayList = new ArrayList(kVarArr.length);
        for (k kVar : kVarArr) {
            arrayList.add(this.f731a.toModel(kVar));
        }
        return new IdSyncConfig(z, j, arrayList);
    }
}
