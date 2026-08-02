package com.withpersona.sdk2.inquiry.governmentid.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class AutoClassifyWorker$run$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public AutoClassifyWorker L$2;
    public Iterator L$3;
    public int label;
    public final /* synthetic */ AutoClassifyWorker this$0;

    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$run$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements Function1 {
        public final /* synthetic */ List $body;
        public int label;
        public final /* synthetic */ AutoClassifyWorker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AutoClassifyWorker autoClassifyWorker, List list, Continuation continuation) {
            super(1, continuation);
            this.this$0 = autoClassifyWorker;
            this.$body = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$body, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass2) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
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
            AutoClassifyWorker autoClassifyWorker = this.this$0;
            GovernmentIdService governmentIdService = autoClassifyWorker.service;
            String str = autoClassifyWorker.sessionToken;
            String str2 = autoClassifyWorker.inquiryId;
            AutoClassifyWorker.SupplementaryData supplementaryData = autoClassifyWorker.supplementaryData;
            this.label = 1;
            Object autoClassifyGovernmentId = governmentIdService.autoClassifyGovernmentId(str, str2, this.$body, supplementaryData, this);
            return autoClassifyGovernmentId == coroutineSingletons ? coroutineSingletons : autoClassifyGovernmentId;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoClassifyWorker$run$1(AutoClassifyWorker autoClassifyWorker, Continuation continuation) {
        super(2, continuation);
        this.this$0 = autoClassifyWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AutoClassifyWorker$run$1 autoClassifyWorker$run$1 = new AutoClassifyWorker$run$1(this.this$0, continuation);
        autoClassifyWorker$run$1.L$0 = obj;
        return autoClassifyWorker$run$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoClassifyWorker$run$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00bd -> B:50:0x00c1). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$run$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
