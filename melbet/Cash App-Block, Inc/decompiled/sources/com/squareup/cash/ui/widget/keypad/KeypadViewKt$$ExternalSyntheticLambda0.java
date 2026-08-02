package com.squareup.cash.ui.widget.keypad;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerDefaults$AllDates$1;
import androidx.compose.material3.DatePickerFormatterImpl;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$2$1$1;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModelImpl;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.cash.sqldelight.driver.android.AndroidStatement;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.components.ToastKt$Toast$8$1;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.blockers.presenters.ReferralCodePresenter$models$2$1$1;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.db2.ExpressivePaymentsStickerConfig;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.profile.ScenarioPlan;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt;
import com.squareup.protos.document.DocumentCategoryEntity;
import com.squareup.protos.document.VersionData;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class KeypadViewKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ Object f$8;

    public /* synthetic */ KeypadViewKt$$ExternalSyntheticLambda0(RewardSlotQueries rewardSlotQueries, FilterToken filterToken, String str, String str2, Boolean bool, List list, List list2, String str3, SyncInvestmentFilterGroup.JoinType joinType) {
        this.$r8$classId = 3;
        this.f$0 = rewardSlotQueries;
        this.f$3 = filterToken;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$4 = bool;
        this.f$5 = list;
        this.f$6 = list2;
        this.f$7 = str3;
        this.f$8 = joinType;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeypadViewModel.KeypadKey keypadKey;
        PlatformHapticFeedback platformHapticFeedback;
        MutableState mutableState;
        KeypadViewModel keypadViewModel;
        Long l;
        CardTheme cardTheme;
        int i = this.$r8$classId;
        r10 = null;
        CardTheme.BackgroundImage backgroundImage = null;
        Object obj2 = this.f$6;
        Object obj3 = this.f$5;
        Object obj4 = this.f$8;
        Object obj5 = this.f$4;
        Object obj6 = this.f$3;
        Object obj7 = this.f$2;
        Object obj8 = this.f$1;
        Object obj9 = this.f$7;
        Object obj10 = this.f$0;
        switch (i) {
            case 0:
                KeypadViewModel.KeypadKey keypadKey2 = (KeypadViewModel.KeypadKey) obj10;
                String str = (String) obj8;
                String str2 = (String) obj7;
                KeypadViewModel keypadViewModel2 = (KeypadViewModel) obj6;
                RealHapticVibrator realHapticVibrator = (RealHapticVibrator) obj5;
                Haptics haptics = (Haptics) obj3;
                PlatformHapticFeedback platformHapticFeedback2 = (PlatformHapticFeedback) obj2;
                CoroutineScope coroutineScope = (CoroutineScope) obj9;
                MutableState mutableState2 = (MutableState) obj4;
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                if (!keypadKey2.isSeparator()) {
                    str = keypadKey2.isClear() ? str2 : keypadKey2.value;
                }
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                if (keypadKey2.isClear()) {
                    keypadKey = keypadKey2;
                    platformHapticFeedback = platformHapticFeedback2;
                    mutableState = mutableState2;
                    keypadViewModel = keypadViewModel2;
                    semanticsPropertyReceiver.set(SemanticsActions.OnLongClick, new AccessibilityAction(null, new KeypadViewKt$$ExternalSyntheticLambda2(keypadKey, keypadViewModel, realHapticVibrator, haptics, platformHapticFeedback, coroutineScope, mutableState)));
                } else {
                    keypadKey = keypadKey2;
                    platformHapticFeedback = platformHapticFeedback2;
                    mutableState = mutableState2;
                    keypadViewModel = keypadViewModel2;
                }
                SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, null, new KeypadViewKt$$ExternalSyntheticLambda2(keypadViewModel, realHapticVibrator, haptics, platformHapticFeedback, keypadKey, coroutineScope, mutableState));
                break;
            case 1:
                IntRange intRange = (IntRange) obj10;
                PaddingValuesImpl paddingValuesImpl = DatePickerKt.DatePickerModeTogglePadding;
                LazyListScope.items$default((LazyListScope) obj, ((intRange.last - intRange.first) + 1) * 12, null, new ComposableLambdaImpl(new DatePickerKt$HorizontalMonthsList$1$2$1$1((CalendarModelImpl) obj8, (CalendarMonth) obj7, (Function1) obj6, (CalendarDate) obj5, (Long) obj3, (DatePickerFormatterImpl) obj2, (DatePickerDefaults$AllDates$1) obj9, (DatePickerColors) obj4), true, 72599078), 6);
                break;
            case 2:
                Integer num = (Integer) obj5;
                Long l2 = (Long) obj3;
                DocumentCategoryEntity.RenderStyle renderStyle = (DocumentCategoryEntity.RenderStyle) obj2;
                VersionData versionData = (VersionData) obj9;
                InstrumentQueries instrumentQueries = (InstrumentQueries) obj4;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, (String) obj8, 1, (String) obj7);
                androidStatement.bindString(2, (String) obj10);
                androidStatement.bindString(3, (String) obj6);
                if (num != null) {
                    int intValue = num.intValue();
                    ((ScenarioPlan.Adapter) instrumentQueries.instrumentAdapter).getClass();
                    l = Long.valueOf(intValue);
                } else {
                    l = null;
                }
                androidStatement.bindLong(4, l);
                androidStatement.bindLong(5, l2);
                androidStatement.bindString(6, renderStyle != null ? (String) ((ScenarioPlan.Adapter) instrumentQueries.instrumentAdapter).client_scenarioAdapter.encode(renderStyle) : null);
                androidStatement.bindBytes(7, versionData != null ? (byte[]) ((ScenarioPlan.Adapter) instrumentQueries.instrumentAdapter).scenario_planAdapter.encode(versionData) : null);
                break;
            case 3:
                List list = (List) obj3;
                List list2 = (List) obj2;
                String str3 = (String) obj9;
                SyncInvestmentFilterGroup.JoinType joinType = (SyncInvestmentFilterGroup.JoinType) obj4;
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                ExpressivePaymentsStickerConfig.Adapter adapter = (ExpressivePaymentsStickerConfig.Adapter) ((RewardSlotQueries) obj10).rewardAdapter;
                adapter.getClass();
                androidStatement2.bindString(0, ((FilterToken) obj6).value);
                androidStatement2.bindString(1, (String) obj8);
                androidStatement2.bindString(2, (String) obj7);
                androidStatement2.bindBoolean(3, (Boolean) obj5);
                androidStatement2.bindBytes(4, list != null ? (byte[]) adapter.effectsAdapter.encode(list) : null);
                androidStatement2.bindBytes(5, list2 != null ? (byte[]) adapter.tagsAdapter.encode(list2) : null);
                androidStatement2.bindString(6, str3);
                androidStatement2.bindString(7, joinType != null ? (String) adapter.release_stateAdapter.encode(joinType) : null);
                break;
            default:
                Ref$LongRef ref$LongRef = (Ref$LongRef) obj10;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj9;
                CardScene cardScene = (CardScene) obj8;
                SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj7;
                MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) obj5;
                MutableState mutableState3 = (MutableState) obj4;
                MutableState mutableState4 = (MutableState) obj3;
                MutableSharedFlow mutableSharedFlow2 = (MutableSharedFlow) obj2;
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                long m625minusMKHz9U = Offset.m625minusMKHz9U(pointerInputChange.position, ref$LongRef.element);
                long j = pointerInputChange.position;
                ref$LongRef.element = j;
                if (CoreInteractiveCardKt.InteractiveCardEffect$lambda$20((State) obj6)) {
                    JobKt.launch$default(coroutineScope2, null, CoroutineStart.UNDISPATCHED, new ToastKt$Toast$8$1(mutableSharedFlow, m625minusMKHz9U, pointerEventHandlerCoroutine, (Continuation) null, 14), 1);
                    CardSchemeViewModel.Module.HeroCardDetails heroCardDetails = (CardSchemeViewModel.Module.HeroCardDetails) mutableState3.getValue();
                    if (heroCardDetails != null && (cardTheme = heroCardDetails.cardTheme) != null) {
                        backgroundImage = cardTheme.background_image;
                    }
                    CardTheme.BackgroundImage backgroundImage2 = CardTheme.BackgroundImage.MOOD;
                    if (backgroundImage == backgroundImage2 || ((CardSchemeViewModel.Module.HeroCardDetails) mutableState4.getValue()).cardTheme.background_image == backgroundImage2) {
                        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
                        long j2 = SuspendingPointerInputModifierNodeImpl.this.boundsSize;
                        cardScene.addHeatFromTouch(intBitsToFloat, intBitsToFloat2, (int) (j2 >> 32), (int) (j2 & BodyPartID.bodyIdMax), 1.0f);
                    }
                } else {
                    JobKt.launch$default(coroutineScope2, null, CoroutineStart.UNDISPATCHED, new ReferralCodePresenter$models$2$1$1(mutableSharedFlow2, null, 8), 1);
                }
                pointerInputChange.consume();
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ KeypadViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = obj6;
        this.f$6 = obj7;
        this.f$7 = obj8;
        this.f$8 = obj9;
    }

    public /* synthetic */ KeypadViewKt$$ExternalSyntheticLambda0(String str, String str2, String str3, String str4, Integer num, Long l, DocumentCategoryEntity.RenderStyle renderStyle, VersionData versionData, InstrumentQueries instrumentQueries) {
        this.$r8$classId = 2;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$0 = str3;
        this.f$3 = str4;
        this.f$4 = num;
        this.f$5 = l;
        this.f$6 = renderStyle;
        this.f$7 = versionData;
        this.f$8 = instrumentQueries;
    }

    public /* synthetic */ KeypadViewKt$$ExternalSyntheticLambda0(Ref$LongRef ref$LongRef, CoroutineScope coroutineScope, CardScene cardScene, SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, State state, MutableSharedFlow mutableSharedFlow, MutableState mutableState, MutableState mutableState2, MutableSharedFlow mutableSharedFlow2) {
        this.$r8$classId = 4;
        this.f$0 = ref$LongRef;
        this.f$7 = coroutineScope;
        this.f$1 = cardScene;
        this.f$2 = pointerEventHandlerCoroutine;
        this.f$3 = state;
        this.f$4 = mutableSharedFlow;
        this.f$8 = mutableState;
        this.f$5 = mutableState2;
        this.f$6 = mutableSharedFlow2;
    }
}
