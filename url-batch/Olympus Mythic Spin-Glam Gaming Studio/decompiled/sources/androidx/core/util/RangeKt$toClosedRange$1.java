package androidx.core.util;

import android.util.Range;
import kotlin.Metadata;
import kotlin.ranges.ClosedRange;

/* compiled from: Range.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001R\u001c\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00018\u00008\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0002*\u0004\u0018\u00018\u00008\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"androidx/core/util/RangeKt$toClosedRange$1", "Lkotlin/ranges/ClosedRange;", "kotlin.jvm.PlatformType", "getEndInclusive", "()Ljava/lang/Comparable;", "endInclusive", "getStart", "start", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RangeKt$toClosedRange$1 implements ClosedRange {
    final /* synthetic */ Range $this_toClosedRange;

    @Override // kotlin.ranges.ClosedRange
    public boolean contains(Comparable comparable) {
        return ClosedRange.DefaultImpls.contains(this, comparable);
    }

    @Override // kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return ClosedRange.DefaultImpls.isEmpty(this);
    }

    @Override // kotlin.ranges.ClosedRange
    public Comparable getEndInclusive() {
        return this.$this_toClosedRange.getUpper();
    }

    @Override // kotlin.ranges.ClosedRange
    public Comparable getStart() {
        return this.$this_toClosedRange.getLower();
    }
}
