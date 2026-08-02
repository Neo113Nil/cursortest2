package com.squareup.cash.tabs.presenters;

import androidx.compose.runtime.MutableState;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import com.fillr.n;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.account.navigation.RealAccountInboundNavigator;
import com.squareup.cash.account.screens.AccountSwitcherScreen;
import com.squareup.cash.account.settings.viewmodels.IdentityVerificationSectionViewEvent$IdentityVerificationClick;
import com.squareup.cash.activity.analytics.ActivityAnalyticsService;
import com.squareup.cash.activity.backend.RealActivityAnalyticsService;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.SearchOrigin;
import com.squareup.cash.cdf.account.AccountSwitchAccountViewSwitcher;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.cdf.identity.IdentityOpenView;
import com.squareup.cash.cdf.identity.ScreenType;
import com.squareup.cash.cdf.identity.Source;
import com.squareup.cash.cdf.moneybot.MoneybotEntrypointTap;
import com.squareup.cash.cdf.moneybot.MoneybotSurface;
import com.squareup.cash.cdf.personalprofile.PersonalProfileViewOpenScreen;
import com.squareup.cash.clientrouting.data.TargetDestination;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.family.navigation.RealFamilyNavigator$Factory$Impl;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.identityverification.backend.api.IdentityVerificationStatus;
import com.squareup.cash.identityverification.backend.real.RealIdentityVerificationBadger;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.screens.MoneybotAutomationsScreen;
import com.squareup.cash.moneybot.screens.MoneybotChatEntryPoint;
import com.squareup.cash.moneybot.screens.MoneybotChatScreen;
import com.squareup.cash.moneybot.screens.MoneybotHomeScreen;
import com.squareup.cash.moneybot.screens.MoneybotOverflowMenuScreen;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$PaymentPad;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.qrcodes.screens.QrCodeScreen;
import com.squareup.cash.screens.Back;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.preferences.LongPreference;
import com.squareup.protos.franklin.api.ClientScenario;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;

/* loaded from: classes6.dex */
public final class TabToolbarPresenter$models$$inlined$CollectEffect$1$1 implements FlowCollector {
    public final /* synthetic */ Object $familyProfile$delegate$inlined;
    public final /* synthetic */ boolean $isRoutingEnabled$inlined;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ MoleculePresenter this$0;

    public TabToolbarPresenter$models$$inlined$CollectEffect$1$1(TaxReturnsPresenter taxReturnsPresenter, boolean z, IdentityVerificationStatus identityVerificationStatus) {
        this.this$0 = taxReturnsPresenter;
        this.$isRoutingEnabled$inlined = z;
        this.$familyProfile$delegate$inlined = identityVerificationStatus;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$familyProfile$delegate$inlined;
        boolean z = this.$isRoutingEnabled$inlined;
        MoleculePresenter moleculePresenter = this.this$0;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) obj2;
                TabToolbarPresenter tabToolbarPresenter = (TabToolbarPresenter) moleculePresenter;
                Navigator navigator = (Navigator) tabToolbarPresenter.navigator;
                Screen screen = (Screen) tabToolbarPresenter.screen;
                AssetPublicSuffixList assetPublicSuffixList = (AssetPublicSuffixList) tabToolbarPresenter.tabToolbarOutboundNavigator;
                TabToolbarInternalViewEvent tabToolbarInternalViewEvent = (TabToolbarInternalViewEvent) obj;
                if (tabToolbarInternalViewEvent instanceof TabToolbarInternalViewEvent.ProfileLongClick) {
                    AccountSwitchAccountViewSwitcher.Entrypoint entrypoint = AccountSwitchAccountViewSwitcher.Entrypoint.PROFILE_ICON_LONG_PRESS;
                    if (!z) {
                        screen = null;
                    }
                    assetPublicSuffixList.getClass();
                    RealAccountInboundNavigator realAccountInboundNavigator = (RealAccountInboundNavigator) assetPublicSuffixList.bytes;
                    TargetDestination.ScreenDestination screenDestination = screen != null ? new TargetDestination.ScreenDestination(screen) : null;
                    Navigator navigator2 = realAccountInboundNavigator.navigator;
                    TargetDestination.ScreenDestination screenDestination2 = screenDestination != null ? screenDestination : null;
                    navigator2.goTo(new AccountSwitcherScreen(entrypoint, screenDestination2 != null ? screenDestination2.screen : null, screenDestination));
                } else if (!(tabToolbarInternalViewEvent instanceof TabToolbarInternalViewEvent.ProfileClick)) {
                    boolean z2 = tabToolbarInternalViewEvent instanceof TabToolbarInternalViewEvent.ToolbarButtonClick;
                    Back back = Back.INSTANCE;
                    if (z2) {
                        int ordinal = ((TabToolbarInternalViewEvent.ToolbarButtonClick) tabToolbarInternalViewEvent).id.ordinal();
                        if (ordinal == 0) {
                            EglCore eglCore = (EglCore) assetPublicSuffixList.path;
                            ((RealActivityAnalyticsService) ((ActivityAnalyticsService) eglCore.eglConfig)).loadTimeClock.start();
                            ((LoadTimeClock) eglCore.eglContext).start();
                            ((Navigator) eglCore.eglDisplay).goTo(ActivityScreen.INSTANCE);
                        } else if (ordinal == 1) {
                            RealAccountInboundNavigator realAccountInboundNavigator2 = (RealAccountInboundNavigator) assetPublicSuffixList.readFailure;
                            realAccountInboundNavigator2.getClass();
                            realAccountInboundNavigator2.navigator.goTo(new GlobalSearchScreen(screen instanceof PaymentScreens$HomeScreens$PaymentPad ? SearchOrigin.PAYMENT_PAD : screen instanceof ActivityScreen ? SearchOrigin.ACTIVITY_TAB : screen instanceof MoneyTabScreen ? SearchOrigin.MONEY : SearchOrigin.UNSPECIFIED, false));
                        } else if (ordinal != 2) {
                            if (ordinal == 3) {
                                ((Navigator) assetPublicSuffixList.readCompleteLatch).goTo(new QrCodeScreen(back));
                            } else {
                                if (ordinal != 4) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                n nVar = (n) assetPublicSuffixList.exceptionBytes;
                                RealMoneybotAnalyticsService.submitOverflowMenuOpen$default((RealMoneybotAnalyticsService) nVar.c, MoneybotSurface.HOME, null, null, 6);
                                ((Navigator) nVar.a).goTo(new MoneybotOverflowMenuScreen(null, null, 3));
                            }
                        } else if ((screen instanceof MoneybotChatScreen) || (screen instanceof MoneybotHomeScreen)) {
                            navigator.goTo(back);
                        } else {
                            ((RealMoneybotAnalyticsService) tabToolbarPresenter.moneybotAnalyticsService).analytics.track(new MoneybotEntrypointTap(), null);
                            n nVar2 = (n) assetPublicSuffixList.exceptionBytes;
                            MoneybotChatEntryPoint moneybotChatEntryPoint = MoneybotChatEntryPoint.MONEY;
                            JobKt.launch$default((CoroutineScope) nVar2.d, null, null, new MusicPresenter$models$3$1(nVar2, null), 3);
                        }
                    } else if (tabToolbarInternalViewEvent instanceof TabToolbarInternalViewEvent.CloseButtonClick) {
                        navigator.goTo(back);
                    } else {
                        if (!(tabToolbarInternalViewEvent instanceof TabToolbarInternalViewEvent.BackButtonClick)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        if (screen instanceof MoneyTabScreen) {
                            ((RealFamilyNavigator$Factory$Impl) tabToolbarPresenter.familyNavigatorFactory).create$1(navigator).handleManagedAccountBack((FamilyProfile) mutableState.getValue());
                        } else if (screen instanceof MoneybotAutomationsScreen) {
                            navigator.goTo(back);
                        }
                    }
                } else if (((FamilyProfile) mutableState.getValue()) instanceof FamilyProfile.ManagedAccount) {
                    AccountSwitchAccountViewSwitcher.Entrypoint entrypoint2 = AccountSwitchAccountViewSwitcher.Entrypoint.PROFILE_ICON_LONG_PRESS;
                    if (!z) {
                        screen = null;
                    }
                    assetPublicSuffixList.getClass();
                    RealAccountInboundNavigator realAccountInboundNavigator3 = (RealAccountInboundNavigator) assetPublicSuffixList.bytes;
                    TargetDestination.ScreenDestination screenDestination3 = screen != null ? new TargetDestination.ScreenDestination(screen) : null;
                    Navigator navigator3 = realAccountInboundNavigator3.navigator;
                    TargetDestination.ScreenDestination screenDestination4 = screenDestination3 != null ? screenDestination3 : null;
                    navigator3.goTo(new AccountSwitcherScreen(entrypoint2, screenDestination4 != null ? screenDestination4.screen : null, screenDestination3));
                } else {
                    ((Analytics) assetPublicSuffixList.listRead).track(new AppNavigateOpenSpace(null, null, AppNavigateOpenSpace.Space.SETTINGS, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE), null);
                    ((RealAccountInboundNavigator) assetPublicSuffixList.bytes).showAccount();
                }
                return Unit.INSTANCE;
            default:
                IdentityVerificationSectionViewEvent$IdentityVerificationClick identityVerificationSectionViewEvent$IdentityVerificationClick = (IdentityVerificationSectionViewEvent$IdentityVerificationClick) obj;
                TaxReturnsPresenter taxReturnsPresenter = (TaxReturnsPresenter) moleculePresenter;
                Analytics analytics = (Analytics) taxReturnsPresenter.taxesDocumentsTaxReturnsDataProvider;
                if (identityVerificationSectionViewEvent$IdentityVerificationClick != null) {
                    BlockersData.Flow.INSTANCE.getClass();
                    String generateToken = BlockersData.Flow.Companion.generateToken();
                    analytics.track(new IdentityOpenView(generateToken, ScreenType.IdentityHub, Source.SECURITY_AND_PRIVACY, Boolean.valueOf(z)), null);
                    analytics.track(new PersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.VERIFY_IDENTITY, null), null);
                    RealIdentityVerificationBadger realIdentityVerificationBadger = (RealIdentityVerificationBadger) taxReturnsPresenter.args;
                    long j = ((IdentityVerificationStatus) obj2).version;
                    LongPreference longPreference = realIdentityVerificationBadger.lastSeenIdentityVerificationVersion;
                    longPreference.preferences.edit().putLong(longPreference.key, j).apply();
                    BlockersHelper.launchClientScenario$default((RealBlockersHelper) taxReturnsPresenter.router, BlockersData.Flow.CLIENT_SCENARIO, ClientScenario.IDENTITY_HUB, ProfileScreens.AccountInfoScreen.INSTANCE, null, generateToken, null, false, null, null, false, 4040);
                }
                return Unit.INSTANCE;
        }
    }

    public TabToolbarPresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, TabToolbarPresenter tabToolbarPresenter, boolean z, MutableState mutableState) {
        this.this$0 = tabToolbarPresenter;
        this.$isRoutingEnabled$inlined = z;
        this.$familyProfile$delegate$inlined = mutableState;
    }
}
