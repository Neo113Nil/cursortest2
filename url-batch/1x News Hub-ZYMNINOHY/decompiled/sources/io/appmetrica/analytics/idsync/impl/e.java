package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final x f5639a = new x();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o fromModel(IdSyncConfig idSyncConfig) {
        o oVar = new o();
        oVar.f5668a = idSyncConfig.getEnabled();
        n nVar = new n();
        nVar.f5663a = idSyncConfig.getLaunchDelay();
        int size = idSyncConfig.getRequests().size();
        m[] mVarArr = new m[size];
        for (int i3 = 0; i3 < size; i3++) {
            mVarArr[i3] = this.f5639a.fromModel(idSyncConfig.getRequests().get(i3));
        }
        nVar.f5664b = mVarArr;
        oVar.f5669b = nVar;
        return oVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig toModel(o oVar) {
        n nVar = oVar.f5669b;
        if (nVar == null) {
            nVar = new n();
        }
        boolean z = oVar.f5668a;
        long j3 = nVar.f5663a;
        m[] mVarArr = nVar.f5664b;
        ArrayList arrayList = new ArrayList(mVarArr.length);
        for (m mVar : mVarArr) {
            arrayList.add(this.f5639a.toModel(mVar));
        }
        return new IdSyncConfig(z, j3, arrayList);
    }
}
