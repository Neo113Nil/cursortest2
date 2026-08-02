package com.squareup.cash.work.views.shift;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda3;
import coil3.size.SizeKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.directdeposit.views.directdeposit.DirectDepositFormErrorKt;
import com.squareup.cash.moneybot.views.menu.ExpandableContentKt$$ExternalSyntheticLambda4;
import com.squareup.cash.onboarding.accountpicker.views.AliasPickerViewKt;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.shopping.views.ActionPillKt$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class ShiftNoteViewKt$$ExternalSyntheticLambda9 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ ShiftNoteViewKt$$ExternalSyntheticLambda9(Function0 function0, Function0 function02, int i) {
        this.$r8$classId = i;
        this.f$0 = function0;
        this.f$1 = function02;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Function0 function0 = this.f$1;
        Function0 function02 = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    ModalKt.Modal((Modifier) null, Room.stringResource(gapComposer, R.string.work_views_shift_note_delete_dialog_title), Room.stringResource(gapComposer, R.string.work_views_shift_note_delete_dialog_body), Expect_jvmKt.rememberComposableLambda(-859491825, new ActionPillKt$$ExternalSyntheticLambda0(11, function02), gapComposer), Expect_jvmKt.rememberComposableLambda(-556604434, new ActionPillKt$$ExternalSyntheticLambda0(12, function0), gapComposer), (Function3) null, gapComposer, 27648, 33);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    ModalKt.Modal((Modifier) null, Room.stringResource(gapComposer2, R.string.card_message_modal_title), Room.stringResource(gapComposer2, R.string.card_message_modal_body), Expect_jvmKt.rememberComposableLambda(-1790577247, new DismissableToastKt$$ExternalSyntheticLambda3(6, function02), gapComposer2), Expect_jvmKt.rememberComposableLambda(1273097506, new DismissableToastKt$$ExternalSyntheticLambda3(7, function0), gapComposer2), (Function3) null, gapComposer2, 27648, 33);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                String stringResource = Room.stringResource(composer3, R.string.search_bar_clear_description);
                GapComposer gapComposer3 = (GapComposer) composer3;
                Object rememberedValue = gapComposer3.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer3);
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer3, 48, 13);
                Role role = new Role(0);
                boolean changed = gapComposer3.changed(function02) | gapComposer3.changed(function0);
                Object rememberedValue2 = gapComposer3.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ExpandableContentKt$$ExternalSyntheticLambda4(function02, function0, 1);
                    gapComposer3.updateRememberedValue(rememberedValue2);
                }
                Trace.m1191Iconww6aTOc(Icons.ClearField24, (String) null, ImageKt.m182clickableO2vRcR0$default(Modifier.Companion.$$INSTANCE, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, stringResource, role, (Function0) rememberedValue2, 4), 0L, gapComposer3, 54, 8);
                break;
            case 3:
                Composer composer4 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    SizeKt.ButtonCta(this.f$0, null, ButtonProminence.STANDARD, false, false, null, DirectDepositFormErrorKt.lambda$2091045514, gapComposer4, 1573248, 58);
                    SizeKt.ButtonCta(this.f$1, null, ButtonProminence.PROMINENT, false, false, null, DirectDepositFormErrorKt.f384lambda$1808121933, gapComposer4, 1573248, 58);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 4:
                Composer composer5 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    ModalKt.Modal((Modifier) null, Room.stringResource(gapComposer5, R.string.moneybot_delete_chat_dialog_title), Room.stringResource(gapComposer5, R.string.moneybot_delete_chat_dialog_body), Expect_jvmKt.rememberComposableLambda(-1854522514, new DismissableToastKt$$ExternalSyntheticLambda3(18, function02), gapComposer5), Expect_jvmKt.rememberComposableLambda(-704690227, new DismissableToastKt$$ExternalSyntheticLambda3(19, function0), gapComposer5), (Function3) null, gapComposer5, 27648, 33);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 5:
                Composer composer6 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    ModalKt.Modal((Modifier) null, Room.stringResource(gapComposer6, R.string.moneybot_delete_chat_dialog_title), Room.stringResource(gapComposer6, R.string.moneybot_delete_chat_dialog_body), Expect_jvmKt.rememberComposableLambda(1135090276, new DismissableToastKt$$ExternalSyntheticLambda3(20, function02), gapComposer6), Expect_jvmKt.rememberComposableLambda(-1049185661, new DismissableToastKt$$ExternalSyntheticLambda3(21, function0), gapComposer6), (Function3) null, gapComposer6, 27648, 33);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            case 6:
                Composer composer7 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    SizeKt.ButtonCta(this.f$0, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), null, false, false, null, AliasPickerViewKt.f517lambda$1737012480, gapComposer7, 1572912, 60);
                    SizeKt.ButtonCta(this.f$1, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), ButtonProminence.PROMINENT, false, false, null, AliasPickerViewKt.f518lambda$1954736215, gapComposer7, 1573296, 56);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
            case 7:
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer8 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((GapComposer) composer8).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                    ButtonProminence buttonProminence = ButtonProminence.STANDARD;
                    Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                    boolean changed2 = gapComposer8.changed(function02);
                    Object rememberedValue3 = gapComposer8.rememberedValue();
                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new ToViewKt$$ExternalSyntheticLambda2(10, function02);
                        gapComposer8.updateRememberedValue(rememberedValue3);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue3, horizontalWeight, buttonProminence, false, false, null, QuickPayViewKt.lambda$1973210914, gapComposer8, 1573248, 56);
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    Modifier horizontalWeight2 = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                    boolean changed3 = gapComposer8.changed(function0);
                    Object rememberedValue4 = gapComposer8.rememberedValue();
                    if (changed3 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new ToViewKt$$ExternalSyntheticLambda2(11, function0);
                        gapComposer8.updateRememberedValue(rememberedValue4);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue4, horizontalWeight2, buttonProminence2, false, false, null, QuickPayViewKt.lambda$1031629593, gapComposer8, 1573248, 56);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                break;
            default:
                AdaptiveStackScope adaptiveStackScope2 = (AdaptiveStackScope) obj;
                Composer composer9 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                adaptiveStackScope2.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((GapComposer) composer9).changed(adaptiveStackScope2) ? 4 : 2;
                }
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue8 & 1, (intValue8 & 19) != 18)) {
                    SizeKt.ButtonCta(this.f$0, adaptiveStackScope2.horizontalWeight(companion, 1.0f), null, false, false, null, PoolToastKt.lambda$1998993038, gapComposer9, 1572864, 60);
                    SizeKt.ButtonCta(this.f$1, adaptiveStackScope2.horizontalWeight(companion, 1.0f), null, false, false, null, PoolToastKt.lambda$38040887, gapComposer9, 1572864, 60);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
