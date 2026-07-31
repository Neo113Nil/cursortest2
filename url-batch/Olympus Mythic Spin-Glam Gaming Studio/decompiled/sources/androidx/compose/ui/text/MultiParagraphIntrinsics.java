package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MultiParagraphIntrinsics.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR \u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "Landroidx/compose/ui/text/ParagraphStyle;", "defaultStyle", "resolveTextDirection", "(Landroidx/compose/ui/text/ParagraphStyle;Landroidx/compose/ui/text/ParagraphStyle;)Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/AnnotatedString;", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "Ljava/util/List;", "getPlaceholders", "()Ljava/util/List;", "", "minIntrinsicWidth$delegate", "Lkotlin/Lazy;", "getMinIntrinsicWidth", "()F", "minIntrinsicWidth", "maxIntrinsicWidth$delegate", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "Landroidx/compose/ui/text/ParagraphIntrinsicInfo;", "infoList", "getInfoList$ui_text_release", "", "getHasStaleResolvedFonts", "()Z", "hasStaleResolvedFonts", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MultiParagraphIntrinsics implements ParagraphIntrinsics {
    private final AnnotatedString annotatedString;
    private final List infoList;

    /* renamed from: maxIntrinsicWidth$delegate, reason: from kotlin metadata */
    private final Lazy maxIntrinsicWidth;

    /* renamed from: minIntrinsicWidth$delegate, reason: from kotlin metadata */
    private final Lazy minIntrinsicWidth;
    private final List placeholders;

    public MultiParagraphIntrinsics(AnnotatedString annotatedString, TextStyle style, List placeholders, Density density, FontFamily.Resolver fontFamilyResolver) {
        AnnotatedString substringWithoutParagraphStyles;
        List localPlaceholders;
        AnnotatedString annotatedString2 = annotatedString;
        Intrinsics.checkNotNullParameter(annotatedString2, "annotatedString");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        this.annotatedString = annotatedString2;
        this.placeholders = placeholders;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.minIntrinsicWidth = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$minIntrinsicWidth$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final Float mo4828invoke() {
                Object obj;
                ParagraphIntrinsics intrinsics;
                List infoList = MultiParagraphIntrinsics.this.getInfoList();
                if (infoList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj2 = infoList.get(0);
                    float minIntrinsicWidth = ((ParagraphIntrinsicInfo) obj2).getIntrinsics().getMinIntrinsicWidth();
                    int lastIndex = CollectionsKt.getLastIndex(infoList);
                    int i = 1;
                    if (1 <= lastIndex) {
                        while (true) {
                            Object obj3 = infoList.get(i);
                            float minIntrinsicWidth2 = ((ParagraphIntrinsicInfo) obj3).getIntrinsics().getMinIntrinsicWidth();
                            if (Float.compare(minIntrinsicWidth, minIntrinsicWidth2) < 0) {
                                obj2 = obj3;
                                minIntrinsicWidth = minIntrinsicWidth2;
                            }
                            if (i == lastIndex) {
                                break;
                            }
                            i++;
                        }
                    }
                    obj = obj2;
                }
                ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) obj;
                return Float.valueOf((paragraphIntrinsicInfo == null || (intrinsics = paragraphIntrinsicInfo.getIntrinsics()) == null) ? 0.0f : intrinsics.getMinIntrinsicWidth());
            }
        });
        this.maxIntrinsicWidth = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$maxIntrinsicWidth$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final Float mo4828invoke() {
                Object obj;
                ParagraphIntrinsics intrinsics;
                List infoList = MultiParagraphIntrinsics.this.getInfoList();
                if (infoList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj2 = infoList.get(0);
                    float maxIntrinsicWidth = ((ParagraphIntrinsicInfo) obj2).getIntrinsics().getMaxIntrinsicWidth();
                    int lastIndex = CollectionsKt.getLastIndex(infoList);
                    int i = 1;
                    if (1 <= lastIndex) {
                        while (true) {
                            Object obj3 = infoList.get(i);
                            float maxIntrinsicWidth2 = ((ParagraphIntrinsicInfo) obj3).getIntrinsics().getMaxIntrinsicWidth();
                            if (Float.compare(maxIntrinsicWidth, maxIntrinsicWidth2) < 0) {
                                obj2 = obj3;
                                maxIntrinsicWidth = maxIntrinsicWidth2;
                            }
                            if (i == lastIndex) {
                                break;
                            }
                            i++;
                        }
                    }
                    obj = obj2;
                }
                ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) obj;
                return Float.valueOf((paragraphIntrinsicInfo == null || (intrinsics = paragraphIntrinsicInfo.getIntrinsics()) == null) ? 0.0f : intrinsics.getMaxIntrinsicWidth());
            }
        });
        ParagraphStyle paragraphStyle = style.toParagraphStyle();
        List normalizedParagraphStyles = AnnotatedStringKt.normalizedParagraphStyles(annotatedString2, paragraphStyle);
        ArrayList arrayList = new ArrayList(normalizedParagraphStyles.size());
        int size = normalizedParagraphStyles.size();
        int i = 0;
        while (i < size) {
            AnnotatedString.Range range = (AnnotatedString.Range) normalizedParagraphStyles.get(i);
            substringWithoutParagraphStyles = AnnotatedStringKt.substringWithoutParagraphStyles(annotatedString2, range.getStart(), range.getEnd());
            ParagraphStyle resolveTextDirection = resolveTextDirection((ParagraphStyle) range.getItem(), paragraphStyle);
            String text = substringWithoutParagraphStyles.getText();
            TextStyle merge = style.merge(resolveTextDirection);
            List spanStyles = substringWithoutParagraphStyles.getSpanStyles();
            localPlaceholders = MultiParagraphIntrinsicsKt.getLocalPlaceholders(getPlaceholders(), range.getStart(), range.getEnd());
            arrayList.add(new ParagraphIntrinsicInfo(ParagraphIntrinsicsKt.ParagraphIntrinsics(text, merge, spanStyles, localPlaceholders, density, fontFamilyResolver), range.getStart(), range.getEnd()));
            i++;
            annotatedString2 = annotatedString;
        }
        this.infoList = arrayList;
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final List getPlaceholders() {
        return this.placeholders;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return ((Number) this.minIntrinsicWidth.getValue()).floatValue();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return ((Number) this.maxIntrinsicWidth.getValue()).floatValue();
    }

    /* renamed from: getInfoList$ui_text_release, reason: from getter */
    public final List getInfoList() {
        return this.infoList;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public boolean getHasStaleResolvedFonts() {
        List list = this.infoList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((ParagraphIntrinsicInfo) list.get(i)).getIntrinsics().getHasStaleResolvedFonts()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParagraphStyle resolveTextDirection(ParagraphStyle style, ParagraphStyle defaultStyle) {
        TextDirection textDirection = style.getTextDirection();
        if (textDirection == null) {
            return ParagraphStyle.m2190copyElsmlbk$default(style, null, defaultStyle.getTextDirection(), 0L, null, 13, null);
        }
        textDirection.getValue();
        return style;
    }
}
