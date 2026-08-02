package com.squareup.cash.work.webview.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.work.service.api.LoginEssentialsService;
import com.squareup.cash.work.service.api.MultipassService;
import com.squareup.cash.work.service.api.PayrollWebService;
import com.squareup.cash.work.tinygraph.EntityStore;
import com.squareup.cash.work.tinygraph.real.RealLoginEssentialsRepository;
import com.squareup.cash.work.webview.presenters.OtkRedirectUseCaseState;
import com.squareup.protos.franklin.ui.UiCashLimits;
import com.squareup.protos.multipass.service.ClientCredentials;
import com.squareup.protos.multipass.service.CreateOtkRequest;
import com.squareup.protos.multipass.service.CreateOtkResponse;
import com.squareup.protos.multipass.service.OneTimeKey;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okhttp3.Response;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class OtkRedirectUseCase {
    public final MultipassService multipassService;
    public final PayrollWebService payrollWebService;

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider multipassService;
        public final DoubleCheck payrollWebService;

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, int i) {
            this.$r8$classId = i;
            this.payrollWebService = doubleCheck;
            this.multipassService = doubleCheck2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.multipassService;
            DoubleCheck doubleCheck = this.payrollWebService;
            switch (i) {
                case 0:
                    PayrollWebService payrollWebService = (PayrollWebService) doubleCheck.getValue();
                    MultipassService multipassService = (MultipassService) provider.invoke();
                    payrollWebService.getClass();
                    multipassService.getClass();
                    return new OtkRedirectUseCase(payrollWebService, multipassService);
                default:
                    LoginEssentialsService loginEssentialsService = (LoginEssentialsService) doubleCheck.getValue();
                    EntityStore entityStore = (EntityStore) provider.invoke();
                    loginEssentialsService.getClass();
                    entityStore.getClass();
                    return new RealLoginEssentialsRepository(loginEssentialsService, entityStore);
            }
        }
    }

    public OtkRedirectUseCase(PayrollWebService payrollWebService, MultipassService multipassService) {
        this.payrollWebService = payrollWebService;
        this.multipassService = multipassService;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(1:(3:12|13|14)(2:24|25))(9:26|27|28|(1:30)|16|17|18|(1:20)|21))(2:33|34))(4:42|(2:44|(2:46|32))|38|(2:40|32)(8:41|28|(0)|16|17|18|(0)|21))|35|(5:37|17|18|(0)|21)|38|(0)(0)))|48|6|7|(0)(0)|35|(0)|38|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0098, code lost:
    
        if (((java.lang.Boolean) r13).booleanValue() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        if (r13 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083 A[Catch: Exception -> 0x009b, TryCatch #0 {Exception -> 0x009b, blocks: (B:13:0x0030, B:14:0x0092, B:27:0x0040, B:28:0x007d, B:30:0x0083, B:34:0x004a, B:35:0x0062, B:38:0x006b, B:44:0x0053), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object refreshCookie$suspendImpl(OtkRedirectUseCase otkRedirectUseCase, String str, boolean z, ContinuationImpl continuationImpl) {
        OtkRedirectUseCase$refreshCookie$1 otkRedirectUseCase$refreshCookie$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        OtkRedirectUseCase otkRedirectUseCase2;
        boolean z2;
        String str2;
        if (continuationImpl instanceof OtkRedirectUseCase$refreshCookie$1) {
            otkRedirectUseCase$refreshCookie$1 = (OtkRedirectUseCase$refreshCookie$1) continuationImpl;
            int i2 = otkRedirectUseCase$refreshCookie$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                otkRedirectUseCase$refreshCookie$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = otkRedirectUseCase$refreshCookie$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = otkRedirectUseCase$refreshCookie$1.label;
                OtkRedirectUseCaseState otkRedirectUseCaseState = OtkRedirectUseCaseState.Ready.INSTANCE;
                OtkRedirectUseCaseState otkRedirectUseCaseState2 = OtkRedirectUseCaseState.Failed.INSTANCE;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!z) {
                        otkRedirectUseCase$refreshCookie$1.L$0 = otkRedirectUseCase;
                        otkRedirectUseCase$refreshCookie$1.L$1 = str;
                        otkRedirectUseCase$refreshCookie$1.Z$0 = z;
                        otkRedirectUseCase$refreshCookie$1.label = 1;
                        obj = otkRedirectUseCase.isCookieValid(otkRedirectUseCase$refreshCookie$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    otkRedirectUseCase$refreshCookie$1.L$0 = otkRedirectUseCase;
                    otkRedirectUseCase$refreshCookie$1.L$1 = str;
                    otkRedirectUseCase$refreshCookie$1.Z$0 = z;
                    otkRedirectUseCase$refreshCookie$1.label = 2;
                    obj = otkRedirectUseCase.getOneTimeKey(otkRedirectUseCase$refreshCookie$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    boolean z3 = z;
                    otkRedirectUseCase2 = otkRedirectUseCase;
                    z2 = z3;
                    str2 = (String) obj;
                    if (str2 != null) {
                    }
                    otkRedirectUseCaseState = otkRedirectUseCaseState2;
                    otkRedirectUseCaseState2 = otkRedirectUseCaseState;
                    if (otkRedirectUseCaseState2 instanceof OtkRedirectUseCaseState.Failed) {
                    }
                    return otkRedirectUseCaseState2;
                }
                if (i == 1) {
                    z = otkRedirectUseCase$refreshCookie$1.Z$0;
                    str = otkRedirectUseCase$refreshCookie$1.L$1;
                    otkRedirectUseCase = otkRedirectUseCase$refreshCookie$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i == 2) {
                        z2 = otkRedirectUseCase$refreshCookie$1.Z$0;
                        str = otkRedirectUseCase$refreshCookie$1.L$1;
                        otkRedirectUseCase2 = otkRedirectUseCase$refreshCookie$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        str2 = (String) obj;
                        if (str2 != null) {
                            otkRedirectUseCase$refreshCookie$1.L$0 = null;
                            otkRedirectUseCase$refreshCookie$1.L$1 = str;
                            otkRedirectUseCase$refreshCookie$1.Z$0 = z2;
                            otkRedirectUseCase$refreshCookie$1.label = 3;
                            obj = otkRedirectUseCase2.doOtkRedirect(str2, str, otkRedirectUseCase$refreshCookie$1);
                        }
                        otkRedirectUseCaseState = otkRedirectUseCaseState2;
                        otkRedirectUseCaseState2 = otkRedirectUseCaseState;
                        if (otkRedirectUseCaseState2 instanceof OtkRedirectUseCaseState.Failed) {
                            Timber.Forest.w(Recorder$$ExternalSyntheticOutline2.m("OTK refresh failed for merchantToken: ", str), new Object[0]);
                        }
                        return otkRedirectUseCaseState2;
                    }
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = otkRedirectUseCase$refreshCookie$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    otkRedirectUseCaseState2 = otkRedirectUseCaseState;
                    if (otkRedirectUseCaseState2 instanceof OtkRedirectUseCaseState.Failed) {
                    }
                    return otkRedirectUseCaseState2;
                }
                otkRedirectUseCase$refreshCookie$1.L$0 = otkRedirectUseCase;
                otkRedirectUseCase$refreshCookie$1.L$1 = str;
                otkRedirectUseCase$refreshCookie$1.Z$0 = z;
                otkRedirectUseCase$refreshCookie$1.label = 2;
                obj = otkRedirectUseCase.getOneTimeKey(otkRedirectUseCase$refreshCookie$1);
                if (obj == coroutineSingletons) {
                }
            }
        }
        otkRedirectUseCase$refreshCookie$1 = new OtkRedirectUseCase$refreshCookie$1(otkRedirectUseCase, continuationImpl);
        obj = otkRedirectUseCase$refreshCookie$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = otkRedirectUseCase$refreshCookie$1.label;
        OtkRedirectUseCaseState otkRedirectUseCaseState3 = OtkRedirectUseCaseState.Ready.INSTANCE;
        OtkRedirectUseCaseState otkRedirectUseCaseState22 = OtkRedirectUseCaseState.Failed.INSTANCE;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        otkRedirectUseCase$refreshCookie$1.L$0 = otkRedirectUseCase;
        otkRedirectUseCase$refreshCookie$1.L$1 = str;
        otkRedirectUseCase$refreshCookie$1.Z$0 = z;
        otkRedirectUseCase$refreshCookie$1.label = 2;
        obj = otkRedirectUseCase.getOneTimeKey(otkRedirectUseCase$refreshCookie$1);
        if (obj == coroutineSingletons) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:21|22))(3:23|24|(1:26))|11|(2:13|14)|20|16|17))|29|6|7|(0)(0)|11|(0)|20|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (r6.code == 302) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        timber.log.Timber.Forest.w("Failed to doOtkRedirect", new java.lang.Object[0], r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058 A[Catch: IOException -> 0x002a, TRY_LEAVE, TryCatch #0 {IOException -> 0x002a, blocks: (B:10:0x0026, B:11:0x004d, B:13:0x0058, B:24:0x0036), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doOtkRedirect(String str, String str2, ContinuationImpl continuationImpl) {
        OtkRedirectUseCase$doOtkRedirect$1 otkRedirectUseCase$doOtkRedirect$1;
        int i;
        Response response;
        if (continuationImpl instanceof OtkRedirectUseCase$doOtkRedirect$1) {
            otkRedirectUseCase$doOtkRedirect$1 = (OtkRedirectUseCase$doOtkRedirect$1) continuationImpl;
            int i2 = otkRedirectUseCase$doOtkRedirect$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                otkRedirectUseCase$doOtkRedirect$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = otkRedirectUseCase$doOtkRedirect$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = otkRedirectUseCase$doOtkRedirect$1.label;
                boolean z = false;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    PayrollWebService payrollWebService = this.payrollWebService;
                    otkRedirectUseCase$doOtkRedirect$1.label = 1;
                    obj = payrollWebService.doOtkRedirect("https://app.squareupstaging.com/session/otk/" + str, str2, otkRedirectUseCase$doOtkRedirect$1);
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
                retrofit2.Response response2 = (retrofit2.Response) obj;
                response2.getClass();
                response = response2.rawResponse;
                if (!response.isSuccessful) {
                }
                z = true;
                return Boolean.valueOf(z);
            }
        }
        otkRedirectUseCase$doOtkRedirect$1 = new OtkRedirectUseCase$doOtkRedirect$1(this, continuationImpl);
        Object obj2 = otkRedirectUseCase$doOtkRedirect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = otkRedirectUseCase$doOtkRedirect$1.label;
        boolean z2 = false;
        if (i != 0) {
        }
        retrofit2.Response response22 = (retrofit2.Response) obj2;
        response22.getClass();
        response = response22.rawResponse;
        if (!response.isSuccessful) {
        }
        z2 = true;
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:10:0x0027, B:11:0x0055, B:13:0x005b, B:15:0x0065, B:17:0x0069, B:21:0x006f, B:23:0x0073, B:25:0x0087, B:26:0x008c, B:30:0x0036), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:10:0x0027, B:11:0x0055, B:13:0x005b, B:15:0x0065, B:17:0x0069, B:21:0x006f, B:23:0x0073, B:25:0x0087, B:26:0x008c, B:30:0x0036), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getOneTimeKey(ContinuationImpl continuationImpl) {
        OtkRedirectUseCase$getOneTimeKey$1 otkRedirectUseCase$getOneTimeKey$1;
        int i;
        ApiResult apiResult;
        ByteString byteString;
        try {
            if (continuationImpl instanceof OtkRedirectUseCase$getOneTimeKey$1) {
                otkRedirectUseCase$getOneTimeKey$1 = (OtkRedirectUseCase$getOneTimeKey$1) continuationImpl;
                int i2 = otkRedirectUseCase$getOneTimeKey$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    otkRedirectUseCase$getOneTimeKey$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = otkRedirectUseCase$getOneTimeKey$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = otkRedirectUseCase$getOneTimeKey$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        UiCashLimits.Builder builder = new UiCashLimits.Builder(28);
                        CreateOtkRequest createOtkRequest = new CreateOtkRequest((ClientCredentials) builder.cash_limit_group, builder.buildUnknownFields());
                        MultipassService multipassService = this.multipassService;
                        otkRedirectUseCase$getOneTimeKey$1.label = 1;
                        obj = multipassService.createOTK(createOtkRequest, otkRedirectUseCase$getOneTimeKey$1);
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
                    if (!(apiResult instanceof ApiResult.Success)) {
                        OneTimeKey oneTimeKey = ((CreateOtkResponse) ((ApiResult.Success) apiResult).response).one_time_key;
                        if (oneTimeKey == null || (byteString = oneTimeKey.value) == null) {
                            return null;
                        }
                        return byteString.base64Url();
                    }
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Timber.Forest.w("Failed to get OTK: " + apiResult, new Object[0]);
                    return null;
                }
            }
            if (i != 0) {
            }
            apiResult = (ApiResult) obj;
            if (!(apiResult instanceof ApiResult.Success)) {
            }
        } catch (Exception e) {
            Timber.Forest.w("Failed to createOtk", new Object[0], e);
            return null;
        }
        otkRedirectUseCase$getOneTimeKey$1 = new OtkRedirectUseCase$getOneTimeKey$1(this, continuationImpl);
        Object obj2 = otkRedirectUseCase$getOneTimeKey$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = otkRedirectUseCase$getOneTimeKey$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isCookieValid(ContinuationImpl continuationImpl) {
        OtkRedirectUseCase$isCookieValid$1 otkRedirectUseCase$isCookieValid$1;
        int i;
        if (continuationImpl instanceof OtkRedirectUseCase$isCookieValid$1) {
            otkRedirectUseCase$isCookieValid$1 = (OtkRedirectUseCase$isCookieValid$1) continuationImpl;
            int i2 = otkRedirectUseCase$isCookieValid$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                otkRedirectUseCase$isCookieValid$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = otkRedirectUseCase$isCookieValid$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = otkRedirectUseCase$isCookieValid$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    otkRedirectUseCase$isCookieValid$1.label = 1;
                    obj = this.payrollWebService.checkStatus(otkRedirectUseCase$isCookieValid$1);
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
                return Boolean.valueOf(((retrofit2.Response) obj).rawResponse.isSuccessful);
            }
        }
        otkRedirectUseCase$isCookieValid$1 = new OtkRedirectUseCase$isCookieValid$1(this, continuationImpl);
        Object obj2 = otkRedirectUseCase$isCookieValid$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = otkRedirectUseCase$isCookieValid$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((retrofit2.Response) obj2).rawResponse.isSuccessful);
    }
}
