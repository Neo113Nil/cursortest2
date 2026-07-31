package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: DerivedState.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\"\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\" \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"T", "Lkotlin/Function0;", "calculation", "Landroidx/compose/runtime/State;", "derivedStateOf", "(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/DerivedStateObserver;", "derivedStateObservers", "()Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "Landroidx/compose/runtime/internal/IntRef;", "calculationBlockNestedLevel", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "runtime"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
/* loaded from: classes4.dex */
final /* synthetic */ class SnapshotStateKt__DerivedStateKt {
    private static final SnapshotThreadLocal calculationBlockNestedLevel = new SnapshotThreadLocal();
    private static final SnapshotThreadLocal derivedStateObservers = new SnapshotThreadLocal();

    public static final State derivedStateOf(Function0 function0) {
        return new DerivedSnapshotState(function0, null);
    }

    public static final MutableVector derivedStateObservers() {
        SnapshotThreadLocal snapshotThreadLocal = derivedStateObservers;
        MutableVector mutableVector = (MutableVector) snapshotThreadLocal.get();
        if (mutableVector != null) {
            return mutableVector;
        }
        MutableVector mutableVector2 = new MutableVector(new DerivedStateObserver[0], 0);
        snapshotThreadLocal.set(mutableVector2);
        return mutableVector2;
    }
}
