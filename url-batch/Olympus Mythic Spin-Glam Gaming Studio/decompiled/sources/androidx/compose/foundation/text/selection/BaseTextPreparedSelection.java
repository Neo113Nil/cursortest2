package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.yandex.div.core.DivActionHandler;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: TextPreparedSelection.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000e\n\u0002\b\u0005\b \u0018\u0000 h*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001hB4\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u001b\u0010\u001f\u001a\u00020\u0017*\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010\u001aJ\u000f\u0010 \u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010!J\u0017\u0010%\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0017H\u0002¢\u0006\u0004\b'\u0010!J\u000f\u0010(\u001a\u00020\u0017H\u0002¢\u0006\u0004\b(\u0010!J\u0017\u0010*\u001a\u00020)2\u0006\u0010$\u001a\u00020\u0017H\u0004¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020)2\u0006\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u0017H\u0004¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00028\u0000¢\u0006\u0004\b0\u0010\u0010J\r\u00101\u001a\u00028\u0000¢\u0006\u0004\b1\u0010\u0010J\r\u00102\u001a\u00028\u0000¢\u0006\u0004\b2\u0010\u0010J\r\u00103\u001a\u00028\u0000¢\u0006\u0004\b3\u0010\u0010J!\u00106\u001a\u00028\u00002\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020)04¢\u0006\u0004\b6\u00107J!\u00108\u001a\u00028\u00002\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020)04¢\u0006\u0004\b8\u00107J\r\u00109\u001a\u00020\u0017¢\u0006\u0004\b9\u0010!J\r\u0010:\u001a\u00020\u0017¢\u0006\u0004\b:\u0010!J\r\u0010;\u001a\u00028\u0000¢\u0006\u0004\b;\u0010\u0010J\r\u0010<\u001a\u00028\u0000¢\u0006\u0004\b<\u0010\u0010J\r\u0010=\u001a\u00028\u0000¢\u0006\u0004\b=\u0010\u0010J\r\u0010>\u001a\u00028\u0000¢\u0006\u0004\b>\u0010\u0010J\u000f\u0010?\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bA\u0010@J\r\u0010B\u001a\u00028\u0000¢\u0006\u0004\bB\u0010\u0010J\r\u0010C\u001a\u00028\u0000¢\u0006\u0004\bC\u0010\u0010J\r\u0010D\u001a\u00028\u0000¢\u0006\u0004\bD\u0010\u0010J\r\u0010E\u001a\u00028\u0000¢\u0006\u0004\bE\u0010\u0010J\u000f\u0010F\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bF\u0010@J\r\u0010G\u001a\u00028\u0000¢\u0006\u0004\bG\u0010\u0010J\u000f\u0010H\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bH\u0010@J\r\u0010I\u001a\u00028\u0000¢\u0006\u0004\bI\u0010\u0010J\r\u0010J\u001a\u00028\u0000¢\u0006\u0004\bJ\u0010\u0010J\r\u0010K\u001a\u00028\u0000¢\u0006\u0004\bK\u0010\u0010J\r\u0010L\u001a\u00028\u0000¢\u0006\u0004\bL\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010M\u001a\u0004\bN\u0010OR \u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0006\u0010P\u001a\u0004\bQ\u0010RR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010Y\u001a\u0004\bZ\u0010[R+\u0010\\\u001a\u00020\u00058\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\\\u0010P\u001a\u0004\b]\u0010R\"\u0004\b^\u0010_R\"\u0010`\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010M\u001a\u0004\ba\u0010O\"\u0004\bb\u0010cR\u0014\u0010g\u001a\u00020d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\be\u0010f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006i"}, d2 = {"Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "T", "", "Landroidx/compose/ui/text/AnnotatedString;", "originalText", "Landroidx/compose/ui/text/TextRange;", "originalSelection", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "state", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "moveCursorPrev", "()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "moveCursorNext", "moveCursorNextByWord", "moveCursorPrevByWord", "", "isLtr", "()Z", "", "currentOffset", "getNextWordOffsetForLayout", "(Landroidx/compose/ui/text/TextLayoutResult;I)I", "getPrevWordOffset", "getLineStartByOffsetForLayout", "getLineEndByOffsetForLayout", "linesAmount", "jumpByLinesOffset", "transformedEndOffset", "()I", "transformedMinOffset", "transformedMaxOffset", "offset", "charOffset", "(I)I", "getParagraphStart", "getParagraphEnd", "", "setCursor", "(I)V", "start", "end", "setSelection", "(II)V", "selectAll", "deselect", "moveCursorLeft", "moveCursorRight", "Lkotlin/Function1;", "or", "collapseLeftOr", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "collapseRightOr", "getPrecedingCharacterIndex", "getNextCharacterIndex", "moveCursorToHome", "moveCursorToEnd", "moveCursorLeftByWord", "moveCursorRightByWord", "getNextWordOffset", "()Ljava/lang/Integer;", "getPreviousWordOffset", "moveCursorPrevByParagraph", "moveCursorNextByParagraph", "moveCursorUpByLine", "moveCursorDownByLine", "getLineStartByOffset", "moveCursorToLineStart", "getLineEndByOffset", "moveCursorToLineEnd", "moveCursorToLineLeftSide", "moveCursorToLineRightSide", "selectMovement", "Landroidx/compose/ui/text/AnnotatedString;", "getOriginalText", "()Landroidx/compose/ui/text/AnnotatedString;", "J", "getOriginalSelection-d9O1mEE", "()J", "Landroidx/compose/ui/text/TextLayoutResult;", "getLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "getState", "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", DivActionHandler.DivActionReason.SELECTION, "getSelection-d9O1mEE", "setSelection-5zc-tL8", "(J)V", "annotatedString", "getAnnotatedString", "setAnnotatedString", "(Landroidx/compose/ui/text/AnnotatedString;)V", "", "getText$foundation_release", "()Ljava/lang/String;", "text", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BaseTextPreparedSelection<T extends BaseTextPreparedSelection<T>> {
    private AnnotatedString annotatedString;
    private final TextLayoutResult layoutResult;
    private final OffsetMapping offsetMapping;
    private final long originalSelection;
    private final AnnotatedString originalText;
    private long selection;
    private final TextPreparedSelectionState state;

    public /* synthetic */ BaseTextPreparedSelection(AnnotatedString annotatedString, long j, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j, textLayoutResult, offsetMapping, textPreparedSelectionState);
    }

    private BaseTextPreparedSelection(AnnotatedString annotatedString, long j, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState) {
        this.originalText = annotatedString;
        this.originalSelection = j;
        this.layoutResult = textLayoutResult;
        this.offsetMapping = offsetMapping;
        this.state = textPreparedSelectionState;
        this.selection = j;
        this.annotatedString = annotatedString;
    }

    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final TextPreparedSelectionState getState() {
        return this.state;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getSelection() {
        return this.selection;
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final String getText$foundation_release() {
        return this.annotatedString.getText();
    }

    private final BaseTextPreparedSelection moveCursorNext() {
        int nextCharacterIndex;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (nextCharacterIndex = getNextCharacterIndex()) != -1) {
            setCursor(nextCharacterIndex);
        }
        return this;
    }

    private final BaseTextPreparedSelection moveCursorNextByWord() {
        Integer nextWordOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (nextWordOffset = getNextWordOffset()) != null) {
            setCursor(nextWordOffset.intValue());
        }
        return this;
    }

    private final BaseTextPreparedSelection moveCursorPrev() {
        int precedingCharacterIndex;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (precedingCharacterIndex = getPrecedingCharacterIndex()) != -1) {
            setCursor(precedingCharacterIndex);
        }
        return this;
    }

    private final BaseTextPreparedSelection moveCursorPrevByWord() {
        Integer previousWordOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (previousWordOffset = getPreviousWordOffset()) != null) {
            setCursor(previousWordOffset.intValue());
        }
        return this;
    }

    public final BaseTextPreparedSelection collapseLeftOr(Function1 or) {
        Intrinsics.checkNotNullParameter(or, "or");
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (TextRange.m2243getCollapsedimpl(this.selection)) {
                or.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m2247getMinimpl(this.selection));
            } else {
                setCursor(TextRange.m2246getMaximpl(this.selection));
            }
        }
        return this;
    }

    public final BaseTextPreparedSelection collapseRightOr(Function1 or) {
        Intrinsics.checkNotNullParameter(or, "or");
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (TextRange.m2243getCollapsedimpl(this.selection)) {
                or.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m2246getMaximpl(this.selection));
            } else {
                setCursor(TextRange.m2247getMinimpl(this.selection));
            }
        }
        return this;
    }

    public final BaseTextPreparedSelection deselect() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(TextRange.m2244getEndimpl(this.selection));
        }
        return this;
    }

    public final BaseTextPreparedSelection moveCursorLeft() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorPrev();
            } else {
                moveCursorNext();
            }
        }
        return this;
    }

    public final BaseTextPreparedSelection moveCursorLeftByWord() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorPrevByWord();
            } else {
                moveCursorNextByWord();
            }
        }
        return this;
    }

    public final BaseTextPreparedSelection moveCursorNextByParagraph() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(getParagraphEnd());
        }
        return this;
    }

    public final BaseTextPreparedSelection moveCursorPrevByParagraph() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(getParagraphStart());
        }
        return this;
    }

    public final BaseTextPreparedSelection moveCursorRight() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorNext();
            } else {
                moveCursorPrev();
            }
        }
        return this;
    }

    public final BaseTextPreparedSelection moveCursorRightByWord() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorNextByWord();
            } else {
                moveCursorPrevByWord();
            }
        }
        return this;
    }

    public final BaseTextPreparedSelection moveCursorToEnd() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(getText$foundation_release().length());
        }
        return this;
    }

    public final BaseTextPreparedSelection moveCursorToHome() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(0);
        }
        return this;
    }

    public final BaseTextPreparedSelection moveCursorToLineEnd() {
        Integer lineEndByOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (lineEndByOffset = getLineEndByOffset()) != null) {
            setCursor(lineEndByOffset.intValue());
        }
        return this;
    }

    public final BaseTextPreparedSelection moveCursorToLineLeftSide() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorToLineStart();
            } else {
                moveCursorToLineEnd();
            }
        }
        return this;
    }

    public final BaseTextPreparedSelection moveCursorToLineRightSide() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorToLineEnd();
            } else {
                moveCursorToLineStart();
            }
        }
        return this;
    }

    public final BaseTextPreparedSelection moveCursorToLineStart() {
        Integer lineStartByOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (lineStartByOffset = getLineStartByOffset()) != null) {
            setCursor(lineStartByOffset.intValue());
        }
        return this;
    }

    public final BaseTextPreparedSelection selectAll() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setSelection(0, getText$foundation_release().length());
        }
        return this;
    }

    public final BaseTextPreparedSelection moveCursorDownByLine() {
        TextLayoutResult textLayoutResult;
        if (getText$foundation_release().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            setCursor(jumpByLinesOffset(textLayoutResult, 1));
        }
        return this;
    }

    public final BaseTextPreparedSelection moveCursorUpByLine() {
        TextLayoutResult textLayoutResult;
        if (getText$foundation_release().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            setCursor(jumpByLinesOffset(textLayoutResult, -1));
        }
        return this;
    }

    public final BaseTextPreparedSelection selectMovement() {
        if (getText$foundation_release().length() > 0) {
            this.selection = TextRangeKt.TextRange(TextRange.m2249getStartimpl(this.originalSelection), TextRange.m2244getEndimpl(this.selection));
        }
        return this;
    }

    protected final void setCursor(int offset) {
        setSelection(offset, offset);
    }

    protected final void setSelection(int start, int end) {
        this.selection = TextRangeKt.TextRange(start, end);
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.annotatedString.getText(), TextRange.m2244getEndimpl(this.selection));
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.annotatedString.getText(), TextRange.m2244getEndimpl(this.selection));
    }

    public final Integer getNextWordOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getNextWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final Integer getPreviousWordOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getPrevWordOffset$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final Integer getLineStartByOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getLineStartByOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final Integer getLineEndByOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getLineEndByOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    private final boolean isLtr() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        return (textLayoutResult != null ? textLayoutResult.getParagraphDirection(TextRange.m2244getEndimpl(this.selection)) : null) != ResolvedTextDirection.Rtl;
    }

    static /* synthetic */ int getNextWordOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
        }
        if ((i2 & 1) != 0) {
            i = baseTextPreparedSelection.transformedEndOffset();
        }
        return baseTextPreparedSelection.getNextWordOffsetForLayout(textLayoutResult, i);
    }

    private final int getNextWordOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        if (i >= this.originalText.length()) {
            return this.originalText.length();
        }
        long m2236getWordBoundaryjx7JFs = textLayoutResult.m2236getWordBoundaryjx7JFs(charOffset(i));
        if (TextRange.m2244getEndimpl(m2236getWordBoundaryjx7JFs) <= i) {
            return getNextWordOffsetForLayout(textLayoutResult, i + 1);
        }
        return this.offsetMapping.transformedToOriginal(TextRange.m2244getEndimpl(m2236getWordBoundaryjx7JFs));
    }

    static /* synthetic */ int getPrevWordOffset$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if ((i2 & 1) != 0) {
            i = baseTextPreparedSelection.transformedEndOffset();
        }
        return baseTextPreparedSelection.getPrevWordOffset(textLayoutResult, i);
    }

    private final int getPrevWordOffset(TextLayoutResult textLayoutResult, int i) {
        if (i < 0) {
            return 0;
        }
        long m2236getWordBoundaryjx7JFs = textLayoutResult.m2236getWordBoundaryjx7JFs(charOffset(i));
        if (TextRange.m2249getStartimpl(m2236getWordBoundaryjx7JFs) >= i) {
            return getPrevWordOffset(textLayoutResult, i - 1);
        }
        return this.offsetMapping.transformedToOriginal(TextRange.m2249getStartimpl(m2236getWordBoundaryjx7JFs));
    }

    static /* synthetic */ int getLineStartByOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
        }
        if ((i2 & 1) != 0) {
            i = baseTextPreparedSelection.transformedMinOffset();
        }
        return baseTextPreparedSelection.getLineStartByOffsetForLayout(textLayoutResult, i);
    }

    private final int getLineStartByOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(i)));
    }

    static /* synthetic */ int getLineEndByOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
        }
        if ((i2 & 1) != 0) {
            i = baseTextPreparedSelection.transformedMaxOffset();
        }
        return baseTextPreparedSelection.getLineEndByOffsetForLayout(textLayoutResult, i);
    }

    private final int getLineEndByOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(i), true));
    }

    private final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i) {
        int transformedEndOffset = transformedEndOffset();
        if (this.state.getCachedX() == null) {
            this.state.setCachedX(Float.valueOf(textLayoutResult.getCursorRect(transformedEndOffset).getLeft()));
        }
        int lineForOffset = textLayoutResult.getLineForOffset(transformedEndOffset) + i;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return getText$foundation_release().length();
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset) - 1;
        Float cachedX = this.state.getCachedX();
        Intrinsics.checkNotNull(cachedX);
        float floatValue = cachedX.floatValue();
        if ((isLtr() && floatValue >= textLayoutResult.getLineRight(lineForOffset)) || (!isLtr() && floatValue <= textLayoutResult.getLineLeft(lineForOffset))) {
            return textLayoutResult.getLineEnd(lineForOffset, true);
        }
        return this.offsetMapping.transformedToOriginal(textLayoutResult.m2234getOffsetForPositionk4lQ0M(OffsetKt.Offset(cachedX.floatValue(), lineBottom)));
    }

    private final int transformedEndOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m2244getEndimpl(this.selection));
    }

    private final int transformedMinOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m2247getMinimpl(this.selection));
    }

    private final int transformedMaxOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m2246getMaximpl(this.selection));
    }

    private final int charOffset(int offset) {
        return RangesKt.coerceAtMost(offset, getText$foundation_release().length() - 1);
    }

    private final int getParagraphStart() {
        return StringHelpersKt.findParagraphStart(getText$foundation_release(), TextRange.m2247getMinimpl(this.selection));
    }

    private final int getParagraphEnd() {
        return StringHelpersKt.findParagraphEnd(getText$foundation_release(), TextRange.m2246getMaximpl(this.selection));
    }
}
