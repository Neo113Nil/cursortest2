package com.stripe.android.financialconnections.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final /* synthetic */ class DragHandleKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;

    public /* synthetic */ DragHandleKt$$ExternalSyntheticLambda0(Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                DragHandleKt.DragHandle(this.f$0, composer, Updater.updateChangedFlags(7));
                break;
            case 1:
                InstitutionPickerScreenKt.InstitutionResultShimmer(this.f$0, composer, Updater.updateChangedFlags(7));
                break;
            default:
                InstitutionPickerScreenKt.SearchTitle(this.f$0, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
