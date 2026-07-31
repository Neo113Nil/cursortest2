package androidx.compose.ui.window;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.NetError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidDialog.android.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0002\u0010\b\u001a*\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007H\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Dialog", "", "onDismissRequest", "Lkotlin/Function0;", "properties", "Landroidx/compose/ui/window/DialogProperties;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DialogLayout", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AndroidDialog_androidKt {
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if ((r24 & 2) != 0) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Dialog(final Function0 onDismissRequest, DialogProperties dialogProperties, final Function2 content, Composer composer, final int i, final int i2) {
        int i3;
        DialogProperties dialogProperties2;
        final LayoutDirection layoutDirection;
        final DialogProperties dialogProperties3;
        Composer composer2;
        Object obj;
        final DialogProperties dialogProperties4;
        Composer composer3;
        int i4;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-2032877254);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onDismissRequest) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                dialogProperties2 = dialogProperties;
                if (startRestartGroup.changed(dialogProperties2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                dialogProperties2 = dialogProperties;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            dialogProperties2 = dialogProperties;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(content) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
            } else {
                if ((i2 & 2) != 0) {
                    dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
                DialogProperties dialogProperties5 = dialogProperties2;
                startRestartGroup.endDefaults();
                View view = (View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
                final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, startRestartGroup, (i3 >> 6) & 14);
                UUID dialogId = (UUID) RememberSaveableKt.rememberSaveable(new Object[0], null, null, new Function0() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialogId$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public final UUID mo4828invoke() {
                        return UUID.randomUUID();
                    }
                }, startRestartGroup, 3080, 6);
                startRestartGroup.startReplaceableGroup(511388516);
                boolean changed = startRestartGroup.changed(view) | startRestartGroup.changed(density);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    Intrinsics.checkNotNullExpressionValue(dialogId, "dialogId");
                    layoutDirection = layoutDirection2;
                    dialogProperties3 = dialogProperties5;
                    Composer composer4 = startRestartGroup;
                    DialogWrapper dialogWrapper = new DialogWrapper(onDismissRequest, dialogProperties5, view, layoutDirection, density, dialogId);
                    dialogWrapper.setContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(488261145, true, new Function2() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke((Composer) obj2, ((Number) obj3).intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget
                        @Composable
                        public final void invoke(@Nullable Composer composer5, int i5) {
                            if ((i5 & 11) != 2 || !composer5.getSkipping()) {
                                Modifier semantics$default = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1.1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        invoke((SemanticsPropertyReceiver) obj2);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull SemanticsPropertyReceiver semantics) {
                                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                        SemanticsPropertiesKt.dialog(semantics);
                                    }
                                }, 1, null);
                                final State<Function2> state = rememberUpdatedState;
                                AndroidDialog_androidKt.DialogLayout(semantics$default, ComposableLambdaKt.composableLambda(composer5, -533674951, true, new Function2() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                        invoke((Composer) obj2, ((Number) obj3).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget
                                    @Composable
                                    public final void invoke(@Nullable Composer composer6, int i6) {
                                        Function2 m2618Dialog$lambda0;
                                        if ((i6 & 11) == 2 && composer6.getSkipping()) {
                                            composer6.skipToGroupEnd();
                                        } else {
                                            m2618Dialog$lambda0 = AndroidDialog_androidKt.m2618Dialog$lambda0(state);
                                            m2618Dialog$lambda0.invoke(composer6, 0);
                                        }
                                    }
                                }), composer5, 48, 0);
                                return;
                            }
                            composer5.skipToGroupEnd();
                        }
                    }));
                    composer4.updateRememberedValue(dialogWrapper);
                    obj = dialogWrapper;
                    composer2 = composer4;
                } else {
                    layoutDirection = layoutDirection2;
                    dialogProperties3 = dialogProperties5;
                    composer2 = startRestartGroup;
                    obj = rememberedValue;
                }
                composer2.endReplaceableGroup();
                final DialogWrapper dialogWrapper2 = (DialogWrapper) obj;
                EffectsKt.DisposableEffect(dialogWrapper2, new Function1() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        DialogWrapper.this.show();
                        final DialogWrapper dialogWrapper3 = DialogWrapper.this;
                        return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                DialogWrapper.this.dismiss();
                                DialogWrapper.this.disposeComposition();
                            }
                        };
                    }
                }, composer2, 8);
                EffectsKt.SideEffect(new Function0() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        m2620invoke();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m2620invoke() {
                        DialogWrapper.this.updateParameters(onDismissRequest, dialogProperties3, layoutDirection);
                    }
                }, composer2, 0);
                dialogProperties4 = dialogProperties3;
                composer3 = composer2;
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            dialogProperties4 = dialogProperties2;
            composer3 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                invoke((Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer5, int i5) {
                AndroidDialog_androidKt.Dialog(Function0.this, dialogProperties4, content, composer5, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DialogLayout(final Modifier modifier, final Function2 function2, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1177876616);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(function2) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            AndroidDialog_androidKt$DialogLayout$1 androidDialog_androidKt$DialogLayout$1 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r13v15 */
                /* JADX WARN: Type inference failed for: r13v17 */
                /* JADX WARN: Type inference failed for: r13v18 */
                /* JADX WARN: Type inference failed for: r13v23 */
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo37measure3p2s80s(MeasureScope Layout, List measurables, long j) {
                    Object obj;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    final ArrayList arrayList = new ArrayList(measurables.size());
                    int size = measurables.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        arrayList.add(((Measurable) measurables.get(i5)).mo1944measureBRTryo0(j));
                    }
                    Placeable placeable = null;
                    int i6 = 1;
                    if (arrayList.isEmpty()) {
                        obj = null;
                    } else {
                        obj = arrayList.get(0);
                        int width = ((Placeable) obj).getWidth();
                        int lastIndex = CollectionsKt.getLastIndex(arrayList);
                        if (1 <= lastIndex) {
                            int i7 = 1;
                            while (true) {
                                Object obj2 = arrayList.get(i7);
                                int width2 = ((Placeable) obj2).getWidth();
                                if (width < width2) {
                                    obj = obj2;
                                    width = width2;
                                }
                                if (i7 == lastIndex) {
                                    break;
                                }
                                i7++;
                            }
                        }
                    }
                    Placeable placeable2 = (Placeable) obj;
                    int width3 = placeable2 != null ? placeable2.getWidth() : Constraints.m2489getMinWidthimpl(j);
                    if (!arrayList.isEmpty()) {
                        ?? r13 = arrayList.get(0);
                        int height = ((Placeable) r13).getHeight();
                        int lastIndex2 = CollectionsKt.getLastIndex(arrayList);
                        boolean z = r13;
                        if (1 <= lastIndex2) {
                            while (true) {
                                Object obj3 = arrayList.get(i6);
                                int height2 = ((Placeable) obj3).getHeight();
                                r13 = z;
                                if (height < height2) {
                                    r13 = obj3;
                                    height = height2;
                                }
                                if (i6 == lastIndex2) {
                                    break;
                                }
                                i6++;
                                z = r13;
                            }
                        }
                        placeable = r13;
                    }
                    Placeable placeable3 = placeable;
                    return MeasureScope.layout$default(Layout, width3, placeable3 != null ? placeable3.getHeight() : Constraints.m2488getMinHeightimpl(j), null, new Function1() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                            invoke((Placeable.PlacementScope) obj4);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull Placeable.PlacementScope layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            List<Placeable> list = arrayList;
                            int size2 = list.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                Placeable.PlacementScope.placeRelative$default(layout, list.get(i8), 0, 0, 0.0f, 4, null);
                            }
                        }
                    }, 4, null);
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 constructor = companion.getConstructor();
            Function3 materializerOf = LayoutKt.materializerOf(modifier);
            int i5 = (((((i3 << 3) & 112) | ((i3 >> 3) & 14)) << 9) & 7168) | 6;
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
            Updater.m1153setimpl(m1149constructorimpl, androidDialog_androidKt$DialogLayout$1, companion.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(startRestartGroup, Integer.valueOf((i5 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$2
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
                AndroidDialog_androidKt.DialogLayout(Modifier.this, function2, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Dialog$lambda-0, reason: not valid java name */
    public static final Function2 m2618Dialog$lambda0(State state) {
        return (Function2) state.getValue();
    }
}
