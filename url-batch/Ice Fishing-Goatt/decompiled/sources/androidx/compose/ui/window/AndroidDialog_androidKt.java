package androidx.compose.ui.window;

import android.view.View;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidDialog.android.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0002\u0010\b\u001a*\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007H\u0003¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\u0015\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007X\u008a\u0084\u0002"}, d2 = {"Dialog", "", "onDismissRequest", "Lkotlin/Function0;", "properties", "Landroidx/compose/ui/window/DialogProperties;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DialogLayout", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ui_release", "currentContent"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidDialog_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Dialog(final Function0<Unit> function0, DialogProperties dialogProperties, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        DialogProperties dialogProperties2;
        boolean changed;
        int i4;
        final DialogProperties dialogProperties3;
        int i5;
        int i6;
        Object obj;
        boolean changedInstance;
        Object rememberedValue;
        boolean changedInstance2;
        Object rememberedValue2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-2032877254);
        ComposerKt.sourceInformation(startRestartGroup, "C(Dialog)P(1,2)167@7096L7,168@7135L7,169@7190L7,170@7220L28,171@7275L29,172@7324L38,173@7380L616,194@8027L129,194@8002L154,203@8173L182,203@8162L193:AndroidDialog.android.kt#2oxthz");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            dialogProperties2 = dialogProperties;
            i3 |= startRestartGroup.changed(dialogProperties2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !startRestartGroup.getSkipping()) {
                if (i7 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2032877254, i3, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:166)");
                }
                ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localView);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                View view = (View) consume;
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density = (Density) consume2;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume3 = startRestartGroup.consume(localLayoutDirection);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final LayoutDirection layoutDirection = (LayoutDirection) consume3;
                CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
                final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function2, startRestartGroup, (i3 >> 6) & 14);
                UUID uuid = (UUID) RememberSaveableKt.m3409rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<UUID>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialogId$1
                    @Override // kotlin.jvm.functions.Function0
                    public final UUID invoke() {
                        return UUID.randomUUID();
                    }
                }, startRestartGroup, 3072, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -464840651, "CC(remember):AndroidDialog.android.kt#9igjgp");
                changed = startRestartGroup.changed(view) | startRestartGroup.changed(density);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    i4 = i3;
                    dialogProperties3 = dialogProperties2;
                    i5 = 4;
                    i6 = 32;
                    DialogWrapper dialogWrapper = new DialogWrapper(function0, dialogProperties3, view, layoutDirection, density, uuid);
                    dialogWrapper.setContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(488261145, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i8) {
                            ComposerKt.sourceInformation(composer2, "C187@7910L56,185@7825L141:AndroidDialog.android.kt#2oxthz");
                            if ((i8 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(488261145, i8, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:185)");
                                }
                                Modifier semantics$default = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1.1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.dialog(semanticsPropertyReceiver);
                                    }
                                }, 1, null);
                                final State<Function2<Composer, Integer, Unit>> state = rememberUpdatedState;
                                AndroidDialog_androidKt.DialogLayout(semantics$default, ComposableLambdaKt.rememberComposableLambda(-533674951, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i9) {
                                        Function2 Dialog$lambda$0;
                                        ComposerKt.sourceInformation(composer3, "C188@7932L16:AndroidDialog.android.kt#2oxthz");
                                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-533674951, i9, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:188)");
                                        }
                                        Dialog$lambda$0 = AndroidDialog_androidKt.Dialog$lambda$0(state);
                                        Dialog$lambda$0.invoke(composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 48, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }));
                    startRestartGroup.updateRememberedValue(dialogWrapper);
                    obj = dialogWrapper;
                } else {
                    i4 = i3;
                    dialogProperties3 = dialogProperties2;
                    obj = rememberedValue3;
                    i6 = 32;
                    i5 = 4;
                }
                final DialogWrapper dialogWrapper2 = (DialogWrapper) obj;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -464820434, "CC(remember):AndroidDialog.android.kt#9igjgp");
                changedInstance = startRestartGroup.changedInstance(dialogWrapper2);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                            DialogWrapper.this.show();
                            final DialogWrapper dialogWrapper3 = DialogWrapper.this;
                            return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    DialogWrapper.this.dismiss();
                                    DialogWrapper.this.disposeComposition();
                                }
                            };
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                EffectsKt.DisposableEffect(dialogWrapper2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue, startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -464815709, "CC(remember):AndroidDialog.android.kt#9igjgp");
                changedInstance2 = startRestartGroup.changedInstance(dialogWrapper2) | ((i4 & 14) != i5) | ((i4 & 112) != i6) | startRestartGroup.changed(layoutDirection);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            DialogWrapper.this.updateParameters(function0, dialogProperties3, layoutDirection);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                dialogProperties3 = dialogProperties2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        AndroidDialog_androidKt.Dialog(function0, dialogProperties3, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        dialogProperties2 = dialogProperties;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
        }
        if (i7 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<View> localView2 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume4 = startRestartGroup.consume(localView2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        View view2 = (View) consume4;
        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localDensity2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density2 = (Density) consume22;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume32 = startRestartGroup.consume(localLayoutDirection2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final LayoutDirection layoutDirection2 = (LayoutDirection) consume32;
        CompositionContext rememberCompositionContext2 = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
        final State<? extends Function2<? super Composer, ? super Integer, Unit>> rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function2, startRestartGroup, (i3 >> 6) & 14);
        UUID uuid2 = (UUID) RememberSaveableKt.m3409rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<UUID>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialogId$1
            @Override // kotlin.jvm.functions.Function0
            public final UUID invoke() {
                return UUID.randomUUID();
            }
        }, startRestartGroup, 3072, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -464840651, "CC(remember):AndroidDialog.android.kt#9igjgp");
        changed = startRestartGroup.changed(view2) | startRestartGroup.changed(density2);
        Object rememberedValue32 = startRestartGroup.rememberedValue();
        if (changed) {
        }
        i4 = i3;
        dialogProperties3 = dialogProperties2;
        i5 = 4;
        i6 = 32;
        DialogWrapper dialogWrapper3 = new DialogWrapper(function0, dialogProperties3, view2, layoutDirection2, density2, uuid2);
        dialogWrapper3.setContent(rememberCompositionContext2, ComposableLambdaKt.composableLambdaInstance(488261145, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i8) {
                ComposerKt.sourceInformation(composer2, "C187@7910L56,185@7825L141:AndroidDialog.android.kt#2oxthz");
                if ((i8 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(488261145, i8, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:185)");
                    }
                    Modifier semantics$default = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.dialog(semanticsPropertyReceiver);
                        }
                    }, 1, null);
                    final State<? extends Function2<? super Composer, ? super Integer, Unit>> state = rememberUpdatedState2;
                    AndroidDialog_androidKt.DialogLayout(semantics$default, ComposableLambdaKt.rememberComposableLambda(-533674951, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i9) {
                            Function2 Dialog$lambda$0;
                            ComposerKt.sourceInformation(composer3, "C188@7932L16:AndroidDialog.android.kt#2oxthz");
                            if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-533674951, i9, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:188)");
                            }
                            Dialog$lambda$0 = AndroidDialog_androidKt.Dialog$lambda$0(state);
                            Dialog$lambda$0.invoke(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 48, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }));
        startRestartGroup.updateRememberedValue(dialogWrapper3);
        obj = dialogWrapper3;
        final DialogWrapper dialogWrapper22 = (DialogWrapper) obj;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -464820434, "CC(remember):AndroidDialog.android.kt#9igjgp");
        changedInstance = startRestartGroup.changedInstance(dialogWrapper22);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                DialogWrapper.this.show();
                final DialogWrapper dialogWrapper32 = DialogWrapper.this;
                return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        DialogWrapper.this.dismiss();
                        DialogWrapper.this.disposeComposition();
                    }
                };
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        EffectsKt.DisposableEffect(dialogWrapper22, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue, startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -464815709, "CC(remember):AndroidDialog.android.kt#9igjgp");
        changedInstance2 = startRestartGroup.changedInstance(dialogWrapper22) | ((i4 & 14) != i5) | ((i4 & 112) != i6) | startRestartGroup.changed(layoutDirection2);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                DialogWrapper.this.updateParameters(function0, dialogProperties3, layoutDirection2);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DialogLayout(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1177876616);
        ComposerKt.sourceInformation(startRestartGroup, "C(DialogLayout)P(1)465@18400L455:AndroidDialog.android.kt#2oxthz");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1177876616, i3, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:464)");
            }
            AndroidDialog_androidKt$DialogLayout$1 androidDialog_androidKt$DialogLayout$1 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r12v16 */
                /* JADX WARN: Type inference failed for: r12v18 */
                /* JADX WARN: Type inference failed for: r12v19 */
                /* JADX WARN: Type inference failed for: r12v24 */
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                    Object obj;
                    ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        arrayList.add(list.get(i5).mo5152measureBRTryo0(j));
                    }
                    final ArrayList arrayList2 = arrayList;
                    Placeable placeable = null;
                    int i6 = 1;
                    if (arrayList2.isEmpty()) {
                        obj = null;
                    } else {
                        obj = arrayList2.get(0);
                        int width = ((Placeable) obj).getWidth();
                        int lastIndex = CollectionsKt.getLastIndex(arrayList2);
                        if (1 <= lastIndex) {
                            int i7 = 1;
                            while (true) {
                                Object obj2 = arrayList2.get(i7);
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
                    int width3 = placeable2 != null ? placeable2.getWidth() : Constraints.m6220getMinWidthimpl(j);
                    if (!arrayList2.isEmpty()) {
                        ?? r12 = arrayList2.get(0);
                        int height = ((Placeable) r12).getHeight();
                        int lastIndex2 = CollectionsKt.getLastIndex(arrayList2);
                        boolean z = r12;
                        if (1 <= lastIndex2) {
                            while (true) {
                                Object obj3 = arrayList2.get(i6);
                                int height2 = ((Placeable) obj3).getHeight();
                                r12 = z;
                                if (height < height2) {
                                    r12 = obj3;
                                    height = height2;
                                }
                                if (i6 == lastIndex2) {
                                    break;
                                }
                                i6++;
                                z = r12;
                            }
                        }
                        placeable = r12;
                    }
                    Placeable placeable3 = placeable;
                    return MeasureScope.layout$default(measureScope, width3, placeable3 != null ? placeable3.getHeight() : Constraints.m6219getMinHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Placeable.PlacementScope placementScope) {
                            List<Placeable> list2 = arrayList2;
                            int size2 = list2.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                Placeable.PlacementScope.placeRelative$default(placementScope, list2.get(i8), 0, 0, 0.0f, 4, null);
                            }
                        }
                    }, 4, null);
                }
            };
            int i5 = ((i3 >> 3) & 14) | 384 | ((i3 << 3) & 112);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i6 = ((i5 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
            Updater.m3323setimpl(m3316constructorimpl, androidDialog_androidKt$DialogLayout$1, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3316constructorimpl.getInserting() || !Intrinsics.areEqual(m3316constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3323setimpl(m3316constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            function2.invoke(startRestartGroup, Integer.valueOf((i6 >> 6) & 14));
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    AndroidDialog_androidKt.DialogLayout(Modifier.this, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<Composer, Integer, Unit> Dialog$lambda$0(State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
        return (Function2) state.getValue();
    }
}
