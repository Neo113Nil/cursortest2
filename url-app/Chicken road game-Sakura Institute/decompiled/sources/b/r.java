package b;

import android.view.Window;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class r extends q {
    @Override // b.q
    public void a(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 1;
    }
}
