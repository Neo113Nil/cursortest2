package com.squareup.cash.work.views.clockin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class OnBreakOverlayContentKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Function0 f$2;
    public final /* synthetic */ Function0 f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ OnBreakOverlayContentKt$$ExternalSyntheticLambda2(boolean z, boolean z2, Function0 function0, Function0 function02, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = z;
        this.f$1 = z2;
        this.f$2 = function0;
        this.f$3 = function02;
        this.f$4 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                DisclaimerTextKt.OnBreakFooter(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, Updater.updateChangedFlags(this.f$4 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                DisclaimerTextKt.ClockedInFooter(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, Updater.updateChangedFlags(this.f$4 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
