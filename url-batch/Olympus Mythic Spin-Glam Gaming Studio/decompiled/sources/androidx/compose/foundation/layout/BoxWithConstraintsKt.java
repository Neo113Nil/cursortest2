package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BoxWithConstraints.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Alignment;", "contentAlignment", "", "propagateMinConstraints", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "content", "BoxWithConstraints", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BoxWithConstraintsKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BoxWithConstraints(Modifier modifier, Alignment alignment, boolean z, final Function3 content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        final int i3;
        Alignment alignment2;
        int i4;
        boolean z2;
        final Modifier modifier3;
        final Alignment topStart;
        boolean changed;
        Object rememberedValue;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1781813501);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            alignment2 = alignment;
            i3 |= startRestartGroup.changed(alignment) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z) ? 256 : 128;
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    i3 |= startRestartGroup.changed(content) ? 2048 : 1024;
                }
                if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                    modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    topStart = i6 != 0 ? Alignment.INSTANCE.getTopStart() : alignment2;
                    if (i4 != 0) {
                        z2 = false;
                    }
                    final MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topStart, z2, startRestartGroup, (i3 >> 3) & 126);
                    startRestartGroup.startReplaceableGroup(511388516);
                    changed = startRestartGroup.changed(content) | startRestartGroup.changed(rememberBoxMeasurePolicy);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function2() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                return m317invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).getValue());
                            }

                            @NotNull
                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m317invoke0kLqBqw(@NotNull SubcomposeMeasureScope SubcomposeLayout, long j) {
                                Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                final BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = new BoxWithConstraintsScopeImpl(SubcomposeLayout, j, null);
                                Unit unit = Unit.INSTANCE;
                                final Function3 function3 = content;
                                final int i7 = i3;
                                return MeasurePolicy.this.mo37measure3p2s80s(SubcomposeLayout, SubcomposeLayout.subcompose(unit, ComposableLambdaKt.composableLambdaInstance(-1945019079, true, new Function2() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @Composable
                                    public final void invoke(@Nullable Composer composer2, int i8) {
                                        if ((i8 & 11) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                        } else {
                                            Function3.this.invoke(boxWithConstraintsScopeImpl, composer2, Integer.valueOf((i7 >> 6) & 112));
                                        }
                                    }
                                })), j);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    SubcomposeLayoutKt.SubcomposeLayout(modifier3, (Function2) rememberedValue, startRestartGroup, i3 & 14, 0);
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    topStart = alignment2;
                }
                final boolean z3 = z2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i7) {
                        BoxWithConstraintsKt.BoxWithConstraints(Modifier.this, topStart, z3, content, composer2, i | 1, i2);
                    }
                });
                return;
            }
            z2 = z;
            if ((i2 & 8) != 0) {
            }
            if ((i3 & 5851) == 1170) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            final MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(topStart, z2, startRestartGroup, (i3 >> 3) & 126);
            startRestartGroup.startReplaceableGroup(511388516);
            changed = startRestartGroup.changed(content) | startRestartGroup.changed(rememberBoxMeasurePolicy2);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new Function2() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m317invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).getValue());
                }

                @NotNull
                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final MeasureResult m317invoke0kLqBqw(@NotNull SubcomposeMeasureScope SubcomposeLayout, long j) {
                    Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                    final BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = new BoxWithConstraintsScopeImpl(SubcomposeLayout, j, null);
                    Unit unit = Unit.INSTANCE;
                    final Function3 function3 = content;
                    final int i7 = i3;
                    return MeasurePolicy.this.mo37measure3p2s80s(SubcomposeLayout, SubcomposeLayout.subcompose(unit, ComposableLambdaKt.composableLambdaInstance(-1945019079, true, new Function2() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i8) {
                            if ((i8 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                Function3.this.invoke(boxWithConstraintsScopeImpl, composer2, Integer.valueOf((i7 >> 6) & 112));
                            }
                        }
                    })), j);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(modifier3, (Function2) rememberedValue, startRestartGroup, i3 & 14, 0);
            final boolean z32 = z2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        alignment2 = alignment;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i2 & 8) != 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        final MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(topStart, z2, startRestartGroup, (i3 >> 3) & 126);
        startRestartGroup.startReplaceableGroup(511388516);
        changed = startRestartGroup.changed(content) | startRestartGroup.changed(rememberBoxMeasurePolicy22);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new Function2() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m317invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).getValue());
            }

            @NotNull
            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
            public final MeasureResult m317invoke0kLqBqw(@NotNull SubcomposeMeasureScope SubcomposeLayout, long j) {
                Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                final BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = new BoxWithConstraintsScopeImpl(SubcomposeLayout, j, null);
                Unit unit = Unit.INSTANCE;
                final Function3 function3 = content;
                final int i7 = i3;
                return MeasurePolicy.this.mo37measure3p2s80s(SubcomposeLayout, SubcomposeLayout.subcompose(unit, ComposableLambdaKt.composableLambdaInstance(-1945019079, true, new Function2() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i8) {
                        if ((i8 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            Function3.this.invoke(boxWithConstraintsScopeImpl, composer2, Integer.valueOf((i7 >> 6) & 112));
                        }
                    }
                })), j);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        SubcomposeLayoutKt.SubcomposeLayout(modifier3, (Function2) rememberedValue, startRestartGroup, i3 & 14, 0);
        final boolean z322 = z2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
