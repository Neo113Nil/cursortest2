package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Range;
import androidx.annotation.RequiresApi;
import j6.h;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class RangeKt {
    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> and(Range<T> range, Range<T> range2) {
        return range.intersect(range2);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, T t7) {
        return range.extend((Range<T>) t7);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> rangeTo(T t7, T t8) {
        return new Range<>(t7, t8);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> j6.h toClosedRange(final Range<T> range) {
        return new j6.h() { // from class: androidx.core.util.RangeKt$toClosedRange$1
            /* JADX WARN: Incorrect types in method signature: (TT;)Z */
            @Override // j6.h
            public boolean contains(Comparable comparable) {
                return h.a.contains(this, comparable);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // j6.h
            public Comparable getEndInclusive() {
                return range.getUpper();
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // j6.h
            public Comparable getStart() {
                return range.getLower();
            }

            @Override // j6.h
            public boolean isEmpty() {
                return h.a.isEmpty(this);
            }
        };
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> toRange(j6.h hVar) {
        return new Range<>(hVar.getStart(), hVar.getEndInclusive());
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, Range<T> range2) {
        return range.extend(range2);
    }
}
