package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.internal.Environment;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import com.withpersona.sdk2.inquiry.internal.network.ConversionsKt;
import com.withpersona.sdk2.inquiry.internal.network.InquiryAttributes;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.InquiryFieldMap;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class FallbackModeApiController$createSession$sessionIdResponse$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ InquiryAttributes $attributes;
    public int label;
    public final /* synthetic */ FallbackModeApiController this$0;

    /* renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$sessionIdResponse$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function1 {
        public final /* synthetic */ InquiryAttributes $attributes;
        public int label;
        public final /* synthetic */ FallbackModeApiController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FallbackModeApiController fallbackModeApiController, InquiryAttributes inquiryAttributes, Continuation continuation) {
            super(1, continuation);
            this.this$0 = fallbackModeApiController;
            this.$attributes = inquiryAttributes;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$attributes, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            InquiryAttributes inquiryAttributes = this.$attributes;
            Map map = inquiryAttributes.fields;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            FallbackModeService fallbackModeService = this.this$0.service;
            String str2 = inquiryAttributes.templateId;
            String str3 = inquiryAttributes.templateVersion;
            String str4 = inquiryAttributes.inquiryId;
            String str5 = inquiryAttributes.referenceId;
            String str6 = inquiryAttributes.accountId;
            Environment environment = inquiryAttributes.environment;
            environment.getClass();
            int ordinal = environment.ordinal();
            if (ordinal == 0) {
                str = "production";
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                str = "sandbox";
            }
            FallbackModeService.SessionIdRequest sessionIdRequest = new FallbackModeService.SessionIdRequest(str2, str3, str4, str5, str6, str, inquiryAttributes.environmentId, map != null ? new InquiryFieldMap(ConversionsKt.toInquiryFieldDtoMap(map)) : null, inquiryAttributes.themeSetId);
            this.label = 1;
            Object createSession = fallbackModeService.createSession(sessionIdRequest, this);
            return createSession == coroutineSingletons ? coroutineSingletons : createSession;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FallbackModeApiController$createSession$sessionIdResponse$1(FallbackModeApiController fallbackModeApiController, InquiryAttributes inquiryAttributes, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fallbackModeApiController;
        this.$attributes = inquiryAttributes;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FallbackModeApiController$createSession$sessionIdResponse$1(this.this$0, this.$attributes, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FallbackModeApiController$createSession$sessionIdResponse$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                return obj;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$attributes, null);
        this.label = 1;
        Object enqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(anonymousClass1, this);
        return enqueueRetriableRequestWithRetry == coroutineSingletons ? coroutineSingletons : enqueueRetriableRequestWithRetry;
    }
}
