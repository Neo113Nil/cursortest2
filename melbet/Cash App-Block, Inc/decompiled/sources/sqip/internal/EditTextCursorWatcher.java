package sqip.internal;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0014R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lsqip/internal/EditTextCursorWatcher;", "Landroidx/appcompat/widget/AppCompatEditText;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onCursorUpdate", "Lkotlin/Function1;", "", "", "getOnCursorUpdate", "()Lkotlin/jvm/functions/Function1;", "setOnCursorUpdate", "(Lkotlin/jvm/functions/Function1;)V", "onSelectionChanged", "selStart", "selEnd", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EditTextCursorWatcher extends AppCompatEditText {
    private Function1<? super Integer, Unit> onCursorUpdate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditTextCursorWatcher(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.onCursorUpdate = EditTextCursorWatcher$onCursorUpdate$1.INSTANCE;
    }

    public final Function1<Integer, Unit> getOnCursorUpdate() {
        return this.onCursorUpdate;
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int selStart, int selEnd) {
        if (this.onCursorUpdate != null) {
            Editable text = getText();
            int i = selStart == (text != null ? text.length() : 0) ? selStart - 1 : selStart;
            CharSequence text2 = getText();
            if (text2 == null) {
                text2 = "";
            }
            CharSequence subSequence = text2.subSequence(0, new IntRange(0, i, 1).last + 1);
            this.onCursorUpdate.invoke(Integer.valueOf(selStart - (subSequence.length() - UtilsKt.stripSpaces(subSequence).length())));
        }
        super.onSelectionChanged(selStart, selEnd);
    }

    public final void setOnCursorUpdate(Function1<? super Integer, Unit> function1) {
        function1.getClass();
        this.onCursorUpdate = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditTextCursorWatcher(Context context) {
        super(context);
        context.getClass();
        this.onCursorUpdate = EditTextCursorWatcher$onCursorUpdate$1.INSTANCE;
    }
}
