package defpackage;

import android.R;
import android.content.Context;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.WebView;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class x80 extends WebView {
    public final e4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x80(Context context) {
        super(context, null, R.attr.webViewStyle);
        context.getClass();
        this.d = new e4(5, this);
    }

    @Override // android.webkit.WebView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.getClass();
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        editorInfo.imeOptions |= 301989888;
        return onCreateInputConnection;
    }
}
