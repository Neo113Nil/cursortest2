package y;

import B0.AbstractC0090d;
import Z.K;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;

/* loaded from: classes.dex */
public abstract class j {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, Y.d dVar) {
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        CursorAnchorInfo.Builder editorBoundsInfo;
        editorBounds = AbstractC0090d.l().setEditorBounds(K.C(dVar));
        handwritingBounds = editorBounds.setHandwritingBounds(K.C(dVar));
        build = handwritingBounds.build();
        editorBoundsInfo = builder.setEditorBoundsInfo(build);
        return editorBoundsInfo;
    }
}
