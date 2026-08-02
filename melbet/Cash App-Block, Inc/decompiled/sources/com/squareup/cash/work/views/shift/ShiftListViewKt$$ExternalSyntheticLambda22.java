package com.squareup.cash.work.views.shift;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.onboarding.accountpicker.views.AliasPickerViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class ShiftListViewKt$$ExternalSyntheticLambda22 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Function0 f$2;

    public /* synthetic */ ShiftListViewKt$$ExternalSyntheticLambda22(String str, Function0 function0, boolean z, int i) {
        this.f$0 = str;
        this.f$2 = function0;
        this.f$1 = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        boolean z = this.f$1;
        Function0 function0 = this.f$2;
        String str = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ShiftListViewKt.ShiftListMonthTitle(Updater.updateChangedFlags(1), composer, str, function0, z);
                break;
            default:
                AliasPickerViewKt.Option(Updater.updateChangedFlags(1), composer, str, function0, z);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ShiftListViewKt$$ExternalSyntheticLambda22(String str, boolean z, Function0 function0, int i) {
        this.f$0 = str;
        this.f$1 = z;
        this.f$2 = function0;
    }
}
