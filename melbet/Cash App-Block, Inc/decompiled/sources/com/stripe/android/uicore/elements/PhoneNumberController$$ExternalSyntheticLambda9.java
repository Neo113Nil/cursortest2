package com.stripe.android.uicore.elements;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.navigation.NavBackStackEntry;
import androidx.recyclerview.widget.RecyclerView;
import com.datadog.trace.util.Strings;
import com.squareup.cash.db.CashAccountDatabaseCallbackKt;
import com.squareup.cash.db.contacts.RecipientUtil;
import com.stripe.android.financialconnections.features.exit.ExitModalKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTypography;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.uicore.elements.compat.InputPhase;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;

/* loaded from: classes8.dex */
public final /* synthetic */ class PhoneNumberController$$ExternalSyntheticLambda9 implements Function3 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ PhoneNumberController$$ExternalSyntheticLambda9(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$r8$classId) {
            case 0:
                Pair pair = (Pair) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                pair.getClass();
                String str = (String) pair.first;
                boolean booleanValue3 = ((Boolean) pair.second).booleanValue();
                boolean z = booleanValue2 && !booleanValue3;
                if ((!StringsKt.isBlank(str) && !booleanValue3 && !booleanValue) || z) {
                    break;
                }
            case 1:
                ((Integer) obj3).intValue();
                ((NavBackStackEntry) obj).getClass();
                RecipientUtil.ResetScreen((Composer) obj2, 0);
                break;
            case 2:
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                int intValue = ((Integer) obj3).intValue();
                navBackStackEntry.getClass();
                ExitModalKt.ExitModal(navBackStackEntry, (Composer) obj2, intValue & 14);
                break;
            case 3:
                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
                int intValue2 = ((Integer) obj3).intValue();
                navBackStackEntry2.getClass();
                CashAccountDatabaseCallbackKt.NoticeSheet(navBackStackEntry2, (Composer) obj2, intValue2 & 14);
                break;
            case 4:
                NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) obj;
                int intValue3 = ((Integer) obj3).intValue();
                navBackStackEntry3.getClass();
                Strings.AccountUpdateRequiredModal(navBackStackEntry3, (Composer) obj2, intValue3 & 14);
                break;
            case 5:
                Composer composer = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                    SpacerKt.Spacer(gapComposer, OffsetKt.windowInsetsBottomHeight(Arrangement$End$1.current(gapComposer).navigationBars));
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 6:
                Composer composer2 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    TextKt.m509Text4IGK_g("Button 1", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, gapComposer2, 6, 0, 131070);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 7:
                Composer composer3 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    TextKt.m509Text4IGK_g("Button 1", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, gapComposer3, 6, 0, 131070);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 8:
                Composer composer4 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    TextKt.m509Text4IGK_g("Title", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((FinancialConnectionsTypography) gapComposer4.consume(ThemeKt.LocalTypography)).headingXLarge, gapComposer4, 6, 0, JpegConstants.COM_MARKER);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 9:
                TextFieldState textFieldState = (TextFieldState) obj;
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                boolean booleanValue5 = ((Boolean) obj3).booleanValue();
                textFieldState.getClass();
                break;
            case 10:
                Transition.Segment segment = (Transition.Segment) obj;
                ((Integer) obj3).getClass();
                segment.getClass();
                GapComposer gapComposer5 = (GapComposer) ((Composer) obj2);
                gapComposer5.startReplaceGroup(831788644);
                InputPhase inputPhase = InputPhase.Focused;
                InputPhase inputPhase2 = InputPhase.UnfocusedEmpty;
                Object tween$default = segment.isTransitioningTo(inputPhase, inputPhase2) ? AnimatableKt.tween$default(67, 0, EasingKt.LinearEasing, 2) : (segment.isTransitioningTo(inputPhase2, inputPhase) || segment.isTransitioningTo(InputPhase.UnfocusedNotEmpty, inputPhase2)) ? new TweenSpec(83, 67, EasingKt.LinearEasing) : AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 7);
                gapComposer5.end(false);
                break;
            case 11:
                Composer composer5 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((BoxWithConstraintsScopeImpl) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (!gapComposer6.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            case 12:
                Composer composer6 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((BoxWithConstraintsScopeImpl) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer6;
                if (!gapComposer7.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    gapComposer7.skipToGroupEnd();
                }
                break;
            case 13:
                Composer composer7 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((BoxWithConstraintsScopeImpl) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer7;
                if (!gapComposer8.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    gapComposer8.skipToGroupEnd();
                }
                break;
            default:
                Composer composer8 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((BoxWithConstraintsScopeImpl) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer8;
                if (!gapComposer9.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    gapComposer9.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
