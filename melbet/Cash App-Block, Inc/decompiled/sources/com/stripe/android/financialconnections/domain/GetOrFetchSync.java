package com.stripe.android.financialconnections.domain;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.core.utilities.AppPreferenceStore;
import com.squareup.scannerview.ScannerView;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl;
import com.stripe.android.model.LinkBrand;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class GetOrFetchSync {
    public final String applicationId;
    public final FinancialConnectionsSheetConfiguration configuration;
    public final AppPreferenceStore debugConfiguration;
    public final FinancialConnectionsManifestRepositoryImpl repository;

    public interface RefetchCondition {

        public final class Always implements RefetchCondition {
            public static final Always INSTANCE = new Always();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Always);
            }

            public final int hashCode() {
                return 1484658098;
            }

            @Override // com.stripe.android.financialconnections.domain.GetOrFetchSync.RefetchCondition
            public final boolean shouldReFetch(SynchronizeSessionResponse synchronizeSessionResponse) {
                synchronizeSessionResponse.getClass();
                return true;
            }

            public final String toString() {
                return "Always";
            }
        }

        public final class IfMissingActiveAuthSession implements RefetchCondition {
            public static final IfMissingActiveAuthSession INSTANCE = new IfMissingActiveAuthSession();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof IfMissingActiveAuthSession);
            }

            public final int hashCode() {
                return 1982328450;
            }

            @Override // com.stripe.android.financialconnections.domain.GetOrFetchSync.RefetchCondition
            public final boolean shouldReFetch(SynchronizeSessionResponse synchronizeSessionResponse) {
                synchronizeSessionResponse.getClass();
                return synchronizeSessionResponse.manifest.activeAuthSession == null;
            }

            public final String toString() {
                return "IfMissingActiveAuthSession";
            }
        }

        public final class None implements RefetchCondition {
            public static final None INSTANCE = new None();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof None);
            }

            public final int hashCode() {
                return -1660633189;
            }

            @Override // com.stripe.android.financialconnections.domain.GetOrFetchSync.RefetchCondition
            public final boolean shouldReFetch(SynchronizeSessionResponse synchronizeSessionResponse) {
                synchronizeSessionResponse.getClass();
                return false;
            }

            public final String toString() {
                return "None";
            }
        }

        boolean shouldReFetch(SynchronizeSessionResponse synchronizeSessionResponse);
    }

    public GetOrFetchSync(FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, String str, AppPreferenceStore appPreferenceStore) {
        financialConnectionsManifestRepositoryImpl.getClass();
        financialConnectionsSheetConfiguration.getClass();
        str.getClass();
        appPreferenceStore.getClass();
        this.repository = financialConnectionsManifestRepositoryImpl;
        this.configuration = financialConnectionsSheetConfiguration;
        this.applicationId = str;
        this.debugConfiguration = appPreferenceStore;
    }

    public static /* synthetic */ Object invoke$default(GetOrFetchSync getOrFetchSync, RefetchCondition refetchCondition, Continuation continuation, int i) {
        if ((i & 1) != 0) {
            refetchCondition = RefetchCondition.None.INSTANCE;
        }
        return getOrFetchSync.invoke(refetchCondition, false, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(13:5|6|7|(1:(1:10)(2:38|39))(2:40|(1:42))|11|12|13|(4:15|(2:17|(1:19)(2:20|21))|33|21)(1:34)|22|23|(1:25)|26|(2:28|29)(1:31)))|43|6|7|(0)(0)|11|12|13|(0)(0)|22|23|(0)|26|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ad, code lost:
    
        r2 = kotlin.Result.Companion;
        r0 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075 A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:13:0x0069, B:15:0x0075, B:17:0x008f, B:20:0x0098, B:21:0x00a0, B:22:0x00a8), top: B:12:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(RefetchCondition refetchCondition, boolean z, Continuation continuation) {
        GetOrFetchSync$invoke$1 getOrFetchSync$invoke$1;
        int i;
        Object failure;
        String string2;
        boolean z2;
        String str;
        GetOrFetchSync getOrFetchSync = this;
        if (continuation instanceof GetOrFetchSync$invoke$1) {
            getOrFetchSync$invoke$1 = (GetOrFetchSync$invoke$1) continuation;
            int i2 = getOrFetchSync$invoke$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                getOrFetchSync$invoke$1.label = i2 - PKIFailureInfo.systemUnavail;
                GetOrFetchSync$invoke$1 getOrFetchSync$invoke$12 = getOrFetchSync$invoke$1;
                Object obj = getOrFetchSync$invoke$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getOrFetchSync$invoke$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str2 = getOrFetchSync.configuration.financialConnectionsSessionClientSecret;
                    ScannerView.AnonymousClass3 anonymousClass3 = new ScannerView.AnonymousClass3(1, refetchCondition, RefetchCondition.class, "shouldReFetch", "shouldReFetch(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)Z", 0, 27);
                    getOrFetchSync$invoke$12.L$1 = getOrFetchSync;
                    getOrFetchSync$invoke$12.label = 1;
                    obj = getOrFetchSync.repository.getOrSynchronizeFinancialConnectionsSession(str2, getOrFetchSync.applicationId, z, anonymousClass3, getOrFetchSync$invoke$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    getOrFetchSync = getOrFetchSync$invoke$12.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                SynchronizeSessionResponse synchronizeSessionResponse = (SynchronizeSessionResponse) obj;
                AppPreferenceStore appPreferenceStore = getOrFetchSync.debugConfiguration;
                appPreferenceStore.getClass();
                Result.Companion companion = Result.Companion;
                string2 = appPreferenceStore.mPreferences.getString("json", null);
                if (string2 == null) {
                    JsonElement jsonElement = (JsonElement) ((JsonObject) Json.Default.decodeFromString(string2, JsonObject.Companion.serializer())).get("force_onelink");
                    if (jsonElement != null) {
                        JsonPrimitive jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement);
                        if (!(jsonPrimitive instanceof JsonNull)) {
                            str = jsonPrimitive.getContent();
                            z2 = Intrinsics.areEqual(str, "true");
                        }
                    }
                    str = null;
                    z2 = Intrinsics.areEqual(str, "true");
                } else {
                    z2 = false;
                }
                failure = Boolean.valueOf(z2);
                Object obj2 = Boolean.FALSE;
                if (failure instanceof Result.Failure) {
                    failure = obj2;
                }
                return !((Boolean) failure).booleanValue() ? SynchronizeSessionResponse.copy$default(synchronizeSessionResponse, FinancialConnectionsSessionManifest.copy$default(synchronizeSessionResponse.manifest, null, null, LinkBrand.Onelink, -1, 8191), null, 6) : synchronizeSessionResponse;
            }
        }
        getOrFetchSync$invoke$1 = new GetOrFetchSync$invoke$1(getOrFetchSync, continuation);
        GetOrFetchSync$invoke$1 getOrFetchSync$invoke$122 = getOrFetchSync$invoke$1;
        Object obj3 = getOrFetchSync$invoke$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getOrFetchSync$invoke$122.label;
        if (i != 0) {
        }
        SynchronizeSessionResponse synchronizeSessionResponse2 = (SynchronizeSessionResponse) obj3;
        AppPreferenceStore appPreferenceStore2 = getOrFetchSync.debugConfiguration;
        appPreferenceStore2.getClass();
        Result.Companion companion2 = Result.Companion;
        string2 = appPreferenceStore2.mPreferences.getString("json", null);
        if (string2 == null) {
        }
        failure = Boolean.valueOf(z2);
        Object obj22 = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
        }
        if (!((Boolean) failure).booleanValue()) {
        }
    }
}
