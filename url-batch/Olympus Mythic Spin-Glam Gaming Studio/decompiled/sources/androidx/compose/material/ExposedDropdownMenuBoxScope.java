package androidx.compose.material;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.material.ExposedDropdownMenuBoxScope;
import androidx.compose.material.internal.ExposedDropdownMenuPopupKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExposedDropdownMenu.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006JH\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0002\b\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "", "Landroidx/compose/ui/Modifier;", "", "matchTextFieldWidth", "exposedDropdownSize", "(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;", "expanded", "Lkotlin/Function0;", "", "onDismissRequest", "modifier", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "content", "ExposedDropdownMenu", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalMaterialApi
/* loaded from: classes15.dex */
public interface ExposedDropdownMenuBoxScope {
    void ExposedDropdownMenu(boolean z, Function0 function0, Modifier modifier, Function3 function3, Composer composer, int i, int i2);

    Modifier exposedDropdownSize(Modifier modifier, boolean z);

    /* compiled from: ExposedDropdownMenu.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Modifier exposedDropdownSize$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0193  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x006f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void ExposedDropdownMenu(final ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, final boolean z, final Function0 onDismissRequest, Modifier modifier, final Function3 content, Composer composer, final int i, final int i2) {
            int i3;
            Modifier modifier2;
            Modifier modifier3;
            Object rememberedValue;
            Composer.Companion companion;
            final MutableTransitionState mutableTransitionState;
            Object rememberedValue2;
            boolean changed;
            Object rememberedValue3;
            Composer composer2;
            final Modifier modifier4;
            ScopeUpdateScope endRestartGroup;
            Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
            Intrinsics.checkNotNullParameter(content, "content");
            Composer startRestartGroup = composer.startRestartGroup(-1165636223);
            if ((i2 & 1) != 0) {
                i3 = i | 6;
            } else if ((i & 14) == 0) {
                i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            if ((i2 & 2) != 0) {
                i3 |= 48;
            } else if ((i & 112) == 0) {
                i3 |= startRestartGroup.changed(onDismissRequest) ? 32 : 16;
            }
            int i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                if ((i2 & 8) == 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    i3 |= startRestartGroup.changed(content) ? 2048 : 1024;
                }
                if ((i2 & 16) == 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    i3 |= startRestartGroup.changed(exposedDropdownMenuBoxScope) ? 16384 : 8192;
                }
                if ((46811 & i3) == 9362 || !startRestartGroup.getSkipping()) {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue = startRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (rememberedValue == companion.getEmpty()) {
                        rememberedValue = new MutableTransitionState(Boolean.FALSE);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    mutableTransitionState = (MutableTransitionState) rememberedValue;
                    mutableTransitionState.setTargetState(Boolean.valueOf(z));
                    if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
                        startRestartGroup.startReplaceableGroup(-492369756);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == companion.getEmpty()) {
                            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1618boximpl(TransformOrigin.INSTANCE.m1627getCenterSzJe1aQ()), null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceableGroup();
                        final MutableState mutableState = (MutableState) rememberedValue2;
                        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        long m2528getZeroRKDOV3M = DpOffset.INSTANCE.m2528getZeroRKDOV3M();
                        startRestartGroup.startReplaceableGroup(1157296644);
                        changed = startRestartGroup.changed(mutableState);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue3 == companion.getEmpty()) {
                            rememberedValue3 = new Function2() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((IntRect) obj, (IntRect) obj2);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m1618boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        startRestartGroup.endReplaceableGroup();
                        final Modifier modifier5 = modifier3;
                        final int i5 = i3;
                        composer2 = startRestartGroup;
                        ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(onDismissRequest, new DropdownMenuPositionProvider(m2528getZeroRKDOV3M, density, (Function2) rememberedValue3, null), ComposableLambdaKt.composableLambda(startRestartGroup, -406650841, true, new Function2() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i6) {
                                if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                                    MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, ExposedDropdownMenuBoxScope.DefaultImpls.exposedDropdownSize$default(exposedDropdownMenuBoxScope, modifier5, false, 1, null), content, composer3, MutableTransitionState.$stable | 48 | (i5 & 7168), 0);
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                            }
                        }), startRestartGroup, ((i3 >> 3) & 14) | 384, 0);
                    } else {
                        composer2 = startRestartGroup;
                    }
                    modifier4 = modifier3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    composer2 = startRestartGroup;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i6) {
                        ExposedDropdownMenuBoxScope.this.ExposedDropdownMenu(z, onDismissRequest, modifier4, content, composer3, i | 1, i2);
                    }
                });
                return;
            }
            modifier2 = modifier;
            if ((i2 & 8) == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((46811 & i3) == 9362) {
            }
            if (i4 == 0) {
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue = startRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (rememberedValue == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            mutableTransitionState = (MutableTransitionState) rememberedValue;
            mutableTransitionState.setTargetState(Boolean.valueOf(z));
            if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState<TransformOrigin> mutableState2 = (MutableState) rememberedValue2;
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            long m2528getZeroRKDOV3M2 = DpOffset.INSTANCE.m2528getZeroRKDOV3M();
            startRestartGroup.startReplaceableGroup(1157296644);
            changed = startRestartGroup.changed(mutableState2);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = new Function2() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((IntRect) obj, (IntRect) obj2);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                    mutableState2.setValue(TransformOrigin.m1618boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            final Modifier modifier52 = modifier3;
            final int i52 = i3;
            composer2 = startRestartGroup;
            ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(onDismissRequest, new DropdownMenuPositionProvider(m2528getZeroRKDOV3M2, density2, (Function2) rememberedValue3, null), ComposableLambdaKt.composableLambda(startRestartGroup, -406650841, true, new Function2() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget
                @Composable
                public final void invoke(@Nullable Composer composer3, int i6) {
                    if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                        MenuKt.DropdownMenuContent(mutableTransitionState, mutableState2, ExposedDropdownMenuBoxScope.DefaultImpls.exposedDropdownSize$default(exposedDropdownMenuBoxScope, modifier52, false, 1, null), content, composer3, MutableTransitionState.$stable | 48 | (i52 & 7168), 0);
                    } else {
                        composer3.skipToGroupEnd();
                    }
                }
            }), startRestartGroup, ((i3 >> 3) & 14) | 384, 0);
            modifier4 = modifier3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
    }
}
