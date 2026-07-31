package androidx.compose.ui.focus;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
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

/* compiled from: FocusModifier.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0001\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0001\u0010\u0005\"\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u001a\u0010\u000b\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/Modifier;", "focusTarget", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/focus/FocusModifier;", "focusModifier", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusModifier;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ModifierLocalParentFocusModifier", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalParentFocusModifier", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ResetFocusModifierLocals", "Landroidx/compose/ui/Modifier;", "getResetFocusModifierLocals", "()Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FocusModifierKt {
    private static final ProvidableModifierLocal ModifierLocalParentFocusModifier = ModifierLocalKt.modifierLocalOf(new Function0() { // from class: androidx.compose.ui.focus.FocusModifierKt$ModifierLocalParentFocusModifier$1
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: invoke */
        public final FocusModifier mo4828invoke() {
            return null;
        }
    });
    private static final Modifier ResetFocusModifierLocals = Modifier.INSTANCE.then(new ModifierLocalProvider<FocusPropertiesModifier>() { // from class: androidx.compose.ui.focus.FocusModifierKt$ResetFocusModifierLocals$1
        @Override // androidx.compose.ui.modifier.ModifierLocalProvider
        public FocusPropertiesModifier getValue() {
            return null;
        }

        @Override // androidx.compose.ui.modifier.ModifierLocalProvider
        public ProvidableModifierLocal getKey() {
            return FocusPropertiesKt.getModifierLocalFocusProperties();
        }
    }).then(new ModifierLocalProvider<FocusEventModifierLocal>() { // from class: androidx.compose.ui.focus.FocusModifierKt$ResetFocusModifierLocals$2
        @Override // androidx.compose.ui.modifier.ModifierLocalProvider
        public FocusEventModifierLocal getValue() {
            return null;
        }

        @Override // androidx.compose.ui.modifier.ModifierLocalProvider
        public ProvidableModifierLocal getKey() {
            return FocusEventModifierKt.getModifierLocalFocusEvent();
        }
    }).then(new ModifierLocalProvider<FocusRequesterModifierLocal>() { // from class: androidx.compose.ui.focus.FocusModifierKt$ResetFocusModifierLocals$3
        @Override // androidx.compose.ui.modifier.ModifierLocalProvider
        public FocusRequesterModifierLocal getValue() {
            return null;
        }

        @Override // androidx.compose.ui.modifier.ModifierLocalProvider
        public ProvidableModifierLocal getKey() {
            return FocusRequesterModifierKt.getModifierLocalFocusRequester();
        }
    });

    public static final ProvidableModifierLocal getModifierLocalParentFocusModifier() {
        return ModifierLocalParentFocusModifier;
    }

    public static final Modifier focusTarget(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.ui.focus.FocusModifierKt$focusTarget$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("focusTarget");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3() { // from class: androidx.compose.ui.focus.FocusModifierKt$focusTarget$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-326009031);
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new FocusModifier(FocusStateImpl.Inactive, null, 2, null);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                final FocusModifier focusModifier = (FocusModifier) rememberedValue;
                EffectsKt.SideEffect(new Function0() { // from class: androidx.compose.ui.focus.FocusModifierKt$focusTarget$2.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        m1263invoke();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m1263invoke() {
                        FocusTransactionsKt.sendOnFocusEvent(FocusModifier.this);
                    }
                }, composer, 0);
                Modifier focusTarget = FocusModifierKt.focusTarget(composed, focusModifier);
                composer.endReplaceableGroup();
                return focusTarget;
            }
        });
    }

    public static final Modifier focusTarget(Modifier modifier, FocusModifier focusModifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(focusModifier, "focusModifier");
        return modifier.then(focusModifier).then(ResetFocusModifierLocals);
    }
}
