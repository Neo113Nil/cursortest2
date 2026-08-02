package com.squareup.cash.work.data.real;

import com.squareup.protos.timecards.Timecard;
import com.squareup.protos.timecards.TimecardBreak;
import com.squareup.protos.timecards.scheduling.Shift;
import java.time.Instant;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealGetClockInEssentialsUseCase$getOnBreakEssentials$1 extends ContinuationImpl {
    public Shift L$2;
    public Timecard L$3;
    public TimecardBreak L$4;
    public Instant L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealGetClockInEssentialsUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealGetClockInEssentialsUseCase$getOnBreakEssentials$1(RealGetClockInEssentialsUseCase realGetClockInEssentialsUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realGetClockInEssentialsUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealGetClockInEssentialsUseCase.access$getOnBreakEssentials(this.this$0, null, null, this);
    }
}
