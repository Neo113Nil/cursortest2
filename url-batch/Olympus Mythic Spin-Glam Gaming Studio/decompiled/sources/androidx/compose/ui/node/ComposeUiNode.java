package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ComposeUiNode.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\ba\u0018\u0000  2\u00020\u0001:\u0001 R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0013\u001a\u00020\u000e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0019\u001a\u00020\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u00020\u001a8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode;", "", "Landroidx/compose/ui/layout/MeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicy", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "measurePolicy", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "density", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "modifier", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "setViewConfiguration", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", "viewConfiguration", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface ComposeUiNode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void setDensity(Density density);

    void setLayoutDirection(LayoutDirection layoutDirection);

    void setMeasurePolicy(MeasurePolicy measurePolicy);

    void setModifier(Modifier modifier);

    void setViewConfiguration(ViewConfiguration viewConfiguration);

    /* compiled from: ComposeUiNode.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR)\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R)\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R)\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R)\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010R)\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode$Companion;", "", "<init>", "()V", "Lkotlin/Function0;", "Landroidx/compose/ui/node/ComposeUiNode;", "Constructor", "Lkotlin/jvm/functions/Function0;", "getConstructor", "()Lkotlin/jvm/functions/Function0;", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier;", "", "SetModifier", "Lkotlin/jvm/functions/Function2;", "getSetModifier", "()Lkotlin/jvm/functions/Function2;", "Landroidx/compose/ui/unit/Density;", "SetDensity", "getSetDensity", "Landroidx/compose/ui/layout/MeasurePolicy;", "SetMeasurePolicy", "getSetMeasurePolicy", "Landroidx/compose/ui/unit/LayoutDirection;", "SetLayoutDirection", "getSetLayoutDirection", "Landroidx/compose/ui/platform/ViewConfiguration;", "SetViewConfiguration", "getSetViewConfiguration", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Function0 Constructor = LayoutNode.INSTANCE.getConstructor$ui_release();
        private static final Function2 SetModifier = new Function2() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, (Modifier) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ComposeUiNode composeUiNode, @NotNull Modifier it) {
                Intrinsics.checkNotNullParameter(composeUiNode, "$this$null");
                Intrinsics.checkNotNullParameter(it, "it");
                composeUiNode.setModifier(it);
            }
        };
        private static final Function2 SetDensity = new Function2() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetDensity$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, (Density) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ComposeUiNode composeUiNode, @NotNull Density it) {
                Intrinsics.checkNotNullParameter(composeUiNode, "$this$null");
                Intrinsics.checkNotNullParameter(it, "it");
                composeUiNode.setDensity(it);
            }
        };
        private static final Function2 SetMeasurePolicy = new Function2() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetMeasurePolicy$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, (MeasurePolicy) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ComposeUiNode composeUiNode, @NotNull MeasurePolicy it) {
                Intrinsics.checkNotNullParameter(composeUiNode, "$this$null");
                Intrinsics.checkNotNullParameter(it, "it");
                composeUiNode.setMeasurePolicy(it);
            }
        };
        private static final Function2 SetLayoutDirection = new Function2() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetLayoutDirection$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, (LayoutDirection) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ComposeUiNode composeUiNode, @NotNull LayoutDirection it) {
                Intrinsics.checkNotNullParameter(composeUiNode, "$this$null");
                Intrinsics.checkNotNullParameter(it, "it");
                composeUiNode.setLayoutDirection(it);
            }
        };
        private static final Function2 SetViewConfiguration = new Function2() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetViewConfiguration$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, (ViewConfiguration) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ComposeUiNode composeUiNode, @NotNull ViewConfiguration it) {
                Intrinsics.checkNotNullParameter(composeUiNode, "$this$null");
                Intrinsics.checkNotNullParameter(it, "it");
                composeUiNode.setViewConfiguration(it);
            }
        };

        private Companion() {
        }

        public final Function0 getConstructor() {
            return Constructor;
        }

        public final Function2 getSetModifier() {
            return SetModifier;
        }

        public final Function2 getSetDensity() {
            return SetDensity;
        }

        public final Function2 getSetMeasurePolicy() {
            return SetMeasurePolicy;
        }

        public final Function2 getSetLayoutDirection() {
            return SetLayoutDirection;
        }

        public final Function2 getSetViewConfiguration() {
            return SetViewConfiguration;
        }
    }
}
