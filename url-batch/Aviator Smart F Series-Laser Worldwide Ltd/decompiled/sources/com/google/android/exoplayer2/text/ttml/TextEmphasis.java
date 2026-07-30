package com.google.android.exoplayer2.text.ttml;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

@Deprecated
/* loaded from: classes3.dex */
final class TextEmphasis {
    public static final int MARK_SHAPE_AUTO = -1;
    public static final int POSITION_OUTSIDE = -2;
    public final int markFill;
    public final int markShape;
    public final int position;
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");
    private static final ImmutableSet<String> SINGLE_STYLE_VALUES = ImmutableSet.of(TtmlNode.TEXT_EMPHASIS_AUTO, "none");
    private static final ImmutableSet<String> MARK_SHAPE_VALUES = ImmutableSet.of(TtmlNode.TEXT_EMPHASIS_MARK_DOT, TtmlNode.TEXT_EMPHASIS_MARK_SESAME, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
    private static final ImmutableSet<String> MARK_FILL_VALUES = ImmutableSet.of(TtmlNode.TEXT_EMPHASIS_MARK_FILLED, "open");
    private static final ImmutableSet<String> POSITION_VALUES = ImmutableSet.of(TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    private TextEmphasis(int i8, int i9, int i10) {
        this.markShape = i8;
        this.markFill = i9;
        this.position = i10;
    }

    @Nullable
    public static TextEmphasis parse(@Nullable String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        return parseWords(ImmutableSet.copyOf(TextUtils.split(lowerCase, WHITESPACE_PATTERN)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
    
        if (r9.equals(com.google.android.exoplayer2.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_DOT) != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static TextEmphasis parseWords(ImmutableSet<String> immutableSet) {
        char c8;
        int i8;
        int hashCode;
        String str = (String) Iterables.getFirst(Sets.intersection(POSITION_VALUES, immutableSet), TtmlNode.ANNOTATION_POSITION_OUTSIDE);
        int hashCode2 = str.hashCode();
        char c9 = 0;
        int i9 = -1;
        if (hashCode2 == -1392885889) {
            if (str.equals(TtmlNode.ANNOTATION_POSITION_BEFORE)) {
                c8 = 2;
            }
            c8 = 65535;
        } else if (hashCode2 != -1106037339) {
            if (hashCode2 == 92734940 && str.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                c8 = 0;
            }
            c8 = 65535;
        } else {
            if (str.equals(TtmlNode.ANNOTATION_POSITION_OUTSIDE)) {
                c8 = 1;
            }
            c8 = 65535;
        }
        int i10 = c8 != 0 ? c8 != 1 ? 1 : -2 : 2;
        Sets.SetView intersection = Sets.intersection(SINGLE_STYLE_VALUES, immutableSet);
        if (!intersection.isEmpty()) {
            String str2 = (String) intersection.iterator().next();
            int hashCode3 = str2.hashCode();
            if (hashCode3 == 3005871) {
                str2.equals(TtmlNode.TEXT_EMPHASIS_AUTO);
            } else if (hashCode3 == 3387192 && str2.equals("none")) {
                i9 = 0;
            }
            return new TextEmphasis(i9, 0, i10);
        }
        Sets.SetView intersection2 = Sets.intersection(MARK_FILL_VALUES, immutableSet);
        Sets.SetView intersection3 = Sets.intersection(MARK_SHAPE_VALUES, immutableSet);
        if (intersection2.isEmpty() && intersection3.isEmpty()) {
            return new TextEmphasis(-1, 0, i10);
        }
        String str3 = (String) Iterables.getFirst(intersection2, TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        int hashCode4 = str3.hashCode();
        if (hashCode4 == -1274499742) {
            str3.equals(TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        } else if (hashCode4 == 3417674 && str3.equals("open")) {
            i8 = 2;
            String str4 = (String) Iterables.getFirst(intersection3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
            hashCode = str4.hashCode();
            if (hashCode != -1360216880) {
                if (str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE)) {
                    c9 = 2;
                }
                c9 = 65535;
            } else if (hashCode != -905816648) {
                if (hashCode == 99657) {
                }
                c9 = 65535;
            } else {
                if (str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                    c9 = 1;
                }
                c9 = 65535;
            }
            return new TextEmphasis(c9 != 0 ? c9 != 1 ? 1 : 3 : 2, i8, i10);
        }
        i8 = 1;
        String str42 = (String) Iterables.getFirst(intersection3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
        hashCode = str42.hashCode();
        if (hashCode != -1360216880) {
        }
        return new TextEmphasis(c9 != 0 ? c9 != 1 ? 1 : 3 : 2, i8, i10);
    }
}
