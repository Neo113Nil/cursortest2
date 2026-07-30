package defpackage;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rf0 {
    public static final rf0 a = new rf0();

    public final void a(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(qv.g(ey.c(), ey.m(), ey.o(), ey.k(), JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class));
        editorInfo.setSupportedHandwritingGesturePreviews(oi.z(new Class[]{ey.c(), ey.m(), ey.o(), ey.k()}));
    }
}
