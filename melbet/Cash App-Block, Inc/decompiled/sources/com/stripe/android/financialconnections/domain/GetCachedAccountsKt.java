package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.model.PartnerAccount;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags_Factory;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes8.dex */
public abstract class GetCachedAccountsKt {
    public static final SandboxFlags_Factory INSTANCE = new SandboxFlags_Factory(4);

    public static final ArrayList toCachedPartnerAccounts(List list) {
        list.getClass();
        List<PartnerAccount> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (PartnerAccount partnerAccount : list2) {
            arrayList.add(new CachedPartnerAccount(partnerAccount.id, partnerAccount.linkedAccountId));
        }
        return arrayList;
    }
}
