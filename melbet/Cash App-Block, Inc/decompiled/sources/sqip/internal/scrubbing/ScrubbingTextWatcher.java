package sqip.internal.scrubbing;

import android.text.Editable;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lsqip/internal/scrubbing/ScrubbingTextWatcher;", "Lsqip/internal/scrubbing/EmptyTextWatcher;", "scrubber", "Lsqip/internal/scrubbing/Scrubber;", "view", "Landroid/widget/TextView;", "(Lsqip/internal/scrubbing/Scrubber;Landroid/widget/TextView;)V", "current", "", "formatting", "", "getView", "()Landroid/widget/TextView;", "afterTextChanged", "", "editable", "Landroid/text/Editable;", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ScrubbingTextWatcher extends EmptyTextWatcher {
    private String current;
    private boolean formatting;
    private final Scrubber scrubber;
    private final TextView view;

    public ScrubbingTextWatcher(Scrubber scrubber, TextView textView) {
        scrubber.getClass();
        textView.getClass();
        this.scrubber = scrubber;
        this.view = textView;
        this.current = "";
    }

    @Override // sqip.internal.scrubbing.EmptyTextWatcher, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        editable.getClass();
        if (this.formatting) {
            return;
        }
        this.formatting = true;
        String scrub = this.scrubber.scrub(this.current, editable.toString());
        if (!Intrinsics.areEqual(editable.toString(), scrub)) {
            editable.replace(0, editable.length(), scrub);
        }
        this.current = this.view.getText().toString();
        this.formatting = false;
    }

    public final TextView getView() {
        return this.view;
    }
}
