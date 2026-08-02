package com.squareup.cash.support.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.support.backend.real.RealSupportPhoneService;
import com.squareup.cash.support.incidents.backend.real.RealIncidentsService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class SupportHomePresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ SupportHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SupportHomePresenter$models$2$1(SupportHomePresenter supportHomePresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = supportHomePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        SupportHomePresenter supportHomePresenter = this.this$0;
        switch (i) {
            case 0:
                return new SupportHomePresenter$models$2$1(supportHomePresenter, continuation, 0);
            default:
                return new SupportHomePresenter$models$2$1(supportHomePresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
            case 0:
                return ((SupportHomePresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            default:
                ((SupportHomePresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r1, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r8.requestPhoneStatusUpdate(r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0035 -> B:13:0x0022). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        SupportHomePresenter supportHomePresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealIncidentsService realIncidentsService = supportHomePresenter.incidentsService;
                    this.label = 1;
                    if (realIncidentsService.getOpenIncidents(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        long j = supportHomePresenter.pollingInterval;
                        this.label = 2;
                        break;
                    } else if (i3 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                SafeTrace.throwOnFailure(obj);
                RealSupportPhoneService realSupportPhoneService = supportHomePresenter.supportPhoneService;
                this.label = 1;
                break;
        }
    }
}
