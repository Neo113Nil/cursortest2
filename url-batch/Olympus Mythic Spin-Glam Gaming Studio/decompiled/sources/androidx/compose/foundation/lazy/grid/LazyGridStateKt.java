package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyGridState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"rememberLazyGridState", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "initialFirstVisibleItemIndex", "", "initialFirstVisibleItemScrollOffset", "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/grid/LazyGridState;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LazyGridStateKt {
    public static final LazyGridState rememberLazyGridState(final int i, final int i2, Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(29186956);
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        LazyGridState lazyGridState = (LazyGridState) RememberSaveableKt.rememberSaveable(new Object[0], LazyGridState.INSTANCE.getSaver(), null, new Function0() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$rememberLazyGridState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final LazyGridState mo4828invoke() {
                return new LazyGridState(i, i2);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return lazyGridState;
    }
}
