package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.platform.AndroidMultiParagraphDrawKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: MultiParagraph.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B.\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ=\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b\u001d\u0010 J\u001d\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u001b\u0010.\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u00020/2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b0\u00101J\u001d\u00103\u001a\u00020&2\u0006\u0010\f\u001a\u00020\u00062\u0006\u00102\u001a\u00020\b¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u0002052\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u0002052\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b8\u00107J\u001e\u0010<\u001a\u0002092\u0006\u0010\f\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\u00020/2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b=\u00101J\u0015\u0010>\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b>\u0010?J\u0015\u0010@\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b@\u0010AJ\u0015\u0010B\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bB\u0010AJ\u0015\u0010C\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bC\u0010AJ\u0015\u0010D\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bD\u0010AJ\u0015\u0010E\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bE\u0010?J\u001f\u0010G\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010F\u001a\u00020\b¢\u0006\u0004\bG\u0010HR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010O\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010S\u001a\u00020&8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010W\u001a\u00020&8\u0006¢\u0006\f\n\u0004\bW\u0010T\u001a\u0004\bX\u0010VR\u0017\u0010Y\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bY\u0010L\u001a\u0004\bZ\u0010NR\u001f\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0[8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R \u0010a\u001a\b\u0012\u0004\u0012\u00020`0[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\ba\u0010]\u001a\u0004\bb\u0010_R\u0014\u0010f\u001a\u00020c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0011\u0010h\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bg\u0010VR\u0011\u0010j\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bi\u0010V\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006k"}, d2 = {"Landroidx/compose/ui/text/MultiParagraph;", "", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "intrinsics", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "maxLines", "", "ellipsis", "<init>", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "offset", "", "requireIndexInRange", "(I)V", "requireIndexInRangeInclusiveEnd", "lineIndex", "requireLineIndexInRange", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "decoration", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint", "Landroidx/compose/ui/graphics/Brush;", "brush", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "start", "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "(II)Landroidx/compose/ui/graphics/Path;", "", "vertical", "getLineForVerticalPosition", "(F)I", "Landroidx/compose/ui/geometry/Offset;", X3.i.L, "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "(I)Landroidx/compose/ui/geometry/Rect;", "usePrimaryDirection", "getHorizontalPosition", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getBidiRunDirection", "Landroidx/compose/ui/text/TextRange;", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "getCursorRect", "getLineForOffset", "(I)I", "getLineLeft", "(I)F", "getLineRight", "getLineTop", "getLineBottom", "getLineStart", "visibleEnd", "getLineEnd", "(IZ)I", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "getIntrinsics", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "I", "getMaxLines", "()I", "didExceedMaxLines", "Z", "getDidExceedMaxLines", "()Z", "width", "F", "getWidth", "()F", "height", "getHeight", "lineCount", "getLineCount", "", "placeholderRects", "Ljava/util/List;", "getPlaceholderRects", "()Ljava/util/List;", "Landroidx/compose/ui/text/ParagraphInfo;", "paragraphInfoList", "getParagraphInfoList$ui_text_release", "Landroidx/compose/ui/text/AnnotatedString;", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "getFirstBaseline", "firstBaseline", "getLastBaseline", "lastBaseline", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MultiParagraph {
    private final boolean didExceedMaxLines;
    private final float height;
    private final MultiParagraphIntrinsics intrinsics;
    private final int lineCount;
    private final int maxLines;
    private final List paragraphInfoList;
    private final List placeholderRects;
    private final float width;

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j, i, z);
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z) {
        boolean z2;
        int m2486getMaxHeightimpl;
        this.intrinsics = multiParagraphIntrinsics;
        this.maxLines = i;
        if (Constraints.m2489getMinWidthimpl(j) != 0 || Constraints.m2488getMinHeightimpl(j) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List infoList = multiParagraphIntrinsics.getInfoList();
        int size = infoList.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        int i4 = 0;
        while (i4 < size) {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) infoList.get(i4);
            ParagraphIntrinsics intrinsics = paragraphIntrinsicInfo.getIntrinsics();
            int m2487getMaxWidthimpl = Constraints.m2487getMaxWidthimpl(j);
            if (Constraints.m2482getHasBoundedHeightimpl(j)) {
                m2486getMaxHeightimpl = RangesKt.coerceAtLeast(Constraints.m2486getMaxHeightimpl(j) - ParagraphKt.ceilToInt(f), i2);
            } else {
                m2486getMaxHeightimpl = Constraints.m2486getMaxHeightimpl(j);
            }
            Paragraph m2189Paragraph_EkL_Y = ParagraphKt.m2189Paragraph_EkL_Y(intrinsics, ConstraintsKt.Constraints$default(0, m2487getMaxWidthimpl, 0, m2486getMaxHeightimpl, 5, null), this.maxLines - i3, z);
            float height = f + m2189Paragraph_EkL_Y.getHeight();
            int lineCount = i3 + m2189Paragraph_EkL_Y.getLineCount();
            List list = infoList;
            arrayList.add(new ParagraphInfo(m2189Paragraph_EkL_Y, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i3, lineCount, f, height));
            if (m2189Paragraph_EkL_Y.getDidExceedMaxLines() || (lineCount == this.maxLines && i4 != CollectionsKt.getLastIndex(this.intrinsics.getInfoList()))) {
                z2 = true;
                i3 = lineCount;
                f = height;
                break;
            } else {
                i4++;
                i3 = lineCount;
                f = height;
                i2 = 0;
                infoList = list;
            }
        }
        z2 = false;
        this.height = f;
        this.lineCount = i3;
        this.didExceedMaxLines = z2;
        this.paragraphInfoList = arrayList;
        this.width = Constraints.m2487getMaxWidthimpl(j);
        List arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i5);
            List placeholderRects = paragraphInfo.getParagraph().getPlaceholderRects();
            ArrayList arrayList3 = new ArrayList(placeholderRects.size());
            int size3 = placeholderRects.size();
            for (int i6 = 0; i6 < size3; i6++) {
                Rect rect = (Rect) placeholderRects.get(i6);
                arrayList3.add(rect != null ? paragraphInfo.toGlobal(rect) : null);
            }
            CollectionsKt.addAll(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.intrinsics.getPlaceholders().size()) {
            int size4 = this.intrinsics.getPlaceholders().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i7 = 0; i7 < size4; i7++) {
                arrayList4.add(null);
            }
            arrayList2 = CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList4);
        }
        this.placeholderRects = arrayList2;
    }

    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    private final AnnotatedString getAnnotatedString() {
        return this.intrinsics.getAnnotatedString();
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getFirstBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        return ((ParagraphInfo) this.paragraphInfoList.get(0)).getParagraph().getFirstBaseline();
    }

    public final float getLastBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) CollectionsKt.last(this.paragraphInfoList);
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLastBaseline());
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final List getPlaceholderRects() {
        return this.placeholderRects;
    }

    /* renamed from: getParagraphInfoList$ui_text_release, reason: from getter */
    public final List getParagraphInfoList() {
        return this.paragraphInfoList;
    }

    /* renamed from: paint-RPmYEkk, reason: not valid java name */
    public final void m2181paintRPmYEkk(Canvas canvas, long color, Shadow shadow, TextDecoration decoration) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        List list = this.paragraphInfoList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) list.get(i);
            paragraphInfo.getParagraph().mo2184paintRPmYEkk(canvas, color, shadow, decoration);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    public final void paint(Canvas canvas, Brush brush, Shadow shadow, TextDecoration decoration) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(brush, "brush");
        AndroidMultiParagraphDrawKt.drawMultiParagraph(this, canvas, brush, shadow, decoration);
    }

    public final Path getPathForRange(int start, int end) {
        if (start < 0 || start > end || end > getAnnotatedString().getText().length()) {
            throw new IllegalArgumentException(("Start(" + start + ") or End(" + end + ") is out of range [0.." + getAnnotatedString().getText().length() + "), or start > end!").toString());
        }
        if (start == end) {
            return AndroidPath_androidKt.Path();
        }
        Path Path = AndroidPath_androidKt.Path();
        int size = this.paragraphInfoList.size();
        for (int findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, start); findParagraphByIndex < size; findParagraphByIndex++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(findParagraphByIndex);
            if (paragraphInfo.getStartIndex() >= end) {
                break;
            }
            if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                Path.m1540addPathUv8p0NA$default(Path, paragraphInfo.toGlobal(paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(start), paragraphInfo.toLocalIndex(end))), 0L, 2, null);
            }
        }
        return Path;
    }

    public final int getLineForVerticalPosition(float vertical) {
        int lastIndex;
        if (vertical <= 0.0f) {
            lastIndex = 0;
        } else {
            lastIndex = vertical >= this.height ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByY(this.paragraphInfoList, vertical);
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(lastIndex);
        if (paragraphInfo.getLength() == 0) {
            return Math.max(0, paragraphInfo.getStartIndex() - 1);
        }
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForVerticalPosition(paragraphInfo.toLocalYPosition(vertical)));
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m2179getOffsetForPositionk4lQ0M(long position) {
        int lastIndex;
        if (Offset.m1298getYimpl(position) <= 0.0f) {
            lastIndex = 0;
        } else {
            lastIndex = Offset.m1298getYimpl(position) >= this.height ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByY(this.paragraphInfoList, Offset.m1298getYimpl(position));
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(lastIndex);
        if (paragraphInfo.getLength() == 0) {
            return Math.max(0, paragraphInfo.getStartIndex() - 1);
        }
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().mo2182getOffsetForPositionk4lQ0M(paragraphInfo.m2186toLocalMKHz9U(position)));
    }

    public final Rect getBoundingBox(int offset) {
        requireIndexInRange(offset);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getBoundingBox(paragraphInfo.toLocalIndex(offset)));
    }

    public final float getHorizontalPosition(int offset, boolean usePrimaryDirection) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(offset);
        if (offset == getAnnotatedString().length()) {
            findParagraphByIndex = CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.getParagraph().getHorizontalPosition(paragraphInfo.toLocalIndex(offset), usePrimaryDirection);
    }

    public final ResolvedTextDirection getParagraphDirection(int offset) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(offset);
        if (offset == getAnnotatedString().length()) {
            findParagraphByIndex = CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.getParagraph().getParagraphDirection(paragraphInfo.toLocalIndex(offset));
    }

    public final ResolvedTextDirection getBidiRunDirection(int offset) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(offset);
        if (offset == getAnnotatedString().length()) {
            findParagraphByIndex = CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.getParagraph().getBidiRunDirection(paragraphInfo.toLocalIndex(offset));
    }

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m2180getWordBoundaryjx7JFs(int offset) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(offset);
        if (offset == getAnnotatedString().length()) {
            findParagraphByIndex = CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.m2185toGlobalGEjPoXI(paragraphInfo.getParagraph().mo2183getWordBoundaryjx7JFs(paragraphInfo.toLocalIndex(offset)));
    }

    public final Rect getCursorRect(int offset) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(offset);
        if (offset == getAnnotatedString().length()) {
            findParagraphByIndex = CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getCursorRect(paragraphInfo.toLocalIndex(offset)));
    }

    public final int getLineForOffset(int offset) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(offset);
        if (offset == getAnnotatedString().length()) {
            findParagraphByIndex = CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForOffset(paragraphInfo.toLocalIndex(offset)));
    }

    public final float getLineLeft(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineLeft(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final float getLineRight(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineRight(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final float getLineTop(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineTop(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public final float getLineBottom(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBottom(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public final int getLineStart(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineStart(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public final int getLineEnd(int lineIndex, boolean visibleEnd) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineEnd(paragraphInfo.toLocalLineIndex(lineIndex), visibleEnd));
    }

    private final void requireIndexInRange(int offset) {
        if (offset < 0 || offset >= getAnnotatedString().getText().length()) {
            throw new IllegalArgumentException(("offset(" + offset + ") is out of bounds [0, " + getAnnotatedString().length() + ')').toString());
        }
    }

    private final void requireIndexInRangeInclusiveEnd(int offset) {
        if (offset < 0 || offset > getAnnotatedString().getText().length()) {
            throw new IllegalArgumentException(("offset(" + offset + ") is out of bounds [0, " + getAnnotatedString().length() + ']').toString());
        }
    }

    private final void requireLineIndexInRange(int lineIndex) {
        if (lineIndex < 0 || lineIndex >= this.lineCount) {
            throw new IllegalArgumentException(("lineIndex(" + lineIndex + ") is out of bounds [0, " + lineIndex + ')').toString());
        }
    }
}
