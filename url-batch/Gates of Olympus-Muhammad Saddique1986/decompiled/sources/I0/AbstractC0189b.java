package I0;

import D0.AbstractC0066d;
import a0.C0239d;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import b0.M;

/* renamed from: I0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0189b {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, C0239d c0239d) {
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        CursorAnchorInfo.Builder editorBoundsInfo;
        editorBounds = AbstractC0066d.h().setEditorBounds(M.C(c0239d));
        handwritingBounds = editorBounds.setHandwritingBounds(M.C(c0239d));
        build = handwritingBounds.build();
        editorBoundsInfo = builder.setEditorBoundsInfo(build);
        return editorBoundsInfo;
    }
}
