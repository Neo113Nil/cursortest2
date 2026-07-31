package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TestModifierUpdater.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"TestModifierUpdaterLayout", "", "onAttached", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/TestModifierUpdater;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TestModifierUpdaterKt {
    public static final void TestModifierUpdaterLayout(final Function1 onAttached, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onAttached, "onAttached");
        Composer startRestartGroup = composer.startRestartGroup(-1673066036);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(onAttached) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1 testModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo37measure3p2s80s(MeasureScope MeasurePolicy, List list, long j) {
                    Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
                    Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
                    return MeasureScope.layout$default(MeasurePolicy, Constraints.m2487getMaxWidthimpl(j), Constraints.m2486getMaxHeightimpl(j), null, new Function1() { // from class: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1$measure$1
                        public final void invoke(@NotNull Placeable.PlacementScope layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Placeable.PlacementScope) obj);
                            return Unit.INSTANCE;
                        }
                    }, 4, null);
                }
            };
            final Function0 constructor$ui_release = LayoutNode.INSTANCE.getConstructor$ui_release();
            startRestartGroup.startReplaceableGroup(1886828752);
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(new Function0() { // from class: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$$inlined$ComposeNode$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* renamed from: invoke */
                    public final LayoutNode mo4828invoke() {
                        return Function0.this.mo4828invoke();
                    }
                });
            } else {
                startRestartGroup.useNode();
            }
            Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
            Updater.m1153setimpl(m1149constructorimpl, testModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1152initimpl(m1149constructorimpl, new Function1() { // from class: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((LayoutNode) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull LayoutNode init) {
                    Intrinsics.checkNotNullParameter(init, "$this$init");
                    Function1.this.invoke(new TestModifierUpdater(init));
                }
            });
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i3) {
                TestModifierUpdaterKt.TestModifierUpdaterLayout(Function1.this, composer2, i | 1);
            }
        });
    }
}
