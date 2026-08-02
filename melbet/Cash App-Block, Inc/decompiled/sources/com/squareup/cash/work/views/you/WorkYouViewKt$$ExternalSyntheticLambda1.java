package com.squareup.cash.work.views.you;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.avatar.components.BadgedAvatarKt$$ExternalSyntheticLambda4;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerDeviceDetailViewModel;
import com.squareup.cash.profile.devicemanager.views.DeviceManagerListViewKt;
import com.squareup.cash.support.chat.presenters.ChatPresenter;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.viewmodels.WorkYouViewModel;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.uicore.elements.SectionUIKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class WorkYouViewKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ WorkYouViewKt$$ExternalSyntheticLambda1(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                WorkYouViewKt.YouInfoCard((WorkYouViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.InfoRow infoRow = (PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.InfoRow) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    CrossfadeKt.Crossfade(infoRow.trailingText, (Modifier) null, (FiniteAnimationSpec) null, "PrepurchaseCardLoadableListItem", Expect_jvmKt.rememberComposableLambda(-264010509, new BadgedAvatarKt$$ExternalSyntheticLambda4(infoRow, i2, 7), gapComposer), gapComposer, 27648, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 2:
                ((Integer) obj2).intValue();
                DeviceManagerListViewKt.DeviceMap((DeviceManagerDeviceDetailViewModel.Loaded) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((ChatPresenter) obj3).AnnounceMessagesForAccessibility((Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                DisclaimerTextKt.ClockedInSection((ClockInOverlayViewModel.Loaded.ClockedIn) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                DisclaimerTextKt.OnBreakSection((ClockInOverlayViewModel.Loaded.OnBreak) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                ListItemKt.VerificationErrorText((ConfirmVerification.OTPError) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                SectionUIKt.SectionTitle((ResolvableString) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
