package com.stripe.android.uicore.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.moneybot.views.plugins.TextCardKt;
import com.squareup.cash.onboarding.accountpicker.views.AliasPickerViewKt;
import com.squareup.cash.score.views.CalloutKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class H6TextKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ boolean f$2;

    public /* synthetic */ H6TextKt$$ExternalSyntheticLambda0(Modifier modifier, String str, boolean z, int i) {
        this.$r8$classId = 2;
        this.f$1 = modifier;
        this.f$0 = str;
        this.f$2 = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        boolean z = this.f$2;
        Modifier modifier = this.f$1;
        String str = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                H6TextKt.H6Text(Updater.updateChangedFlags(1), composer, modifier, str, z);
                break;
            case 1:
                TextCardKt.Description(Updater.updateChangedFlags(385), composer, modifier, str, z);
                break;
            case 2:
                AliasPickerViewKt.NameTitle(Updater.updateChangedFlags(1), composer, modifier, str, z);
                break;
            case 3:
                CalloutKt.ScoreLockLabeledLine(Updater.updateChangedFlags(385), composer, modifier, str, z);
                break;
            default:
                PlaceHolderKt.Placeholder(Updater.updateChangedFlags(1), composer, modifier, str, z);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ H6TextKt$$ExternalSyntheticLambda0(String str, Modifier modifier, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = modifier;
        this.f$2 = z;
    }

    public /* synthetic */ H6TextKt$$ExternalSyntheticLambda0(String str, boolean z, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$2 = z;
        this.f$1 = modifier;
    }
}
