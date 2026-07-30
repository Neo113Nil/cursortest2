package defpackage;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class m50 {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, w72 w72Var) {
        return builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(bd3.J(w72Var)).setHandwritingBounds(bd3.J(w72Var)).build());
    }
}
