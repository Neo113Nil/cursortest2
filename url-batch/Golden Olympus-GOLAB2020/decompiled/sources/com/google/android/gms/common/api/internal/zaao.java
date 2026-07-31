package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class zaao extends zaas {
    final /* synthetic */ zaau zaa;
    private final ArrayList zac;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaao(zaau zaauVar, ArrayList arrayList) {
        super(zaauVar, null);
        this.zaa = zaauVar;
        this.zac = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.zaas
    public final void zaa() {
        zabg zabgVar;
        IAccountAccessor iAccountAccessor;
        zabg zabgVar2;
        zaau zaauVar = this.zaa;
        zabgVar = zaauVar.zaa;
        zabgVar.zag.zad = zaau.zao(zaauVar);
        ArrayList arrayList = this.zac;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Api.Client client = (Api.Client) arrayList.get(i4);
            zaau zaauVar2 = this.zaa;
            iAccountAccessor = zaauVar2.zao;
            zabgVar2 = zaauVar2.zaa;
            client.getRemoteService(iAccountAccessor, zabgVar2.zag.zad);
        }
    }
}
