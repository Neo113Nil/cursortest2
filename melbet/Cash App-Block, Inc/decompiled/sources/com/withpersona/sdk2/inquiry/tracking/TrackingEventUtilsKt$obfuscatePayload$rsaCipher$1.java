package com.withpersona.sdk2.inquiry.tracking;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.security.PublicKey;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Ljavax/crypto/Cipher;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventUtilsKt$obfuscatePayload$rsaCipher$1", f = "TrackingEventUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class TrackingEventUtilsKt$obfuscatePayload$rsaCipher$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Cipher>, Object> {
    final /* synthetic */ PublicKey $rsaPublicKey;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingEventUtilsKt$obfuscatePayload$rsaCipher$1(PublicKey publicKey, Continuation<? super TrackingEventUtilsKt$obfuscatePayload$rsaCipher$1> continuation) {
        super(2, continuation);
        this.$rsaPublicKey = publicKey;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackingEventUtilsKt$obfuscatePayload$rsaCipher$1(this.$rsaPublicKey, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Cipher> continuation) {
        return ((TrackingEventUtilsKt$obfuscatePayload$rsaCipher$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        cipher.init(1, this.$rsaPublicKey);
        return cipher;
    }
}
