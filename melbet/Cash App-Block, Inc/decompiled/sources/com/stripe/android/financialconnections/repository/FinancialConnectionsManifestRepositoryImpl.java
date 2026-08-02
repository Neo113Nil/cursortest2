package com.stripe.android.financialconnections.repository;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.appsflyer.AdRevenueScheme;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.analytics.AuthSessionEvent;
import com.stripe.android.financialconnections.model.AuthorizationRepairResponse;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitutionSelected;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.IDConsentContentPane;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.TextUpdate;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.serialization.KSerializer;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONObject;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class FinancialConnectionsManifestRepositoryImpl {
    public final ApiRequest.Factory apiRequestFactory;
    public final StateFlowImpl cachedSynchronizeSessionResponseFlow;
    public final Locale locale;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final MutexImpl mutex = new MutexImpl();
    public final ProvideApiRequestOptions provideApiRequestOptions;
    public final FinancialConnectionsRequestExecutor requestExecutor;
    public final ReadonlyStateFlow syncFlow;

    public FinancialConnectionsManifestRepositoryImpl(FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor, ApiRequest.Factory factory, ProvideApiRequestOptions provideApiRequestOptions, Locale locale, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, SynchronizeSessionResponse synchronizeSessionResponse) {
        this.requestExecutor = financialConnectionsRequestExecutor;
        this.apiRequestFactory = factory;
        this.provideApiRequestOptions = provideApiRequestOptions;
        this.locale = locale;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(synchronizeSessionResponse);
        this.cachedSynchronizeSessionResponseFlow = MutableStateFlow;
        this.syncFlow = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cancelAuthorizationSession(String str, String str2, ContinuationImpl continuationImpl) {
        FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1 financialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1;
        int i;
        Object obj;
        if (continuationImpl instanceof FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1) {
            financialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1 = (FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1) continuationImpl;
            int i2 = financialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = financialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, "https://api.stripe.com/v1/connections/auth_sessions/cancel", this.provideApiRequestOptions.invoke(true), MapsKt__MapsKt.mapOf(new Pair("id", str2), new Pair("client_secret", str)));
                    KSerializer serializer = FinancialConnectionsAuthorizationSession.Companion.serializer();
                    financialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1.label = 1;
                    Object execute = this.requestExecutor.execute(createPost$default, serializer, financialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1);
                    obj = execute;
                    if (execute == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                    obj = obj2;
                }
                updateCachedActiveAuthSession("cancelAuthorizationSession", (FinancialConnectionsAuthorizationSession) obj);
                return obj;
            }
        }
        financialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1 = new FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1(this, continuationImpl);
        Object obj22 = financialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1.label;
        if (i != 0) {
        }
        updateCachedActiveAuthSession("cancelAuthorizationSession", (FinancialConnectionsAuthorizationSession) obj);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object completeAuthorizationSession(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1 financialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1;
        int i;
        Object obj;
        if (continuationImpl instanceof FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1) {
            financialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1 = (FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1) continuationImpl;
            int i2 = financialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = financialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    ApiRequest.Options invoke = this.provideApiRequestOptions.invoke(true);
                    Map mapOf = MapsKt__MapsKt.mapOf(new Pair("id", str2), new Pair("client_secret", str), new Pair("public_token", str3));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : mapOf.entrySet()) {
                        if (entry.getValue() != null) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, "https://api.stripe.com/v1/connections/auth_sessions/authorized", invoke, linkedHashMap);
                    KSerializer serializer = FinancialConnectionsAuthorizationSession.Companion.serializer();
                    financialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1.label = 1;
                    Object execute = this.requestExecutor.execute(createPost$default, serializer, financialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1);
                    obj = execute;
                    if (execute == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                    obj = obj2;
                }
                updateCachedActiveAuthSession("completeAuthorizationSession", (FinancialConnectionsAuthorizationSession) obj);
                return obj;
            }
        }
        financialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1 = new FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1(this, continuationImpl);
        Object obj22 = financialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1.label;
        if (i != 0) {
        }
        updateCachedActiveAuthSession("completeAuthorizationSession", (FinancialConnectionsAuthorizationSession) obj);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object disableNetworking(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        FinancialConnectionsManifestRepositoryImpl$disableNetworking$1 financialConnectionsManifestRepositoryImpl$disableNetworking$1;
        int i;
        Object obj;
        if (continuationImpl instanceof FinancialConnectionsManifestRepositoryImpl$disableNetworking$1) {
            financialConnectionsManifestRepositoryImpl$disableNetworking$1 = (FinancialConnectionsManifestRepositoryImpl$disableNetworking$1) continuationImpl;
            int i2 = financialConnectionsManifestRepositoryImpl$disableNetworking$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsManifestRepositoryImpl$disableNetworking$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = financialConnectionsManifestRepositoryImpl$disableNetworking$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsManifestRepositoryImpl$disableNetworking$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/disable_networking", this.provideApiRequestOptions.invoke(false), MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(new Pair("client_secret", str), new Pair("expand", CollectionsKt__CollectionsJVMKt.listOf("active_auth_session")), new Pair("client_requested_next_pane_on_disable_networking", str3), new Pair("disabled_reason", str2))));
                    KSerializer serializer = FinancialConnectionsSessionManifest.Companion.serializer();
                    financialConnectionsManifestRepositoryImpl$disableNetworking$1.label = 1;
                    Object execute = this.requestExecutor.execute(createPost$default, serializer, financialConnectionsManifestRepositoryImpl$disableNetworking$1);
                    obj = execute;
                    if (execute == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                    obj = obj2;
                }
                updateCachedManifest("postSaveAccountsToLink", (FinancialConnectionsSessionManifest) obj);
                return obj;
            }
        }
        financialConnectionsManifestRepositoryImpl$disableNetworking$1 = new FinancialConnectionsManifestRepositoryImpl$disableNetworking$1(this, continuationImpl);
        Object obj22 = financialConnectionsManifestRepositoryImpl$disableNetworking$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsManifestRepositoryImpl$disableNetworking$1.label;
        if (i != 0) {
        }
        updateCachedManifest("postSaveAccountsToLink", (FinancialConnectionsSessionManifest) obj);
        return obj;
    }

    public final SynchronizeSessionResponse getCachedSynchronizeSessionResponse() {
        return (SynchronizeSessionResponse) this.cachedSynchronizeSessionResponseFlow.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0086 A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:26:0x006c, B:28:0x0072, B:32:0x0086), top: B:25:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getOrSynchronizeFinancialConnectionsSession(String str, String str2, boolean z, ScannerView.AnonymousClass3 anonymousClass3, ContinuationImpl continuationImpl) {
        FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1 financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;
        int i;
        int i2;
        String str3;
        Mutex mutex;
        ScannerView.AnonymousClass3 anonymousClass32;
        boolean z2;
        Mutex mutex2;
        SynchronizeSessionResponse cachedSynchronizeSessionResponse;
        try {
            if (continuationImpl instanceof FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1) {
                financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1 = (FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1) continuationImpl;
                int i3 = financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.L$0 = str;
                        financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.L$1 = str2;
                        financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.L$2 = anonymousClass3;
                        MutexImpl mutexImpl = this.mutex;
                        financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.L$3 = mutexImpl;
                        financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.Z$0 = z;
                        i2 = 0;
                        financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.I$0 = 0;
                        financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.label = 1;
                        if (mutexImpl.lock(financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1) != obj2) {
                            str3 = str2;
                            mutex = mutexImpl;
                            anonymousClass32 = anonymousClass3;
                            z2 = z;
                        }
                        return obj2;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutex2 = financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.L$3;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            cachedSynchronizeSessionResponse = (SynchronizeSessionResponse) obj;
                            mutex = mutex2;
                            mutex.unlock(null);
                            return cachedSynchronizeSessionResponse;
                        } catch (Throwable th) {
                            th = th;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    int i4 = financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.I$0;
                    boolean z3 = financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.Z$0;
                    mutex = financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.L$3;
                    ScannerView.AnonymousClass3 anonymousClass33 = financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.L$2;
                    String str4 = financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.L$1;
                    String str5 = financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    anonymousClass32 = anonymousClass33;
                    z2 = z3;
                    str3 = str4;
                    i2 = i4;
                    str = str5;
                    cachedSynchronizeSessionResponse = getCachedSynchronizeSessionResponse();
                    if (cachedSynchronizeSessionResponse != null || ((Boolean) anonymousClass32.invoke(cachedSynchronizeSessionResponse)).booleanValue()) {
                        cachedSynchronizeSessionResponse = null;
                    }
                    if (cachedSynchronizeSessionResponse == null) {
                        financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.L$0 = null;
                        financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.L$1 = null;
                        financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.L$2 = null;
                        financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.L$3 = mutex;
                        financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.Z$0 = z2;
                        financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.I$0 = i2;
                        financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.label = 2;
                        obj = synchronize(str3, str, z2, financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1);
                        if (obj != obj2) {
                            mutex2 = mutex;
                            cachedSynchronizeSessionResponse = (SynchronizeSessionResponse) obj;
                            mutex = mutex2;
                        }
                        return obj2;
                    }
                    mutex.unlock(null);
                    return cachedSynchronizeSessionResponse;
                }
            }
            cachedSynchronizeSessionResponse = getCachedSynchronizeSessionResponse();
            if (cachedSynchronizeSessionResponse != null) {
            }
            cachedSynchronizeSessionResponse = null;
            if (cachedSynchronizeSessionResponse == null) {
            }
            mutex.unlock(null);
            return cachedSynchronizeSessionResponse;
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
        financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1 = new FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1(this, continuationImpl);
        Object obj3 = financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markConsentAcquired(String str, ContinuationImpl continuationImpl) {
        FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1 financialConnectionsManifestRepositoryImpl$markConsentAcquired$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        MutexImpl mutexImpl;
        int i2;
        Mutex mutex;
        ?? execute;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
        try {
            if (continuationImpl instanceof FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1) {
                financialConnectionsManifestRepositoryImpl$markConsentAcquired$1 = (FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1) continuationImpl;
                int i3 = financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.label = i3 - PKIFailureInfo.systemUnavail;
                    ?? r14 = financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(r14);
                        financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.L$0 = str;
                        mutexImpl = this.mutex;
                        financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.L$1 = mutexImpl;
                        financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.I$0 = 0;
                        financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.label = 1;
                        if (mutexImpl.lock(financialConnectionsManifestRepositoryImpl$markConsentAcquired$1) != coroutineSingletons) {
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutex = financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.L$1;
                        try {
                            SafeTrace.throwOnFailure(r14);
                            financialConnectionsSessionManifest = r14;
                            updateCachedManifest("consent acquired", financialConnectionsSessionManifest);
                            mutex.unlock(null);
                            return financialConnectionsSessionManifest;
                        } catch (Throwable th) {
                            th = th;
                            mutex.unlock(null);
                            throw th;
                        }
                    }
                    int i4 = financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.I$0;
                    ?? r2 = financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.L$1;
                    String str2 = financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.L$0;
                    SafeTrace.throwOnFailure(r14);
                    mutexImpl = r2;
                    i2 = i4;
                    str = str2;
                    ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/consent_acquired", this.provideApiRequestOptions.invoke(false), MapsKt__MapsKt.mapOf(new Pair("expand", CollectionsKt__CollectionsJVMKt.listOf("active_auth_session")), new Pair("client_secret", str)));
                    FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor = this.requestExecutor;
                    KSerializer serializer = FinancialConnectionsSessionManifest.Companion.serializer();
                    financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.L$0 = null;
                    financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.L$1 = mutexImpl;
                    financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.I$0 = i2;
                    financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.label = 2;
                    execute = financialConnectionsRequestExecutor.execute(createPost$default, serializer, financialConnectionsManifestRepositoryImpl$markConsentAcquired$1);
                    if (execute != coroutineSingletons) {
                        MutexImpl mutexImpl2 = mutexImpl;
                        financialConnectionsSessionManifest = execute;
                        mutex = mutexImpl2;
                        updateCachedManifest("consent acquired", financialConnectionsSessionManifest);
                        mutex.unlock(null);
                        return financialConnectionsSessionManifest;
                    }
                    return coroutineSingletons;
                }
            }
            ApiRequest createPost$default2 = ApiRequest.Factory.createPost$default(this.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/consent_acquired", this.provideApiRequestOptions.invoke(false), MapsKt__MapsKt.mapOf(new Pair("expand", CollectionsKt__CollectionsJVMKt.listOf("active_auth_session")), new Pair("client_secret", str)));
            FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor2 = this.requestExecutor;
            KSerializer serializer2 = FinancialConnectionsSessionManifest.Companion.serializer();
            financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.L$0 = null;
            financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.L$1 = mutexImpl;
            financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.I$0 = i2;
            financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.label = 2;
            execute = financialConnectionsRequestExecutor2.execute(createPost$default2, serializer2, financialConnectionsManifestRepositoryImpl$markConsentAcquired$1);
            if (execute != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            mutex = mutexImpl;
            mutex.unlock(null);
            throw th;
        }
        financialConnectionsManifestRepositoryImpl$markConsentAcquired$1 = new FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1(this, continuationImpl);
        ?? r142 = financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsManifestRepositoryImpl$markConsentAcquired$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object postAuthorizationSession(String str, String str2, FinancialConnectionsInstitution financialConnectionsInstitution, ContinuationImpl continuationImpl) {
        FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1 financialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;
        int i;
        Object obj;
        if (continuationImpl instanceof FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1) {
            financialConnectionsManifestRepositoryImpl$postAuthorizationSession$1 = (FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1) continuationImpl;
            int i2 = financialConnectionsManifestRepositoryImpl$postAuthorizationSession$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsManifestRepositoryImpl$postAuthorizationSession$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = financialConnectionsManifestRepositoryImpl$postAuthorizationSession$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsManifestRepositoryImpl$postAuthorizationSession$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, "https://api.stripe.com/v1/connections/auth_sessions", this.provideApiRequestOptions.invoke(true), MapsKt__MapsKt.mapOf(new Pair("client_secret", str), new Pair("use_mobile_handoff", Boolean.FALSE), new Pair("use_abstract_flow", Boolean.TRUE), new Pair("return_url", Recorder$$ExternalSyntheticOutline2.m("auth-redirect/", str2)), new Pair("institution", financialConnectionsInstitution.id)));
                    KSerializer serializer = FinancialConnectionsAuthorizationSession.Companion.serializer();
                    financialConnectionsManifestRepositoryImpl$postAuthorizationSession$1.L$2 = financialConnectionsInstitution;
                    financialConnectionsManifestRepositoryImpl$postAuthorizationSession$1.label = 1;
                    Object execute = this.requestExecutor.execute(createPost$default, serializer, financialConnectionsManifestRepositoryImpl$postAuthorizationSession$1);
                    obj = execute;
                    if (execute == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    financialConnectionsInstitution = financialConnectionsManifestRepositoryImpl$postAuthorizationSession$1.L$2;
                    SafeTrace.throwOnFailure(obj2);
                    obj = obj2;
                }
                updateActiveInstitution("postAuthorizationSession", financialConnectionsInstitution);
                updateCachedActiveAuthSession("postAuthorizationSession", (FinancialConnectionsAuthorizationSession) obj);
                return obj;
            }
        }
        financialConnectionsManifestRepositoryImpl$postAuthorizationSession$1 = new FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1(this, continuationImpl);
        Object obj22 = financialConnectionsManifestRepositoryImpl$postAuthorizationSession$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsManifestRepositoryImpl$postAuthorizationSession$1.label;
        if (i != 0) {
        }
        updateActiveInstitution("postAuthorizationSession", financialConnectionsInstitution);
        updateCachedActiveAuthSession("postAuthorizationSession", (FinancialConnectionsAuthorizationSession) obj);
        return obj;
    }

    public final Object postAuthorizationSessionEvent(String str, Date date, String str2, List list, TakeUntil$collectSafely$2 takeUntil$collectSafely$2) {
        ApiRequest.Options invoke = this.provideApiRequestOptions.invoke(true);
        Map mapOf = MapsKt__MapsKt.mapOf(new Pair("client_secret", str), new Pair("client_timestamp", String.valueOf(date.getTime())), new Pair("id", str2));
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            AuthSessionEvent authSessionEvent = (AuthSessionEvent) obj;
            authSessionEvent.getClass();
            arrayList.add(new Pair("frontend_events[" + i + "]", MapsKt__MapsKt.mapOf(new Pair("event_namespace", "partner-auth-lifecycle"), new Pair("event_name", authSessionEvent.name), new Pair("client_timestamp", String.valueOf(authSessionEvent.getTimestamp().getTime())), new Pair("raw_event_details", new JSONObject(authSessionEvent.rawEventDetails).toString()))));
            i = i2;
        }
        return this.requestExecutor.execute(ApiRequest.Factory.createPost$default(this.apiRequestFactory, "https://api.stripe.com/v1/connections/auth_sessions/events", invoke, MapsKt__MapsKt.plus(mapOf, arrayList)), FinancialConnectionsAuthorizationSession.Companion.serializer(), takeUntil$collectSafely$2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object postMarkLinkVerified(String str, ContinuationImpl continuationImpl) {
        FinancialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1 financialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1;
        int i;
        Object obj;
        if (continuationImpl instanceof FinancialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1) {
            financialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1 = (FinancialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1) continuationImpl;
            int i2 = financialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = financialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/link_verified", this.provideApiRequestOptions.invoke(false), MapsKt__MapsKt.mapOf(new Pair("client_secret", str), new Pair("expand", CollectionsKt__CollectionsJVMKt.listOf("active_auth_session"))));
                    KSerializer serializer = FinancialConnectionsSessionManifest.Companion.serializer();
                    financialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1.label = 1;
                    Object execute = this.requestExecutor.execute(createPost$default, serializer, financialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1);
                    obj = execute;
                    if (execute == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                    obj = obj2;
                }
                updateCachedManifest("postMarkLinkVerified", (FinancialConnectionsSessionManifest) obj);
                return obj;
            }
        }
        financialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1 = new FinancialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1(this, continuationImpl);
        Object obj22 = financialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1.label;
        if (i != 0) {
        }
        updateCachedManifest("postMarkLinkVerified", (FinancialConnectionsSessionManifest) obj);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object postMarkLinkingMoreAccounts(String str, ContinuationImpl continuationImpl) {
        FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1 financialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1;
        int i;
        Object obj;
        if (continuationImpl instanceof FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1) {
            financialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1 = (FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1) continuationImpl;
            int i2 = financialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = financialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/link_more_accounts", this.provideApiRequestOptions.invoke(true), MapsKt__MapsKt.mapOf(new Pair("expand", CollectionsKt__CollectionsJVMKt.listOf("active_auth_session")), new Pair("client_secret", str)));
                    KSerializer serializer = FinancialConnectionsSessionManifest.Companion.serializer();
                    financialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1.label = 1;
                    Object execute = this.requestExecutor.execute(createPost$default, serializer, financialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1);
                    obj = execute;
                    if (execute == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                    obj = obj2;
                }
                updateCachedManifest("postMarkLinkingMoreAccounts", (FinancialConnectionsSessionManifest) obj);
                return obj;
            }
        }
        financialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1 = new FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1(this, continuationImpl);
        Object obj22 = financialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1.label;
        if (i != 0) {
        }
        updateCachedManifest("postMarkLinkingMoreAccounts", (FinancialConnectionsSessionManifest) obj);
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (r3 != null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object postSaveAccountsToLink(String str, String str2, String str3, String str4, String str5, String str6, Set set, ContinuationImpl continuationImpl) {
        FinancialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1 financialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1;
        int i;
        Map map;
        Object obj;
        if (continuationImpl instanceof FinancialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1) {
            financialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1 = (FinancialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1) continuationImpl;
            int i2 = financialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = financialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    if (set != null) {
                        Set set2 = set;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
                        int i3 = 0;
                        for (Object obj4 : set2) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw null;
                            }
                            arrayList.add(new Pair(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3, "selected_accounts[", "]"), (String) obj4));
                            i3 = i4;
                        }
                        map = MapsKt__MapsKt.toMap(arrayList);
                    }
                    map = EmptyMap.INSTANCE;
                    map.getClass();
                    ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/save_accounts_to_link", this.provideApiRequestOptions.invoke(false), MapsKt__MapsKt.plus(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(new Pair("client_secret", str), new Pair("consumer_session_client_secret", str6), new Pair("expand", CollectionsKt__CollectionsJVMKt.listOf("active_auth_session")), new Pair(AdRevenueScheme.COUNTRY, str3), new Pair("locale", str4), new Pair("email_address", str2), new Pair("phone_number", str5))), map));
                    KSerializer serializer = FinancialConnectionsSessionManifest.Companion.serializer();
                    financialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1.label = 1;
                    Object execute = this.requestExecutor.execute(createPost$default, serializer, financialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1);
                    obj = execute;
                    if (execute == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                    obj = obj2;
                }
                updateCachedManifest("postSaveAccountsToLink", (FinancialConnectionsSessionManifest) obj);
                return obj;
            }
        }
        financialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1 = new FinancialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1(this, continuationImpl);
        Object obj22 = financialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1.label;
        if (i != 0) {
        }
        updateCachedManifest("postSaveAccountsToLink", (FinancialConnectionsSessionManifest) obj);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object repairAuthorizationSession(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        FinancialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1 financialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1;
        int i;
        if (continuationImpl instanceof FinancialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1) {
            financialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1 = (FinancialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1) continuationImpl;
            int i2 = financialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = financialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, "https://api.stripe.com/v1/connections/repair_sessions/generate_url", this.provideApiRequestOptions.invoke(true), MapsKt__MapsKt.mapOf(new Pair("client_secret", str), new Pair("core_authorization", str2), new Pair("return_url", Recorder$$ExternalSyntheticOutline2.m("auth-redirect/", str3))));
                    KSerializer serializer = AuthorizationRepairResponse.Companion.serializer();
                    financialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1.label = 1;
                    obj = this.requestExecutor.execute(createPost$default, serializer, financialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1);
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
                AuthorizationRepairResponse authorizationRepairResponse = (AuthorizationRepairResponse) obj;
                String str4 = authorizationRepairResponse.id;
                String str5 = authorizationRepairResponse.url;
                FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = new FinancialConnectionsAuthorizationSession(str4, FinancialConnectionsSessionManifest.Pane.SUCCESS, authorizationRepairResponse.flow, null, null, null, str5, null, Boolean.valueOf(authorizationRepairResponse.isOAuth), authorizationRepairResponse.display);
                updateCachedActiveAuthSession("repairAuthorizationSession", financialConnectionsAuthorizationSession);
                return financialConnectionsAuthorizationSession;
            }
        }
        financialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1 = new FinancialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1(this, continuationImpl);
        Object obj2 = financialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1.label;
        if (i != 0) {
        }
        AuthorizationRepairResponse authorizationRepairResponse2 = (AuthorizationRepairResponse) obj2;
        String str42 = authorizationRepairResponse2.id;
        String str52 = authorizationRepairResponse2.url;
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession2 = new FinancialConnectionsAuthorizationSession(str42, FinancialConnectionsSessionManifest.Pane.SUCCESS, authorizationRepairResponse2.flow, null, null, null, str52, null, Boolean.valueOf(authorizationRepairResponse2.isOAuth), authorizationRepairResponse2.display);
        updateCachedActiveAuthSession("repairAuthorizationSession", financialConnectionsAuthorizationSession2);
        return financialConnectionsAuthorizationSession2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object retrieveAuthorizationSession(String str, String str2, ContinuationImpl continuationImpl) {
        FinancialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1 financialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1;
        int i;
        Object obj;
        if (continuationImpl instanceof FinancialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1) {
            financialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1 = (FinancialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1) continuationImpl;
            int i2 = financialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = financialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, "https://api.stripe.com/v1/connections/auth_sessions/retrieve", this.provideApiRequestOptions.invoke(true), MapsKt__MapsKt.mapOf(new Pair("id", str2), new Pair("client_secret", str), new Pair("emit_events", Boolean.TRUE)));
                    KSerializer serializer = FinancialConnectionsAuthorizationSession.Companion.serializer();
                    financialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1.label = 1;
                    Object execute = this.requestExecutor.execute(createPost$default, serializer, financialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1);
                    obj = execute;
                    if (execute == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                    obj = obj2;
                }
                updateCachedActiveAuthSession("retrieveAuthorizationSession", (FinancialConnectionsAuthorizationSession) obj);
                return obj;
            }
        }
        financialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1 = new FinancialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1(this, continuationImpl);
        Object obj22 = financialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1.label;
        if (i != 0) {
        }
        updateCachedActiveAuthSession("retrieveAuthorizationSession", (FinancialConnectionsAuthorizationSession) obj);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object selectInstitution(String str, FinancialConnectionsInstitution financialConnectionsInstitution, ContinuationImpl continuationImpl) {
        FinancialConnectionsManifestRepositoryImpl$selectInstitution$1 financialConnectionsManifestRepositoryImpl$selectInstitution$1;
        int i;
        SynchronizeSessionResponse cachedSynchronizeSessionResponse;
        FinancialConnectionsInstitution financialConnectionsInstitution2 = financialConnectionsInstitution;
        if (continuationImpl instanceof FinancialConnectionsManifestRepositoryImpl$selectInstitution$1) {
            financialConnectionsManifestRepositoryImpl$selectInstitution$1 = (FinancialConnectionsManifestRepositoryImpl$selectInstitution$1) continuationImpl;
            int i2 = financialConnectionsManifestRepositoryImpl$selectInstitution$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsManifestRepositoryImpl$selectInstitution$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = financialConnectionsManifestRepositoryImpl$selectInstitution$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsManifestRepositoryImpl$selectInstitution$1.label;
                SynchronizeSessionResponse synchronizeSessionResponse = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/institution_selected", this.provideApiRequestOptions.invoke(true), MapsKt__MapsKt.mapOf(new Pair("client_secret", str), new Pair("currently_selected_institution", financialConnectionsInstitution2.id)));
                    KSerializer serializer = FinancialConnectionsInstitutionSelected.Companion.serializer();
                    financialConnectionsManifestRepositoryImpl$selectInstitution$1.L$1 = financialConnectionsInstitution2;
                    financialConnectionsManifestRepositoryImpl$selectInstitution$1.label = 1;
                    obj = this.requestExecutor.execute(createPost$default, serializer, financialConnectionsManifestRepositoryImpl$selectInstitution$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    financialConnectionsInstitution2 = financialConnectionsManifestRepositoryImpl$selectInstitution$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                FinancialConnectionsInstitutionSelected financialConnectionsInstitutionSelected = (FinancialConnectionsInstitutionSelected) obj;
                updateActiveInstitution("selectInstitution", financialConnectionsInstitution2);
                updateCachedManifest("selectInstitution", financialConnectionsInstitutionSelected.manifest);
                TextUpdate textUpdate = financialConnectionsInstitutionSelected.text;
                IDConsentContentPane iDConsentContentPane = textUpdate == null ? textUpdate.idConsentContentPane : null;
                this.logger.debug("SYNC_CACHE: updating local sync object from selectInstitution with ID consent content pane");
                cachedSynchronizeSessionResponse = getCachedSynchronizeSessionResponse();
                if (cachedSynchronizeSessionResponse != null) {
                    TextUpdate textUpdate2 = cachedSynchronizeSessionResponse.text;
                    synchronizeSessionResponse = SynchronizeSessionResponse.copy$default(cachedSynchronizeSessionResponse, null, textUpdate2 != null ? new TextUpdate(textUpdate2.accountPicker, textUpdate2.consent, textUpdate2.linkLoginPane, textUpdate2.networkingLinkSignupPane, textUpdate2.oauthPrepane, textUpdate2.returningNetworkingUserAccountPicker, textUpdate2.successPane, iDConsentContentPane) : null, 5);
                }
                this.cachedSynchronizeSessionResponseFlow.setValue(synchronizeSessionResponse);
                return obj;
            }
        }
        financialConnectionsManifestRepositoryImpl$selectInstitution$1 = new FinancialConnectionsManifestRepositoryImpl$selectInstitution$1(this, continuationImpl);
        Object obj2 = financialConnectionsManifestRepositoryImpl$selectInstitution$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsManifestRepositoryImpl$selectInstitution$1.label;
        SynchronizeSessionResponse synchronizeSessionResponse2 = null;
        if (i != 0) {
        }
        FinancialConnectionsInstitutionSelected financialConnectionsInstitutionSelected2 = (FinancialConnectionsInstitutionSelected) obj2;
        updateActiveInstitution("selectInstitution", financialConnectionsInstitution2);
        updateCachedManifest("selectInstitution", financialConnectionsInstitutionSelected2.manifest);
        TextUpdate textUpdate3 = financialConnectionsInstitutionSelected2.text;
        if (textUpdate3 == null) {
        }
        this.logger.debug("SYNC_CACHE: updating local sync object from selectInstitution with ID consent content pane");
        cachedSynchronizeSessionResponse = getCachedSynchronizeSessionResponse();
        if (cachedSynchronizeSessionResponse != null) {
        }
        this.cachedSynchronizeSessionResponseFlow.setValue(synchronizeSessionResponse2);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object synchronize(String str, String str2, boolean z, ContinuationImpl continuationImpl) {
        FinancialConnectionsManifestRepositoryImpl$synchronize$1 financialConnectionsManifestRepositoryImpl$synchronize$1;
        int i;
        if (continuationImpl instanceof FinancialConnectionsManifestRepositoryImpl$synchronize$1) {
            financialConnectionsManifestRepositoryImpl$synchronize$1 = (FinancialConnectionsManifestRepositoryImpl$synchronize$1) continuationImpl;
            int i2 = financialConnectionsManifestRepositoryImpl$synchronize$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsManifestRepositoryImpl$synchronize$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = financialConnectionsManifestRepositoryImpl$synchronize$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsManifestRepositoryImpl$synchronize$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ApiRequest.Options invoke = this.provideApiRequestOptions.invoke(true);
                    Pair pair = new Pair("expand", CollectionsKt__CollectionsJVMKt.listOf("manifest.active_auth_session"));
                    Boolean bool = Boolean.TRUE;
                    ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, "https://api.stripe.com/v1/financial_connections/sessions/synchronize", invoke, MapsKt__MapsKt.mapOf(pair, new Pair("emit_events", bool), new Pair("locale", this.locale.toLanguageTag()), new Pair("mobile", MapsKt__MapsKt.mapOf(new Pair("fullscreen", bool), new Pair("hide_close_button", bool), new Pair("supports_app_verification", Boolean.valueOf(z)), new Pair("verified_app_id", str), new Pair("application_id", str))), new Pair("client_secret", str2)));
                    KSerializer serializer = SynchronizeSessionResponse.Companion.serializer();
                    financialConnectionsManifestRepositoryImpl$synchronize$1.label = 1;
                    obj = this.requestExecutor.execute(createPost$default, serializer, financialConnectionsManifestRepositoryImpl$synchronize$1);
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
                this.logger.debug("SYNC_CACHE: updating local sync object from get/fetch");
                this.cachedSynchronizeSessionResponseFlow.setValue((SynchronizeSessionResponse) obj);
                return obj;
            }
        }
        financialConnectionsManifestRepositoryImpl$synchronize$1 = new FinancialConnectionsManifestRepositoryImpl$synchronize$1(this, continuationImpl);
        Object obj2 = financialConnectionsManifestRepositoryImpl$synchronize$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsManifestRepositoryImpl$synchronize$1.label;
        if (i != 0) {
        }
        this.logger.debug("SYNC_CACHE: updating local sync object from get/fetch");
        this.cachedSynchronizeSessionResponseFlow.setValue((SynchronizeSessionResponse) obj2);
        return obj2;
    }

    public final void updateActiveInstitution(String str, FinancialConnectionsInstitution financialConnectionsInstitution) {
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
        this.logger.debug("SYNC_CACHE: updating local active institution from ".concat(str));
        SynchronizeSessionResponse cachedSynchronizeSessionResponse = getCachedSynchronizeSessionResponse();
        if (cachedSynchronizeSessionResponse == null || (financialConnectionsSessionManifest = cachedSynchronizeSessionResponse.manifest) == null) {
            return;
        }
        updateCachedManifest("updating active institution", FinancialConnectionsSessionManifest.copy$default(financialConnectionsSessionManifest, null, financialConnectionsInstitution, null, -16777217, 16383));
    }

    public final void updateCachedActiveAuthSession(String str, FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession) {
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
        this.logger.debug("SYNC_CACHE: updating local active auth session from ".concat(str));
        SynchronizeSessionResponse cachedSynchronizeSessionResponse = getCachedSynchronizeSessionResponse();
        if (cachedSynchronizeSessionResponse == null || (financialConnectionsSessionManifest = cachedSynchronizeSessionResponse.manifest) == null) {
            return;
        }
        updateCachedManifest("updating active auth session", FinancialConnectionsSessionManifest.copy$default(financialConnectionsSessionManifest, financialConnectionsAuthorizationSession, null, null, -8388609, 16383));
    }

    public final void updateCachedManifest(String str, FinancialConnectionsSessionManifest financialConnectionsSessionManifest) {
        this.logger.debug("SYNC_CACHE: updating local manifest from ".concat(str));
        SynchronizeSessionResponse cachedSynchronizeSessionResponse = getCachedSynchronizeSessionResponse();
        this.cachedSynchronizeSessionResponseFlow.setValue(cachedSynchronizeSessionResponse != null ? SynchronizeSessionResponse.copy$default(cachedSynchronizeSessionResponse, financialConnectionsSessionManifest, null, 6) : null);
    }
}
