package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
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

/* compiled from: KeyInputModifier.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007ø\u0001\u0000\u001a!\u0010\n\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007ø\u0001\u0000\"\u001c\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"ModifierLocalKeyInput", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/ui/input/key/KeyInputModifier;", "getModifierLocalKeyInput", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "onKeyEvent", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "onPreviewKeyEvent", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KeyInputModifierKt {
    private static final ProvidableModifierLocal ModifierLocalKeyInput = ModifierLocalKt.modifierLocalOf(new Function0() { // from class: androidx.compose.ui.input.key.KeyInputModifierKt$ModifierLocalKeyInput$1
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: invoke */
        public final KeyInputModifier mo4828invoke() {
            return null;
        }
    });

    public static final ProvidableModifierLocal getModifierLocalKeyInput() {
        return ModifierLocalKeyInput;
    }

    public static final Modifier onKeyEvent(Modifier modifier, final Function1 onKeyEvent) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onKeyEvent, "onKeyEvent");
        Function1 noInspectorInfo = InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.ui.input.key.KeyInputModifierKt$onKeyEvent$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("onKeyEvent");
                inspectorInfo.getProperties().set("onKeyEvent", Function1.this);
            }
        } : InspectableValueKt.getNoInspectorInfo();
        Modifier.Companion companion = Modifier.INSTANCE;
        return InspectableValueKt.inspectableWrapper(modifier, noInspectorInfo, new KeyInputModifier(onKeyEvent, null));
    }

    public static final Modifier onPreviewKeyEvent(Modifier modifier, final Function1 onPreviewKeyEvent) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onPreviewKeyEvent, "onPreviewKeyEvent");
        Function1 noInspectorInfo = InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.ui.input.key.KeyInputModifierKt$onPreviewKeyEvent$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("onPreviewKeyEvent");
                inspectorInfo.getProperties().set("onPreviewKeyEvent", Function1.this);
            }
        } : InspectableValueKt.getNoInspectorInfo();
        Modifier.Companion companion = Modifier.INSTANCE;
        return InspectableValueKt.inspectableWrapper(modifier, noInspectorInfo, new KeyInputModifier(null, onPreviewKeyEvent));
    }
}
