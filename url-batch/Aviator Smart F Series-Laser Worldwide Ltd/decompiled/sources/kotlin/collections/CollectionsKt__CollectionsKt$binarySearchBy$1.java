package kotlin.collections;

import kotlin.jvm.internal.Lambda;

/* JADX WARN: Incorrect field signature: TK; */
/* loaded from: classes4.dex */
public final class CollectionsKt__CollectionsKt$binarySearchBy$1 extends Lambda implements f6.l {
    final /* synthetic */ Comparable $key;
    final /* synthetic */ f6.l $selector;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lf6/l;TK;)V */
    public CollectionsKt__CollectionsKt$binarySearchBy$1(f6.l lVar, Comparable comparable) {
        super(1);
        this.$selector = lVar;
        this.$key = comparable;
    }

    @Override // f6.l
    public final Integer invoke(T t7) {
        int compareValues;
        compareValues = kotlin.comparisons.g.compareValues((Comparable) this.$selector.invoke(t7), this.$key);
        return Integer.valueOf(compareValues);
    }

    @Override // f6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((CollectionsKt__CollectionsKt$binarySearchBy$1) obj);
    }
}
