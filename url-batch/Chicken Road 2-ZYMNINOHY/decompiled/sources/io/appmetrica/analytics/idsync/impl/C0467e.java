package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.idsync.impl.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0467e implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C f9912a = new C();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m fromModel(IdSyncConfig idSyncConfig) {
        m mVar = new m();
        mVar.f9943a = idSyncConfig.getEnabled();
        l lVar = new l();
        lVar.f9938a = idSyncConfig.getLaunchDelay();
        int size = idSyncConfig.getRequests().size();
        k[] kVarArr = new k[size];
        for (int i4 = 0; i4 < size; i4++) {
            kVarArr[i4] = this.f9912a.fromModel(idSyncConfig.getRequests().get(i4));
        }
        lVar.f9939b = kVarArr;
        mVar.f9944b = lVar;
        return mVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig toModel(m mVar) {
        l lVar = mVar.f9944b;
        if (lVar == null) {
            lVar = new l();
        }
        boolean z = mVar.f9943a;
        long j4 = lVar.f9938a;
        k[] kVarArr = lVar.f9939b;
        ArrayList arrayList = new ArrayList(kVarArr.length);
        for (k kVar : kVarArr) {
            arrayList.add(this.f9912a.toModel(kVar));
        }
        return new IdSyncConfig(z, j4, arrayList);
    }
}
