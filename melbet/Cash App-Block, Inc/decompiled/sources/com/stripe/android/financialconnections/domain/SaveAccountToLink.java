package com.stripe.android.financialconnections.domain;

import androidx.lifecycle.SavedStateHandle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.sheet.RealSheetState$peek$3;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.PaymentAccountParams;
import com.stripe.android.financialconnections.model.SuccessPane;
import com.stripe.android.financialconnections.model.TextUpdate;
import com.stripe.android.financialconnections.repository.AttachedPaymentAccountRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.utils.ErrorsKt;
import com.stripe.android.financialconnections.utils.PollTimingOptions;
import com.stripe.android.model.LinkBrand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class SaveAccountToLink {
    public final FinancialConnectionsAccountsRepositoryImpl accountsRepository;
    public final AttachedPaymentAccountRepository attachedPaymentAccountRepository;
    public final FinancialConnectionsSheetConfiguration configuration;
    public final RealIsNetworkingRelinkSession isNetworkingRelinkSession;
    public final Locale locale;
    public final FinancialConnectionsManifestRepositoryImpl repository;
    public final SuccessContentRepository successContentRepository;

    public SaveAccountToLink(Locale locale, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, AttachedPaymentAccountRepository attachedPaymentAccountRepository, SuccessContentRepository successContentRepository, FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl, FinancialConnectionsAccountsRepositoryImpl financialConnectionsAccountsRepositoryImpl, RealIsNetworkingRelinkSession realIsNetworkingRelinkSession) {
        financialConnectionsSheetConfiguration.getClass();
        attachedPaymentAccountRepository.getClass();
        successContentRepository.getClass();
        financialConnectionsManifestRepositoryImpl.getClass();
        financialConnectionsAccountsRepositoryImpl.getClass();
        realIsNetworkingRelinkSession.getClass();
        this.locale = locale;
        this.configuration = financialConnectionsSheetConfiguration;
        this.attachedPaymentAccountRepository = attachedPaymentAccountRepository;
        this.successContentRepository = successContentRepository;
        this.repository = financialConnectionsManifestRepositoryImpl;
        this.accountsRepository = financialConnectionsAccountsRepositoryImpl;
        this.isNetworkingRelinkSession = realIsNetworkingRelinkSession;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x00d2, code lost:
    
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00a3, code lost:
    
        if (r0 == null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ensureReadyAccounts(boolean z, List list, LinkBrand linkBrand, Function2 function2, ContinuationImpl continuationImpl) {
        SaveAccountToLink$ensureReadyAccounts$1 saveAccountToLink$ensureReadyAccounts$1;
        int i;
        Set set;
        Set set2;
        Object obj;
        LinkBrand linkBrand2;
        Function2 function22;
        Set set3;
        Object failure;
        Object obj2;
        Object retryOnException;
        Set set4;
        boolean z2;
        LinkBrand linkBrand3;
        Function2 function23;
        Set set5;
        LinkBrand linkBrand4;
        boolean z3;
        SuccessContentRepository successContentRepository;
        TextResource pluralId;
        SuccessPane successPane;
        String str;
        SuccessPane successPane2;
        String str2;
        boolean z4 = z;
        if (continuationImpl instanceof SaveAccountToLink$ensureReadyAccounts$1) {
            saveAccountToLink$ensureReadyAccounts$1 = (SaveAccountToLink$ensureReadyAccounts$1) continuationImpl;
            int i2 = saveAccountToLink$ensureReadyAccounts$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                saveAccountToLink$ensureReadyAccounts$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj3 = saveAccountToLink$ensureReadyAccounts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = saveAccountToLink$ensureReadyAccounts$1.label;
                int i3 = 2;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    if (list != null) {
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((CachedPartnerAccount) it.next()).id);
                        }
                        set = CollectionsKt.toSet(arrayList);
                    }
                    set = EmptySet.INSTANCE;
                    set2 = set;
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            String str3 = ((CachedPartnerAccount) it2.next()).linkedAccountId;
                            if (str3 != null) {
                                arrayList2.add(str3);
                            }
                        }
                        obj = CollectionsKt.toSet(arrayList2);
                    }
                    obj = EmptySet.INSTANCE;
                    List list3 = list;
                    if (list3 == null || list3.isEmpty()) {
                        linkBrand2 = linkBrand;
                        function22 = function2;
                        AttachedPaymentAccountRepository.State state = (AttachedPaymentAccountRepository.State) this.attachedPaymentAccountRepository.get();
                        if (!((state != null ? state.attachedPaymentAccount : null) instanceof PaymentAccountParams.BankAccount)) {
                            Result.Companion companion = Result.Companion;
                            set3 = set2;
                            failure = new Result.Failure(new IllegalStateException("Must have a bank account attached if no accounts are selected"));
                            if (Result.m4120exceptionOrNullimpl(failure) == null) {
                                boolean z5 = z4;
                                set4 = set3;
                                z2 = z5;
                                Result.Companion companion2 = Result.Companion;
                                if (!(failure instanceof Result.Failure)) {
                                }
                                z3 = failure instanceof Result.Failure;
                                successContentRepository = this.successContentRepository;
                                RealIsNetworkingRelinkSession realIsNetworkingRelinkSession = this.isNetworkingRelinkSession;
                                if (!z3) {
                                }
                                if (Result.m4120exceptionOrNullimpl(failure) != null) {
                                }
                                SafeTrace.throwOnFailure(failure);
                                return failure;
                            }
                            saveAccountToLink$ensureReadyAccounts$1.L$1 = linkBrand2;
                            saveAccountToLink$ensureReadyAccounts$1.L$2 = function22;
                            saveAccountToLink$ensureReadyAccounts$1.L$3 = set3;
                            saveAccountToLink$ensureReadyAccounts$1.L$6 = failure;
                            saveAccountToLink$ensureReadyAccounts$1.Z$0 = z4;
                            saveAccountToLink$ensureReadyAccounts$1.label = 2;
                            Object disableNetworking = this.repository.disableNetworking(this.configuration.financialConnectionsSessionClientSecret, "account_numbers_not_available", null, saveAccountToLink$ensureReadyAccounts$1);
                            if (disableNetworking != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                disableNetworking = Unit.INSTANCE;
                            }
                            if (disableNetworking != coroutineSingletons) {
                                Function2 function24 = function22;
                                linkBrand3 = linkBrand2;
                                function23 = function24;
                                set5 = set3;
                                LinkBrand linkBrand5 = linkBrand3;
                                function22 = function23;
                                linkBrand2 = linkBrand5;
                                z2 = z4;
                                set4 = set5;
                                Result.Companion companion22 = Result.Companion;
                                if (!(failure instanceof Result.Failure)) {
                                }
                                z3 = failure instanceof Result.Failure;
                                successContentRepository = this.successContentRepository;
                                RealIsNetworkingRelinkSession realIsNetworkingRelinkSession2 = this.isNetworkingRelinkSession;
                                if (!z3) {
                                }
                                if (Result.m4120exceptionOrNullimpl(failure) != null) {
                                }
                                SafeTrace.throwOnFailure(failure);
                                return failure;
                            }
                            return coroutineSingletons;
                        }
                        Result.Companion companion3 = Result.Companion;
                        obj2 = Unit.INSTANCE;
                    } else if (z4) {
                        try {
                            Result.Companion companion4 = Result.Companion;
                            linkBrand2 = linkBrand;
                            try {
                                saveAccountToLink$ensureReadyAccounts$1.L$1 = linkBrand2;
                                function22 = function2;
                                try {
                                    saveAccountToLink$ensureReadyAccounts$1.L$2 = function22;
                                    saveAccountToLink$ensureReadyAccounts$1.L$3 = set2;
                                    saveAccountToLink$ensureReadyAccounts$1.Z$0 = z4;
                                    saveAccountToLink$ensureReadyAccounts$1.label = 1;
                                    Duration.Companion companion5 = Duration.Companion;
                                    retryOnException = ErrorsKt.retryOnException(new PollTimingOptions(Duration.m4167getInWholeMillisecondsimpl(DurationKt.toDuration(1, DurationUnit.SECONDS)), 4), new RealSheetState$peek$3.AnonymousClass2(i3, continuation, 14), new RealMRIFactory$sign$2.AnonymousClass1(this, obj, continuation, 25), saveAccountToLink$ensureReadyAccounts$1);
                                    if (retryOnException != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        retryOnException = Unit.INSTANCE;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    Result.Companion companion6 = Result.Companion;
                                    obj2 = new Result.Failure(th);
                                    Set set6 = set2;
                                    failure = obj2;
                                    set3 = set6;
                                    if (Result.m4120exceptionOrNullimpl(failure) == null) {
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                function22 = function2;
                                Result.Companion companion62 = Result.Companion;
                                obj2 = new Result.Failure(th);
                                Set set62 = set2;
                                failure = obj2;
                                set3 = set62;
                                if (Result.m4120exceptionOrNullimpl(failure) == null) {
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            linkBrand2 = linkBrand;
                        }
                        if (retryOnException == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        linkBrand2 = linkBrand;
                        function22 = function2;
                        Result.Companion companion7 = Result.Companion;
                        obj2 = Unit.INSTANCE;
                    }
                    Set set622 = set2;
                    failure = obj2;
                    set3 = set622;
                    if (Result.m4120exceptionOrNullimpl(failure) == null) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            set4 = saveAccountToLink$ensureReadyAccounts$1.L$3;
                            linkBrand4 = saveAccountToLink$ensureReadyAccounts$1.L$1;
                            try {
                                SafeTrace.throwOnFailure(obj3);
                                FinancialConnectionsSessionManifest financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) obj3;
                                Result.Companion companion8 = Result.Companion;
                                failure = financialConnectionsSessionManifest;
                            } catch (Throwable th4) {
                                th = th4;
                                Result.Companion companion9 = Result.Companion;
                                failure = new Result.Failure(th);
                                linkBrand2 = linkBrand4;
                                z3 = failure instanceof Result.Failure;
                                successContentRepository = this.successContentRepository;
                                RealIsNetworkingRelinkSession realIsNetworkingRelinkSession22 = this.isNetworkingRelinkSession;
                                if (!z3) {
                                }
                                if (Result.m4120exceptionOrNullimpl(failure) != null) {
                                }
                                SafeTrace.throwOnFailure(failure);
                                return failure;
                            }
                            linkBrand2 = linkBrand4;
                            z3 = failure instanceof Result.Failure;
                            successContentRepository = this.successContentRepository;
                            RealIsNetworkingRelinkSession realIsNetworkingRelinkSession222 = this.isNetworkingRelinkSession;
                            if (!z3) {
                                FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = (FinancialConnectionsSessionManifest) failure;
                                if (realIsNetworkingRelinkSession222.pendingRepairRepository.get() == null) {
                                    int size = set4.size();
                                    TextUpdate textUpdate = financialConnectionsSessionManifest2.displayText;
                                    TextResource.Text text = (textUpdate == null || (successPane2 = textUpdate.successPane) == null || (str2 = successPane2.caption) == null) ? null : new TextResource.Text(str2);
                                    TextUpdate textUpdate2 = financialConnectionsSessionManifest2.displayText;
                                    if (textUpdate2 == null || (successPane = textUpdate2.successPane) == null || (str = successPane.subCaption) == null) {
                                        pluralId = linkBrand2 == LinkBrand.Link ? new TextResource.PluralId(R.string.stripe_success_pane_desc_link_success_singular, R.string.stripe_success_pane_desc_link_success_plural, Math.max(1, size)) : new TextResource.PluralId(R.string.stripe_success_pane_desc_link_success_singular_with_brand, R.string.stripe_success_pane_desc_link_success_plural_with_brand, Math.max(1, size), CollectionsKt__CollectionsJVMKt.listOf(linkBrand2.brandName()));
                                    } else {
                                        pluralId = new TextResource.Text(str);
                                    }
                                    successContentRepository.getClass();
                                    ((SavedStateHandle) successContentRepository.zzd).set(new SuccessContentRepository.State(pluralId, text), (String) successContentRepository.zza);
                                }
                            }
                            if (Result.m4120exceptionOrNullimpl(failure) != null && realIsNetworkingRelinkSession222.pendingRepairRepository.get() == null) {
                                int size2 = set4.size();
                                TextResource.PluralId pluralId2 = linkBrand2 != LinkBrand.Link ? new TextResource.PluralId(R.string.stripe_success_pane_desc_link_error_singular, R.string.stripe_success_pane_desc_link_error_plural, Math.max(1, size2)) : new TextResource.PluralId(R.string.stripe_success_pane_desc_link_error_singular_with_brand, R.string.stripe_success_pane_desc_link_error_plural_with_brand, Math.max(1, size2), CollectionsKt__CollectionsJVMKt.listOf(linkBrand2.brandName()));
                                successContentRepository.getClass();
                                ((SavedStateHandle) successContentRepository.zzd).set(new SuccessContentRepository.State(pluralId2, null), (String) successContentRepository.zza);
                            }
                            SafeTrace.throwOnFailure(failure);
                            return failure;
                        }
                        z4 = saveAccountToLink$ensureReadyAccounts$1.Z$0;
                        failure = saveAccountToLink$ensureReadyAccounts$1.L$6;
                        set5 = saveAccountToLink$ensureReadyAccounts$1.L$3;
                        function23 = saveAccountToLink$ensureReadyAccounts$1.L$2;
                        linkBrand3 = saveAccountToLink$ensureReadyAccounts$1.L$1;
                        SafeTrace.throwOnFailure(obj3);
                        LinkBrand linkBrand52 = linkBrand3;
                        function22 = function23;
                        linkBrand2 = linkBrand52;
                        z2 = z4;
                        set4 = set5;
                        Result.Companion companion222 = Result.Companion;
                        if (!(failure instanceof Result.Failure)) {
                            try {
                                saveAccountToLink$ensureReadyAccounts$1.L$1 = linkBrand2;
                                saveAccountToLink$ensureReadyAccounts$1.L$2 = null;
                                saveAccountToLink$ensureReadyAccounts$1.L$3 = set4;
                                saveAccountToLink$ensureReadyAccounts$1.L$6 = null;
                                saveAccountToLink$ensureReadyAccounts$1.Z$0 = z2;
                                saveAccountToLink$ensureReadyAccounts$1.label = 3;
                                obj3 = function22.invoke(set4, saveAccountToLink$ensureReadyAccounts$1);
                            } catch (Throwable th5) {
                                th = th5;
                                linkBrand4 = linkBrand2;
                                Result.Companion companion92 = Result.Companion;
                                failure = new Result.Failure(th);
                                linkBrand2 = linkBrand4;
                                z3 = failure instanceof Result.Failure;
                                successContentRepository = this.successContentRepository;
                                RealIsNetworkingRelinkSession realIsNetworkingRelinkSession2222 = this.isNetworkingRelinkSession;
                                if (!z3) {
                                }
                                if (Result.m4120exceptionOrNullimpl(failure) != null) {
                                }
                                SafeTrace.throwOnFailure(failure);
                                return failure;
                            }
                            if (obj3 != coroutineSingletons) {
                                linkBrand4 = linkBrand2;
                                FinancialConnectionsSessionManifest financialConnectionsSessionManifest3 = (FinancialConnectionsSessionManifest) obj3;
                                Result.Companion companion82 = Result.Companion;
                                failure = financialConnectionsSessionManifest3;
                                linkBrand2 = linkBrand4;
                            }
                            return coroutineSingletons;
                        }
                        z3 = failure instanceof Result.Failure;
                        successContentRepository = this.successContentRepository;
                        RealIsNetworkingRelinkSession realIsNetworkingRelinkSession22222 = this.isNetworkingRelinkSession;
                        if (!z3) {
                        }
                        if (Result.m4120exceptionOrNullimpl(failure) != null) {
                            int size22 = set4.size();
                            if (linkBrand2 != LinkBrand.Link) {
                            }
                            successContentRepository.getClass();
                            ((SavedStateHandle) successContentRepository.zzd).set(new SuccessContentRepository.State(pluralId2, null), (String) successContentRepository.zza);
                        }
                        SafeTrace.throwOnFailure(failure);
                        return failure;
                    }
                    z4 = saveAccountToLink$ensureReadyAccounts$1.Z$0;
                    set2 = saveAccountToLink$ensureReadyAccounts$1.L$3;
                    Function2 function25 = saveAccountToLink$ensureReadyAccounts$1.L$2;
                    LinkBrand linkBrand6 = saveAccountToLink$ensureReadyAccounts$1.L$1;
                    try {
                        SafeTrace.throwOnFailure(obj3);
                        function22 = function25;
                        linkBrand2 = linkBrand6;
                    } catch (Throwable th6) {
                        th = th6;
                        function22 = function25;
                        linkBrand2 = linkBrand6;
                        Result.Companion companion622 = Result.Companion;
                        obj2 = new Result.Failure(th);
                        Set set6222 = set2;
                        failure = obj2;
                        set3 = set6222;
                        if (Result.m4120exceptionOrNullimpl(failure) == null) {
                        }
                    }
                }
                obj2 = Unit.INSTANCE;
                Result.Companion companion10 = Result.Companion;
                Set set62222 = set2;
                failure = obj2;
                set3 = set62222;
                if (Result.m4120exceptionOrNullimpl(failure) == null) {
                }
            }
        }
        saveAccountToLink$ensureReadyAccounts$1 = new SaveAccountToLink$ensureReadyAccounts$1(this, continuationImpl);
        Object obj32 = saveAccountToLink$ensureReadyAccounts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = saveAccountToLink$ensureReadyAccounts$1.label;
        int i32 = 2;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        obj2 = Unit.INSTANCE;
        Result.Companion companion102 = Result.Companion;
        Set set622222 = set2;
        failure = obj2;
        set3 = set622222;
        if (Result.m4120exceptionOrNullimpl(failure) == null) {
        }
    }
}
