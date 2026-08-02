package com.squareup.cash.threedsdataonly.backend.real;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.netcetera.threeds.sdk.api.ThreeDS2Service;
import com.netcetera.threeds.sdk.api.transaction.AuthenticationRequestParameters;
import com.netcetera.threeds.sdk.api.transaction.Transaction;
import com.squareup.cash.cdf.threeds.ThreeDsAuthenticationCreateAuthenticationParams;
import com.squareup.cash.cdf.threeds.ThreeDsAuthenticationSdkFailure;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.threedsdataonly.backend.api.SdkNotInitializedException;
import com.squareup.cash.threedsdataonly.backend.api.Transaction$AuthenticationRequestParameters;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.cash3dsauthentication.api.v1.GetThreeDsEligibleInstrumentsInfoRequest;
import com.squareup.protos.cash.cash3dsauthentication.api.v1.GetThreeDsEligibleInstrumentsInfoResponse;
import com.squareup.protos.cash.cash3dsauthentication.api.v1.ThreeDsAuthenticationService;
import com.squareup.protos.franklin.common.RequestContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.MutexImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealThreeDsAuthenticationManager {
    public final Analytics analytics;
    public boolean cacheInvalidated;
    public final AndroidClock clock;
    public final CoroutineContext ioDispatcher;
    public long lastCreatedTimestamp;
    public final ThreeDsAuthenticationService threeDsAuthenticationService;
    public final RealThreeDsService threeDsService;
    public final MutexImpl mutex = new MutexImpl();
    public final LinkedHashMap transactionAuthParams = new LinkedHashMap();

    /* loaded from: classes7.dex */
    public final class TransactionParameters {
        public final ArrayList instrumentInfo;
        public final String ipAddress;
        public final String messageVersion;

        public final class InstrumentInfo {
            public final String directoryServerId;

            public InstrumentInfo(String str) {
                str.getClass();
                this.directoryServerId = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InstrumentInfo) && Intrinsics.areEqual(this.directoryServerId, ((InstrumentInfo) obj).directoryServerId);
            }

            public final int hashCode() {
                return this.directoryServerId.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InstrumentInfo(directoryServerId=", this.directoryServerId, ")");
            }
        }

        public TransactionParameters(String str, String str2, ArrayList arrayList) {
            str.getClass();
            this.instrumentInfo = arrayList;
            this.messageVersion = str;
            this.ipAddress = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransactionParameters)) {
                return false;
            }
            TransactionParameters transactionParameters = (TransactionParameters) obj;
            return this.instrumentInfo.equals(transactionParameters.instrumentInfo) && Intrinsics.areEqual(this.messageVersion, transactionParameters.messageVersion) && Intrinsics.areEqual(this.ipAddress, transactionParameters.ipAddress);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.instrumentInfo.hashCode() * 31, 31, this.messageVersion);
            String str = this.ipAddress;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TransactionParameters(instrumentInfo=");
            sb.append(this.instrumentInfo);
            sb.append(", messageVersion=");
            sb.append(this.messageVersion);
            sb.append(", ipAddress=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.ipAddress, ")");
        }
    }

    public RealThreeDsAuthenticationManager(RealThreeDsService realThreeDsService, ThreeDsAuthenticationService threeDsAuthenticationService, AndroidClock androidClock, Analytics analytics, CoroutineContext coroutineContext) {
        this.threeDsService = realThreeDsService;
        this.threeDsAuthenticationService = threeDsAuthenticationService;
        this.clock = androidClock;
        this.analytics = analytics;
        this.ioDispatcher = coroutineContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$getTransactionParameters(RealThreeDsAuthenticationManager realThreeDsAuthenticationManager, ContinuationImpl continuationImpl) {
        RealThreeDsAuthenticationManager$getTransactionParameters$1 realThreeDsAuthenticationManager$getTransactionParameters$1;
        int i;
        ApiResult apiResult;
        realThreeDsAuthenticationManager.getClass();
        if (continuationImpl instanceof RealThreeDsAuthenticationManager$getTransactionParameters$1) {
            realThreeDsAuthenticationManager$getTransactionParameters$1 = (RealThreeDsAuthenticationManager$getTransactionParameters$1) continuationImpl;
            int i2 = realThreeDsAuthenticationManager$getTransactionParameters$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realThreeDsAuthenticationManager$getTransactionParameters$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realThreeDsAuthenticationManager$getTransactionParameters$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realThreeDsAuthenticationManager$getTransactionParameters$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ThreeDsAuthenticationService threeDsAuthenticationService = realThreeDsAuthenticationManager.threeDsAuthenticationService;
                    GetThreeDsEligibleInstrumentsInfoRequest getThreeDsEligibleInstrumentsInfoRequest = new GetThreeDsEligibleInstrumentsInfoRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), ByteString.EMPTY);
                    realThreeDsAuthenticationManager$getTransactionParameters$1.label = 1;
                    obj = threeDsAuthenticationService.getThreeDsEligibleInstrumentsInfo(getThreeDsEligibleInstrumentsInfoRequest, realThreeDsAuthenticationManager$getTransactionParameters$1);
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
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    return null;
                }
                if (!(apiResult instanceof ApiResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                GetThreeDsEligibleInstrumentsInfoResponse getThreeDsEligibleInstrumentsInfoResponse = (GetThreeDsEligibleInstrumentsInfoResponse) ((ApiResult.Success) apiResult).response;
                String str = getThreeDsEligibleInstrumentsInfoResponse.ip_address;
                String str2 = getThreeDsEligibleInstrumentsInfoResponse.message_version;
                str2.getClass();
                List list = getThreeDsEligibleInstrumentsInfoResponse.instrument_info_list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str3 = ((GetThreeDsEligibleInstrumentsInfoResponse.InstrumentInfo) it.next()).directory_server_id;
                    str3.getClass();
                    arrayList.add(new TransactionParameters.InstrumentInfo(str3));
                }
                return new TransactionParameters(str2, str, arrayList);
            }
        }
        realThreeDsAuthenticationManager$getTransactionParameters$1 = new RealThreeDsAuthenticationManager$getTransactionParameters$1(realThreeDsAuthenticationManager, continuationImpl);
        Object obj2 = realThreeDsAuthenticationManager$getTransactionParameters$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realThreeDsAuthenticationManager$getTransactionParameters$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createTransactionAuthenticationParams(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        RealThreeDsAuthenticationManager$createTransactionAuthenticationParams$1 realThreeDsAuthenticationManager$createTransactionAuthenticationParams$1;
        int i;
        Analytics analytics;
        final Transaction createTransaction;
        try {
            if (continuationImpl instanceof RealThreeDsAuthenticationManager$createTransactionAuthenticationParams$1) {
                realThreeDsAuthenticationManager$createTransactionAuthenticationParams$1 = (RealThreeDsAuthenticationManager$createTransactionAuthenticationParams$1) continuationImpl;
                int i2 = realThreeDsAuthenticationManager$createTransactionAuthenticationParams$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realThreeDsAuthenticationManager$createTransactionAuthenticationParams$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realThreeDsAuthenticationManager$createTransactionAuthenticationParams$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realThreeDsAuthenticationManager$createTransactionAuthenticationParams$1.label;
                    analytics = this.analytics;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        Timber.Forest forest = Timber.Forest;
                        forest.tag("3DS-auth-manager");
                        StringBuilder sb = new StringBuilder("Creating transaction authentication params for [directoryServerId: ");
                        sb.append(str);
                        sb.append(", messageVersion: ");
                        forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, str2, "]"), new Object[0]);
                        analytics.track(new ThreeDsAuthenticationCreateAuthenticationParams(str4), null);
                        final RealThreeDsService realThreeDsService = this.threeDsService;
                        realThreeDsAuthenticationManager$createTransactionAuthenticationParams$1.L$3 = str4;
                        realThreeDsAuthenticationManager$createTransactionAuthenticationParams$1.label = 1;
                        try {
                            ThreeDS2Service threeDS2Service = realThreeDsService.threeDsService;
                            if (threeDS2Service == null || (createTransaction = threeDS2Service.createTransaction(str, str2, MapsKt__MapsJVMKt.mapOf(new Pair("public_ip_address", str3)))) == null) {
                                throw new SdkNotInitializedException("3DS SDK not initialized when creating transaction", null);
                            }
                            obj = new Object(realThreeDsService, createTransaction) { // from class: com.squareup.cash.threedsdataonly.backend.real.RealThreeDsService$asCashType$1
                                public final /* synthetic */ Transaction $this_asCashType;

                                {
                                    this.$this_asCashType = createTransaction;
                                }

                                public final Transaction$AuthenticationRequestParameters authenticationRequestParameters() {
                                    AuthenticationRequestParameters authenticationRequestParameters = this.$this_asCashType.getAuthenticationRequestParameters();
                                    authenticationRequestParameters.getClass();
                                    String sDKAppID = authenticationRequestParameters.getSDKAppID();
                                    sDKAppID.getClass();
                                    String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID();
                                    sDKTransactionID.getClass();
                                    String sDKEphemeralPublicKey = authenticationRequestParameters.getSDKEphemeralPublicKey();
                                    sDKEphemeralPublicKey.getClass();
                                    String sDKReferenceNumber = authenticationRequestParameters.getSDKReferenceNumber();
                                    sDKReferenceNumber.getClass();
                                    String messageVersion = authenticationRequestParameters.getMessageVersion();
                                    messageVersion.getClass();
                                    String deviceData = authenticationRequestParameters.getDeviceData();
                                    deviceData.getClass();
                                    return new Transaction$AuthenticationRequestParameters(sDKAppID, sDKTransactionID, sDKEphemeralPublicKey, sDKReferenceNumber, messageVersion, deviceData);
                                }
                            };
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } catch (Exception e) {
                            throw RealThreeDsService.asCashType(e);
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        String str5 = realThreeDsAuthenticationManager$createTransactionAuthenticationParams$1.L$3;
                        SafeTrace.throwOnFailure(obj);
                    }
                    return ((RealThreeDsService$asCashType$1) obj).authenticationRequestParameters();
                }
            }
            if (i != 0) {
            }
            return ((RealThreeDsService$asCashType$1) obj).authenticationRequestParameters();
        } catch (Exception e2) {
            Timber.Forest forest2 = Timber.Forest;
            forest2.tag("3DS-auth-manager");
            forest2.e("Failed to create 3DS SDK authentication authentication params", new Object[0], e2);
            analytics.track(new ThreeDsAuthenticationSdkFailure(str4, e2.getMessage()), null);
            return null;
        }
        realThreeDsAuthenticationManager$createTransactionAuthenticationParams$1 = new RealThreeDsAuthenticationManager$createTransactionAuthenticationParams$1(this, continuationImpl);
        Object obj2 = realThreeDsAuthenticationManager$createTransactionAuthenticationParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realThreeDsAuthenticationManager$createTransactionAuthenticationParams$1.label;
        analytics = this.analytics;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062 A[Catch: all -> 0x007f, TRY_ENTER, TryCatch #0 {all -> 0x007f, blocks: (B:11:0x004a, B:17:0x0062, B:22:0x0081, B:24:0x008b), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:11:0x004a, B:17:0x0062, B:22:0x0081, B:24:0x008b), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getTransactionAuthenticationParams(String str, ContinuationImpl continuationImpl) {
        RealThreeDsAuthenticationManager$getTransactionAuthenticationParams$1 realThreeDsAuthenticationManager$getTransactionAuthenticationParams$1;
        int i;
        MutexImpl mutexImpl;
        Transaction$AuthenticationRequestParameters transaction$AuthenticationRequestParameters;
        try {
            if (continuationImpl instanceof RealThreeDsAuthenticationManager$getTransactionAuthenticationParams$1) {
                realThreeDsAuthenticationManager$getTransactionAuthenticationParams$1 = (RealThreeDsAuthenticationManager$getTransactionAuthenticationParams$1) continuationImpl;
                int i2 = realThreeDsAuthenticationManager$getTransactionAuthenticationParams$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realThreeDsAuthenticationManager$getTransactionAuthenticationParams$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realThreeDsAuthenticationManager$getTransactionAuthenticationParams$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realThreeDsAuthenticationManager$getTransactionAuthenticationParams$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        realThreeDsAuthenticationManager$getTransactionAuthenticationParams$1.L$0 = str;
                        mutexImpl = this.mutex;
                        realThreeDsAuthenticationManager$getTransactionAuthenticationParams$1.L$1 = mutexImpl;
                        realThreeDsAuthenticationManager$getTransactionAuthenticationParams$1.label = 1;
                        if (mutexImpl.lock(realThreeDsAuthenticationManager$getTransactionAuthenticationParams$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        MutexImpl mutexImpl2 = realThreeDsAuthenticationManager$getTransactionAuthenticationParams$1.L$1;
                        String str2 = realThreeDsAuthenticationManager$getTransactionAuthenticationParams$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = mutexImpl2;
                        str = str2;
                    }
                    if (this.clock.elapsedRealtime() - this.lastCreatedTimestamp >= 1800000) {
                        Timber.Forest forest = Timber.Forest;
                        forest.tag("3DS-auth-manager");
                        forest.d("Cache expired for directoryServerId: " + str + ", returning null", new Object[0]);
                    } else {
                        transaction$AuthenticationRequestParameters = (Transaction$AuthenticationRequestParameters) this.transactionAuthParams.remove(str);
                        if (transaction$AuthenticationRequestParameters != null) {
                            Timber.Forest forest2 = Timber.Forest;
                            forest2.tag("3DS-auth-manager");
                            forest2.d("Cache hit for authentication params for directoryServerId: " + str + ", removing from cache and invalidating", new Object[0]);
                            this.cacheInvalidated = true;
                            return transaction$AuthenticationRequestParameters;
                        }
                    }
                    transaction$AuthenticationRequestParameters = null;
                    return transaction$AuthenticationRequestParameters;
                }
            }
            if (this.clock.elapsedRealtime() - this.lastCreatedTimestamp >= 1800000) {
            }
            transaction$AuthenticationRequestParameters = null;
            return transaction$AuthenticationRequestParameters;
        } finally {
            mutexImpl.unlock(null);
        }
        realThreeDsAuthenticationManager$getTransactionAuthenticationParams$1 = new RealThreeDsAuthenticationManager$getTransactionAuthenticationParams$1(this, continuationImpl);
        Object obj2 = realThreeDsAuthenticationManager$getTransactionAuthenticationParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realThreeDsAuthenticationManager$getTransactionAuthenticationParams$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invalidateCache(ContinuationImpl continuationImpl) {
        RealThreeDsAuthenticationManager$invalidateCache$1 realThreeDsAuthenticationManager$invalidateCache$1;
        int i;
        MutexImpl mutexImpl;
        try {
            if (continuationImpl instanceof RealThreeDsAuthenticationManager$invalidateCache$1) {
                realThreeDsAuthenticationManager$invalidateCache$1 = (RealThreeDsAuthenticationManager$invalidateCache$1) continuationImpl;
                int i2 = realThreeDsAuthenticationManager$invalidateCache$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realThreeDsAuthenticationManager$invalidateCache$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realThreeDsAuthenticationManager$invalidateCache$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realThreeDsAuthenticationManager$invalidateCache$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        MutexImpl mutexImpl2 = this.mutex;
                        realThreeDsAuthenticationManager$invalidateCache$1.L$0 = mutexImpl2;
                        realThreeDsAuthenticationManager$invalidateCache$1.label = 1;
                        if (mutexImpl2.lock(realThreeDsAuthenticationManager$invalidateCache$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        mutexImpl = mutexImpl2;
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutexImpl = realThreeDsAuthenticationManager$invalidateCache$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    Timber.Forest forest = Timber.Forest;
                    forest.tag("3DS-auth-manager");
                    forest.d("Cache invalidated", new Object[0]);
                    this.cacheInvalidated = true;
                    mutexImpl.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            Timber.Forest forest2 = Timber.Forest;
            forest2.tag("3DS-auth-manager");
            forest2.d("Cache invalidated", new Object[0]);
            this.cacheInvalidated = true;
            mutexImpl.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutexImpl.unlock(null);
            throw th;
        }
        realThreeDsAuthenticationManager$invalidateCache$1 = new RealThreeDsAuthenticationManager$invalidateCache$1(this, continuationImpl);
        Object obj2 = realThreeDsAuthenticationManager$invalidateCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realThreeDsAuthenticationManager$invalidateCache$1.label;
        if (i != 0) {
        }
    }
}
