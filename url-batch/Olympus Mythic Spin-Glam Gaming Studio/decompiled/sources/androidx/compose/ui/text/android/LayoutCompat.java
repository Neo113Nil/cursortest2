package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LayoutCompat.kt */
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u000e\u000f\u0010\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/android/LayoutCompat;", "", "<init>", "()V", "Landroid/text/Layout$Alignment;", "DEFAULT_LAYOUT_ALIGNMENT", "Landroid/text/Layout$Alignment;", "getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release", "()Landroid/text/Layout$Alignment;", "Landroid/text/TextDirectionHeuristic;", "DEFAULT_TEXT_DIRECTION_HEURISTIC", "Landroid/text/TextDirectionHeuristic;", "getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release", "()Landroid/text/TextDirectionHeuristic;", "BreakStrategy", "HyphenationFrequency", "JustificationMode", "TextDirection", "TextLayoutAlignment", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LayoutCompat {
    private static final TextDirectionHeuristic DEFAULT_TEXT_DIRECTION_HEURISTIC;
    public static final LayoutCompat INSTANCE = new LayoutCompat();
    private static final Layout.Alignment DEFAULT_LAYOUT_ALIGNMENT = Layout.Alignment.ALIGN_NORMAL;

    /* compiled from: LayoutCompat.kt */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$BreakStrategy;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public @interface BreakStrategy {
    }

    /* compiled from: LayoutCompat.kt */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$HyphenationFrequency;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public @interface HyphenationFrequency {
    }

    /* compiled from: LayoutCompat.kt */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$JustificationMode;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public @interface JustificationMode {
    }

    /* compiled from: LayoutCompat.kt */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$TextDirection;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public @interface TextDirection {
    }

    /* compiled from: LayoutCompat.kt */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$TextLayoutAlignment;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public @interface TextLayoutAlignment {
    }

    private LayoutCompat() {
    }

    static {
        TextDirectionHeuristic FIRSTSTRONG_LTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        Intrinsics.checkNotNullExpressionValue(FIRSTSTRONG_LTR, "FIRSTSTRONG_LTR");
        DEFAULT_TEXT_DIRECTION_HEURISTIC = FIRSTSTRONG_LTR;
    }
}
