package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyLayout.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aJ\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measurePolicy", "", "LazyLayout", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LazyLayoutKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyLayout(final LazyLayoutItemProvider itemProvider, Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState, final Function2 measurePolicy, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        LazyLayoutPrefetchState lazyLayoutPrefetchState2;
        LazyLayoutPrefetchState lazyLayoutPrefetchState3;
        Object rememberedValue;
        Composer.Companion companion;
        final LazyLayoutItemContentFactory lazyLayoutItemContentFactory;
        Object rememberedValue2;
        boolean changed;
        Object rememberedValue3;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        Composer startRestartGroup = composer.startRestartGroup(852831187);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(itemProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
                i3 |= startRestartGroup.changed(lazyLayoutPrefetchState) ? 256 : 128;
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    i3 |= startRestartGroup.changed(measurePolicy) ? 2048 : 1024;
                }
                if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    lazyLayoutPrefetchState3 = i4 != 0 ? null : lazyLayoutPrefetchState2;
                    final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(itemProvider, startRestartGroup, i3 & 14);
                    SaveableStateHolder rememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue = startRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (rememberedValue == companion.getEmpty()) {
                        rememberedValue = new LazyLayoutItemContentFactory(rememberSaveableStateHolder, new Function0() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$itemContentFactory$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            /* renamed from: invoke */
                            public final LazyLayoutItemProvider mo4828invoke() {
                                return (LazyLayoutItemProvider) rememberUpdatedState.getValue();
                            }
                        });
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) rememberedValue;
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == companion.getEmpty()) {
                        rememberedValue2 = new SubcomposeLayoutState(new LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory));
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceableGroup();
                    SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) rememberedValue2;
                    startRestartGroup.startReplaceableGroup(617316839);
                    if (lazyLayoutPrefetchState3 != null) {
                        LazyLayoutPrefetcher_androidKt.LazyLayoutPrefetcher(lazyLayoutPrefetchState3, lazyLayoutItemContentFactory, subcomposeLayoutState, startRestartGroup, ((i3 >> 6) & 14) | 64 | (SubcomposeLayoutState.$stable << 6));
                        Unit unit = Unit.INSTANCE;
                    }
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.startReplaceableGroup(511388516);
                    changed = startRestartGroup.changed(lazyLayoutItemContentFactory) | startRestartGroup.changed(measurePolicy);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue3 == companion.getEmpty()) {
                        rememberedValue3 = new Function2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                return m493invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).getValue());
                            }

                            @NotNull
                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m493invoke0kLqBqw(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                                Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "$this$null");
                                LazyLayoutItemContentFactory.this.m492onBeforeMeasure0kLqBqw(subcomposeMeasureScope, j);
                                return (MeasureResult) measurePolicy.invoke(new LazyLayoutMeasureScopeImpl(LazyLayoutItemContentFactory.this, subcomposeMeasureScope), Constraints.m2475boximpl(j));
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    startRestartGroup.endReplaceableGroup();
                    SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, modifier4, (Function2) rememberedValue3, startRestartGroup, SubcomposeLayoutState.$stable | (i3 & 112), 0);
                    lazyLayoutPrefetchState2 = lazyLayoutPrefetchState3;
                    modifier3 = modifier4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                final LazyLayoutPrefetchState lazyLayoutPrefetchState4 = lazyLayoutPrefetchState2;
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i6) {
                        LazyLayoutKt.LazyLayout(LazyLayoutItemProvider.this, modifier3, lazyLayoutPrefetchState4, measurePolicy, composer2, i | 1, i2);
                    }
                });
                return;
            }
            lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
            if ((i2 & 8) != 0) {
            }
            if ((i3 & 5851) == 1170) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            final State<? extends LazyLayoutItemProvider> rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(itemProvider, startRestartGroup, i3 & 14);
            SaveableStateHolder rememberSaveableStateHolder2 = SaveableStateHolderKt.rememberSaveableStateHolder(startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue = startRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (rememberedValue == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) rememberedValue;
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutState subcomposeLayoutState2 = (SubcomposeLayoutState) rememberedValue2;
            startRestartGroup.startReplaceableGroup(617316839);
            if (lazyLayoutPrefetchState3 != null) {
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(511388516);
            changed = startRestartGroup.changed(lazyLayoutItemContentFactory) | startRestartGroup.changed(measurePolicy);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = new Function2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m493invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).getValue());
                }

                @NotNull
                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final MeasureResult m493invoke0kLqBqw(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                    Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "$this$null");
                    LazyLayoutItemContentFactory.this.m492onBeforeMeasure0kLqBqw(subcomposeMeasureScope, j);
                    return (MeasureResult) measurePolicy.invoke(new LazyLayoutMeasureScopeImpl(LazyLayoutItemContentFactory.this, subcomposeMeasureScope), Constraints.m2475boximpl(j));
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState2, modifier4, (Function2) rememberedValue3, startRestartGroup, SubcomposeLayoutState.$stable | (i3 & 112), 0);
            lazyLayoutPrefetchState2 = lazyLayoutPrefetchState3;
            modifier3 = modifier4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
        if ((i2 & 8) != 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        final State<? extends LazyLayoutItemProvider> rememberUpdatedState22 = SnapshotStateKt.rememberUpdatedState(itemProvider, startRestartGroup, i3 & 14);
        SaveableStateHolder rememberSaveableStateHolder22 = SaveableStateHolderKt.rememberSaveableStateHolder(startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue = startRestartGroup.rememberedValue();
        companion = Composer.INSTANCE;
        if (rememberedValue == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        SubcomposeLayoutState subcomposeLayoutState22 = (SubcomposeLayoutState) rememberedValue2;
        startRestartGroup.startReplaceableGroup(617316839);
        if (lazyLayoutPrefetchState3 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(511388516);
        changed = startRestartGroup.changed(lazyLayoutItemContentFactory) | startRestartGroup.changed(measurePolicy);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = new Function2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m493invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).getValue());
            }

            @NotNull
            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
            public final MeasureResult m493invoke0kLqBqw(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "$this$null");
                LazyLayoutItemContentFactory.this.m492onBeforeMeasure0kLqBqw(subcomposeMeasureScope, j);
                return (MeasureResult) measurePolicy.invoke(new LazyLayoutMeasureScopeImpl(LazyLayoutItemContentFactory.this, subcomposeMeasureScope), Constraints.m2475boximpl(j));
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState22, modifier4, (Function2) rememberedValue3, startRestartGroup, SubcomposeLayoutState.$stable | (i3 & 112), 0);
        lazyLayoutPrefetchState2 = lazyLayoutPrefetchState3;
        modifier3 = modifier4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
