package androidx.compose.ui.text.platform.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SpannableExtensions.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/platform/extensions/SpanRange;", "", "span", "", "start", "end", "<init>", "(Ljava/lang/Object;II)V", "component1", "()Ljava/lang/Object;", "component2", "()I", "component3", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getSpan", "I", "getStart", "getEnd", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* data */ class SpanRange {
    private final int end;
    private final Object span;
    private final int start;

    /* renamed from: component1, reason: from getter */
    public final Object getSpan() {
        return this.span;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* renamed from: component3, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpanRange)) {
            return false;
        }
        SpanRange spanRange = (SpanRange) other;
        return Intrinsics.areEqual(this.span, spanRange.span) && this.start == spanRange.start && this.end == spanRange.end;
    }

    public int hashCode() {
        return (((this.span.hashCode() * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end);
    }

    public String toString() {
        return "SpanRange(span=" + this.span + ", start=" + this.start + ", end=" + this.end + ')';
    }

    public SpanRange(Object span, int i, int i2) {
        Intrinsics.checkNotNullParameter(span, "span");
        this.span = span;
        this.start = i;
        this.end = i2;
    }
}
