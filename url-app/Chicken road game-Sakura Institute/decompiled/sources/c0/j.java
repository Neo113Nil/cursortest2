package c0;

import Z.C0313j;
import Z.J;
import android.graphics.Outline;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f5821a = new j();

    public final void a(Outline outline, J j4) {
        if (!(j4 instanceof C0313j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((C0313j) j4).f4530a);
    }
}
