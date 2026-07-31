package androidx.compose.foundation;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
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

/* compiled from: FocusedBounds.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a)\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\"6\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00078\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "", "onPositioned", "onFocusedBoundsChanged", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ModifierLocalFocusedBoundsObserver", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalFocusedBoundsObserver", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalFocusedBoundsObserver$annotations", "()V", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusedBoundsKt {
    private static final ProvidableModifierLocal ModifierLocalFocusedBoundsObserver = ModifierLocalKt.modifierLocalOf(new Function0() { // from class: androidx.compose.foundation.FocusedBoundsKt$ModifierLocalFocusedBoundsObserver$1
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: invoke */
        public final Function1 mo4828invoke() {
            return null;
        }
    });

    public static final ProvidableModifierLocal getModifierLocalFocusedBoundsObserver() {
        return ModifierLocalFocusedBoundsObserver;
    }

    public static final Modifier onFocusedBoundsChanged(Modifier modifier, final Function1 onPositioned) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onPositioned, "onPositioned");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.FocusedBoundsKt$onFocusedBoundsChanged$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("onFocusedBoundsChanged");
                inspectorInfo.getProperties().set("onPositioned", Function1.this);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3() { // from class: androidx.compose.foundation.FocusedBoundsKt$onFocusedBoundsChanged$2
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
                composer.startReplaceableGroup(1176407768);
                Function1 function1 = Function1.this;
                composer.startReplaceableGroup(1157296644);
                boolean changed = composer.changed(function1);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new FocusedBoundsObserverModifier(function1);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                FocusedBoundsObserverModifier focusedBoundsObserverModifier = (FocusedBoundsObserverModifier) rememberedValue;
                composer.endReplaceableGroup();
                return focusedBoundsObserverModifier;
            }
        });
    }
}
