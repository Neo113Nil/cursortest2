package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.MagnifierKt;
import androidx.compose.foundation.MagnifierStyle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SelectionManager.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SelectionManager_androidKt$selectionMagnifier$1 extends Lambda implements Function3 {
    final /* synthetic */ SelectionManager $manager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionManager_androidKt$selectionMagnifier$1(SelectionManager selectionManager) {
        super(3);
        this.$manager = selectionManager;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(-1914520728);
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m2562boximpl(IntSize.INSTANCE.m2571getZeroYbymL2g()), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final MutableState mutableState = (MutableState) rememberedValue;
        final SelectionManager selectionManager = this.$manager;
        Modifier animatedSelectionMagnifier = SelectionMagnifierKt.animatedSelectionMagnifier(composed, new Function0() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                return Offset.m1288boximpl(m674invokeF1C5BW0());
            }

            /* renamed from: invoke-F1C5BW0, reason: not valid java name */
            public final long m674invokeF1C5BW0() {
                return SelectionManagerKt.m667calculateSelectionMagnifierCenterAndroidO0kMr_c(SelectionManager.this, SelectionManager_androidKt$selectionMagnifier$1.m672invoke$lambda1(mutableState));
            }
        }, new Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Modifier invoke(@NotNull final Function0 center) {
                Intrinsics.checkNotNullParameter(center, "center");
                Modifier.Companion companion = Modifier.INSTANCE;
                MagnifierStyle textDefault = MagnifierStyle.INSTANCE.getTextDefault();
                Function1 function1 = new Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt.selectionMagnifier.1.2.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return Offset.m1288boximpl(m675invoketuRUvjQ((Density) obj));
                    }

                    /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
                    public final long m675invoketuRUvjQ(@NotNull Density magnifier) {
                        Intrinsics.checkNotNullParameter(magnifier, "$this$magnifier");
                        return ((Offset) Function0.this.mo4828invoke()).getPackedValue();
                    }
                };
                final Density density2 = Density.this;
                final MutableState<IntSize> mutableState2 = mutableState;
                return MagnifierKt.magnifier$default(companion, function1, null, 0.0f, textDefault, new Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt.selectionMagnifier.1.2.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m676invokeEaSLcWc(((DpSize) obj).getPackedValue());
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-EaSLcWc, reason: not valid java name */
                    public final void m676invokeEaSLcWc(long j) {
                        MutableState<IntSize> mutableState3 = mutableState2;
                        Density density3 = Density.this;
                        SelectionManager_androidKt$selectionMagnifier$1.m673invoke$lambda2(mutableState3, IntSizeKt.IntSize(density3.mo265roundToPx0680j_4(DpSize.m2538getWidthD9Ej5fM(j)), density3.mo265roundToPx0680j_4(DpSize.m2537getHeightD9Ej5fM(j))));
                    }
                }, 6, null);
            }
        });
        composer.endReplaceableGroup();
        return animatedSelectionMagnifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-2, reason: not valid java name */
    public static final void m673invoke$lambda2(MutableState mutableState, long j) {
        mutableState.setValue(IntSize.m2562boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1, reason: not valid java name */
    public static final long m672invoke$lambda1(MutableState mutableState) {
        return ((IntSize) mutableState.getValue()).getPackedValue();
    }
}
