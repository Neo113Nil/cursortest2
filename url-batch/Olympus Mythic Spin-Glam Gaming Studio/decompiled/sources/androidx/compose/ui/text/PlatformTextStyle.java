package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidTextStyle.android.kt */
@ExperimentalTextApi
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/PlatformTextStyle;", "", "Landroidx/compose/ui/text/PlatformSpanStyle;", "spanStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "paragraphStyle", "<init>", "(Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/text/PlatformParagraphStyle;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/PlatformSpanStyle;", "getSpanStyle", "()Landroidx/compose/ui/text/PlatformSpanStyle;", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "getParagraphStyle", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PlatformTextStyle {

    /* renamed from: paragraphStyle, reason: from kotlin metadata and from toString */
    private final PlatformParagraphStyle paragraphSyle;
    private final PlatformSpanStyle spanStyle;

    /* renamed from: getParagraphStyle, reason: from getter */
    public final PlatformParagraphStyle getParagraphSyle() {
        return this.paragraphSyle;
    }

    public PlatformTextStyle(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        this.spanStyle = platformSpanStyle;
        this.paragraphSyle = platformParagraphStyle;
    }

    public int hashCode() {
        PlatformSpanStyle platformSpanStyle = this.spanStyle;
        int hashCode = (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.paragraphSyle;
        return hashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlatformTextStyle)) {
            return false;
        }
        PlatformTextStyle platformTextStyle = (PlatformTextStyle) other;
        return Intrinsics.areEqual(this.paragraphSyle, platformTextStyle.paragraphSyle) && Intrinsics.areEqual(this.spanStyle, platformTextStyle.spanStyle);
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.spanStyle + ", paragraphSyle=" + this.paragraphSyle + ')';
    }
}
