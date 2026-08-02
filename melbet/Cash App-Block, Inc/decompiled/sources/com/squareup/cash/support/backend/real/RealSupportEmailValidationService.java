package com.squareup.cash.support.backend.real;

import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.backend.api.SupportEmailValidationService$EmailValidationResult;
import com.squareup.protos.cash.supportal.app.SupportalAppService;
import com.squareup.protos.cash.supportal.app.ValidateEmailRequest;
import com.squareup.protos.cash.supportal.app.ValidateEmailResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealSupportEmailValidationService {
    public final SupportalAppService appService;
    public final AndroidStringManager stringManager;

    public RealSupportEmailValidationService(SupportalAppService supportalAppService, AndroidStringManager androidStringManager) {
        this.appService = supportalAppService;
        this.stringManager = androidStringManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object validateEmail(String str, ContinuationImpl continuationImpl) {
        RealSupportEmailValidationService$validateEmail$1 realSupportEmailValidationService$validateEmail$1;
        int i;
        boolean z;
        if (continuationImpl instanceof RealSupportEmailValidationService$validateEmail$1) {
            realSupportEmailValidationService$validateEmail$1 = (RealSupportEmailValidationService$validateEmail$1) continuationImpl;
            int i2 = realSupportEmailValidationService$validateEmail$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSupportEmailValidationService$validateEmail$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSupportEmailValidationService$validateEmail$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSupportEmailValidationService$validateEmail$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ValidateEmailRequest validateEmailRequest = new ValidateEmailRequest(str, ByteString.EMPTY);
                    realSupportEmailValidationService$validateEmail$1.label = 1;
                    obj = this.appService.validateEmailAddress(validateEmailRequest, realSupportEmailValidationService$validateEmail$1);
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
                ApiResult apiResult = (ApiResult) obj;
                z = apiResult instanceof ApiResult.Success;
                AndroidStringManager androidStringManager = this.stringManager;
                if (!z) {
                    return Intrinsics.areEqual(((ValidateEmailResponse) ((ApiResult.Success) apiResult).response).is_valid, Boolean.TRUE) ? SupportEmailValidationService$EmailValidationResult.Success.INSTANCE : new SupportEmailValidationService$EmailValidationResult.Failure(androidStringManager.get(R.string.contact_support_invalid_email_title), androidStringManager.get(R.string.contact_support_invalid_email_body), SupportEmailValidationService$EmailValidationResult.Failure.ErrorType.VALIDATION);
                }
                if (apiResult instanceof ApiResult.Failure) {
                    ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                    return new SupportEmailValidationService$EmailValidationResult.Failure(TextUtilsCompat.errorMessaging(androidStringManager, failure, null).title, TextUtilsCompat.errorMessaging(androidStringManager, failure, null).message, SupportEmailValidationService$EmailValidationResult.Failure.ErrorType.NETWORK);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        realSupportEmailValidationService$validateEmail$1 = new RealSupportEmailValidationService$validateEmail$1(this, continuationImpl);
        Object obj2 = realSupportEmailValidationService$validateEmail$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSupportEmailValidationService$validateEmail$1.label;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        z = apiResult2 instanceof ApiResult.Success;
        AndroidStringManager androidStringManager2 = this.stringManager;
        if (!z) {
        }
    }
}
