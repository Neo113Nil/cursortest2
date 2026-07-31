package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ViewConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TouchTarget.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "minimumTouchTargetSize", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "LocalMinimumTouchTargetEnforcement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalMinimumTouchTargetEnforcement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalMinimumTouchTargetEnforcement$annotations", "()V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TouchTargetKt {
    private static final ProvidableCompositionLocal LocalMinimumTouchTargetEnforcement = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.material.TouchTargetKt$LocalMinimumTouchTargetEnforcement$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final Boolean mo4828invoke() {
            return Boolean.TRUE;
        }
    });

    public static final ProvidableCompositionLocal getLocalMinimumTouchTargetEnforcement() {
        return LocalMinimumTouchTargetEnforcement;
    }

    public static final Modifier minimumTouchTargetSize(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.material.TouchTargetKt$minimumTouchTargetSize$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("minimumTouchTargetSize");
                inspectorInfo.getProperties().set("README", "Adds outer padding to measure at least 48.dp (default) in size to disambiguate touch interactions if the element would measure smaller");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3() { // from class: androidx.compose.material.TouchTargetKt$minimumTouchTargetSize$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                Modifier modifier2;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1220403677);
                if (((Boolean) composer.consume(TouchTargetKt.getLocalMinimumTouchTargetEnforcement())).booleanValue()) {
                    modifier2 = new MinimumTouchTargetModifier(((ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration())).mo2020getMinimumTouchTargetSizeMYxV2XQ(), null);
                } else {
                    modifier2 = Modifier.INSTANCE;
                }
                composer.endReplaceableGroup();
                return modifier2;
            }
        });
    }
}
