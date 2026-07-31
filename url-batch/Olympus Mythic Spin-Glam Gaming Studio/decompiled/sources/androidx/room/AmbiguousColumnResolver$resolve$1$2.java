package androidx.room;

import androidx.room.AmbiguousColumnResolver;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* compiled from: AmbiguousColumnResolver.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "indices", "", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
final class AmbiguousColumnResolver$resolve$1$2 extends Lambda implements Function1 {
    final /* synthetic */ int $mappingIndex;
    final /* synthetic */ List<List<AmbiguousColumnResolver.Match>> $mappingMatches;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AmbiguousColumnResolver$resolve$1$2(List<? extends List<AmbiguousColumnResolver.Match>> list, int i) {
        super(1);
        this.$mappingMatches = list;
        this.$mappingIndex = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<Integer>) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull List<Integer> indices) {
        Intrinsics.checkNotNullParameter(indices, "indices");
        List<Integer> list = indices;
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int intValue = ((Number) it.next()).intValue();
        while (it.hasNext()) {
            int intValue2 = ((Number) it.next()).intValue();
            if (intValue > intValue2) {
                intValue = intValue2;
            }
        }
        Iterator<T> it2 = list.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        int intValue3 = ((Number) it2.next()).intValue();
        while (it2.hasNext()) {
            int intValue4 = ((Number) it2.next()).intValue();
            if (intValue3 < intValue4) {
                intValue3 = intValue4;
            }
        }
        this.$mappingMatches.get(this.$mappingIndex).add(new AmbiguousColumnResolver.Match(new IntRange(intValue, intValue3), indices));
    }
}
