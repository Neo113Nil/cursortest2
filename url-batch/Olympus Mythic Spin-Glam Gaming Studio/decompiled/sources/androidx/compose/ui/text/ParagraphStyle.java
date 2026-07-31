package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ParagraphStyle.kt */
@Immutable
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BR\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\fø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fB:\b\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0010J\u001b\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0015JA\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R \u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0007¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u00103\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/ui/text/ParagraphStyle;", "", "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", "Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "Landroidx/compose/ui/unit/TextUnit;", "lineHeight", "Landroidx/compose/ui/text/style/TextIndent;", "textIndent", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "platformStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineHeightStyle", "<init>", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "mergePlatformStyle", "(Landroidx/compose/ui/text/PlatformParagraphStyle;)Landroidx/compose/ui/text/PlatformParagraphStyle;", "merge", "(Landroidx/compose/ui/text/ParagraphStyle;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-Elsmlbk", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/ParagraphStyle;", "copy", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/style/TextAlign;", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "Landroidx/compose/ui/text/style/TextDirection;", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "J", "getLineHeight-XSAIIZE", "()J", "Landroidx/compose/ui/text/style/TextIndent;", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", "Landroidx/compose/ui/text/style/LineHeightStyle;", "getLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ParagraphStyle {
    private final long lineHeight;
    private final LineHeightStyle lineHeightStyle;
    private final PlatformParagraphStyle platformStyle;
    private final TextAlign textAlign;
    private final TextDirection textDirection;
    private final TextIndent textIndent;

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j, textIndent, platformParagraphStyle, lineHeightStyle);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j, textIndent);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        this.textAlign = textAlign;
        this.textDirection = textDirection;
        this.lineHeight = j;
        this.textIndent = textIndent;
        this.platformStyle = platformParagraphStyle;
        this.lineHeightStyle = lineHeightStyle;
        if (TextUnit.m2576equalsimpl0(j, TextUnit.INSTANCE.m2583getUnspecifiedXSAIIZE()) || TextUnit.m2579getValueimpl(j) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + TextUnit.m2579getValueimpl(j) + ')').toString());
    }

    /* renamed from: getTextAlign-buA522U, reason: not valid java name and from getter */
    public final TextAlign getTextAlign() {
        return this.textAlign;
    }

    /* renamed from: getTextDirection-mmuk1to, reason: not valid java name and from getter */
    public final TextDirection getTextDirection() {
        return this.textDirection;
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name and from getter */
    public final long getLineHeight() {
        return this.lineHeight;
    }

    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    public final PlatformParagraphStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent) {
        this(textAlign, textDirection, j, textIndent, null, null, null);
    }

    public final ParagraphStyle merge(ParagraphStyle other) {
        long j;
        if (other == null) {
            return this;
        }
        if (TextUnitKt.m2587isUnspecifiedR2X_6o(other.lineHeight)) {
            j = this.lineHeight;
        } else {
            j = other.lineHeight;
        }
        long j2 = j;
        TextIndent textIndent = other.textIndent;
        if (textIndent == null) {
            textIndent = this.textIndent;
        }
        TextIndent textIndent2 = textIndent;
        TextAlign textAlign = other.textAlign;
        if (textAlign == null) {
            textAlign = this.textAlign;
        }
        TextAlign textAlign2 = textAlign;
        TextDirection textDirection = other.textDirection;
        if (textDirection == null) {
            textDirection = this.textDirection;
        }
        TextDirection textDirection2 = textDirection;
        PlatformParagraphStyle mergePlatformStyle = mergePlatformStyle(other.platformStyle);
        LineHeightStyle lineHeightStyle = other.lineHeightStyle;
        if (lineHeightStyle == null) {
            lineHeightStyle = this.lineHeightStyle;
        }
        return new ParagraphStyle(textAlign2, textDirection2, j2, textIndent2, mergePlatformStyle, lineHeightStyle, null);
    }

    private final PlatformParagraphStyle mergePlatformStyle(PlatformParagraphStyle other) {
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        return platformParagraphStyle == null ? other : other == null ? platformParagraphStyle : platformParagraphStyle.merge(other);
    }

    /* renamed from: copy-Elsmlbk$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m2190copyElsmlbk$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, int i, Object obj) {
        if ((i & 1) != 0) {
            textAlign = paragraphStyle.textAlign;
        }
        if ((i & 2) != 0) {
            textDirection = paragraphStyle.textDirection;
        }
        TextDirection textDirection2 = textDirection;
        if ((i & 4) != 0) {
            j = paragraphStyle.lineHeight;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        return paragraphStyle.m2191copyElsmlbk(textAlign, textDirection2, j2, textIndent);
    }

    /* renamed from: copy-Elsmlbk, reason: not valid java name */
    public final ParagraphStyle m2191copyElsmlbk(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent) {
        return new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, this.platformStyle, this.lineHeightStyle, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) other;
        return Intrinsics.areEqual(this.textAlign, paragraphStyle.textAlign) && Intrinsics.areEqual(this.textDirection, paragraphStyle.textDirection) && TextUnit.m2576equalsimpl0(this.lineHeight, paragraphStyle.lineHeight) && Intrinsics.areEqual(this.textIndent, paragraphStyle.textIndent) && Intrinsics.areEqual(this.platformStyle, paragraphStyle.platformStyle) && Intrinsics.areEqual(this.lineHeightStyle, paragraphStyle.lineHeightStyle);
    }

    public int hashCode() {
        TextAlign textAlign = this.textAlign;
        int m2443hashCodeimpl = (textAlign != null ? TextAlign.m2443hashCodeimpl(textAlign.getValue()) : 0) * 31;
        TextDirection textDirection = this.textDirection;
        int m2456hashCodeimpl = (((m2443hashCodeimpl + (textDirection != null ? TextDirection.m2456hashCodeimpl(textDirection.getValue()) : 0)) * 31) + TextUnit.m2580hashCodeimpl(this.lineHeight)) * 31;
        TextIndent textIndent = this.textIndent;
        int hashCode = (m2456hashCodeimpl + (textIndent != null ? textIndent.hashCode() : 0)) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        int hashCode2 = (hashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0)) * 31;
        LineHeightStyle lineHeightStyle = this.lineHeightStyle;
        return hashCode2 + (lineHeightStyle != null ? lineHeightStyle.hashCode() : 0);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + this.textAlign + ", textDirection=" + this.textDirection + ", lineHeight=" + ((Object) TextUnit.m2581toStringimpl(this.lineHeight)) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ')';
    }
}
