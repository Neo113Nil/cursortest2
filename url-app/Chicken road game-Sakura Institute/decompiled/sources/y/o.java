package y;

import B0.AbstractC0087a;
import android.view.inputmethod.EditorInfo;
import kotlin.jvm.internal.Intrinsics;
import z2.C1439w;
import z2.C1441y;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f11490a = new o();

    public final void a(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(C1441y.e(AbstractC0087a.u(), AbstractC0087a.A(), AbstractC0087a.w(), AbstractC0087a.y(), AbstractC0087a.B(), AbstractC0087a.C(), AbstractC0087a.D()));
        Class[] elements = {AbstractC0087a.u(), AbstractC0087a.A(), AbstractC0087a.w(), AbstractC0087a.y()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        editorInfo.setSupportedHandwritingGesturePreviews(C1439w.A(elements));
    }
}
