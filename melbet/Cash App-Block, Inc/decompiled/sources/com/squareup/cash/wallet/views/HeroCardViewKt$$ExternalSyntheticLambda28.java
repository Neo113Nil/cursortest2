package com.squareup.cash.wallet.views;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.views.fulfillment.FulfillmentRadioCellKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.card.onboarding.CardStudioViewV2Kt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class HeroCardViewKt$$ExternalSyntheticLambda28 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda28(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(booleanValue) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Colors.Semantic.Icon icon = colors.semantic.icon;
                    Trace.m1191Iconww6aTOc(booleanValue ? Icons.LockLocked16 : Icons.LockUnlocked16, (String) null, (Modifier) null, ((Color) SingleValueAnimationKt.m153animateColorAsStateeuL9pac(((Boolean) mutableState.getValue()).booleanValue() ? icon.disabled : icon.standard, null, null, gapComposer, 0, 14).getValue()).value, gapComposer, 48, 4);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new TooltipKt$$ExternalSyntheticLambda1(28, mutableState);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, FulfillmentRadioCellKt.lambda$1149781273, gapComposer2, ((intValue2 << 12) & 57344) | 3078, 6);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                CardStudioViewV2Kt.TrashBin(!((Boolean) mutableState.getValue()).booleanValue(), (Composer) obj2, 0);
                break;
            case 3:
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                CardStudioViewV2Kt.TrashBin(!((Boolean) mutableState.getValue()).booleanValue(), (Composer) obj2, 0);
                break;
            case 4:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    String str = (String) mutableState.getValue();
                    if (str == null) {
                        gapComposer3.startReplaceGroup(-410231732);
                    } else {
                        gapComposer3.startReplaceGroup(-410231731);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    }
                    gapComposer3.end(false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 5:
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    String str2 = (String) mutableState.getValue();
                    str2.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 6:
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                String str3 = (String) mutableState.getValue();
                GapComposer gapComposer5 = (GapComposer) ((Composer) obj2);
                if (str3 == null) {
                    gapComposer5.startReplaceGroup(-1951481883);
                } else {
                    gapComposer5.startReplaceGroup(-1951481882);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                }
                gapComposer5.end(false);
                break;
            case 7:
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    ModalKt.Modal((Modifier) null, Room.stringResource(gapComposer6, R.string.work_views_something_went_wrong), Room.stringResource(gapComposer6, R.string.work_views_please_try_again_later), Expect_jvmKt.rememberComposableLambda(-616948582, new HeroCardViewKt$$ExternalSyntheticLambda28(8, mutableState), gapComposer6), (Function3) null, (Function3) null, gapComposer6, 3072, 49);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            default:
                ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                modalButtonScope2.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer6).changed(modalButtonScope2) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer6;
                if (gapComposer7.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                    boolean changed = gapComposer7.changed(mutableState);
                    Object rememberedValue2 = gapComposer7.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new WalletHomeViewKt$$ExternalSyntheticLambda6(12, mutableState);
                        gapComposer7.updateRememberedValue(rememberedValue2);
                    }
                    modalButtonScope2.PrimaryModalButton((Function0) rememberedValue2, null, false, DisclaimerTextKt.f759lambda$2026610587, gapComposer7, ((intValue6 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
