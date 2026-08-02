package com.squareup.cash.tabs.views;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.molecule.PlatformKt;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.EmbeddedHeaderScope;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.transfers.views.AddMoneyViewKt;
import com.squareup.cash.transfers.views.composer.RecurringReloadConfigurationComposersKt;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.CardAppletTileKt;
import com.squareup.cash.wallet.views.HeroCardViewKt;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.TransitionsKt;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer2, R.string.support_phone_status_cancel_callback_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer3 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, composer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(composer3, R.string.support_home_toolbar_title), (Map) null, (Function1) null, false);
                return Unit.INSTANCE;
            case 3:
                Composer composer4 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer4;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer3, R.string.support_home_prominent_contact_support_button_text), (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer5 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((EmbeddedHeaderScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer5;
                if (!gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer6 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer6;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer5, R.string.tap_to_pay_first_time_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer7 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer7;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer6, R.string.tap_to_pay_initiator_notes_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer8 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer8;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer7, R.string.tap_to_pay_onboarding_complete_button_close), (Map) null, (Function1) null, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer9 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer9;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer8, R.string.tap_to_pay_onboarding_complete_button_try_free_pay), (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer10 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer10;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer9, R.string.tap_to_pay_payment_confirmation_done_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer11 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer11;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer10, R.string.tap_to_pay_payment_confirmation_done_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer12 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer12;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer11, R.string.tap_to_pay_payment_confirmation_receipt_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer13 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer13;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer12, R.string.tap_to_pay_payment_error_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer14 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer14;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    Trace.m1191Iconww6aTOc(Icons.TapToPay24, "tap to pay", (Modifier) null, 0L, gapComposer13, 54, 12);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                PainterRequest painterRequest = (PainterRequest) obj;
                int intValue14 = ((Integer) obj3).intValue();
                painterRequest.getClass();
                GapComposer gapComposer14 = (GapComposer) ((Composer) obj2);
                gapComposer14.startReplaceGroup(-763201479);
                AsyncImagePainter rememberAsyncImagePainter = AsyncImageKt.rememberAsyncImagePainter(painterRequest, null, gapComposer14, intValue14 & 14, 1);
                gapComposer14.end(false);
                return rememberAsyncImagePainter;
            case 15:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                Set set = (Set) obj3;
                set.getClass();
                return (booleanValue && !booleanValue2 && set.contains(EligibleFeature.MONEY_TAXES_APPLET)) ? AppletAvailabilityState.AVAILABLE : AppletAvailabilityState.UNAVAILABLE;
            case 16:
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    ImageKt.Image(Countries.painterResource(R.drawable.google_pay_logo, 0, gapComposer15), null, SizeKt.fillMaxSize(companion, 1.0f), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer15, Painter.$stable | 432, 120);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer16 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 24.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer16.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer16.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer16, m285size3ABfNKs);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer16.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer16.startReusableNode();
                    if (gapComposer16.inserting) {
                        gapComposer16.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer16.useNode();
                    }
                    Updater.m576setimpl(gapComposer16, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer16, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer16, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer16, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer16, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    gapComposer16.end(true);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer17 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue17 & 6) == 0) {
                    intValue17 |= ((GapComposer) composer17).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 19) != 18)) {
                    TransactorKt.CustomAction(titleBarActionScope, null, null, AddMoneyViewKt.lambda$904857959, gapComposer17, (intValue17 & 14) | 3072, 3);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer18 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer18, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer18, R.string.balance_based_auto_reload_confirmation_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer19 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(companion, 24.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer19.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer19.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer19, m285size3ABfNKs2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer19.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer19.startReusableNode();
                    if (gapComposer19.inserting) {
                        gapComposer19.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer19.useNode();
                    }
                    Updater.m576setimpl(gapComposer19, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer19, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer19, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer19, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer19, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    gapComposer19.end(true);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                TitleBarActionScope titleBarActionScope2 = (TitleBarActionScope) obj;
                Composer composer20 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                titleBarActionScope2.getClass();
                if ((intValue20 & 6) == 0) {
                    intValue20 |= ((GapComposer) composer20).changed(titleBarActionScope2) ? 4 : 2;
                }
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 19) != 18)) {
                    TransactorKt.CustomAction(titleBarActionScope2, null, null, AddMoneyViewKt.f735lambda$31002160, gapComposer20, (intValue20 & 14) | 3072, 3);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer21 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    Modifier m285size3ABfNKs3 = SizeKt.m285size3ABfNKs(companion, 24.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode3 = Long.hashCode(gapComposer21.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer21.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer21, m285size3ABfNKs3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer21.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer21.startReusableNode();
                    if (gapComposer21.inserting) {
                        gapComposer21.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer21.useNode();
                    }
                    Updater.m576setimpl(gapComposer21, maybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer21, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer21, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer21, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer21, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    gapComposer21.end(true);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                TitleBarActionScope titleBarActionScope3 = (TitleBarActionScope) obj;
                Composer composer22 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                titleBarActionScope3.getClass();
                if ((intValue22 & 6) == 0) {
                    intValue22 |= ((GapComposer) composer22).changed(titleBarActionScope3) ? 4 : 2;
                }
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 19) != 18)) {
                    TransactorKt.CustomAction(titleBarActionScope3, null, null, RecurringReloadConfigurationComposersKt.lambda$1433817742, gapComposer22, (intValue22 & 14) | 3072, 3);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj3).intValue();
                ((AnimatedVisibilityScope) obj).getClass();
                ProgressCircularKt.ProgressCircular(0, 1, (Composer) obj2, null);
                return Unit.INSTANCE;
            case 25:
                Composer composer23 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer23;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 17) != 16)) {
                    CardAppletTileKt.LoadingCardWithPill(gapComposer23, 0);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                UiScope uiScope = (UiScope) obj;
                Composer composer24 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                uiScope.getClass();
                if ((intValue24 & 6) == 0) {
                    intValue24 |= ((GapComposer) composer24).changed(uiScope) ? 4 : 2;
                }
                GapComposer gapComposer24 = (GapComposer) composer24;
                if (gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 19) != 18)) {
                    boolean z = !TransitionsKt.isVisibleAndSettled(uiScope.$$delegate_0.getTransition());
                    Object rememberedValue = gapComposer24.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new AlertBannerKt$$ExternalSyntheticLambda0(20);
                        gapComposer24.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.BackHandler(z, (Function0) rememberedValue, gapComposer24, 48, 0);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer25 = (Composer) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer25 = (GapComposer) composer25;
                if (!gapComposer25.shouldExecute(intValue25 & 1, (intValue25 & 17) != 16)) {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj3).intValue();
                ((AnimatedVisibilityScope) obj).getClass();
                ProgressCircularKt.ProgressCircular(0, 1, (Composer) obj2, null);
                return Unit.INSTANCE;
            default:
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), HeroCardViewKt.DIM_OVERLAY, ColorKt.RectangleShape), (Composer) obj2, 6);
                return Unit.INSTANCE;
        }
    }
}
