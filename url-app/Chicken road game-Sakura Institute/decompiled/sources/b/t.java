package b;

import android.view.Window;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t extends s {
    @Override // b.r, b.q
    public void a(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 3;
    }
}
