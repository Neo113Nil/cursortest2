package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010(\u001a\u00020'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0018R\u001a\u00105\u001a\u0002048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0014\u0010B\u001a\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Landroidx/compose/ui/text/TextStyle;", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", "Ljava/util/List;", "getSpanStyles", "()Ljava/util/List;", "getPlaceholders", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "textPaint", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release", "()Landroidx/compose/ui/text/platform/AndroidTextPaint;", "", "charSequence", "Ljava/lang/CharSequence;", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "layoutIntrinsics", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "getLayoutIntrinsics$ui_text_release", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "", "Landroidx/compose/ui/text/platform/TypefaceDirtyTracker;", "resolvedTypefaces", "", "textDirectionHeuristic", "I", "getTextDirectionHeuristic$ui_text_release", "()I", "", "getMaxIntrinsicWidth", "()F", "maxIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth", "", "getHasStaleResolvedFonts", "()Z", "hasStaleResolvedFonts", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AndroidParagraphIntrinsics implements ParagraphIntrinsics {
    private final CharSequence charSequence;
    private final Density density;
    private final FontFamily.Resolver fontFamilyResolver;
    private final LayoutIntrinsics layoutIntrinsics;
    private final List placeholders;
    private final List resolvedTypefaces;
    private final List spanStyles;
    private final TextStyle style;
    private final String text;
    private final int textDirectionHeuristic;
    private final AndroidTextPaint textPaint;

    public AndroidParagraphIntrinsics(String text, TextStyle style, List spanStyles, List placeholders, FontFamily.Resolver fontFamilyResolver, Density density) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(density, "density");
        this.text = text;
        this.style = style;
        this.spanStyles = spanStyles;
        this.placeholders = placeholders;
        this.fontFamilyResolver = fontFamilyResolver;
        this.density = density;
        AndroidTextPaint androidTextPaint = new AndroidTextPaint(1, density.getDensity());
        this.textPaint = androidTextPaint;
        this.resolvedTypefaces = new ArrayList();
        int m2393resolveTextDirectionHeuristics9GRLPo0 = AndroidParagraphIntrinsics_androidKt.m2393resolveTextDirectionHeuristics9GRLPo0(style.m2267getTextDirectionmmuk1to(), style.getLocaleList());
        this.textDirectionHeuristic = m2393resolveTextDirectionHeuristics9GRLPo0;
        Function4 function4 = new Function4() { // from class: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics$resolveTypeface$1
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return m2392invokeDPcqOEQ((FontFamily) obj, (FontWeight) obj2, ((FontStyle) obj3).getValue(), ((FontSynthesis) obj4).getValue());
            }

            @NotNull
            /* renamed from: invoke-DPcqOEQ, reason: not valid java name */
            public final Typeface m2392invokeDPcqOEQ(@Nullable FontFamily fontFamily, @NotNull FontWeight fontWeight, int i, int i2) {
                List list;
                Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
                TypefaceDirtyTracker typefaceDirtyTracker = new TypefaceDirtyTracker(AndroidParagraphIntrinsics.this.getFontFamilyResolver().mo2288resolveDPcqOEQ(fontFamily, fontWeight, i, i2));
                list = AndroidParagraphIntrinsics.this.resolvedTypefaces;
                list.add(typefaceDirtyTracker);
                return typefaceDirtyTracker.getTypeface();
            }
        };
        CharSequence createCharSequence = AndroidParagraphHelper_androidKt.createCharSequence(text, androidTextPaint.getTextSize(), style, CollectionsKt.plus((Collection) CollectionsKt.listOf(new AnnotatedString.Range(TextPaintExtensions_androidKt.applySpanStyle(androidTextPaint, style.toSpanStyle(), function4, density), 0, text.length())), (Iterable) spanStyles), placeholders, density, function4);
        this.charSequence = createCharSequence;
        this.layoutIntrinsics = new LayoutIntrinsics(createCharSequence, androidTextPaint, m2393resolveTextDirectionHeuristics9GRLPo0);
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    /* renamed from: getTextPaint$ui_text_release, reason: from getter */
    public final AndroidTextPaint getTextPaint() {
        return this.textPaint;
    }

    /* renamed from: getCharSequence$ui_text_release, reason: from getter */
    public final CharSequence getCharSequence() {
        return this.charSequence;
    }

    /* renamed from: getLayoutIntrinsics$ui_text_release, reason: from getter */
    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public boolean getHasStaleResolvedFonts() {
        List list = this.resolvedTypefaces;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((TypefaceDirtyTracker) list.get(i)).isStaleResolvedFont()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getTextDirectionHeuristic$ui_text_release, reason: from getter */
    public final int getTextDirectionHeuristic() {
        return this.textDirectionHeuristic;
    }
}
