package androidx.compose.ui.focus;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FocusChangedModifier.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u0005"}, d2 = {"onFocusChanged", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusState;", "", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FocusChangedModifierKt {
    public static final Modifier onFocusChanged(Modifier modifier, final Function1 onFocusChanged) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.ui.focus.FocusChangedModifierKt$onFocusChanged$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("onFocusChanged");
                inspectorInfo.getProperties().set("onFocusChanged", Function1.this);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3() { // from class: androidx.compose.ui.focus.FocusChangedModifierKt$onFocusChanged$2
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
                composer.startReplaceableGroup(-1741761824);
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState = (MutableState) rememberedValue;
                Modifier.Companion companion = Modifier.INSTANCE;
                final Function1 function1 = Function1.this;
                Modifier onFocusEvent = FocusEventModifierKt.onFocusEvent(companion, new Function1() { // from class: androidx.compose.ui.focus.FocusChangedModifierKt$onFocusChanged$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((FocusState) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull FocusState it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (Intrinsics.areEqual(mutableState.getValue(), it)) {
                            return;
                        }
                        mutableState.setValue(it);
                        function1.invoke(it);
                    }
                });
                composer.endReplaceableGroup();
                return onFocusEvent;
            }
        });
    }
}
