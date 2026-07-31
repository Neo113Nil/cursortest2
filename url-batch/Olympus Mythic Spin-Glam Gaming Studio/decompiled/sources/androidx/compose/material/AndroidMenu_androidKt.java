package androidx.compose.material;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidMenu.android.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ab\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a^\u0010\u0019\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"", "expanded", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/DpOffset;", "offset", "Landroidx/compose/ui/window/PopupProperties;", "properties", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "content", "DropdownMenu-ILWXrKs", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenu", "onClick", "enabled", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/RowScope;", "DropdownMenuItem", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AndroidMenu_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0071  */
    /* renamed from: DropdownMenu-ILWXrKs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m710DropdownMenuILWXrKs(final boolean z, final Function0 onDismissRequest, Modifier modifier, long j, PopupProperties popupProperties, final Function3 content, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        long j2;
        PopupProperties popupProperties2;
        long j3;
        int i5;
        long j4;
        PopupProperties popupProperties3;
        Modifier modifier3;
        Object rememberedValue;
        Composer.Companion companion;
        final MutableTransitionState mutableTransitionState;
        Object rememberedValue2;
        boolean changed;
        Object rememberedValue3;
        final long j5;
        final PopupProperties popupProperties4;
        ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-840283139);
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
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                j2 = j;
                i3 |= startRestartGroup.changed(j2) ? 2048 : 1024;
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        popupProperties2 = popupProperties;
                        if (startRestartGroup.changed(popupProperties2)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        popupProperties2 = popupProperties;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    popupProperties2 = popupProperties;
                }
                if ((i2 & 32) == 0) {
                    i6 = (458752 & i) == 0 ? startRestartGroup.changed(content) ? 131072 : 65536 : 196608;
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 == 0) {
                                float f = 0;
                                j3 = DpKt.m2516DpOffsetYgX7TsA(Dp.m2507constructorimpl(f), Dp.m2507constructorimpl(f));
                            } else {
                                j3 = j2;
                            }
                            if ((i2 & 16) == 0) {
                                i5 = i3 & (-57345);
                                modifier3 = modifier4;
                                j4 = j3;
                                popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            } else {
                                i5 = i3;
                                j4 = j3;
                                popupProperties3 = popupProperties2;
                                modifier3 = modifier4;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            j4 = j2;
                            popupProperties3 = popupProperties2;
                            i5 = i3;
                            modifier3 = modifier2;
                        }
                        startRestartGroup.endDefaults();
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
                            startRestartGroup.startReplaceableGroup(1157296644);
                            changed = startRestartGroup.changed(mutableState);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue3 == companion.getEmpty()) {
                                rememberedValue3 = new Function2() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
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
                            final int i9 = i5;
                            AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j4, density, (Function2) rememberedValue3, null), onDismissRequest, popupProperties3, ComposableLambdaKt.composableLambda(startRestartGroup, 79632374, true, new Function2() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                                public final void invoke(@Nullable Composer composer2, int i10) {
                                    if ((i10 & 11) != 2 || !composer2.getSkipping()) {
                                        MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                        MutableState<TransformOrigin> mutableState2 = mutableState;
                                        Modifier modifier6 = modifier5;
                                        Function3 function3 = content;
                                        int i11 = MutableTransitionState.$stable | 48;
                                        int i12 = i9;
                                        MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier6, function3, composer2, i11 | (i12 & 896) | ((i12 >> 6) & 7168), 0);
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), startRestartGroup, (i5 & 112) | 3072 | ((i5 >> 6) & 896), 0);
                        }
                        modifier2 = modifier3;
                        j5 = j4;
                        popupProperties4 = popupProperties3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        j5 = j2;
                        popupProperties4 = popupProperties2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i10) {
                            AndroidMenu_androidKt.m710DropdownMenuILWXrKs(z, onDismissRequest, modifier2, j5, popupProperties4, content, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                i3 |= i6;
                if ((374491 & i3) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                startRestartGroup.endDefaults();
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue = startRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (rememberedValue == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                mutableTransitionState = (MutableTransitionState) rememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z));
                if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                }
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final MutableState<TransformOrigin> mutableState2 = (MutableState) rememberedValue2;
                Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                startRestartGroup.startReplaceableGroup(1157296644);
                changed = startRestartGroup.changed(mutableState2);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue3 = new Function2() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
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
                final int i92 = i5;
                AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j4, density2, (Function2) rememberedValue3, null), onDismissRequest, popupProperties3, ComposableLambdaKt.composableLambda(startRestartGroup, 79632374, true, new Function2() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                    public final void invoke(@Nullable Composer composer2, int i10) {
                        if ((i10 & 11) != 2 || !composer2.getSkipping()) {
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState22 = mutableState2;
                            Modifier modifier6 = modifier52;
                            Function3 function3 = content;
                            int i11 = MutableTransitionState.$stable | 48;
                            int i12 = i92;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState22, modifier6, function3, composer2, i11 | (i12 & 896) | ((i12 >> 6) & 7168), 0);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, (i5 & 112) | 3072 | ((i5 >> 6) & 896), 0);
                modifier2 = modifier3;
                j5 = j4;
                popupProperties4 = popupProperties3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            j2 = j;
            if ((57344 & i) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            i3 |= i6;
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue = startRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (rememberedValue == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            mutableTransitionState = (MutableTransitionState) rememberedValue;
            mutableTransitionState.setTargetState(Boolean.valueOf(z));
            if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState<TransformOrigin> mutableState22 = (MutableState) rememberedValue2;
            Density density22 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            startRestartGroup.startReplaceableGroup(1157296644);
            changed = startRestartGroup.changed(mutableState22);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = new Function2() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
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
                    mutableState22.setValue(TransformOrigin.m1618boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            final Modifier modifier522 = modifier3;
            final int i922 = i5;
            AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j4, density22, (Function2) rememberedValue3, null), onDismissRequest, popupProperties3, ComposableLambdaKt.composableLambda(startRestartGroup, 79632374, true, new Function2() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                public final void invoke(@Nullable Composer composer2, int i10) {
                    if ((i10 & 11) != 2 || !composer2.getSkipping()) {
                        MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                        MutableState<TransformOrigin> mutableState222 = mutableState22;
                        Modifier modifier6 = modifier522;
                        Function3 function3 = content;
                        int i11 = MutableTransitionState.$stable | 48;
                        int i12 = i922;
                        MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState222, modifier6, function3, composer2, i11 | (i12 & 896) | ((i12 >> 6) & 7168), 0);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, (i5 & 112) | 3072 | ((i5 >> 6) & 896), 0);
            modifier2 = modifier3;
            j5 = j4;
            popupProperties4 = popupProperties3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        j2 = j;
        if ((57344 & i) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i3 |= i6;
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue = startRestartGroup.rememberedValue();
        companion = Composer.INSTANCE;
        if (rememberedValue == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        mutableTransitionState = (MutableTransitionState) rememberedValue;
        mutableTransitionState.setTargetState(Boolean.valueOf(z));
        if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final MutableState<TransformOrigin> mutableState222 = (MutableState) rememberedValue2;
        Density density222 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        startRestartGroup.startReplaceableGroup(1157296644);
        changed = startRestartGroup.changed(mutableState222);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = new Function2() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
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
                mutableState222.setValue(TransformOrigin.m1618boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        final Modifier modifier5222 = modifier3;
        final int i9222 = i5;
        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j4, density222, (Function2) rememberedValue3, null), onDismissRequest, popupProperties3, ComposableLambdaKt.composableLambda(startRestartGroup, 79632374, true, new Function2() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
            public final void invoke(@Nullable Composer composer2, int i10) {
                if ((i10 & 11) != 2 || !composer2.getSkipping()) {
                    MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                    MutableState<TransformOrigin> mutableState2222 = mutableState222;
                    Modifier modifier6 = modifier5222;
                    Function3 function3 = content;
                    int i11 = MutableTransitionState.$stable | 48;
                    int i12 = i9222;
                    MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2222, modifier6, function3, composer2, i11 | (i12 & 896) | ((i12 >> 6) & 7168), 0);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, (i5 & 112) | 3072 | ((i5 >> 6) & 896), 0);
        modifier2 = modifier3;
        j5 = j4;
        popupProperties4 = popupProperties3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DropdownMenuItem(final Function0 onClick, Modifier modifier, boolean z, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3 content, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        PaddingValues paddingValues2;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        final boolean z3;
        final PaddingValues paddingValues3;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1988562892);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    paddingValues2 = paddingValues;
                    i3 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                        if ((i2 & 32) == 0) {
                            i7 = (458752 & i) == 0 ? startRestartGroup.changed(content) ? 131072 : 65536 : 196608;
                            if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                                Modifier modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                boolean z4 = i4 == 0 ? true : z2;
                                PaddingValues dropdownMenuItemContentPadding = i5 == 0 ? MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding() : paddingValues2;
                                if (i6 == 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                MenuKt.DropdownMenuItemContent(onClick, modifier3, z4, dropdownMenuItemContentPadding, mutableInteractionSource3, content, startRestartGroup, i3 & 524286, 0);
                                modifier2 = modifier3;
                                z3 = z4;
                                paddingValues3 = dropdownMenuItemContentPadding;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                z3 = z2;
                                paddingValues3 = paddingValues2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenuItem$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i9) {
                                    AndroidMenu_androidKt.DropdownMenuItem(Function0.this, modifier2, z3, paddingValues3, mutableInteractionSource4, content, composer2, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i3 |= i7;
                        if ((374491 & i3) == 74898) {
                        }
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z4, dropdownMenuItemContentPadding, mutableInteractionSource3, content, startRestartGroup, i3 & 524286, 0);
                        modifier2 = modifier3;
                        z3 = z4;
                        paddingValues3 = dropdownMenuItemContentPadding;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i2 & 32) == 0) {
                    }
                    i3 |= i7;
                    if ((374491 & i3) == 74898) {
                    }
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z4, dropdownMenuItemContentPadding, mutableInteractionSource3, content, startRestartGroup, i3 & 524286, 0);
                    modifier2 = modifier3;
                    z3 = z4;
                    paddingValues3 = dropdownMenuItemContentPadding;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                paddingValues2 = paddingValues;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 32) == 0) {
                }
                i3 |= i7;
                if ((374491 & i3) == 74898) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                MenuKt.DropdownMenuItemContent(onClick, modifier3, z4, dropdownMenuItemContentPadding, mutableInteractionSource3, content, startRestartGroup, i3 & 524286, 0);
                modifier2 = modifier3;
                z3 = z4;
                paddingValues3 = dropdownMenuItemContentPadding;
                mutableInteractionSource4 = mutableInteractionSource3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            paddingValues2 = paddingValues;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 32) == 0) {
            }
            i3 |= i7;
            if ((374491 & i3) == 74898) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            MenuKt.DropdownMenuItemContent(onClick, modifier3, z4, dropdownMenuItemContentPadding, mutableInteractionSource3, content, startRestartGroup, i3 & 524286, 0);
            modifier2 = modifier3;
            z3 = z4;
            paddingValues3 = dropdownMenuItemContentPadding;
            mutableInteractionSource4 = mutableInteractionSource3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        paddingValues2 = paddingValues;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 32) == 0) {
        }
        i3 |= i7;
        if ((374491 & i3) == 74898) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        MenuKt.DropdownMenuItemContent(onClick, modifier3, z4, dropdownMenuItemContentPadding, mutableInteractionSource3, content, startRestartGroup, i3 & 524286, 0);
        modifier2 = modifier3;
        z3 = z4;
        paddingValues3 = dropdownMenuItemContentPadding;
        mutableInteractionSource4 = mutableInteractionSource3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
