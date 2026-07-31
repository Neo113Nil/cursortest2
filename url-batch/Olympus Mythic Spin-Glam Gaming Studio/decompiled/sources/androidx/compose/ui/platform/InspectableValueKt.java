package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: InspectableValue.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a/\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\"#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "wrapped", "inspectableWrapper", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "NoInspectorInfo", "Lkotlin/jvm/functions/Function1;", "getNoInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "", "isDebugInspectorInfoEnabled", "Z", "()Z", "setDebugInspectorInfoEnabled", "(Z)V", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InspectableValueKt {
    private static final Function1 NoInspectorInfo = new Function1() { // from class: androidx.compose.ui.platform.InspectableValueKt$NoInspectorInfo$1
        public final void invoke(@NotNull InspectorInfo inspectorInfo) {
            Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InspectorInfo) obj);
            return Unit.INSTANCE;
        }
    };
    private static boolean isDebugInspectorInfoEnabled;

    public static final Function1 getNoInspectorInfo() {
        return NoInspectorInfo;
    }

    public static final boolean isDebugInspectorInfoEnabled() {
        return isDebugInspectorInfoEnabled;
    }

    public static final Modifier inspectableWrapper(Modifier modifier, Function1 inspectorInfo, Modifier wrapped) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        InspectableModifier inspectableModifier = new InspectableModifier(inspectorInfo);
        return modifier.then(inspectableModifier).then(wrapped).then(inspectableModifier.getEnd());
    }
}
