package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableModifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Focusable.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0003H\u0007\u001a \u0010\u0004\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u001a\u001e\u0010\t\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000\u001a\"\u0010\n\u001a\u00020\u0003*\u00020\u00032\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\u000bH\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"focusGroupInspectorInfo", "Landroidx/compose/ui/platform/InspectableModifier;", "focusGroup", "Landroidx/compose/ui/Modifier;", "focusable", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "focusableInNonTouchMode", "onPinnableParentAvailable", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/layout/PinnableParent;", "", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusableKt {
    private static final InspectableModifier focusGroupInspectorInfo;

    public static /* synthetic */ Modifier focusable$default(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            mutableInteractionSource = null;
        }
        return focusable(modifier, z, mutableInteractionSource);
    }

    public static final Modifier focusable(Modifier modifier, final boolean z, final MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.FocusableKt$focusable$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("focusable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new FocusableKt$focusable$2(mutableInteractionSource, z));
    }

    public static final Modifier focusableInNonTouchMode(Modifier modifier, final boolean z, final MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.FocusableKt$focusableInNonTouchMode$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("focusableInNonTouchMode");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3() { // from class: androidx.compose.foundation.FocusableKt$focusableInNonTouchMode$2
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
                composer.startReplaceableGroup(-618949501);
                final InputModeManager inputModeManager = (InputModeManager) composer.consume(CompositionLocalsKt.getLocalInputModeManager());
                Modifier focusable = FocusableKt.focusable(FocusPropertiesKt.focusProperties(Modifier.INSTANCE, new Function1() { // from class: androidx.compose.foundation.FocusableKt$focusableInNonTouchMode$2.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((FocusProperties) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull FocusProperties focusProperties) {
                        Intrinsics.checkNotNullParameter(focusProperties, "$this$focusProperties");
                        focusProperties.setCanFocus(!InputMode.m1771equalsimpl0(InputModeManager.this.mo1777getInputModeaOaMEAU(), InputMode.INSTANCE.m1776getTouchaOaMEAU()));
                    }
                }), z, mutableInteractionSource);
                composer.endReplaceableGroup();
                return focusable;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier onPinnableParentAvailable(Modifier modifier, final Function1 function1) {
        return InspectableValueKt.inspectableWrapper(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.FocusableKt$onPinnableParentAvailable$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("onPinnableParentAvailable");
                inspectorInfo.getProperties().set("onPinnableParentAvailable", Function1.this);
            }
        } : InspectableValueKt.getNoInspectorInfo(), Modifier.INSTANCE.then(new PinnableParentConsumer(function1)));
    }

    public static final Modifier focusGroup(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return FocusModifierKt.focusTarget(FocusPropertiesKt.focusProperties(modifier.then(focusGroupInspectorInfo), new Function1() { // from class: androidx.compose.foundation.FocusableKt$focusGroup$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusProperties) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull FocusProperties focusProperties) {
                Intrinsics.checkNotNullParameter(focusProperties, "$this$focusProperties");
                focusProperties.setCanFocus(false);
            }
        }));
    }

    static {
        focusGroupInspectorInfo = new InspectableModifier(InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.FocusableKt$special$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("focusGroup");
            }
        } : InspectableValueKt.getNoInspectorInfo());
    }
}
