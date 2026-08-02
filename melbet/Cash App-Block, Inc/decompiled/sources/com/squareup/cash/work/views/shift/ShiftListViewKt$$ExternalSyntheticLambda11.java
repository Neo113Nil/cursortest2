package com.squareup.cash.work.views.shift;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.ui.Modifier;
import androidx.room.Room;
import androidx.room.TransactorKt;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda1;
import coil3.size.SizeKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.deposits.physical.view.map.ComposableSingletons$PaperMoneyDepositMapViewKt;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda4;
import com.squareup.cash.investing.components.ordertype.autoinvest.AutoInvestPurchaseKt;
import com.squareup.cash.onboarding.accountpicker.views.AliasPickerViewKt;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes6.dex */
public final /* synthetic */ class ShiftListViewKt$$ExternalSyntheticLambda11 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ MutableState f$1;

    public /* synthetic */ ShiftListViewKt$$ExternalSyntheticLambda11(MutableState mutableState, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$1 = mutableState;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Function1 function1 = this.f$0;
        MutableState mutableState = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    boolean changed = gapComposer.changed(function1) | gapComposer.changed(mutableState);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new CashtagViewKt$$ExternalSyntheticLambda13(function1, mutableState, 22);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue, null, buttonProminence, false, false, null, ShiftListViewKt.lambda$605600084, gapComposer, 1573248, 58);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    Icons icons = Icons.NavigationDiscover;
                    String stringResource = Room.stringResource(gapComposer2, R.string.bitcoin_map_search_button_label);
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new BitcoinMapViewKt$$ExternalSyntheticLambda6(5, function1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    int i2 = intValue2 & 14;
                    TransactorKt.IconAction(titleBarActionScope, icons, stringResource, (Function0) rememberedValue2, null, null, null, null, null, null, false, gapComposer2, i2 | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                    Icons icons2 = Icons.NavigationFilter;
                    String stringResource2 = Room.stringResource(gapComposer2, R.string.bitcoin_map_filter_button_label);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new TabContentViewKt$$ExternalSyntheticLambda1(20, mutableState);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    TransactorKt.IconAction(titleBarActionScope, icons2, stringResource2, (Function0) rememberedValue3, null, null, null, null, null, null, false, gapComposer2, i2 | 3120, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    boolean changed3 = gapComposer3.changed(function1) | gapComposer3.changed(mutableState);
                    Object rememberedValue4 = gapComposer3.rememberedValue();
                    if (changed3 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new CashtagViewKt$$ExternalSyntheticLambda13(function1, mutableState, 9);
                        gapComposer3.updateRememberedValue(rememberedValue4);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue4, null, buttonProminence2, false, false, null, ComposableSingletons$PaperMoneyDepositMapViewKt.f373lambda$1717865872, gapComposer3, 1573248, 58);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 3:
                TitleBarActionScope titleBarActionScope2 = (TitleBarActionScope) obj;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                titleBarActionScope2.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer4).changed(titleBarActionScope2) ? 4 : 2;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    Icons icons3 = Icons.NavigationDiscover;
                    boolean changed4 = gapComposer4.changed(function1);
                    Object rememberedValue5 = gapComposer4.rememberedValue();
                    if (changed4 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new ComposeDialogKt$$ExternalSyntheticLambda4(21, function1);
                        gapComposer4.updateRememberedValue(rememberedValue5);
                    }
                    int i3 = intValue4 & 14;
                    TransactorKt.IconAction(titleBarActionScope2, icons3, "Search", (Function0) rememberedValue5, null, null, null, null, null, null, false, gapComposer4, i3 | 432, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                    Icons icons4 = Icons.NavigationFilter;
                    String stringResource3 = Room.stringResource(gapComposer4, R.string.pmd_map_filter_content_description);
                    boolean changed5 = gapComposer4.changed(function1);
                    Object rememberedValue6 = gapComposer4.rememberedValue();
                    if (changed5 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new CashtagViewKt$$ExternalSyntheticLambda13(function1, mutableState, 8);
                        gapComposer4.updateRememberedValue(rememberedValue6);
                    }
                    TransactorKt.IconAction(titleBarActionScope2, icons4, stringResource3, (Function0) rememberedValue6, null, null, null, null, null, null, false, gapComposer4, i3 | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 4:
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    ButtonProminence buttonProminence3 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed6 = gapComposer5.changed(function1);
                    Object rememberedValue7 = gapComposer5.rememberedValue();
                    if (changed6 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new CashtagViewKt$$ExternalSyntheticLambda13(function1, mutableState, 12);
                        gapComposer5.updateRememberedValue(rememberedValue7);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue7, fillMaxWidth, buttonProminence3, false, false, null, AutoInvestPurchaseKt.lambda$1573819947, gapComposer5, 1573296, 56);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 5:
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Modifier fillMaxWidth2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed7 = gapComposer6.changed(function1);
                    Object rememberedValue8 = gapComposer6.rememberedValue();
                    if (changed7 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new P2PListViewKt$$ExternalSyntheticLambda0(15, function1);
                        gapComposer6.updateRememberedValue(rememberedValue8);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue8, fillMaxWidth2, null, false, false, null, AliasPickerViewKt.f524lambda$768048133, gapComposer6, 1572912, 60);
                    ButtonProminence buttonProminence4 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed8 = gapComposer6.changed(function1);
                    Object rememberedValue9 = gapComposer6.rememberedValue();
                    if (changed8 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new CashtagViewKt$$ExternalSyntheticLambda13(function1, mutableState, 17);
                        gapComposer6.updateRememberedValue(rememberedValue9);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue9, fillMaxWidth3, buttonProminence4, false, false, null, AliasPickerViewKt.lambda$1920208498, gapComposer6, 1573296, 56);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            case 6:
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    ButtonProminence buttonProminence5 = ButtonProminence.PROMINENT;
                    boolean z = ((JobIdentifier) mutableState.getValue()) != null;
                    boolean changed9 = gapComposer7.changed(mutableState) | gapComposer7.changed(function1);
                    Object rememberedValue10 = gapComposer7.rememberedValue();
                    if (changed9 || rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new CashtagViewKt$$ExternalSyntheticLambda13(mutableState, function1, 19);
                        gapComposer7.updateRememberedValue(rememberedValue10);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue10, null, buttonProminence5, false, z, null, DisclaimerTextKt.lambda$2031790405, gapComposer7, 1573248, 42);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
            default:
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    ButtonProminence buttonProminence6 = ButtonProminence.PROMINENT;
                    boolean changed10 = gapComposer8.changed(mutableState) | gapComposer8.changed(function1);
                    Object rememberedValue11 = gapComposer8.rememberedValue();
                    if (changed10 || rememberedValue11 == neverEqualPolicy) {
                        rememberedValue11 = new CashtagViewKt$$ExternalSyntheticLambda13(mutableState, function1, 20);
                        gapComposer8.updateRememberedValue(rememberedValue11);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue11, null, buttonProminence6, false, false, null, DisclaimerTextKt.lambda$1293063277, gapComposer8, 1573248, 58);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ShiftListViewKt$$ExternalSyntheticLambda11(Function1 function1, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = mutableState;
    }
}
