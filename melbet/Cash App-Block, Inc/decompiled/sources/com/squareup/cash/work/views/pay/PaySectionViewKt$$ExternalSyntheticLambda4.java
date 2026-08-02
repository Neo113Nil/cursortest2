package com.squareup.cash.work.views.pay;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class PaySectionViewKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ float f$1;

    public /* synthetic */ PaySectionViewKt$$ExternalSyntheticLambda4(float f, float f2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = f;
        this.f$1 = f2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                PayCellViewKt.m3809SkeletonBlocki1RSzL4(this.f$0, this.f$1, composer, Updater.updateChangedFlags(55));
                break;
            default:
                ScreenshotReviewViewKt.m3752PlaceHolderBoxi1RSzL4(this.f$0, this.f$1, composer, Updater.updateChangedFlags(55));
                break;
        }
        return Unit.INSTANCE;
    }
}
