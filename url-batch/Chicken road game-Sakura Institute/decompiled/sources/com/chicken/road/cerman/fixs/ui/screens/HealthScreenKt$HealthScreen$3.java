package com.chicken.road.cerman.fixs.ui.screens;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.VaccinesKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TabRowKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.chicken.road.cerman.fixs.data.Chicken;
import com.chicken.road.cerman.fixs.data.Repository;
import com.chicken.road.cerman.fixs.data.Vaccination;
import com.chicken.road.cerman.fixs.data.WeightEntry;
import com.chicken.road.cerman.fixs.notifications.VaccineReminders;
import com.chicken.road.cerman.fixs.ui.CommonKt;
import com.chicken.road.cerman.fixs.ui.Fmt;
import com.chicken.road.cerman.fixs.ui.theme.ThemeKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HealthScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class HealthScreenKt$HealthScreen$3 implements Function3<PaddingValues, Composer, Integer, Unit> {
    final /* synthetic */ State<List<Chicken>> $chickens$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ List<Vaccination> $history;
    final /* synthetic */ long $now;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ MutableState<Integer> $tab$delegate;
    final /* synthetic */ List<Vaccination> $upcoming;
    final /* synthetic */ State<List<Vaccination>> $vacc$delegate;
    final /* synthetic */ State<List<WeightEntry>> $weights$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    HealthScreenKt$HealthScreen$3(List<Vaccination> list, State<? extends List<Chicken>> state, long j, CoroutineScope coroutineScope, Repository repository, Context context, List<Vaccination> list2, State<? extends List<WeightEntry>> state2, MutableState<Integer> mutableState, State<? extends List<Vaccination>> state3) {
        this.$upcoming = list;
        this.$chickens$delegate = state;
        this.$now = j;
        this.$scope = coroutineScope;
        this.$repo = repository;
        this.$ctx = context;
        this.$history = list2;
        this.$weights$delegate = state2;
        this.$tab$delegate = mutableState;
        this.$vacc$delegate = state3;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
        invoke(paddingValues, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PaddingValues inner, Composer composer, int i) {
        int i2;
        int HealthScreen$lambda$5;
        int HealthScreen$lambda$52;
        List HealthScreen$lambda$3;
        List HealthScreen$lambda$2;
        Intrinsics.checkNotNullParameter(inner, "inner");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(inner) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1288785636, i2, -1, "com.chicken.road.cerman.fixs.ui.screens.HealthScreen.<anonymous> (HealthScreen.kt:91)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, inner), 0.0f, 1, null);
            final List<Vaccination> list = this.$upcoming;
            final State<List<Chicken>> state = this.$chickens$delegate;
            final long j = this.$now;
            final CoroutineScope coroutineScope = this.$scope;
            final Repository repository = this.$repo;
            final Context context = this.$ctx;
            final List<Vaccination> list2 = this.$history;
            final State<List<WeightEntry>> state2 = this.$weights$delegate;
            MutableState<Integer> mutableState = this.$tab$delegate;
            State<List<Vaccination>> state3 = this.$vacc$delegate;
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m3333constructorimpl = Updater.m3333constructorimpl(composer);
            Updater.m3340setimpl(m3333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            HealthScreen$lambda$5 = HealthScreenKt.HealthScreen$lambda$5(mutableState);
            TabRowKt.m2277SecondaryTabRowpAZo6Ak(HealthScreen$lambda$5, null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getBackground(), 0L, null, null, ComposableLambdaKt.rememberComposableLambda(-115924166, true, new HealthScreenKt$HealthScreen$3$1$1(mutableState), composer, 54), composer, 1572864, 58);
            HealthScreen$lambda$52 = HealthScreenKt.HealthScreen$lambda$5(mutableState);
            if (HealthScreen$lambda$52 == 0) {
                composer.startReplaceGroup(-1192276937);
                HealthScreen$lambda$2 = HealthScreenKt.HealthScreen$lambda$2(state3);
                if (HealthScreen$lambda$2.isEmpty()) {
                    composer.startReplaceGroup(-1192324708);
                    CommonKt.EmptyState(VaccinesKt.getVaccines(Icons.Filled.INSTANCE), "No vaccinations", "Track Newcastle, Marek, Gumboro and other vaccines.", composer, 432);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1192093820);
                    PaddingValues m674PaddingValues0680j_4 = PaddingKt.m674PaddingValues0680j_4(Dp.m6299constructorimpl(16));
                    Arrangement.HorizontalOrVertical m561spacedBy0680j_4 = Arrangement.INSTANCE.m561spacedBy0680j_4(Dp.m6299constructorimpl(8));
                    composer.startReplaceGroup(1485573033);
                    boolean changedInstance = composer.changedInstance(list) | composer.changed(state) | composer.changed(j) | composer.changedInstance(coroutineScope) | composer.changedInstance(repository) | composer.changedInstance(context) | composer.changedInstance(list2);
                    Object rememberedValue = composer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit invoke$lambda$14$lambda$8$lambda$7;
                                invoke$lambda$14$lambda$8$lambda$7 = HealthScreenKt$HealthScreen$3.invoke$lambda$14$lambda$8$lambda$7(list, list2, j, coroutineScope, repository, context, state, (LazyListScope) obj);
                                return invoke$lambda$14$lambda$8$lambda$7;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    LazyDslKt.LazyColumn(null, null, m674PaddingValues0680j_4, false, m561spacedBy0680j_4, null, null, false, (Function1) rememberedValue, composer, 24960, 235);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1189427913);
                HealthScreen$lambda$3 = HealthScreenKt.HealthScreen$lambda$3(state2);
                if (HealthScreen$lambda$3.isEmpty()) {
                    composer.startReplaceGroup(-1189435601);
                    CommonKt.EmptyState(VaccinesKt.getVaccines(Icons.Filled.INSTANCE), "No weight entries", "Record weight to watch growth.", composer, 432);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1189260172);
                    PaddingValues m674PaddingValues0680j_42 = PaddingKt.m674PaddingValues0680j_4(Dp.m6299constructorimpl(16));
                    Arrangement.HorizontalOrVertical m561spacedBy0680j_42 = Arrangement.INSTANCE.m561spacedBy0680j_4(Dp.m6299constructorimpl(8));
                    composer.startReplaceGroup(1485664441);
                    boolean changed = composer.changed(state2) | composer.changed(state);
                    Object rememberedValue2 = composer.rememberedValue();
                    if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit invoke$lambda$14$lambda$13$lambda$12;
                                invoke$lambda$14$lambda$13$lambda$12 = HealthScreenKt$HealthScreen$3.invoke$lambda$14$lambda$13$lambda$12(State.this, state, (LazyListScope) obj);
                                return invoke$lambda$14$lambda$13$lambda$12;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    composer.endReplaceGroup();
                    LazyDslKt.LazyColumn(null, null, m674PaddingValues0680j_42, false, m561spacedBy0680j_42, null, null, false, (Function1) rememberedValue2, composer, 24960, 235);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$8$lambda$7(final List list, final List list2, final long j, final CoroutineScope coroutineScope, final Repository repository, final Context context, final State state, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        if (!list.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-346802752, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$1$2$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-346802752, i, -1, "com.chicken.road.cerman.fixs.ui.screens.HealthScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HealthScreen.kt:105)");
                    }
                    CommonKt.SectionHeader("Upcoming (" + list.size() + ")", composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
            final Function1 function1 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Object invoke$lambda$14$lambda$8$lambda$7$lambda$0;
                    invoke$lambda$14$lambda$8$lambda$7$lambda$0 = HealthScreenKt$HealthScreen$3.invoke$lambda$14$lambda$8$lambda$7$lambda$0((Vaccination) obj);
                    return invoke$lambda$14$lambda$8$lambda$7$lambda$0;
                }
            };
            final HealthScreenKt$HealthScreen$3$invoke$lambda$14$lambda$8$lambda$7$$inlined$items$default$1 healthScreenKt$HealthScreen$3$invoke$lambda$14$lambda$8$lambda$7$$inlined$items$default$1 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$invoke$lambda$14$lambda$8$lambda$7$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(Vaccination vaccination) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((Vaccination) obj);
                }
            };
            LazyColumn.items(list.size(), new Function1<Integer, Object>() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$invoke$lambda$14$lambda$8$lambda$7$$inlined$items$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return Function1.this.invoke(list.get(i));
                }
            }, new Function1<Integer, Object>() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$invoke$lambda$14$lambda$8$lambda$7$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return Function1.this.invoke(list.get(i));
                }
            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$invoke$lambda$14$lambda$8$lambda$7$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                    int i3;
                    List HealthScreen$lambda$1;
                    Object obj;
                    String str;
                    ComposerKt.sourceInformation(composer, "C152@7074L22:LazyDsl.kt#428nma");
                    if ((i2 & 6) == 0) {
                        i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if ((i3 & 147) == 146 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                    }
                    final Vaccination vaccination = (Vaccination) list.get(i);
                    composer.startReplaceGroup(1287399706);
                    HealthScreen$lambda$1 = HealthScreenKt.HealthScreen$lambda$1(state);
                    Iterator it = HealthScreen$lambda$1.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        long id = ((Chicken) obj).getId();
                        Long chickenId = vaccination.getChickenId();
                        if (chickenId != null && id == chickenId.longValue()) {
                            break;
                        }
                    }
                    Chicken chicken = (Chicken) obj;
                    if (chicken == null || (str = chicken.getName()) == null) {
                        str = "Whole flock";
                    }
                    String str2 = str;
                    long j2 = j;
                    composer.startReplaceGroup(-1759578238);
                    boolean changedInstance = composer.changedInstance(coroutineScope) | composer.changedInstance(repository) | composer.changed(vaccination) | composer.changedInstance(context);
                    Object rememberedValue = composer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        final Repository repository2 = repository;
                        final Context context2 = context;
                        rememberedValue = (Function0) new Function0<Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$1$2$1$3$2$1

                            /* compiled from: HealthScreen.kt */
                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$1$2$1$3$2$1$1", f = "HealthScreen.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
                            /* renamed from: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$1$2$1$3$2$1$1, reason: invalid class name */
                            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ Context $ctx;
                                final /* synthetic */ Repository $repo;
                                final /* synthetic */ Vaccination $v;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(Repository repository, Vaccination vaccination, Context context, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$repo = repository;
                                    this.$v = vaccination;
                                    this.$ctx = context;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$repo, this.$v, this.$ctx, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Vaccination copy;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        Repository repository = this.$repo;
                                        copy = r4.copy((r20 & 1) != 0 ? r4.id : 0L, (r20 & 2) != 0 ? r4.chickenId : null, (r20 & 4) != 0 ? r4.date : System.currentTimeMillis(), (r20 & 8) != 0 ? r4.name : null, (r20 & 16) != 0 ? r4.notes : null, (r20 & 32) != 0 ? r4.dueDate : null, (r20 & 64) != 0 ? this.$v.done : true);
                                        this.label = 1;
                                        if (repository.updateVaccination(copy, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    VaccineReminders.INSTANCE.cancel(this.$ctx, this.$v.getId());
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(repository2, vaccination, context2, null), 3, null);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    HealthScreenKt.UpcomingCard(vaccination, str2, j2, (Function0) rememberedValue, composer, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$HealthScreenKt.INSTANCE.m6735getLambda4$app_release(), 3, null);
        }
        if (!list2.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1591449033, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$1$2$1$4
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1591449033, i, -1, "com.chicken.road.cerman.fixs.ui.screens.HealthScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HealthScreen.kt:122)");
                    }
                    CommonKt.SectionHeader("History (" + list2.size() + ")", composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
            final Function1 function12 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Object invoke$lambda$14$lambda$8$lambda$7$lambda$4;
                    invoke$lambda$14$lambda$8$lambda$7$lambda$4 = HealthScreenKt$HealthScreen$3.invoke$lambda$14$lambda$8$lambda$7$lambda$4((Vaccination) obj);
                    return invoke$lambda$14$lambda$8$lambda$7$lambda$4;
                }
            };
            final HealthScreenKt$HealthScreen$3$invoke$lambda$14$lambda$8$lambda$7$$inlined$items$default$5 healthScreenKt$HealthScreen$3$invoke$lambda$14$lambda$8$lambda$7$$inlined$items$default$5 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$invoke$lambda$14$lambda$8$lambda$7$$inlined$items$default$5
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(Vaccination vaccination) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((Vaccination) obj);
                }
            };
            LazyColumn.items(list2.size(), new Function1<Integer, Object>() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$invoke$lambda$14$lambda$8$lambda$7$$inlined$items$default$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return Function1.this.invoke(list2.get(i));
                }
            }, new Function1<Integer, Object>() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$invoke$lambda$14$lambda$8$lambda$7$$inlined$items$default$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return Function1.this.invoke(list2.get(i));
                }
            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$invoke$lambda$14$lambda$8$lambda$7$$inlined$items$default$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                    int i3;
                    List HealthScreen$lambda$1;
                    Object obj;
                    String str;
                    ComposerKt.sourceInformation(composer, "C152@7074L22:LazyDsl.kt#428nma");
                    if ((i2 & 6) == 0) {
                        i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if ((i3 & 147) == 146 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                    }
                    final Vaccination vaccination = (Vaccination) list2.get(i);
                    composer.startReplaceGroup(1288400386);
                    HealthScreen$lambda$1 = HealthScreenKt.HealthScreen$lambda$1(state);
                    Iterator it = HealthScreen$lambda$1.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        long id = ((Chicken) obj).getId();
                        Long chickenId = vaccination.getChickenId();
                        if (chickenId != null && id == chickenId.longValue()) {
                            break;
                        }
                    }
                    Chicken chicken = (Chicken) obj;
                    if (chicken == null || (str = chicken.getName()) == null) {
                        str = "Whole flock";
                    }
                    final String str2 = str;
                    CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m964RoundedCornerShape0680j_4(Dp.m6299constructorimpl(16)), CardDefaults.INSTANCE.m1508cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1378206520, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$1$2$1$6$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                            invoke(columnScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(ColumnScope Card, Composer composer2, int i4) {
                            Intrinsics.checkNotNullParameter(Card, "$this$Card");
                            if ((i4 & 17) != 16 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1378206520, i4, -1, "com.chicken.road.cerman.fixs.ui.screens.HealthScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HealthScreen.kt:130)");
                                }
                                Modifier m681padding3ABfNKs = PaddingKt.m681padding3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(14));
                                Vaccination vaccination2 = Vaccination.this;
                                String str3 = str2;
                                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m681padding3ABfNKs);
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
                                Updater.m3340setimpl(m3333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                TextKt.m2373Text4IGK_g(vaccination2.getName(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleMedium(), composer2, 0, 0, 65534);
                                TextKt.m2373Text4IGK_g(str3 + " · " + Fmt.INSTANCE.date(vaccination2.getDate()), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                                composer2.startReplaceGroup(2022597129);
                                if (!StringsKt.isBlank(vaccination2.getNotes())) {
                                    SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(4)), composer2, 6);
                                    TextKt.m2373Text4IGK_g(vaccination2.getNotes(), (Modifier) null, 0L, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131062);
                                }
                                composer2.endReplaceGroup();
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
                    }, composer, 54), composer, 196614, 24);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$HealthScreenKt.INSTANCE.m6736getLambda5$app_release(), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invoke$lambda$14$lambda$8$lambda$7$lambda$0(Vaccination it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "u-" + it.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invoke$lambda$14$lambda$8$lambda$7$lambda$4(Vaccination it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "h-" + it.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$13$lambda$12(State state, final State state2, LazyListScope LazyColumn) {
        final List HealthScreen$lambda$3;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        HealthScreen$lambda$3 = HealthScreenKt.HealthScreen$lambda$3(state);
        final Function1 function1 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object invoke$lambda$14$lambda$13$lambda$12$lambda$9;
                invoke$lambda$14$lambda$13$lambda$12$lambda$9 = HealthScreenKt$HealthScreen$3.invoke$lambda$14$lambda$13$lambda$12$lambda$9((WeightEntry) obj);
                return invoke$lambda$14$lambda$13$lambda$12$lambda$9;
            }
        };
        final HealthScreenKt$HealthScreen$3$invoke$lambda$14$lambda$13$lambda$12$$inlined$items$default$1 healthScreenKt$HealthScreen$3$invoke$lambda$14$lambda$13$lambda$12$$inlined$items$default$1 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$invoke$lambda$14$lambda$13$lambda$12$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(WeightEntry weightEntry) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((WeightEntry) obj);
            }
        };
        LazyColumn.items(HealthScreen$lambda$3.size(), new Function1<Integer, Object>() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$invoke$lambda$14$lambda$13$lambda$12$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(HealthScreen$lambda$3.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$invoke$lambda$14$lambda$13$lambda$12$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(HealthScreen$lambda$3.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$invoke$lambda$14$lambda$13$lambda$12$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                List HealthScreen$lambda$1;
                Object obj;
                String str;
                ComposerKt.sourceInformation(composer, "C152@7074L22:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if ((i3 & 147) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                final WeightEntry weightEntry = (WeightEntry) HealthScreen$lambda$3.get(i);
                composer.startReplaceGroup(1290133658);
                HealthScreen$lambda$1 = HealthScreenKt.HealthScreen$lambda$1(state2);
                Iterator it = HealthScreen$lambda$1.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((Chicken) obj).getId() == weightEntry.getChickenId()) {
                            break;
                        }
                    }
                }
                Chicken chicken = (Chicken) obj;
                if (chicken == null || (str = chicken.getName()) == null) {
                    str = "Unknown";
                }
                final String str2 = str;
                CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m964RoundedCornerShape0680j_4(Dp.m6299constructorimpl(16)), CardDefaults.INSTANCE.m1508cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(1170829140, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$1$3$1$2$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope Card, Composer composer2, int i4) {
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        if ((i4 & 17) != 16 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1170829140, i4, -1, "com.chicken.road.cerman.fixs.ui.screens.HealthScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HealthScreen.kt:159)");
                            }
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m681padding3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(14)), 0.0f, 1, null);
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            WeightEntry weightEntry2 = WeightEntry.this;
                            String str3 = str2;
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
                            TextKt.m2373Text4IGK_g(str3, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleMedium(), composer2, 0, 0, 65534);
                            TextKt.m2373Text4IGK_g(Fmt.INSTANCE.date(weightEntry2.getDate()), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            TextKt.m2373Text4IGK_g(weightEntry2.getWeightGrams() + " g", (Modifier) null, ThemeKt.getAmberDeep(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 131034);
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
                }, composer, 54), composer, 196614, 24);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$HealthScreenKt.INSTANCE.m6737getLambda6$app_release(), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invoke$lambda$14$lambda$13$lambda$12$lambda$9(WeightEntry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Long.valueOf(it.getId());
    }
}
