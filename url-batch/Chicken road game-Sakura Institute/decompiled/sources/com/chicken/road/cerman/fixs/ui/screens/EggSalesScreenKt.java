package com.chicken.road.cerman.fixs.ui.screens;

import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavController;
import com.chicken.road.cerman.fixs.BroilerApp;
import com.chicken.road.cerman.fixs.Routes;
import com.chicken.road.cerman.fixs.data.Chicken;
import com.chicken.road.cerman.fixs.data.EggLog;
import com.chicken.road.cerman.fixs.data.Repository;
import com.chicken.road.cerman.fixs.data.Sale;
import com.chicken.road.cerman.fixs.ui.CommonKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EggSalesScreen.kt */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a=\u0010\u0005\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\fH\u0003¢\u0006\u0002\u0010\u000e\u001a=\u0010\u000f\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\fH\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u0011²\u0006\u0010\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0007X\u008a\u0084\u0002²\u0006\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007X\u008a\u0084\u0002²\u0006\u0010\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u008a\u0084\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u008e\u0002²\u0006\f\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u0019X\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0019X\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u0019X\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020\u0019X\u008a\u008e\u0002²\u0006\f\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u008a\u008e\u0002"}, d2 = {"EggSalesScreen", "", "nav", "Landroidx/navigation/NavController;", "(Landroidx/navigation/NavController;Landroidx/compose/runtime/Composer;I)V", "AddEggDialog", "chickens", "", "Lcom/chicken/road/cerman/fixs/data/Chicken;", "onDismiss", "Lkotlin/Function0;", "onSave", "Lkotlin/Function1;", "Lcom/chicken/road/cerman/fixs/data/EggLog;", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "AddSaleDialog", "Lcom/chicken/road/cerman/fixs/data/Sale;", "app_release", Routes.EGGS, "sales", "tab", "", "addOpen", "", "count", "", "pickedId", "", "saleType", "qty", "price", "buyer"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EggSalesScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddEggDialog$lambda$27(List list, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        AddEggDialog(list, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddSaleDialog$lambda$43(List list, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        AddSaleDialog(list, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EggSalesScreen$lambda$20(NavController navController, int i, Composer composer, int i2) {
        EggSalesScreen(navController, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void EggSalesScreen(final NavController nav, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(nav, "nav");
        Composer startRestartGroup = composer.startRestartGroup(1566839068);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(nav) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1566839068, i2, -1, "com.chicken.road.cerman.fixs.ui.screens.EggSalesScreen (EggSalesScreen.kt:56)");
            }
            startRestartGroup.startReplaceGroup(-1725583765);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = BroilerApp.INSTANCE.getINSTANCE().getRepository();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final Repository repository = (Repository) rememberedValue;
            startRestartGroup.endReplaceGroup();
            State collectAsState = SnapshotStateKt.collectAsState(repository.getAllEggs(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            State collectAsState2 = SnapshotStateKt.collectAsState(repository.getAllSales(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            State collectAsState3 = SnapshotStateKt.collectAsState(repository.getChickens(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            startRestartGroup.startReplaceGroup(-1725575234);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1725573630);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue4 = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue4).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(-1725569034);
            boolean changedInstance = startRestartGroup.changedInstance(nav);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit EggSalesScreen$lambda$11$lambda$10;
                        EggSalesScreen$lambda$11$lambda$10 = EggSalesScreenKt.EggSalesScreen$lambda$11$lambda$10(NavController.this);
                        return EggSalesScreen$lambda$11$lambda$10;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            startRestartGroup.endReplaceGroup();
            CommonKt.FarmScaffold("Eggs & Sales", (Function0) rememberedValue5, null, ComposableLambdaKt.rememberComposableLambda(373077888, true, new EggSalesScreenKt$EggSalesScreen$2(mutableState, mutableState2), startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1025079236, true, new EggSalesScreenKt$EggSalesScreen$3(collectAsState, collectAsState3, collectAsState2, mutableState), startRestartGroup, 54), startRestartGroup, 27654, 4);
            if (EggSalesScreen$lambda$8(mutableState2)) {
                if (EggSalesScreen$lambda$5(mutableState) == 0) {
                    startRestartGroup.startReplaceGroup(-1948322019);
                    List<Chicken> EggSalesScreen$lambda$3 = EggSalesScreen$lambda$3(collectAsState3);
                    startRestartGroup.startReplaceGroup(-1725415661);
                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit EggSalesScreen$lambda$13$lambda$12;
                                EggSalesScreen$lambda$13$lambda$12 = EggSalesScreenKt.EggSalesScreen$lambda$13$lambda$12(MutableState.this);
                                return EggSalesScreen$lambda$13$lambda$12;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    Function0 function0 = (Function0) rememberedValue6;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-1725414923);
                    boolean changedInstance2 = startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changedInstance(repository);
                    Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (changedInstance2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit EggSalesScreen$lambda$15$lambda$14;
                                EggSalesScreen$lambda$15$lambda$14 = EggSalesScreenKt.EggSalesScreen$lambda$15$lambda$14(CoroutineScope.this, repository, mutableState2, (EggLog) obj);
                                return EggSalesScreen$lambda$15$lambda$14;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    startRestartGroup.endReplaceGroup();
                    AddEggDialog(EggSalesScreen$lambda$3, function0, (Function1) rememberedValue7, startRestartGroup, 48);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1948152325);
                    List<Chicken> EggSalesScreen$lambda$32 = EggSalesScreen$lambda$3(collectAsState3);
                    startRestartGroup.startReplaceGroup(-1725410157);
                    Object rememberedValue8 = startRestartGroup.rememberedValue();
                    if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit EggSalesScreen$lambda$17$lambda$16;
                                EggSalesScreen$lambda$17$lambda$16 = EggSalesScreenKt.EggSalesScreen$lambda$17$lambda$16(MutableState.this);
                                return EggSalesScreen$lambda$17$lambda$16;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                    }
                    Function0 function02 = (Function0) rememberedValue8;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-1725409418);
                    boolean changedInstance3 = startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changedInstance(repository);
                    Object rememberedValue9 = startRestartGroup.rememberedValue();
                    if (changedInstance3 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue9 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit EggSalesScreen$lambda$19$lambda$18;
                                EggSalesScreen$lambda$19$lambda$18 = EggSalesScreenKt.EggSalesScreen$lambda$19$lambda$18(CoroutineScope.this, repository, mutableState2, (Sale) obj);
                                return EggSalesScreen$lambda$19$lambda$18;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue9);
                    }
                    startRestartGroup.endReplaceGroup();
                    AddSaleDialog(EggSalesScreen$lambda$32, function02, (Function1) rememberedValue9, startRestartGroup, 48);
                    startRestartGroup.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit EggSalesScreen$lambda$20;
                    EggSalesScreen$lambda$20 = EggSalesScreenKt.EggSalesScreen$lambda$20(NavController.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return EggSalesScreen$lambda$20;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int EggSalesScreen$lambda$5(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EggSalesScreen$lambda$6(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    private static final boolean EggSalesScreen$lambda$8(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EggSalesScreen$lambda$9(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EggSalesScreen$lambda$11$lambda$10(NavController navController) {
        navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EggSalesScreen$lambda$13$lambda$12(MutableState mutableState) {
        EggSalesScreen$lambda$9(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EggSalesScreen$lambda$15$lambda$14(CoroutineScope coroutineScope, Repository repository, MutableState mutableState, EggLog e) {
        Intrinsics.checkNotNullParameter(e, "e");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new EggSalesScreenKt$EggSalesScreen$5$1$1(repository, e, null), 3, null);
        EggSalesScreen$lambda$9(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EggSalesScreen$lambda$17$lambda$16(MutableState mutableState) {
        EggSalesScreen$lambda$9(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EggSalesScreen$lambda$19$lambda$18(CoroutineScope coroutineScope, Repository repository, MutableState mutableState, Sale s) {
        Intrinsics.checkNotNullParameter(s, "s");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new EggSalesScreenKt$EggSalesScreen$7$1$1(repository, s, null), 3, null);
        EggSalesScreen$lambda$9(mutableState, false);
        return Unit.INSTANCE;
    }

    private static final void AddEggDialog(final List<Chicken> list, final Function0<Unit> function0, final Function1<? super EggLog, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1401961463);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1401961463, i2, -1, "com.chicken.road.cerman.fixs.ui.screens.AddEggDialog (EggSalesScreen.kt:162)");
            }
            startRestartGroup.startReplaceGroup(-2074186568);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-2074184895);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            AndroidAlertDialog_androidKt.m1440AlertDialogOix01E0(function0, ComposableLambdaKt.rememberComposableLambda(-121040703, true, new EggSalesScreenKt$AddEggDialog$1(function1, mutableState, mutableState2), startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(167778687, true, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$AddEggDialog$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(167778687, i3, -1, "com.chicken.road.cerman.fixs.ui.screens.AddEggDialog.<anonymous> (EggSalesScreen.kt:180)");
                    }
                    ButtonKt.TextButton(function0, null, false, null, null, null, null, null, null, ComposableSingletons$EggSalesScreenKt.INSTANCE.m6705getLambda7$app_release(), composer3, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), null, ComposableSingletons$EggSalesScreenKt.INSTANCE.m6706getLambda8$app_release(), ComposableLambdaKt.rememberComposableLambda(601007772, true, new EggSalesScreenKt$AddEggDialog$3(list, mutableState2, mutableState), startRestartGroup, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, ((i2 >> 3) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AddEggDialog$lambda$27;
                    AddEggDialog$lambda$27 = EggSalesScreenKt.AddEggDialog$lambda$27(list, function0, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                    return AddEggDialog$lambda$27;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AddEggDialog$lambda$22(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long AddEggDialog$lambda$25(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    private static final void AddSaleDialog(final List<Chicken> list, final Function0<Unit> function0, Function1<? super Sale, Unit> function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        final int i3;
        final Function1<? super Sale, Unit> function12;
        final Function0<Unit> function02;
        Composer startRestartGroup = composer.startRestartGroup(1291331777);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i2;
        if ((i4 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1291331777, i4, -1, "com.chicken.road.cerman.fixs.ui.screens.AddSaleDialog (EggSalesScreen.kt:185)");
            }
            List listOf = CollectionsKt.listOf((Object[]) new String[]{"Eggs (each)", "Egg dozen", "Whole bird", "Chicks", "Manure"});
            startRestartGroup.startReplaceGroup(1749996202);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(listOf.get(0), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1749997954);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1749999522);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState3 = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1750001090);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState4 = (MutableState) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1750002763);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            MutableState mutableState5 = (MutableState) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            i3 = i;
            function12 = function1;
            function02 = function0;
            AndroidAlertDialog_androidKt.m1440AlertDialogOix01E0(function0, ComposableLambdaKt.rememberComposableLambda(-1949797623, true, new EggSalesScreenKt$AddSaleDialog$1(function1, mutableState2, mutableState3, mutableState5, mutableState, mutableState4), startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(-1586331125, true, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$AddSaleDialog$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1586331125, i5, -1, "com.chicken.road.cerman.fixs.ui.screens.AddSaleDialog.<anonymous> (EggSalesScreen.kt:220)");
                    }
                    ButtonKt.TextButton(function0, null, false, null, null, null, null, null, null, ComposableSingletons$EggSalesScreenKt.INSTANCE.m6695getLambda11$app_release(), composer3, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), null, ComposableSingletons$EggSalesScreenKt.INSTANCE.m6696getLambda12$app_release(), ComposableLambdaKt.rememberComposableLambda(-1041131378, true, new EggSalesScreenKt$AddSaleDialog$3(list, mutableState5, listOf, mutableState, mutableState2, mutableState3, mutableState4), startRestartGroup, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, ((i4 >> 3) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            function02 = function0;
            i3 = i;
            function12 = function1;
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AddSaleDialog$lambda$43;
                    AddSaleDialog$lambda$43 = EggSalesScreenKt.AddSaleDialog$lambda$43(list, function02, function12, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return AddSaleDialog$lambda$43;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AddSaleDialog$lambda$29(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AddSaleDialog$lambda$32(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AddSaleDialog$lambda$35(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AddSaleDialog$lambda$38(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long AddSaleDialog$lambda$41(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<EggLog> EggSalesScreen$lambda$1(State<? extends List<EggLog>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Sale> EggSalesScreen$lambda$2(State<? extends List<Sale>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Chicken> EggSalesScreen$lambda$3(State<? extends List<Chicken>> state) {
        return state.getValue();
    }
}
