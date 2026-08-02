package com.squareup.cash.work.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.payments.views.QuickPayViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ClockedInStatusDotKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ ClockedInStatusDotKt$$ExternalSyntheticLambda3(long j, String str, Modifier modifier, int i) {
        this.f$0 = j;
        this.f$1 = str;
        this.f$2 = modifier;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$3;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ClockedInStatusDotKt.m3802PulsingStatusDotKTwxG1Y(Updater.updateChangedFlags(i2 | 1), this.f$0, (Composer) obj, this.f$2, this.f$1);
                break;
            default:
                ((Integer) obj2).getClass();
                QuickPayViewKt.m3703GlitterBackgroundFNF3uiM(Updater.updateChangedFlags(i2 | 1), this.f$0, (Composer) obj, this.f$2, this.f$1);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ClockedInStatusDotKt$$ExternalSyntheticLambda3(Modifier modifier, String str, long j, int i) {
        this.f$2 = modifier;
        this.f$1 = str;
        this.f$0 = j;
        this.f$3 = i;
    }
}
