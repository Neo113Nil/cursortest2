package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextDrawStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import io.appmetrica.analytics.impl.M2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextStyle.kt */
@Immutable
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 s2\u00020\u0001:\u0001sB%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nBÚ\u0001\b\u0016\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*ø\u0001\u0000¢\u0006\u0004\b\b\u0010,J\u000f\u0010-\u001a\u00020\u0002H\u0007¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0004H\u0007¢\u0006\u0004\b/\u00100J\u001b\u00102\u001a\u00020\u00002\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b2\u00103J\u0017\u00102\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0004H\u0007¢\u0006\u0004\b2\u00104Já\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106J\u001a\u00109\u001a\u0002082\b\u00101\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\u0002082\u0006\u00101\u001a\u00020\u0000¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0017H\u0016¢\u0006\u0004\b@\u0010AR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010B\u001a\u0004\bC\u0010.R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bE\u00100R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010F\u001a\u0004\bG\u0010HR\u001c\u0010N\u001a\u0004\u0018\u00010I8GX\u0087\u0004¢\u0006\f\u0012\u0004\bL\u0010M\u001a\u0004\bJ\u0010KR\u001a\u0010\f\u001a\u00020\u000b8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bO\u0010PR\u001a\u0010\u000e\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bQ\u0010PR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bT\u0010UR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\bZ\u0010AR\u001a\u0010\u0019\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b[\u0010PR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u001a\u0010 \u001a\u00020\u000b8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bb\u0010PR\u0013\u0010\"\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0013\u0010$\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u001c\u0010&\u001a\u0004\u0018\u00010%8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bg\u0010hR\u001c\u0010(\u001a\u0004\u0018\u00010'8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bi\u0010jR\u001a\u0010)\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bk\u0010PR\u0013\u0010+\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\bl\u0010mR\u001c\u0010r\u001a\u0004\u0018\u00010n8GX\u0087\u0004¢\u0006\f\u0012\u0004\bq\u0010M\u001a\u0004\bo\u0010p\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006t"}, d2 = {"Landroidx/compose/ui/text/TextStyle;", "", "Landroidx/compose/ui/text/SpanStyle;", "spanStyle", "Landroidx/compose/ui/text/ParagraphStyle;", "paragraphStyle", "Landroidx/compose/ui/text/PlatformTextStyle;", "platformStyle", "<init>", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/ParagraphStyle;Landroidx/compose/ui/text/PlatformTextStyle;)V", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/ParagraphStyle;)V", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/unit/TextUnit;", "fontSize", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", M2.g, "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", "Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "lineHeight", "Landroidx/compose/ui/text/style/TextIndent;", "textIndent", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toSpanStyle", "()Landroidx/compose/ui/text/SpanStyle;", "toParagraphStyle", "()Landroidx/compose/ui/text/ParagraphStyle;", "other", "merge", "(Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/ui/text/TextStyle;", "(Landroidx/compose/ui/text/ParagraphStyle;)Landroidx/compose/ui/text/TextStyle;", "copy-HL5avdY", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/TextStyle;", "copy", "", "equals", "(Ljava/lang/Object;)Z", "hasSameLayoutAffectingAttributes", "(Landroidx/compose/ui/text/TextStyle;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/SpanStyle;", "getSpanStyle$ui_text_release", "Landroidx/compose/ui/text/ParagraphStyle;", "getParagraphStyle$ui_text_release", "Landroidx/compose/ui/text/PlatformTextStyle;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformTextStyle;", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "getBrush$annotations", "()V", "brush", "getColor-0d7_KjU", "()J", "getFontSize-XSAIIZE", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getFontStyle-4Lr2A7w", "()Landroidx/compose/ui/text/font/FontStyle;", "getFontSynthesis-ZQGJjVo", "()Landroidx/compose/ui/text/font/FontSynthesis;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontFeatureSettings", "getLetterSpacing-XSAIIZE", "getBaselineShift-5SSeXJ0", "()Landroidx/compose/ui/text/style/BaselineShift;", "getTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "getLocaleList", "()Landroidx/compose/ui/text/intl/LocaleList;", "getBackground-0d7_KjU", "getTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "getShadow", "()Landroidx/compose/ui/graphics/Shadow;", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "getLineHeight-XSAIIZE", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "Landroidx/compose/ui/text/style/LineHeightStyle;", "getLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "getLineHeightStyle$annotations", "lineHeightStyle", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TextStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final TextStyle Default = new TextStyle(0, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, 0, null, 262143, null);
    private final ParagraphStyle paragraphStyle;
    private final PlatformTextStyle platformStyle;
    private final SpanStyle spanStyle;

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, textAlign, textDirection, j5, textIndent);
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle) {
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        Intrinsics.checkNotNullParameter(paragraphStyle, "paragraphStyle");
        this.spanStyle = spanStyle;
        this.paragraphStyle = paragraphStyle;
        this.platformStyle = platformTextStyle;
    }

    /* renamed from: getSpanStyle$ui_text_release, reason: from getter */
    public final SpanStyle getSpanStyle() {
        return this.spanStyle;
    }

    /* renamed from: getParagraphStyle$ui_text_release, reason: from getter */
    public final ParagraphStyle getParagraphStyle() {
        return this.paragraphStyle;
    }

    public final PlatformTextStyle getPlatformStyle() {
        return this.platformStyle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        this(spanStyle, paragraphStyle, r0);
        PlatformTextStyle createPlatformTextStyleInternal;
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        Intrinsics.checkNotNullParameter(paragraphStyle, "paragraphStyle");
        createPlatformTextStyleInternal = TextStyleKt.createPlatformTextStyleInternal(spanStyle.getPlatformStyle(), paragraphStyle.getPlatformStyle());
    }

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Color.INSTANCE.m1461getUnspecified0d7_KjU() : j, (i & 2) != 0 ? TextUnit.INSTANCE.m2583getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & 128) != 0 ? TextUnit.INSTANCE.m2583getUnspecifiedXSAIIZE() : j3, (i & 256) != 0 ? null : baselineShift, (i & 512) != 0 ? null : textGeometricTransform, (i & 1024) != 0 ? null : localeList, (i & 2048) != 0 ? Color.INSTANCE.m1461getUnspecified0d7_KjU() : j4, (i & 4096) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, (i & 16384) != 0 ? null : textAlign, (i & 32768) != 0 ? null : textDirection, (i & 65536) != 0 ? TextUnit.INSTANCE.m2583getUnspecifiedXSAIIZE() : j5, (i & 131072) != 0 ? null : textIndent, null);
    }

    private TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent) {
        this(new SpanStyle(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, (PlatformSpanStyle) null, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign, textDirection, j5, textIndent, null, null, null), null);
    }

    public final SpanStyle toSpanStyle() {
        return this.spanStyle;
    }

    public final ParagraphStyle toParagraphStyle() {
        return this.paragraphStyle;
    }

    public final TextStyle merge(TextStyle other) {
        return (other == null || Intrinsics.areEqual(other, Default)) ? this : new TextStyle(toSpanStyle().merge(other.toSpanStyle()), toParagraphStyle().merge(other.toParagraphStyle()));
    }

    public final TextStyle merge(ParagraphStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new TextStyle(toSpanStyle(), toParagraphStyle().merge(other));
    }

    /* renamed from: copy-HL5avdY, reason: not valid java name */
    public final TextStyle m2257copyHL5avdY(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent) {
        TextDrawStyle m2464from8_81llA;
        if (Color.m1447equalsimpl0(color, this.spanStyle.m2225getColor0d7_KjU())) {
            m2464from8_81llA = this.spanStyle.getTextDrawStyle();
        } else {
            m2464from8_81llA = TextDrawStyle.INSTANCE.m2464from8_81llA(color);
        }
        return new TextStyle(new SpanStyle(m2464from8_81llA, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, this.spanStyle.getPlatformStyle(), (DefaultConstructorMarker) null), new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, this.paragraphStyle.getPlatformStyle(), getLineHeightStyle(), null), this.platformStyle);
    }

    public final Brush getBrush() {
        return this.spanStyle.getBrush();
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m2260getColor0d7_KjU() {
        return this.spanStyle.m2225getColor0d7_KjU();
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m2261getFontSizeXSAIIZE() {
        return this.spanStyle.getFontSize();
    }

    public final FontWeight getFontWeight() {
        return this.spanStyle.getFontWeight();
    }

    /* renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m2262getFontStyle4Lr2A7w() {
        return this.spanStyle.getFontStyle();
    }

    /* renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final FontSynthesis m2263getFontSynthesisZQGJjVo() {
        return this.spanStyle.getFontSynthesis();
    }

    public final FontFamily getFontFamily() {
        return this.spanStyle.getFontFamily();
    }

    public final String getFontFeatureSettings() {
        return this.spanStyle.getFontFeatureSettings();
    }

    /* renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m2264getLetterSpacingXSAIIZE() {
        return this.spanStyle.getLetterSpacing();
    }

    /* renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final BaselineShift m2259getBaselineShift5SSeXJ0() {
        return this.spanStyle.getBaselineShift();
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.spanStyle.getTextGeometricTransform();
    }

    public final LocaleList getLocaleList() {
        return this.spanStyle.getLocaleList();
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m2258getBackground0d7_KjU() {
        return this.spanStyle.getBackground();
    }

    public final TextDecoration getTextDecoration() {
        return this.spanStyle.getTextDecoration();
    }

    public final Shadow getShadow() {
        return this.spanStyle.getShadow();
    }

    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m2266getTextAlignbuA522U() {
        return this.paragraphStyle.getTextAlign();
    }

    /* renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final TextDirection m2267getTextDirectionmmuk1to() {
        return this.paragraphStyle.getTextDirection();
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2265getLineHeightXSAIIZE() {
        return this.paragraphStyle.getLineHeight();
    }

    public final TextIndent getTextIndent() {
        return this.paragraphStyle.getTextIndent();
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.paragraphStyle.getLineHeightStyle();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) other;
        return Intrinsics.areEqual(this.spanStyle, textStyle.spanStyle) && Intrinsics.areEqual(this.paragraphStyle, textStyle.paragraphStyle) && Intrinsics.areEqual(this.platformStyle, textStyle.platformStyle);
    }

    public final boolean hasSameLayoutAffectingAttributes(TextStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this == other || (Intrinsics.areEqual(this.paragraphStyle, other.paragraphStyle) && this.spanStyle.hasSameLayoutAffectingAttributes$ui_text_release(other.spanStyle));
    }

    public int hashCode() {
        int hashCode = ((this.spanStyle.hashCode() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return hashCode + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) Color.m1454toStringimpl(m2260getColor0d7_KjU())) + ", brush=" + getBrush() + ", fontSize=" + ((Object) TextUnit.m2581toStringimpl(m2261getFontSizeXSAIIZE())) + ", fontWeight=" + getFontWeight() + ", fontStyle=" + m2262getFontStyle4Lr2A7w() + ", fontSynthesis=" + m2263getFontSynthesisZQGJjVo() + ", fontFamily=" + getFontFamily() + ", fontFeatureSettings=" + getFontFeatureSettings() + ", letterSpacing=" + ((Object) TextUnit.m2581toStringimpl(m2264getLetterSpacingXSAIIZE())) + ", baselineShift=" + m2259getBaselineShift5SSeXJ0() + ", textGeometricTransform=" + getTextGeometricTransform() + ", localeList=" + getLocaleList() + ", background=" + ((Object) Color.m1454toStringimpl(m2258getBackground0d7_KjU())) + ", textDecoration=" + getTextDecoration() + ", shadow=" + getShadow() + ", textAlign=" + m2266getTextAlignbuA522U() + ", textDirection=" + m2267getTextDirectionmmuk1to() + ", lineHeight=" + ((Object) TextUnit.m2581toStringimpl(m2265getLineHeightXSAIIZE())) + ", textIndent=" + getTextIndent() + ", platformStyle=" + this.platformStyle + "lineHeightStyle=" + getLineHeightStyle() + ')';
    }

    /* compiled from: TextStyle.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/TextStyle$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/TextStyle;", "Default", "Landroidx/compose/ui/text/TextStyle;", "getDefault", "()Landroidx/compose/ui/text/TextStyle;", "getDefault$annotations", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TextStyle getDefault() {
            return TextStyle.Default;
        }
    }
}
