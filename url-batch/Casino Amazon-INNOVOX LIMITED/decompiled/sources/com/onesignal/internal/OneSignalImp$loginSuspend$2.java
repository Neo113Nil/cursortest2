package com.onesignal.internal;

import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.LoginHelper;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OneSignalImp.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.internal.OneSignalImp$loginSuspend$2", f = "OneSignalImp.kt", i = {}, l = {761, 764}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class OneSignalImp$loginSuspend$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $externalId;
    final /* synthetic */ String $jwtBearerToken;
    int label;
    final /* synthetic */ OneSignalImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneSignalImp$loginSuspend$2(String str, String str2, OneSignalImp oneSignalImp, Continuation<? super OneSignalImp$loginSuspend$2> continuation) {
        super(2, continuation);
        this.$externalId = str;
        this.$jwtBearerToken = str2;
        this.this$0 = oneSignalImp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneSignalImp$loginSuspend$2(this.$externalId, this.$jwtBearerToken, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OneSignalImp$loginSuspend$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
    
        if (r1.enqueueLogin$com_onesignal_core(r7, r6) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r7 == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object suspendUntilInit;
        LoginHelper loginHelper;
        LoginHelper loginHelper2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LogLevel logLevel = LogLevel.DEBUG;
            StringBuilder append = new StringBuilder("login(externalId: ").append(this.$externalId).append(", jwtBearerToken: ...");
            String str = this.$jwtBearerToken;
            Logging.log(logLevel, append.append(str != null ? StringsKt.takeLast(str, 8) : null).append(')').toString());
            this.label = 1;
            suspendUntilInit = this.this$0.suspendUntilInit("login", this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        loginHelper = this.this$0.getLoginHelper();
        LoginHelper.LoginEnqueueContext switchUser$com_onesignal_core = loginHelper.switchUser$com_onesignal_core(this.$externalId, this.$jwtBearerToken);
        if (switchUser$com_onesignal_core == null) {
            return Unit.INSTANCE;
        }
        loginHelper2 = this.this$0.getLoginHelper();
        this.label = 2;
    }
}
