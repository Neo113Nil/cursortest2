package androidx.compose.runtime;

import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import kotlin.Metadata;

/* compiled from: CompositionLocalMap.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/CompositionLocalMap;", "", "Companion", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CompositionLocalMap {

    /* compiled from: CompositionLocalMap.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/CompositionLocalMap$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/CompositionLocalMap;", "Empty", "Landroidx/compose/runtime/CompositionLocalMap;", "getEmpty", "()Landroidx/compose/runtime/CompositionLocalMap;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final CompositionLocalMap Empty = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();

        private Companion() {
        }
    }
}
