package com.stripe.android.financialconnections.domain;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class CancelAuthorizationSession {
    public final /* synthetic */ int $r8$classId;
    public final FinancialConnectionsSheetConfiguration configuration;
    public final NativeAuthFlowCoordinator coordinator;
    public final FinancialConnectionsManifestRepositoryImpl repository;

    public CancelAuthorizationSession(NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, int i) {
        this.$r8$classId = i;
        nativeAuthFlowCoordinator.getClass();
        financialConnectionsManifestRepositoryImpl.getClass();
        financialConnectionsSheetConfiguration.getClass();
        switch (i) {
            case 1:
                this.coordinator = nativeAuthFlowCoordinator;
                this.repository = financialConnectionsManifestRepositoryImpl;
                this.configuration = financialConnectionsSheetConfiguration;
                break;
            case 2:
                this.coordinator = nativeAuthFlowCoordinator;
                this.repository = financialConnectionsManifestRepositoryImpl;
                this.configuration = financialConnectionsSheetConfiguration;
                break;
            default:
                this.coordinator = nativeAuthFlowCoordinator;
                this.repository = financialConnectionsManifestRepositoryImpl;
                this.configuration = financialConnectionsSheetConfiguration;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r12 == r14) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
    
        if (r12 == r14) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(String str, ContinuationImpl continuationImpl) {
        CancelAuthorizationSession$invoke$1 cancelAuthorizationSession$invoke$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        SharedFlowImpl sharedFlowImpl;
        RetrieveAuthorizationSession$invoke$1 retrieveAuthorizationSession$invoke$1;
        CoroutineSingletons coroutineSingletons2;
        int i2;
        SharedFlowImpl sharedFlowImpl2;
        int i3 = this.$r8$classId;
        NativeAuthFlowCoordinator.Message.ClearPartnerWebAuth clearPartnerWebAuth = NativeAuthFlowCoordinator.Message.ClearPartnerWebAuth.INSTANCE;
        NativeAuthFlowCoordinator nativeAuthFlowCoordinator = this.coordinator;
        FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration = this.configuration;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl = this.repository;
        switch (i3) {
            case 0:
                if (continuationImpl instanceof CancelAuthorizationSession$invoke$1) {
                    cancelAuthorizationSession$invoke$1 = (CancelAuthorizationSession$invoke$1) continuationImpl;
                    int i4 = cancelAuthorizationSession$invoke$1.label;
                    if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                        cancelAuthorizationSession$invoke$1.label = i4 - PKIFailureInfo.systemUnavail;
                        Object obj = cancelAuthorizationSession$invoke$1.result;
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = cancelAuthorizationSession$invoke$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            String str2 = financialConnectionsSheetConfiguration.financialConnectionsSessionClientSecret;
                            cancelAuthorizationSession$invoke$1.label = 1;
                            obj = financialConnectionsManifestRepositoryImpl.cancelAuthorizationSession(str2, str, cancelAuthorizationSession$invoke$1);
                            break;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                Object obj2 = cancelAuthorizationSession$invoke$1.L$1;
                                SafeTrace.throwOnFailure(obj);
                                return obj2;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        Object obj3 = obj;
                        sharedFlowImpl = nativeAuthFlowCoordinator.flow;
                        cancelAuthorizationSession$invoke$1.L$1 = obj3;
                        cancelAuthorizationSession$invoke$1.label = 2;
                        if (sharedFlowImpl.emit(clearPartnerWebAuth, cancelAuthorizationSession$invoke$1) != coroutineSingletons) {
                            return obj3;
                        }
                        return coroutineSingletons;
                    }
                }
                cancelAuthorizationSession$invoke$1 = new CancelAuthorizationSession$invoke$1(this, continuationImpl);
                Object obj4 = cancelAuthorizationSession$invoke$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cancelAuthorizationSession$invoke$1.label;
                if (i != 0) {
                }
                Object obj32 = obj4;
                sharedFlowImpl = nativeAuthFlowCoordinator.flow;
                cancelAuthorizationSession$invoke$1.L$1 = obj32;
                cancelAuthorizationSession$invoke$1.label = 2;
                if (sharedFlowImpl.emit(clearPartnerWebAuth, cancelAuthorizationSession$invoke$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            default:
                if (continuationImpl instanceof RetrieveAuthorizationSession$invoke$1) {
                    retrieveAuthorizationSession$invoke$1 = (RetrieveAuthorizationSession$invoke$1) continuationImpl;
                    int i5 = retrieveAuthorizationSession$invoke$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        retrieveAuthorizationSession$invoke$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj5 = retrieveAuthorizationSession$invoke$1.result;
                        coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = retrieveAuthorizationSession$invoke$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            String str3 = financialConnectionsSheetConfiguration.financialConnectionsSessionClientSecret;
                            retrieveAuthorizationSession$invoke$1.label = 1;
                            obj5 = financialConnectionsManifestRepositoryImpl.retrieveAuthorizationSession(str3, str, retrieveAuthorizationSession$invoke$1);
                            break;
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                Object obj6 = retrieveAuthorizationSession$invoke$1.L$1;
                                SafeTrace.throwOnFailure(obj5);
                                return obj6;
                            }
                            SafeTrace.throwOnFailure(obj5);
                        }
                        Object obj7 = obj5;
                        sharedFlowImpl2 = nativeAuthFlowCoordinator.flow;
                        retrieveAuthorizationSession$invoke$1.L$1 = obj7;
                        retrieveAuthorizationSession$invoke$1.label = 2;
                        if (sharedFlowImpl2.emit(clearPartnerWebAuth, retrieveAuthorizationSession$invoke$1) != coroutineSingletons2) {
                            return obj7;
                        }
                        return coroutineSingletons2;
                    }
                }
                retrieveAuthorizationSession$invoke$1 = new RetrieveAuthorizationSession$invoke$1(this, continuationImpl);
                Object obj52 = retrieveAuthorizationSession$invoke$1.result;
                coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = retrieveAuthorizationSession$invoke$1.label;
                if (i2 != 0) {
                }
                Object obj72 = obj52;
                sharedFlowImpl2 = nativeAuthFlowCoordinator.flow;
                retrieveAuthorizationSession$invoke$1.L$1 = obj72;
                retrieveAuthorizationSession$invoke$1.label = 2;
                if (sharedFlowImpl2.emit(clearPartnerWebAuth, retrieveAuthorizationSession$invoke$1) != coroutineSingletons2) {
                }
                return coroutineSingletons2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(String str, String str2, ContinuationImpl continuationImpl) {
        CompleteAuthorizationSession$invoke$1 completeAuthorizationSession$invoke$1;
        int i;
        if (continuationImpl instanceof CompleteAuthorizationSession$invoke$1) {
            completeAuthorizationSession$invoke$1 = (CompleteAuthorizationSession$invoke$1) continuationImpl;
            int i2 = completeAuthorizationSession$invoke$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                completeAuthorizationSession$invoke$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = completeAuthorizationSession$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = completeAuthorizationSession$invoke$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str3 = this.configuration.financialConnectionsSessionClientSecret;
                    completeAuthorizationSession$invoke$1.label = 1;
                    obj = this.repository.completeAuthorizationSession(str3, str, str2, completeAuthorizationSession$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj2 = completeAuthorizationSession$invoke$1.L$2;
                        SafeTrace.throwOnFailure(obj);
                        return obj2;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                SharedFlowImpl sharedFlowImpl = this.coordinator.flow;
                completeAuthorizationSession$invoke$1.L$2 = obj;
                completeAuthorizationSession$invoke$1.label = 2;
                return sharedFlowImpl.emit(NativeAuthFlowCoordinator.Message.ClearPartnerWebAuth.INSTANCE, completeAuthorizationSession$invoke$1) != coroutineSingletons ? coroutineSingletons : obj;
            }
        }
        completeAuthorizationSession$invoke$1 = new CompleteAuthorizationSession$invoke$1(this, continuationImpl);
        Object obj3 = completeAuthorizationSession$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = completeAuthorizationSession$invoke$1.label;
        if (i != 0) {
        }
        SharedFlowImpl sharedFlowImpl2 = this.coordinator.flow;
        completeAuthorizationSession$invoke$1.L$2 = obj3;
        completeAuthorizationSession$invoke$1.label = 2;
        if (sharedFlowImpl2.emit(NativeAuthFlowCoordinator.Message.ClearPartnerWebAuth.INSTANCE, completeAuthorizationSession$invoke$1) != coroutineSingletons2) {
        }
    }
}
