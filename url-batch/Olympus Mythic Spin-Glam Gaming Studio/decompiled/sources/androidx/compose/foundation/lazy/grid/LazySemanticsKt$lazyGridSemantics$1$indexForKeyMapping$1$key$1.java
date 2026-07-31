package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazySemantics.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class LazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1$key$1 extends FunctionReferenceImpl implements Function1 {
    LazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1$key$1(Object obj) {
        super(1, obj, LazyGridItemProvider.class, "getKey", "getKey(I)Ljava/lang/Object;", 0);
    }

    @NotNull
    public final Object invoke(int i) {
        return ((LazyGridItemProvider) this.receiver).getKey(i);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
