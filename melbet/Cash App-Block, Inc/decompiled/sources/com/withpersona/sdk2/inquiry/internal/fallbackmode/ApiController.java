package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.withpersona.sdk2.inquiry.internal.network.InquiryAttributes;
import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$3;

/* loaded from: classes9.dex */
public interface ApiController {
    /* renamed from: createSession-gIAlu-s */
    Object mo1999createSessiongIAlus(InquiryAttributes inquiryAttributes, Continuation continuation);

    Object transitionBack(String str, RequestBody$Companion$toRequestBody$3 requestBody$Companion$toRequestBody$3, RealFallbackModeManager$transitionBack$1 realFallbackModeManager$transitionBack$1);

    Object transitionWithRequestBody(String str, RequestBody requestBody, RealFallbackModeManager$transition$1 realFallbackModeManager$transition$1);
}
