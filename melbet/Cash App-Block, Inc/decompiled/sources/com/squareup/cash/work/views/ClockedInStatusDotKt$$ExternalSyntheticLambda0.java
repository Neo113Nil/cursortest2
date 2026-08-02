package com.squareup.cash.work.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.uicore.elements.TextFieldIcon$Trailing;
import com.stripe.android.uicore.elements.TextFieldUIKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final /* synthetic */ class ClockedInStatusDotKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ ClockedInStatusDotKt$$ExternalSyntheticLambda0(Modifier modifier, boolean z, int i, int i2) {
        this.f$0 = modifier;
        this.f$1 = z;
        this.f$2 = i;
        this.f$3 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                ClockedInStatusDotKt.OnBreakStatusDot(Updater.updateChangedFlags(this.f$2 | 1), this.f$3, (Composer) obj, this.f$0, this.f$1);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ListItemKt.LoadingPillContainer(Updater.updateChangedFlags(this.f$2 | 1), this.f$3, (Composer) obj, this.f$0, this.f$1);
                break;
            default:
                ((Integer) obj2).getClass();
                TextFieldUIKt.TrailingIcon(null, this.f$1, this.f$0, (Composer) obj, Updater.updateChangedFlags(this.f$2 | 1), this.f$3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ClockedInStatusDotKt$$ExternalSyntheticLambda0(TextFieldIcon$Trailing textFieldIcon$Trailing, boolean z, Modifier modifier, int i, int i2) {
        this.f$1 = z;
        this.f$0 = modifier;
        this.f$2 = i;
        this.f$3 = i2;
    }

    public /* synthetic */ ClockedInStatusDotKt$$ExternalSyntheticLambda0(boolean z, Modifier modifier, int i, int i2) {
        this.f$1 = z;
        this.f$0 = modifier;
        this.f$2 = i;
        this.f$3 = i2;
    }
}
