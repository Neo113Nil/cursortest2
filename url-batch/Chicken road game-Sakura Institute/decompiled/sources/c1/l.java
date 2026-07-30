package c1;

import android.graphics.Outline;
import z0.k0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f1614a = new l();

    public final void a(Outline outline, k0 k0Var) {
        if (!(k0Var instanceof z0.j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((z0.j) k0Var).f10002a);
    }
}
