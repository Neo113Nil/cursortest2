package com.squareup.cash.taptopay.backend.real;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.featuretoggle.UnleashContext;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.mri.android.MRIUseCase;
import com.squareup.cash.mri.android.RealMRIFactory;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.payments.backend.api.OfflineManagerKt;
import com.squareup.cash.securitysignals.backend.RealScreenRecordingDetector;
import com.squareup.cash.taptopay.backend.api.TapToPayNonFatalError;
import com.squareup.cash.taptopay.backend.api.TapToPayPaymentAcceptance;
import com.squareup.cash.taptopay.backend.api.TapToPayPolicyResult;
import com.squareup.cash.taptopay.encryption.api.HieroglyphPanData;
import com.squareup.cropview.Edge;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.AndroidCardData;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.CashBusinessPaymentsClientService;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.CreatePaymentRequest;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.CreatePaymentRequest$CardData$AndroidCardData;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.CreatePaymentResponse;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.ValidateTapToPayPolicyRequest;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.ValidateTapToPayPolicyResponse;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.ValidateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult;
import com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext;
import com.squareup.protos.common.Money;
import com.squareup.protos.policychecker.v1.EvaluationVerdict;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealTapToPayRepository {
    public final boolean isDebug;
    public final UnleashContext keyEncryptor;
    public final RealMRIFactory mriFactory;
    public final RealScreenRecordingDetector screenRecodingDetector;
    public final CashBusinessPaymentsClientService service;
    public final SyncValueReader syncValueReader;
    public final RealTapToPayErrorReporter tapToPayErrorReporter;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ValidateTapToPayPolicyResponse.V1EvaluationResult.V1EvaluationFailureReason.values().length];
            try {
                Error.Code.Companion companion = ValidateTapToPayPolicyResponse.V1EvaluationResult.V1EvaluationFailureReason.Companion;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Error.Code.Companion companion2 = ValidateTapToPayPolicyResponse.V1EvaluationResult.V1EvaluationFailureReason.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Error.Code.Companion companion3 = ValidateTapToPayPolicyResponse.V1EvaluationResult.V1EvaluationFailureReason.Companion;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Error.Code.Companion companion4 = ValidateTapToPayPolicyResponse.V1EvaluationResult.V1EvaluationFailureReason.Companion;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CreatePaymentResponse.Result.values().length];
            try {
                Edge.Companion companion5 = CreatePaymentResponse.Result.Companion;
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Edge.Companion companion6 = CreatePaymentResponse.Result.Companion;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Edge.Companion companion7 = CreatePaymentResponse.Result.Companion;
                iArr2[0] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public RealTapToPayRepository(UnleashContext unleashContext, RealMRIFactory realMRIFactory, CashBusinessPaymentsClientService cashBusinessPaymentsClientService, RealScreenRecordingDetector realScreenRecordingDetector, SyncValueReader syncValueReader, RealTapToPayErrorReporter realTapToPayErrorReporter, boolean z) {
        this.keyEncryptor = unleashContext;
        this.mriFactory = realMRIFactory;
        this.service = cashBusinessPaymentsClientService;
        this.screenRecodingDetector = realScreenRecordingDetector;
        this.syncValueReader = syncValueReader;
        this.tapToPayErrorReporter = realTapToPayErrorReporter;
        this.isDebug = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkTapToPayPolicy(String str, SignedSerializedMRIContext signedSerializedMRIContext, ContinuationImpl continuationImpl) {
        RealTapToPayRepository$checkTapToPayPolicy$1 realTapToPayRepository$checkTapToPayPolicy$1;
        int i;
        ApiResult apiResult;
        TapToPayPolicyResult.TapToPayPolicyFailureReason tapToPayPolicyFailureReason;
        if (continuationImpl instanceof RealTapToPayRepository$checkTapToPayPolicy$1) {
            realTapToPayRepository$checkTapToPayPolicy$1 = (RealTapToPayRepository$checkTapToPayPolicy$1) continuationImpl;
            int i2 = realTapToPayRepository$checkTapToPayPolicy$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realTapToPayRepository$checkTapToPayPolicy$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realTapToPayRepository$checkTapToPayPolicy$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realTapToPayRepository$checkTapToPayPolicy$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!this.isDebug) {
                        ValidateTapToPayPolicyRequest validateTapToPayPolicyRequest = new ValidateTapToPayPolicyRequest(signedSerializedMRIContext, str, ByteString.EMPTY);
                        realTapToPayRepository$checkTapToPayPolicy$1.label = 1;
                        obj = this.service.validateTapToPayPolicy(validateTapToPayPolicyRequest, realTapToPayRepository$checkTapToPayPolicy$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return TapToPayPolicyResult.Success.INSTANCE;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if (apiResult instanceof ApiResult.Failure) {
                        return new TapToPayPolicyResult.Failure(TapToPayPolicyResult.TapToPayPolicyFailureReason.API_FAILURE);
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ValidateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult = ((ValidateTapToPayPolicyResponse) ((ApiResult.Success) apiResult).response).evaluation_result;
                ValidateTapToPayPolicyResponse.V1EvaluationResult v1EvaluationResult = validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult != null ? validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult.value : null;
                if ((v1EvaluationResult != null ? v1EvaluationResult.verdict : null) != EvaluationVerdict.PASSED) {
                    ValidateTapToPayPolicyResponse.V1EvaluationResult.V1EvaluationFailureReason v1EvaluationFailureReason = v1EvaluationResult != null ? v1EvaluationResult.failure_reason : null;
                    int i3 = v1EvaluationFailureReason == null ? -1 : WhenMappings.$EnumSwitchMapping$0[v1EvaluationFailureReason.ordinal()];
                    if (i3 == -1 || i3 == 1) {
                        tapToPayPolicyFailureReason = TapToPayPolicyResult.TapToPayPolicyFailureReason.UNKNOWN;
                    } else if (i3 == 2) {
                        tapToPayPolicyFailureReason = TapToPayPolicyResult.TapToPayPolicyFailureReason.PLAY_PROTECT_NOT_AVAILABLE;
                    } else if (i3 == 3) {
                        tapToPayPolicyFailureReason = TapToPayPolicyResult.TapToPayPolicyFailureReason.OS_PLATFORM_LEVEL_OUTDATED;
                    } else {
                        if (i3 != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        tapToPayPolicyFailureReason = TapToPayPolicyResult.TapToPayPolicyFailureReason.SCREEN_RECORDING_ON;
                    }
                    return new TapToPayPolicyResult.Failure(tapToPayPolicyFailureReason);
                }
                return TapToPayPolicyResult.Success.INSTANCE;
            }
        }
        realTapToPayRepository$checkTapToPayPolicy$1 = new RealTapToPayRepository$checkTapToPayPolicy$1(this, continuationImpl);
        Object obj2 = realTapToPayRepository$checkTapToPayPolicy$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realTapToPayRepository$checkTapToPayPolicy$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f0, code lost:
    
        if (r1 != r3) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createPayment(byte[] bArr, Money money, String str, String str2, ContinuationImpl continuationImpl) {
        RealTapToPayRepository$createPayment$1 realTapToPayRepository$createPayment$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str3;
        String str4;
        Money money2;
        HieroglyphPanData hieroglyphPanData;
        ByteString byteString;
        ByteString byteString2;
        ByteString byteString3;
        String str5;
        Money money3;
        CreatePaymentRequest$CardData$AndroidCardData createPaymentRequest$CardData$AndroidCardData;
        if (continuationImpl instanceof RealTapToPayRepository$createPayment$1) {
            realTapToPayRepository$createPayment$1 = (RealTapToPayRepository$createPayment$1) continuationImpl;
            int i2 = realTapToPayRepository$createPayment$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realTapToPayRepository$createPayment$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = realTapToPayRepository$createPayment$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realTapToPayRepository$createPayment$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realTapToPayRepository$createPayment$1.L$1 = money;
                    str3 = str;
                    realTapToPayRepository$createPayment$1.L$2 = str3;
                    str4 = str2;
                    realTapToPayRepository$createPayment$1.L$3 = str4;
                    realTapToPayRepository$createPayment$1.label = 1;
                    Object encryptPanData = this.keyEncryptor.encryptPanData(bArr, realTapToPayRepository$createPayment$1);
                    if (encryptPanData != coroutineSingletons) {
                        money2 = money;
                        obj = encryptPanData;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    String str6 = realTapToPayRepository$createPayment$1.L$3;
                    String str7 = realTapToPayRepository$createPayment$1.L$2;
                    money2 = realTapToPayRepository$createPayment$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    str4 = str6;
                    str3 = str7;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        ApiResult apiResult = (ApiResult) obj;
                        if (!(apiResult instanceof ApiResult.Success)) {
                            if (apiResult instanceof ApiResult.Failure) {
                                return new TapToPayPaymentAcceptance.PaymentFailed(OfflineManagerKt.reasonDesc((ApiResult.Failure) apiResult, true));
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        CreatePaymentResponse createPaymentResponse = (CreatePaymentResponse) ((ApiResult.Success) apiResult).response;
                        CreatePaymentResponse.Result result = createPaymentResponse.result;
                        String str8 = createPaymentResponse.error;
                        int i3 = result == null ? -1 : WhenMappings.$EnumSwitchMapping$1[result.ordinal()];
                        if (i3 != -1) {
                            if (i3 == 1) {
                                String str9 = createPaymentResponse.receipt_client_route_url;
                                str9.getClass();
                                return new TapToPayPaymentAcceptance.PaymentAccepted(str9);
                            }
                            if (i3 == 2) {
                                return new TapToPayPaymentAcceptance.PaymentFailed(str8);
                            }
                            if (i3 != 3) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                        }
                        this.tapToPayErrorReporter.errorReporter.report(new TapToPayNonFatalError(Recorder$$ExternalSyntheticOutline2.m("CreatePaymentResponse: Unknown result, ", str8)), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                        return new TapToPayPaymentAcceptance.PaymentFailed(str8);
                    }
                    CreatePaymentRequest$CardData$AndroidCardData createPaymentRequest$CardData$AndroidCardData2 = realTapToPayRepository$createPayment$1.L$5;
                    str4 = realTapToPayRepository$createPayment$1.L$3;
                    String str10 = realTapToPayRepository$createPayment$1.L$2;
                    Money money4 = realTapToPayRepository$createPayment$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    str5 = str10;
                    money3 = money4;
                    createPaymentRequest$CardData$AndroidCardData = createPaymentRequest$CardData$AndroidCardData2;
                    CreatePaymentRequest createPaymentRequest = new CreatePaymentRequest(createPaymentRequest$CardData$AndroidCardData, str4, money3, str5, (SignedSerializedMRIContext) obj, ByteString.EMPTY);
                    realTapToPayRepository$createPayment$1.L$1 = null;
                    realTapToPayRepository$createPayment$1.L$2 = null;
                    realTapToPayRepository$createPayment$1.L$3 = null;
                    realTapToPayRepository$createPayment$1.L$5 = null;
                    realTapToPayRepository$createPayment$1.label = 3;
                    obj = this.service.createPayment(createPaymentRequest, realTapToPayRepository$createPayment$1);
                }
                hieroglyphPanData = (HieroglyphPanData) obj;
                if (hieroglyphPanData == null) {
                    byte[] bArr2 = hieroglyphPanData.encryptedPanBlock;
                    ByteString.Companion companion = ByteString.Companion;
                    byteString = ByteString.Companion.of$default(bArr2);
                } else {
                    byteString = null;
                }
                if (hieroglyphPanData == null) {
                    byte[] bArr3 = hieroglyphPanData.encryptionIv;
                    ByteString.Companion companion2 = ByteString.Companion;
                    byteString2 = ByteString.Companion.of$default(bArr3);
                } else {
                    byteString2 = null;
                }
                if (hieroglyphPanData == null) {
                    byte[] bArr4 = hieroglyphPanData.hmacPan;
                    ByteString.Companion companion3 = ByteString.Companion;
                    byteString3 = ByteString.Companion.of$default(bArr4);
                } else {
                    byteString3 = null;
                }
                CreatePaymentRequest$CardData$AndroidCardData createPaymentRequest$CardData$AndroidCardData3 = new CreatePaymentRequest$CardData$AndroidCardData(new AndroidCardData(byteString, byteString2, byteString3, ByteString.EMPTY));
                MRIUseCase mRIUseCase = MRIUseCase.TTP;
                Boolean bool = (Boolean) this.screenRecodingDetector._screenIsBeingRecorded.getValue();
                realTapToPayRepository$createPayment$1.L$1 = money2;
                realTapToPayRepository$createPayment$1.L$2 = str3;
                realTapToPayRepository$createPayment$1.L$3 = str4;
                realTapToPayRepository$createPayment$1.L$5 = createPaymentRequest$CardData$AndroidCardData3;
                realTapToPayRepository$createPayment$1.label = 2;
                obj = RealMRIFactory.buildSignedSerializedMRIContext$default(this.mriFactory, mRIUseCase, bool, realTapToPayRepository$createPayment$1, 4);
                if (obj != coroutineSingletons) {
                    str5 = str3;
                    money3 = money2;
                    createPaymentRequest$CardData$AndroidCardData = createPaymentRequest$CardData$AndroidCardData3;
                    CreatePaymentRequest createPaymentRequest2 = new CreatePaymentRequest(createPaymentRequest$CardData$AndroidCardData, str4, money3, str5, (SignedSerializedMRIContext) obj, ByteString.EMPTY);
                    realTapToPayRepository$createPayment$1.L$1 = null;
                    realTapToPayRepository$createPayment$1.L$2 = null;
                    realTapToPayRepository$createPayment$1.L$3 = null;
                    realTapToPayRepository$createPayment$1.L$5 = null;
                    realTapToPayRepository$createPayment$1.label = 3;
                    obj = this.service.createPayment(createPaymentRequest2, realTapToPayRepository$createPayment$1);
                }
                return coroutineSingletons;
            }
        }
        realTapToPayRepository$createPayment$1 = new RealTapToPayRepository$createPayment$1(this, continuationImpl);
        obj = realTapToPayRepository$createPayment$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realTapToPayRepository$createPayment$1.label;
        if (i != 0) {
        }
        hieroglyphPanData = (HieroglyphPanData) obj;
        if (hieroglyphPanData == null) {
        }
        if (hieroglyphPanData == null) {
        }
        if (hieroglyphPanData == null) {
        }
        CreatePaymentRequest$CardData$AndroidCardData createPaymentRequest$CardData$AndroidCardData32 = new CreatePaymentRequest$CardData$AndroidCardData(new AndroidCardData(byteString, byteString2, byteString3, ByteString.EMPTY));
        MRIUseCase mRIUseCase2 = MRIUseCase.TTP;
        Boolean bool2 = (Boolean) this.screenRecodingDetector._screenIsBeingRecorded.getValue();
        realTapToPayRepository$createPayment$1.L$1 = money2;
        realTapToPayRepository$createPayment$1.L$2 = str3;
        realTapToPayRepository$createPayment$1.L$3 = str4;
        realTapToPayRepository$createPayment$1.L$5 = createPaymentRequest$CardData$AndroidCardData32;
        realTapToPayRepository$createPayment$1.label = 2;
        obj = RealMRIFactory.buildSignedSerializedMRIContext$default(this.mriFactory, mRIUseCase2, bool2, realTapToPayRepository$createPayment$1, 4);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
