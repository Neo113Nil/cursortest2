package x;

import androidx.window.extensions.layout.WindowLayoutInfo;
import d0.l;
import e0.g;
import e0.h;

/* loaded from: classes.dex */
public final /* synthetic */ class b extends g implements l {
    public b(f fVar) {
        super(1, fVar, f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    @Override // d0.l
    public final Object h(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        h.e(windowLayoutInfo, "p0");
        ((f) this.f490c).accept(windowLayoutInfo);
        return U.g.f378a;
    }
}
