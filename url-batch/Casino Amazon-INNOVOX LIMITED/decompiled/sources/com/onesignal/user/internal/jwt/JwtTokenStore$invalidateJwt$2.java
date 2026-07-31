package com.onesignal.user.internal.jwt;

import com.onesignal.IUserJwtInvalidatedListener;
import com.onesignal.UserJwtInvalidatedEvent;
import com.onesignal.common.events.EventProducer;
import com.onesignal.debug.internal.logging.Logging;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JwtTokenStore.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.user.internal.jwt.JwtTokenStore$invalidateJwt$2", f = "JwtTokenStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class JwtTokenStore$invalidateJwt$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ String $externalId;
    int label;
    final /* synthetic */ JwtTokenStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JwtTokenStore$invalidateJwt$2(JwtTokenStore jwtTokenStore, String str, Continuation<? super JwtTokenStore$invalidateJwt$2> continuation) {
        super(1, continuation);
        this.this$0 = jwtTokenStore;
        this.$externalId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new JwtTokenStore$invalidateJwt$2(this.this$0, this.$externalId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((JwtTokenStore$invalidateJwt$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        EventProducer eventProducer;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            eventProducer = this.this$0.publicInvalidatedListeners;
            final JwtTokenStore jwtTokenStore = this.this$0;
            final String str = this.$externalId;
            eventProducer.fire(new Function1<IUserJwtInvalidatedListener, Unit>() { // from class: com.onesignal.user.internal.jwt.JwtTokenStore$invalidateJwt$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IUserJwtInvalidatedListener iUserJwtInvalidatedListener) {
                    invoke2(iUserJwtInvalidatedListener);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(IUserJwtInvalidatedListener listener) {
                    Object m3984constructorimpl;
                    Intrinsics.checkNotNullParameter(listener, "listener");
                    String str2 = str;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        listener.onUserJwtInvalidated(new UserJwtInvalidatedEvent(str2));
                        m3984constructorimpl = Result.m3984constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        m3984constructorimpl = Result.m3984constructorimpl(ResultKt.createFailure(th));
                    }
                    String str3 = str;
                    Throwable m3987exceptionOrNullimpl = Result.m3987exceptionOrNullimpl(m3984constructorimpl);
                    if (m3987exceptionOrNullimpl != null) {
                        Logging.warn("JwtTokenStore: IUserJwtInvalidatedListener threw for externalId=" + str3, m3987exceptionOrNullimpl);
                    }
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
