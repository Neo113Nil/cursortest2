package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextPreparedSelection.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\f*\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00132\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010 \u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001b¨\u0006!"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "Landroidx/compose/ui/text/input/TextFieldValue;", "currentValue", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "layoutResultProxy", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "state", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/TextLayoutResultProxy;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;)V", "", "pagesAmount", "jumpByPagesOffset", "(Landroidx/compose/foundation/text/TextLayoutResultProxy;I)I", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/EditCommand;", "or", "", "deleteIfSelectedOr", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "moveCursorUpByPage", "()Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "moveCursorDownByPage", "Landroidx/compose/ui/text/input/TextFieldValue;", "getCurrentValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "getLayoutResultProxy", "()Landroidx/compose/foundation/text/TextLayoutResultProxy;", "getValue", "value", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TextFieldPreparedSelection extends BaseTextPreparedSelection<TextFieldPreparedSelection> {
    private final TextFieldValue currentValue;
    private final TextLayoutResultProxy layoutResultProxy;

    public final TextFieldPreparedSelection moveCursorDownByPage() {
        TextLayoutResultProxy textLayoutResultProxy;
        if (getText$foundation_release().length() > 0 && (textLayoutResultProxy = this.layoutResultProxy) != null) {
            setCursor(jumpByPagesOffset(textLayoutResultProxy, 1));
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorUpByPage() {
        TextLayoutResultProxy textLayoutResultProxy;
        if (getText$foundation_release().length() > 0 && (textLayoutResultProxy = this.layoutResultProxy) != null) {
            setCursor(jumpByPagesOffset(textLayoutResultProxy, -1));
        }
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldPreparedSelection(TextFieldValue currentValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy, TextPreparedSelectionState state) {
        super(currentValue.getText(), currentValue.getSelection(), textLayoutResultProxy != null ? textLayoutResultProxy.getValue() : null, offsetMapping, state, null);
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        Intrinsics.checkNotNullParameter(state, "state");
        this.currentValue = currentValue;
        this.layoutResultProxy = textLayoutResultProxy;
    }

    public final TextFieldValue getValue() {
        return TextFieldValue.m2380copy3r_uNRQ$default(this.currentValue, getAnnotatedString(), getSelection(), (TextRange) null, 4, (Object) null);
    }

    public final List deleteIfSelectedOr(Function1 or) {
        Intrinsics.checkNotNullParameter(or, "or");
        if (TextRange.m2243getCollapsedimpl(getSelection())) {
            EditCommand editCommand = (EditCommand) or.invoke(this);
            if (editCommand != null) {
                return CollectionsKt.listOf(editCommand);
            }
            return null;
        }
        return CollectionsKt.listOf((Object[]) new EditCommand[]{new CommitTextCommand("", 0), new SetSelectionCommand(TextRange.m2247getMinimpl(getSelection()), TextRange.m2247getMinimpl(getSelection()))});
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r2 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int jumpByPagesOffset(TextLayoutResultProxy textLayoutResultProxy, int i) {
        Rect zero;
        LayoutCoordinates innerTextFieldCoordinates = textLayoutResultProxy.getInnerTextFieldCoordinates();
        if (innerTextFieldCoordinates != null) {
            LayoutCoordinates decorationBoxCoordinates = textLayoutResultProxy.getDecorationBoxCoordinates();
            zero = decorationBoxCoordinates != null ? LayoutCoordinates.localBoundingBoxOf$default(decorationBoxCoordinates, innerTextFieldCoordinates, false, 2, null) : null;
        }
        zero = Rect.INSTANCE.getZero();
        Rect cursorRect = textLayoutResultProxy.getValue().getCursorRect(getOffsetMapping().originalToTransformed(TextRange.m2244getEndimpl(this.currentValue.getSelection())));
        return getOffsetMapping().transformedToOriginal(textLayoutResultProxy.getValue().m2234getOffsetForPositionk4lQ0M(OffsetKt.Offset(cursorRect.getLeft(), cursorRect.getTop() + (Size.m1333getHeightimpl(zero.m1317getSizeNHjbRc()) * i))));
    }
}
