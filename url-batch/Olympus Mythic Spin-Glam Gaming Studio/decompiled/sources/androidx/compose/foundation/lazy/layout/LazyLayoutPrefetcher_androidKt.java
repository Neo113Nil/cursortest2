package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyLayoutPrefetcher.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"LazyLayoutPrefetcher", "", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "itemContentFactory", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "subcomposeLayoutState", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LazyLayoutPrefetcher_androidKt {
    public static final void LazyLayoutPrefetcher(final LazyLayoutPrefetchState prefetchState, final LazyLayoutItemContentFactory itemContentFactory, final SubcomposeLayoutState subcomposeLayoutState, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(prefetchState, "prefetchState");
        Intrinsics.checkNotNullParameter(itemContentFactory, "itemContentFactory");
        Intrinsics.checkNotNullParameter(subcomposeLayoutState, "subcomposeLayoutState");
        Composer startRestartGroup = composer.startRestartGroup(1113453182);
        View view = (View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
        int i2 = SubcomposeLayoutState.$stable;
        startRestartGroup.startReplaceableGroup(1618982084);
        boolean changed = startRestartGroup.changed(subcomposeLayoutState) | startRestartGroup.changed(prefetchState) | startRestartGroup.changed(view);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            startRestartGroup.updateRememberedValue(new LazyLayoutPrefetcher(prefetchState, subcomposeLayoutState, itemContentFactory, view));
        }
        startRestartGroup.endReplaceableGroup();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher_androidKt$LazyLayoutPrefetcher$2
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
                LazyLayoutPrefetcher_androidKt.LazyLayoutPrefetcher(LazyLayoutPrefetchState.this, itemContentFactory, subcomposeLayoutState, composer2, i | 1);
            }
        });
    }
}
