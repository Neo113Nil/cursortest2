package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;

/* compiled from: ContentScale.kt */
@Stable
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \t2\u00020\u0001:\u0001\tJ%\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0002\u0082\u0002\u0011\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/ContentScale;", "", "computeScaleFactor", "Landroidx/compose/ui/layout/ScaleFactor;", "srcSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "computeScaleFactor-H7hwNQA", "(JJ)J", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ContentScale {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* renamed from: computeScaleFactor-H7hwNQA, reason: not valid java name */
    long mo1935computeScaleFactorH7hwNQA(long srcSize, long dstSize);

    /* compiled from: ContentScale.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\b¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/layout/ContentScale$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/layout/ContentScale;", "Crop", "Landroidx/compose/ui/layout/ContentScale;", "getCrop", "()Landroidx/compose/ui/layout/ContentScale;", "getCrop$annotations", "Fit", "getFit", "getFit$annotations", "FillHeight", "getFillHeight", "getFillHeight$annotations", "FillWidth", "getFillWidth", "getFillWidth$annotations", "Inside", "getInside", "getInside$annotations", "Landroidx/compose/ui/layout/FixedScale;", "None", "Landroidx/compose/ui/layout/FixedScale;", "getNone", "()Landroidx/compose/ui/layout/FixedScale;", "getNone$annotations", "FillBounds", "getFillBounds", "getFillBounds$annotations", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ContentScale Crop = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Crop$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo1935computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float m1941computeFillMaxDimensioniLBOSCw;
                m1941computeFillMaxDimensioniLBOSCw = ContentScaleKt.m1941computeFillMaxDimensioniLBOSCw(srcSize, dstSize);
                return ScaleFactorKt.ScaleFactor(m1941computeFillMaxDimensioniLBOSCw, m1941computeFillMaxDimensioniLBOSCw);
            }
        };
        private static final ContentScale Fit = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Fit$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo1935computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float m1942computeFillMinDimensioniLBOSCw;
                m1942computeFillMinDimensioniLBOSCw = ContentScaleKt.m1942computeFillMinDimensioniLBOSCw(srcSize, dstSize);
                return ScaleFactorKt.ScaleFactor(m1942computeFillMinDimensioniLBOSCw, m1942computeFillMinDimensioniLBOSCw);
            }
        };
        private static final ContentScale FillHeight = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillHeight$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo1935computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float m1940computeFillHeightiLBOSCw;
                m1940computeFillHeightiLBOSCw = ContentScaleKt.m1940computeFillHeightiLBOSCw(srcSize, dstSize);
                return ScaleFactorKt.ScaleFactor(m1940computeFillHeightiLBOSCw, m1940computeFillHeightiLBOSCw);
            }
        };
        private static final ContentScale FillWidth = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillWidth$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo1935computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float m1943computeFillWidthiLBOSCw;
                m1943computeFillWidthiLBOSCw = ContentScaleKt.m1943computeFillWidthiLBOSCw(srcSize, dstSize);
                return ScaleFactorKt.ScaleFactor(m1943computeFillWidthiLBOSCw, m1943computeFillWidthiLBOSCw);
            }
        };
        private static final ContentScale Inside = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Inside$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo1935computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float m1942computeFillMinDimensioniLBOSCw;
                if (Size.m1335getWidthimpl(srcSize) > Size.m1335getWidthimpl(dstSize) || Size.m1333getHeightimpl(srcSize) > Size.m1333getHeightimpl(dstSize)) {
                    m1942computeFillMinDimensioniLBOSCw = ContentScaleKt.m1942computeFillMinDimensioniLBOSCw(srcSize, dstSize);
                    return ScaleFactorKt.ScaleFactor(m1942computeFillMinDimensioniLBOSCw, m1942computeFillMinDimensioniLBOSCw);
                }
                return ScaleFactorKt.ScaleFactor(1.0f, 1.0f);
            }
        };
        private static final FixedScale None = new FixedScale(1.0f);
        private static final ContentScale FillBounds = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillBounds$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo1935computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float m1943computeFillWidthiLBOSCw;
                float m1940computeFillHeightiLBOSCw;
                m1943computeFillWidthiLBOSCw = ContentScaleKt.m1943computeFillWidthiLBOSCw(srcSize, dstSize);
                m1940computeFillHeightiLBOSCw = ContentScaleKt.m1940computeFillHeightiLBOSCw(srcSize, dstSize);
                return ScaleFactorKt.ScaleFactor(m1943computeFillWidthiLBOSCw, m1940computeFillHeightiLBOSCw);
            }
        };

        private Companion() {
        }

        public final ContentScale getCrop() {
            return Crop;
        }

        public final ContentScale getFit() {
            return Fit;
        }

        public final ContentScale getInside() {
            return Inside;
        }

        public final FixedScale getNone() {
            return None;
        }
    }
}
