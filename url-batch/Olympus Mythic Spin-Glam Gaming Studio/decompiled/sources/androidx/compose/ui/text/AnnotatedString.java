package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import com.mbridge.msdk.foundation.download.Command;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnnotatedString.kt */
@Immutable
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u000278BU\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0004\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u00050\u0004¢\u0006\u0004\b\f\u0010\rB=\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0004¢\u0006\u0004\b\f\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#J)\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00050\u00042\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020'2\b\u0010\u001c\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010-R#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u00102R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b3\u00102R(\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b4\u00102R\u0014\u00106\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010+\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "", "", "text", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/ParagraphStyle;", "paragraphStyles", "", "annotations", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "index", "", "get", "(I)C", "startIndex", "endIndex", "subSequence", "(II)Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextRange;", "range", "subSequence-5zc-tL8", "(J)Landroidx/compose/ui/text/AnnotatedString;", "other", "plus", "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/AnnotatedString;", "tag", "start", "end", "getStringAnnotations", "(Ljava/lang/String;II)Ljava/util/List;", "Landroidx/compose/ui/text/TtsAnnotation;", "getTtsAnnotations", "(II)Ljava/util/List;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getText", "Ljava/util/List;", "getSpanStyles", "()Ljava/util/List;", "getParagraphStyles", "getAnnotations$ui_text_release", "getLength", "length", "Builder", Command.HTTP_HEADER_RANGE, "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AnnotatedString implements CharSequence {
    private final List annotations;
    private final List paragraphStyles;
    private final List spanStyles;
    private final String text;

    public AnnotatedString(String text, List spanStyles, List paragraphStyles, List annotations) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(paragraphStyles, "paragraphStyles");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        this.text = text;
        this.spanStyles = spanStyles;
        this.paragraphStyles = paragraphStyles;
        this.annotations = annotations;
        int size = paragraphStyles.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            Range range = (Range) paragraphStyles.get(i2);
            if (range.getStart() < i) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap");
            }
            if (range.getEnd() > this.text.length()) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + range.getStart() + ", " + range.getEnd() + ") is out of boundary").toString());
            }
            i = range.getEnd();
        }
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return get(i);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public final String getText() {
        return this.text;
    }

    public final List getSpanStyles() {
        return this.spanStyles;
    }

    public final List getParagraphStyles() {
        return this.paragraphStyles;
    }

    /* renamed from: getAnnotations$ui_text_release, reason: from getter */
    public final List getAnnotations() {
        return this.annotations;
    }

    public /* synthetic */ AnnotatedString(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnnotatedString(String text, List spanStyles, List paragraphStyles) {
        this(text, spanStyles, paragraphStyles, CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(paragraphStyles, "paragraphStyles");
    }

    public int getLength() {
        return this.text.length();
    }

    public char get(int index) {
        return this.text.charAt(index);
    }

    @Override // java.lang.CharSequence
    public AnnotatedString subSequence(int startIndex, int endIndex) {
        List filterRanges;
        List filterRanges2;
        List filterRanges3;
        if (startIndex > endIndex) {
            throw new IllegalArgumentException(("start (" + startIndex + ") should be less or equal to end (" + endIndex + ')').toString());
        }
        if (startIndex == 0 && endIndex == this.text.length()) {
            return this;
        }
        String substring = this.text.substring(startIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        filterRanges = AnnotatedStringKt.filterRanges(this.spanStyles, startIndex, endIndex);
        filterRanges2 = AnnotatedStringKt.filterRanges(this.paragraphStyles, startIndex, endIndex);
        filterRanges3 = AnnotatedStringKt.filterRanges(this.annotations, startIndex, endIndex);
        return new AnnotatedString(substring, filterRanges, filterRanges2, filterRanges3);
    }

    /* renamed from: subSequence-5zc-tL8, reason: not valid java name */
    public final AnnotatedString m2178subSequence5zctL8(long range) {
        return subSequence(TextRange.m2247getMinimpl(range), TextRange.m2246getMaximpl(range));
    }

    public final AnnotatedString plus(AnnotatedString other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Builder builder = new Builder(this);
        builder.append(other);
        return builder.toAnnotatedString();
    }

    public final List getStringAnnotations(String tag, int start, int end) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        List list = this.annotations;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            Range range = (Range) obj;
            if ((range.getItem() instanceof String) && Intrinsics.areEqual(tag, range.getTag()) && AnnotatedStringKt.intersect(start, end, range.getStart(), range.getEnd())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List getTtsAnnotations(int start, int end) {
        List list = this.annotations;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            Range range = (Range) obj;
            if ((range.getItem() instanceof TtsAnnotation) && AnnotatedStringKt.intersect(start, end, range.getStart(), range.getEnd())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) other;
        return Intrinsics.areEqual(this.text, annotatedString.text) && Intrinsics.areEqual(this.spanStyles, annotatedString.spanStyles) && Intrinsics.areEqual(this.paragraphStyles, annotatedString.paragraphStyles) && Intrinsics.areEqual(this.annotations, annotatedString.annotations);
    }

    public int hashCode() {
        return (((((this.text.hashCode() * 31) + this.spanStyles.hashCode()) * 31) + this.paragraphStyles.hashCode()) * 31) + this.annotations.hashCode();
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text;
    }

    /* compiled from: AnnotatedString.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Range;", "T", "", "item", "", "start", "end", "", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "(Ljava/lang/Object;II)V", "component1", "()Ljava/lang/Object;", "component2", "()I", "component3", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getItem", "I", "getStart", "getEnd", "Ljava/lang/String;", "getTag", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @Immutable
    public static final /* data */ class Range<T> {
        private final int end;
        private final Object item;
        private final int start;
        private final String tag;

        /* renamed from: component1, reason: from getter */
        public final Object getItem() {
            return this.item;
        }

        /* renamed from: component2, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* renamed from: component3, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Range)) {
                return false;
            }
            Range range = (Range) other;
            return Intrinsics.areEqual(this.item, range.item) && this.start == range.start && this.end == range.end && Intrinsics.areEqual(this.tag, range.tag);
        }

        public int hashCode() {
            Object obj = this.item;
            return ((((((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
        }

        public Range(Object obj, int i, int i2, String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.item = obj;
            this.start = i;
            this.end = i2;
            this.tag = tag;
            if (i > i2) {
                throw new IllegalArgumentException("Reversed range is not supported");
            }
        }

        public final int getEnd() {
            return this.end;
        }

        public final Object getItem() {
            return this.item;
        }

        public final int getStart() {
            return this.start;
        }

        public final String getTag() {
            return this.tag;
        }

        public Range(Object obj, int i, int i2) {
            this(obj, i, i2, "");
        }
    }

    /* compiled from: AnnotatedString.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ%\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u00060\u0015j\u0002`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder;", "", "", "capacity", "<init>", "(I)V", "Landroidx/compose/ui/text/AnnotatedString;", "text", "(Landroidx/compose/ui/text/AnnotatedString;)V", "", "append", "Landroidx/compose/ui/text/SpanStyle;", "style", "start", "end", "addStyle", "(Landroidx/compose/ui/text/SpanStyle;II)V", "Landroidx/compose/ui/text/ParagraphStyle;", "(Landroidx/compose/ui/text/ParagraphStyle;II)V", "toAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "", "Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "spanStyles", "Ljava/util/List;", "paragraphStyles", "annotations", "styleStack", "MutableRange", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {
        private final List annotations;
        private final List paragraphStyles;
        private final List spanStyles;
        private final List styleStack;
        private final StringBuilder text;

        public Builder(int i) {
            this.text = new StringBuilder(i);
            this.spanStyles = new ArrayList();
            this.paragraphStyles = new ArrayList();
            this.annotations = new ArrayList();
            this.styleStack = new ArrayList();
        }

        public /* synthetic */ Builder(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 16 : i);
        }

        /* compiled from: AnnotatedString.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "T", "", "item", "", "start", "end", "", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "defaultEnd", "Landroidx/compose/ui/text/AnnotatedString$Range;", "toRange", "(I)Landroidx/compose/ui/text/AnnotatedString$Range;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getItem", "()Ljava/lang/Object;", "I", "getStart", "getEnd", "setEnd", "(I)V", "Ljava/lang/String;", "getTag", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        private static final /* data */ class MutableRange<T> {
            private int end;
            private final Object item;
            private final int start;
            private final String tag;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) other;
                return Intrinsics.areEqual(this.item, mutableRange.item) && this.start == mutableRange.start && this.end == mutableRange.end && Intrinsics.areEqual(this.tag, mutableRange.tag);
            }

            public int hashCode() {
                Object obj = this.item;
                return ((((((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
            }

            public MutableRange(Object obj, int i, int i2, String tag) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                this.item = obj;
                this.start = i;
                this.end = i2;
                this.tag = tag;
            }

            public /* synthetic */ MutableRange(Object obj, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : str);
            }

            public final Range toRange(int defaultEnd) {
                int i = this.end;
                if (i != Integer.MIN_VALUE) {
                    defaultEnd = i;
                }
                if (defaultEnd == Integer.MIN_VALUE) {
                    throw new IllegalStateException("Item.end should be set first");
                }
                return new Range(this.item, this.start, defaultEnd, this.tag);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(AnnotatedString text) {
            this(0, 1, null);
            Intrinsics.checkNotNullParameter(text, "text");
            append(text);
        }

        public final void append(AnnotatedString text) {
            Intrinsics.checkNotNullParameter(text, "text");
            int length = this.text.length();
            this.text.append(text.getText());
            List spanStyles = text.getSpanStyles();
            int size = spanStyles.size();
            for (int i = 0; i < size; i++) {
                Range range = (Range) spanStyles.get(i);
                addStyle((SpanStyle) range.getItem(), range.getStart() + length, range.getEnd() + length);
            }
            List paragraphStyles = text.getParagraphStyles();
            int size2 = paragraphStyles.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Range range2 = (Range) paragraphStyles.get(i2);
                addStyle((ParagraphStyle) range2.getItem(), range2.getStart() + length, range2.getEnd() + length);
            }
            List annotations = text.getAnnotations();
            int size3 = annotations.size();
            for (int i3 = 0; i3 < size3; i3++) {
                Range range3 = (Range) annotations.get(i3);
                this.annotations.add(new MutableRange(range3.getItem(), range3.getStart() + length, range3.getEnd() + length, range3.getTag()));
            }
        }

        public final void addStyle(SpanStyle style, int start, int end) {
            Intrinsics.checkNotNullParameter(style, "style");
            this.spanStyles.add(new MutableRange(style, start, end, null, 8, null));
        }

        public final void addStyle(ParagraphStyle style, int start, int end) {
            Intrinsics.checkNotNullParameter(style, "style");
            this.paragraphStyles.add(new MutableRange(style, start, end, null, 8, null));
        }

        public final AnnotatedString toAnnotatedString() {
            String sb = this.text.toString();
            Intrinsics.checkNotNullExpressionValue(sb, "text.toString()");
            List list = this.spanStyles;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((MutableRange) list.get(i)).toRange(this.text.length()));
            }
            List list2 = this.paragraphStyles;
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(((MutableRange) list2.get(i2)).toRange(this.text.length()));
            }
            List list3 = this.annotations;
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList3.add(((MutableRange) list3.get(i3)).toRange(this.text.length()));
            }
            return new AnnotatedString(sb, arrayList, arrayList2, arrayList3);
        }
    }
}
