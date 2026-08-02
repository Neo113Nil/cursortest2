package com.squareup.cash.work.views.pay;

import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.tracing.Trace;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.card.onboarding.TestData;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.util.legal.LegalUrl;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.UtilsKt;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import com.squareup.cash.work.views.shift.ShiftListViewKt;
import com.squareup.cash.work.views.shift.ShiftSectionView2Kt;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class PayHomeViewKt$$ExternalSyntheticLambda19 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ PayHomeViewKt$$ExternalSyntheticLambda19(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                PayCellViewKt.RowDivider((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier height = OffsetKt.height(ImageKt.m177backgroundbw27NRU(companion, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), IntrinsicSize.Max);
                    CardSchemeViewModel.CardNullStateBooklet cardNullStateBooklet = new CardSchemeViewModel.CardNullStateBooklet(new CardSchemeViewModel.CardNullStateBooklet.Content(CollectionsKt__CollectionsJVMKt.listOf(new CardSchemeViewModel.Module.HeroCard(new CardSchemeViewModel.Module.HeroCardDetails(TestData.PINK_CARD_THEME, "$cash", "Test User", "1234 5678 9012 3456", "12/28", null, 3584), false, false, 110)), true, "Get your card,\nunlock all of Cash App", "Or hidden fees. You don’t pay\nextra to have a better card.", EmptyList.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new CardSchemeViewModel.CardNullStateBooklet.BookletTile[]{new CardSchemeViewModel.CardNullStateBooklet.Tile(new Image("fake:///bufo-art.png", (String) null, 6), "Lorem ipsum dolor sit amet consectetur", "Nulla fermentum malesuada commodo. Praesent tincidunt commodo ante ut elementum. "), new CardSchemeViewModel.CardNullStateBooklet.Grid("Lorem ipsum dolor sit amet consectetur", CollectionsKt__CollectionsKt.listOf((Object[]) new CardSchemeViewModel.CardNullStateBooklet.Grid.Item[]{new CardSchemeViewModel.CardNullStateBooklet.Grid.Item(Icons.FpoShrimp24, "Short title", "Short description"), new CardSchemeViewModel.CardNullStateBooklet.Grid.Item(Icons.AlertFill24, "Short title", "Short description"), new CardSchemeViewModel.CardNullStateBooklet.Grid.Item(Icons.LockLockedFill24, "Short title", "Short description")}))}), new CardSchemeViewModel.Module.Accessory.Button("Choose your style", CardSchemeViewModel.Module.Accessory.Button.Prominence.PROMINENT, false, false, (String) null, (Function0) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), null));
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new CardAppletTile$$ExternalSyntheticLambda0(14);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    UtilsKt.HeroCardNullState(cardNullStateBooklet, (Function1) rememberedValue, height, null, null, gapComposer, 48, 24);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier height2 = OffsetKt.height(ImageKt.m177backgroundbw27NRU(companion, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), IntrinsicSize.Max);
                    CardSchemeViewModel.CardNullStateBooklet cardNullStateBooklet2 = new CardSchemeViewModel.CardNullStateBooklet(new CardSchemeViewModel.CardNullStateBooklet.Content(CollectionsKt__CollectionsJVMKt.listOf(new CardSchemeViewModel.Module.HeroCard(new CardSchemeViewModel.Module.HeroCardDetails(TestData.PINK_CARD_THEME, "$cash", "Test User", "1234 5678 9012 3456", "12/28", null, 3584), false, false, 110)), true, "Get your card,\nunlock all of Cash App", null, CollectionsKt__CollectionsKt.listOf((Object[]) new CardSchemeViewModel.CardNullStateBooklet.BenefitItem[]{new CardSchemeViewModel.CardNullStateBooklet.BenefitItem(Icons.Savings24, "No monthly fees and built-in security"), new CardSchemeViewModel.CardNullStateBooklet.BenefitItem(Icons.DiscountTag24, "New custom cash back offers every Friday"), new CardSchemeViewModel.CardNullStateBooklet.BenefitItem(Icons.PersonalizedPayments24, "Earn benefits from everyday spending")}), CollectionsKt__CollectionsKt.listOf((Object[]) new CardSchemeViewModel.CardNullStateBooklet.BookletTile[]{new CardSchemeViewModel.CardNullStateBooklet.Tile(new Image("fake:///bufo-art.png", (String) null, 6), "Lorem ipsum dolor sit amet consectetur", "Nulla fermentum malesuada commodo. Praesent tincidunt commodo ante ut elementum. "), new CardSchemeViewModel.CardNullStateBooklet.Grid("Lorem ipsum dolor sit amet consectetur", CollectionsKt__CollectionsKt.listOf((Object[]) new CardSchemeViewModel.CardNullStateBooklet.Grid.Item[]{new CardSchemeViewModel.CardNullStateBooklet.Grid.Item(Icons.FpoShrimp24, "Short title", "Short description"), new CardSchemeViewModel.CardNullStateBooklet.Grid.Item(Icons.AlertFill24, "Short title", "Short description"), new CardSchemeViewModel.CardNullStateBooklet.Grid.Item(Icons.LockLockedFill24, "Short title", "Short description")}))}), new CardSchemeViewModel.Module.Accessory.Button("Choose your style", CardSchemeViewModel.Module.Accessory.Button.Prominence.PROMINENT, false, false, (String) null, (Function0) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new CardSchemeViewModel.Module.Disclosure(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Customers can qualify for Cash App Green by spending $500 in Qualifying Purchases using your Cash App Card or Cash App Pay per month, or by depositing $300 in Qualifying Deposits per month. Eligibility restrictions apply to some benefits. [See terms and conditions](", LegalUrl.TermsOfServiceCashAppGreen, ")."), false)));
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new CardAppletTile$$ExternalSyntheticLambda0(15);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    UtilsKt.HeroCardNullState(cardNullStateBooklet2, (Function1) rememberedValue2, height2, null, null, gapComposer2, 48, 24);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ProgressCircularKt.ProgressCircular(0, 1, gapComposer3, null);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 4:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ProgressCircularKt.ProgressCircular(0, 1, gapComposer4, null);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 5:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (!gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 6:
                ((PointerInputChange) obj).consume();
                break;
            case 7:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Icons icons = Icons.Check24;
                    Colors colors3 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                    } else {
                        gapComposer6.startReplaceGroup(-1762997739);
                        gapComposer6.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, colors3.semantic.icon.standard, gapComposer6, 54, 4);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                ((Integer) obj2).getClass();
                DisclaimerTextKt.ClockInOverlayLoadingDimmer((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 11:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.InformationOutline24, (String) null, (Modifier) null, 0L, gapComposer7, 54, 12);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
            case 12:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer8, R.string.work_views_clock_in_shift_label), (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                break;
            case 13:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.Location24, (String) null, (Modifier) null, 0L, gapComposer9, 54, 12);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                break;
            case 14:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer10, R.string.work_views_location_label), (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                break;
            case 15:
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.BusinessInformative24, (String) null, (Modifier) null, 0L, gapComposer11, 54, 12);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                break;
            case 16:
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer12, R.string.work_views_job_label), (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                break;
            case 17:
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer13, R.string.work_views_clock_in_scheduled_location), (Map) null, (Function1) null, false);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                break;
            case 18:
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer14, R.string.work_views_clock_in_scheduled_job), (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                break;
            case 19:
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.TimeFill24, (String) null, (Modifier) null, 0L, gapComposer15, 54, 12);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                break;
            case 20:
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.LocationFill24, (String) null, (Modifier) null, 0L, gapComposer16, 54, 12);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                break;
            case 21:
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.Business24, (String) null, (Modifier) null, 0L, gapComposer17, 54, 12);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                break;
            case 22:
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.NavigationMore, Room.stringResource(gapComposer18, R.string.work_pay_home_more_menu), (Modifier) null, 0L, gapComposer18, 6, 12);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                break;
            case 23:
                Composer composer19 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer19, R.string.work_views_pay_section_title), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer19, 0, 30);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                break;
            case 24:
                ((Integer) obj2).getClass();
                PayCellViewKt.PaySectionLoading((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 25:
                Composer composer20 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 3) != 2)) {
                    ShiftListViewKt.AuthorAvatar(gapComposer20, 0);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                break;
            case 26:
                Composer composer21 = (Composer) obj;
                int intValue21 = ((Integer) obj2).intValue();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer21, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer21, R.string.work_views_shift_note_input_label), (Map) null, (Function1) null, false);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                break;
            case 27:
                ((Integer) obj2).getClass();
                ShiftListViewKt.AuthorAvatar((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                ShiftSectionView2Kt.LoadingShiftSection2((Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ShiftSectionView2Kt.NoShiftsHeroToFindShiftsSpacer((Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PayHomeViewKt$$ExternalSyntheticLambda19(int i, int i2) {
        this.$r8$classId = i2;
    }
}
