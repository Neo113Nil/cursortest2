package com.squareup.cash.support.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.support.viewmodels.SupportPhoneStatusViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class SupportPhoneStratusViewKt$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SupportPhoneStatusViewModel.Loaded f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ SupportPhoneStratusViewKt$$ExternalSyntheticLambda8(Function1 function1, SupportPhoneStatusViewModel.Loaded loaded, int i) {
        this.$r8$classId = 1;
        this.f$1 = function1;
        this.f$0 = loaded;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.$r8$classId) {
            case 0:
                num.getClass();
                ScreenshotReviewViewKt.SupportPhoneLoaded(Updater.updateChangedFlags(this.f$2 | 1), composer, this.f$0, this.f$1);
                break;
            case 1:
                num.intValue();
                ScreenshotReviewViewKt.SupportPhoneStatusButtonBox(Updater.updateChangedFlags(this.f$2 | 1), composer, this.f$0, this.f$1);
                break;
            default:
                num.intValue();
                ScreenshotReviewViewKt.PrimaryButton(Updater.updateChangedFlags(this.f$2 | 1), composer, this.f$0, this.f$1);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SupportPhoneStratusViewKt$$ExternalSyntheticLambda8(SupportPhoneStatusViewModel.Loaded loaded, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = loaded;
        this.f$1 = function1;
        this.f$2 = i;
    }
}
