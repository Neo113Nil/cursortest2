package com.squareup.cash.storage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.initialscreenloader.viewmodels.AppUpgradeViewModel;
import com.squareup.cash.initialscreenloader.views.AppUpgradeViewKt;
import com.squareup.cash.initialscreenloader.views.InitialScreenPlaceholderViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* loaded from: classes.dex */
public final /* synthetic */ class RealStorageLinkerKt$$ExternalSyntheticLambda2 implements Function4 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RealStorageLinkerKt$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$r8$classId) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                AppUpgradeViewModel appUpgradeViewModel = (AppUpgradeViewModel) obj;
                Function1 function1 = (Function1) obj2;
                Composer composer = (Composer) obj3;
                int intValue = ((Integer) obj4).intValue();
                function1.getClass();
                if (appUpgradeViewModel != null) {
                    AppUpgradeViewKt.AppUpgradeRequired(appUpgradeViewModel, function1, composer, intValue & 112);
                }
                break;
            case 3:
                AppUpgradeViewModel appUpgradeViewModel2 = (AppUpgradeViewModel) obj;
                Function1 function12 = (Function1) obj2;
                int intValue2 = ((Integer) obj4).intValue();
                function12.getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj3);
                if (appUpgradeViewModel2 != null) {
                    gapComposer.startReplaceGroup(1409954990);
                    AppUpgradeViewKt.AppUpdateModal(appUpgradeViewModel2, function12, gapComposer, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                } else {
                    gapComposer.startReplaceGroup(758960562);
                }
                gapComposer.end(false);
                break;
            case 4:
                Function1 function13 = (Function1) obj2;
                Composer composer2 = (Composer) obj3;
                int m = re$$ExternalSyntheticOutline0.m((Integer) obj4, (Unit) obj, function13);
                if ((m & 48) == 0) {
                    m |= ((GapComposer) composer2).changedInstance(function13) ? 32 : 16;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(m & 1, (m & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    AppUpgradeViewKt.InitiateSessionFailedModal(function13, gapComposer2, (m >> 3) & 14);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 5:
                Function1 function14 = (Function1) obj2;
                Composer composer3 = (Composer) obj3;
                int m2 = re$$ExternalSyntheticOutline0.m((Integer) obj4, (Unit) obj, function14);
                if ((m2 & 48) == 0) {
                    m2 |= ((GapComposer) composer3).changedInstance(function14) ? 32 : 16;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(m2 & 1, (m2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    AppUpgradeViewKt.GenericErrorModal(function14, gapComposer3, (m2 >> 3) & 14);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 6:
                Function1 function15 = (Function1) obj2;
                Composer composer4 = (Composer) obj3;
                int m3 = re$$ExternalSyntheticOutline0.m((Integer) obj4, (Unit) obj, function15);
                if ((m3 & 48) == 0) {
                    m3 |= ((GapComposer) composer4).changedInstance(function15) ? 32 : 16;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(m3 & 1, (m3 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    InitialScreenPlaceholderViewKt.InitialScreenPlaceholder(function15, gapComposer4, (m3 >> 3) & 14);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            default:
                Function1 function16 = (Function1) obj2;
                Composer composer5 = (Composer) obj3;
                int m4 = re$$ExternalSyntheticOutline0.m((Integer) obj4, (Unit) obj, function16);
                if ((m4 & 48) == 0) {
                    m4 |= ((GapComposer) composer5).changedInstance(function16) ? 32 : 16;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(m4 & 1, (m4 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    AppUpgradeViewKt.ScenarioPlanErrorModal(function16, gapComposer5, (m4 >> 3) & 14);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
