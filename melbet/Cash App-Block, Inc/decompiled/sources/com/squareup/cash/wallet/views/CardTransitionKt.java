package com.squareup.cash.wallet.views;

import android.content.Context;
import android.graphics.Paint;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.LazyWindowInfo;
import androidx.compose.ui.platform.WindowInfo;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.compose.UiScopeKt;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.db.SessionQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda10;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$4$4$1$1;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda10;
import com.squareup.cash.taptopay.views.TapToPayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.util.compose.ListsKt$$ExternalSyntheticLambda0;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.squareup.util.task.RepeatOnIntervalTaskRunner$repeatOn$2;
import com.squareup.workflow1.TimerWorker$run$1;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import timber.log.Timber;

/* loaded from: classes7.dex */
public abstract class CardTransitionKt {
    public static final StaticProvidableCompositionLocal LocalCardRegistry = new StaticProvidableCompositionLocal(new AlertBannerKt$$ExternalSyntheticLambda0(18));
    public static final StaticProvidableCompositionLocal LocalCardPillHazeState = new StaticProvidableCompositionLocal(new AlertBannerKt$$ExternalSyntheticLambda0(18));
    public static final StaticProvidableCompositionLocal LocalCardPillFadeOpacity = new StaticProvidableCompositionLocal(new AlertBannerKt$$ExternalSyntheticLambda0(18));
    public static final StaticProvidableCompositionLocal LocalCardScreenId = new StaticProvidableCompositionLocal(new AlertBannerKt$$ExternalSyntheticLambda0(19));

    public static final void CardTransition(String str, Composer composer, int i) {
        int i2;
        RecomposeScopeImpl endRestartGroup;
        CardTransitionKt$$ExternalSyntheticLambda3 cardTransitionKt$$ExternalSyntheticLambda3;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1267343460);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            CardRegistry cardRegistry = (CardRegistry) gapComposer.consume(LocalCardRegistry);
            if (cardRegistry == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    cardTransitionKt$$ExternalSyntheticLambda3 = new CardTransitionKt$$ExternalSyntheticLambda3(str, i, i3);
                    endRestartGroup.block = cardTransitionKt$$ExternalSyntheticLambda3;
                }
                return;
            }
            SnapshotStateMap snapshotStateMap = cardRegistry.sourceCardRegistry;
            UiScopeKt.UiScope(UtilsKt.f747lambda$1986995088, gapComposer, 6);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Boolean.valueOf(!snapshotStateMap.containsKey(str));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            boolean booleanValue = ((Boolean) rememberedValue).booleanValue();
            CardScreenId cardScreenId = (CardScreenId) gapComposer.consume(LocalCardScreenId);
            if (!snapshotStateMap.containsKey(str) || snapshotStateMap.get(str) == cardScreenId) {
                gapComposer.startReplaceGroup(873430052);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer.changedInstance(cardRegistry) | ((i2 & 14) == 4) | gapComposer.changed(cardScreenId.ordinal());
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new CardTransitionKt$$ExternalSyntheticLambda4(i3, cardRegistry, str, cardScreenId);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Updater.DisposableEffect(unit, (Function1) rememberedValue2, gapComposer);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(873569397);
                gapComposer.end(false);
            }
            Unit unit2 = Unit.INSTANCE;
            boolean changedInstance2 = gapComposer.changedInstance(cardRegistry);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new CardTransitionKt$CardTransition$2$2$1(booleanValue, cardRegistry, null);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, unit2, (Function2) rememberedValue3);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            cardTransitionKt$$ExternalSyntheticLambda3 = new CardTransitionKt$$ExternalSyntheticLambda3(str, i, 5);
            endRestartGroup.block = cardTransitionKt$$ExternalSyntheticLambda3;
        }
    }

    public static final void MoneyCardIntroAnimation(Composer composer, int i) {
        RecomposeScopeImpl endRestartGroup;
        TapToPayKt$$ExternalSyntheticLambda0 tapToPayKt$$ExternalSyntheticLambda0;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(841750420);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            CardRegistry cardRegistry = (CardRegistry) gapComposer.consume(LocalCardRegistry);
            if (cardRegistry == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    tapToPayKt$$ExternalSyntheticLambda0 = new TapToPayKt$$ExternalSyntheticLambda0(i, 27);
                    endRestartGroup.block = tapToPayKt$$ExternalSyntheticLambda0;
                }
                return;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = AnimatableKt.Animatable(1.0f, 0.01f);
                cardRegistry.cardNuxAnimation$delegate.setValue(rememberedValue);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Animatable animatable = (Animatable) rememberedValue;
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(cardRegistry);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CardAppletTileKt$$ExternalSyntheticLambda31(cardRegistry, 1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.DisposableEffect(unit, (Function1) rememberedValue2, gapComposer);
            boolean changedInstance2 = gapComposer.changedInstance(animatable);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable, null, 9);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            tapToPayKt$$ExternalSyntheticLambda0 = new TapToPayKt$$ExternalSyntheticLambda0(i, 28);
            endRestartGroup.block = tapToPayKt$$ExternalSyntheticLambda0;
        }
    }

    public static final void RegisterCardModelView(final String str, final CardModelView cardModelView, final Function1 function1, Composer composer, final int i) {
        int i2;
        final String str2;
        final CardModelView cardModelView2;
        final Function1 function12;
        final int i3;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-777353097);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | (gapComposer.changedInstance(cardModelView) ? 32 : 16);
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            CardRegistry cardRegistry = (CardRegistry) gapComposer.consume(LocalCardRegistry);
            if (cardRegistry == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i5 = 0;
                    endRestartGroup.block = new Function2() { // from class: com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = i5;
                            int i7 = i;
                            Function1 function13 = function1;
                            CardModelView cardModelView3 = cardModelView;
                            String str3 = str;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    CardTransitionKt.RegisterCardModelView(str3, cardModelView3, function13, composer2, Updater.updateChangedFlags(i7 | 1));
                                    break;
                                case 1:
                                    CardTransitionKt.RegisterCardModelView(str3, cardModelView3, function13, composer2, Updater.updateChangedFlags(i7 | 1));
                                    break;
                                default:
                                    CardTransitionKt.RegisterCardModelView(str3, cardModelView3, function13, composer2, Updater.updateChangedFlags(i7 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            str2 = str;
            cardModelView2 = cardModelView;
            function12 = function1;
            boolean z = true;
            i3 = i;
            CardModelView cardModelView3 = (CardModelView) cardRegistry.cards.get(str2);
            if (cardModelView3 != null && !Intrinsics.areEqual(cardModelView2, cardModelView3)) {
                function12.invoke(cardModelView3);
                RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
                if (endRestartGroup2 != null) {
                    final int i6 = 1;
                    endRestartGroup2.block = new Function2() { // from class: com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i62 = i6;
                            int i7 = i3;
                            Function1 function13 = function12;
                            CardModelView cardModelView32 = cardModelView2;
                            String str3 = str2;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i62) {
                                case 0:
                                    CardTransitionKt.RegisterCardModelView(str3, cardModelView32, function13, composer2, Updater.updateChangedFlags(i7 | 1));
                                    break;
                                case 1:
                                    CardTransitionKt.RegisterCardModelView(str3, cardModelView32, function13, composer2, Updater.updateChangedFlags(i7 | 1));
                                    break;
                                default:
                                    CardTransitionKt.RegisterCardModelView(str3, cardModelView32, function13, composer2, Updater.updateChangedFlags(i7 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            if (cardModelView2 != null) {
                gapComposer.startReplaceGroup(1610364384);
                boolean changedInstance = gapComposer.changedInstance(cardRegistry) | ((i4 & 14) == 4);
                if ((i4 & 112) != 32 && !gapComposer.changedInstance(cardModelView2)) {
                    z = false;
                }
                boolean z2 = changedInstance | z;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z2 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new CardTransitionKt$$ExternalSyntheticLambda4(18, cardRegistry, str2, cardModelView2);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Paint paint = CardModelView.REMOVE_PAINT;
                Updater.DisposableEffect(str2, cardModelView2, (Function1) rememberedValue, gapComposer);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1610483548);
                gapComposer.end(false);
            }
        } else {
            str2 = str;
            cardModelView2 = cardModelView;
            function12 = function1;
            i3 = i;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup3 = gapComposer.endRestartGroup();
        if (endRestartGroup3 != null) {
            final int i7 = 2;
            endRestartGroup3.block = new Function2() { // from class: com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = i7;
                    int i72 = i3;
                    Function1 function13 = function12;
                    CardModelView cardModelView32 = cardModelView2;
                    String str3 = str2;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i62) {
                        case 0:
                            CardTransitionKt.RegisterCardModelView(str3, cardModelView32, function13, composer2, Updater.updateChangedFlags(i72 | 1));
                            break;
                        case 1:
                            CardTransitionKt.RegisterCardModelView(str3, cardModelView32, function13, composer2, Updater.updateChangedFlags(i72 | 1));
                            break;
                        default:
                            CardTransitionKt.RegisterCardModelView(str3, cardModelView32, function13, composer2, Updater.updateChangedFlags(i72 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final State cardNuxAnimation(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(169560545);
        CardRegistry cardRegistry = (CardRegistry) gapComposer.consume(LocalCardRegistry);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = Updater.derivedStateOf(new CardTransitionKt$$ExternalSyntheticLambda7(cardRegistry, 0));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        State state = (State) rememberedValue;
        gapComposer.end(false);
        return state;
    }

    public static final MutableState cardQuickFadeInOut(int i, int i2, Composer composer) {
        boolean z = true;
        long j = (i2 & 1) != 0 ? 800L : 200L;
        MutableState transitionType = getTransitionType(composer);
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(Boolean.valueOf(isTransitioningCard(composer)), composer);
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Float.valueOf(((Boolean) rememberUpdatedState.getValue()).booleanValue() ? RecyclerView.DECELERATION_RATE : 1.0f);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Float valueOf = Float.valueOf(((Number) rememberedValue).floatValue());
        boolean changed = gapComposer.changed(transitionType) | gapComposer.changed(rememberUpdatedState);
        if ((((i & 14) ^ 6) <= 4 || !gapComposer.changed(j)) && (i & 6) != 4) {
            z = false;
        }
        boolean z2 = changed | z;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (z2 || rememberedValue2 == neverEqualPolicy) {
            RepeatOnIntervalTaskRunner$repeatOn$2 repeatOnIntervalTaskRunner$repeatOn$2 = new RepeatOnIntervalTaskRunner$repeatOn$2(transitionType, rememberUpdatedState, j, (Continuation) null, 16);
            gapComposer.updateRememberedValue(repeatOnIntervalTaskRunner$repeatOn$2);
            rememberedValue2 = repeatOnIntervalTaskRunner$repeatOn$2;
        }
        return Updater.produceState(gapComposer, valueOf, (Function2) rememberedValue2);
    }

    public static final Modifier cardSlideInOut(Modifier modifier, GapComposer gapComposer) {
        modifier.getClass();
        State cardTransitionState = cardTransitionState(gapComposer);
        State cardNuxAnimation = cardNuxAnimation(gapComposer);
        int m939getContainerSizeYbymL2g = (int) (((LazyWindowInfo) ((WindowInfo) gapComposer.consume(CompositionLocalsKt.LocalWindowInfo))).m939getContainerSizeYbymL2g() & BodyPartID.bodyIdMax);
        boolean changed = gapComposer.changed(m939getContainerSizeYbymL2g) | gapComposer.changed(cardTransitionState) | gapComposer.changed(cardNuxAnimation);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new PoolGoalMetKt$$ExternalSyntheticLambda6(m939getContainerSizeYbymL2g, cardTransitionState, cardNuxAnimation, 20);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return ColorKt.graphicsLayer(modifier, (Function1) rememberedValue);
    }

    public static final Modifier cardToolbarFadeInOut(Modifier modifier, GapComposer gapComposer) {
        modifier.getClass();
        MutableState transitionType = getTransitionType(gapComposer);
        CardRegistry cardRegistry = (CardRegistry) gapComposer.consume(LocalCardRegistry);
        boolean z = false;
        if (cardRegistry != null && cardRegistry.getInTransition()) {
            z = true;
        }
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(Boolean.valueOf(z), gapComposer);
        State isBroadwayEnteringState = isBroadwayEnteringState(gapComposer);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = Float.valueOf((((Boolean) rememberUpdatedState.getValue()).booleanValue() || ((Boolean) isBroadwayEnteringState.getValue()).booleanValue()) ? RecyclerView.DECELERATION_RATE : 1.0f);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Float valueOf = Float.valueOf(((Number) rememberedValue).floatValue());
        boolean changed = gapComposer.changed(rememberUpdatedState) | gapComposer.changed(transitionType) | gapComposer.changed(isBroadwayEnteringState);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed || rememberedValue2 == obj) {
            rememberedValue2 = new CoreInteractiveCardKt$InteractiveCardEffect$16$8$1(rememberUpdatedState, transitionType, isBroadwayEnteringState, (Continuation) null);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState produceState = Updater.produceState(gapComposer, valueOf, (Function2) rememberedValue2);
        boolean changed2 = gapComposer.changed(produceState);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue3 == obj) {
            rememberedValue3 = new MoneyTabUIKt$$ExternalSyntheticLambda10(produceState, 21);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        return ColorKt.graphicsLayer(modifier, (Function1) rememberedValue3);
    }

    public static final Modifier cardTransition(int i, int i2, Composer composer, Modifier modifier, String str, boolean z) {
        Object workflowLayout$start$1;
        int i3;
        MutableState mutableState;
        String str2;
        modifier.getClass();
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1562245742);
        int i4 = 2;
        boolean z2 = (i2 & 2) != 0 ? false : z;
        CardRegistry cardRegistry = (CardRegistry) gapComposer.consume(LocalCardRegistry);
        if (cardRegistry == null) {
            gapComposer.end(false);
            return modifier;
        }
        CardTransition(str, gapComposer, (i >> 3) & 14);
        CardScreenId cardScreenId = (CardScreenId) gapComposer.consume(LocalCardScreenId);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState2 = (MutableState) rememberedValue;
        MutableState transitionType = getTransitionType(gapComposer);
        Unit unit = Unit.INSTANCE;
        int i5 = (i & 112) ^ 48;
        boolean z3 = true;
        boolean changed = gapComposer.changed(transitionType) | gapComposer.changedInstance(cardRegistry) | ((i5 > 32 && gapComposer.changed(str)) || (i & 48) == 32);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed || rememberedValue2 == obj) {
            i3 = i5;
            mutableState = transitionType;
            str2 = str;
            workflowLayout$start$1 = new WorkflowLayout$start$1(cardRegistry, str2, mutableState, mutableState2, (Continuation) null, 13);
            gapComposer.updateRememberedValue(workflowLayout$start$1);
        } else {
            mutableState = transitionType;
            str2 = str;
            workflowLayout$start$1 = rememberedValue2;
            i3 = i5;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) workflowLayout$start$1);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj) {
            rememberedValue3 = Updater.derivedStateOf(new ListsKt$$ExternalSyntheticLambda0(i4, cardRegistry, cardScreenId));
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        State state = (State) rememberedValue3;
        State isBroadwayEnteringState = isBroadwayEnteringState(gapComposer);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == obj) {
            rememberedValue4 = new TabToolbarsKt$$ExternalSyntheticLambda10(23, mutableState2);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Modifier onPlaced = RulerKt.onPlaced(modifier, (Function1) rememberedValue4);
        boolean changedInstance = gapComposer.changedInstance(cardRegistry) | ((i3 > 32 && gapComposer.changed(str2)) || (i & 48) == 32) | gapComposer.changed(mutableState);
        if ((((i & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 || !gapComposer.changed(z2)) && (i & MLKEMEngine.KyberPolyBytes) != 256) {
            z3 = false;
        }
        boolean changed2 = changedInstance | z3 | gapComposer.changed(isBroadwayEnteringState);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue5 == obj) {
            Object sessionQueries$$ExternalSyntheticLambda0 = new SessionQueries$$ExternalSyntheticLambda0(cardRegistry, str2, z2, mutableState, state, isBroadwayEnteringState);
            gapComposer.updateRememberedValue(sessionQueries$$ExternalSyntheticLambda0);
            rememberedValue5 = sessionQueries$$ExternalSyntheticLambda0;
        }
        Modifier graphicsLayer = ColorKt.graphicsLayer(onPlaced, (Function1) rememberedValue5);
        gapComposer.end(false);
        return graphicsLayer;
    }

    public static final State cardTransitionState(Composer composer) {
        MutableState transitionType = getTransitionType(composer);
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(Boolean.valueOf(isTransitioningCard(composer)), composer);
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Float.valueOf(((Boolean) rememberUpdatedState.getValue()).booleanValue() ? 1.0f : RecyclerView.DECELERATION_RATE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        float floatValue = ((Number) rememberedValue).floatValue();
        CardRegistry cardRegistry = (CardRegistry) gapComposer.consume(LocalCardRegistry);
        SnapshotStateMap snapshotStateMap = cardRegistry != null ? cardRegistry.sharedTransitionCache : null;
        CardScreenId cardScreenId = (CardScreenId) gapComposer.consume(LocalCardScreenId);
        Unit unit = Unit.INSTANCE;
        boolean changed = gapComposer.changed(transitionType) | gapComposer.changed(rememberUpdatedState) | gapComposer.changed(snapshotStateMap) | gapComposer.changed(cardScreenId.ordinal());
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed || rememberedValue2 == neverEqualPolicy) {
            TakeUntil$collectSafely$2 takeUntil$collectSafely$2 = new TakeUntil$collectSafely$2(transitionType, rememberUpdatedState, snapshotStateMap, cardScreenId, null, 7);
            gapComposer.updateRememberedValue(takeUntil$collectSafely$2);
            rememberedValue2 = takeUntil$collectSafely$2;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        Float valueOf = Float.valueOf(floatValue);
        boolean changed2 = gapComposer.changed(snapshotStateMap) | gapComposer.changed(cardScreenId.ordinal());
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new ListsKt$$ExternalSyntheticLambda0(3, snapshotStateMap, cardScreenId);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Function0 function0 = (Function0) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState = (MutableState) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = Updater.derivedStateOf(new HeroCardViewKt$$ExternalSyntheticLambda9(2, function0, valueOf, mutableState));
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        return (State) rememberedValue5;
    }

    public static final StaticProvidableCompositionLocal getLocalCardRegistry() {
        return LocalCardRegistry;
    }

    public static final StaticProvidableCompositionLocal getLocalCardScreenId() {
        return LocalCardScreenId;
    }

    public static final MutableState getTransitionType(Composer composer) {
        Transition transition;
        CardRegistry$CardTransition$TransitionType cardRegistry$CardTransition$TransitionType;
        GapComposer gapComposer = (GapComposer) composer;
        AnimatedVisibilityScope animatedVisibilityScope = (AnimatedVisibilityScope) gapComposer.consume(UiScopeKt.LocalContainerAnimatedVisibilityScope);
        CardRegistry$CardTransition$TransitionType cardRegistry$CardTransition$TransitionType2 = null;
        if (animatedVisibilityScope != null && (transition = animatedVisibilityScope.getTransition()) != null) {
            int ordinal = ((EnterExitState) transition.targetState$delegate.getValue()).ordinal();
            if (ordinal == 0 || ordinal == 1) {
                cardRegistry$CardTransition$TransitionType = CardRegistry$CardTransition$TransitionType.TARGET;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                cardRegistry$CardTransition$TransitionType = CardRegistry$CardTransition$TransitionType.SOURCE;
            }
            cardRegistry$CardTransition$TransitionType2 = cardRegistry$CardTransition$TransitionType;
        }
        return Updater.rememberUpdatedState(cardRegistry$CardTransition$TransitionType2, gapComposer);
    }

    public static final State isBroadwayEnteringState(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        AnimatedVisibilityScope animatedVisibilityScope = (AnimatedVisibilityScope) gapComposer.consume(UiScopeKt.LocalContainerAnimatedVisibilityScope);
        Transition transition = animatedVisibilityScope != null ? animatedVisibilityScope.getTransition() : null;
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = Updater.derivedStateOf(new PageTagSlotKt$$ExternalSyntheticLambda0(transition, 13));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (State) rememberedValue;
    }

    public static final boolean isTransitioningCard(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1542331095);
        CardRegistry cardRegistry = (CardRegistry) gapComposer.consume(LocalCardRegistry);
        if (cardRegistry == null) {
            gapComposer.end(false);
            return false;
        }
        SnapshotStateMap snapshotStateMap = cardRegistry.sourceCardRegistry;
        boolean z = !(snapshotStateMap.isEmpty() || snapshotStateMap.containsValue((CardScreenId) gapComposer.consume(LocalCardScreenId))) || cardRegistry.getInTransition();
        gapComposer.end(false);
        return z;
    }

    public static final CardNuxState rememberCardNuxState(CardSchemeViewModel.Module.HeroCardDetails heroCardDetails, Composer composer) {
        heroCardDetails.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1021334893);
        CardRegistry cardRegistry = (CardRegistry) gapComposer.consume(LocalCardRegistry);
        Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (cardRegistry == null) {
            gapComposer.startReplaceGroup(-1039296076);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            boolean changed = gapComposer.changed(coroutineScope);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CardNuxState(context, heroCardDetails, coroutineScope);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            CardNuxState cardNuxState = (CardNuxState) rememberedValue2;
            gapComposer.end(false);
            gapComposer.end(false);
            return cardNuxState;
        }
        gapComposer.startReplaceGroup(-1039085617);
        gapComposer.end(false);
        if (cardRegistry.sharedNuxHero == null) {
            cardRegistry.sharedNuxHero = new CardNuxState(context, heroCardDetails, cardRegistry.scope);
        }
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(cardRegistry);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new CardAppletTileKt$$ExternalSyntheticLambda31(cardRegistry, 3);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.DisposableEffect(unit, (Function1) rememberedValue3, gapComposer);
        CardNuxState cardNuxState2 = cardRegistry.sharedNuxHero;
        cardNuxState2.getClass();
        gapComposer.end(false);
        return cardNuxState2;
    }

    public static final ParcelableSnapshotMutableState syncCardTransition(Function0 function0, Composer composer) {
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1896189723);
        MutableState transitionType = getTransitionType(gapComposer);
        CardRegistry cardRegistry = (CardRegistry) gapComposer.consume(LocalCardRegistry);
        Continuation continuation = null;
        if (cardRegistry == null) {
            gapComposer.end(false);
            return null;
        }
        if (((CardRegistry$CardTransition$TransitionType) transitionType.getValue()) == CardRegistry$CardTransition$TransitionType.TARGET) {
            gapComposer.startReplaceGroup(1978444770);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(cardRegistry);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TimerWorker$run$1(function0, cardRegistry, continuation, 3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
            gapComposer.end(false);
        } else {
            if (((CardRegistry$CardTransition$TransitionType) transitionType.getValue()) == CardRegistry$CardTransition$TransitionType.SOURCE) {
                gapComposer.startReplaceGroup(1978684586);
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = cardRegistry.sharedCardTransitionState;
                gapComposer.end(false);
                gapComposer.end(false);
                return parcelableSnapshotMutableState;
            }
            gapComposer.startReplaceGroup(1978743207);
            gapComposer.end(false);
        }
        gapComposer.end(false);
        return null;
    }

    public static final Engine tagEngineCache(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1467667100);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = new AlertBannerKt$$ExternalSyntheticLambda0(17);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        CardRegistry cardRegistry = (CardRegistry) gapComposer.consume(LocalCardRegistry);
        if (cardRegistry == null) {
            gapComposer.end(false);
            return null;
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = cardRegistry.tagEngineError$delegate;
        LinkedHashMap linkedHashMap = cardRegistry.pageTagSlots;
        if (!((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue()) {
            gapComposer.startReplaceGroup(283404384);
            gapComposer.end(false);
            Engine engine = cardRegistry.tagEngine;
            if (engine == null) {
                try {
                    engine = new Engine(cardRegistry.scope, new CardTransitionKt$$ExternalSyntheticLambda19(cardRegistry, function0, 1));
                    engine.initialize();
                    cardRegistry.tagEngine = engine;
                } catch (Exception e) {
                    Timber.Forest forest = Timber.Forest;
                    forest.tag("tagEngineCache");
                    forest.e("Tag engine creation failed", new Object[0], e);
                    parcelableSnapshotMutableState.setValue(Boolean.TRUE);
                    function0.invoke();
                }
            }
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(cardRegistry);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CardAppletTileKt$$ExternalSyntheticLambda31(cardRegistry, 5);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.DisposableEffect(unit, (Function1) rememberedValue2, gapComposer);
            gapComposer.end(false);
            return engine;
        }
        gapComposer.startReplaceGroup(283025750);
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((PageTagSlot) it.next()).dispose();
        }
        linkedHashMap.clear();
        Engine engine2 = cardRegistry.tagEngine;
        if (engine2 != null) {
            engine2.shutdown();
        }
        cardRegistry.tagEngine = null;
        Unit unit2 = Unit.INSTANCE;
        boolean changed = gapComposer.changed(function0);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new CardTransitionKt$sceneCache$4$1$1(function0, null, 5);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, unit2, (Function2) rememberedValue3);
        gapComposer.end(false);
        gapComposer.end(false);
        return null;
    }
}
