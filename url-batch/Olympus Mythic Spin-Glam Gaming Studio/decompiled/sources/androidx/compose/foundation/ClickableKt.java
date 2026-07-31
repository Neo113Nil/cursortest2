package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001aG\u0010\f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aY\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u008b\u0001\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001aQ\u0010%\u001a\u00020\b*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00192\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070!H\u0080@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a\u0081\u0001\u0010)\u001a\u00020\u0000*\u00020\u00002\u0006\u0010&\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "", "onClick", "clickable-XHw0xAI", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "clickable", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/Indication;", "indication", "clickable-O2vRcR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "onLongClickLabel", "onLongClick", "onDoubleClick", "combinedClickable-XVZzFYc", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "combinedClickable", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "pressedInteraction", "PressedInteractionSourceDisposableEffect", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", "pressPoint", "Landroidx/compose/runtime/State;", "delayPressInteraction", "handlePressInteraction-EPk0efs", "(Landroidx/compose/foundation/gestures/PressGestureScope;JLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handlePressInteraction", "gestureModifiers", "genericClickableWithoutGesture-BI-LeDI", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "genericClickableWithoutGesture", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ClickableKt {
    /* renamed from: clickable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m172clickableXHw0xAI$default(Modifier modifier, boolean z, String str, Role role, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        return m171clickableXHw0xAI(modifier, z, str, role, function0);
    }

    /* renamed from: clickable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m170clickableO2vRcR0$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, String str, Role role, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return m169clickableO2vRcR0(modifier, mutableInteractionSource, indication, z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : role, function0);
    }

    /* renamed from: clickable-O2vRcR0, reason: not valid java name */
    public static final Modifier m169clickableO2vRcR0(Modifier clickable, final MutableInteractionSource interactionSource, final Indication indication, final boolean z, final String str, final Role role, final Function0 onClick) {
        Intrinsics.checkNotNullParameter(clickable, "$this$clickable");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(clickable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("clickable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", onClick);
                inspectorInfo.getProperties().set("indication", indication);
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3() { // from class: androidx.compose.foundation.ClickableKt$clickable$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(92076020);
                State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Function0.this, composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (rememberedValue == companion.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                MutableState mutableState = (MutableState) rememberedValue;
                composer.startReplaceableGroup(1841981204);
                if (z) {
                    ClickableKt.PressedInteractionSourceDisposableEffect(interactionSource, mutableState, composer, 48);
                }
                composer.endReplaceableGroup();
                final Function0 isComposeRootInScrollableContainer = Clickable_androidKt.isComposeRootInScrollableContainer(composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue2 = composer.rememberedValue();
                if (rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState2 = (MutableState) rememberedValue2;
                State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(new Function0() { // from class: androidx.compose.foundation.ClickableKt$clickable$4$delayPressInteraction$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* renamed from: invoke */
                    public final Boolean mo4828invoke() {
                        return Boolean.valueOf(((Boolean) mutableState2.getValue()).booleanValue() || ((Boolean) isComposeRootInScrollableContainer.mo4828invoke()).booleanValue());
                    }
                }, composer, 0);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, interactionSource, Boolean.valueOf(z), new ClickableKt$clickable$4$gesture$1(z, interactionSource, mutableState, rememberUpdatedState2, rememberUpdatedState, null));
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue3 = composer.rememberedValue();
                if (rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = new ModifierLocalConsumer() { // from class: androidx.compose.foundation.ClickableKt$clickable$4$1$1
                        @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
                        public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
                            Intrinsics.checkNotNullParameter(scope, "scope");
                            MutableState.this.setValue(scope.getCurrent(ScrollableKt.getModifierLocalScrollableContainer()));
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceableGroup();
                Modifier m174genericClickableWithoutGestureBILeDI = ClickableKt.m174genericClickableWithoutGestureBILeDI(companion2.then((Modifier) rememberedValue3), pointerInput, interactionSource, indication, z, str, role, null, null, Function0.this);
                composer.endReplaceableGroup();
                return m174genericClickableWithoutGestureBILeDI;
            }
        });
    }

    /* renamed from: clickable-XHw0xAI, reason: not valid java name */
    public static final Modifier m171clickableXHw0xAI(Modifier clickable, final boolean z, final String str, final Role role, final Function0 onClick) {
        Intrinsics.checkNotNullParameter(clickable, "$this$clickable");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(clickable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.ClickableKt$clickable-XHw0xAI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("clickable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", onClick);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3() { // from class: androidx.compose.foundation.ClickableKt$clickable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-756081143);
                Modifier.Companion companion = Modifier.INSTANCE;
                Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier m169clickableO2vRcR0 = ClickableKt.m169clickableO2vRcR0(companion, (MutableInteractionSource) rememberedValue, indication, z, str, role, onClick);
                composer.endReplaceableGroup();
                return m169clickableO2vRcR0;
            }
        });
    }

    /* renamed from: combinedClickable-XVZzFYc, reason: not valid java name */
    public static final Modifier m173combinedClickableXVZzFYc(Modifier combinedClickable, final MutableInteractionSource interactionSource, final Indication indication, final boolean z, final String str, final Role role, final String str2, final Function0 function0, final Function0 function02, final Function0 onClick) {
        Intrinsics.checkNotNullParameter(combinedClickable, "$this$combinedClickable");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(combinedClickable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-XVZzFYc$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("combinedClickable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", onClick);
                inspectorInfo.getProperties().set("onDoubleClick", function02);
                inspectorInfo.getProperties().set("onLongClick", function0);
                inspectorInfo.getProperties().set("onLongClickLabel", str2);
                inspectorInfo.getProperties().set("indication", indication);
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1841718000);
                State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Function0.this, composer, 0);
                State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function0, composer, 0);
                State rememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(function02, composer, 0);
                boolean z2 = function0 != null;
                boolean z3 = function02 != null;
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (rememberedValue == companion.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState = (MutableState) rememberedValue;
                composer.startReplaceableGroup(1321106866);
                if (z) {
                    Boolean valueOf = Boolean.valueOf(z2);
                    final MutableInteractionSource mutableInteractionSource = interactionSource;
                    EffectsKt.DisposableEffect(valueOf, new Function1() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                            final MutableState<PressInteraction.Press> mutableState2 = mutableState;
                            final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    PressInteraction.Press press = (PressInteraction.Press) MutableState.this.getValue();
                                    if (press != null) {
                                        mutableInteractionSource2.tryEmit(new PressInteraction.Cancel(press));
                                        MutableState.this.setValue(null);
                                    }
                                }
                            };
                        }
                    }, composer, 0);
                    ClickableKt.PressedInteractionSourceDisposableEffect(interactionSource, mutableState, composer, 48);
                }
                composer.endReplaceableGroup();
                final Function0 isComposeRootInScrollableContainer = Clickable_androidKt.isComposeRootInScrollableContainer(composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue2 = composer.rememberedValue();
                if (rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState2 = (MutableState) rememberedValue2;
                State rememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(new Function0() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$delayPressInteraction$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* renamed from: invoke */
                    public final Boolean mo4828invoke() {
                        return Boolean.valueOf(((Boolean) mutableState2.getValue()).booleanValue() || ((Boolean) isComposeRootInScrollableContainer.mo4828invoke()).booleanValue());
                    }
                }, composer, 0);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput((Modifier) companion2, new Object[]{interactionSource, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z)}, (Function2) new ClickableKt$combinedClickable$4$gesture$1(z3, z, z2, rememberUpdatedState3, rememberUpdatedState2, interactionSource, mutableState, rememberUpdatedState4, rememberUpdatedState, null));
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue3 = composer.rememberedValue();
                if (rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = new ModifierLocalConsumer() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$2$1
                        @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
                        public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
                            Intrinsics.checkNotNullParameter(scope, "scope");
                            MutableState.this.setValue(scope.getCurrent(ScrollableKt.getModifierLocalScrollableContainer()));
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceableGroup();
                Modifier m174genericClickableWithoutGestureBILeDI = ClickableKt.m174genericClickableWithoutGestureBILeDI(companion2.then((Modifier) rememberedValue3), pointerInput, interactionSource, indication, z, str, role, str2, function0, Function0.this);
                composer.endReplaceableGroup();
                return m174genericClickableWithoutGestureBILeDI;
            }
        });
    }

    public static final void PressedInteractionSourceDisposableEffect(final MutableInteractionSource interactionSource, final MutableState pressedInteraction, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(pressedInteraction, "pressedInteraction");
        Composer startRestartGroup = composer.startRestartGroup(1761107222);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(interactionSource) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(pressedInteraction) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed = startRestartGroup.changed(pressedInteraction) | startRestartGroup.changed(interactionSource);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.foundation.ClickableKt$PressedInteractionSourceDisposableEffect$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final MutableState<PressInteraction.Press> mutableState = pressedInteraction;
                        final MutableInteractionSource mutableInteractionSource = interactionSource;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.ClickableKt$PressedInteractionSourceDisposableEffect$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                PressInteraction.Press press = (PressInteraction.Press) MutableState.this.getValue();
                                if (press != null) {
                                    mutableInteractionSource.tryEmit(new PressInteraction.Cancel(press));
                                    MutableState.this.setValue(null);
                                }
                            }
                        };
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(interactionSource, (Function1) rememberedValue, startRestartGroup, i2 & 14);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.ClickableKt$PressedInteractionSourceDisposableEffect$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i3) {
                ClickableKt.PressedInteractionSourceDisposableEffect(MutableInteractionSource.this, pressedInteraction, composer2, i | 1);
            }
        });
    }

    /* renamed from: handlePressInteraction-EPk0efs, reason: not valid java name */
    public static final Object m175handlePressInteractionEPk0efs(PressGestureScope pressGestureScope, long j, MutableInteractionSource mutableInteractionSource, MutableState mutableState, State state, Continuation continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new ClickableKt$handlePressInteraction$2(pressGestureScope, j, mutableInteractionSource, mutableState, state, null), continuation);
        return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
    }

    private static final Modifier genericClickableWithoutGesture_BI_LeDI$clickSemantics(Modifier modifier, final Role role, final String str, final Function0 function0, final String str2, final boolean z, final Function0 function02) {
        return SemanticsModifierKt.semantics(modifier, true, new Function1() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                Role role2 = Role.this;
                if (role2 != null) {
                    SemanticsPropertiesKt.m2176setRolekuIjeqM(semantics, role2.getValue());
                }
                String str3 = str;
                final Function0 function03 = function02;
                SemanticsPropertiesKt.onClick(semantics, str3, new Function0() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* renamed from: invoke */
                    public final Boolean mo4828invoke() {
                        Function0.this.mo4828invoke();
                        return Boolean.TRUE;
                    }
                });
                final Function0 function04 = function0;
                if (function04 != null) {
                    SemanticsPropertiesKt.onLongClick(semantics, str2, new Function0() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1.2
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        /* renamed from: invoke */
                        public final Boolean mo4828invoke() {
                            Function0.this.mo4828invoke();
                            return Boolean.TRUE;
                        }
                    });
                }
                if (z) {
                    return;
                }
                SemanticsPropertiesKt.disabled(semantics);
            }
        });
    }

    private static final Modifier genericClickableWithoutGesture_BI_LeDI$detectClickFromKey(Modifier modifier, final boolean z, final Function0 function0) {
        return KeyInputModifierKt.onKeyEvent(modifier, new Function1() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectClickFromKey$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m182invokeZmokQxo(((KeyEvent) obj).getNativeKeyEvent());
            }

            @NotNull
            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m182invokeZmokQxo(@NotNull android.view.KeyEvent it) {
                boolean z2;
                Intrinsics.checkNotNullParameter(it, "it");
                if (z && Clickable_androidKt.m183isClickZmokQxo(it)) {
                    function0.mo4828invoke();
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        });
    }

    /* renamed from: genericClickableWithoutGesture-BI-LeDI, reason: not valid java name */
    public static final Modifier m174genericClickableWithoutGestureBILeDI(Modifier genericClickableWithoutGesture, Modifier gestureModifiers, MutableInteractionSource interactionSource, Indication indication, boolean z, String str, Role role, String str2, Function0 function0, Function0 onClick) {
        Intrinsics.checkNotNullParameter(genericClickableWithoutGesture, "$this$genericClickableWithoutGesture");
        Intrinsics.checkNotNullParameter(gestureModifiers, "gestureModifiers");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return FocusableKt.focusableInNonTouchMode(HoverableKt.hoverable(IndicationKt.indication(genericClickableWithoutGesture_BI_LeDI$detectClickFromKey(genericClickableWithoutGesture_BI_LeDI$clickSemantics(genericClickableWithoutGesture, role, str, function0, str2, z, onClick), z, onClick), interactionSource, indication), interactionSource, z), z, interactionSource).then(gestureModifiers);
    }
}
