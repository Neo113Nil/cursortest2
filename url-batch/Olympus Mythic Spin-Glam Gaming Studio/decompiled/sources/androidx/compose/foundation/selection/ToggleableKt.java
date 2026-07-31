package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Clickable_androidKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Toggleable.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a[\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aU\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aU\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "value", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/Indication;", "indication", "enabled", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function1;", "", "onValueChange", "toggleable-O2vRcR0", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "toggleable", "Landroidx/compose/ui/state/ToggleableState;", "state", "Lkotlin/Function0;", "onClick", "triStateToggleable-O2vRcR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "triStateToggleable", "toggleableImpl-3WzHGRc", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/state/ToggleableState;ZLandroidx/compose/ui/semantics/Role;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "toggleableImpl", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ToggleableKt {
    /* renamed from: toggleable-O2vRcR0, reason: not valid java name */
    public static final Modifier m500toggleableO2vRcR0(Modifier toggleable, final boolean z, final MutableInteractionSource interactionSource, final Indication indication, final boolean z2, final Role role, final Function1 onValueChange) {
        Intrinsics.checkNotNullParameter(toggleable, "$this$toggleable");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        return InspectableValueKt.inspectableWrapper(toggleable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("toggleable");
                inspectorInfo.getProperties().set("value", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set("indication", indication);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onValueChange", onValueChange);
            }
        } : InspectableValueKt.getNoInspectorInfo(), m501toggleableImpl3WzHGRc(Modifier.INSTANCE, ToggleableStateKt.ToggleableState(z), z2, role, interactionSource, indication, new Function0() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                m504invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m504invoke() {
                Function1.this.invoke(Boolean.valueOf(!z));
            }
        }));
    }

    /* renamed from: triStateToggleable-O2vRcR0, reason: not valid java name */
    public static final Modifier m502triStateToggleableO2vRcR0(Modifier triStateToggleable, final ToggleableState state, final MutableInteractionSource interactionSource, final Indication indication, final boolean z, final Role role, final Function0 onClick) {
        Intrinsics.checkNotNullParameter(triStateToggleable, "$this$triStateToggleable");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return InspectableValueKt.inspectableWrapper(triStateToggleable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-O2vRcR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("triStateToggleable");
                inspectorInfo.getProperties().set("state", ToggleableState.this);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set("indication", indication);
                inspectorInfo.getProperties().set("onClick", onClick);
            }
        } : InspectableValueKt.getNoInspectorInfo(), m501toggleableImpl3WzHGRc(Modifier.INSTANCE, state, z, role, interactionSource, indication, onClick));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toggleableImpl-3WzHGRc, reason: not valid java name */
    public static final Modifier m501toggleableImpl3WzHGRc(Modifier modifier, final ToggleableState toggleableState, final boolean z, final Role role, final MutableInteractionSource mutableInteractionSource, final Indication indication, final Function0 function0) {
        return ComposedModifierKt.composed$default(modifier, null, new Function3() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1
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
                composer.startReplaceableGroup(2121285826);
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (rememberedValue == companion.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                MutableState mutableState = (MutableState) rememberedValue;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                final Role role2 = role;
                final ToggleableState toggleableState2 = toggleableState;
                final boolean z2 = z;
                final Function0 function02 = Function0.this;
                Modifier semantics = SemanticsModifierKt.semantics(companion2, true, new Function1() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$semantics$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull SemanticsPropertyReceiver semantics2) {
                        Intrinsics.checkNotNullParameter(semantics2, "$this$semantics");
                        Role role3 = Role.this;
                        if (role3 != null) {
                            SemanticsPropertiesKt.m2176setRolekuIjeqM(semantics2, role3.getValue());
                        }
                        SemanticsPropertiesKt.setToggleableState(semantics2, toggleableState2);
                        final Function0 function03 = function02;
                        SemanticsPropertiesKt.onClick$default(semantics2, null, new Function0() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$semantics$1.1
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
                        }, 1, null);
                        if (z2) {
                            return;
                        }
                        SemanticsPropertiesKt.disabled(semantics2);
                    }
                });
                State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Function0.this, composer, 0);
                composer.startReplaceableGroup(-2134919160);
                if (z) {
                    ClickableKt.PressedInteractionSourceDisposableEffect(mutableInteractionSource, mutableState, composer, 48);
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
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, mutableInteractionSource, Boolean.valueOf(z), new ToggleableKt$toggleableImpl$1$gestures$1(z, mutableInteractionSource, mutableState, SnapshotStateKt.rememberUpdatedState(new Function0() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$delayPressInteraction$1
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
                }, composer, 0), rememberUpdatedState, null));
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue3 = composer.rememberedValue();
                if (rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = new ModifierLocalConsumer() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$1$1
                        @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
                        public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
                            Intrinsics.checkNotNullParameter(scope, "scope");
                            MutableState.this.setValue(scope.getCurrent(ScrollableKt.getModifierLocalScrollableContainer()));
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceableGroup();
                Modifier then = FocusableKt.focusableInNonTouchMode(HoverableKt.hoverable(IndicationKt.indication(composed.then((Modifier) rememberedValue3).then(semantics), mutableInteractionSource, indication), mutableInteractionSource, z), z, mutableInteractionSource).then(pointerInput);
                composer.endReplaceableGroup();
                return then;
            }
        }, 1, null);
    }
}
