package com.squareup.cash.work.applets.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.room.Room;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda2;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda1;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.family.applets.viewmodels.DependentActivityAppletTileViewModel;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.core.ids.AppletTileInstallationSectionId;
import com.squareup.cash.money.core.states.AppletTileInstallationState;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda12;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.transfers.views.AddMoneyViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda12;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.StateFlowKt$stateFlowOf$1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final class WorkAppletTile implements AppletTile {
    public final /* synthetic */ int $r8$classId = 0;
    public final RealImageLoader imageLoader;
    public final StateFlowKt$stateFlowOf$1 installationSectionId;
    public final StateFlow installationState;
    public final StateFlow models;
    public final Object onClick;

    public WorkAppletTile(RealImageLoader realImageLoader, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, StateFlow stateFlow) {
        stateFlow.getClass();
        this.models = stateFlow;
        this.onClick = taxesAppletViewsModule$$ExternalSyntheticLambda1;
        this.imageLoader = realImageLoader;
        this.installationSectionId = new StateFlowKt$stateFlowOf$1(AppletTileInstallationSectionId.SERVICE);
        this.installationState = StateFlowKt.mapState(stateFlow, new CardAppletTile$$ExternalSyntheticLambda0(27));
    }

    public void UI(DependentActivityAppletTileViewModel dependentActivityAppletTileViewModel, AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        float f;
        int i2;
        InstalledAppletTileHeaderModel.Icon icon;
        ActivityEmbeddedViewModel activityEmbeddedViewModel;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-486512583);
        int i3 = (gapComposer.changedInstance(dependentActivityAppletTileViewModel) ? 4 : 2) | i | (gapComposer.changed(appletTileAppearance) ? 32 : 16);
        boolean z = true;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            boolean z2 = appletTileAppearance.useRedesignedTiles;
            AllowanceViewKt$$ExternalSyntheticLambda3 allowanceViewKt$$ExternalSyntheticLambda3 = z2 ? new AllowanceViewKt$$ExternalSyntheticLambda3(28) : new AllowanceViewKt$$ExternalSyntheticLambda3(29);
            if (z2) {
                gapComposer.startReplaceGroup(612855551);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                gapComposer.end(false);
                f = 16.0f;
            } else {
                gapComposer.startReplaceGroup(612856027);
                gapComposer.end(false);
                f = 24.0f;
            }
            if (Intrinsics.areEqual(dependentActivityAppletTileViewModel, DependentActivityAppletTileViewModel.NoActivity.INSTANCE)) {
                gapComposer.startReplaceGroup(1818748069);
                gapComposer.end(false);
            } else {
                if (!(dependentActivityAppletTileViewModel instanceof DependentActivityAppletTileViewModel.Loading) && !(dependentActivityAppletTileViewModel instanceof DependentActivityAppletTileViewModel.Installed)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 612857522, false);
                }
                gapComposer.startReplaceGroup(1818928117);
                UiCallbackModel activityModel = dependentActivityAppletTileViewModel.getActivityModel();
                if (activityModel == null || (activityEmbeddedViewModel = (ActivityEmbeddedViewModel) activityModel.model) == null || !activityEmbeddedViewModel.hasMore) {
                    i2 = 4;
                    z = false;
                } else {
                    i2 = 4;
                }
                String stringResource = Room.stringResource(gapComposer, R.string.family_applet_dependent_activity_title);
                if (z) {
                    gapComposer.startReplaceGroup(1819244999);
                    zzd zzdVar = Icons.Companion;
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    icon = new InstalledAppletTileHeaderModel.Icon(colors.semantic.icon.standard, null);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1819500191);
                    gapComposer.end(false);
                    icon = null;
                }
                InstalledAppletTileHeaderModel installedAppletTileHeaderModel = new InstalledAppletTileHeaderModel(stringResource, null, icon, i2);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(78495762, new MoneyTabUIKt$$ExternalSyntheticLambda12(f, dependentActivityAppletTileViewModel, i2), gapComposer);
                boolean changedInstance = gapComposer.changedInstance(dependentActivityAppletTileViewModel);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ArcadeModal$$ExternalSyntheticLambda2(dependentActivityAppletTileViewModel, 17);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                SharedUIKt.InstalledAppletTile(installedAppletTileHeaderModel, rememberComposableLambda, (Function0) rememberedValue, true, allowanceViewKt$$ExternalSyntheticLambda3, gapComposer, 3120, 0);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarningsHomeKt$$ExternalSyntheticLambda2(this, dependentActivityAppletTileViewModel, appletTileAppearance, i, 15);
        }
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final StateFlow getInstallationSectionId() {
        switch (this.$r8$classId) {
        }
        return this.installationSectionId;
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final StateFlow getInstallationState() {
        switch (this.$r8$classId) {
            case 0:
                return (DerivedStateFlow) this.installationState;
            default:
                return (StateFlowKt$stateFlowOf$1) this.installationState;
        }
    }

    public WorkAppletTile(StateFlow stateFlow, RealImageLoader realImageLoader, RealCashVibrator realCashVibrator) {
        stateFlow.getClass();
        this.models = stateFlow;
        this.imageLoader = realImageLoader;
        this.onClick = realCashVibrator;
        this.installationSectionId = new StateFlowKt$stateFlowOf$1(AppletTileInstallationSectionId.SERVICE);
        this.installationState = new StateFlowKt$stateFlowOf$1(AppletTileInstallationState.Installed.INSTANCE);
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final void UI(AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        int i2;
        int i3;
        int i4 = this.$r8$classId;
        RealImageLoader realImageLoader = this.imageLoader;
        StateFlow stateFlow = this.models;
        appletTileAppearance.getClass();
        switch (i4) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(1229142816);
                if ((i & 48) == 0) {
                    i2 = i | (gapComposer.changedInstance(this) ? 32 : 16);
                } else {
                    i2 = i;
                }
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-1733521440, new WorkViewFactory$$ExternalSyntheticLambda12(22, this, Updater.collectAsState(stateFlow, null, gapComposer, 1)), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(this, appletTileAppearance, i, 28);
                    break;
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startRestartGroup(604428007);
                if ((i & 6) == 0) {
                    i3 = (gapComposer2.changed(appletTileAppearance) ? 4 : 2) | i;
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= gapComposer2.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                    Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), LocalCashVibratorKt.LocalCashVibrator.defaultProvidedValue$runtime((RealCashVibrator) this.onClick)}, Expect_jvmKt.rememberComposableLambda(-556430425, new EarningsHomeKt$$ExternalSyntheticLambda2(14, this, appletTileAppearance, Updater.collectAsState(stateFlow, null, gapComposer2, 1)), gapComposer2), gapComposer2, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(this, appletTileAppearance, i, 23);
                    break;
                }
                break;
        }
    }
}
