package com.squareup.cash.wallet.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfoKt;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.ta$$ExternalSyntheticLambda1;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.ContactInfoSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.PersonalInfoSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.PersonalScreenViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePasscodeSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$BlockedAccountsSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$CashMeSettingViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$ProfileSecurityPolicy;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfileSecurityReadyViewModel$AuthenticatorViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfileSecurityReadyViewModel$PasswordViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfileSecurityViewModel;
import com.squareup.cash.account.settings.viewmodels.RatePlanButtonTreatment;
import com.squareup.cash.account.settings.viewmodels.trustedcontact.TrustedContactSettingViewModel;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.appmessages.InlineAppMessageViewModel;
import com.squareup.cash.appmessages.views.InlineAppMessageKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.list.ListUnorderedItem;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda5;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda2;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.fidesmo.viewmodels.FidesmoScanningPulseShape;
import com.squareup.cash.fidesmo.viewmodels.ScanningStarPlacement;
import com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt;
import com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.fidesmo.views.ScanningPulseStyle;
import com.squareup.cash.fidesmo.views.ScanningStepAnimationTrigger;
import com.squareup.cash.fidesmo.views.StarStepAnimationProgressTracker;
import com.squareup.cash.fidesmo.views.haptic.ProvisioningHaptics;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda4;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionBlockerViewModel;
import com.squareup.cash.instruments.views.InstrumentAvatarUtilsKt;
import com.squareup.cash.localization.viewmodels.LanguageDisclosureViewModel;
import com.squareup.cash.localization.views.LanguageDisclosureViewKt;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.merchant.viewmodels.MerchantBlockingViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantProfileViewModel;
import com.squareup.cash.merchant.views.MerchantProfileViewKt;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda9;
import com.squareup.cash.offers.viewmodels.OffersHomeViewModelV2;
import com.squareup.cash.offers.views.home.OfferTileKt;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerViewEvent;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerViewModel;
import com.squareup.cash.onboarding.accountpicker.views.AliasPickerViewKt;
import com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewModel;
import com.squareup.cash.passkeys.views.PasskeyUpsellViewKt;
import com.squareup.cash.paychecks.viewmodels.DistributePaycheckViewModel;
import com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewModel;
import com.squareup.cash.paychecks.views.DistributePaycheckView;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.phoneplans.PhonePlansHomeViewKt;
import com.squareup.cash.phoneplans.PhonePlansHomeViewModel;
import com.squareup.cash.phoneplans.WirelessProviderListViewModel;
import com.squareup.cash.pools.viewmodels.PoolDetailsViewModel;
import com.squareup.cash.pools.viewmodels.PoolInvitePeopleListViewModel;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.pools.views.PoolsListViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.cash.prepurchasecashcard.views.LocaleToggleKt;
import com.squareup.cash.prepurchasecashcard.views.PrepurchasePlanningSheetHomeKt;
import com.squareup.cash.profile.components.ProfilePhotoKt;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerDeviceDetailViewModel;
import com.squareup.cash.profile.devicemanager.views.DeviceManagerListViewKt;
import com.squareup.cash.profile.viewmodels.ProfileViewModel;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.profile.views.personal.PersonalInfoViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.profile.views.personal.RatePlanSectionKt;
import com.squareup.cash.profile.views.security.WebSectionKt;
import com.squareup.cash.savings.viewmodels.UpsellCardModel$Loaded;
import com.squareup.cash.savings.views.ButtonGroupKt;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda1;
import com.squareup.cash.upsell.viewmodels.NullStateCarouselViewModel;
import com.squareup.cash.wallet.viewmodels.PrepurchaseCardData;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import com.stripe.android.uicore.elements.PlaceHolderKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.jvm.KTypesJvm;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import okhttp3.internal.Tags;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class HeroCardViewKt$$ExternalSyntheticLambda1 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda1(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    private final Object invoke$com$squareup$cash$profile$views$personal$PersonalInfoViewKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3, Object obj4) {
        ?? r13;
        Modifier modifier;
        PersonalScreenViewModel personalScreenViewModel = (PersonalScreenViewModel) obj2;
        Composer composer = (Composer) obj3;
        ((Integer) obj4).getClass();
        ((AnimatedContentScopeImpl) obj).getClass();
        personalScreenViewModel.getClass();
        PersonalScreenViewModel.Default r1 = (PersonalScreenViewModel.Default) personalScreenViewModel;
        ScrollState rememberScrollState = ImageKt.rememberScrollState(composer);
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(ImageKt.verticalScroll$default(companion, rememberScrollState, false, 14));
        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer, 0);
        GapComposer gapComposer = (GapComposer) composer;
        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
        Modifier materializeModifier = PlatformKt.materializeModifier(composer, navigationBarsPadding);
        ComposeUiNode.Companion.getClass();
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
        GapComposer gapComposer2 = (GapComposer) composer;
        if (gapComposer2.applier == null) {
            Updater.invalidApplier();
            throw null;
        }
        gapComposer2.startReusableNode();
        if (gapComposer2.inserting) {
            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
        } else {
            gapComposer2.useNode();
        }
        Updater.m576setimpl(composer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
        Updater.m576setimpl(composer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
        Updater.m576setimpl(composer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
        Updater.m575reconcileimpl(composer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
        Updater.m576setimpl(composer, materializeModifier, ComposeUiNode.Companion.SetModifier);
        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
        Strings.getSizes(composer).getClass();
        DefaultSizes.spacing.getClass();
        Strings.getSizes(composer).getClass();
        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(composer).semantic.text.subtle, composer, SpacerKt.m299paddingVpY3zN4(fillMaxWidth, 16.0f, 8.0f), Strings.getTypography(composer).bodyMedium, (TextLineBalancing) null, Room.stringResource(composer, R.string.profile_personal_info_breadcrumb), (Map) null, (Function1) null, false);
        InlineAppMessageViewModel inlineAppMessageViewModel = r1.appMessageViewModel;
        InlineAppMessageViewModel.Ready ready = inlineAppMessageViewModel instanceof InlineAppMessageViewModel.Ready ? (InlineAppMessageViewModel.Ready) inlineAppMessageViewModel : null;
        Function1 function1 = this.f$0;
        Object obj5 = Composer.Companion.Empty;
        if (ready == null) {
            gapComposer2.startReplaceGroup(-232691265);
            r13 = 0;
            gapComposer2.end(false);
        } else {
            r13 = 0;
            gapComposer2.startReplaceGroup(-232691264);
            DBUtil.SpacerWithinSectionMedium(0, 1, composer, null);
            Strings.getSizes(composer).getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            Strings.getSizes(composer).getClass();
            Object obj6 = DefaultSizes.border.annotationsMap;
            long j = Strings.getColors(composer).semantic.border.subtle;
            Strings.getSizes(composer).getClass();
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(m300paddingVpY3zN4$default, 1.0f, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            Strings.getSizes(composer).getClass();
            Modifier clip = ClipKt.clip(m178borderxT4_qwU, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            boolean changed = gapComposer2.changed(function1);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changed || rememberedValue == obj5) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda3(25, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            InlineAppMessageKt.InlineAppMessage(ready, (Function1) rememberedValue, clip, composer, 0);
            gapComposer2.end(false);
        }
        UiCallbackModel uiCallbackModel = r1.personalInfoSectionViewModel;
        if (uiCallbackModel == null) {
            gapComposer2.startReplaceGroup(-231957557);
            gapComposer2.end(r13);
        } else {
            gapComposer2.startReplaceGroup(-231957556);
            uiCallbackModel.Show(Expect_jvmKt.rememberComposableLambda(-474415619, new HeroCardViewKt$$ExternalSyntheticLambda1(function1, r13, 20), composer), composer, 6);
            gapComposer2.end(r13);
        }
        ContactInfoSectionViewModel contactInfoSectionViewModel = r1.contactInfoSectionViewModel;
        if (contactInfoSectionViewModel == null) {
            gapComposer2.startReplaceGroup(-231431270);
            gapComposer2.end(r13);
        } else {
            gapComposer2.startReplaceGroup(-231431269);
            DBUtil.SpacerBetweenSectionXLarge(r13, 1, composer, null);
            boolean changed2 = gapComposer2.changed(function1);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue2 == obj5) {
                rememberedValue2 = new ProfileKt$$ExternalSyntheticLambda3(26, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            RatePlanSectionKt.ContactInfoSection(contactInfoSectionViewModel, (Function1) rememberedValue2, null, composer, 0, 4);
            gapComposer2.end(r13);
        }
        gapComposer2.startReplaceGroup(-231236838);
        gapComposer2.end(r13);
        RatePlanButtonTreatment ratePlanButtonTreatment = r1.ratePlanButtonTreatment;
        if (ratePlanButtonTreatment instanceof RatePlanButtonTreatment.Omit) {
            ratePlanButtonTreatment = null;
        }
        if (ratePlanButtonTreatment == null) {
            gapComposer2.startReplaceGroup(-230961961);
            gapComposer2.end(r13);
            modifier = null;
        } else {
            gapComposer2.startReplaceGroup(-230961960);
            DBUtil.SpacerBetweenSectionXLarge(r13, 1, composer, null);
            boolean changed3 = gapComposer2.changed(function1);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue3 == obj5) {
                rememberedValue3 = new ProfileKt$$ExternalSyntheticLambda3(27, function1);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            modifier = null;
            RatePlanSectionKt.RatePlanSection(ratePlanButtonTreatment, (Function1) rememberedValue3, null, composer, r13);
            gapComposer2.end(r13);
        }
        DBUtil.SpacerBetweenSectionLarge(r13, 1, composer, modifier);
        gapComposer2.end(true);
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$profile$views$personal$PersonalInfoViewKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3, Object obj4) {
        PersonalInfoSectionViewModel personalInfoSectionViewModel = (PersonalInfoSectionViewModel) obj;
        Function1 function1 = (Function1) obj2;
        Composer composer = (Composer) obj3;
        int intValue = ((Integer) obj4).intValue();
        personalInfoSectionViewModel.getClass();
        function1.getClass();
        boolean z = true;
        DBUtil.SpacerBetweenSectionLarge(0, 1, composer, null);
        GapComposer gapComposer = (GapComposer) composer;
        Function1 function12 = this.f$0;
        boolean changed = gapComposer.changed(function12);
        if ((((intValue & 112) ^ 48) <= 32 || !gapComposer.changed(function1)) && (intValue & 48) != 32) {
            z = false;
        }
        boolean z2 = changed | z;
        Object rememberedValue = gapComposer.rememberedValue();
        if (z2 || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new PersonalInfoViewKt$$ExternalSyntheticLambda9(function12, function1, 0);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        RatePlanSectionKt.PersonalInfoSection(personalInfoSectionViewModel, (Function1) rememberedValue, null, gapComposer, intValue & 14, 4);
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$profile$views$security$ProfilePrivacyViewKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3, Object obj4) {
        ProfilePrivacyViewModel profilePrivacyViewModel = (ProfilePrivacyViewModel) obj2;
        Composer composer = (Composer) obj3;
        ((Integer) obj4).getClass();
        ((AnimatedContentScopeImpl) obj).getClass();
        profilePrivacyViewModel.getClass();
        if (!(profilePrivacyViewModel instanceof ProfilePrivacyViewModel.Ready)) {
            return Unit.INSTANCE;
        }
        if (1.0f <= 0.0d) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
        }
        Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), ImageKt.rememberScrollState(composer), false, 14));
        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer, 0);
        GapComposer gapComposer = (GapComposer) composer;
        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
        Modifier materializeModifier = PlatformKt.materializeModifier(composer, navigationBarsPadding);
        ComposeUiNode.Companion.getClass();
        Function0 function0 = ComposeUiNode.Companion.Constructor;
        GapComposer gapComposer2 = (GapComposer) composer;
        if (gapComposer2.applier == null) {
            Updater.invalidApplier();
            throw null;
        }
        gapComposer2.startReusableNode();
        if (gapComposer2.inserting) {
            gapComposer2.createNode(function0);
        } else {
            gapComposer2.useNode();
        }
        Updater.m576setimpl(composer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
        Updater.m576setimpl(composer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
        Updater.m576setimpl(composer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
        Updater.m575reconcileimpl(composer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
        Updater.m576setimpl(composer, materializeModifier, ComposeUiNode.Companion.SetModifier);
        DBUtil.SpacerWithinSectionMedium(0, 1, composer, null);
        ProfilePrivacyViewModel.Ready ready = (ProfilePrivacyViewModel.Ready) profilePrivacyViewModel;
        boolean z = ready.contactsSync;
        Function1 function1 = this.f$0;
        boolean changed = gapComposer2.changed(function1);
        Object rememberedValue = gapComposer2.rememberedValue();
        Object obj5 = Composer.Companion.Empty;
        if (changed || rememberedValue == obj5) {
            rememberedValue = new InfoSectionKt$$ExternalSyntheticLambda1(2, function1);
            gapComposer2.updateRememberedValue(rememberedValue);
        }
        WebSectionKt.SyncContactsSection(z, (Function1) rememberedValue, null, composer, 0, 4);
        ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel = ready.allowedAccountsSectionViewModel;
        if (profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel == null) {
            gapComposer2.startReplaceGroup(-790135856);
            gapComposer2.end(false);
        } else {
            gapComposer2.startReplaceGroup(-790135855);
            boolean changed2 = gapComposer2.changed(function1);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue2 == obj5) {
                rememberedValue2 = new InfoSectionKt$$ExternalSyntheticLambda1(3, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            WebSectionKt.AllowedAccountsSection(profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel, (Function1) rememberedValue2, null, composer, 0, 4);
            gapComposer2.end(false);
        }
        ProfilePrivacyReadyViewModel$BlockedAccountsSectionViewModel profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel = ready.blockedAccountsSectionModel;
        if (profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel == null) {
            gapComposer2.startReplaceGroup(-789914888);
            gapComposer2.end(false);
        } else {
            gapComposer2.startReplaceGroup(-789914887);
            boolean changed3 = gapComposer2.changed(function1);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue3 == obj5) {
                rememberedValue3 = new InfoSectionKt$$ExternalSyntheticLambda1(4, function1);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            WebSectionKt.BlockedAccountsSection(profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel, (Function1) rememberedValue3, null, composer, 0, 4);
            gapComposer2.end(false);
        }
        if (ready.showIncomingRequestsSection) {
            gapComposer2.startReplaceGroup(-789665523);
            ProfilePrivacyReadyViewModel$ProfileSecurityPolicy profilePrivacyReadyViewModel$ProfileSecurityPolicy = ready.policy;
            boolean changed4 = gapComposer2.changed(function1);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changed4 || rememberedValue4 == obj5) {
                rememberedValue4 = new InfoSectionKt$$ExternalSyntheticLambda1(5, function1);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            WebSectionKt.RequestsSection(profilePrivacyReadyViewModel$ProfileSecurityPolicy, (Function1) rememberedValue4, null, composer, 0, 4);
            gapComposer2.end(false);
        } else {
            gapComposer2.startReplaceGroup(-789438727);
            gapComposer2.end(false);
        }
        ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel profilePrivacyReadyViewModel$SearchPrivacySectionViewModel = ready.searchPrivacySectionViewModel;
        if ((profilePrivacyReadyViewModel$SearchPrivacySectionViewModel instanceof ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel.Content ? (ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel.Content) profilePrivacyReadyViewModel$SearchPrivacySectionViewModel : null) == null) {
            gapComposer2.startReplaceGroup(-789321393);
            gapComposer2.end(false);
        } else {
            gapComposer2.startReplaceGroup(-789321392);
            boolean changed5 = gapComposer2.changed(function1);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed5 || rememberedValue5 == obj5) {
                rememberedValue5 = new InfoSectionKt$$ExternalSyntheticLambda1(6, function1);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            WebSectionKt.SearchVisibilitySection(0, 2, composer, null, (Function1) rememberedValue5);
            gapComposer2.end(false);
        }
        ProfilePrivacyReadyViewModel$CashMeSettingViewModel profilePrivacyReadyViewModel$CashMeSettingViewModel = ready.cashMeSettingModel;
        if (!profilePrivacyReadyViewModel$CashMeSettingViewModel.showCashMeSection) {
            profilePrivacyReadyViewModel$CashMeSettingViewModel = null;
        }
        if (profilePrivacyReadyViewModel$CashMeSettingViewModel == null) {
            gapComposer2.startReplaceGroup(-789049027);
            gapComposer2.end(false);
        } else {
            gapComposer2.startReplaceGroup(-789049026);
            boolean changed6 = gapComposer2.changed(function1);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changed6 || rememberedValue6 == obj5) {
                rememberedValue6 = new ProfileKt$$ExternalSyntheticLambda3(28, function1);
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            WebSectionKt.WebSection(profilePrivacyReadyViewModel$CashMeSettingViewModel, (Function1) rememberedValue6, null, composer, 0);
            gapComposer2.end(false);
        }
        ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel profilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel = ready.personalizedAdsSettingModel;
        boolean changed7 = gapComposer2.changed(function1);
        Object rememberedValue7 = gapComposer2.rememberedValue();
        if (changed7 || rememberedValue7 == obj5) {
            rememberedValue7 = new ProfileKt$$ExternalSyntheticLambda3(29, function1);
            gapComposer2.updateRememberedValue(rememberedValue7);
        }
        Function1 function12 = (Function1) rememberedValue7;
        boolean changed8 = gapComposer2.changed(function1);
        Object rememberedValue8 = gapComposer2.rememberedValue();
        if (changed8 || rememberedValue8 == obj5) {
            rememberedValue8 = new InfoSectionKt$$ExternalSyntheticLambda1(1, function1);
            gapComposer2.updateRememberedValue(rememberedValue8);
        }
        WebSectionKt.PersonalizedAdsSection(profilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel, function12, (Function1) rememberedValue8, null, composer, 0, 8);
        DBUtil.SpacerBetweenSectionLarge(0, 1, composer, null);
        gapComposer2.end(true);
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$profile$views$security$ProfileSecurityViewKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3, Object obj4) {
        ProfileSecurityViewModel profileSecurityViewModel = (ProfileSecurityViewModel) obj2;
        Composer composer = (Composer) obj3;
        ((Integer) obj4).getClass();
        ((AnimatedContentScopeImpl) obj).getClass();
        profileSecurityViewModel.getClass();
        if (!(profileSecurityViewModel instanceof ProfileSecurityViewModel.Ready)) {
            return Unit.INSTANCE;
        }
        if (1.0f <= 0.0d) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
        }
        Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), ImageKt.rememberScrollState(composer), false, 14));
        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer, 0);
        GapComposer gapComposer = (GapComposer) composer;
        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
        Modifier materializeModifier = PlatformKt.materializeModifier(composer, navigationBarsPadding);
        ComposeUiNode.Companion.getClass();
        Function0 function0 = ComposeUiNode.Companion.Constructor;
        GapComposer gapComposer2 = (GapComposer) composer;
        if (gapComposer2.applier == null) {
            Updater.invalidApplier();
            throw null;
        }
        gapComposer2.startReusableNode();
        if (gapComposer2.inserting) {
            gapComposer2.createNode(function0);
        } else {
            gapComposer2.useNode();
        }
        Updater.m576setimpl(composer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
        Updater.m576setimpl(composer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
        Updater.m576setimpl(composer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
        Updater.m575reconcileimpl(composer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
        Updater.m576setimpl(composer, materializeModifier, ComposeUiNode.Companion.SetModifier);
        DBUtil.SpacerWithinSectionMedium(0, 1, composer, null);
        ProfileSecurityViewModel.Ready ready = (ProfileSecurityViewModel.Ready) profileSecurityViewModel;
        ProfileSecurityReadyViewModel$AuthenticatorViewModel profileSecurityReadyViewModel$AuthenticatorViewModel = ready.authenticatorViewModel;
        ProfileSecurityReadyViewModel$PasswordViewModel profileSecurityReadyViewModel$PasswordViewModel = ready.passwordViewModel;
        ProfilePasscodeSectionViewModel profilePasscodeSectionViewModel = ready.passcodeSectionViewModel;
        Function1 function1 = this.f$0;
        Object obj5 = Composer.Companion.Empty;
        if (profilePasscodeSectionViewModel == null) {
            gapComposer2.startReplaceGroup(-751387808);
            gapComposer2.end(false);
        } else {
            gapComposer2.startReplaceGroup(-751387807);
            boolean changed = gapComposer2.changed(function1);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changed || rememberedValue == obj5) {
                rememberedValue = new InfoSectionKt$$ExternalSyntheticLambda1(7, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            WebSectionKt.SecurityLockSection(0, composer, null, profilePasscodeSectionViewModel, (Function1) rememberedValue);
            gapComposer2.end(false);
        }
        ProfileSecurityViewModel.Ready.CashPinViewModel cashPinViewModel = ready.cashPinViewModel;
        if (cashPinViewModel == null) {
            gapComposer2.startReplaceGroup(-751174125);
            gapComposer2.end(false);
        } else {
            gapComposer2.startReplaceGroup(-751174124);
            boolean changed2 = gapComposer2.changed(function1);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue2 == obj5) {
                rememberedValue2 = new InfoSectionKt$$ExternalSyntheticLambda1(8, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            WebSectionKt.CashPinSection(cashPinViewModel, (Function1) rememberedValue2, null, composer, 0, 4);
            gapComposer2.end(false);
        }
        TrustedContactSettingViewModel trustedContactSettingViewModel = ready.trustedContactViewModel;
        if (trustedContactSettingViewModel == null) {
            gapComposer2.startReplaceGroup(-750939517);
            gapComposer2.end(false);
        } else {
            gapComposer2.startReplaceGroup(-750939516);
            boolean changed3 = gapComposer2.changed(function1);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue3 == obj5) {
                rememberedValue3 = new InfoSectionKt$$ExternalSyntheticLambda1(9, function1);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            WebSectionKt.TrustedContactsSection(trustedContactSettingViewModel, (Function1) rememberedValue3, null, composer, 0, 4);
            gapComposer2.end(false);
        }
        if (profileSecurityReadyViewModel$PasswordViewModel.showPasswordSection || profileSecurityReadyViewModel$AuthenticatorViewModel.showAuthenticatorSection) {
            gapComposer2.startReplaceGroup(-750538159);
            DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, composer, null);
            boolean changed4 = gapComposer2.changed(function1);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changed4 || rememberedValue4 == obj5) {
                rememberedValue4 = new InfoSectionKt$$ExternalSyntheticLambda1(10, function1);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            WebSectionKt.TaxesAccessSection(profileSecurityReadyViewModel$PasswordViewModel, profileSecurityReadyViewModel$AuthenticatorViewModel, (Function1) rememberedValue4, null, composer, 0, 8);
            composer = composer;
            gapComposer2.end(false);
        } else {
            gapComposer2.startReplaceGroup(-750265235);
            gapComposer2.end(false);
        }
        DBUtil.SpacerBetweenSectionLarge(0, 1, composer, null);
        gapComposer2.end(true);
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$savings$views$UpsellCardSheetViewKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3, Object obj4) {
        UpsellCardModel$Loaded upsellCardModel$Loaded = (UpsellCardModel$Loaded) obj2;
        Composer composer = (Composer) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((AnimatedContentScopeImpl) obj).getClass();
        upsellCardModel$Loaded.getClass();
        Modifier verticalScroll$default = ImageKt.verticalScroll$default(Modifier.Companion.$$INSTANCE, ImageKt.rememberScrollState(composer), false, 14);
        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer, 0);
        GapComposer gapComposer = (GapComposer) composer;
        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
        Modifier materializeModifier = PlatformKt.materializeModifier(composer, verticalScroll$default);
        ComposeUiNode.Companion.getClass();
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
        GapComposer gapComposer2 = (GapComposer) composer;
        if (gapComposer2.applier == null) {
            Updater.invalidApplier();
            throw null;
        }
        gapComposer2.startReusableNode();
        if (gapComposer2.inserting) {
            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
        } else {
            gapComposer2.useNode();
        }
        Updater.m576setimpl(composer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
        Updater.m576setimpl(composer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
        Updater.m576setimpl(composer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
        Updater.m575reconcileimpl(composer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
        Updater.m576setimpl(composer, materializeModifier, ComposeUiNode.Companion.SetModifier);
        ButtonGroupKt.SavingsUpsellSheet((intValue >> 3) & 14, composer, null, upsellCardModel$Loaded, this.f$0);
        gapComposer2.end(true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0aa4  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0aca  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0b0c  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0b5e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0b8b  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0bb8  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0d7b  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0b39  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0ad5  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0aad  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0a6f  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x09fe  */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // kotlin.jvm.functions.Function4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ?? r7;
        ProvisioningHaptics provisioningHaptics;
        final ProvisioningHaptics provisioningHaptics2;
        boolean z;
        long j;
        boolean z2;
        int i;
        ScanningStarPlacement scanningStarPlacement;
        int i2;
        int i3;
        boolean z3;
        int i4;
        float f;
        float f2;
        float f3;
        Integer num;
        Integer num2;
        Integer num3;
        float f4;
        ScanningStepAnimationTrigger scanningStepAnimationTrigger;
        boolean changedInstance;
        Object rememberedValue;
        FidesmoProvisioningViewModel fidesmoProvisioningViewModel;
        Object rememberedValue2;
        Integer num4;
        Integer num5;
        int intValue;
        ScanningStepAnimationTrigger scanningStepAnimationTrigger2;
        boolean z4;
        Integer num6;
        String m;
        BlendModeColorFilter blendModeColorFilter;
        Color m2;
        Icons icons;
        String m3;
        Color m4;
        int i5 = this.$r8$classId;
        int i6 = 2;
        final int i7 = 1;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj5 = Composer.Companion.Empty;
        BlendModeColorFilter blendModeColorFilter2 = null;
        int i8 = 14;
        final int i9 = 0;
        final Function1 function1 = this.f$0;
        switch (i5) {
            case 0:
                PrepurchaseCardData.CardHeader cardHeader = (PrepurchaseCardData.CardHeader) obj2;
                Composer composer = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer, 0);
                GapComposer gapComposer = (GapComposer) composer;
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(composer, companion);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(composer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                if (cardHeader != null) {
                    gapComposer2.startReplaceGroup(501206679);
                    r7 = 0;
                    DBUtil.SpacerWithinSectionMedium(0, 1, composer, null);
                    gapComposer2.end(false);
                } else {
                    r7 = 0;
                    gapComposer2.startReplaceGroup(501253768);
                    gapComposer2.end(false);
                }
                if (cardHeader == null) {
                    gapComposer2.startReplaceGroup(501285511);
                } else {
                    gapComposer2.startReplaceGroup(501285512);
                    UtilsKt.PrepurchaseCardHeaderView(cardHeader, function1, null, composer, r7);
                }
                gapComposer2.end(r7);
                gapComposer2.end(true);
                return Unit.INSTANCE;
            case 1:
                FidesmoProvisioningViewModel fidesmoProvisioningViewModel2 = (FidesmoProvisioningViewModel) obj2;
                int intValue2 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) ((Composer) obj3);
                Object consume = gapComposer3.consume(InspectionModeKt.LocalInspectionMode);
                Applier applier = gapComposer3.applier;
                Continuation continuation = null;
                if (((Boolean) consume).booleanValue()) {
                    gapComposer3.startReplaceGroup(2051802926);
                    gapComposer3.end(false);
                    provisioningHaptics = null;
                } else {
                    gapComposer3.startReplaceGroup(-72361236);
                    provisioningHaptics = StateFlowsComposeKt.rememberProvisioningHaptics(gapComposer3);
                    gapComposer3.end(false);
                }
                Object rememberedValue3 = gapComposer3.rememberedValue();
                if (rememberedValue3 == obj5) {
                    rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer3.updateRememberedValue(rememberedValue3);
                }
                MutableState mutableState = (MutableState) rememberedValue3;
                Unit unit = Unit.INSTANCE;
                boolean changedInstance2 = gapComposer3.changedInstance(provisioningHaptics);
                Object rememberedValue4 = gapComposer3.rememberedValue();
                if (changedInstance2 || rememberedValue4 == obj5) {
                    rememberedValue4 = new FidesmoProvisioningViewKt$$ExternalSyntheticLambda7(provisioningHaptics, 0);
                    gapComposer3.updateRememberedValue(rememberedValue4);
                }
                Updater.DisposableEffect(unit, (Function1) rememberedValue4, gapComposer3);
                boolean changedInstance3 = gapComposer3.changedInstance(fidesmoProvisioningViewModel2) | gapComposer3.changedInstance(provisioningHaptics);
                Object rememberedValue5 = gapComposer3.rememberedValue();
                if (changedInstance3 || rememberedValue5 == obj5) {
                    ProvisioningHaptics provisioningHaptics3 = provisioningHaptics;
                    rememberedValue5 = new GLSceneScopeProvider$SceneScope$2$1$1(fidesmoProvisioningViewModel2, provisioningHaptics3, mutableState, continuation, 17);
                    provisioningHaptics2 = provisioningHaptics3;
                    gapComposer3.updateRememberedValue(rememberedValue5);
                } else {
                    provisioningHaptics2 = provisioningHaptics;
                }
                int i10 = (intValue2 >> 3) & 14;
                Updater.LaunchedEffect(gapComposer3, fidesmoProvisioningViewModel2, (Function2) rememberedValue5);
                Object rememberedValue6 = gapComposer3.rememberedValue();
                if (rememberedValue6 == obj5) {
                    rememberedValue6 = Updater.mutableStateOf$default(new IntSize(0L));
                    gapComposer3.updateRememberedValue(rememberedValue6);
                }
                final MutableState mutableState2 = (MutableState) rememberedValue6;
                Object rememberedValue7 = gapComposer3.rememberedValue();
                if (rememberedValue7 == obj5) {
                    rememberedValue7 = Updater.mutableStateOf$default(new IntSize(0L));
                    gapComposer3.updateRememberedValue(rememberedValue7);
                }
                MutableState mutableState3 = (MutableState) rememberedValue7;
                Object rememberedValue8 = gapComposer3.rememberedValue();
                if (rememberedValue8 == obj5) {
                    rememberedValue8 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer3.updateRememberedValue(rememberedValue8);
                }
                final MutableState mutableState4 = (MutableState) rememberedValue8;
                Object rememberedValue9 = gapComposer3.rememberedValue();
                if (rememberedValue9 == obj5) {
                    rememberedValue9 = Updater.mutableStateOf$default(ScanningStarPlacement.Companion.TopCenter);
                    gapComposer3.updateRememberedValue(rememberedValue9);
                }
                MutableState mutableState5 = (MutableState) rememberedValue9;
                Object rememberedValue10 = gapComposer3.rememberedValue();
                if (rememberedValue10 == obj5) {
                    rememberedValue10 = new StarStepAnimationProgressTracker();
                    gapComposer3.updateRememberedValue(rememberedValue10);
                }
                StarStepAnimationProgressTracker starStepAnimationProgressTracker = (StarStepAnimationProgressTracker) rememberedValue10;
                Density density = (Density) gapComposer3.consume(CompositionLocalsKt.LocalDensity);
                boolean z5 = fidesmoProvisioningViewModel2 instanceof FidesmoProvisioningViewModel.Activating;
                ScanningStarPlacement scanningStarPlacement2 = z5 ? ((FidesmoProvisioningViewModel.Activating) fidesmoProvisioningViewModel2).starPlacement : fidesmoProvisioningViewModel2 instanceof FidesmoProvisioningViewModel.Scanning.InProgress ? ((FidesmoProvisioningViewModel.Scanning.InProgress) fidesmoProvisioningViewModel2).starPlacement : null;
                final ScanningPulseStyle scanningPulseStyle = FidesmoProvisioningViewKt.toScanningPulseStyle(z5 ? ((FidesmoProvisioningViewModel.Activating) fidesmoProvisioningViewModel2).pulseShape : fidesmoProvisioningViewModel2 instanceof FidesmoProvisioningViewModel.Scanning.InProgress ? ((FidesmoProvisioningViewModel.Scanning.InProgress) fidesmoProvisioningViewModel2).pulseShape : FidesmoScanningPulseShape.STAR);
                boolean changedInstance4 = gapComposer3.changedInstance(scanningStarPlacement2);
                Object rememberedValue11 = gapComposer3.rememberedValue();
                if (changedInstance4 || rememberedValue11 == obj5) {
                    z = z5;
                    rememberedValue11 = new GLSceneScope$$ExternalSyntheticLambda4(i8, scanningStarPlacement2, mutableState5);
                    gapComposer3.updateRememberedValue(rememberedValue11);
                } else {
                    z = z5;
                }
                Updater.SideEffect((Function0) rememberedValue11, gapComposer3);
                if (((int) (((IntSize) mutableState2.getValue()).packedValue >> 32)) > 0) {
                    IntSize intSize = (IntSize) mutableState2.getValue();
                    j = BodyPartID.bodyIdMax;
                    if (((int) (intSize.packedValue & BodyPartID.bodyIdMax)) > 0) {
                        z2 = true;
                        boolean z6 = scanningStarPlacement2 == null && z2;
                        if (!z || (fidesmoProvisioningViewModel2 instanceof FidesmoProvisioningViewModel.Scanning.InProgress) || (fidesmoProvisioningViewModel2 instanceof FidesmoProvisioningViewModel.Scanning.Disconnected)) {
                            int roundToInt = MathKt__MathJVMKt.roundToInt(density.mo236toPx0680j_4(96.0f));
                            i = (int) (((IntSize) mutableState2.getValue()).packedValue & j);
                            scanningStarPlacement = scanningStarPlacement2;
                            int i11 = (int) (((IntSize) mutableState3.getValue()).packedValue & j);
                            if (i > 0) {
                                i2 = Integer.MAX_VALUE;
                            } else {
                                int i12 = i - roundToInt;
                                if (i11 < 0) {
                                    i11 = 0;
                                }
                                int i13 = i12 - i11;
                                i2 = i13 < 0 ? 0 : i13;
                            }
                            i3 = i2;
                        } else {
                            scanningStarPlacement = scanningStarPlacement2;
                            i3 = Integer.MAX_VALUE;
                        }
                        if (fidesmoProvisioningViewModel2 instanceof FidesmoProvisioningViewModel.Scanning.InProgress) {
                            z3 = z6;
                            i4 = 0;
                            if (z) {
                                gapComposer3.startReplaceGroup(2055940404);
                                gapComposer3.end(false);
                                f = 1.0f;
                                f2 = RangesKt___RangesKt.coerceIn(((FidesmoProvisioningViewModel.Activating) fidesmoProvisioningViewModel2).verifiedStableConnectionPercent, RecyclerView.DECELERATION_RATE, 1.0f);
                            } else {
                                f = 1.0f;
                                gapComposer3.startReplaceGroup(2056197177);
                                gapComposer3.end(false);
                                f2 = 0.0f;
                            }
                            f3 = f;
                            num = null;
                            num2 = null;
                            num3 = null;
                        } else {
                            gapComposer3.startReplaceGroup(2055256699);
                            FidesmoProvisioningViewModel.Scanning.InProgress inProgress = (FidesmoProvisioningViewModel.Scanning.InProgress) fidesmoProvisioningViewModel2;
                            Integer num7 = inProgress.totalSteps;
                            Integer num8 = inProgress.currentStep;
                            z3 = z6;
                            Integer num9 = inProgress.progressPercent;
                            if (num9 != null) {
                                gapComposer3.startReplaceGroup(2055321117);
                                z4 = 0;
                                gapComposer3.end(false);
                                num6 = num9;
                            } else if (num8 == null || num7 == null) {
                                z4 = 0;
                                gapComposer3.startReplaceGroup(2055452309);
                                gapComposer3.end(false);
                                num6 = null;
                            } else {
                                gapComposer3.startReplaceGroup(2055492609);
                                int rememberScanningProgressPercent = PlaceHolderKt.rememberScanningProgressPercent(num8, num7, gapComposer3);
                                z4 = 0;
                                gapComposer3.end(false);
                                num6 = Integer.valueOf(rememberScanningProgressPercent);
                            }
                            Integer valueOf = Integer.valueOf(inProgress.starStepAnimationPercentInterval);
                            Integer valueOf2 = Integer.valueOf(inProgress.starStepAnimationTurnsPerInterval);
                            gapComposer3.end(z4);
                            num3 = valueOf2;
                            f2 = RecyclerView.DECELERATION_RATE;
                            f3 = 1.0f;
                            num2 = valueOf;
                            num = num6;
                            i4 = z4;
                        }
                        final int i14 = i3;
                        float floatValue = !z ? ((Number) AnimateAsStateKt.animateFloatAsState(f2, AnimatableKt.tween$default(f2 < f3 ? EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE : 430, i4, EasingKt.LinearEasing, 2), "stability_star_progress", null, gapComposer3, 3072, 20).getValue()).floatValue() : RecyclerView.DECELERATION_RATE;
                        if (num != null && num2 != null && num3 != null) {
                            int intValue3 = num2.intValue();
                            num4 = starStepAnimationProgressTracker.stepAnimationPercentInterval;
                            if (num4 != null && intValue3 == num4.intValue()) {
                                int intValue4 = num3.intValue();
                                num5 = starStepAnimationProgressTracker.stepAnimationTurnsPerInterval;
                                if (num5 != null && intValue4 == num5.intValue()) {
                                    Integer num10 = starStepAnimationProgressTracker.progressPercent;
                                    int intValue5 = num.intValue();
                                    intValue = num2.intValue();
                                    int intValue6 = num3.intValue();
                                    if (intValue > 0) {
                                        a$$ExternalSyntheticBUOutline0.m$3("intervalPercent must be positive.");
                                    } else if (intValue6 > 0) {
                                        if (num10 != null) {
                                            int intValue7 = ((intValue5 / intValue) - (num10.intValue() / intValue)) * intValue6;
                                            if (intValue7 > 0) {
                                                f4 = floatValue;
                                                scanningStepAnimationTrigger2 = new ScanningStepAnimationTrigger(intValue5, intValue7);
                                                scanningStepAnimationTrigger = scanningStepAnimationTrigger2;
                                                changedInstance = gapComposer3.changedInstance(fidesmoProvisioningViewModel2) | gapComposer3.changedInstance(starStepAnimationProgressTracker) | gapComposer3.changed(num) | gapComposer3.changed(num2) | gapComposer3.changed(num3);
                                                rememberedValue = gapComposer3.rememberedValue();
                                                if (!changedInstance || rememberedValue == obj5) {
                                                    fidesmoProvisioningViewModel = fidesmoProvisioningViewModel2;
                                                    rememberedValue = new ta$$ExternalSyntheticLambda1(fidesmoProvisioningViewModel, starStepAnimationProgressTracker, num, num2, num3, 11);
                                                    gapComposer3.updateRememberedValue(rememberedValue);
                                                } else {
                                                    fidesmoProvisioningViewModel = fidesmoProvisioningViewModel2;
                                                }
                                                Updater.SideEffect((Function0) rememberedValue, gapComposer3);
                                                Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                                                rememberedValue2 = gapComposer3.rememberedValue();
                                                if (rememberedValue2 == obj5) {
                                                    rememberedValue2 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(7, mutableState2);
                                                    gapComposer3.updateRememberedValue(rememberedValue2);
                                                }
                                                Modifier onSizeChanged = RulerKt.onSizeChanged(fillMaxSize, (Function1) rememberedValue2);
                                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                                int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                                                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, onSizeChanged);
                                                ComposeUiNode.Companion.getClass();
                                                Function0 function0 = ComposeUiNode.Companion.Constructor;
                                                if (applier != null) {
                                                    Updater.invalidApplier();
                                                    throw null;
                                                }
                                                gapComposer3.startReusableNode();
                                                if (gapComposer3.inserting) {
                                                    gapComposer3.createNode(function0);
                                                } else {
                                                    gapComposer3.useNode();
                                                }
                                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                                                Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                                                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                                                Integer valueOf3 = Integer.valueOf(hashCode2);
                                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                                                Updater.m576setimpl(gapComposer3, valueOf3, composeUiNode$Companion$SetModifier$13);
                                                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                                                Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                                                Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                                                final float f5 = f4;
                                                final ScanningStepAnimationTrigger scanningStepAnimationTrigger3 = scanningStepAnimationTrigger;
                                                final FidesmoProvisioningViewModel fidesmoProvisioningViewModel3 = fidesmoProvisioningViewModel;
                                                final ScanningStarPlacement scanningStarPlacement3 = scanningStarPlacement;
                                                AnimatedContentKt.AnimatedVisibility(z3, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-1915987023, new Function3() { // from class: com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt$$ExternalSyntheticLambda11
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                        Composer composer2 = (Composer) obj7;
                                                        ((Integer) obj8).getClass();
                                                        ((AnimatedVisibilityScope) obj6).getClass();
                                                        ScanningStarPlacement scanningStarPlacement4 = ScanningStarPlacement.this;
                                                        if (scanningStarPlacement4 != null) {
                                                            GapComposer gapComposer4 = (GapComposer) composer2;
                                                            gapComposer4.startReplaceGroup(946030004);
                                                            long j2 = ((IntSize) mutableState2.getValue()).packedValue;
                                                            FidesmoProvisioningViewModel fidesmoProvisioningViewModel4 = fidesmoProvisioningViewModel3;
                                                            boolean z7 = ((fidesmoProvisioningViewModel4 instanceof FidesmoProvisioningViewModel.Activating) && ((FidesmoProvisioningViewModel.Activating) fidesmoProvisioningViewModel4).connected) || (fidesmoProvisioningViewModel4 instanceof FidesmoProvisioningViewModel.Scanning.InProgress);
                                                            ProvisioningHaptics provisioningHaptics4 = provisioningHaptics2;
                                                            boolean changedInstance5 = gapComposer4.changedInstance(provisioningHaptics4);
                                                            Object rememberedValue12 = gapComposer4.rememberedValue();
                                                            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                                            if (changedInstance5 || rememberedValue12 == neverEqualPolicy) {
                                                                rememberedValue12 = new ArcadeModal$$ExternalSyntheticLambda2(provisioningHaptics4, 25);
                                                                gapComposer4.updateRememberedValue(rememberedValue12);
                                                            }
                                                            Function0 function02 = (Function0) rememberedValue12;
                                                            Object rememberedValue13 = gapComposer4.rememberedValue();
                                                            if (rememberedValue13 == neverEqualPolicy) {
                                                                rememberedValue13 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(12, mutableState4);
                                                                gapComposer4.updateRememberedValue(rememberedValue13);
                                                            }
                                                            FidesmoProvisioningViewKt.m3537PositionedScanningPulsez0pNpkI(j2, scanningStarPlacement4, i14, scanningPulseStyle, scanningStepAnimationTrigger3, f5, z7, function02, null, null, (Function1) rememberedValue13, gapComposer4, 0);
                                                            gapComposer4.end(false);
                                                        } else {
                                                            GapComposer gapComposer5 = (GapComposer) composer2;
                                                            gapComposer5.startReplaceGroup(946765169);
                                                            gapComposer5.end(false);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }, gapComposer3), (Composer) gapComposer3, 200064, 18);
                                                BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
                                                Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                                                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer3, 48);
                                                int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                                                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, fillMaxSize2);
                                                gapComposer3.startReusableNode();
                                                if (gapComposer3.inserting) {
                                                    gapComposer3.createNode(function0);
                                                } else {
                                                    gapComposer3.useNode();
                                                }
                                                Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                                                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                                                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                                                Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                                                boolean z7 = fidesmoProvisioningViewModel3 instanceof FidesmoProvisioningViewModel.PreScanInstructions;
                                                Function1 function12 = this.f$0;
                                                if (z7) {
                                                    gapComposer3.startReplaceGroup(-1235917494);
                                                    FidesmoProvisioningViewKt.PreScanContent((FidesmoProvisioningViewModel.PreScanInstructions) fidesmoProvisioningViewModel3, function12, null, gapComposer3, i10);
                                                    gapComposer3.end(false);
                                                } else if (z) {
                                                    gapComposer3.startReplaceGroup(-1235914114);
                                                    FidesmoProvisioningViewModel.Activating activating = (FidesmoProvisioningViewModel.Activating) fidesmoProvisioningViewModel3;
                                                    boolean booleanValue = ((Boolean) mutableState4.getValue()).booleanValue();
                                                    Object rememberedValue12 = gapComposer3.rememberedValue();
                                                    if (rememberedValue12 == obj5) {
                                                        rememberedValue12 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(8, mutableState3);
                                                        gapComposer3.updateRememberedValue(rememberedValue12);
                                                    }
                                                    FidesmoProvisioningViewKt.ActivatingContent(activating, function12, booleanValue, (Function1) rememberedValue12, gapComposer3, i10 | 3072);
                                                    gapComposer3.end(false);
                                                } else if (fidesmoProvisioningViewModel3 instanceof FidesmoProvisioningViewModel.Error) {
                                                    gapComposer3.startReplaceGroup(-1235904984);
                                                    FidesmoProvisioningViewKt.ErrorContent((FidesmoProvisioningViewModel.Error) fidesmoProvisioningViewModel3, function12, gapComposer3, i10);
                                                    gapComposer3.end(false);
                                                } else if (fidesmoProvisioningViewModel3 instanceof FidesmoProvisioningViewModel.Scanning) {
                                                    gapComposer3.startReplaceGroup(-1235901584);
                                                    FidesmoProvisioningViewModel.Scanning scanning = (FidesmoProvisioningViewModel.Scanning) fidesmoProvisioningViewModel3;
                                                    ScanningStarPlacement scanningStarPlacement4 = (ScanningStarPlacement) mutableState5.getValue();
                                                    boolean booleanValue2 = ((Boolean) mutableState4.getValue()).booleanValue();
                                                    Object rememberedValue13 = gapComposer3.rememberedValue();
                                                    if (rememberedValue13 == obj5) {
                                                        rememberedValue13 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(9, mutableState4);
                                                        gapComposer3.updateRememberedValue(rememberedValue13);
                                                    }
                                                    Function1 function13 = (Function1) rememberedValue13;
                                                    Object rememberedValue14 = gapComposer3.rememberedValue();
                                                    if (rememberedValue14 == obj5) {
                                                        rememberedValue14 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(10, mutableState3);
                                                        gapComposer3.updateRememberedValue(rememberedValue14);
                                                    }
                                                    FidesmoProvisioningViewKt.ScanningContent(scanning, function12, scanningStarPlacement4, booleanValue2, function13, (Function1) rememberedValue14, gapComposer3, i10 | 221184, 0);
                                                    gapComposer3.end(false);
                                                } else if (fidesmoProvisioningViewModel3 instanceof FidesmoProvisioningViewModel.Success.Provisioned) {
                                                    gapComposer3.startReplaceGroup(-1235887476);
                                                    FidesmoProvisioningViewKt.ProvisionSuccess((FidesmoProvisioningViewModel.Success.Provisioned) fidesmoProvisioningViewModel3, function12, false, gapComposer3, i10);
                                                    gapComposer3.end(false);
                                                } else if (fidesmoProvisioningViewModel3 instanceof FidesmoProvisioningViewModel.Success.Deprovisioned) {
                                                    gapComposer3.startReplaceGroup(-1235884338);
                                                    FidesmoProvisioningViewKt.DeprovisionSuccess((FidesmoProvisioningViewModel.Success.Deprovisioned) fidesmoProvisioningViewModel3, function12, gapComposer3, i10);
                                                    gapComposer3.end(false);
                                                } else if (fidesmoProvisioningViewModel3 instanceof FidesmoProvisioningViewModel.Failed) {
                                                    gapComposer3.startReplaceGroup(-1235881623);
                                                    FidesmoProvisioningViewKt.FailedContent((FidesmoProvisioningViewModel.Failed) fidesmoProvisioningViewModel3, function12, gapComposer3, i10);
                                                    gapComposer3.end(false);
                                                } else {
                                                    gapComposer3.startReplaceGroup(342448141);
                                                    gapComposer3.end(false);
                                                }
                                                gapComposer3.end(true);
                                                gapComposer3.end(true);
                                                return unit;
                                            }
                                        }
                                        f4 = floatValue;
                                        scanningStepAnimationTrigger2 = null;
                                        scanningStepAnimationTrigger = scanningStepAnimationTrigger2;
                                        changedInstance = gapComposer3.changedInstance(fidesmoProvisioningViewModel2) | gapComposer3.changedInstance(starStepAnimationProgressTracker) | gapComposer3.changed(num) | gapComposer3.changed(num2) | gapComposer3.changed(num3);
                                        rememberedValue = gapComposer3.rememberedValue();
                                        if (changedInstance) {
                                        }
                                        fidesmoProvisioningViewModel = fidesmoProvisioningViewModel2;
                                        rememberedValue = new ta$$ExternalSyntheticLambda1(fidesmoProvisioningViewModel, starStepAnimationProgressTracker, num, num2, num3, 11);
                                        gapComposer3.updateRememberedValue(rememberedValue);
                                        Updater.SideEffect((Function0) rememberedValue, gapComposer3);
                                        Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                                        rememberedValue2 = gapComposer3.rememberedValue();
                                        if (rememberedValue2 == obj5) {
                                        }
                                        Modifier onSizeChanged2 = RulerKt.onSizeChanged(fillMaxSize3, (Function1) rememberedValue2);
                                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                        int hashCode22 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope22 = gapComposer3.currentCompositionLocalScope();
                                        Modifier materializeModifier22 = PlatformKt.materializeModifier(gapComposer3, onSizeChanged2);
                                        ComposeUiNode.Companion.getClass();
                                        Function0 function02 = ComposeUiNode.Companion.Constructor;
                                        if (applier != null) {
                                        }
                                    } else {
                                        a$$ExternalSyntheticBUOutline0.m$3("turnsPerInterval must be positive.");
                                    }
                                    return null;
                                }
                            }
                        }
                        f4 = floatValue;
                        scanningStepAnimationTrigger = null;
                        changedInstance = gapComposer3.changedInstance(fidesmoProvisioningViewModel2) | gapComposer3.changedInstance(starStepAnimationProgressTracker) | gapComposer3.changed(num) | gapComposer3.changed(num2) | gapComposer3.changed(num3);
                        rememberedValue = gapComposer3.rememberedValue();
                        if (changedInstance) {
                        }
                        fidesmoProvisioningViewModel = fidesmoProvisioningViewModel2;
                        rememberedValue = new ta$$ExternalSyntheticLambda1(fidesmoProvisioningViewModel, starStepAnimationProgressTracker, num, num2, num3, 11);
                        gapComposer3.updateRememberedValue(rememberedValue);
                        Updater.SideEffect((Function0) rememberedValue, gapComposer3);
                        Modifier fillMaxSize32 = SizeKt.fillMaxSize(companion, 1.0f);
                        rememberedValue2 = gapComposer3.rememberedValue();
                        if (rememberedValue2 == obj5) {
                        }
                        Modifier onSizeChanged22 = RulerKt.onSizeChanged(fillMaxSize32, (Function1) rememberedValue2);
                        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        int hashCode222 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope222 = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier222 = PlatformKt.materializeModifier(gapComposer3, onSizeChanged22);
                        ComposeUiNode.Companion.getClass();
                        Function0 function022 = ComposeUiNode.Companion.Constructor;
                        if (applier != null) {
                        }
                    }
                } else {
                    j = BodyPartID.bodyIdMax;
                }
                z2 = false;
                if (scanningStarPlacement2 == null) {
                }
                if (z) {
                }
                int roundToInt2 = MathKt__MathJVMKt.roundToInt(density.mo236toPx0680j_4(96.0f));
                i = (int) (((IntSize) mutableState2.getValue()).packedValue & j);
                scanningStarPlacement = scanningStarPlacement2;
                int i112 = (int) (((IntSize) mutableState3.getValue()).packedValue & j);
                if (i > 0) {
                }
                i3 = i2;
                if (fidesmoProvisioningViewModel2 instanceof FidesmoProvisioningViewModel.Scanning.InProgress) {
                }
                final int i142 = i3;
                if (!z) {
                }
                if (num != null) {
                    int intValue32 = num2.intValue();
                    num4 = starStepAnimationProgressTracker.stepAnimationPercentInterval;
                    if (num4 != null) {
                        int intValue42 = num3.intValue();
                        num5 = starStepAnimationProgressTracker.stepAnimationTurnsPerInterval;
                        if (num5 != null) {
                            Integer num102 = starStepAnimationProgressTracker.progressPercent;
                            int intValue52 = num.intValue();
                            intValue = num2.intValue();
                            int intValue62 = num3.intValue();
                            if (intValue > 0) {
                            }
                            return null;
                        }
                    }
                }
                f4 = floatValue;
                scanningStepAnimationTrigger = null;
                changedInstance = gapComposer3.changedInstance(fidesmoProvisioningViewModel2) | gapComposer3.changedInstance(starStepAnimationProgressTracker) | gapComposer3.changed(num) | gapComposer3.changed(num2) | gapComposer3.changed(num3);
                rememberedValue = gapComposer3.rememberedValue();
                if (changedInstance) {
                }
                fidesmoProvisioningViewModel = fidesmoProvisioningViewModel2;
                rememberedValue = new ta$$ExternalSyntheticLambda1(fidesmoProvisioningViewModel, starStepAnimationProgressTracker, num, num2, num3, 11);
                gapComposer3.updateRememberedValue(rememberedValue);
                Updater.SideEffect((Function0) rememberedValue, gapComposer3);
                Modifier fillMaxSize322 = SizeKt.fillMaxSize(companion, 1.0f);
                rememberedValue2 = gapComposer3.rememberedValue();
                if (rememberedValue2 == obj5) {
                }
                Modifier onSizeChanged222 = RulerKt.onSizeChanged(fillMaxSize322, (Function1) rememberedValue2);
                MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                int hashCode2222 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2222 = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier2222 = PlatformKt.materializeModifier(gapComposer3, onSizeChanged222);
                ComposeUiNode.Companion.getClass();
                Function0 function0222 = ComposeUiNode.Companion.Constructor;
                if (applier != null) {
                }
            case 2:
                GrowToolsManagerViewModel growToolsManagerViewModel = (GrowToolsManagerViewModel) obj2;
                int intValue8 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                growToolsManagerViewModel.getClass();
                KTypesJvm.GrowToolsManagerView((GrowToolsManagerViewModel.Loaded) growToolsManagerViewModel, function1, (Composer) obj3, (intValue8 >> 3) & 14);
                return Unit.INSTANCE;
            case 3:
                InstrumentSelectionBlockerViewModel instrumentSelectionBlockerViewModel = (InstrumentSelectionBlockerViewModel) obj2;
                int intValue9 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                instrumentSelectionBlockerViewModel.getClass();
                InstrumentAvatarUtilsKt.InstrumentSelectionContent((InstrumentSelectionBlockerViewModel.Content) instrumentSelectionBlockerViewModel, function1, (Composer) obj3, (intValue9 >> 3) & 14);
                return Unit.INSTANCE;
            case 4:
                LanguageDisclosureViewModel languageDisclosureViewModel = (LanguageDisclosureViewModel) obj2;
                int intValue10 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                languageDisclosureViewModel.getClass();
                LanguageDisclosureViewKt.LanguageDisclosureViewContent((LanguageDisclosureViewModel.Content) languageDisclosureViewModel, function1, (Composer) obj3, (intValue10 >> 3) & 14);
                return Unit.INSTANCE;
            case 5:
                MerchantBlockingViewModel.MerchantBlockingContentViewModel merchantBlockingContentViewModel = (MerchantBlockingViewModel.MerchantBlockingContentViewModel) obj2;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                Modifier fillMaxSize4 = SizeKt.fillMaxSize(companion, 1.0f);
                merchantBlockingContentViewModel.getClass();
                MerchantProfileViewKt.MerchantBlockingSection(merchantBlockingContentViewModel.section, function1, fillMaxSize4, (Composer) obj3, MLKEMEngine.KyberPolyBytes);
                return Unit.INSTANCE;
            case 6:
                MerchantProfileViewModel.ProfilePhoto profilePhoto = (MerchantProfileViewModel.ProfilePhoto) obj2;
                Composer composer2 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                Image image = profilePhoto != null ? profilePhoto.photo : null;
                if (image == null) {
                    GapComposer gapComposer4 = (GapComposer) composer2;
                    gapComposer4.startReplaceGroup(-280023386);
                    gapComposer4.end(false);
                    m = null;
                } else {
                    GapComposer gapComposer5 = (GapComposer) composer2;
                    m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer5, -563222341, image, gapComposer5, false);
                }
                GapComposer gapComposer6 = (GapComposer) composer2;
                if (m == null) {
                    gapComposer6.startReplaceGroup(-279998183);
                    gapComposer6.end(false);
                } else {
                    gapComposer6.startReplaceGroup(-279998182);
                    if (profilePhoto.shouldColorizeAvatar.equals(Boolean.TRUE)) {
                        gapComposer6.startReplaceGroup(-1871377046);
                        ColorModel colorModel = profilePhoto.accentColor;
                        if (colorModel == null) {
                            gapComposer6.startReplaceGroup(-1871389881);
                            gapComposer6.end(false);
                            m2 = null;
                        } else {
                            m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer6, 1602200570, colorModel, gapComposer6, false);
                        }
                        if (m2 != null) {
                            long j2 = m2.value;
                            blendModeColorFilter = new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5)));
                        } else {
                            blendModeColorFilter = null;
                        }
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(-1871319820);
                        gapComposer6.end(false);
                        blendModeColorFilter = null;
                    }
                    boolean changed = gapComposer6.changed(function1);
                    Object rememberedValue15 = gapComposer6.rememberedValue();
                    if (changed || rememberedValue15 == obj5) {
                        rememberedValue15 = new CashMapViewKt$$ExternalSyntheticLambda4(15, function1);
                        gapComposer6.updateRememberedValue(rememberedValue15);
                    }
                    ProfilePhotoKt.ProfilePhoto(m, (Function0) rememberedValue15, blendModeColorFilter, gapComposer6, 0);
                    gapComposer6.end(false);
                }
                return Unit.INSTANCE;
            case 7:
                OffersHomeViewModelV2 offersHomeViewModelV2 = (OffersHomeViewModelV2) obj2;
                Composer composer3 = (Composer) obj3;
                int intValue11 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                offersHomeViewModelV2.getClass();
                if (offersHomeViewModelV2 instanceof OffersHomeViewModelV2.Loaded) {
                    OfferTileKt.OffersHomeV2Loaded((OffersHomeViewModelV2.Loaded) offersHomeViewModelV2, function1, composer3, (intValue11 >> 3) & 14);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                return null;
            case 8:
                final AccountPickerViewModel accountPickerViewModel = (AccountPickerViewModel) obj2;
                Composer composer4 = (Composer) obj3;
                int intValue12 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                GapComposer gapComposer7 = (GapComposer) composer4;
                int hashCode4 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer7.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(composer4, companion);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer8 = (GapComposer) composer4;
                if (gapComposer8.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer8.startReusableNode();
                if (gapComposer8.inserting) {
                    gapComposer8.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer8.useNode();
                }
                Updater.m576setimpl(composer4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer4, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer4, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer4, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                if (accountPickerViewModel instanceof AccountPickerViewModel.AccountList) {
                    gapComposer8.startReplaceGroup(1844297503);
                    AliasPickerViewKt.AccountList((AccountPickerViewModel.AccountList) accountPickerViewModel, function1, SizeKt.fillMaxSize(companion, 1.0f), composer4, ((intValue12 >> 3) & 14) | MLKEMEngine.KyberPolyBytes);
                    gapComposer8.end(false);
                } else if (Intrinsics.areEqual(accountPickerViewModel, AccountPickerViewModel.AccountRemoved.INSTANCE)) {
                    gapComposer8.startReplaceGroup(1844446923);
                    AliasPickerViewKt.AccountRemoved(SizeKt.fillMaxSize(companion, 1.0f), composer4, 6);
                    gapComposer8.end(false);
                } else if (accountPickerViewModel instanceof AccountPickerViewModel.AccountRemovalFailed) {
                    gapComposer8.startReplaceGroup(1844601799);
                    Modifier fillMaxSize5 = SizeKt.fillMaxSize(companion, 1.0f);
                    boolean changed2 = gapComposer8.changed(function1) | gapComposer8.changedInstance(accountPickerViewModel);
                    Object rememberedValue16 = gapComposer8.rememberedValue();
                    if (changed2 || rememberedValue16 == obj5) {
                        rememberedValue16 = new Function0() { // from class: com.squareup.cash.onboarding.accountpicker.views.AccountPickerViewKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i9) {
                                    case 0:
                                        function1.invoke(new AccountPickerViewEvent.ConfirmAccountRemoval(((AccountPickerViewModel.AccountRemovalFailed) accountPickerViewModel).accountToken));
                                        break;
                                    default:
                                        function1.invoke(new AccountPickerViewEvent.CancelAccountRemoval(((AccountPickerViewModel.AccountRemovalFailed) accountPickerViewModel).accountToken));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer8.updateRememberedValue(rememberedValue16);
                    }
                    Function0 function03 = (Function0) rememberedValue16;
                    boolean changed3 = gapComposer8.changed(function1) | gapComposer8.changedInstance(accountPickerViewModel);
                    Object rememberedValue17 = gapComposer8.rememberedValue();
                    if (changed3 || rememberedValue17 == obj5) {
                        rememberedValue17 = new Function0() { // from class: com.squareup.cash.onboarding.accountpicker.views.AccountPickerViewKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i7) {
                                    case 0:
                                        function1.invoke(new AccountPickerViewEvent.ConfirmAccountRemoval(((AccountPickerViewModel.AccountRemovalFailed) accountPickerViewModel).accountToken));
                                        break;
                                    default:
                                        function1.invoke(new AccountPickerViewEvent.CancelAccountRemoval(((AccountPickerViewModel.AccountRemovalFailed) accountPickerViewModel).accountToken));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer8.updateRememberedValue(rememberedValue17);
                    }
                    AliasPickerViewKt.AccountFailedRemoval(MLKEMEngine.KyberPolyBytes, composer4, fillMaxSize5, function03, (Function0) rememberedValue17);
                    gapComposer8.end(false);
                } else {
                    if (accountPickerViewModel != null) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer8, -771791966, false);
                    }
                    gapComposer8.startReplaceGroup(1844893044);
                    gapComposer8.end(false);
                }
                gapComposer8.end(true);
                return Unit.INSTANCE;
            case 9:
                PasskeyManagementViewModel passkeyManagementViewModel = (PasskeyManagementViewModel) obj2;
                Composer composer5 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                passkeyManagementViewModel.getClass();
                if (passkeyManagementViewModel instanceof PasskeyManagementViewModel.Loading) {
                    throw NavAction$$ExternalSyntheticOutline0.m((GapComposer) composer5, 1760225980, false, "Loading state should be handled by LoadableFullScreenContent");
                }
                if (passkeyManagementViewModel instanceof PasskeyManagementViewModel.Loaded) {
                    GapComposer gapComposer9 = (GapComposer) composer5;
                    gapComposer9.startReplaceGroup(1760471841);
                    PasskeyUpsellViewKt.LoadedContent(((PasskeyManagementViewModel.Loaded) passkeyManagementViewModel).passkeys, function1, gapComposer9, 0);
                    gapComposer9.end(false);
                } else {
                    if (!(passkeyManagementViewModel instanceof PasskeyManagementViewModel.Empty)) {
                        if (passkeyManagementViewModel instanceof PasskeyManagementViewModel.Error) {
                            throw NavAction$$ExternalSyntheticOutline0.m((GapComposer) composer5, 1760715780, false, "Error state should be handled by ScreenScaffoldGeneric");
                        }
                        throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer5, -1190146426, false);
                    }
                    GapComposer gapComposer10 = (GapComposer) composer5;
                    gapComposer10.startReplaceGroup(1760618037);
                    PasskeyUpsellViewKt.EmptyContent(gapComposer10, 0);
                    gapComposer10.end(false);
                }
                return Unit.INSTANCE;
            case 10:
                DistributePaycheckViewModel distributePaycheckViewModel = (DistributePaycheckViewModel) obj2;
                Composer composer6 = (Composer) obj3;
                int intValue13 = ((Integer) obj4).intValue();
                int i15 = DistributePaycheckView.$r8$clinit;
                ((AnimatedContentScopeImpl) obj).getClass();
                distributePaycheckViewModel.getClass();
                HelpSheetViewKt.DistributePaycheck((DistributePaycheckViewModel.Loaded) distributePaycheckViewModel, function1, ImageKt.verticalScroll$default(companion, ImageKt.rememberScrollState(composer6), false, 14), composer6, (intValue13 >> 3) & 14);
                return Unit.INSTANCE;
            case 11:
                MultipleAllocationViewModel multipleAllocationViewModel = (MultipleAllocationViewModel) obj2;
                Composer composer7 = (Composer) obj3;
                int intValue14 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                multipleAllocationViewModel.getClass();
                MutableState rememberUpdatableViewModel = HelpSheetViewKt.rememberUpdatableViewModel((MultipleAllocationViewModel.Active) multipleAllocationViewModel, composer7, (intValue14 >> 3) & 14);
                MultipleAllocationViewModel.Active active = (MultipleAllocationViewModel.Active) rememberUpdatableViewModel.getValue();
                GapComposer gapComposer11 = (GapComposer) composer7;
                boolean changed4 = gapComposer11.changed(rememberUpdatableViewModel);
                Object rememberedValue18 = gapComposer11.rememberedValue();
                if (changed4 || rememberedValue18 == obj5) {
                    rememberedValue18 = new MoneyTabUIKt$$ExternalSyntheticLambda9(26, rememberUpdatableViewModel);
                    gapComposer11.updateRememberedValue(rememberedValue18);
                }
                HelpSheetViewKt.Active(active, function1, (Function1) rememberedValue18, gapComposer11, 0);
                return Unit.INSTANCE;
            case 12:
                PhonePlansHomeViewModel phonePlansHomeViewModel = (PhonePlansHomeViewModel) obj2;
                Composer composer8 = (Composer) obj3;
                int intValue15 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                phonePlansHomeViewModel.getClass();
                if (phonePlansHomeViewModel instanceof PhonePlansHomeViewModel.Loading) {
                    GapComposer gapComposer12 = (GapComposer) composer8;
                    gapComposer12.startReplaceGroup(-99333836);
                    gapComposer12.end(false);
                } else if (phonePlansHomeViewModel instanceof PhonePlansHomeViewModel.Error) {
                    GapComposer gapComposer13 = (GapComposer) composer8;
                    gapComposer13.startReplaceGroup(-99332938);
                    PhonePlansHomeViewKt.PhonePlansHomeError(function1, gapComposer13, 0);
                    gapComposer13.end(false);
                } else {
                    if (!(phonePlansHomeViewModel instanceof PhonePlansHomeViewModel.Content)) {
                        throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer8, -99335074, false);
                    }
                    GapComposer gapComposer14 = (GapComposer) composer8;
                    gapComposer14.startReplaceGroup(-99330899);
                    PhonePlansHomeViewKt.PhonePlansHomeContent((PhonePlansHomeViewModel.Content) phonePlansHomeViewModel, function1, gapComposer14, (intValue15 >> 3) & 14);
                    gapComposer14.end(false);
                }
                return Unit.INSTANCE;
            case 13:
                WirelessProviderListViewModel wirelessProviderListViewModel = (WirelessProviderListViewModel) obj2;
                Composer composer9 = (Composer) obj3;
                int intValue16 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                wirelessProviderListViewModel.getClass();
                if (wirelessProviderListViewModel instanceof WirelessProviderListViewModel.Loading) {
                    throw NavAction$$ExternalSyntheticOutline0.m((GapComposer) composer9, -930299621, false, "Loading should be handled by LoadableContent");
                }
                if (!(wirelessProviderListViewModel instanceof WirelessProviderListViewModel.Content)) {
                    throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer9, -930300856, false);
                }
                GapComposer gapComposer15 = (GapComposer) composer9;
                gapComposer15.startReplaceGroup(-930297175);
                PhonePlansHomeViewKt.WirelessProviderListContent((WirelessProviderListViewModel.Content) wirelessProviderListViewModel, function1, gapComposer15, (intValue16 >> 3) & 14);
                gapComposer15.end(false);
                return Unit.INSTANCE;
            case 14:
                PoolDetailsViewModel poolDetailsViewModel = (PoolDetailsViewModel) obj2;
                Composer composer10 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                poolDetailsViewModel.getClass();
                if (poolDetailsViewModel instanceof PoolDetailsViewModel.LoadingError) {
                    GapComposer gapComposer16 = (GapComposer) composer10;
                    gapComposer16.startReplaceGroup(1143533255);
                    boolean changed5 = gapComposer16.changed(function1);
                    Object rememberedValue19 = gapComposer16.rememberedValue();
                    if (changed5 || rememberedValue19 == obj5) {
                        rememberedValue19 = new PoolsListViewKt$$ExternalSyntheticLambda3(8, function1);
                        gapComposer16.updateRememberedValue(rememberedValue19);
                    }
                    Function0 function04 = (Function0) rememberedValue19;
                    boolean changed6 = gapComposer16.changed(function1);
                    Object rememberedValue20 = gapComposer16.rememberedValue();
                    if (changed6 || rememberedValue20 == obj5) {
                        rememberedValue20 = new PoolsListViewKt$$ExternalSyntheticLambda3(9, function1);
                        gapComposer16.updateRememberedValue(rememberedValue20);
                    }
                    PoolToastKt.PoolDetailsErrorView(function04, (Function0) rememberedValue20, ((PoolDetailsViewModel.LoadingError) poolDetailsViewModel).errorType, null, gapComposer16, 0);
                    gapComposer16.end(false);
                } else if (poolDetailsViewModel instanceof PoolDetailsViewModel.Loaded) {
                    GapComposer gapComposer17 = (GapComposer) composer10;
                    gapComposer17.startReplaceGroup(1143835195);
                    boolean changed7 = gapComposer17.changed(function1);
                    Object rememberedValue21 = gapComposer17.rememberedValue();
                    if (changed7 || rememberedValue21 == obj5) {
                        rememberedValue21 = new PoolsListViewKt$$ExternalSyntheticLambda3(10, function1);
                        gapComposer17.updateRememberedValue(rememberedValue21);
                    }
                    VisibleKt.PullToRefresh(221184, 12, gapComposer17, Expect_jvmKt.rememberComposableLambda(1515629207, new PoolDetailsViewKt$$ExternalSyntheticLambda0(poolDetailsViewModel, function1, i6), gapComposer17), null, "", (Function0) rememberedValue21, ((PoolDetailsViewModel.Loaded) poolDetailsViewModel).isRefreshing, false);
                    gapComposer17.end(false);
                } else {
                    GapComposer gapComposer18 = (GapComposer) composer10;
                    gapComposer18.startReplaceGroup(1699543791);
                    gapComposer18.end(false);
                }
                return Unit.INSTANCE;
            case 15:
                PoolInvitePeopleListViewModel poolInvitePeopleListViewModel = (PoolInvitePeopleListViewModel) obj2;
                int intValue17 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                poolInvitePeopleListViewModel.getClass();
                PoolToastKt.PoolInvitePeopleList(function1, null, (PoolInvitePeopleListViewModel.Loaded) poolInvitePeopleListViewModel, (Composer) obj3, (intValue17 << 3) & 896);
                return Unit.INSTANCE;
            case 16:
                PrepurchaseCashCardPlanningViewModel prepurchaseCashCardPlanningViewModel = (PrepurchaseCashCardPlanningViewModel) obj2;
                Composer composer11 = (Composer) obj3;
                int intValue18 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                prepurchaseCashCardPlanningViewModel.getClass();
                if (prepurchaseCashCardPlanningViewModel instanceof PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet) {
                    GapComposer gapComposer19 = (GapComposer) composer11;
                    gapComposer19.startReplaceGroup(-934850166);
                    PrepurchasePlanningSheetHomeKt.PrepurchasePlanningSheetHome((PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet) prepurchaseCashCardPlanningViewModel, function1, gapComposer19, (intValue18 >> 3) & 14);
                    gapComposer19.end(false);
                } else if (prepurchaseCashCardPlanningViewModel instanceof PrepurchaseCashCardPlanningViewModel.PrepurchaseCardPaymentPlanOptionsSheet) {
                    GapComposer gapComposer20 = (GapComposer) composer11;
                    gapComposer20.startReplaceGroup(-934845837);
                    LocaleToggleKt.PrepurchasePlanningSheetSelectPayment((PrepurchaseCashCardPlanningViewModel.PrepurchaseCardPaymentPlanOptionsSheet) prepurchaseCashCardPlanningViewModel, function1, gapComposer20, (intValue18 >> 3) & 14);
                    gapComposer20.end(false);
                } else if (prepurchaseCashCardPlanningViewModel instanceof PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet) {
                    GapComposer gapComposer21 = (GapComposer) composer11;
                    gapComposer21.startReplaceGroup(-934841686);
                    LocaleToggleKt.PrepurchasePlanningSheetInfo((PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet) prepurchaseCashCardPlanningViewModel, function1, gapComposer21, (intValue18 >> 3) & 14);
                    gapComposer21.end(false);
                } else {
                    if (!(prepurchaseCashCardPlanningViewModel instanceof PrepurchaseCashCardPlanningViewModel.Loading)) {
                        throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer11, -934852337, false);
                    }
                    GapComposer gapComposer22 = (GapComposer) composer11;
                    gapComposer22.startReplaceGroup(-934838864);
                    gapComposer22.end(false);
                }
                return Unit.INSTANCE;
            case 17:
                DeviceManagerDeviceDetailViewModel deviceManagerDeviceDetailViewModel = (DeviceManagerDeviceDetailViewModel) obj2;
                Composer composer12 = (Composer) obj3;
                int intValue19 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                deviceManagerDeviceDetailViewModel.getClass();
                DeviceManagerDeviceDetailViewModel.Loaded loaded = (DeviceManagerDeviceDetailViewModel.Loaded) deviceManagerDeviceDetailViewModel;
                Modifier systemBarsPadding = SpacerKt.systemBarsPadding(companion);
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(systemBarsPadding, RecyclerView.DECELERATION_RATE, 32.0f, 1);
                GapComposer gapComposer23 = (GapComposer) composer12;
                Colors colors = (Colors) gapComposer23.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer23, -1762997026, gapComposer23, false);
                } else {
                    gapComposer23.startReplaceGroup(-1762997739);
                    gapComposer23.end(false);
                }
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m300paddingVpY3zN4$default, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer12, 0);
                int hashCode5 = Long.hashCode(gapComposer23.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer23.currentCompositionLocalScope();
                Modifier materializeModifier5 = PlatformKt.materializeModifier(composer12, m177backgroundbw27NRU);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer24 = (GapComposer) composer12;
                if (gapComposer24.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer24.startReusableNode();
                if (gapComposer24.inserting) {
                    gapComposer24.createNode(layoutNode$Companion$Constructor$13);
                } else {
                    gapComposer24.useNode();
                }
                Updater.m576setimpl(composer12, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer12, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer12, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer12, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer12, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                Transformations.SheetHeader(loaded.name, (Modifier) null, (Function2) null, (String) null, composer12, 0, 14);
                DBUtil.SpacerBetweenSectionLarge(0, 1, composer12, null);
                DeviceManagerListViewKt.DeviceMap(loaded, composer12, (intValue19 >> 3) & 14);
                DBUtil.SpacerWithinSectionMedium(0, 1, composer12, null);
                ListUnorderedState rememberListUnorderedState = ListUnorderedKt.rememberListUnorderedState(composer12);
                ListUnorderedItem listUnorderedItem = new ListUnorderedItem(loaded.lastActiveTime, Icons.Time24, null, null, 12);
                String str = loaded.deviceTypeName;
                switch (loaded.deviceType.ordinal()) {
                    case 0:
                    case 7:
                        icons = Icons.International24;
                        break;
                    case 1:
                    case 2:
                    case 5:
                    case 6:
                        icons = Icons.DeviceMobile24;
                        break;
                    case 3:
                    case 4:
                        icons = Icons.DeviceDesktop24;
                        break;
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                }
                AbstractPersistentList persistentListOf = Tags.persistentListOf(listUnorderedItem, new ListUnorderedItem(str, icons, null, null, 12), new ListUnorderedItem(loaded.locationDescription, Icons.Location24, null, null, 12));
                String str2 = loaded.verification;
                if (str2 != null) {
                    persistentListOf.add((Object) new ListUnorderedItem(str2, Icons.Passkey24, null, null, 12));
                }
                ListUnorderedKt.ListUnordered(persistentListOf, (Modifier) null, rememberListUnorderedState, ListUnorderedProminence.Standard, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, composer12, 3072, 50);
                if (loaded.showRemoveButton) {
                    gapComposer24.startReplaceGroup(-771176372);
                    DBUtil.SpacerWithinSectionMedium(0, 1, composer12, null);
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1404607286, new PdfPreviewViewKt$$ExternalSyntheticLambda4(20, function1), composer12), composer12, 24576, 15);
                    gapComposer24.end(false);
                } else {
                    gapComposer24.startReplaceGroup(-770731429);
                    gapComposer24.end(false);
                }
                gapComposer24.end(true);
                return Unit.INSTANCE;
            case 18:
                ProfileViewModel.Loaded.ProfilePhoto profilePhoto2 = (ProfileViewModel.Loaded.ProfilePhoto) obj2;
                Composer composer13 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                Image image2 = profilePhoto2 != null ? profilePhoto2.photo : null;
                if (image2 == null) {
                    GapComposer gapComposer25 = (GapComposer) composer13;
                    gapComposer25.startReplaceGroup(637758919);
                    gapComposer25.end(false);
                    m3 = null;
                } else {
                    GapComposer gapComposer26 = (GapComposer) composer13;
                    m3 = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer26, 1821688186, image2, gapComposer26, false);
                }
                GapComposer gapComposer27 = (GapComposer) composer13;
                if (m3 == null) {
                    gapComposer27.startReplaceGroup(637784339);
                    gapComposer27.end(false);
                } else {
                    gapComposer27.startReplaceGroup(637784340);
                    if (Intrinsics.areEqual(profilePhoto2.shouldColorizeAvatar, Boolean.TRUE)) {
                        gapComposer27.startReplaceGroup(-1189219601);
                        com.squareup.protos.cash.ui.Color color = profilePhoto2.accentColor;
                        if (color == null) {
                            gapComposer27.startReplaceGroup(-1189232436);
                            gapComposer27.end(false);
                            m4 = null;
                        } else {
                            m4 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer27, 1762752981, color, gapComposer27, false);
                        }
                        if (m4 != null) {
                            long j3 = m4.value;
                            blendModeColorFilter2 = new BlendModeColorFilter(j3, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j3), ColorKt.m693toAndroidBlendModes9anfk8(5)));
                        }
                        gapComposer27.end(false);
                    } else {
                        gapComposer27.startReplaceGroup(-1189162375);
                        gapComposer27.end(false);
                    }
                    boolean changed8 = gapComposer27.changed(function1);
                    Object rememberedValue22 = gapComposer27.rememberedValue();
                    if (changed8 || rememberedValue22 == obj5) {
                        rememberedValue22 = new ProfileKt$$ExternalSyntheticLambda0(13, function1);
                        gapComposer27.updateRememberedValue(rememberedValue22);
                    }
                    ProfilePhotoKt.ProfilePhoto(m3, (Function0) rememberedValue22, blendModeColorFilter2, gapComposer27, 0);
                    gapComposer27.end(false);
                }
                return Unit.INSTANCE;
            case 19:
                return invoke$com$squareup$cash$profile$views$personal$PersonalInfoViewKt$$ExternalSyntheticLambda4(obj, obj2, obj3, obj4);
            case 20:
                return invoke$com$squareup$cash$profile$views$personal$PersonalInfoViewKt$$ExternalSyntheticLambda6(obj, obj2, obj3, obj4);
            case 21:
                return invoke$com$squareup$cash$profile$views$security$ProfilePrivacyViewKt$$ExternalSyntheticLambda4(obj, obj2, obj3, obj4);
            case 22:
                return invoke$com$squareup$cash$profile$views$security$ProfileSecurityViewKt$$ExternalSyntheticLambda4(obj, obj2, obj3, obj4);
            case 23:
                return invoke$com$squareup$cash$savings$views$UpsellCardSheetViewKt$$ExternalSyntheticLambda4(obj, obj2, obj3, obj4);
            default:
                NullStateCarouselViewModel nullStateCarouselViewModel = (NullStateCarouselViewModel) obj2;
                int intValue20 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                nullStateCarouselViewModel.getClass();
                TableInfoKt.NullStateCarouselContent((NullStateCarouselViewModel.Content) nullStateCarouselViewModel, function1, (Composer) obj3, (intValue20 >> 3) & 14);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda1(Function1 function1, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }
}
