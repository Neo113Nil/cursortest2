package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* compiled from: TextRange.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0007\u001a)\u0010\f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u0005\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"", "start", "end", "Landroidx/compose/ui/text/TextRange;", "TextRange", "(II)J", "index", "(I)J", "minimumValue", "maximumValue", "constrain-8ffj60Q", "(JII)J", "constrain", "", "packWithCheck", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TextRangeKt {
    public static final long TextRange(int i, int i2) {
        return TextRange.m2238constructorimpl(packWithCheck(i, i2));
    }

    public static final long TextRange(int i) {
        return TextRange(i, i);
    }

    /* renamed from: constrain-8ffj60Q, reason: not valid java name */
    public static final long m2255constrain8ffj60Q(long j, int i, int i2) {
        int coerceIn = RangesKt.coerceIn(TextRange.m2249getStartimpl(j), i, i2);
        int coerceIn2 = RangesKt.coerceIn(TextRange.m2244getEndimpl(j), i, i2);
        return (coerceIn == TextRange.m2249getStartimpl(j) && coerceIn2 == TextRange.m2244getEndimpl(j)) ? j : TextRange(coerceIn, coerceIn2);
    }

    private static final long packWithCheck(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i + ']').toString());
        }
        if (i2 >= 0) {
            return (i2 & 4294967295L) | (i << 32);
        }
        throw new IllegalArgumentException(("end cannot negative. [end: " + i2 + ']').toString());
    }
}
