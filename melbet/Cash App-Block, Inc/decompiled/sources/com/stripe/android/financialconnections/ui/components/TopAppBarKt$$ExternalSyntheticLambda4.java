package com.stripe.android.financialconnections.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.stripe.android.financialconnections.ui.theme.Theme;
import com.stripe.android.model.LinkBrand;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final /* synthetic */ class TopAppBarKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Theme f$2;
    public final /* synthetic */ LinkBrand f$3;

    public /* synthetic */ TopAppBarKt$$ExternalSyntheticLambda4(boolean z, boolean z2, Theme theme, LinkBrand linkBrand) {
        this.f$0 = z;
        this.f$1 = z2;
        this.f$2 = theme;
        this.f$3 = linkBrand;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    TextKt.Title(this.f$0, this.f$1, this.f$2, this.f$3, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                TextKt.Title(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TopAppBarKt$$ExternalSyntheticLambda4(boolean z, boolean z2, Theme theme, LinkBrand linkBrand, int i) {
        this.f$0 = z;
        this.f$1 = z2;
        this.f$2 = theme;
        this.f$3 = linkBrand;
    }
}
