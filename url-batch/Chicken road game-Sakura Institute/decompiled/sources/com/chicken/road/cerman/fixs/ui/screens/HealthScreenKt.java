package com.chicken.road.cerman.fixs.ui.screens;

import android.content.Context;
import androidx.autofill.HintConstants;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.navigation.NavController;
import androidx.profileinstaller.ProfileVerifier;
import com.chicken.road.cerman.fixs.BroilerApp;
import com.chicken.road.cerman.fixs.data.Chicken;
import com.chicken.road.cerman.fixs.data.Repository;
import com.chicken.road.cerman.fixs.data.Vaccination;
import com.chicken.road.cerman.fixs.data.WeightEntry;
import com.chicken.road.cerman.fixs.ui.CommonKt;
import com.chicken.road.cerman.fixs.ui.Fmt;
import com.chicken.road.cerman.fixs.ui.theme.ThemeKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HealthScreen.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a3\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0002\u0010\u000e\u001a=\u0010\u000f\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0015H\u0003¢\u0006\u0002\u0010\u0016\u001a=\u0010\u0017\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0015H\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0019²\u0006\u0010\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u008a\u0084\u0002²\u0006\u0010\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011X\u008a\u0084\u0002²\u0006\u0010\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\tX\u008a\u008e\u0002²\u0006\f\u0010\"\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002²\u0006\f\u0010#\u001a\u0004\u0018\u00010\u001dX\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020\tX\u008a\u008e\u0002²\u0006\f\u0010\"\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002"}, d2 = {"HealthScreen", "", "nav", "Landroidx/navigation/NavController;", "(Landroidx/navigation/NavController;Landroidx/compose/runtime/Composer;I)V", "UpcomingCard", "v", "Lcom/chicken/road/cerman/fixs/data/Vaccination;", "who", "", "now", "", "onDone", "Lkotlin/Function0;", "(Lcom/chicken/road/cerman/fixs/data/Vaccination;Ljava/lang/String;JLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AddVaccineDialog", "chickens", "", "Lcom/chicken/road/cerman/fixs/data/Chicken;", "onDismiss", "onSave", "Lkotlin/Function1;", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "AddWeightDialog", "Lcom/chicken/road/cerman/fixs/data/WeightEntry;", "app_release", "vacc", "weights", "tab", "", "addOpen", "", HintConstants.AUTOFILL_HINT_NAME, "notes", "pickedId", "dueDays", "grams"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddVaccineDialog$lambda$38(List list, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        AddVaccineDialog(list, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddWeightDialog$lambda$45(List list, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        AddWeightDialog(list, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HealthScreen$lambda$23(NavController navController, int i, Composer composer, int i2) {
        HealthScreen(navController, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpcomingCard$lambda$24(Vaccination vaccination, String str, long j, Function0 function0, int i, Composer composer, int i2) {
        UpcomingCard(vaccination, str, j, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpcomingCard$lambda$25(Vaccination vaccination, String str, long j, Function0 function0, int i, Composer composer, int i2) {
        UpcomingCard(vaccination, str, j, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void HealthScreen(final NavController nav, Composer composer, final int i) {
        final MutableState mutableState;
        Intrinsics.checkNotNullParameter(nav, "nav");
        Composer startRestartGroup = composer.startRestartGroup(-325867012);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changedInstance(nav) ? 4 : 2) | i : i;
        if ((i2 & 3) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-325867012, i2, -1, "com.chicken.road.cerman.fixs.ui.screens.HealthScreen (HealthScreen.kt:62)");
            }
            startRestartGroup.startReplaceGroup(689461248);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = BroilerApp.INSTANCE.getINSTANCE().getRepository();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final Repository repository = (Repository) rememberedValue;
            startRestartGroup.endReplaceGroup();
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context = (Context) consume;
            State collectAsState = SnapshotStateKt.collectAsState(repository.getChickens(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            State collectAsState2 = SnapshotStateKt.collectAsState(repository.getAllVaccinations(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            State collectAsState3 = SnapshotStateKt.collectAsState(repository.getAllWeights(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            startRestartGroup.startReplaceGroup(689472211);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(689473815);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState3 = (MutableState) rememberedValue3;
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
            long currentTimeMillis = System.currentTimeMillis();
            List<Vaccination> HealthScreen$lambda$2 = HealthScreen$lambda$2(collectAsState2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : HealthScreen$lambda$2) {
                Vaccination vaccination = (Vaccination) obj;
                if (!vaccination.getDone() && vaccination.getDueDate() != null) {
                    arrayList.add(obj);
                }
            }
            List sortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((Vaccination) t).getDueDate(), ((Vaccination) t2).getDueDate());
                }
            });
            List<Vaccination> HealthScreen$lambda$22 = HealthScreen$lambda$2(collectAsState2);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : HealthScreen$lambda$22) {
                Vaccination vaccination2 = (Vaccination) obj2;
                if (vaccination2.getDone() || vaccination2.getDueDate() == null) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = arrayList2;
            startRestartGroup.startReplaceGroup(689485067);
            boolean changedInstance = startRestartGroup.changedInstance(nav);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit HealthScreen$lambda$14$lambda$13;
                        HealthScreen$lambda$14$lambda$13 = HealthScreenKt.HealthScreen$lambda$14$lambda$13(NavController.this);
                        return HealthScreen$lambda$14$lambda$13;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            startRestartGroup.endReplaceGroup();
            CommonKt.FarmScaffold("Health", (Function0) rememberedValue5, null, ComposableLambdaKt.rememberComposableLambda(644293216, true, new HealthScreenKt$HealthScreen$2(mutableState2, mutableState3), startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1288785636, true, new HealthScreenKt$HealthScreen$3(sortedWith, collectAsState, currentTimeMillis, coroutineScope, repository, context, arrayList3, collectAsState3, mutableState2, collectAsState2), startRestartGroup, 54), startRestartGroup, 27654, 4);
            if (HealthScreen$lambda$8(mutableState3)) {
                if (HealthScreen$lambda$5(mutableState2) == 0) {
                    startRestartGroup.startReplaceGroup(-95327157);
                    List<Chicken> HealthScreen$lambda$1 = HealthScreen$lambda$1(collectAsState);
                    startRestartGroup.startReplaceGroup(689663016);
                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        mutableState = mutableState3;
                        rememberedValue6 = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit HealthScreen$lambda$16$lambda$15;
                                HealthScreen$lambda$16$lambda$15 = HealthScreenKt.HealthScreen$lambda$16$lambda$15(MutableState.this);
                                return HealthScreen$lambda$16$lambda$15;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    } else {
                        mutableState = mutableState3;
                    }
                    Function0 function0 = (Function0) rememberedValue6;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(689663875);
                    boolean changedInstance2 = startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changedInstance(repository) | startRestartGroup.changedInstance(context);
                    Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (changedInstance2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                Unit HealthScreen$lambda$18$lambda$17;
                                HealthScreen$lambda$18$lambda$17 = HealthScreenKt.HealthScreen$lambda$18$lambda$17(CoroutineScope.this, repository, context, mutableState, (Vaccination) obj3);
                                return HealthScreen$lambda$18$lambda$17;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    startRestartGroup.endReplaceGroup();
                    AddVaccineDialog(HealthScreen$lambda$1, function0, (Function1) rememberedValue7, startRestartGroup, 48);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-95037214);
                    List<Chicken> HealthScreen$lambda$12 = HealthScreen$lambda$1(collectAsState);
                    startRestartGroup.startReplaceGroup(689672456);
                    Object rememberedValue8 = startRestartGroup.rememberedValue();
                    if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit HealthScreen$lambda$20$lambda$19;
                                HealthScreen$lambda$20$lambda$19 = HealthScreenKt.HealthScreen$lambda$20$lambda$19(MutableState.this);
                                return HealthScreen$lambda$20$lambda$19;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                    }
                    Function0 function02 = (Function0) rememberedValue8;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(689673197);
                    boolean changedInstance3 = startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changedInstance(repository);
                    Object rememberedValue9 = startRestartGroup.rememberedValue();
                    if (changedInstance3 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue9 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                Unit HealthScreen$lambda$22$lambda$21;
                                HealthScreen$lambda$22$lambda$21 = HealthScreenKt.HealthScreen$lambda$22$lambda$21(CoroutineScope.this, repository, mutableState3, (WeightEntry) obj3);
                                return HealthScreen$lambda$22$lambda$21;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue9);
                    }
                    startRestartGroup.endReplaceGroup();
                    AddWeightDialog(HealthScreen$lambda$12, function02, (Function1) rememberedValue9, startRestartGroup, 48);
                    startRestartGroup.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Unit HealthScreen$lambda$23;
                    HealthScreen$lambda$23 = HealthScreenKt.HealthScreen$lambda$23(NavController.this, i, (Composer) obj3, ((Integer) obj4).intValue());
                    return HealthScreen$lambda$23;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int HealthScreen$lambda$5(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HealthScreen$lambda$6(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    private static final boolean HealthScreen$lambda$8(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HealthScreen$lambda$9(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HealthScreen$lambda$14$lambda$13(NavController navController) {
        navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HealthScreen$lambda$16$lambda$15(MutableState mutableState) {
        HealthScreen$lambda$9(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HealthScreen$lambda$18$lambda$17(CoroutineScope coroutineScope, Repository repository, Context context, MutableState mutableState, Vaccination v) {
        Intrinsics.checkNotNullParameter(v, "v");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new HealthScreenKt$HealthScreen$5$1$1(repository, v, context, null), 3, null);
        HealthScreen$lambda$9(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HealthScreen$lambda$20$lambda$19(MutableState mutableState) {
        HealthScreen$lambda$9(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HealthScreen$lambda$22$lambda$21(CoroutineScope coroutineScope, Repository repository, MutableState mutableState, WeightEntry w) {
        Intrinsics.checkNotNullParameter(w, "w");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new HealthScreenKt$HealthScreen$7$1$1(repository, w, null), 3, null);
        HealthScreen$lambda$9(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UpcomingCard(final Vaccination vaccination, final String str, final long j, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        long forest;
        String str2;
        Composer startRestartGroup = composer.startRestartGroup(1122068317);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(vaccination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1122068317, i2, -1, "com.chicken.road.cerman.fixs.ui.screens.UpcomingCard (HealthScreen.kt:193)");
            }
            Long dueDate = vaccination.getDueDate();
            if (dueDate == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit UpcomingCard$lambda$24;
                            UpcomingCard$lambda$24 = HealthScreenKt.UpcomingCard$lambda$24(Vaccination.this, str, j, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                            return UpcomingCard$lambda$24;
                        }
                    });
                    return;
                }
                return;
            }
            final long longValue = dueDate.longValue();
            int i3 = (int) ((longValue - j) / CalendarModelKt.MillisecondsIn24Hours);
            boolean z = longValue < j;
            if (z) {
                forest = ThemeKt.getBrick();
            } else if (i3 <= 3) {
                forest = ThemeKt.getAmberDeep();
            } else {
                forest = ThemeKt.getForest();
            }
            final long j2 = forest;
            if (z) {
                str2 = "OVERDUE " + (-i3) + "d";
            } else if (i3 == 0) {
                str2 = "TODAY";
            } else {
                str2 = i3 == 1 ? "TOMORROW" : "IN " + i3 + "d";
            }
            final String str3 = str2;
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m964RoundedCornerShape0680j_4(Dp.m6299constructorimpl(16)), CardDefaults.INSTANCE.m1508cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-2120276565, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$UpcomingCard$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                    invoke(columnScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope Card, Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                    if ((i4 & 17) != 16 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2120276565, i4, -1, "com.chicken.road.cerman.fixs.ui.screens.UpcomingCard.<anonymous> (HealthScreen.kt:213)");
                        }
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m681padding3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(14)), 0.0f, 1, null);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function0<Unit> function02 = function0;
                        Vaccination vaccination2 = vaccination;
                        String str4 = str;
                        long j3 = longValue;
                        String str5 = str3;
                        long j4 = j2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer m3333constructorimpl = Updater.m3333constructorimpl(composer2);
                        Updater.m3340setimpl(m3333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        Modifier weight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, weight$default);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer m3333constructorimpl2 = Updater.m3333constructorimpl(composer2);
                        Updater.m3340setimpl(m3333constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        TextKt.m2373Text4IGK_g(vaccination2.getName(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleMedium(), composer2, 0, 0, 65534);
                        TextKt.m2373Text4IGK_g(str4 + " · due " + Fmt.INSTANCE.date(j3), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                        SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(6)), composer2, 6);
                        CommonKt.m6677PillRPmYEkk(str5, j4, composer2, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        IconButtonKt.IconButton(function02, null, false, null, null, ComposableSingletons$HealthScreenKt.INSTANCE.m6738getLambda7$app_release(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, 196614, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new Function2() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit UpcomingCard$lambda$25;
                    UpcomingCard$lambda$25 = HealthScreenKt.UpcomingCard$lambda$25(Vaccination.this, str, j, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                    return UpcomingCard$lambda$25;
                }
            });
        }
    }

    private static final void AddVaccineDialog(final List<Chicken> list, final Function0<Unit> function0, Function1<? super Vaccination, Unit> function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        final int i3;
        final Function1<? super Vaccination, Unit> function12;
        final Function0<Unit> function02;
        Composer startRestartGroup = composer.startRestartGroup(-1110015132);
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
                ComposerKt.traceEventStart(-1110015132, i4, -1, "com.chicken.road.cerman.fixs.ui.screens.AddVaccineDialog (HealthScreen.kt:228)");
            }
            List listOf = CollectionsKt.listOf((Object[]) new String[]{"Newcastle", "Marek", "Gumboro", "Infectious Bronchitis", "Coccidiosis"});
            List listOf2 = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(0, "Today"), TuplesKt.to(7, "In 1w"), TuplesKt.to(14, "In 2w"), TuplesKt.to(30, "In 1mo")});
            startRestartGroup.startReplaceGroup(304271344);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(listOf.get(0), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(304273160);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(304274833);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState3 = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(304276749);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(7, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState4 = (MutableState) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            i3 = i;
            function12 = function1;
            function02 = function0;
            AndroidAlertDialog_androidKt.m1440AlertDialogOix01E0(function0, ComposableLambdaKt.rememberComposableLambda(1494188572, true, new HealthScreenKt$AddVaccineDialog$1(function1, mutableState4, mutableState3, mutableState, mutableState2), startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(-123251878, true, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$AddVaccineDialog$2
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
                        ComposerKt.traceEventStart(-123251878, i5, -1, "com.chicken.road.cerman.fixs.ui.screens.AddVaccineDialog.<anonymous> (HealthScreen.kt:263)");
                    }
                    ButtonKt.TextButton(function0, null, false, null, null, null, null, null, null, ComposableSingletons$HealthScreenKt.INSTANCE.m6740getLambda9$app_release(), composer3, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), null, ComposableSingletons$HealthScreenKt.INSTANCE.m6726getLambda10$app_release(), ComposableLambdaKt.rememberComposableLambda(-401928905, true, new HealthScreenKt$AddVaccineDialog$3(list, mutableState3, listOf, mutableState, listOf2, mutableState4, mutableState2), startRestartGroup, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, ((i4 >> 3) & 14) | 1772592, 0, 16276);
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
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AddVaccineDialog$lambda$38;
                    AddVaccineDialog$lambda$38 = HealthScreenKt.AddVaccineDialog$lambda$38(list, function02, function12, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return AddVaccineDialog$lambda$38;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AddVaccineDialog$lambda$27(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AddVaccineDialog$lambda$30(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long AddVaccineDialog$lambda$33(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer AddVaccineDialog$lambda$36(MutableState<Integer> mutableState) {
        return mutableState.getValue();
    }

    private static final void AddWeightDialog(final List<Chicken> list, final Function0<Unit> function0, final Function1<? super WeightEntry, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1663501947);
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
                ComposerKt.traceEventStart(1663501947, i2, -1, "com.chicken.road.cerman.fixs.ui.screens.AddWeightDialog (HealthScreen.kt:268)");
            }
            startRestartGroup.startReplaceGroup(295146323);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(295148018);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Chicken chicken = (Chicken) CollectionsKt.firstOrNull((List) list);
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(chicken != null ? Long.valueOf(chicken.getId()) : null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            AndroidAlertDialog_androidKt.m1440AlertDialogOix01E0(function0, ComposableLambdaKt.rememberComposableLambda(-1577627453, true, new HealthScreenKt$AddWeightDialog$1(function1, mutableState2, mutableState), startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(-1214160955, true, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$AddWeightDialog$2
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
                        ComposerKt.traceEventStart(-1214160955, i3, -1, "com.chicken.road.cerman.fixs.ui.screens.AddWeightDialog.<anonymous> (HealthScreen.kt:286)");
                    }
                    ButtonKt.TextButton(function0, null, false, null, null, null, null, null, null, ComposableSingletons$HealthScreenKt.INSTANCE.m6730getLambda14$app_release(), composer3, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), null, ComposableSingletons$HealthScreenKt.INSTANCE.m6731getLambda15$app_release(), ComposableLambdaKt.rememberComposableLambda(-668961208, true, new HealthScreenKt$AddWeightDialog$3(list, mutableState2, mutableState), startRestartGroup, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, ((i2 >> 3) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AddWeightDialog$lambda$45;
                    AddWeightDialog$lambda$45 = HealthScreenKt.AddWeightDialog$lambda$45(list, function0, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                    return AddWeightDialog$lambda$45;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AddWeightDialog$lambda$40(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long AddWeightDialog$lambda$43(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Chicken> HealthScreen$lambda$1(State<? extends List<Chicken>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Vaccination> HealthScreen$lambda$2(State<? extends List<Vaccination>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<WeightEntry> HealthScreen$lambda$3(State<? extends List<WeightEntry>> state) {
        return state.getValue();
    }
}
