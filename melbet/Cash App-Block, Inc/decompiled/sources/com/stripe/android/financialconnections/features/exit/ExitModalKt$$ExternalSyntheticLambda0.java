package com.stripe.android.financialconnections.features.exit;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.navigation.NavBackStackEntry;
import com.datadog.trace.util.Strings;
import com.fillr.browsersdk.model.FillrWidgetVersion;
import com.squareup.cash.db.CashAccountDatabaseCallbackKt;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final /* synthetic */ class ExitModalKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NavBackStackEntry f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ ExitModalKt$$ExternalSyntheticLambda0(NavBackStackEntry navBackStackEntry, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = navBackStackEntry;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                ExitModalKt.ExitModal(this.f$0, composer, Updater.updateChangedFlags(this.f$1 | 1));
                break;
            case 1:
                Strings.AccountUpdateRequiredModal(this.f$0, composer, Updater.updateChangedFlags(this.f$1 | 1));
                break;
            case 2:
                InstitutionPickerScreenKt.InstitutionPickerScreen(this.f$0, composer, Updater.updateChangedFlags(this.f$1 | 1));
                break;
            case 3:
                FillrWidgetVersion.NetworkingLinkLoginWarmupScreen(this.f$0, composer, Updater.updateChangedFlags(this.f$1 | 1));
                break;
            default:
                CashAccountDatabaseCallbackKt.NoticeSheet(this.f$0, composer, Updater.updateChangedFlags(this.f$1 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
