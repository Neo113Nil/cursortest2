package androidx.compose.ui.focus;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FocusEventModifier.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a\u001e\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\"\u001c\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"ModifierLocalFocusEvent", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/ui/focus/FocusEventModifierLocal;", "getModifierLocalFocusEvent", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "onFocusEvent", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusState;", "", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FocusEventModifierKt {
    private static final ProvidableModifierLocal ModifierLocalFocusEvent = ModifierLocalKt.modifierLocalOf(new Function0() { // from class: androidx.compose.ui.focus.FocusEventModifierKt$ModifierLocalFocusEvent$1
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: invoke */
        public final FocusEventModifierLocal mo4828invoke() {
            return null;
        }
    });

    public static final ProvidableModifierLocal getModifierLocalFocusEvent() {
        return ModifierLocalFocusEvent;
    }

    public static final Modifier onFocusEvent(Modifier modifier, final Function1 onFocusEvent) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onFocusEvent, "onFocusEvent");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.ui.focus.FocusEventModifierKt$onFocusEvent$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("onFocusEvent");
                inspectorInfo.getProperties().set("onFocusEvent", Function1.this);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3() { // from class: androidx.compose.ui.focus.FocusEventModifierKt$onFocusEvent$2
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
                composer.startReplaceableGroup(607036704);
                Function1 function1 = Function1.this;
                composer.startReplaceableGroup(1157296644);
                boolean changed = composer.changed(function1);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new FocusEventModifierLocal(function1);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                final FocusEventModifierLocal focusEventModifierLocal = (FocusEventModifierLocal) rememberedValue;
                EffectsKt.SideEffect(new Function0() { // from class: androidx.compose.ui.focus.FocusEventModifierKt$onFocusEvent$2.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        m1259invoke();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m1259invoke() {
                        FocusEventModifierLocal.this.notifyIfNoFocusModifiers();
                    }
                }, composer, 0);
                composer.endReplaceableGroup();
                return focusEventModifierLocal;
            }
        });
    }
}
