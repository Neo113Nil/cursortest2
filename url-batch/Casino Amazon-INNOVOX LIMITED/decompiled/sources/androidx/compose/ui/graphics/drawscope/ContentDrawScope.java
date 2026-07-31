package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;

/* compiled from: ContentDrawScope.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawContent", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ContentDrawScope extends DrawScope {
    void drawContent();

    /* compiled from: ContentDrawScope.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m1034drawImageAZ2fEMs(ContentDrawScope contentDrawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
            ContentDrawScope.super.mo991drawImageAZ2fEMs(imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, i2);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m1035getCenterF1C5BW0(ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo1084getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m1036getSizeNHjbRc(ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo1085getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m1037roundToPxR2X_6o(ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo1782roundToPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m1038roundToPx0680j_4(ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo1783roundToPx0680j_4(f);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m1039toDpGaN1DYA(ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo1784toDpGaN1DYA(j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m1040toDpu2uoSUM(ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo1785toDpu2uoSUM(f);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m1041toDpu2uoSUM(ContentDrawScope contentDrawScope, int i) {
            return ContentDrawScope.super.mo1786toDpu2uoSUM(i);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m1042toDpSizekrfVVM(ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo1787toDpSizekrfVVM(j);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m1043toPxR2X_6o(ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo1788toPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m1044toPx0680j_4(ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo1789toPx0680j_4(f);
        }

        @Deprecated
        public static Rect toRect(ContentDrawScope contentDrawScope, DpRect dpRect) {
            return ContentDrawScope.super.toRect(dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m1045toSizeXkaWNTQ(ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo1790toSizeXkaWNTQ(j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m1046toSp0xMU5do(ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo1791toSp0xMU5do(f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m1047toSpkPz2Gy4(ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo1792toSpkPz2Gy4(f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m1048toSpkPz2Gy4(ContentDrawScope contentDrawScope, int i) {
            return ContentDrawScope.super.mo1793toSpkPz2Gy4(i);
        }
    }
}
