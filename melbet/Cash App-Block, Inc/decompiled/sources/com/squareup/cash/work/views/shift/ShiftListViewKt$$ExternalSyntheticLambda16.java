package com.squareup.cash.work.views.shift;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.text.TextStyle;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.sheet.EducationalSheetKt$$ExternalSyntheticLambda8;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.paychecks.views.PaycheckCircles$$ExternalSyntheticLambda3;
import com.squareup.cash.payments.views.RecipientListViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.score.applets.viewmodels.ScoreAppletTileViewModel;
import com.squareup.cash.shopping.settings.viewmodels.ShoppingSettingsAutofillViewModel;
import com.squareup.cash.shopping.settings.views.ErrorDialogKt;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.wallet.views.UtilsKt;
import com.squareup.cash.work.viewmodels.MerchantRowViewModel;
import com.squareup.cash.work.views.MerchantPickerBottomSheetViewKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.cash.Countries;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.consent.ui.ConsentLogoHeaderKt;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkedAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTypography;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.uicore.elements.OTPElement;
import com.stripe.android.uicore.elements.OTPElementUIKt;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* loaded from: classes7.dex */
public final /* synthetic */ class ShiftListViewKt$$ExternalSyntheticLambda16 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ ShiftListViewKt$$ExternalSyntheticLambda16(RecipientViewModel recipientViewModel, Function1 function1, LazyItemScopeImpl lazyItemScopeImpl, boolean z) {
        this.$r8$classId = 1;
        this.f$0 = recipientViewModel;
        this.f$2 = function1;
        this.f$1 = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String m;
        Color m2;
        long j;
        AvatarOverlay.LocalIcon localIcon;
        GapComposer gapComposer;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        boolean z = this.f$1;
        Object obj3 = this.f$2;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                String str = (String) obj4;
                Function1 function1 = (Function1) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ShiftListViewKt$$ExternalSyntheticLambda4(2, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    ShiftListViewKt.ShiftListMonthTitle(0, gapComposer2, str, (Function0) rememberedValue, z);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                RecipientViewModel recipientViewModel = (RecipientViewModel) obj4;
                Function1 function12 = (Function1) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    RecipientViewModel.Avatar avatar = recipientViewModel.avatar;
                    boolean z2 = avatar instanceof RecipientViewModel.Avatar.PlaceholderAvatar;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (z2) {
                        gapComposer3.startReplaceGroup(-1382282648);
                        ImageKt.Image(Countries.painterResource(R.drawable.ic_gray_avatar, 0, gapComposer3), null, SizeKt.m285size3ABfNKs(ClipKt.clip(companion, RoundedCornerShapeKt.CircleShape), 48.0f), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer3, Painter.$stable | 48, 120);
                        gapComposer3.end(false);
                    } else if (avatar instanceof RecipientViewModel.Avatar.BitcoinAddressAvatar) {
                        gapComposer3.startReplaceGroup(-1382005012);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                        Colors colors = (Colors) gapComposer3.consume(staticProvidableCompositionLocal);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                        } else {
                            gapComposer3.startReplaceGroup(-1762997739);
                            gapComposer3.end(false);
                        }
                        long j2 = colors.semantic.icon.brand;
                        Icons icons = Icons.LinkOut24;
                        Colors colors2 = (Colors) gapComposer3.consume(staticProvidableCompositionLocal);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                        } else {
                            gapComposer3.startReplaceGroup(-1762997739);
                            gapComposer3.end(false);
                        }
                        TextViewKt.Avatar(AvatarSize.Size48, new AvatarEntry("B", j2, null, new AvatarImage.LocalIcon(icons, colors2.semantic.icon.inverse, 4), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer3, 6, 28);
                        gapComposer3.end(false);
                    } else if (avatar instanceof RecipientViewModel.Avatar.StablecoinAvatar) {
                        gapComposer3.startReplaceGroup(-1381394622);
                        TextViewKt.Avatar(AvatarSize.Size48, new AvatarEntry("S", ColorKt.Color(4280776138L), null, new AvatarImage.LocalResource(R.drawable.crypto_common_stablecoin_logo), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer3, 6, 28);
                        gapComposer3.end(false);
                    } else {
                        if (!(avatar instanceof RecipientViewModel.Avatar.PhotoImageAvatar)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 925241529, false);
                        }
                        gapComposer3.startReplaceGroup(-1380695572);
                        Image image = ((RecipientViewModel.Avatar.PhotoImageAvatar) avatar).photoImage;
                        if (image == null) {
                            gapComposer3.startReplaceGroup(-1380687668);
                            gapComposer3.end(false);
                            m = null;
                        } else {
                            m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer3, 925293013, image, gapComposer3, false);
                        }
                        Object rememberedValue2 = gapComposer3.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer3);
                        }
                        MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
                        RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer3, 48, 13);
                        boolean changed2 = gapComposer3.changed(function12) | gapComposer3.changedInstance(recipientViewModel);
                        Object rememberedValue3 = gapComposer3.rememberedValue();
                        if (changed2 || rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new RecipientListViewKt$$ExternalSyntheticLambda10(function12, recipientViewModel, 1);
                            gapComposer3.updateRememberedValue(rememberedValue3);
                        }
                        Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(companion, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, null, (Function0) rememberedValue3, 28);
                        AvatarSize avatarSize = AvatarSize.Size48;
                        String valueOf = String.valueOf(recipientViewModel.monogram);
                        com.squareup.protos.cash.ui.Color color = recipientViewModel.accentColor;
                        if (color == null) {
                            gapComposer3.startReplaceGroup(-1380178865);
                            gapComposer3.end(false);
                            m2 = null;
                        } else {
                            m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer3, 925309426, color, gapComposer3, false);
                        }
                        if (m2 == null) {
                            gapComposer3.startReplaceGroup(925311822);
                            Colors colors3 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                            if (colors3 == null) {
                                colors3 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                            } else {
                                gapComposer3.startReplaceGroup(-1762997739);
                                gapComposer3.end(false);
                            }
                            j = colors3.semantic.background.subtle;
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(925308846);
                            gapComposer3.end(false);
                            j = m2.value;
                        }
                        AvatarImage.Remote.Image image2 = m != null ? new AvatarImage.Remote.Image(m, false, null, 0L, new PaycheckCircles$$ExternalSyntheticLambda3(26), 62) : null;
                        gapComposer3.startReplaceGroup(925324682);
                        Recipient recipient = recipientViewModel.recipient;
                        Icons badgeIcon = TypefaceCompatUtil.badgeIcon(recipient, z && (recipient.blockState == BlockState.BLOCKED));
                        if (badgeIcon == null) {
                            gapComposer3.startReplaceGroup(-1273628830);
                            gapComposer3.end(false);
                            localIcon = null;
                        } else {
                            gapComposer3.startReplaceGroup(-1273628829);
                            Colors colors4 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                            if (colors4 == null) {
                                colors4 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                            } else {
                                gapComposer3.startReplaceGroup(-1762997739);
                                gapComposer3.end(false);
                            }
                            AvatarOverlay.LocalIcon localIcon2 = new AvatarOverlay.LocalIcon(4, colors4.semantic.background.subtle, 0L, badgeIcon);
                            gapComposer3.end(false);
                            localIcon = localIcon2;
                        }
                        gapComposer3.end(false);
                        TextViewKt.m3613AvatarB_rZmmc(avatarSize, valueOf, j, Room.stringResource(gapComposer3, R.string.recipient_accessory_cont_desc), m182clickableO2vRcR0$default, (AvatarImage) image2, (Function2) null, (AvatarOverlay) localIcon, false, 0L, (Composer) gapComposer3, 6, 0, 1856);
                        gapComposer3.end(false);
                    }
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ViewPropertyAnimatorListenerAdapter.InstalledScoreAppletTile((ScoreAppletTileViewModel.Installed) obj4, (Function0) obj3, z, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                ErrorDialogKt.Address((ShoppingSettingsAutofillViewModel.AddressViewModel.Loaded) obj4, z, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                UtilsKt.NextUpCardImage((CardSchemeViewModel.Module.Icon.LegacyAvatar) obj4, (Image) obj3, z, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                MerchantPickerBottomSheetViewKt.MerchantRow((MerchantRowViewModel) obj4, z, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                TextFieldState textFieldState = (TextFieldState) obj4;
                Function1 function13 = (Function1) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1507179674, new EducationalSheetKt$$ExternalSyntheticLambda8(textFieldState, z, function13, 9), gapComposer4), gapComposer4, 24576, 15);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                OTPElement oTPElement = (OTPElement) obj4;
                FocusRequester focusRequester = (FocusRequester) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (gapComposer5.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                    boolean booleanValue = ((Boolean) gapComposer5.consume(FinancialConnectionsSheetNativeActivityKt.LocalTestMode)).booleanValue();
                    boolean z3 = this.f$1;
                    if (booleanValue) {
                        gapComposer5.startReplaceGroup(-94196133);
                        String stringResource = Room.stringResource(gapComposer5, R.string.stripe_verification_useTestCode);
                        boolean changedInstance = gapComposer5.changedInstance(oTPElement);
                        Object rememberedValue4 = gapComposer5.rememberedValue();
                        if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                            ScannerView.AnonymousClass1 anonymousClass1 = new ScannerView.AnonymousClass1(0, oTPElement, ListItemKt.class, "populateTestCode", "populateTestCode(Lcom/stripe/android/uicore/elements/OTPElement;)V", 1, 15);
                            gapComposer5.updateRememberedValue(anonymousClass1);
                            rememberedValue4 = anonymousClass1;
                        }
                        gapComposer = gapComposer5;
                        TextKt.TestModeBanner(0, gapComposer, null, stringResource, null, (Function0) ((KFunction) rememberedValue4), z3);
                        re$$ExternalSyntheticOutline0.m(Modifier.Companion.$$INSTANCE, 24.0f, gapComposer, false);
                    } else {
                        gapComposer = gapComposer5;
                        gapComposer.startReplaceGroup(-96372612);
                        gapComposer.end(false);
                    }
                    OTPElementUIKt.m4070OTPElementUIRE_urrM(z3, oTPElement, null, null, TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).headingXLargeSubdued, ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744446), 8.0f, "", null, RecyclerView.DECELERATION_RATE, focusRequester, gapComposer, 14352448);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                ConsentLogoHeaderKt.ConsentLogoHeader((Modifier) obj4, (List) obj3, z, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                InstitutionPickerScreenKt.SearchMoreRow((Modifier) obj4, (HeroCardViewKt$$ExternalSyntheticLambda9) obj3, z, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                LinkAccountPickerScreenKt.NetworkedAccountItem((LinkedAccount) obj4, (Function1) obj3, z, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int i2 = FinancialConnectionsSheetNativeActivity.$r8$clinit;
                ((FinancialConnectionsSheetNativeActivity) obj4).NavHost((FinancialConnectionsSessionManifest.Pane) obj3, z, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ShiftListViewKt$$ExternalSyntheticLambda16(int i, int i2, Object obj, Function function, boolean z) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = z;
        this.f$2 = function;
    }

    public /* synthetic */ ShiftListViewKt$$ExternalSyntheticLambda16(Object obj, Object obj2, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = z;
    }

    public /* synthetic */ ShiftListViewKt$$ExternalSyntheticLambda16(Object obj, boolean z, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
        this.f$2 = function1;
    }

    public /* synthetic */ ShiftListViewKt$$ExternalSyntheticLambda16(boolean z, OTPElement oTPElement, FocusRequester focusRequester) {
        this.$r8$classId = 7;
        this.f$1 = z;
        this.f$0 = oTPElement;
        this.f$2 = focusRequester;
    }
}
