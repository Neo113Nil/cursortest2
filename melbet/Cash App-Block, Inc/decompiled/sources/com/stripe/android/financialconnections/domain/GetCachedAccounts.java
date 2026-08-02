package com.stripe.android.financialconnections.domain;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class GetCachedAccounts {
    public final FinancialConnectionsAccountsRepositoryImpl repository;

    public GetCachedAccounts(FinancialConnectionsAccountsRepositoryImpl financialConnectionsAccountsRepositoryImpl, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
        financialConnectionsAccountsRepositoryImpl.getClass();
        financialConnectionsSheetConfiguration.getClass();
        this.repository = financialConnectionsAccountsRepositoryImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(ContinuationImpl continuationImpl) {
        GetCachedAccounts$invoke$1 getCachedAccounts$invoke$1;
        int i;
        if (continuationImpl instanceof GetCachedAccounts$invoke$1) {
            getCachedAccounts$invoke$1 = (GetCachedAccounts$invoke$1) continuationImpl;
            int i2 = getCachedAccounts$invoke$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                getCachedAccounts$invoke$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = getCachedAccounts$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getCachedAccounts$invoke$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    getCachedAccounts$invoke$1.label = 1;
                    obj = this.repository.savedStateHandle.get("CachedPartnerAccounts");
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                List list = (List) obj;
                return list != null ? EmptyList.INSTANCE : list;
            }
        }
        getCachedAccounts$invoke$1 = new GetCachedAccounts$invoke$1(this, continuationImpl);
        Object obj2 = getCachedAccounts$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getCachedAccounts$invoke$1.label;
        if (i != 0) {
        }
        List list2 = (List) obj2;
        if (list2 != null) {
        }
    }
}
