package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.focus.FocusAwareEvent;
import androidx.compose.ui.input.focus.FocusAwareInputModifier;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RotaryInputModifier.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0001*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0003¢\u0006\u0004\b\u0007\u0010\b\".\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n0\t8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "", "onRotaryScrollEvent", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/focus/FocusAwareEvent;", "focusAwareCallback", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/ui/input/focus/FocusAwareInputModifier;", "ModifierLocalRotaryScrollParent", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalRotaryScrollParent", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalRotaryScrollParent$annotations", "()V", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RotaryInputModifierKt {
    private static final ProvidableModifierLocal ModifierLocalRotaryScrollParent = ModifierLocalKt.modifierLocalOf(new Function0() { // from class: androidx.compose.ui.input.rotary.RotaryInputModifierKt$ModifierLocalRotaryScrollParent$1
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: invoke */
        public final FocusAwareInputModifier<RotaryScrollEvent> mo4828invoke() {
            return null;
        }
    });

    public static final ProvidableModifierLocal getModifierLocalRotaryScrollParent() {
        return ModifierLocalRotaryScrollParent;
    }

    private static final Function1 focusAwareCallback(final Function1 function1) {
        return new Function1() { // from class: androidx.compose.ui.input.rotary.RotaryInputModifierKt$focusAwareCallback$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull FocusAwareEvent e) {
                Intrinsics.checkNotNullParameter(e, "e");
                if (!(e instanceof RotaryScrollEvent)) {
                    throw new IllegalStateException("FocusAwareEvent is dispatched to the wrong FocusAwareParent.");
                }
                return (Boolean) Function1.this.invoke(e);
            }
        };
    }

    public static final Modifier onRotaryScrollEvent(Modifier modifier, final Function1 onRotaryScrollEvent) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onRotaryScrollEvent, "onRotaryScrollEvent");
        Function1 noInspectorInfo = InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.ui.input.rotary.RotaryInputModifierKt$onRotaryScrollEvent$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("onRotaryScrollEvent");
                inspectorInfo.getProperties().set("onRotaryScrollEvent", Function1.this);
            }
        } : InspectableValueKt.getNoInspectorInfo();
        Modifier.Companion companion = Modifier.INSTANCE;
        return InspectableValueKt.inspectableWrapper(modifier, noInspectorInfo, new FocusAwareInputModifier(focusAwareCallback(onRotaryScrollEvent), null, ModifierLocalRotaryScrollParent));
    }
}
