package com.squareup.cash.work.views;

import java.time.LocalDate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class ScheduleCalendarKt$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ LocalDate f$1;

    public /* synthetic */ ScheduleCalendarKt$$ExternalSyntheticLambda4(Function1 function1, LocalDate localDate, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = localDate;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        LocalDate localDate = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(localDate);
                break;
            default:
                function1.invoke(localDate);
                break;
        }
        return Unit.INSTANCE;
    }
}
