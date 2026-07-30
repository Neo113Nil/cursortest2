package com.google.android.exoplayer2.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.baidu.ar.util.SystemInfoUtil;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.primitives.Ints;
import com.realsil.sdk.dfu.i.a;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Deprecated
/* loaded from: classes3.dex */
final class SsaStyle {
    public static final int SSA_ALIGNMENT_BOTTOM_CENTER = 2;
    public static final int SSA_ALIGNMENT_BOTTOM_LEFT = 1;
    public static final int SSA_ALIGNMENT_BOTTOM_RIGHT = 3;
    public static final int SSA_ALIGNMENT_MIDDLE_CENTER = 5;
    public static final int SSA_ALIGNMENT_MIDDLE_LEFT = 4;
    public static final int SSA_ALIGNMENT_MIDDLE_RIGHT = 6;
    public static final int SSA_ALIGNMENT_TOP_CENTER = 8;
    public static final int SSA_ALIGNMENT_TOP_LEFT = 7;
    public static final int SSA_ALIGNMENT_TOP_RIGHT = 9;
    public static final int SSA_ALIGNMENT_UNKNOWN = -1;
    public static final int SSA_BORDER_STYLE_BOX = 3;
    public static final int SSA_BORDER_STYLE_OUTLINE = 1;
    public static final int SSA_BORDER_STYLE_UNKNOWN = -1;
    private static final String TAG = "SsaStyle";
    public final int alignment;
    public final boolean bold;
    public final int borderStyle;
    public final float fontSize;
    public final boolean italic;
    public final String name;

    @Nullable
    @ColorInt
    public final Integer outlineColor;

    @Nullable
    @ColorInt
    public final Integer primaryColor;
    public final boolean strikeout;
    public final boolean underline;

    static final class Format {
        public final int alignmentIndex;
        public final int boldIndex;
        public final int borderStyleIndex;
        public final int fontSizeIndex;
        public final int italicIndex;
        public final int length;
        public final int nameIndex;
        public final int outlineColorIndex;
        public final int primaryColorIndex;
        public final int strikeoutIndex;
        public final int underlineIndex;

        private Format(int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.nameIndex = i8;
            this.alignmentIndex = i9;
            this.primaryColorIndex = i10;
            this.outlineColorIndex = i11;
            this.fontSizeIndex = i12;
            this.boldIndex = i13;
            this.italicIndex = i14;
            this.underlineIndex = i15;
            this.strikeoutIndex = i16;
            this.borderStyleIndex = i17;
            this.length = i18;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Nullable
        public static Format fromFormatLine(String str) {
            char c8;
            String[] split = TextUtils.split(str.substring(7), SystemInfoUtil.COMMA);
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            for (int i18 = 0; i18 < split.length; i18++) {
                String lowerCase = Ascii.toLowerCase(split[i18].trim());
                lowerCase.hashCode();
                switch (lowerCase.hashCode()) {
                    case -1178781136:
                        if (lowerCase.equals(TtmlNode.ITALIC)) {
                            c8 = 0;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case -1026963764:
                        if (lowerCase.equals(TtmlNode.UNDERLINE)) {
                            c8 = 1;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case -192095652:
                        if (lowerCase.equals("strikeout")) {
                            c8 = 2;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case -70925746:
                        if (lowerCase.equals("primarycolour")) {
                            c8 = 3;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 3029637:
                        if (lowerCase.equals(TtmlNode.BOLD)) {
                            c8 = 4;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 3373707:
                        if (lowerCase.equals("name")) {
                            c8 = 5;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 366554320:
                        if (lowerCase.equals("fontsize")) {
                            c8 = 6;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 767321349:
                        if (lowerCase.equals("borderstyle")) {
                            c8 = 7;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 1767875043:
                        if (lowerCase.equals("alignment")) {
                            c8 = '\b';
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 1988365454:
                        if (lowerCase.equals("outlinecolour")) {
                            c8 = '\t';
                            break;
                        }
                        c8 = 65535;
                        break;
                    default:
                        c8 = 65535;
                        break;
                }
                switch (c8) {
                    case 0:
                        i14 = i18;
                        break;
                    case 1:
                        i15 = i18;
                        break;
                    case 2:
                        i16 = i18;
                        break;
                    case 3:
                        i10 = i18;
                        break;
                    case 4:
                        i13 = i18;
                        break;
                    case 5:
                        i8 = i18;
                        break;
                    case 6:
                        i12 = i18;
                        break;
                    case 7:
                        i17 = i18;
                        break;
                    case '\b':
                        i9 = i18;
                        break;
                    case '\t':
                        i11 = i18;
                        break;
                }
            }
            if (i8 != -1) {
                return new Format(i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, split.length);
            }
            return null;
        }
    }

    static final class Overrides {
        private static final String TAG = "SsaStyle.Overrides";
        public final int alignment;

        @Nullable
        public final PointF position;
        private static final Pattern BRACES_PATTERN = Pattern.compile("\\{([^}]*)\\}");
        private static final String PADDED_DECIMAL_PATTERN = "\\s*\\d+(?:\\.\\d+)?\\s*";
        private static final Pattern POSITION_PATTERN = Pattern.compile(Util.formatInvariant("\\\\pos\\((%1$s),(%1$s)\\)", PADDED_DECIMAL_PATTERN));
        private static final Pattern MOVE_PATTERN = Pattern.compile(Util.formatInvariant("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", PADDED_DECIMAL_PATTERN));
        private static final Pattern ALIGNMENT_OVERRIDE_PATTERN = Pattern.compile("\\\\an(\\d+)");

        private Overrides(int i8, @Nullable PointF pointF) {
            this.alignment = i8;
            this.position = pointF;
        }

        private static int parseAlignmentOverride(String str) {
            Matcher matcher = ALIGNMENT_OVERRIDE_PATTERN.matcher(str);
            if (matcher.find()) {
                return SsaStyle.parseAlignment((String) Assertions.checkNotNull(matcher.group(1)));
            }
            return -1;
        }

        public static Overrides parseFromDialogue(String str) {
            Matcher matcher = BRACES_PATTERN.matcher(str);
            PointF pointF = null;
            int i8 = -1;
            while (matcher.find()) {
                String str2 = (String) Assertions.checkNotNull(matcher.group(1));
                try {
                    PointF parsePosition = parsePosition(str2);
                    if (parsePosition != null) {
                        pointF = parsePosition;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int parseAlignmentOverride = parseAlignmentOverride(str2);
                    if (parseAlignmentOverride != -1) {
                        i8 = parseAlignmentOverride;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new Overrides(i8, pointF);
        }

        @Nullable
        private static PointF parsePosition(String str) {
            String group;
            String group2;
            Matcher matcher = POSITION_PATTERN.matcher(str);
            Matcher matcher2 = MOVE_PATTERN.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    Log.i(TAG, "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else {
                if (!find2) {
                    return null;
                }
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) Assertions.checkNotNull(group)).trim()), Float.parseFloat(((String) Assertions.checkNotNull(group2)).trim()));
        }

        public static String stripStyleOverrides(String str) {
            return BRACES_PATTERN.matcher(str).replaceAll("");
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SsaAlignment {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SsaBorderStyle {
    }

    private SsaStyle(String str, int i8, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2, float f8, boolean z7, boolean z8, boolean z9, boolean z10, int i9) {
        this.name = str;
        this.alignment = i8;
        this.primaryColor = num;
        this.outlineColor = num2;
        this.fontSize = f8;
        this.bold = z7;
        this.italic = z8;
        this.underline = z9;
        this.strikeout = z10;
        this.borderStyle = i9;
    }

    @Nullable
    public static SsaStyle fromStyleLine(String str, Format format) {
        Assertions.checkArgument(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), SystemInfoUtil.COMMA);
        int length = split.length;
        int i8 = format.length;
        if (length != i8) {
            Log.w(TAG, Util.formatInvariant("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i8), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[format.nameIndex].trim();
            int i9 = format.alignmentIndex;
            int parseAlignment = i9 != -1 ? parseAlignment(split[i9].trim()) : -1;
            int i10 = format.primaryColorIndex;
            Integer parseColor = i10 != -1 ? parseColor(split[i10].trim()) : null;
            int i11 = format.outlineColorIndex;
            Integer parseColor2 = i11 != -1 ? parseColor(split[i11].trim()) : null;
            int i12 = format.fontSizeIndex;
            float parseFontSize = i12 != -1 ? parseFontSize(split[i12].trim()) : -3.4028235E38f;
            int i13 = format.boldIndex;
            boolean z7 = i13 != -1 && parseBooleanValue(split[i13].trim());
            int i14 = format.italicIndex;
            boolean z8 = i14 != -1 && parseBooleanValue(split[i14].trim());
            int i15 = format.underlineIndex;
            boolean z9 = i15 != -1 && parseBooleanValue(split[i15].trim());
            int i16 = format.strikeoutIndex;
            boolean z10 = i16 != -1 && parseBooleanValue(split[i16].trim());
            int i17 = format.borderStyleIndex;
            return new SsaStyle(trim, parseAlignment, parseColor, parseColor2, parseFontSize, z7, z8, z9, z10, i17 != -1 ? parseBorderStyle(split[i17].trim()) : -1);
        } catch (RuntimeException e8) {
            Log.w(TAG, "Skipping malformed 'Style:' line: '" + str + "'", e8);
            return null;
        }
    }

    private static boolean isValidAlignment(int i8) {
        switch (i8) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private static boolean isValidBorderStyle(int i8) {
        return i8 == 1 || i8 == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int parseAlignment(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (isValidAlignment(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        Log.w(TAG, "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static boolean parseBooleanValue(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e8) {
            Log.w(TAG, "Failed to parse boolean value: '" + str + "'", e8);
            return false;
        }
    }

    private static int parseBorderStyle(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (isValidBorderStyle(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        Log.w(TAG, "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    @Nullable
    @ColorInt
    public static Integer parseColor(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            Assertions.checkArgument(parseLong <= a.INVALID_VERSION_32);
            return Integer.valueOf(Color.argb(Ints.checkedCast(((parseLong >> 24) & 255) ^ 255), Ints.checkedCast(parseLong & 255), Ints.checkedCast((parseLong >> 8) & 255), Ints.checkedCast((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e8) {
            Log.w(TAG, "Failed to parse color expression: '" + str + "'", e8);
            return null;
        }
    }

    private static float parseFontSize(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e8) {
            Log.w(TAG, "Failed to parse font size: '" + str + "'", e8);
            return -3.4028235E38f;
        }
    }
}
